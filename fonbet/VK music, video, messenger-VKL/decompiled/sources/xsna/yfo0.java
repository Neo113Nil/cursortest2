package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.kgo0;
import xsna.q630;

/* compiled from: TextFieldImpl.kt */
/* loaded from: classes11.dex */
public final class yfo0 implements wzs<androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wh50<mxj0> b;
    public final /* synthetic */ kgo0.b c;
    public final /* synthetic */ s890 d;
    public final /* synthetic */ jai e;

    public yfo0(wh50 wh50Var, kgo0.b bVar, s890 s890Var, jai jaiVar) {
        this.b = wh50Var;
        this.c = bVar;
        this.d = s890Var;
        this.e = jaiVar;
    }

    @Override // xsna.wzs
    public final s3q0 invoke(androidx.compose.runtime.a aVar, Integer num) {
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(528115858, intValue, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:255)");
            }
            q630 u = vua0.u(q630.a.a, "Container");
            xfo0 xfo0Var = new xfo0(this.b, wh50.class, "value", "getValue()Ljava/lang/Object;", 0);
            dt1.b d = fgo0.d(this.c);
            float f = h190.a;
            q630 f2 = bu00.f(u, new eo6(xfo0Var, this.d, d, 5));
            dt1.a.getClass();
            cp10 d2 = ja8.d(dt1.a.b, true);
            int m = n34.m(aVar2);
            sy90 D = aVar2.D();
            q630 c = qri.c(aVar2, f2);
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
            k9q0.w(aVar2, d2, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                kr.a(m, aVar2, m, bVar);
            }
            k9q0.w(aVar2, c, cri.a.d);
            if (er.f(0, aVar2, this.e)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2.h();
        }
        return s3q0.a;
    }
}
