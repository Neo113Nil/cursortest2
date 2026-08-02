package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.semantics.f;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public final /* synthetic */ class b4e implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ e4e b;

    public /* synthetic */ b4e(e4e e4eVar, int i) {
        this.a = i;
        this.b = e4eVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        o430 o430Var = did.a;
        final e4e e4eVar = this.b;
        final int i2 = 0;
        final int i3 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    uo5 uo5Var = x4c.y;
                    f530 d = hi91.d(ljs0.c, false, null, 3);
                    boolean k = btsVar.k(e4eVar);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new tls() { // from class: d4e
                            @Override // defpackage.tls
                            public final Object invoke(Object obj4) {
                                int i4 = i3;
                                zy11 zy11Var2 = zy11.a;
                                e4e e4eVar2 = e4eVar;
                                mnq0 mnq0Var = (mnq0) obj4;
                                switch (i4) {
                                    case 0:
                                        f.l(mnq0Var, e4eVar2.d.toString());
                                        f.p(mnq0Var, 0);
                                        break;
                                    default:
                                        f.l(mnq0Var, e4eVar2.e.toString());
                                        f.p(mnq0Var, 0);
                                        break;
                                }
                                return zy11Var2;
                            }
                        };
                        btsVar.o0(Q);
                    }
                    f530 b = fnq0.b(d, true, (tls) Q);
                    z910 d2 = pi6.d(uo5Var, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d3 = b.d(btsVar, b);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, d.f, d2);
                    qje.W(btsVar, d.e, o);
                    wls wlsVar = d.g;
                    if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                        b64.z(hashCode, btsVar, hashCode, wlsVar);
                    }
                    qje.W(btsVar, d.d, d3);
                    l330 l330Var = e4eVar.e;
                    if (l330Var instanceof k330) {
                        btsVar.e0(-1971866139);
                        ymb1.e(((k330) l330Var).a, null, ((el51) btsVar.m(gl51.a)).p(), null, lzr.E, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65514);
                        btsVar.t(false);
                    } else {
                        if (!(l330Var instanceof j330)) {
                            throw unr0.y(-2003273554, btsVar, false);
                        }
                        btsVar.e0(-1971564633);
                        zgb1.a(((j330) l330Var).a, null, 0, false, null, null, false, null, btsVar, 0, 254);
                        btsVar.t(false);
                    }
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            default:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    uo5 uo5Var2 = x4c.y;
                    f530 d4 = hi91.d(ljs0.c, false, null, 3);
                    boolean k2 = btsVar2.k(e4eVar);
                    Object Q2 = btsVar2.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new tls() { // from class: d4e
                            @Override // defpackage.tls
                            public final Object invoke(Object obj4) {
                                int i4 = i2;
                                zy11 zy11Var2 = zy11.a;
                                e4e e4eVar2 = e4eVar;
                                mnq0 mnq0Var = (mnq0) obj4;
                                switch (i4) {
                                    case 0:
                                        f.l(mnq0Var, e4eVar2.d.toString());
                                        f.p(mnq0Var, 0);
                                        break;
                                    default:
                                        f.l(mnq0Var, e4eVar2.e.toString());
                                        f.p(mnq0Var, 0);
                                        break;
                                }
                                return zy11Var2;
                            }
                        };
                        btsVar2.o0(Q2);
                    }
                    f530 b2 = fnq0.b(d4, true, (tls) Q2);
                    z910 d5 = pi6.d(uo5Var2, false);
                    int hashCode2 = Long.hashCode(btsVar2.T);
                    r1b0 o2 = btsVar2.o();
                    f530 d6 = b.d(btsVar2, b2);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar2.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar2.i0();
                    if (btsVar2.S) {
                        btsVar2.n(slsVar2);
                    } else {
                        btsVar2.r0();
                    }
                    qje.W(btsVar2, d.f, d5);
                    qje.W(btsVar2, d.e, o2);
                    wls wlsVar2 = d.g;
                    if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode2))) {
                        b64.z(hashCode2, btsVar2, hashCode2, wlsVar2);
                    }
                    qje.W(btsVar2, d.d, d6);
                    l330 l330Var2 = e4eVar.d;
                    if (l330Var2 instanceof k330) {
                        btsVar2.e0(-1438272826);
                        ymb1.e(((k330) l330Var2).a, null, ((el51) btsVar2.m(gl51.a)).q(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, 0, 0, 65530);
                        btsVar2.t(false);
                    } else {
                        if (!(l330Var2 instanceof j330)) {
                            throw unr0.y(1754717161, btsVar2, false);
                        }
                        btsVar2.e0(-1438026159);
                        zgb1.a(((j330) l330Var2).a, null, 0, false, null, null, false, null, btsVar2, 0, 254);
                        btsVar2.t(false);
                    }
                    btsVar2.t(true);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
        }
    }
}
