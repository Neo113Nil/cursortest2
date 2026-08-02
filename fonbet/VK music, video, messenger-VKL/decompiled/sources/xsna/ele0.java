package xsna;

import android.database.Cursor;
import java.util.concurrent.Callable;

/* compiled from: PushTokenDao_Impl.java */
/* loaded from: classes5.dex */
public final class ele0 implements Callable<pke0> {
    public final /* synthetic */ dmg0 b;
    public final /* synthetic */ ple0 c;

    public ele0(ple0 ple0Var, dmg0 dmg0Var) {
        this.c = ple0Var;
        this.b = dmg0Var;
    }

    @Override // java.util.concurrent.Callable
    public final pke0 call() throws Exception {
        Cursor h = u370.h(this.c.a, this.b, false);
        try {
            pke0 pke0Var = null;
            if (h.moveToFirst()) {
                pke0Var = new pke0(h.getLong(0), h.isNull(1) ? null : h.getString(1), h.isNull(2) ? null : h.getString(2), h.getLong(3), h.isNull(4) ? null : Long.valueOf(h.getLong(4)), h.getInt(5) != 0);
            }
            return pke0Var;
        } finally {
            h.close();
        }
    }

    public final void finalize() {
        this.b.n();
    }
}
