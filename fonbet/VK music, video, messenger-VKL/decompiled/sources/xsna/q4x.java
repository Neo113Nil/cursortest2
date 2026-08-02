package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.tra0;

/* compiled from: WindowInsetsPadding.kt */
/* loaded from: classes11.dex */
public class q4x extends k4x implements noy {
    public zpx0 r;

    public q4x(zpx0 zpx0Var) {
        this.r = zpx0Var;
    }

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        final int d = this.q.d(ep10Var, ep10Var.getLayoutDirection()) - this.p.d(ep10Var, ep10Var.getLayoutDirection());
        final int c = this.q.c(ep10Var) - this.p.c(ep10Var);
        int b = (this.q.b(ep10Var, ep10Var.getLayoutDirection()) - this.p.b(ep10Var, ep10Var.getLayoutDirection())) + d;
        int a = (this.q.a(ep10Var) - this.p.a(ep10Var)) + c;
        final tra0 N = zo10Var.N(s6j.i(-b, -a, j));
        return ep10Var.Q(s6j.g(N.b + b, j), s6j.f(N.c + a, j), jgp.b, new izs() { // from class: xsna.p4x
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ((tra0.a) obj).q(N, d, c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            }
        });
    }

    @Override // xsna.k4x
    public final zpx0 i2(zpx0 zpx0Var) {
        return new o3q0(zpx0Var, this.r);
    }

    @Override // xsna.k4x
    public final void j2() {
        super.j2();
        itl.f(this).Q();
    }
}
