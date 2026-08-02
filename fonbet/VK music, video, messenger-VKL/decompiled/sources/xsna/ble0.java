package xsna;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class ble0 implements Callable<Boolean> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ ple0 c;

    public ble0(ple0 ple0Var, dmg0 dmg0Var) {
        this.c = ple0Var;
        this.b = dmg0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Boolean call() throws Exception {
        RoomDatabase roomDatabase = this.c.a;
        dmg0 dmg0Var = this.b;
        Cursor h = u370.h(roomDatabase, dmg0Var, false);
        try {
            Boolean bool = null;
            if (h.moveToFirst()) {
                Integer valueOf = h.isNull(0) ? null : Integer.valueOf(h.getInt(0));
                if (valueOf != null) {
                    bool = Boolean.valueOf(valueOf.intValue() != 0);
                }
            }
            return bool;
        } finally {
            h.close();
            dmg0Var.n();
        }
    }
}
