package io.requery.android.database.sqlite;

import android.annotation.SuppressLint;
import android.database.sqlite.SQLiteTransactionListener;
import android.os.ParcelFileDescriptor;
import io.requery.android.database.CursorWindow;
import xsna.rq9;

@SuppressLint({"Assert"})
/* loaded from: classes8.dex */
public final class SQLiteSession {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    public static final int TRANSACTION_MODE_DEFERRED = 0;
    public static final int TRANSACTION_MODE_DEFERRED_READONLY = 4;
    public static final int TRANSACTION_MODE_EXCLUSIVE = 2;
    public static final int TRANSACTION_MODE_IMMEDIATE = 1;
    private SQLiteConnection mConnection;
    private int mConnectionFlags;
    private final SQLiteConnectionPool mConnectionPool;
    private int mConnectionUseCount;
    private Transaction mTransactionPool;
    private Transaction mTransactionStack;

    public static final class Transaction {
        public boolean mChildFailed;
        public SQLiteTransactionListener mListener;
        public boolean mMarkedSuccessful;
        public int mMode;
        public Transaction mParent;

        public /* synthetic */ Transaction(int i) {
            this();
        }

        private Transaction() {
        }
    }

    public SQLiteSession(SQLiteConnectionPool sQLiteConnectionPool) {
        if (sQLiteConnectionPool == null) {
            throw new IllegalArgumentException("connectionPool must not be null");
        }
        this.mConnectionPool = sQLiteConnectionPool;
    }

    private void acquireConnection(String str, int i, rq9 rq9Var) {
        if (this.mConnection == null) {
            this.mConnection = this.mConnectionPool.acquireConnection(str, i, rq9Var);
            this.mConnectionFlags = i;
        }
        this.mConnectionUseCount++;
    }

    private void beginTransactionUnchecked(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, rq9 rq9Var) {
        if (rq9Var != null) {
            rq9Var.c();
        }
        if (this.mTransactionStack == null) {
            acquireConnection(null, i2, rq9Var);
        }
        try {
            if (this.mTransactionStack == null) {
                if (i == 1) {
                    this.mConnection.execute("BEGIN IMMEDIATE;", null, rq9Var);
                } else if (i != 2) {
                    this.mConnection.execute("BEGIN;", null, rq9Var);
                } else {
                    this.mConnection.execute("BEGIN EXCLUSIVE;", null, rq9Var);
                }
            }
            if (sQLiteTransactionListener != null) {
                try {
                    sQLiteTransactionListener.onBegin();
                } catch (RuntimeException e) {
                    if (this.mTransactionStack == null) {
                        this.mConnection.execute("ROLLBACK;", null, rq9Var);
                    }
                    throw e;
                }
            }
            Transaction obtainTransaction = obtainTransaction(i, sQLiteTransactionListener);
            obtainTransaction.mParent = this.mTransactionStack;
            this.mTransactionStack = obtainTransaction;
        } catch (Throwable th) {
            if (this.mTransactionStack == null) {
                releaseConnection();
            }
            throw th;
        }
    }

    private void endTransactionUnchecked(rq9 rq9Var, boolean z) {
        if (rq9Var != null) {
            rq9Var.c();
        }
        Transaction transaction = this.mTransactionStack;
        boolean z2 = false;
        boolean z3 = (transaction.mMarkedSuccessful || z) && !transaction.mChildFailed;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        if (sQLiteTransactionListener != null) {
            try {
                if (z3) {
                    sQLiteTransactionListener.onCommit();
                } else {
                    sQLiteTransactionListener.onRollback();
                }
            } catch (RuntimeException e) {
                e = e;
            }
        }
        z2 = z3;
        e = null;
        this.mTransactionStack = transaction.mParent;
        recycleTransaction(transaction);
        Transaction transaction2 = this.mTransactionStack;
        if (transaction2 == null) {
            try {
                if (z2) {
                    this.mConnection.execute("COMMIT;", null, rq9Var);
                } else {
                    this.mConnection.execute("ROLLBACK;", null, rq9Var);
                }
                releaseConnection();
            } catch (Throwable th) {
                releaseConnection();
                throw th;
            }
        } else if (!z2) {
            transaction2.mChildFailed = true;
        }
        if (e != null) {
            throw e;
        }
    }

