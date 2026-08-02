package io.requery.android.database.sqlite;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.database.sqlite.SQLiteBindOrColumnIndexOutOfRangeException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteException;
import android.os.Looper;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.util.Printer;
import com.huawei.hms.hihealth.HiHealthActivities;
import com.ironsource.X3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.vk.core.native_loader.NativeLibLoader;
import com.vk.log.L;
import defpackage.k0;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.requery.android.database.CursorWindow;
import io.requery.android.database.SlowQueryLogger;
import io.requery.android.database.sqlite.SQLiteDebug;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Map;
import java.util.regex.Pattern;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.h5s;
import xsna.ho8;
import xsna.i5s;
import xsna.ji;
import xsna.lhg;
import xsna.m900;
import xsna.n6j;
import xsna.rq9;
import xsna.rzl;

/* loaded from: classes8.dex */
public final class SQLiteConnection implements rq9.a {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final boolean DEBUG = false;
    private static final String TAG = "SQLiteConnection";
    private int mCancellationSignalAttachCount;
    private final CloseGuard mCloseGuard;
    private final SQLiteDatabaseConfiguration mConfiguration;
    private final int mConnectionId;
    private long mConnectionPtr;
    private final boolean mIsPrimaryConnection;
    private final boolean mIsReadOnlyConnection;
    private boolean mOnlyAllowReadOnlyOperations;
    private final SQLiteConnectionPool mPool;
    private final PreparedStatementCache mPreparedStatementCache;
    private PreparedStatement mPreparedStatementPool;
    private final OperationLog mRecentOperations;
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private static final byte[] EMPTY_BYTE_ARRAY = new byte[0];
    private static final Pattern TRIM_SQL_PATTERN = Pattern.compile("[\\s]*\\n+[\\s]*");

    public static final class Operation {

        @SuppressLint({"SimpleDateFormat"})
        private static final SimpleDateFormat sDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        public ArrayList<Object> mBindArgs;
        public int mCookie;
        public long mEndTime;
        public Exception mException;
        public boolean mFinished;
        public String mKind;
        public String mSql;
        public long mStartTime;

        public /* synthetic */ Operation(int i) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public String getFormattedStartTime() {
            return sDateFormat.format(new Date(this.mStartTime));
        }

        private String getStatus() {
            return !this.mFinished ? HiHealthActivities.RUNNING : this.mException != null ? "failed" : RTCStatsConstants.VALUE_SUCCEEDED;
        }

        public void describe(StringBuilder sb, boolean z) {
            ArrayList<Object> arrayList;
            sb.append(this.mKind);
            if (this.mFinished) {
                sb.append(" took ");
                sb.append(this.mEndTime - this.mStartTime);
                sb.append(UcumUtils.UCUM_MILLISECODS);
            } else {
                sb.append(" started ");
                sb.append(System.currentTimeMillis() - this.mStartTime);
                sb.append("ms ago");
            }
            sb.append(" - ");
            sb.append(getStatus());
            if (this.mSql != null) {
                sb.append(", sql=\"");
                sb.append(SQLiteConnection.trimSqlForDisplay(this.mSql));
                sb.append("\"");
            }
            if (z && (arrayList = this.mBindArgs) != null && arrayList.size() != 0) {
                sb.append(", bindArgs=[");
                int size = this.mBindArgs.size();
                for (int i = 0; i < size; i++) {
                    Object obj = this.mBindArgs.get(i);
                    if (i != 0) {
                        sb.append(", ");
                    }
                    if (obj == null) {
                        sb.append("null");
                    } else if (obj instanceof byte[]) {
                        sb.append("<byte[]>");
                    } else if (obj instanceof String) {
                        sb.append("\"");
                        sb.append((String) obj);
                        sb.append("\"");
                    } else {
                        sb.append(obj);
                    }
                }
                sb.append(X3.j.e);
            }
            if (this.mException != null) {
                sb.append(", exception=\"");
                sb.append(this.mException.getMessage());
                sb.append("\"");
            }
        }

        private Operation() {
        }
    }

    public static final class OperationLog {
        private static final int COOKIE_GENERATION_SHIFT = 8;
        private static final int COOKIE_INDEX_MASK = 255;
        private static final int MAX_RECENT_OPERATIONS = 20;
        private int mGeneration;
        private int mIndex;
        private final Operation[] mOperations;

        public /* synthetic */ OperationLog(int i) {
            this();
        }

        private boolean endOperationDeferLogLocked(int i, SlowQueryLogger slowQueryLogger) {
            Operation operationLocked = getOperationLocked(i);
            if (operationLocked != null) {
                operationLocked.mEndTime = System.currentTimeMillis();
                operationLocked.mFinished = true;
                if (slowQueryLogger != null) {
                    return true;
                }
            }
            return false;
        }

        private Operation getOperationLocked(int i) {
            Operation operation = this.mOperations[i & 255];
            if (operation.mCookie == i) {
                return operation;
            }
            return null;
        }

        private void logOperationLocked(int i, String str, SlowQueryLogger slowQueryLogger) {
            Operation operationLocked = getOperationLocked(i);
            if (operationLocked == null) {
                return;
            }
            StringBuilder sb = new StringBuilder();
            operationLocked.describe(sb, false);
            if (str != null) {
                sb.append(", ");
                sb.append(str);
            }
            if (slowQueryLogger != null) {
                slowQueryLogger.logQuery(operationLocked.mSql, operationLocked.mKind, operationLocked.mEndTime - operationLocked.mStartTime);
            }
        }

        private int newOperationCookieLocked(int i) {
            int i2 = this.mGeneration;
            this.mGeneration = i2 + 1;
            return i | (i2 << 8);
        }

