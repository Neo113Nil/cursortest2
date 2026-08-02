package xsna;

import android.database.sqlite.SQLiteDatabase;

/* compiled from: DefaultDatabaseProvider.java */
/* loaded from: classes12.dex */
public final class hdl implements swk {
    public final pn80 b;

    public hdl(pn80 pn80Var) {
        this.b = pn80Var;
    }

    @Override // xsna.swk
    public final SQLiteDatabase getReadableDatabase() {
        return this.b.getReadableDatabase();
    }

    @Override // xsna.swk
    public final SQLiteDatabase getWritableDatabase() {
        return this.b.getWritableDatabase();
    }
}
