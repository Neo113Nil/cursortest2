package xsna;

import android.database.Cursor;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class xke0 implements Callable<List<tle0>> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ ple0 c;

    public xke0(ple0 ple0Var, dmg0 dmg0Var) {
        this.c = ple0Var;
        this.b = dmg0Var;
    }

    @Override // java.util.concurrent.Callable
    public final List<tle0> call() throws Exception {
        Cursor h = u370.h(this.c.a, this.b, false);
        try {
            ArrayList arrayList = new ArrayList(h.getCount());
            while (h.moveToNext()) {
                Long l = null;
                String string = h.isNull(0) ? null : h.getString(0);
                String string2 = h.isNull(1) ? null : h.getString(1);
                if (!h.isNull(2)) {
                    l = Long.valueOf(h.getLong(2));
                }
                arrayList.add(new tle0(string2, string, l));
            }
            return arrayList;
        } finally {
            h.close();
        }
    }

    public final void finalize() {
        this.b.n();
    }
}
