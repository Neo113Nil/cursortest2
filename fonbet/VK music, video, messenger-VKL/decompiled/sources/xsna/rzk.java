package xsna;

import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DatePicker.kt */
/* loaded from: classes11.dex */
public final class rzk implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wz8 b;
    public final /* synthetic */ zz8 c;
    public final /* synthetic */ izs<Long, s3q0> d;
    public final /* synthetic */ rz8 e;
    public final /* synthetic */ Long f;
    public final /* synthetic */ nyk g;
    public final /* synthetic */ eai0 h;
    public final /* synthetic */ vxk i;

    /* JADX WARN: Multi-variable type inference failed */
    public rzk(wz8 wz8Var, zz8 zz8Var, izs<? super Long, s3q0> izsVar, rz8 rz8Var, Long l, nyk nykVar, eai0 eai0Var, vxk vxkVar) {
        this.b = wz8Var;
        this.c = zz8Var;
        this.d = izsVar;
        this.e = rz8Var;
        this.f = l;
        this.g = nykVar;
        this.h = eai0Var;
        this.i = vxkVar;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        ksy ksyVar2 = ksyVar;
        int intValue = num.intValue();
        androidx.compose.runtime.a aVar2 = aVar;
        int intValue2 = num2.intValue();
        if ((intValue2 & 6) == 0) {
            i = (aVar2.J(ksyVar2) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= aVar2.o(intValue) ? 32 : 16;
        }
        if (aVar2.t(i & 1, (i & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(72599078, i, -1, "androidx.compose.material3.HorizontalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DatePicker.kt:1733)");
            }
            zz8 zz8Var = this.c;
            wz8 wz8Var = this.b;
            zz8 k = wz8Var.k(zz8Var, intValue);
            q630 a = ksyVar2.a(q630.a.a);
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
            lzk.i(k, this.d, this.e.e, this.f, null, null, this.g, this.h, this.i, wz8Var.a, aVar2, 221184);
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
