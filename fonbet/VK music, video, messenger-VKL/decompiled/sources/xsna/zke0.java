package xsna;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class zke0 implements Callable<String> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ ple0 c;

    public zke0(ple0 ple0Var, dmg0 dmg0Var) {
        this.c = ple0Var;
        this.b = dmg0Var;
    }

    @Override // java.util.concurrent.Callable
    public final String call() throws Exception {
        RoomDatabase roomDatabase = this.c.a;
        dmg0 dmg0Var = this.b;
        Cursor h = u370.h(roomDatabase, dmg0Var, false);
        try {
            String str = null;
            if (h.moveToFirst() && !h.isNull(0)) {
                str = h.getString(0);
            }
            return str;
        } finally {
            h.close();
            dmg0Var.n();
        }
    }
}
