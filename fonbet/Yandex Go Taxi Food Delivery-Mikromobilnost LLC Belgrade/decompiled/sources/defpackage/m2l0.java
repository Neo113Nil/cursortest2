package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes13.dex */
public final /* synthetic */ class m2l0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ w2l0 b;
    public final /* synthetic */ tls c;

    public /* synthetic */ m2l0(w2l0 w2l0Var, tls tlsVar, int i) {
        this.a = i;
        this.b = w2l0Var;
        this.c = tlsVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.c;
        int i2 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    rzo.b(null, "default", wwg.S(233081459, true, new q2l0(this.b, tlsVar, i2), btsVar), btsVar, 3456, 3);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    f530 c = bzk0.c(ljs0.c(c530.a, 1.0f), AppColor$Palette.BgMinor, qke.q);
                    sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o = btsVar2.o();
                    f530 d = b.d(btsVar2, c);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, a);
                    qje.W(btsVar2, d.e, o);
                    qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar2, d.h);
                    qje.W(btsVar2, d.d, d);
                    boolean k = btsVar2.k(tlsVar);
                    Object Q = btsVar2.Q();
                    o430 o430Var = did.a;
                    if (k || Q == o430Var) {
                        Q = new gv40(24, tlsVar);
                        btsVar2.o0(Q);
                    }
                    tls tlsVar2 = (tls) Q;
                    boolean k2 = btsVar2.k(tlsVar);
                    Object Q2 = btsVar2.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new v6k0(10, tlsVar);
                        btsVar2.o0(Q2);
                    }
                    sls slsVar2 = (sls) Q2;
                    boolean k3 = btsVar2.k(tlsVar);
                    Object Q3 = btsVar2.Q();
                    if (k3 || Q3 == o430Var) {
                        Q3 = new v6k0(13, tlsVar);
                        btsVar2.o0(Q3);
                    }
                    w2l0 w2l0Var = this.b;
                    ut91.i(w2l0Var, tlsVar2, slsVar2, (sls) Q3, btsVar2, 0);
                    w2l0Var.getClass();
                    ut91.j(btsVar2, 0);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }
}
