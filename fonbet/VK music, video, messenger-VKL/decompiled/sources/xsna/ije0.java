package xsna;

import android.database.Cursor;
import androidx.room.RoomDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PushMessageDao_Impl.java */
/* loaded from: classes5.dex */
public final class ije0 implements Callable<List<xje0>> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ kje0 c;

    public ije0(kje0 kje0Var, dmg0 dmg0Var) {
        this.c = kje0Var;
        this.b = dmg0Var;
    }

    @Override // java.util.concurrent.Callable
    public final List<xje0> call() throws Exception {
        RoomDatabase roomDatabase = this.c.a;
        dmg0 dmg0Var = this.b;
        Cursor h = u370.h(roomDatabase, dmg0Var, false);
        try {
            ArrayList arrayList = new ArrayList(h.getCount());
            while (h.moveToNext()) {
                int i = h.getInt(0);
                String str = null;
                String string = h.isNull(1) ? null : h.getString(1);
                if (!h.isNull(2)) {
                    str = h.getString(2);
                }
                arrayList.add(new xje0(i, string, str));
            }
            return arrayList;
        } finally {
            h.close();
            dmg0Var.n();
        }
    }
}
