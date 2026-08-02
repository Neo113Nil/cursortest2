package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: Tooltip.kt */
/* loaded from: classes11.dex */
public final class v5p0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wh50<tny> b;
    public final /* synthetic */ jai c;

    public v5p0(wh50 wh50Var, jai jaiVar) {
        this.b = wh50Var;
        this.c = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-23901870, intValue, -1, "androidx.compose.material3.TooltipBox.<anonymous> (Tooltip.kt:316)");
            }
            Object x = aVar2.x();
            if (x == a.C0011a.a) {
                x = new u5p0(this.b, 0);
                aVar2.R(x);
            }
            q630 o = egi.o(q630.a.a, (izs) x);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, o);
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
            if (er.f(0, aVar2, this.c)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
