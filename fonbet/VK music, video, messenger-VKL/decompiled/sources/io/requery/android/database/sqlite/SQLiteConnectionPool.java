package io.requery.android.database.sqlite;

import android.annotation.SuppressLint;
import android.os.SystemClock;
import android.os.Trace;
import android.util.Printer;
import androidx.annotation.Nullable;
import androidx.core.os.OperationCanceledException;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.metrics.eventtracking.Event;
import com.vk.metrics.eventtracking.b;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.ConnectionPoolBusyException;
import io.requery.android.database.DatabaseConnectLeakedException;
import io.requery.android.database.PrimaryConnectionPoolBusyHolder;
import io.requery.android.database.sqlite.SQLiteDebug;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.locks.LockSupport;
import xsna.dgn;
import xsna.el3;
import xsna.go9;
import xsna.i5s;
import xsna.jh;
import xsna.nyh0;
import xsna.rq9;
import xsna.rzl;

/* loaded from: classes8.dex */
public final class SQLiteConnectionPool implements Closeable {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int CONNECTION_FLAG_INTERACTIVE = 4;
    public static final int CONNECTION_FLAG_PRIMARY_CONNECTION_AFFINITY = 2;
    public static final int CONNECTION_FLAG_READ_ONLY = 1;
    private static final long CONNECTION_POOL_BUSY_DEBUG_MILLIS = 10000;
    private static final long CONNECTION_POOL_BUSY_MILLIS = 30000;
    private static final String TAG = "SQLiteConnectionPool";
    private SQLiteConnection mAvailablePrimaryConnection;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private ConnectionWaiter mConnectionWaiterPool;
    private ConnectionWaiter mConnectionWaiterQueue;
    private boolean mIsOpen;
    private int mMaxConnectionPoolSize;
    private int mNextConnectionId;
    private final CloseGuard mCloseGuard = CloseGuard.get();
    private final Object mLock = new Object();
    private final AtomicBoolean mConnectionLeaked = new AtomicBoolean();
    private final ArrayList<SQLiteConnection> mAvailableNonPrimaryConnections = new ArrayList<>();

    @Nullable
    private volatile PrimaryConnectionPoolBusyHolder mPrimaryConnectionHolder = null;
    private final WeakHashMap<SQLiteConnection, AcquiredConnectionStatus> mAcquiredConnections = new WeakHashMap<>();

    public enum AcquiredConnectionStatus {
        NORMAL,
        RECONFIGURE,
        DISCARD
    }

    public static final class ConnectionWaiter {
        public SQLiteConnection mAssignedConnection;
        public int mConnectionFlags;
        public RuntimeException mException;
        public ConnectionWaiter mNext;
        public int mNonce;
        public int mPriority;
        public String mSql;
        public long mStartTime;
        public Thread mThread;
        public boolean mWantPrimaryConnection;

        public /* synthetic */ ConnectionWaiter(int i) {
            this();
        }

        private ConnectionWaiter() {
        }
    }

    private SQLiteConnectionPool(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.mConfiguration = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        setMaxConnectionPoolSizeLocked();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void cancelConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        if (connectionWaiter.mAssignedConnection == null && connectionWaiter.mException == null) {
            ConnectionWaiter connectionWaiter2 = null;
            for (ConnectionWaiter connectionWaiter3 = this.mConnectionWaiterQueue; connectionWaiter3 != connectionWaiter; connectionWaiter3 = connectionWaiter3.mNext) {
                connectionWaiter2 = connectionWaiter3;
            }
            if (connectionWaiter2 != null) {
                connectionWaiter2.mNext = connectionWaiter.mNext;
            } else {
                this.mConnectionWaiterQueue = connectionWaiter.mNext;
            }
            connectionWaiter.mException = new OperationCanceledException();
            LockSupport.unpark(connectionWaiter.mThread);
            wakeConnectionWaitersLocked();
        }
    }

