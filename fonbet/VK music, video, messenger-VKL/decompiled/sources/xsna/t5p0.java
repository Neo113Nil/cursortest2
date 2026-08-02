package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Tooltip.kt */
/* loaded from: classes11.dex */
public final class t5p0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wlp0<Boolean> b;
    public final /* synthetic */ jai c;
    public final /* synthetic */ c6p0 d;

    public t5p0(wlp0 wlp0Var, jai jaiVar, c6p0 c6p0Var) {
        this.b = wlp0Var;
        this.c = jaiVar;
        this.d = c6p0Var;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-527401546, intValue, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:321)");
            }
            q630 a = qri.a(q630.a.a, a5x.a, new w5p0(this.b));
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, a);
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
            this.c.invoke(this.d, aVar2, 6);
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
