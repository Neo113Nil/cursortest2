package xsna;

import android.database.sqlite.SQLiteStatement;

/* compiled from: FrameworkSQLiteStatement.android.kt */
/* loaded from: classes.dex */
public final class sgs extends rgs implements zin0 {
    public final SQLiteStatement c;

    public sgs(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.c = sQLiteStatement;
    }

    @Override // xsna.zin0
    public final void execute() {
        this.c.execute();
    }

    @Override // xsna.zin0
    public final long executeInsert() {
        return this.c.executeInsert();
    }

    @Override // xsna.zin0
    public final int executeUpdateDelete() {
        return this.c.executeUpdateDelete();
    }
}
