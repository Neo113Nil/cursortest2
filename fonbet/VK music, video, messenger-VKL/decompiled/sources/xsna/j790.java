package xsna;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PackageInfoDao_Impl.java */
/* loaded from: classes5.dex */
public final class j790 implements Callable<e790> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ t790 c;

    public j790(t790 t790Var, dmg0 dmg0Var) {
        this.c = t790Var;
        this.b = dmg0Var;
    }

    @Override // java.util.concurrent.Callable
    public final e790 call() throws Exception {
        RoomDatabase roomDatabase = this.c.a;
        dmg0 dmg0Var = this.b;
        Cursor h = u370.h(roomDatabase, dmg0Var, false);
        try {
            int b = dmk.b(h, "package_id");
            int b2 = dmk.b(h, "package_name");
            int b3 = dmk.b(h, "sha_hash");
            int b4 = dmk.b(h, "package_invalidate_time");
            e790 e790Var = null;
            if (h.moveToFirst()) {
                e790Var = new e790(h.isNull(b2) ? null : h.getString(b2), h.getLong(b), h.isNull(b3) ? null : h.getString(b3), h.isNull(b4) ? null : Long.valueOf(h.getLong(b4)));
            }
            return e790Var;
        } finally {
            h.close();
            dmg0Var.n();
        }
    }
}