    private void closeAvailableConnectionsAndLogExceptionsLocked() {
        closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            this.mAvailablePrimaryConnection = null;
        }
    }

    private void closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked() {
        Iterator<SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
        while (it.hasNext()) {
            closeConnectionAndLogExceptionsLocked(it.next());
        }
        this.mAvailableNonPrimaryConnections.clear();
    }

    private void closeConnectionAndLogExceptionsLocked(SQLiteConnection sQLiteConnection) {
        try {
            sQLiteConnection.close();
        } catch (RuntimeException e) {
            L.l(TAG, "Failed to close connection, its fate is now in the hands of the merciful GC: " + sQLiteConnection);
            L.i(e);
        }
    }

    private void closeExcessConnectionsAndLogExceptionsLocked() {
        int size = this.mAvailableNonPrimaryConnections.size();
        while (true) {
            int i = size - 1;
            if (size <= this.mMaxConnectionPoolSize - 1) {
                return;
            }
            closeConnectionAndLogExceptionsLocked(this.mAvailableNonPrimaryConnections.remove(i));
            size = i;
        }
    }

    private void discardAcquiredConnectionsLocked() {
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.DISCARD);
    }

    private void dispose(boolean z) {
        CloseGuard closeGuard = this.mCloseGuard;
        if (closeGuard != null) {
            if (z) {
                closeGuard.warnIfOpen();
            }
            this.mCloseGuard.close();
        }
        if (z) {
            return;
        }
        synchronized (this.mLock) {
            try {
                throwIfClosedLocked();
                this.mIsOpen = false;
                closeAvailableConnectionsAndLogExceptionsLocked();
                int size = this.mAcquiredConnections.size();
                if (size != 0) {
                    L l = L.a;
                    l.getClass();
                    if (!L.m(LoggerOutputTarget.NONE)) {
                        L.u(l, L.LogType.i, new Object[]{TAG, lambda$dispose$0(size)});
                    }
                }
                wakeConnectionWaitersLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    private void finishAcquireConnectionLocked(SQLiteConnection sQLiteConnection, int i) {
        try {
            sQLiteConnection.setOnlyAllowReadOnlyOperations((i & 1) != 0);
            this.mAcquiredConnections.put(sQLiteConnection, AcquiredConnectionStatus.NORMAL);
        } catch (RuntimeException e) {
            L l = L.a;
            l.getClass();
            if (!L.m(LoggerOutputTarget.NONE)) {
                L.u(l, L.LogType.e, new Object[]{TAG, lambda$finishAcquireConnectionLocked$5(sQLiteConnection, i)});
            }
            closeConnectionAndLogExceptionsLocked(sQLiteConnection);
            throw e;
        }
    }

    private long getBusyTimeout() {
        return 30000L;
    }

    private static int getPriority(int i) {
        return (i & 4) != 0 ? 1 : 0;
    }

    private boolean isSessionBlockingImportantConnectionWaitersLocked(boolean z, int i) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        if (connectionWaiter == null) {
            return false;
        }
        int priority = getPriority(i);
        while (priority <= connectionWaiter.mPriority) {
            if (z || !connectionWaiter.mWantPrimaryConnection) {
                return true;
            }
            connectionWaiter = connectionWaiter.mNext;
            if (connectionWaiter == null) {
                return false;
            }
        }
        return false;
    }

    private /* synthetic */ Object lambda$dispose$0(int i) {
        return "The connection pool for " + this.mConfiguration.label + " has been closed but there are still " + i + " connections in use.  They will be closed as they are released back to the pool.";
    }

    private static /* synthetic */ Object lambda$finishAcquireConnectionLocked$5(SQLiteConnection sQLiteConnection, int i) {
        return "Failed to prepare acquired connection for session, closing it: " + sQLiteConnection + ", connectionFlags=" + i;
    }

    private /* synthetic */ Object lambda$onConnectionLeaked$2() {
        return i5s.a(new StringBuilder("A SQLiteConnection object for database '"), this.mConfiguration.label, "' was leaked!  Please fix your application to end transactions in progress properly and to close the database when it is no longer needed.");
    }

    private /* synthetic */ Object lambda$reconfigureAllConnectionsLocked$3() {
        return "Failed to reconfigure available primary connection, closing it: " + this.mAvailablePrimaryConnection;
    }

    private static /* synthetic */ Object lambda$reconfigureAllConnectionsLocked$4(SQLiteConnection sQLiteConnection) {
        return "Failed to reconfigure available non-primary connection, closing it: " + sQLiteConnection;
    }

    private static /* synthetic */ Object lambda$recycleConnectionLocked$1(SQLiteConnection sQLiteConnection) {
        return "Failed to reconfigure released connection, closing it: " + sQLiteConnection;
    }

    private void logConnectionPoolBusyLocked(long j, int i, PrimaryConnectionPoolBusyHolder primaryConnectionPoolBusyHolder) {
        int i2;
        Thread currentThread = Thread.currentThread();
        StringBuilder sb = new StringBuilder("The connection pool for database '");
        sb.append(this.mConfiguration.label);
        sb.append("' has been unable to grant a connection to thread ");
        sb.append(currentThread.getId());
        sb.append(" (");
        sb.append(currentThread.getName());
        sb.append(") with flags 0x");
        sb.append(Integer.toHexString(i));
        sb.append(" for ");
        sb.append(j * 0.001f);
        sb.append(" seconds.\n");
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        if (this.mAcquiredConnections.isEmpty()) {
            i2 = 0;
        } else {
            Iterator<SQLiteConnection> it = this.mAcquiredConnections.keySet().iterator();
            i2 = 0;
            while (it.hasNext()) {
                String describeCurrentOperationUnsafe = it.next().describeCurrentOperationUnsafe();
                if (describeCurrentOperationUnsafe != null) {
                    arrayList.add(describeCurrentOperationUnsafe);
                    i3++;
                } else {
                    i2++;
                }
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size++;
        }
        dgn.a(i3, i2, "Connections: ", " active, ", sb);
        sb.append(" idle, ");
        sb.append(size);
        sb.append(" available.\n");
        if (!arrayList.isEmpty()) {
            sb.append("\nRequests in progress:\n");
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                jh.f(sb, "  ", (String) it2.next(), "\n");
            }
        }
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.w, new Object[]{TAG, sb.toString()});
        }
        StringBuilder sb2 = new StringBuilder();
        nyh0.a(i3, this.mConfiguration.label, " (", ", ", sb2);
        ConnectionPoolBusyException connectionPoolBusyException = new ConnectionPoolBusyException(rzl.a(i2, size, ", ", ")", sb2), currentThread, primaryConnectionPoolBusyHolder, arrayList);
        logOrThrow(connectionPoolBusyException);
        logPoolError(connectionPoolBusyException.getMessage());
    }

    private void logOrThrow(RuntimeException runtimeException) {
        b.a.a(runtimeException);
    }

    private void logPoolError(String str) {
        b bVar = b.a;
        el3 el3Var = Event.b;
        Event.a aVar = new Event.a();
        aVar.f();
        aVar.g(TAG);
        aVar.c("error", str);
        bVar.k(aVar.e());
    }

    private void markAcquiredConnectionsLocked(AcquiredConnectionStatus acquiredConnectionStatus) {
        if (this.mAcquiredConnections.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList(this.mAcquiredConnections.size());
        for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
            AcquiredConnectionStatus value = entry.getValue();
            if (acquiredConnectionStatus != value && value != AcquiredConnectionStatus.DISCARD) {
                arrayList.add(entry.getKey());
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            this.mAcquiredConnections.put((SQLiteConnection) it.next(), acquiredConnectionStatus);
        }
    }

    private ConnectionWaiter obtainConnectionWaiterLocked(Thread thread, long j, int i, boolean z, String str, int i2) {
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterPool;
        if (connectionWaiter != null) {
            this.mConnectionWaiterPool = connectionWaiter.mNext;
            connectionWaiter.mNext = null;
        } else {
            connectionWaiter = new ConnectionWaiter(0);
        }
        connectionWaiter.mThread = thread;
        connectionWaiter.mStartTime = j;
        connectionWaiter.mPriority = i;
        connectionWaiter.mWantPrimaryConnection = z;
        connectionWaiter.mSql = str;
        connectionWaiter.mConnectionFlags = i2;
        return connectionWaiter;
    }

    public static SQLiteConnectionPool open(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        SQLiteConnectionPool sQLiteConnectionPool = new SQLiteConnectionPool(sQLiteDatabaseConfiguration);
        sQLiteConnectionPool.open();
        return sQLiteConnectionPool;
    }

    private SQLiteConnection openConnectionLocked(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, boolean z) {
        int i = this.mNextConnectionId;
        this.mNextConnectionId = i + 1;
        return SQLiteConnection.open(this, sQLiteDatabaseConfiguration, i, z);
    }

    private void reconfigureAllConnectionsLocked() {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{TAG, lambda$reconfigureAllConnectionsLocked$3()});
                }
                L.i(e);
                closeConnectionAndLogExceptionsLocked(this.mAvailablePrimaryConnection);
                this.mAvailablePrimaryConnection = null;
            }
        }
        int size = this.mAvailableNonPrimaryConnections.size();
        int i = 0;
        while (i < size) {
            SQLiteConnection sQLiteConnection2 = this.mAvailableNonPrimaryConnections.get(i);
            try {
                sQLiteConnection2.reconfigure(this.mConfiguration);
            } catch (RuntimeException e2) {
                L l2 = L.a;
                l2.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l2, L.LogType.e, new Object[]{TAG, lambda$reconfigureAllConnectionsLocked$4(sQLiteConnection2)});
                }
                L.i(e2);
                closeConnectionAndLogExceptionsLocked(sQLiteConnection2);
                this.mAvailableNonPrimaryConnections.remove(i);
                size--;
                i--;
            }
            i++;
        }
        markAcquiredConnectionsLocked(AcquiredConnectionStatus.RECONFIGURE);
    }

    private boolean recycleConnectionLocked(SQLiteConnection sQLiteConnection, AcquiredConnectionStatus acquiredConnectionStatus) {
        if (acquiredConnectionStatus == AcquiredConnectionStatus.RECONFIGURE) {
            try {
                sQLiteConnection.reconfigure(this.mConfiguration);
            } catch (RuntimeException e) {
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.e, new Object[]{TAG, lambda$recycleConnectionLocked$1(sQLiteConnection)});
                }
                L.i(e);
                acquiredConnectionStatus = AcquiredConnectionStatus.DISCARD;
            }
        }
        if (acquiredConnectionStatus != AcquiredConnectionStatus.DISCARD) {
            return true;
        }
        closeConnectionAndLogExceptionsLocked(sQLiteConnection);
        return false;
    }

    private void recycleConnectionWaiterLocked(ConnectionWaiter connectionWaiter) {
        connectionWaiter.mNext = this.mConnectionWaiterPool;
        connectionWaiter.mThread = null;
        connectionWaiter.mSql = null;
        connectionWaiter.mAssignedConnection = null;
        connectionWaiter.mException = null;
        connectionWaiter.mNonce++;
        this.mConnectionWaiterPool = connectionWaiter;
    }

    private void setMaxConnectionPoolSizeLocked() {
        if (SQLiteDatabase.hasCodec() || (this.mConfiguration.openFlags & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) == 0) {
            this.mMaxConnectionPoolSize = 1;
        } else {
            this.mMaxConnectionPoolSize = SQLiteGlobal.getWALConnectionPoolSize();
        }
    }

    private void throwIfClosedLocked() {
        if (!this.mIsOpen) {
            throw new IllegalStateException("Cannot perform this operation because the connection pool has been closed.");
        }
    }

    private SQLiteConnection tryAcquireNonPrimaryConnectionLocked(String str, int i) {
        int size = this.mAvailableNonPrimaryConnections.size();
        if (size > 1 && str != null) {
            for (int i2 = 0; i2 < size; i2++) {
                SQLiteConnection sQLiteConnection = this.mAvailableNonPrimaryConnections.get(i2);
                if (sQLiteConnection.isPreparedStatementInCache(str)) {
                    this.mAvailableNonPrimaryConnections.remove(i2);
                    finishAcquireConnectionLocked(sQLiteConnection, i);
                    return sQLiteConnection;
                }
            }
        }
        if (size > 0) {
            SQLiteConnection remove = this.mAvailableNonPrimaryConnections.remove(size - 1);
            finishAcquireConnectionLocked(remove, i);
            return remove;
        }
        int size2 = this.mAcquiredConnections.size();
        if (this.mAvailablePrimaryConnection != null) {
            size2++;
        }
        if (size2 >= this.mMaxConnectionPoolSize) {
            return null;
        }
        SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, false);
        finishAcquireConnectionLocked(openConnectionLocked, i);
        return openConnectionLocked;
    }

    private SQLiteConnection tryAcquirePrimaryConnectionLocked(int i, String str) {
        SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
        if (sQLiteConnection != null) {
            L.e(TAG, go9.b("Primary connection acquired ", str));
            this.mAvailablePrimaryConnection = null;
            finishAcquireConnectionLocked(sQLiteConnection, i);
            return sQLiteConnection;
        }
        Iterator<SQLiteConnection> it = this.mAcquiredConnections.keySet().iterator();
        while (it.hasNext()) {
            if (it.next().isPrimaryConnection()) {
                return null;
            }
        }
        SQLiteConnection openConnectionLocked = openConnectionLocked(this.mConfiguration, true);
        finishAcquireConnectionLocked(openConnectionLocked, i);
        L.e(TAG, go9.b("Primary connection acquired (new) ", str));
        return openConnectionLocked;
    }

    /* JADX WARN: Removed duplicated region for block: B:69:0x00ff  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private SQLiteConnection waitForConnection(String str, int i, rq9 rq9Var) {
        SQLiteConnection sQLiteConnection;
        RuntimeException runtimeException;
        long j;
        boolean z = (i & 2) != 0;
        synchronized (this.mLock) {
            try {
                throwIfClosedLocked();
                if (rq9Var != null) {
                    rq9Var.c();
                }
                SQLiteConnection tryAcquireNonPrimaryConnectionLocked = !z ? tryAcquireNonPrimaryConnectionLocked(str, i) : null;
                if (tryAcquireNonPrimaryConnectionLocked == null && (tryAcquireNonPrimaryConnectionLocked = tryAcquirePrimaryConnectionLocked(i, "")) != null) {
                    this.mPrimaryConnectionHolder = new PrimaryConnectionPoolBusyHolder(Thread.currentThread(), z);
                }
                if (tryAcquireNonPrimaryConnectionLocked != null) {
                    return tryAcquireNonPrimaryConnectionLocked;
                }
                int priority = getPriority(i);
                final ConnectionWaiter obtainConnectionWaiterLocked = obtainConnectionWaiterLocked(Thread.currentThread(), SystemClock.uptimeMillis(), priority, z, str, i);
                ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
                ConnectionWaiter connectionWaiter2 = null;
                while (true) {
                    if (connectionWaiter == null) {
                        break;
                    }
                    if (priority > connectionWaiter.mPriority) {
                        obtainConnectionWaiterLocked.mNext = connectionWaiter;
                        break;
                    }
                    connectionWaiter2 = connectionWaiter;
                    connectionWaiter = connectionWaiter.mNext;
                }
                if (connectionWaiter2 != null) {
                    connectionWaiter2.mNext = obtainConnectionWaiterLocked;
                } else {
                    this.mConnectionWaiterQueue = obtainConnectionWaiterLocked;
                }
                final int i2 = obtainConnectionWaiterLocked.mNonce;
                if (rq9Var != null) {
                    rq9Var.b(new rq9.a() { // from class: io.requery.android.database.sqlite.SQLiteConnectionPool.1
                        @Override // xsna.rq9.a
                        public void onCancel() {
                            synchronized (SQLiteConnectionPool.this.mLock) {
                                try {
                                    ConnectionWaiter connectionWaiter3 = obtainConnectionWaiterLocked;
                                    if (connectionWaiter3.mNonce == i2) {
                                        SQLiteConnectionPool.this.cancelConnectionWaiterLocked(connectionWaiter3);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                            }
                        }
                    });
                }
                try {
                    long busyTimeout = getBusyTimeout();
                    long j2 = obtainConnectionWaiterLocked.mStartTime + busyTimeout;
                    while (true) {
                        if (this.mConnectionLeaked.compareAndSet(true, false)) {
                            synchronized (this.mLock) {
                                wakeConnectionWaitersLocked();
                            }
                        }
                        Trace.beginSection("SQLiteConnectionPool.waitForConnection parkNanos primary:" + z);
                        LockSupport.parkNanos(this, busyTimeout * 1000000);
                        Trace.endSection();
                        synchronized (this.mLock) {
                            try {
                                throwIfClosedLocked();
                                sQLiteConnection = obtainConnectionWaiterLocked.mAssignedConnection;
                                runtimeException = obtainConnectionWaiterLocked.mException;
                                if (sQLiteConnection != null || runtimeException != null) {
                                    break;
                                }
                                long uptimeMillis = SystemClock.uptimeMillis();
                                if (uptimeMillis < j2) {
                                    j = uptimeMillis - j2;
                                } else {
                                    logConnectionPoolBusyLocked(uptimeMillis - obtainConnectionWaiterLocked.mStartTime, i, this.mPrimaryConnectionHolder);
                                    long busyTimeout2 = getBusyTimeout();
                                    long j3 = uptimeMillis + busyTimeout2;
                                    j = busyTimeout2;
                                    j2 = j3;
                                }
                            } finally {
                            }
                        }
                        if (rq9Var != null) {
                            rq9Var.b(null);
                        }
                        return sQLiteConnection;
                        busyTimeout = j;
                    }
                    recycleConnectionWaiterLocked(obtainConnectionWaiterLocked);
                    if (sQLiteConnection == null) {
                        throw runtimeException;
                    }
                    if (sQLiteConnection.isPrimaryConnection()) {
                        this.mPrimaryConnectionHolder = new PrimaryConnectionPoolBusyHolder(Thread.currentThread(), z);
                    }
                    if (rq9Var != null) {
                    }
                    return sQLiteConnection;
                } catch (Throwable th) {
                    if (rq9Var != null) {
                        rq9Var.b(null);
                    }
                    throw th;
                }
            } finally {
            }
        }
    }

    private void wakeConnectionWaitersLocked() {
        SQLiteConnection sQLiteConnection;
        ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
        ConnectionWaiter connectionWaiter2 = null;
        boolean z = false;
        boolean z2 = false;
        while (connectionWaiter != null) {
            boolean z3 = true;
            if (this.mIsOpen) {
                try {
                    if (connectionWaiter.mWantPrimaryConnection || z) {
                        sQLiteConnection = null;
                    } else {
                        sQLiteConnection = tryAcquireNonPrimaryConnectionLocked(connectionWaiter.mSql, connectionWaiter.mConnectionFlags);
                        if (sQLiteConnection == null) {
                            z = true;
                        }
                    }
                    if (sQLiteConnection == null && !z2) {
                        sQLiteConnection = tryAcquirePrimaryConnectionLocked(connectionWaiter.mConnectionFlags, "for " + connectionWaiter.mThread.getName() + ", " + connectionWaiter.mThread.getState());
                        if (sQLiteConnection == null) {
                            z2 = true;
                        }
                    }
                    if (sQLiteConnection != null) {
                        connectionWaiter.mAssignedConnection = sQLiteConnection;
                    } else if (z && z2) {
                        return;
                    } else {
                        z3 = false;
                    }
                } catch (RuntimeException e) {
                    connectionWaiter.mException = e;
                }
            }
            ConnectionWaiter connectionWaiter3 = connectionWaiter.mNext;
            if (z3) {
                if (connectionWaiter2 != null) {
                    connectionWaiter2.mNext = connectionWaiter3;
                } else {
                    this.mConnectionWaiterQueue = connectionWaiter3;
                }
                connectionWaiter.mNext = null;
                LockSupport.unpark(connectionWaiter.mThread);
            } else {
                connectionWaiter2 = connectionWaiter;
            }
            connectionWaiter = connectionWaiter3;
        }
    }

    public SQLiteConnection acquireConnection(String str, int i, rq9 rq9Var) {
        return waitForConnection(str, i, rq9Var);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        dispose(false);
    }

    public void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        synchronized (this.mLock) {
            try {
                SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
                if (sQLiteConnection != null) {
                    sQLiteConnection.collectDbStats(arrayList);
                }
                Iterator<SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
                while (it.hasNext()) {
                    it.next().collectDbStats(arrayList);
                }
                Iterator<SQLiteConnection> it2 = this.mAcquiredConnections.keySet().iterator();
                while (it2.hasNext()) {
                    it2.next().collectDbStatsUnsafe(arrayList);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void dump(Printer printer, boolean z) {
        synchronized (this.mLock) {
            try {
                printer.println("Connection pool for " + this.mConfiguration.path + StringUtils.PROCESS_POSTFIX_DELIMITER);
                StringBuilder sb = new StringBuilder("  Open: ");
                sb.append(this.mIsOpen);
                printer.println(sb.toString());
                printer.println("  Max connections: " + this.mMaxConnectionPoolSize);
                printer.println("  Available primary connection:");
                SQLiteConnection sQLiteConnection = this.mAvailablePrimaryConnection;
                if (sQLiteConnection != null) {
                    sQLiteConnection.dump(printer, z);
                } else {
                    printer.println("<none>");
                }
                printer.println("  Available non-primary connections:");
                if (this.mAvailableNonPrimaryConnections.isEmpty()) {
                    printer.println("<none>");
                } else {
                    Iterator<SQLiteConnection> it = this.mAvailableNonPrimaryConnections.iterator();
                    while (it.hasNext()) {
                        it.next().dump(printer, z);
                    }
                }
                printer.println("  Acquired connections:");
                if (this.mAcquiredConnections.isEmpty()) {
                    printer.println("<none>");
                } else {
                    for (Map.Entry<SQLiteConnection, AcquiredConnectionStatus> entry : this.mAcquiredConnections.entrySet()) {
                        entry.getKey().dumpUnsafe(printer, z);
                        printer.println("  Status: " + entry.getValue());
                    }
                }
                printer.println("  Connection waiters:");
                if (this.mConnectionWaiterQueue != null) {
                    long uptimeMillis = SystemClock.uptimeMillis();
                    ConnectionWaiter connectionWaiter = this.mConnectionWaiterQueue;
                    int i = 0;
                    while (connectionWaiter != null) {
                        printer.println(i + ": waited for " + ((uptimeMillis - connectionWaiter.mStartTime) * 0.001f) + " ms - thread=" + connectionWaiter.mThread + ", priority=" + connectionWaiter.mPriority + ", sql='" + connectionWaiter.mSql + "'");
                        connectionWaiter = connectionWaiter.mNext;
                        i++;
                    }
                } else {
                    printer.println("<none>");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void enableLocalizedCollators() {
        SQLiteConnection sQLiteConnection;
        synchronized (this.mLock) {
            try {
                if (!this.mAcquiredConnections.isEmpty() || (sQLiteConnection = this.mAvailablePrimaryConnection) == null) {
                    throw new IllegalStateException("Cannot enable localized collators while database is in use");
                }
                sQLiteConnection.enableLocalizedCollators();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void finalize() throws Throwable {
        try {
            dispose(true);
        } finally {
            super.finalize();
        }
    }

    public void onConnectionLeaked() {
        L l = L.a;
        l.getClass();
        if (!L.m(LoggerOutputTarget.NONE)) {
            L.u(l, L.LogType.w, new Object[]{TAG, lambda$onConnectionLeaked$2()});
        }
        DatabaseConnectLeakedException databaseConnectLeakedException = new DatabaseConnectLeakedException(this.mConfiguration.label);
        b.a.a(databaseConnectLeakedException);
        logPoolError(databaseConnectLeakedException.getMessage());
        this.mConnectionLeaked.set(true);
    }

    @SuppressLint({"Assert"})
    public void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        if (sQLiteDatabaseConfiguration == null) {
            throw new IllegalArgumentException("configuration must not be null.");
        }
        synchronized (this.mLock) {
            try {
                throwIfClosedLocked();
                boolean z = ((sQLiteDatabaseConfiguration.openFlags ^ this.mConfiguration.openFlags) & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0;
                if (z) {
                    if (!this.mAcquiredConnections.isEmpty()) {
                        throw new IllegalStateException("Write Ahead Logging (WAL) mode cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                    }
                    closeAvailableNonPrimaryConnectionsAndLogExceptionsLocked();
                }
                if (sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled != this.mConfiguration.foreignKeyConstraintsEnabled && !this.mAcquiredConnections.isEmpty()) {
                    throw new IllegalStateException("Foreign Key Constraints cannot be enabled or disabled while there are transactions in progress.  Finish all transactions and release all active database connections first.");
                }
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfiguration;
                if (sQLiteDatabaseConfiguration2.openFlags != sQLiteDatabaseConfiguration.openFlags) {
                    if (z) {
                        closeAvailableConnectionsAndLogExceptionsLocked();
                    }
                    SQLiteConnection openConnectionLocked = openConnectionLocked(sQLiteDatabaseConfiguration, true);
                    closeAvailableConnectionsAndLogExceptionsLocked();
                    discardAcquiredConnectionsLocked();
                    this.mAvailablePrimaryConnection = openConnectionLocked;
                    this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
                    setMaxConnectionPoolSizeLocked();
                } else {
                    sQLiteDatabaseConfiguration2.updateParametersFrom(sQLiteDatabaseConfiguration);
                    setMaxConnectionPoolSizeLocked();
                    closeExcessConnectionsAndLogExceptionsLocked();
                    reconfigureAllConnectionsLocked();
                }
                wakeConnectionWaitersLocked();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void releaseConnection(SQLiteConnection sQLiteConnection) {
        synchronized (this.mLock) {
            try {
                AcquiredConnectionStatus remove = this.mAcquiredConnections.remove(sQLiteConnection);
                if (remove == null) {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
                if (!this.mIsOpen) {
                    closeConnectionAndLogExceptionsLocked(sQLiteConnection);
                } else if (sQLiteConnection.isPrimaryConnection()) {
                    if (recycleConnectionLocked(sQLiteConnection, remove)) {
                        this.mAvailablePrimaryConnection = sQLiteConnection;
                    }
                    wakeConnectionWaitersLocked();
                } else if (this.mAvailableNonPrimaryConnections.size() >= this.mMaxConnectionPoolSize - 1) {
                    closeConnectionAndLogExceptionsLocked(sQLiteConnection);
                } else {
                    if (recycleConnectionLocked(sQLiteConnection, remove)) {
                        this.mAvailableNonPrimaryConnections.add(sQLiteConnection);
                    }
                    wakeConnectionWaitersLocked();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public boolean shouldYieldConnection(SQLiteConnection sQLiteConnection, int i) {
        synchronized (this.mLock) {
            try {
                if (!this.mAcquiredConnections.containsKey(sQLiteConnection)) {
                    throw new IllegalStateException("Cannot perform this operation because the specified connection was not acquired from this pool or has already been released.");
                }
                if (!this.mIsOpen) {
                    return false;
                }
                return isSessionBlockingImportantConnectionWaitersLocked(sQLiteConnection.isPrimaryConnection(), i);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public String toString() {
        return "SQLiteConnectionPool: " + this.mConfiguration.path;
    }

    private void open() {
        this.mAvailablePrimaryConnection = openConnectionLocked(this.mConfiguration, true);
        this.mPrimaryConnectionHolder = null;
        this.mIsOpen = true;
        this.mCloseGuard.open(CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
    }
}
