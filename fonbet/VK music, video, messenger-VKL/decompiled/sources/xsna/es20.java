package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;
import xsna.tra0;

/* compiled from: InteractiveComponentSize.kt */
/* loaded from: classes11.dex */
public final class es20 extends q630.c implements nvi, noy {
    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        boolean z = this.o && ((Boolean) ovi.a(this, abx.a)).booleanValue();
        long j2 = abx.b;
        final tra0 N = zo10Var.N(j);
        final int max = z ? Math.max(N.b, ep10Var.r0(uco.c(j2))) : N.b;
        final int max2 = z ? Math.max(N.c, ep10Var.r0(uco.b(j2))) : N.c;
        return ep10Var.Q(max, max2, jgp.b, new izs() { // from class: xsna.cs20
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ((tra0.a) obj).q(N, an10.b((max - r0.b) / 2.0f), an10.b((max2 - r0.c) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            }
        });
    }
}