        public int beginOperation(String str, String str2, Object[] objArr) {
            int newOperationCookieLocked;
            synchronized (this.mOperations) {
                try {
                    int i = (this.mIndex + 1) % 20;
                    Operation operation = this.mOperations[i];
                    int i2 = 0;
                    if (operation == null) {
                        operation = new Operation(i2);
                        this.mOperations[i] = operation;
                    } else {
                        operation.mFinished = false;
                        operation.mException = null;
                        ArrayList<Object> arrayList = operation.mBindArgs;
                        if (arrayList != null) {
                            arrayList.clear();
                        }
                    }
                    operation.mStartTime = System.currentTimeMillis();
                    operation.mKind = str;
                    operation.mSql = str2;
                    if (objArr != null) {
                        ArrayList<Object> arrayList2 = operation.mBindArgs;
                        if (arrayList2 == null) {
                            operation.mBindArgs = new ArrayList<>();
                        } else {
                            arrayList2.clear();
                        }
                        int length = objArr.length;
                        while (i2 < length) {
                            Object obj = objArr[i2];
                            if (obj == null || !(obj instanceof byte[])) {
                                operation.mBindArgs.add(obj);
                            } else {
                                operation.mBindArgs.add(SQLiteConnection.EMPTY_BYTE_ARRAY);
                            }
                            i2++;
                        }
                    }
                    newOperationCookieLocked = newOperationCookieLocked(i);
                    operation.mCookie = newOperationCookieLocked;
                    this.mIndex = i;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return newOperationCookieLocked;
        }

        public String describeCurrentOperation() {
            synchronized (this.mOperations) {
                try {
                    Operation operation = this.mOperations[this.mIndex];
                    if (operation == null || operation.mFinished) {
                        return null;
                    }
                    StringBuilder sb = new StringBuilder();
                    operation.describe(sb, false);
                    return sb.toString();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void dump(Printer printer, boolean z) {
            synchronized (this.mOperations) {
                try {
                    printer.println("  Most recently executed operations:");
                    int i = this.mIndex;
                    Operation operation = this.mOperations[i];
                    if (operation != null) {
                        int i2 = 0;
                        do {
                            StringBuilder sb = new StringBuilder();
                            sb.append("    ");
                            sb.append(i2);
                            sb.append(": [");
                            sb.append(operation.getFormattedStartTime());
                            sb.append("] ");
                            operation.describe(sb, z);
                            printer.println(sb.toString());
                            i = i > 0 ? i - 1 : 19;
                            i2++;
                            operation = this.mOperations[i];
                            if (operation == null) {
                                break;
                            }
                        } while (i2 < 20);
                    } else {
                        printer.println("    <none>");
                    }
                } finally {
                }
            }
        }

        public void endOperation(int i, SlowQueryLogger slowQueryLogger) {
            synchronized (this.mOperations) {
                try {
                    if (endOperationDeferLogLocked(i, slowQueryLogger)) {
                        logOperationLocked(i, null, slowQueryLogger);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public boolean endOperationDeferLog(int i, SlowQueryLogger slowQueryLogger) {
            boolean endOperationDeferLogLocked;
            synchronized (this.mOperations) {
                endOperationDeferLogLocked = endOperationDeferLogLocked(i, slowQueryLogger);
            }
            return endOperationDeferLogLocked;
        }

        public void failOperation(int i, Exception exc) {
            synchronized (this.mOperations) {
                try {
                    Operation operationLocked = getOperationLocked(i);
                    if (operationLocked != null) {
                        operationLocked.mException = exc;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void logOperation(int i, String str, SlowQueryLogger slowQueryLogger) {
            synchronized (this.mOperations) {
                logOperationLocked(i, str, slowQueryLogger);
            }
        }

        private OperationLog() {
            this.mOperations = new Operation[20];
        }
    }

    public static final class PreparedStatement {
        public boolean mInCache;
        public boolean mInUse;
        public int mNumParameters;
        public PreparedStatement mPoolNext;
        public boolean mReadOnly;
        public String mSql;
        public long mStatementPtr;
        public int mType;

        public /* synthetic */ PreparedStatement(int i) {
            this();
        }

        private PreparedStatement() {
        }
    }

    public final class PreparedStatementCache extends m900<String, PreparedStatement> {
        public PreparedStatementCache(int i) {
            super(i);
        }

        public void dump(Printer printer) {
            printer.println("  Prepared statement cache:");
            Map<String, PreparedStatement> snapshot = snapshot();
            if (snapshot.isEmpty()) {
                printer.println("    <none>");
                return;
            }
            int i = 0;
            for (Map.Entry<String, PreparedStatement> entry : snapshot.entrySet()) {
                PreparedStatement value = entry.getValue();
                if (value.mInCache) {
                    String key = entry.getKey();
                    StringBuilder b = ji.b(i, "    ", ": statementPtr=0x");
                    b.append(Long.toHexString(value.mStatementPtr));
                    b.append(", numParameters=");
                    b.append(value.mNumParameters);
                    b.append(", type=");
                    b.append(value.mType);
                    b.append(", readOnly=");
                    b.append(value.mReadOnly);
                    b.append(", sql=\"");
                    b.append(SQLiteConnection.trimSqlForDisplay(key));
                    b.append("\"");
                    printer.println(b.toString());
                }
                i++;
            }
        }

        @Override // xsna.m900
        public void entryRemoved(boolean z, String str, PreparedStatement preparedStatement, PreparedStatement preparedStatement2) {
            preparedStatement.mInCache = false;
            if (preparedStatement.mInUse) {
                return;
            }
            SQLiteConnection.this.finalizePreparedStatement(preparedStatement);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SQLiteConnection(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z) {
        CloseGuard closeGuard = CloseGuard.get();
        this.mCloseGuard = closeGuard;
        this.mRecentOperations = new OperationLog(0 == true ? 1 : 0);
        this.mPool = sQLiteConnectionPool;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = new SQLiteDatabaseConfiguration(sQLiteDatabaseConfiguration);
        this.mConfiguration = sQLiteDatabaseConfiguration2;
        this.mConnectionId = i;
        this.mIsPrimaryConnection = z;
        this.mIsReadOnlyConnection = (sQLiteDatabaseConfiguration.openFlags & 1) != 0;
        this.mPreparedStatementCache = new PreparedStatementCache(sQLiteDatabaseConfiguration2.maxSqlCacheSize);
        closeGuard.open(CampaignEx.JSON_NATIVE_VIDEO_CLOSE);
    }

    private PreparedStatement acquirePreparedStatement(String str) {
        boolean z;
        SQLiteConnection sQLiteConnection;
        int nativeGetParameterCount;
        int sqlStatementType;
        PreparedStatement preparedStatement = this.mPreparedStatementCache.get(str);
        if (preparedStatement == null) {
            z = false;
        } else {
            if (!preparedStatement.mInUse) {
                return preparedStatement;
            }
            z = true;
        }
        long nativePrepareStatement = nativePrepareStatement(this.mConnectionPtr, str);
        try {
            nativeGetParameterCount = nativeGetParameterCount(this.mConnectionPtr, nativePrepareStatement);
            sqlStatementType = SQLiteStatementType.getSqlStatementType(str);
            sQLiteConnection = this;
        } catch (RuntimeException e) {
            e = e;
            sQLiteConnection = this;
        }
        try {
            preparedStatement = sQLiteConnection.obtainPreparedStatement(str, nativePrepareStatement, nativeGetParameterCount, sqlStatementType, nativeIsReadOnly(this.mConnectionPtr, nativePrepareStatement));
            if (!z && isCacheable(sqlStatementType)) {
                sQLiteConnection.mPreparedStatementCache.put(str, preparedStatement);
                preparedStatement.mInCache = true;
            }
            preparedStatement.mInUse = true;
            return preparedStatement;
        } catch (RuntimeException e2) {
            e = e2;
            RuntimeException runtimeException = e;
            if (preparedStatement != null && preparedStatement.mInCache) {
                throw runtimeException;
            }
            nativeFinalizeStatement(sQLiteConnection.mConnectionPtr, nativePrepareStatement);
            throw runtimeException;
        }
    }

    private void applyBlockGuardPolicy(PreparedStatement preparedStatement) {
        if (!this.mConfiguration.isInMemoryDb() && SQLiteDebug.DEBUG_SQL_LOG && Looper.myLooper() == Looper.getMainLooper()) {
            boolean z = preparedStatement.mReadOnly;
        }
    }

    private void attachCancellationSignal(rq9 rq9Var) {
        if (rq9Var != null) {
            rq9Var.c();
            int i = this.mCancellationSignalAttachCount + 1;
            this.mCancellationSignalAttachCount = i;
            if (i == 1) {
                nativeResetCancel(this.mConnectionPtr, true);
                rq9Var.b(this);
            }
        }
    }

    private void bindArguments(PreparedStatement preparedStatement, Object[] objArr) {
        int length = objArr != null ? objArr.length : 0;
        if (length != preparedStatement.mNumParameters) {
            throw new SQLiteBindOrColumnIndexOutOfRangeException(rzl.a(preparedStatement.mNumParameters, length, " bind arguments but ", " were provided.", new StringBuilder("Expected ")));
        }
        if (length == 0) {
            return;
        }
        long j = preparedStatement.mStatementPtr;
        for (int i = 0; i < length; i++) {
            Object obj = objArr[i];
            int typeOfObject = getTypeOfObject(obj);
            if (typeOfObject == 0) {
                nativeBindNull(this.mConnectionPtr, j, i + 1);
            } else if (typeOfObject == 1) {
                nativeBindLong(this.mConnectionPtr, j, i + 1, ((Number) obj).longValue());
            } else if (typeOfObject == 2) {
                nativeBindDouble(this.mConnectionPtr, j, i + 1, ((Number) obj).doubleValue());
            } else if (typeOfObject == 4) {
                nativeBindBlob(this.mConnectionPtr, j, i + 1, (byte[]) obj);
            } else if (obj instanceof Boolean) {
                nativeBindLong(this.mConnectionPtr, j, i + 1, ((Boolean) obj).booleanValue() ? 1L : 0L);
            } else {
                nativeBindString(this.mConnectionPtr, j, i + 1, obj.toString());
            }
        }
    }

    private static String canonicalizeSyncMode(String str) {
        str.getClass();
        switch (str) {
            case "0":
                return "OFF";
            case "1":
                return "NORMAL";
            case "2":
                return "FULL";
            default:
                return str;
        }
    }

    @SuppressLint({"Assert"})
    private void detachCancellationSignal(rq9 rq9Var) {
        if (rq9Var != null) {
            int i = this.mCancellationSignalAttachCount - 1;
            this.mCancellationSignalAttachCount = i;
            if (i == 0) {
                rq9Var.b(null);
                nativeResetCancel(this.mConnectionPtr, false);
            }
        }
    }

    private void dispose(boolean z) {
        CloseGuard closeGuard = this.mCloseGuard;
        if (closeGuard != null) {
            if (z) {
                closeGuard.warnIfOpen();
            }
            this.mCloseGuard.close();
        }
        if (this.mConnectionPtr != 0) {
            int beginOperation = this.mRecentOperations.beginOperation(CampaignEx.JSON_NATIVE_VIDEO_CLOSE, null, null);
            try {
                Trace.beginSection("SQLiteConnection evictAll");
                this.mPreparedStatementCache.evictAll();
                Trace.endSection();
                SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
                if (sQLiteDatabaseConfiguration.noCheckpointOnClose && !sQLiteDatabaseConfiguration.isInMemoryDb()) {
                    nativeSetNoCheckpointOnClose(this.mConnectionPtr);
                }
                Trace.beginSection("SQLiteConnection nativeClose");
                nativeClose(this.mConnectionPtr);
                Trace.endSection();
                this.mConnectionPtr = 0L;
                this.mRecentOperations.endOperation(beginOperation, this.mConfiguration.slowQueryLogger);
            } catch (Throwable th) {
                this.mRecentOperations.endOperation(beginOperation, this.mConfiguration.slowQueryLogger);
                throw th;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void finalizePreparedStatement(PreparedStatement preparedStatement) {
        nativeFinalizeStatement(this.mConnectionPtr, preparedStatement.mStatementPtr);
        recyclePreparedStatement(preparedStatement);
    }

    private SQLiteDebug.DbStats getMainDbStatsUnsafe(int i, long j, long j2) {
        String str = this.mConfiguration.path;
        if (!this.mIsPrimaryConnection) {
            str = h5s.c(this.mConnectionId, ")", ho8.b(str, " ("));
        }
        return new SQLiteDebug.DbStats(str, j, j2, i, this.mPreparedStatementCache.hitCount(), this.mPreparedStatementCache.missCount(), this.mPreparedStatementCache.size());
    }

    @TargetApi(11)
    private static int getTypeOfObject(Object obj) {
        if (obj == null) {
            return 0;
        }
        if (obj instanceof byte[]) {
            return 4;
        }
        if ((obj instanceof Float) || (obj instanceof Double)) {
            return 2;
        }
        return ((obj instanceof Long) || (obj instanceof Integer) || (obj instanceof Short) || (obj instanceof Byte)) ? 1 : 3;
    }

    public static boolean hasCodec() {
        return nativeHasCodec();
    }

    private static boolean isCacheable(int i) {
        return i == 2 || i == 1;
    }

    private static native void nativeBindBlob(long j, long j2, int i, byte[] bArr);

    private static native void nativeBindDouble(long j, long j2, int i, double d);

    private static native void nativeBindLong(long j, long j2, int i, long j3);

    private static native void nativeBindNull(long j, long j2, int i);

    private static native void nativeBindString(long j, long j2, int i, String str);

    private static native void nativeCancel(long j);

    private static native void nativeClose(long j);

    private static native void nativeExecute(long j, long j2);

    private static native int nativeExecuteForBlobFileDescriptor(long j, long j2);

    private static native int nativeExecuteForChangedRowCount(long j, long j2);

    private static native long nativeExecuteForCursorWindow(long j, long j2, long j3, int i, int i2, boolean z);

    private static native long nativeExecuteForLastInsertedRowId(long j, long j2);

    private static native long nativeExecuteForLong(long j, long j2);

    private static native String nativeExecuteForString(long j, long j2);

    private static native void nativeFinalizeStatement(long j, long j2);

    private static native int nativeGetColumnCount(long j, long j2);

    private static native String nativeGetColumnName(long j, long j2, int i);

    private static native int nativeGetDbLookaside(long j);

    private static native int nativeGetParameterCount(long j, long j2);

    private static native boolean nativeHasCodec();

    private static native boolean nativeIsReadOnly(long j, long j2);

    private static native void nativeLoadExtension(long j, String str, String str2);

    private static native long nativeOpen(String str, int i, String str2, boolean z, boolean z2);

    private static native long nativePrepareStatement(long j, String str);

    private static native void nativeRegisterCustomFunction(long j, SQLiteCustomFunction sQLiteCustomFunction);

    private static native void nativeRegisterFunction(long j, SQLiteFunction sQLiteFunction);

    private static native void nativeRegisterLocalizedCollators(long j, String str);

    private static native void nativeResetCancel(long j, boolean z);

    private static native void nativeResetStatementAndClearBindings(long j, long j2);

    private static native void nativeSetNoCheckpointOnClose(long j);

    private PreparedStatement obtainPreparedStatement(String str, long j, int i, int i2, boolean z) {
        PreparedStatement preparedStatement = this.mPreparedStatementPool;
        int i3 = 0;
        if (preparedStatement != null) {
            this.mPreparedStatementPool = preparedStatement.mPoolNext;
            preparedStatement.mPoolNext = null;
            preparedStatement.mInCache = false;
        } else {
            preparedStatement = new PreparedStatement(i3);
        }
        preparedStatement.mSql = str;
        preparedStatement.mStatementPtr = j;
        preparedStatement.mNumParameters = i;
        preparedStatement.mType = i2;
        preparedStatement.mReadOnly = z;
        return preparedStatement;
    }

    public static SQLiteConnection open(SQLiteConnectionPool sQLiteConnectionPool, SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration, int i, boolean z) {
        SQLiteConnection sQLiteConnection = new SQLiteConnection(sQLiteConnectionPool, sQLiteDatabaseConfiguration, i, z);
        try {
            sQLiteConnection.open();
            return sQLiteConnection;
        } catch (SQLiteException e) {
            sQLiteConnection.dispose(false);
            throw e;
        }
    }

    private void recyclePreparedStatement(PreparedStatement preparedStatement) {
        preparedStatement.mSql = null;
        preparedStatement.mPoolNext = this.mPreparedStatementPool;
        this.mPreparedStatementPool = preparedStatement;
    }

    private void releasePreparedStatement(PreparedStatement preparedStatement) {
        preparedStatement.mInUse = false;
        if (!preparedStatement.mInCache) {
            finalizePreparedStatement(preparedStatement);
            return;
        }
        try {
            nativeResetStatementAndClearBindings(this.mConnectionPtr, preparedStatement.mStatementPtr);
        } catch (SQLiteException unused) {
            this.mPreparedStatementCache.remove(preparedStatement.mSql);
        }
    }

    private void setAutoCheckpointInterval() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection) {
            return;
        }
        long wALAutoCheckpoint = SQLiteGlobal.getWALAutoCheckpoint();
        if (executeForLong("PRAGMA wal_autocheckpoint", null, null) != wALAutoCheckpoint) {
            executeForLong(k0.a(wALAutoCheckpoint, "PRAGMA wal_autocheckpoint="), null, null);
        }
    }

    private void setForeignKeyModeFromConfiguration() {
        if (this.mIsReadOnlyConnection) {
            return;
        }
        long j = this.mConfiguration.foreignKeyConstraintsEnabled ? 1L : 0L;
        if (executeForLong("PRAGMA foreign_keys", null, null) != j) {
            execute(k0.a(j, "PRAGMA foreign_keys="), null, null);
        }
    }

    private void setJournalMode(String str) {
        if (executeForString("PRAGMA journal_mode", null, null).equalsIgnoreCase(str)) {
            return;
        }
        try {
            if (executeForString("PRAGMA journal_mode=" + str, null, null).equalsIgnoreCase(str)) {
                return;
            }
        } catch (SQLiteException e) {
            if (!(e instanceof SQLiteDatabaseLockedException)) {
                throw e;
            }
        }
        String str2 = this.mConfiguration.label;
    }

    private void setJournalSizeLimit() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection) {
            return;
        }
        long journalSizeLimit = SQLiteGlobal.getJournalSizeLimit();
        if (executeForLong("PRAGMA journal_size_limit", null, null) != journalSizeLimit) {
            executeForLong(k0.a(journalSizeLimit, "PRAGMA journal_size_limit="), null, null);
        }
    }

    private void setLocaleFromConfiguration() {
        String locale = this.mConfiguration.locale.toString();
        nativeRegisterLocalizedCollators(this.mConnectionPtr, locale);
        if (this.mIsReadOnlyConnection) {
            return;
        }
        try {
            execute("CREATE TABLE IF NOT EXISTS android_metadata (locale TEXT)", null, null);
            String executeForString = executeForString("SELECT locale FROM android_metadata UNION SELECT NULL ORDER BY locale DESC LIMIT 1", null, null);
            if (executeForString == null || !executeForString.equals(locale)) {
                execute("BEGIN", null, null);
                try {
                    execute("DELETE FROM android_metadata", null, null);
                    execute("INSERT INTO android_metadata (locale) VALUES(?)", new Object[]{locale}, null);
                    execute("REINDEX LOCALIZED", null, null);
                    execute("COMMIT", null, null);
                } catch (Throwable th) {
                    execute("ROLLBACK", null, null);
                    throw th;
                }
            }
        } catch (RuntimeException unused) {
            throw new SQLiteException(h5s.d(new StringBuilder("Failed to change locale for db '"), this.mConfiguration.label, "' to '", locale, "'."));
        }
    }

    private void setPageSize() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection) {
            return;
        }
        long defaultPageSize = SQLiteGlobal.getDefaultPageSize();
        if (executeForLong("PRAGMA page_size", null, null) != defaultPageSize) {
            execute(k0.a(defaultPageSize, "PRAGMA page_size="), null, null);
        }
    }

    private void setSyncMode(String str) {
        if (canonicalizeSyncMode(executeForString("PRAGMA synchronous", null, null)).equalsIgnoreCase(canonicalizeSyncMode(str))) {
            return;
        }
        execute("PRAGMA synchronous=" + str, null, null);
    }

    private void setWalModeFromConfiguration() {
        if (this.mConfiguration.isInMemoryDb() || this.mIsReadOnlyConnection) {
            return;
        }
        if ((this.mConfiguration.openFlags & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0) {
            setJournalMode("WAL");
            setSyncMode(SQLiteGlobal.getWALSyncMode());
        } else {
            setJournalMode(SQLiteGlobal.getDefaultJournalMode());
            setSyncMode(SQLiteGlobal.getDefaultSyncMode());
        }
    }

    private void throwIfStatementForbidden(PreparedStatement preparedStatement) {
        if (this.mOnlyAllowReadOnlyOperations && !preparedStatement.mReadOnly) {
            throw new SQLiteException("Cannot execute this statement because it might modify the database but the connection is read-only.");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static String trimSqlForDisplay(String str) {
        return TRIM_SQL_PATTERN.matcher(str).replaceAll(" ");
    }

    public void close() {
        dispose(false);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:(2:5|6)|10|11|(12:14|15|16|17|18|19|20|21|(1:23)|24|25|12)|31|32|33) */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0040 A[Catch: all -> 0x007d, SQLiteException -> 0x00c3, TRY_LEAVE, TryCatch #0 {SQLiteException -> 0x00c3, blocks: (B:11:0x0035, B:12:0x003a, B:14:0x0040, B:21:0x0083, B:23:0x009a, B:24:0x00ae), top: B:10:0x0035 }] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x009a A[Catch: all -> 0x007d, SQLiteException -> 0x00c3, TryCatch #0 {SQLiteException -> 0x00c3, blocks: (B:11:0x0035, B:12:0x003a, B:14:0x0040, B:21:0x0083, B:23:0x009a, B:24:0x00ae), top: B:10:0x0035 }] */
    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    /* JADX WARN: Unreachable blocks removed: 2, instructions: 2 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void collectDbStats(ArrayList<SQLiteDebug.DbStats> arrayList) {
        long j;
        long j2;
        CursorWindow cursorWindow;
        int i;
        long j3;
        long j4;
        int nativeGetDbLookaside = nativeGetDbLookaside(this.mConnectionPtr);
        try {
            j = executeForLong("PRAGMA page_count;", null, null);
        } catch (SQLiteException unused) {
            j = 0;
        }
        try {
            try {
                j2 = executeForLong("PRAGMA page_size;", null, null);
            } catch (SQLiteException unused2) {
                j2 = 0;
                arrayList.add(getMainDbStatsUnsafe(nativeGetDbLookaside, j, j2));
                cursorWindow = new CursorWindow("collectDbStats");
                executeForCursorWindow("PRAGMA database_list;", null, cursorWindow, 0, 0, false, null);
                while (i < cursorWindow.getNumRows()) {
                }
                cursorWindow.close();
                return;
            }
            executeForCursorWindow("PRAGMA database_list;", null, cursorWindow, 0, 0, false, null);
            for (i = 1; i < cursorWindow.getNumRows(); i++) {
                String string = cursorWindow.getString(i, 1);
                String string2 = cursorWindow.getString(i, 2);
                try {
                    j3 = executeForLong("PRAGMA " + string + ".page_count;", null, null);
                    try {
                        j4 = executeForLong("PRAGMA " + string + ".page_size;", null, null);
                    } catch (SQLiteException unused3) {
                        j4 = 0;
                        long j5 = j3;
                        String str = "  (attached) " + string;
                        if (!string2.isEmpty()) {
                        }
                        arrayList.add(new SQLiteDebug.DbStats(str, j5, j4, 0, 0, 0, 0));
                    }
                } catch (SQLiteException unused4) {
                    j3 = 0;
                }
                long j52 = j3;
                String str2 = "  (attached) " + string;
                if (!string2.isEmpty()) {
                    str2 = str2 + ": " + string2;
                }
                arrayList.add(new SQLiteDebug.DbStats(str2, j52, j4, 0, 0, 0, 0));
            }
            cursorWindow.close();
            return;
        } catch (Throwable th) {
            cursorWindow.close();
            throw th;
        }
        arrayList.add(getMainDbStatsUnsafe(nativeGetDbLookaside, j, j2));
        cursorWindow = new CursorWindow("collectDbStats");
    }

    public void collectDbStatsUnsafe(ArrayList<SQLiteDebug.DbStats> arrayList) {
        arrayList.add(getMainDbStatsUnsafe(0, 0L, 0L));
    }

    public String describeCurrentOperationUnsafe() {
        return this.mRecentOperations.describeCurrentOperation();
    }

    public void dump(Printer printer, boolean z) {
        dumpUnsafe(printer, z);
    }

    public void dumpUnsafe(Printer printer, boolean z) {
        printer.println("Connection #" + this.mConnectionId + StringUtils.PROCESS_POSTFIX_DELIMITER);
        if (z) {
            printer.println("  connectionPtr: 0x" + Long.toHexString(this.mConnectionPtr));
        }
        printer.println("  isPrimaryConnection: " + this.mIsPrimaryConnection);
        printer.println("  onlyAllowReadOnlyOperations: " + this.mOnlyAllowReadOnlyOperations);
        this.mRecentOperations.dump(printer, z);
        if (z) {
            this.mPreparedStatementCache.dump(printer);
        }
    }

    public void enableLocalizedCollators() {
        if (nativeHasCodec()) {
            setLocaleFromConfiguration();
        }
    }

    public void execute(String str, Object[] objArr, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("execute", str, objArr);
        try {
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(rq9Var);
                    try {
                        nativeExecute(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    } finally {
                        detachCancellationSignal(rq9Var);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } finally {
                this.mRecentOperations.endOperation(beginOperation, this.mConfiguration.slowQueryLogger);
            }
        } catch (RuntimeException e) {
            this.mRecentOperations.failOperation(beginOperation, e);
            throw e;
        }
    }

    public ParcelFileDescriptor executeForBlobFileDescriptor(String str, Object[] objArr, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("executeForBlobFileDescriptor", str, objArr);
        try {
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(rq9Var);
                    try {
                        int nativeExecuteForBlobFileDescriptor = nativeExecuteForBlobFileDescriptor(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                        return nativeExecuteForBlobFileDescriptor >= 0 ? ParcelFileDescriptor.adoptFd(nativeExecuteForBlobFileDescriptor) : null;
                    } finally {
                        detachCancellationSignal(rq9Var);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } catch (RuntimeException e) {
                this.mRecentOperations.failOperation(beginOperation, e);
                throw e;
            }
        } finally {
            this.mRecentOperations.endOperation(beginOperation, this.mConfiguration.slowQueryLogger);
        }
    }

    public int executeForChangedRowCount(String str, Object[] objArr, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("executeForChangedRowCount", str, objArr);
        try {
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(rq9Var);
                    try {
                        int nativeExecuteForChangedRowCount = nativeExecuteForChangedRowCount(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                        if (this.mRecentOperations.endOperationDeferLog(beginOperation, this.mConfiguration.slowQueryLogger)) {
                            this.mRecentOperations.logOperation(beginOperation, lhg.a(nativeExecuteForChangedRowCount, "changedRows="), this.mConfiguration.slowQueryLogger);
                        }
                        return nativeExecuteForChangedRowCount;
                    } finally {
                        detachCancellationSignal(rq9Var);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } catch (RuntimeException e) {
                this.mRecentOperations.failOperation(beginOperation, e);
                throw e;
            }
        } catch (Throwable th) {
            if (this.mRecentOperations.endOperationDeferLog(beginOperation, this.mConfiguration.slowQueryLogger)) {
                this.mRecentOperations.logOperation(beginOperation, lhg.a(0, "changedRows="), this.mConfiguration.slowQueryLogger);
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0166 A[Catch: all -> 0x00af, TryCatch #7 {all -> 0x00af, blocks: (B:6:0x001b, B:35:0x006d, B:37:0x0079, B:49:0x015a, B:51:0x0166, B:52:0x0193), top: B:5:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public int executeForCursorWindow(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, rq9 rq9Var) {
        int i3;
        String str2;
        String str3;
        int i4;
        String str4;
        String str5;
        String str6;
        int i5;
        int i6;
        int i7;
        PreparedStatement preparedStatement;
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        cursorWindow.acquireReference();
        try {
            int beginOperation = this.mRecentOperations.beginOperation("executeForCursorWindow", str, objArr);
            int i8 = -1;
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(rq9Var);
                    str3 = "', startPos=";
                    try {
                        try {
                            try {
                                preparedStatement = acquirePreparedStatement;
                                i4 = beginOperation;
                                str6 = "window='";
                                i3 = i;
                            } catch (Throwable th) {
                                th = th;
                                str2 = ", actualPos=";
                                i4 = beginOperation;
                                str3 = str3;
                                str4 = ", countedRows=";
                                str5 = ", filledRows=";
                                preparedStatement = acquirePreparedStatement;
                                str6 = "window='";
                                i3 = i;
                                i5 = -1;
                                i6 = -1;
                                try {
                                    detachCancellationSignal(rq9Var);
                                    throw th;
                                } catch (Throwable th2) {
                                    th = th2;
                                    try {
                                        try {
                                            releasePreparedStatement(preparedStatement);
                                            throw th;
                                        } catch (RuntimeException e) {
                                            e = e;
                                            this.mRecentOperations.failOperation(i4, e);
                                            throw e;
                                        }
                                    } catch (Throwable th3) {
                                        th = th3;
                                        i7 = i8;
                                        if (this.mRecentOperations.endOperationDeferLog(i4, this.mConfiguration.slowQueryLogger)) {
                                            this.mRecentOperations.logOperation(i4, str6 + cursorWindow + str3 + i3 + str2 + i7 + str5 + i6 + str4 + i5, this.mConfiguration.slowQueryLogger);
                                        }
                                        throw th;
                                    }
                                }
                            }
                        } catch (Throwable th4) {
                            th = th4;
                            str4 = ", countedRows=";
                            preparedStatement = acquirePreparedStatement;
                            str2 = ", actualPos=";
                            i4 = beginOperation;
                            str5 = ", filledRows=";
                        }
                        try {
                            long nativeExecuteForCursorWindow = nativeExecuteForCursorWindow(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr, cursorWindow.mWindowPtr, i3, i2, z);
                            i7 = (int) (nativeExecuteForCursorWindow >> 32);
                            i5 = (int) nativeExecuteForCursorWindow;
                            try {
                                i6 = cursorWindow.getNumRows();
                            } catch (Throwable th5) {
                                th = th5;
                                str2 = ", actualPos=";
                                str3 = str3;
                                str4 = ", countedRows=";
                                str5 = ", filledRows=";
                                i6 = -1;
                            }
                        } catch (Throwable th6) {
                            th = th6;
                            str2 = ", actualPos=";
                            str3 = str3;
                            str4 = ", countedRows=";
                            str5 = ", filledRows=";
                            i5 = -1;
                            i6 = -1;
                            detachCancellationSignal(rq9Var);
                            throw th;
                        }
                    } catch (Throwable th7) {
                        th = th7;
                        i3 = i;
                        str4 = ", countedRows=";
                        str5 = ", filledRows=";
                        str6 = "window='";
                        preparedStatement = acquirePreparedStatement;
                        str2 = ", actualPos=";
                        i4 = beginOperation;
                    }
                    try {
                        cursorWindow.setStartPosition(i7);
                        try {
                            detachCancellationSignal(rq9Var);
                        } catch (Throwable th8) {
                            th = th8;
                            str2 = ", actualPos=";
                            str3 = str3;
                            str4 = ", countedRows=";
                            str5 = ", filledRows=";
                            i8 = i7;
                            releasePreparedStatement(preparedStatement);
                            throw th;
                        }
                    } catch (Throwable th9) {
                        th = th9;
                        str2 = ", actualPos=";
                        str3 = str3;
                        str4 = ", countedRows=";
                        str5 = ", filledRows=";
                        i8 = i7;
                        detachCancellationSignal(rq9Var);
                        throw th;
                    }
                } catch (Throwable th10) {
                    th = th10;
                    i3 = i;
                    str3 = "', startPos=";
                    i4 = beginOperation;
                    str4 = ", countedRows=";
                    str5 = ", filledRows=";
                    str6 = "window='";
                    preparedStatement = acquirePreparedStatement;
                    str2 = ", actualPos=";
                    i5 = -1;
                    i6 = -1;
                }
            } catch (RuntimeException e2) {
                e = e2;
                i3 = i;
                str2 = ", actualPos=";
                str3 = "', startPos=";
                i4 = beginOperation;
                str4 = ", countedRows=";
                str5 = ", filledRows=";
                str6 = "window='";
                i5 = -1;
                i6 = -1;
            } catch (Throwable th11) {
                th = th11;
                i3 = i;
                str2 = ", actualPos=";
                str3 = "', startPos=";
                i4 = beginOperation;
                str4 = ", countedRows=";
                str5 = ", filledRows=";
                str6 = "window='";
                i5 = -1;
                i6 = -1;
                i7 = -1;
            }
            try {
                releasePreparedStatement(preparedStatement);
                if (this.mRecentOperations.endOperationDeferLog(i4, this.mConfiguration.slowQueryLogger)) {
                    this.mRecentOperations.logOperation(i4, str6 + cursorWindow + str3 + i3 + ", actualPos=" + i7 + ", filledRows=" + i6 + ", countedRows=" + i5, this.mConfiguration.slowQueryLogger);
                }
                return i5;
            } catch (RuntimeException e3) {
                e = e3;
                str2 = ", actualPos=";
                str3 = str3;
                str4 = ", countedRows=";
                str5 = ", filledRows=";
                i8 = i7;
                this.mRecentOperations.failOperation(i4, e);
                throw e;
            } catch (Throwable th12) {
                th = th12;
                str2 = ", actualPos=";
                str3 = str3;
                str4 = ", countedRows=";
                str5 = ", filledRows=";
                if (this.mRecentOperations.endOperationDeferLog(i4, this.mConfiguration.slowQueryLogger)) {
                }
                throw th;
            }
        } finally {
            cursorWindow.releaseReference();
        }
    }

    public long executeForLastInsertedRowId(String str, Object[] objArr, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("executeForLastInsertedRowId", str, objArr);
        try {
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(rq9Var);
                    try {
                        return nativeExecuteForLastInsertedRowId(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    } finally {
                        detachCancellationSignal(rq9Var);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } finally {
                this.mRecentOperations.endOperation(beginOperation, this.mConfiguration.slowQueryLogger);
            }
        } catch (RuntimeException e) {
            this.mRecentOperations.failOperation(beginOperation, e);
            throw e;
        }
    }

    public long executeForLong(String str, Object[] objArr, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("executeForLong", str, objArr);
        try {
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(rq9Var);
                    try {
                        return nativeExecuteForLong(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    } finally {
                        detachCancellationSignal(rq9Var);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } finally {
                this.mRecentOperations.endOperation(beginOperation, this.mConfiguration.slowQueryLogger);
            }
        } catch (RuntimeException e) {
            this.mRecentOperations.failOperation(beginOperation, e);
            throw e;
        }
    }

    public String executeForString(String str, Object[] objArr, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("executeForString", str, objArr);
        try {
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                try {
                    throwIfStatementForbidden(acquirePreparedStatement);
                    bindArguments(acquirePreparedStatement, objArr);
                    applyBlockGuardPolicy(acquirePreparedStatement);
                    attachCancellationSignal(rq9Var);
                    try {
                        return nativeExecuteForString(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                    } finally {
                        detachCancellationSignal(rq9Var);
                    }
                } finally {
                    releasePreparedStatement(acquirePreparedStatement);
                }
            } finally {
                this.mRecentOperations.endOperation(beginOperation, this.mConfiguration.slowQueryLogger);
            }
        } catch (RuntimeException e) {
            this.mRecentOperations.failOperation(beginOperation, e);
            throw e;
        }
    }

    public void finalize() throws Throwable {
        try {
            SQLiteConnectionPool sQLiteConnectionPool = this.mPool;
            if (sQLiteConnectionPool != null && this.mConnectionPtr != 0) {
                sQLiteConnectionPool.onConnectionLeaked();
            }
            dispose(true);
            super.finalize();
        } catch (Throwable th) {
            super.finalize();
            throw th;
        }
    }

    public boolean isPreparedStatementInCache(String str) {
        return this.mPreparedStatementCache.get(str) != null;
    }

    public boolean isPrimaryConnection() {
        return this.mIsPrimaryConnection;
    }

    @Override // xsna.rq9.a
    public void onCancel() {
        nativeCancel(this.mConnectionPtr);
    }

    public void prepare(String str, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        int beginOperation = this.mRecentOperations.beginOperation("prepare", str, null);
        try {
            try {
                PreparedStatement acquirePreparedStatement = acquirePreparedStatement(str);
                if (sQLiteStatementInfo != null) {
                    try {
                        sQLiteStatementInfo.numParameters = acquirePreparedStatement.mNumParameters;
                        sQLiteStatementInfo.readOnly = acquirePreparedStatement.mReadOnly;
                        int nativeGetColumnCount = nativeGetColumnCount(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr);
                        if (nativeGetColumnCount == 0) {
                            sQLiteStatementInfo.columnNames = EMPTY_STRING_ARRAY;
                        } else {
                            sQLiteStatementInfo.columnNames = new String[nativeGetColumnCount];
                            for (int i = 0; i < nativeGetColumnCount; i++) {
                                sQLiteStatementInfo.columnNames[i] = nativeGetColumnName(this.mConnectionPtr, acquirePreparedStatement.mStatementPtr, i);
                            }
                        }
                    } catch (Throwable th) {
                        releasePreparedStatement(acquirePreparedStatement);
                        throw th;
                    }
                }
                releasePreparedStatement(acquirePreparedStatement);
                this.mRecentOperations.endOperation(beginOperation, this.mConfiguration.slowQueryLogger);
            } catch (RuntimeException e) {
                this.mRecentOperations.failOperation(beginOperation, e);
                throw e;
            }
        } catch (Throwable th2) {
            this.mRecentOperations.endOperation(beginOperation, this.mConfiguration.slowQueryLogger);
            throw th2;
        }
    }

    public void reconfigure(SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration) {
        this.mOnlyAllowReadOnlyOperations = false;
        int size = sQLiteDatabaseConfiguration.customFunctions.size();
        for (int i = 0; i < size; i++) {
            SQLiteCustomFunction sQLiteCustomFunction = sQLiteDatabaseConfiguration.customFunctions.get(i);
            if (!this.mConfiguration.customFunctions.contains(sQLiteCustomFunction)) {
                nativeRegisterCustomFunction(this.mConnectionPtr, sQLiteCustomFunction);
            }
        }
        int size2 = sQLiteDatabaseConfiguration.functions.size();
        for (int i2 = 0; i2 < size2; i2++) {
            SQLiteFunction sQLiteFunction = sQLiteDatabaseConfiguration.functions.get(i2);
            if (!this.mConfiguration.functions.contains(sQLiteFunction)) {
                nativeRegisterFunction(this.mConnectionPtr, sQLiteFunction);
            }
        }
        boolean z = sQLiteDatabaseConfiguration.foreignKeyConstraintsEnabled;
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration2 = this.mConfiguration;
        boolean z2 = z != sQLiteDatabaseConfiguration2.foreignKeyConstraintsEnabled;
        boolean z3 = ((sQLiteDatabaseConfiguration.openFlags ^ sQLiteDatabaseConfiguration2.openFlags) & SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING) != 0;
        boolean equals = sQLiteDatabaseConfiguration.locale.equals(sQLiteDatabaseConfiguration2.locale);
        this.mConfiguration.updateParametersFrom(sQLiteDatabaseConfiguration);
        if (z2) {
            setForeignKeyModeFromConfiguration();
        }
        if (z3) {
            setWalModeFromConfiguration();
        }
        if (equals) {
            return;
        }
        setLocaleFromConfiguration();
    }

    public void setOnlyAllowReadOnlyOperations(boolean z) {
        this.mOnlyAllowReadOnlyOperations = z;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("SQLiteConnection: ");
        sb.append(this.mConfiguration.path);
        sb.append(" (");
        return h5s.c(this.mConnectionId, ")", sb);
    }

    private void open() {
        SQLiteDatabaseConfiguration sQLiteDatabaseConfiguration = this.mConfiguration;
        this.mConnectionPtr = nativeOpen(sQLiteDatabaseConfiguration.path, sQLiteDatabaseConfiguration.openFlags & (-536870913), sQLiteDatabaseConfiguration.label, SQLiteDebug.DEBUG_SQL_STATEMENTS, SQLiteDebug.DEBUG_SQL_TIME);
        setPageSize();
        setForeignKeyModeFromConfiguration();
        setJournalSizeLimit();
        setAutoCheckpointInterval();
        if (!nativeHasCodec()) {
            setWalModeFromConfiguration();
            setLocaleFromConfiguration();
        }
        int size = this.mConfiguration.customFunctions.size();
        for (int i = 0; i < size; i++) {
            nativeRegisterCustomFunction(this.mConnectionPtr, this.mConfiguration.customFunctions.get(i));
        }
        int size2 = this.mConfiguration.functions.size();
        for (int i2 = 0; i2 < size2; i2++) {
            nativeRegisterFunction(this.mConnectionPtr, this.mConfiguration.functions.get(i2));
        }
        for (SQLiteCustomExtension sQLiteCustomExtension : this.mConfiguration.customExtensions) {
            for (String str : sQLiteCustomExtension.pathsProvider.get()) {
                try {
                    nativeLoadExtension(this.mConnectionPtr, str, sQLiteCustomExtension.entryPoint);
                    L.e("L", sQLiteCustomExtension.name + " is loaded from " + str);
                    break;
                } catch (SQLiteException e) {
                    StringBuilder sb = new StringBuilder();
                    n6j.b(sb, sQLiteCustomExtension.name, " is not founded in ", str, " because of ");
                    sb.append(e.toString());
                    L.e("L", sb.toString());
                }
            }
            NativeLibLoader.a.getClass();
            NativeLibLoader.n(true);
            throw new SQLiteException(i5s.a(new StringBuilder("Extension with name "), sQLiteCustomExtension.name, " was not found"));
        }
    }
}
