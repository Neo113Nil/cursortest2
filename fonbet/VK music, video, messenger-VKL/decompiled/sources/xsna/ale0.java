package xsna;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class ale0 implements Callable<tle0> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ ple0 c;

    public ale0(ple0 ple0Var, dmg0 dmg0Var) {
        this.c = ple0Var;
        this.b = dmg0Var;
    }

    @Override // java.util.concurrent.Callable
    public final tle0 call() throws Exception {
        RoomDatabase roomDatabase = this.c.a;
        dmg0 dmg0Var = this.b;
        Cursor h = u370.h(roomDatabase, dmg0Var, false);
        try {
            tle0 tle0Var = null;
            Long valueOf = null;
            if (h.moveToFirst()) {
                String string = h.isNull(0) ? null : h.getString(0);
                String string2 = h.isNull(1) ? null : h.getString(1);
                if (!h.isNull(2)) {
                    valueOf = Long.valueOf(h.getLong(2));
                }
                tle0Var = new tle0(string2, string, valueOf);
            }
            return tle0Var;
        } finally {
            h.close();
            dmg0Var.n();
        }
    }
}
