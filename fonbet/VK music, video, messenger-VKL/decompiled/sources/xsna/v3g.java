package xsna;

import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import xsna.tra0;

/* compiled from: CollapsableHeader.kt */
/* loaded from: classes6.dex */
public final class v3g implements b540 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rmp b;

    public v3g(int i, rmp rmpVar) {
        this.a = i;
        this.b = rmpVar;
    }

    @Override // xsna.b540
    public final dp10 b(ep10 ep10Var, List<? extends List<? extends zo10>> list, long j) {
        ArrayList arrayList = (ArrayList) list;
        List list2 = (List) arrayList.get(0);
        final tra0 N = ((zo10) j5g.Y((List) arrayList.get(1))).N(o6j.b(0, j, 0, 0, Integer.MAX_VALUE, 7));
        final tra0 N2 = ((zo10) j5g.Y(list2)).N(o6j.b(0, j, 0, 0, Integer.MAX_VALUE, 7));
        int i = N2.c + this.a;
        int i2 = N.c;
        x6p0 x6p0Var = this.b.a;
        x6p0Var.f(-(i2 - i));
        float b = x6p0Var.b();
        float c = x6p0Var.c();
        float f = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        float f2 = swe0.f(b, c, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        int g = swe0.g(an10.b(f2) + i2, i, i2);
        float c2 = x6p0Var.c();
        if (c2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            f = swe0.f(f2 / c2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        }
        final int i3 = -an10.b(N.c * f);
        final int b2 = an10.b(((r0 - r4) * f) + ep10Var.r0(48));
        return ep10Var.Q(o6j.i(j), g, jgp.b, new izs() { // from class: xsna.u3g
            @Override // xsna.izs
            public final Object invoke(Object obj) {
                tra0.a aVar = (tra0.a) obj;
                tra0.a.x(aVar, N, 0, i3);
                tra0.a.x(aVar, N2, 0, b2);
                return s3q0.a;
            }
        });
    }
}
