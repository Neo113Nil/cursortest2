package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: DateRangePicker.kt */
/* loaded from: classes11.dex */
public final class b1l implements zzs<ksy, Integer, androidx.compose.runtime.a, Integer, s3q0> {
    public final /* synthetic */ wz8 b;
    public final /* synthetic */ zz8 c;
    public final /* synthetic */ Long d;
    public final /* synthetic */ Long e;
    public final /* synthetic */ izs<Long, s3q0> f;
    public final /* synthetic */ rz8 g;
    public final /* synthetic */ nyk h;
    public final /* synthetic */ eai0 i;
    public final /* synthetic */ vxk j;
    public final /* synthetic */ List<fmk> k;

    /* JADX WARN: Multi-variable type inference failed */
    public b1l(wz8 wz8Var, zz8 zz8Var, Long l, Long l2, izs<? super Long, s3q0> izsVar, rz8 rz8Var, nyk nykVar, eai0 eai0Var, vxk vxkVar, List<fmk> list) {
        this.b = wz8Var;
        this.c = zz8Var;
        this.d = l;
        this.e = l2;
        this.f = izsVar;
        this.g = rz8Var;
        this.h = nykVar;
        this.i = eai0Var;
        this.j = vxkVar;
        this.k = list;
    }

    @Override // xsna.zzs
    public final s3q0 invoke(ksy ksyVar, Integer num, androidx.compose.runtime.a aVar, Integer num2) {
        int i;
        wz8 wz8Var;
        Long l;
        vxk vxkVar;
        cbi0 cbi0Var;
        Object obj;
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
                androidx.compose.runtime.b.f(682334170, i, -1, "androidx.compose.material3.VerticalMonthsList.<anonymous>.<anonymous>.<anonymous>.<anonymous> (DateRangePicker.kt:855)");
            }
            zz8 k = this.b.k(this.c, intValue);
            q630 a = ksyVar2.a(q630.a.a);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar2, 0);
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
            k9q0.w(aVar2, a2, cri.a.f);
            k9q0.w(aVar2, D, cri.a.e);
            cri.a.b bVar = cri.a.g;
            if (aVar2.L() || !epx.f(aVar2.x(), Integer.valueOf(m))) {
                kr.a(m, aVar2, m, bVar);
            }
            k9q0.w(aVar2, c, cri.a.d);
            nmo0 a3 = evp0.a(zzk.z, aVar2);
            nyk nykVar = this.h;
            wz8 wz8Var2 = this.b;
            List<fmk> list = this.k;
            vxk vxkVar2 = this.j;
            cjo0.a(a3, kai.c(-577031469, new a1l(nykVar, k, wz8Var2, list, vxkVar2), aVar2), aVar2, 48);
            Long l2 = this.d;
            Long l3 = this.e;
            if (l2 == null || l3 == null) {
                wz8Var = wz8Var2;
                l = l2;
                vxkVar = vxkVar2;
                aVar2.K(186488258);
                aVar2.j();
                cbi0Var = null;
            } else {
                aVar2.K(185956701);
                boolean J = aVar2.J(l2) | aVar2.J(l3);
                Object x = aVar2.x();
                if (J || x == a.C0011a.a) {
                    rz8 b = wz8Var2.b(l2.longValue());
                    l = l2;
                    rz8 b2 = wz8Var2.b(l3.longValue());
                    long j = b.e;
                    vxkVar = vxkVar2;
                    long j2 = k.f;
                    int i2 = k.d;
                    wz8Var = wz8Var2;
                    if (j <= j2) {
                        long j3 = b2.e;
                        long j4 = k.e;
                        if (j3 >= j4) {
                            boolean z = j >= j4;
                            boolean z2 = j3 <= j2;
                            int i3 = z ? (b.d + i2) - 1 : i2;
                            int i4 = (i2 + (z2 ? b2.d : k.c)) - 1;
                            obj = new cbi0(((i3 % 7) << 32) | ((i3 / 7) & 4294967295L), ((i4 % 7) << 32) | ((i4 / 7) & 4294967295L), z, z2);
                            aVar2.R(obj);
                        }
                    }
                    obj = null;
                    aVar2.R(obj);
                } else {
                    wz8Var = wz8Var2;
                    obj = x;
                    l = l2;
                    vxkVar = vxkVar2;
                }
                aVar2.j();
                cbi0Var = (cbi0) obj;
            }
            lzk.i(k, this.f, this.g.e, l, l3, cbi0Var, nykVar, this.i, vxkVar, wz8Var.a, aVar2, 0);
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
