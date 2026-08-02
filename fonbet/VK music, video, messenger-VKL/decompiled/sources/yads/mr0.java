package yads;

import android.os.SystemClock;
import xsna.gzs;

/* loaded from: classes10.dex */
public final class mr0 {
    public final oi1 a;

    public mr0(oi1 oi1Var) {
        this.a = oi1Var;
    }

    public final void a(final rv1 rv1Var, final sv1 sv1Var) {
        final long elapsedRealtime = SystemClock.elapsedRealtime();
        oi1 oi1Var = this.a;
        oi1Var.a.post(new Runnable() { // from class: xsna.e6z0
            @Override // java.lang.Runnable
            public final void run() {
                yads.mr0.a(elapsedRealtime, rv1Var, sv1Var);
            }
        });
    }

    public static final void a(long j, gzs gzsVar, gzs gzsVar2) {
        if (SystemClock.elapsedRealtime() - j <= 5000) {
            gzsVar.invoke();
        } else {
            gzsVar2.invoke();
        }
    }
}
