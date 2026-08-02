package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.LinkedHashMap;
import java.util.Map;
import xsna.q630;
import xsna.tra0;

/* compiled from: InteractiveComponentSize.kt */
/* loaded from: classes11.dex */
public final class ds20 extends q630.c implements nvi, noy {
    public LinkedHashMap p;

    @Override // xsna.noy
    public final dp10 c(ep10 ep10Var, zo10 zo10Var, long j) {
        float f = ((pco) ovi.a(this, zax.c)).b;
        float f2 = 0;
        if (f < f2) {
            f = f2;
        }
        final tra0 N = zo10Var.N(j);
        boolean z = this.o && !Float.isNaN(f) && pco.a(f, f2) > 0;
        int r0 = !Float.isNaN(f) ? ep10Var.r0(f) : 0;
        final int max = z ? Math.max(N.b, r0) : N.b;
        final int max2 = z ? Math.max(N.c, r0) : N.c;
        if (z) {
            LinkedHashMap linkedHashMap = this.p;
            if (linkedHashMap == null) {
                linkedHashMap = new LinkedHashMap(2);
                this.p = linkedHashMap;
            }
            ior0 ior0Var = zax.b;
            int round = Math.round((r0 - N.b) / 2.0f);
            if (round < 0) {
                round = 0;
            }
            linkedHashMap.put(ior0Var, Integer.valueOf(round));
            icv icvVar = zax.a;
            int round2 = Math.round((r0 - N.c) / 2.0f);
            linkedHashMap.put(icvVar, Integer.valueOf(round2 >= 0 ? round2 : 0));
        }
        Map<gt1, Integer> map = this.p;
        if (map == null) {
            map = jgp.b;
        }
        return ep10Var.Q(max, max2, map, new izs() { // from class: xsna.bs20
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                ((tra0.a) obj).q(N, an10.b((max - r0.b) / 2.0f), an10.b((max2 - r0.c) / 2.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return s3q0.a;
            }
        });
    }
}
