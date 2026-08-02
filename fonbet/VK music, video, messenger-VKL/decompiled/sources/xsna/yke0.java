package xsna;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class yke0 implements Callable<Integer> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ ple0 c;

    public yke0(ple0 ple0Var, dmg0 dmg0Var) {
        this.c = ple0Var;
        this.b = dmg0Var;
    }

    @Override // java.util.concurrent.Callable
    public final Integer call() throws Exception {
        Cursor h = u370.h(this.c.a, this.b, false);
        try {
            Integer num = null;
            if (h.moveToFirst() && !h.isNull(0)) {
                num = Integer.valueOf(h.getInt(0));
            }
            return num;
        } finally {
            h.close();
        }
    }

    public final void finalize() {
        this.b.n();
    }
}
