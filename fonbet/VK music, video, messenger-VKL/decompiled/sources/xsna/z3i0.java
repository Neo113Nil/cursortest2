package xsna;

import com.unity3d.services.UnityAdsConstants;

/* compiled from: Transition.kt */
/* loaded from: classes11.dex */
public final class z3i0<S> extends z46 {
    public wlp0<S> d;
    public ibk0 e;

    static {
        new sq2(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        new sq2(1.0f);
    }

    @Override // xsna.z46
    public final S B() {
        throw null;
    }

    @Override // xsna.z46
    public final void S(S s) {
        throw null;
    }

    @Override // xsna.z46
    public final void f0(wlp0<S> wlp0Var) {
        wlp0<S> wlp0Var2 = this.d;
        if (wlp0Var2 != null && !wlp0Var.equals(wlp0Var2)) {
            ixc0.b("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.d + ", new instance: " + wlp0Var);
        }
        this.d = wlp0Var;
    }

    @Override // xsna.z46
    public final void h0() {
        this.d = null;
        ibk0 ibk0Var = this.e;
        if (ibk0Var != null) {
            ibk0Var.b(this);
        }
    }

    public final void w0(ibk0 ibk0Var) {
        cak0 cak0Var;
        if (epx.f(this.e, ibk0Var)) {
            return;
        }
        ibk0 ibk0Var2 = this.e;
        if (ibk0Var2 != null) {
            ibk0Var2.b(this);
        }
        ibk0 ibk0Var3 = this.e;
        if (ibk0Var3 != null && (cak0Var = ibk0Var3.h) != null) {
            cak0Var.dispose();
        }
        this.e = ibk0Var;
        if (ibk0Var != null) {
            ibk0Var.e();
        }
        ibk0 ibk0Var4 = this.e;
        if (ibk0Var4 != null) {
            ibk0Var4.d(this, ump0.a, null);
        }
    }
}
