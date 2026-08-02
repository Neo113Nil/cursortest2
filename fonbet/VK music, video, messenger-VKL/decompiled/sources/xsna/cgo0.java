package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.wlp0;

/* compiled from: TextFieldImpl.kt */
/* loaded from: classes11.dex */
public final class cgo0 implements yzs<q630, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ mtk0<Float> b;
    public final /* synthetic */ long c;
    public final /* synthetic */ nmo0 d;
    public final /* synthetic */ wzs<androidx.compose.runtime.a, Integer, s3q0> e;

    public cgo0(wlp0.d dVar, long j, nmo0 nmo0Var, wzs wzsVar) {
        this.b = dVar;
        this.c = j;
        this.d = nmo0Var;
        this.e = wzsVar;
    }

    @Override // xsna.yzs
    public final s3q0 invoke(q630 q630Var, androidx.compose.runtime.a aVar, Integer num) {
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue = num.intValue();
        if ((intValue & 6) == 0) {
            intValue |= aVar2.J(q630Var2) ? 4 : 2;
        }
        if (aVar2.t(intValue & 1, (intValue & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1405547205, intValue, -1, "androidx.compose.material3.internal.CommonDecorationBox.<anonymous>.<anonymous> (TextFieldImpl.kt:161)");
            }
            mtk0<Float> mtk0Var = this.b;
            boolean J = aVar2.J(mtk0Var);
            Object x = aVar2.x();
            if (J || x == a.C0011a.a) {
                x = new qjm0(mtk0Var, 2);
                aVar2.R(x);
            }
            q630 a = rdu.a(q630Var2, (izs) x);
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
            fgo0.b(this.c, this.d, this.e, aVar2, 0);
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
