package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes11.dex */
public final /* synthetic */ class bhj0 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ nhj0 c;

    public /* synthetic */ bhj0(tls tlsVar, nhj0 nhj0Var, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = nhj0Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        nhj0 nhj0Var = this.c;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                int i2 = 1;
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    ocb1.a(c530.a, false, null, false, false, wwg.S(-1169090639, true, new bhj0(tlsVar, nhj0Var, i2), btsVar), 0.0f, 0, null, btsVar, 196614, 990);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                boolean V = btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16);
                dmw0 dmw0Var = btsVar2.a;
                if (V) {
                    c530 c530Var = c530.a;
                    f530 o = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    sic a = qic.a(lr20.c, x4c.H, btsVar2, 48);
                    int hashCode = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    f530 d = b.d(btsVar2, o);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar2, wlsVar, a);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar2, wlsVar2, o2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar2, wlsVar3, valueOf);
                    tls tlsVar2 = d.h;
                    qje.M(btsVar2, tlsVar2);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar2, wlsVar4, d);
                    lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar2, 48);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o3 = btsVar2.o();
                    f530 d2 = b.d(btsVar2, c530Var);
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, wlsVar, a2);
                    qje.W(btsVar2, wlsVar2, o3);
                    vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar2);
                    qje.W(btsVar2, wlsVar4, d2);
                    v0b1.a(mja1.a(nhj0Var.e, null, 6), null, null, null, null, null, null, null, 0.0f, 0, btsVar2, 0, 1022);
                    jeb1.f(nhj0Var.d, an91.o(c530Var, 6.0f, 0.0f, 0.0f, 0.0f, 14), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).h.a, btsVar2, 48, 0, 16380);
                    btsVar2.t(true);
                    f530 c = ljs0.c(an91.o(an91.k(c530Var, 8.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f);
                    boolean k = btsVar2.k(tlsVar);
                    Object Q = btsVar2.Q();
                    if (k || Q == did.a) {
                        Q = new ukb0(28, tlsVar);
                        btsVar2.o0(Q);
                    }
                    ohb1.b(c, false, null, (sls) Q, wwg.S(368363034, true, new pdf0(7, nhj0Var), btsVar2), btsVar2, 24582, 6);
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }
}
