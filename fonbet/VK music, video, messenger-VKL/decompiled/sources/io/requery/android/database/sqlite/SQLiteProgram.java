package io.requery.android.database.sqlite;

import java.util.Arrays;
import xsna.h5s;
import xsna.ji;
import xsna.rq9;
import xsna.tgw;
import xsna.win0;

/* loaded from: classes8.dex */
public abstract class SQLiteProgram extends SQLiteClosable implements win0 {
    private static final String[] EMPTY_STRING_ARRAY = new String[0];
    private final Object[] mBindArgs;
    private final String[] mColumnNames;
    private final SQLiteDatabase mDatabase;
    private final int mNumParameters;
    private final boolean mReadOnly;
    private final String mSql;

    public SQLiteProgram(SQLiteDatabase sQLiteDatabase, String str, Object[] objArr, rq9 rq9Var) {
        this.mDatabase = sQLiteDatabase;
        String trim = str.trim();
        this.mSql = trim;
        int sqlStatementType = SQLiteStatementType.getSqlStatementType(trim);
        if (sqlStatementType == 4 || sqlStatementType == 5 || sqlStatementType == 6) {
            this.mReadOnly = false;
            this.mColumnNames = EMPTY_STRING_ARRAY;
            this.mNumParameters = 0;
        } else {
            boolean z = sqlStatementType == 1;
            SQLiteStatementInfo sQLiteStatementInfo = new SQLiteStatementInfo();
            sQLiteDatabase.getThreadSession().prepare(trim, sQLiteDatabase.getThreadDefaultConnectionFlags(z), rq9Var, sQLiteStatementInfo);
            this.mReadOnly = sQLiteStatementInfo.readOnly;
            this.mColumnNames = sQLiteStatementInfo.columnNames;
            this.mNumParameters = sQLiteStatementInfo.numParameters;
        }
        if (objArr != null && objArr.length > this.mNumParameters) {
            StringBuilder sb = new StringBuilder("Too many bind arguments.  ");
            sb.append(objArr.length);
            sb.append(" arguments were provided but the statement needs ");
            throw new IllegalArgumentException(h5s.c(this.mNumParameters, " arguments.", sb));
        }
        int i = this.mNumParameters;
        if (i == 0) {
            this.mBindArgs = null;
            return;
        }
        Object[] objArr2 = new Object[i];
        this.mBindArgs = objArr2;
        if (objArr != null) {
            System.arraycopy(objArr, 0, objArr2, 0, objArr.length);
        }
    }

    private void bind(int i, Object obj) {
        if (i < 1 || i > this.mNumParameters) {
            throw new IllegalArgumentException(h5s.c(this.mNumParameters, " parameters.", ji.b(i, "Cannot bind argument at index ", " because the index is out of range.  The statement has ")));
        }
        this.mBindArgs[i - 1] = obj;
    }

    public void bindAllArgsAsStrings(String[] strArr) {
        if (strArr != null) {
            for (int length = strArr.length; length != 0; length--) {
                bindString(length, strArr[length - 1]);
            }
        }
    }

    @Override // xsna.win0
    public void bindBlob(int i, byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException(tgw.b(i, "the bind value at index ", " is null"));
        }
        bind(i, bArr);
    }

    @Override // xsna.win0
    public void bindDouble(int i, double d) {
        bind(i, Double.valueOf(d));
    }

    @Override // xsna.win0
    public void bindLong(int i, long j) {
        bind(i, Long.valueOf(j));
    }

    @Override // xsna.win0
    public void bindNull(int i) {
        bind(i, null);
    }

    public void bindObject(int i, Object obj) {
        if (obj == null) {
            bindNull(i);
            return;
        }
        if ((obj instanceof Double) || (obj instanceof Float)) {
            bindDouble(i, ((Number) obj).doubleValue());
            return;
        }
        if (obj instanceof Number) {
            bindLong(i, ((Number) obj).longValue());
            return;
        }
        if (obj instanceof Boolean) {
            if (((Boolean) obj).booleanValue()) {
                bindLong(i, 1L);
                return;
            } else {
                bindLong(i, 0L);
                return;
            }
        }
        if (obj instanceof byte[]) {
            bindBlob(i, (byte[]) obj);
        } else {
            bindString(i, obj.toString());
        }
    }

    @Override // xsna.win0
    public void bindString(int i, String str) {
        if (str == null) {
            throw new IllegalArgumentException(tgw.b(i, "the bind value at index ", " is null"));
        }
        bind(i, str);
    }

    public void clearBindings() {
        Object[] objArr = this.mBindArgs;
        if (objArr != null) {
            Arrays.fill(objArr, (Object) null);
        }
    }

    public final Object[] getBindArgs() {
        return this.mBindArgs;
    }

    public final String[] getColumnNames() {
        return this.mColumnNames;
    }

    public final int getConnectionFlags() {
        return this.mDatabase.getThreadDefaultConnectionFlags(this.mReadOnly);
    }

    public final SQLiteDatabase getDatabase() {
        return this.mDatabase;
    }

    public final SQLiteSession getSession() {
        return this.mDatabase.getThreadSession();
    }

    public final String getSql() {
        return this.mSql;
    }

    @Override // io.requery.android.database.sqlite.SQLiteClosable
    public void onAllReferencesReleased() {
        clearBindings();
    }

    public final void onCorruption() {
        this.mDatabase.onCorruption();
    }
}
