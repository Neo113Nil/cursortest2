package xsna;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class fle0 implements Callable<e790> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ ple0 c;

    public fle0(ple0 ple0Var, dmg0 dmg0Var) {
        this.c = ple0Var;
        this.b = dmg0Var;
    }

    @Override // java.util.concurrent.Callable
    public final e790 call() throws Exception {
        RoomDatabase roomDatabase = this.c.a;
        dmg0 dmg0Var = this.b;
        Cursor h = u370.h(roomDatabase, dmg0Var, false);
        try {
            e790 e790Var = null;
            if (h.moveToFirst()) {
                e790Var = new e790(h.isNull(1) ? null : h.getString(1), h.getLong(0), h.isNull(2) ? null : h.getString(2), h.isNull(3) ? null : Long.valueOf(h.getLong(3)));
            }
            return e790Var;
        } finally {
            h.close();
            dmg0Var.n();
        }
    }
}
