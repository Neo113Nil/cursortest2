package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Tooltip.kt */
/* loaded from: classes11.dex */
public final class s5p0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ float b;
    public final /* synthetic */ long c;
    public final /* synthetic */ jai d;

    public s5p0(float f, long j, jai jaiVar) {
        this.b = f;
        this.c = j;
        this.d = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1573998995, intValue, -1, "androidx.compose.material3.PlainTooltip.<anonymous> (Tooltip.kt:462)");
            }
            q630 C = s200.C(txj0.u(q630.a.a, x5p0.c, x5p0.b, this.b, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), x5p0.d);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, C);
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
            k9q0.w(aVar2, d, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                kr.a(m, aVar2, m, bVar);
            }
            k9q0.w(aVar2, c, cri.a.d);
            rvi.b(new c9e0[]{vcl0.b(this.c, zfj.a), cjo0.a.b(evp0.a(ata0.d, aVar2))}, this.d, aVar2, 8);
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
