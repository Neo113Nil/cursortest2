package io.requery.android.database.sqlite;

import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.os.ParcelFileDescriptor;
import xsna.rq9;
import xsna.zin0;

/* loaded from: classes8.dex */
public final class SQLiteStatement extends SQLiteProgram implements zin0 {
    private final rq9 cancellationSignal;

    public SQLiteStatement(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, rq9 rq9Var) {
        super(sQLiteDatabase, str, objArr, rq9Var);
        this.cancellationSignal = rq9Var;
    }

    @Override // xsna.zin0
    public void execute() {
        acquireReference();
        try {
            try {
                getSession().execute(getSql(), getBindArgs(), getConnectionFlags(), this.cancellationSignal);
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    @Override // xsna.zin0
    public long executeInsert() {
        acquireReference();
        try {
            try {
                return getSession().executeForLastInsertedRowId(getSql(), getBindArgs(), getConnectionFlags(), this.cancellationSignal);
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    @Override // xsna.zin0
    public int executeUpdateDelete() {
        acquireReference();
        try {
            try {
                return getSession().executeForChangedRowCount(getSql(), getBindArgs(), getConnectionFlags(), this.cancellationSignal);
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    public ParcelFileDescriptor simpleQueryForBlobFileDescriptor() {
        acquireReference();
        try {
            try {
                return getSession().executeForBlobFileDescriptor(getSql(), getBindArgs(), getConnectionFlags(), this.cancellationSignal);
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    public long simpleQueryForLong() {
        acquireReference();
        try {
            try {
                return getSession().executeForLong(getSql(), getBindArgs(), getConnectionFlags(), this.cancellationSignal);
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    public String simpleQueryForString() {
        acquireReference();
        try {
            try {
                return getSession().executeForString(getSql(), getBindArgs(), getConnectionFlags(), this.cancellationSignal);
            } catch (SQLiteDatabaseCorruptException e) {
                onCorruption();
                throw e;
            }
        } finally {
            releaseReference();
        }
    }

    public String toString() {
        return "SQLiteProgram: " + getSql();
    }
}