    private boolean executeSpecial(String str, Object[] objArr, int i, rq9 rq9Var) {
        if (rq9Var != null) {
            rq9Var.c();
        }
        int sqlStatementType = SQLiteStatementType.getSqlStatementType(str);
        if (sqlStatementType == 4) {
            beginTransaction(2, null, i, rq9Var);
            return true;
        }
        if (sqlStatementType == 5) {
            setTransactionSuccessful();
            endTransaction(rq9Var);
            return true;
        }
        if (sqlStatementType != 6) {
            return false;
        }
        endTransaction(rq9Var);
        return true;
    }

    private Transaction obtainTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener) {
        Transaction transaction = this.mTransactionPool;
        int i2 = 0;
        if (transaction != null) {
            this.mTransactionPool = transaction.mParent;
            transaction.mParent = null;
            transaction.mMarkedSuccessful = false;
            transaction.mChildFailed = false;
        } else {
            transaction = new Transaction(i2);
        }
        transaction.mMode = i;
        transaction.mListener = sQLiteTransactionListener;
        return transaction;
    }

    private void recycleTransaction(Transaction transaction) {
        transaction.mParent = this.mTransactionPool;
        transaction.mListener = null;
        this.mTransactionPool = transaction;
    }

    private void releaseConnection() {
        int i = this.mConnectionUseCount - 1;
        this.mConnectionUseCount = i;
        if (i == 0) {
            try {
                this.mConnectionPool.releaseConnection(this.mConnection);
            } finally {
                this.mConnection = null;
            }
        }
    }

    private void throwIfNestedTransaction() {
        if (hasNestedTransaction()) {
            throw new IllegalStateException("Cannot perform this operation because a nested transaction is in progress.");
        }
    }

    private void throwIfNoTransaction() {
        if (this.mTransactionStack == null) {
            throw new IllegalStateException("Cannot perform this operation because there is no current transaction.");
        }
    }

    private void throwIfTransactionMarkedSuccessful() {
        Transaction transaction = this.mTransactionStack;
        if (transaction != null && transaction.mMarkedSuccessful) {
            throw new IllegalStateException("Cannot perform this operation because the transaction has already been marked successful.  The only thing you can do now is call endTransaction().");
        }
    }

    private boolean yieldTransactionUnchecked(long j, rq9 rq9Var) {
        if (rq9Var != null) {
            rq9Var.c();
        }
        if (!this.mConnectionPool.shouldYieldConnection(this.mConnection, this.mConnectionFlags)) {
            return false;
        }
        Transaction transaction = this.mTransactionStack;
        int i = transaction.mMode;
        SQLiteTransactionListener sQLiteTransactionListener = transaction.mListener;
        int i2 = this.mConnectionFlags;
        endTransactionUnchecked(rq9Var, true);
        if (j > 0) {
            try {
                Thread.sleep(j);
            } catch (InterruptedException unused) {
            }
        }
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, rq9Var);
        return true;
    }

    public void beginTransaction(int i, SQLiteTransactionListener sQLiteTransactionListener, int i2, rq9 rq9Var) {
        throwIfTransactionMarkedSuccessful();
        beginTransactionUnchecked(i, sQLiteTransactionListener, i2, rq9Var);
    }

    public void endTransaction(rq9 rq9Var) {
        throwIfNoTransaction();
        endTransactionUnchecked(rq9Var, false);
    }

    public void execute(String str, Object[] objArr, int i, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i, rq9Var)) {
            return;
        }
        acquireConnection(str, i, rq9Var);
        try {
            this.mConnection.execute(str, objArr, rq9Var);
        } finally {
            releaseConnection();
        }
    }

    public ParcelFileDescriptor executeForBlobFileDescriptor(String str, Object[] objArr, int i, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i, rq9Var)) {
            return null;
        }
        acquireConnection(str, i, rq9Var);
        try {
            return this.mConnection.executeForBlobFileDescriptor(str, objArr, rq9Var);
        } finally {
            releaseConnection();
        }
    }

    public int executeForChangedRowCount(String str, Object[] objArr, int i, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i, rq9Var)) {
            return 0;
        }
        acquireConnection(str, i, rq9Var);
        try {
            return this.mConnection.executeForChangedRowCount(str, objArr, rq9Var);
        } finally {
            releaseConnection();
        }
    }

    public int executeForCursorWindow(String str, Object[] objArr, CursorWindow cursorWindow, int i, int i2, boolean z, int i3, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (cursorWindow == null) {
            throw new IllegalArgumentException("window must not be null.");
        }
        if (executeSpecial(str, objArr, i3, rq9Var)) {
            cursorWindow.clear();
            return 0;
        }
        acquireConnection(str, i3, rq9Var);
        try {
            return this.mConnection.executeForCursorWindow(str, objArr, cursorWindow, i, i2, z, rq9Var);
        } finally {
            releaseConnection();
        }
    }

    public long executeForLastInsertedRowId(String str, Object[] objArr, int i, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i, rq9Var)) {
            return 0L;
        }
        acquireConnection(str, i, rq9Var);
        try {
            return this.mConnection.executeForLastInsertedRowId(str, objArr, rq9Var);
        } finally {
            releaseConnection();
        }
    }

    public long executeForLong(String str, Object[] objArr, int i, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i, rq9Var)) {
            return 0L;
        }
        acquireConnection(str, i, rq9Var);
        try {
            return this.mConnection.executeForLong(str, objArr, rq9Var);
        } finally {
            releaseConnection();
        }
    }

    public String executeForString(String str, Object[] objArr, int i, rq9 rq9Var) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (executeSpecial(str, objArr, i, rq9Var)) {
            return null;
        }
        acquireConnection(str, i, rq9Var);
        try {
            return this.mConnection.executeForString(str, objArr, rq9Var);
        } finally {
            releaseConnection();
        }
    }

    public boolean hasConnection() {
        return this.mConnection != null;
    }

    public boolean hasNestedTransaction() {
        Transaction transaction = this.mTransactionStack;
        return (transaction == null || transaction.mParent == null) ? false : true;
    }

    public boolean hasTransaction() {
        return this.mTransactionStack != null;
    }

    public void prepare(String str, int i, rq9 rq9Var, SQLiteStatementInfo sQLiteStatementInfo) {
        if (str == null) {
            throw new IllegalArgumentException("sql must not be null.");
        }
        if (rq9Var != null) {
            rq9Var.c();
        }
        acquireConnection(str, i, rq9Var);
        try {
            this.mConnection.prepare(str, sQLiteStatementInfo);
        } finally {
            releaseConnection();
        }
    }

    public void setTransactionSuccessful() {
        throwIfNoTransaction();
        throwIfTransactionMarkedSuccessful();
        this.mTransactionStack.mMarkedSuccessful = true;
    }

    public boolean yieldTransaction(long j, boolean z, rq9 rq9Var) {
        if (z) {
            throwIfNoTransaction();
            throwIfTransactionMarkedSuccessful();
            throwIfNestedTransaction();
        } else {
            Transaction transaction = this.mTransactionStack;
            if (transaction == null || transaction.mMarkedSuccessful || transaction.mParent != null) {
                return false;
            }
        }
        if (this.mTransactionStack.mChildFailed) {
            return false;
        }
        return yieldTransactionUnchecked(j, rq9Var);
    }
}
