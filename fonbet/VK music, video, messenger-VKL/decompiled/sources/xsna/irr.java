package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.ty6;

/* compiled from: FloatingActionButton.kt */
/* loaded from: classes11.dex */
public final class irr implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1233936436, intValue, -1, "androidx.compose.material3.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:330)");
            }
            q630 F = s200.F(lrr.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.u(q630.a.a, lrr.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14));
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            ty6.b bVar = dt1.a.l;
            jai jaiVar = f870.c;
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(cVar, bVar, aVar2, 54);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, F);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (aVar2.N() == null) {
                n34.r();
                throw null;
            }
            aVar2.H();
            if (aVar2.L()) {
                aVar2.I(aVar3);
            } else {
                aVar2.f();
            }
            k9q0.w(aVar2, a, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            cri.a.b bVar2 = cri.a.g;
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                kr.a(m, aVar2, m, bVar2);
            }
            k9q0.w(aVar2, c, cri.a.d);
            jaiVar.invoke(tpg0.a, aVar2, 6);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
