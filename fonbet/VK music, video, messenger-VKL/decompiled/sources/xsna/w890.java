package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;
import xsna.tra0;

/* compiled from: Padding.kt */
/* loaded from: classes11.dex */
public final class w890 extends q630.c implements noy {
    public s890 p;

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        float c = this.p.c(ep10Var.getLayoutDirection());
        float d = this.p.d();
        float a = this.p.a(ep10Var.getLayoutDirection());
        float b = this.p.b();
        float f = 0;
        if (!((pco.a(b, f) >= 0) & (pco.a(c, f) >= 0) & (pco.a(d, f) >= 0) & (pco.a(a, f) >= 0))) {
            szw.a("Padding must be non-negative");
        }
        final int r0 = ep10Var.r0(c);
        int r02 = ep10Var.r0(a) + r0;
        final int r03 = ep10Var.r0(d);
        int r04 = ep10Var.r0(b) + r03;
        final tra0 N = zo10Var.N(s6j.i(-r02, -r04, j));
        return ep10Var.Q(s6j.g(N.b + r02, j), s6j.f(N.c + r04, j), jgp.b, new izs() { // from class: xsna.v890
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ((tra0.a) obj).q(N, r0, r03, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            }
        });
    }
}
