package xsna;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.concurrent.Callable;

/* compiled from: PushMessageDao_Impl.java */
/* loaded from: classes5.dex */
public final class jje0 implements Callable<Integer> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ kje0 c;

    public jje0(kje0 kje0Var, dmg0 dmg0Var) {
        this.c = kje0Var;
        this.b = dmg0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() throws Exception {
        RoomDatabase roomDatabase = this.c.a;
        dmg0 dmg0Var = this.b;
        Cursor h = u370.h(roomDatabase, dmg0Var, false);
        try {
            Integer num = null;
            if (h.moveToFirst() && !h.isNull(0)) {
                num = Integer.valueOf(h.getInt(0));
            }
            return num;
        } finally {
            h.close();
            dmg0Var.n();
        }
    }
}
