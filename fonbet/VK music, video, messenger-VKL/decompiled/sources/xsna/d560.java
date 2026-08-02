package xsna;

import android.net.ConnectivityManager;

/* compiled from: WorkConstraintsTracker.kt */
/* loaded from: classes.dex */
public final class d560 implements v5j {
    public final ConnectivityManager a;

    public d560(ConnectivityManager connectivityManager) {
        this.a = connectivityManager;
    }

    @Override // xsna.v5j
    public final boolean a(fxx0 fxx0Var) {
        return fxx0Var.j.a() != null;
    }

    @Override // xsna.v5j
    public final nb9 b(p6j p6jVar) {
        return rsr.i(new androidx.work.impl.constraints.c(p6jVar, this, null));
    }

    @Override // xsna.v5j
    public final boolean c(fxx0 fxx0Var) {
        if (a(fxx0Var)) {
            throw new IllegalStateException("isCurrentlyConstrained() must never be called onNetworkRequestConstraintController. isCurrentlyConstrained() is called only on older platforms where NetworkRequest isn't supported");
        }
        return false;
    }
}
