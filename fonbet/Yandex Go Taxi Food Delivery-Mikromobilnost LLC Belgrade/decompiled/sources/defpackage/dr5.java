package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.rida.bids.ui.c;
import com.yandex.go.superapp.web.view.a;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class dr5 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ dr5(as5 as5Var, tx40 tx40Var, wg6 wg6Var, tls tlsVar) {
        this.a = 0;
        this.c = as5Var;
        this.w = tx40Var;
        this.x = wg6Var;
        this.b = tlsVar;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        nc3 nc3Var;
        boolean z;
        c8a c8aVar;
        int i = this.a;
        int i2 = 15;
        int i3 = 2;
        g43 g43Var = lr20.c;
        c530 c530Var = c530.a;
        tls tlsVar = this.b;
        o430 o430Var = did.a;
        zy11 zy11Var = zy11.a;
        Object obj5 = this.x;
        Object obj6 = this.w;
        Object obj7 = this.c;
        switch (i) {
            case 0:
                as5 as5Var = (as5) obj7;
                tx40 tx40Var = (tx40) obj6;
                wg6 wg6Var = (wg6) obj5;
                j690 j690Var = (j690) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 145) != 144)) {
                    f530 j = an91.j(ljs0.c, j690Var);
                    sic a = qic.a(g43Var, x4c.G, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, j);
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
                    qje.W(btsVar, d.f, a);
                    qje.W(btsVar, d.e, o);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d);
                    gq5 gq5Var = as5Var.a;
                    boolean z2 = as5Var.c;
                    tls tlsVar2 = this.b;
                    c.c(gq5Var, z2, tx40Var, wg6Var, null, tlsVar2, btsVar, 384);
                    sq5.e(as5Var.b, wg6Var, as5Var.c, null, tlsVar2, btsVar, 0);
                    btsVar.t(true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                sls slsVar2 = (sls) obj7;
                tls tlsVar3 = (tls) obj6;
                a aVar = (a) obj5;
                xh0 xh0Var = (xh0) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= (intValue2 & 64) == 0 ? ((bts) fidVar2).k(xh0Var) : fidVar2.e(xh0Var) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 145) != 144)) {
                    btsVar2.Y();
                } else if (xh0Var instanceof sh0) {
                    btsVar2.e0(-874375279);
                    j76.a((sh0) xh0Var, btsVar2, (intValue2 >> 3) & 14);
                    btsVar2.t(false);
                } else {
                    boolean z3 = xh0Var instanceof nh0;
                    tls tlsVar4 = this.b;
                    if (z3) {
                        btsVar2.e0(-874256053);
                        fh4.a((nh0) xh0Var, tlsVar4, btsVar2, (intValue2 >> 3) & 14);
                        btsVar2.t(false);
                    } else if (xh0Var instanceof mh0) {
                        btsVar2.e0(-874128922);
                        com.yandex.go.payments.addmethod.ui.home.d.b((mh0) xh0Var, tlsVar4, btsVar2, (intValue2 >> 3) & 14);
                        btsVar2.t(false);
                    } else {
                        if (!(xh0Var instanceof ph0)) {
                            throw unr0.y(-859491164, btsVar2, false);
                        }
                        btsVar2.e0(-873979657);
                        com.yandex.go.payments.addmethod.ui.home.d.d((ph0) xh0Var, tlsVar4, slsVar2, tlsVar3, aVar, btsVar2, (intValue2 >> 3) & 14, 0);
                        btsVar2.t(false);
                    }
                }
                return zy11Var;
            case 2:
                List list = (List) obj7;
                sls slsVar3 = (sls) obj6;
                String str = (String) obj5;
                ib11 ib11Var = (ib11) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                sic a2 = qic.a(g43Var, x4c.G, fidVar3, 0);
                bts btsVar3 = (bts) fidVar3;
                int hashCode2 = Long.hashCode(btsVar3.T);
                r1b0 o2 = btsVar3.o();
                c530 c530Var2 = c530.a;
                f530 d2 = b.d(fidVar3, c530Var2);
                ohd.G1.getClass();
                sls slsVar4 = d.b;
                bts btsVar4 = (bts) fidVar3;
                if (btsVar4.a == null) {
                    cma1.b0();
                    throw null;
                }
                btsVar4.i0();
                if (btsVar4.S) {
                    btsVar4.n(slsVar4);
                } else {
                    btsVar4.r0();
                }
                wls wlsVar = d.f;
                qje.W(fidVar3, wlsVar, a2);
                wls wlsVar2 = d.e;
                qje.W(fidVar3, wlsVar2, o2);
                Integer valueOf = Integer.valueOf(hashCode2);
                wls wlsVar3 = d.g;
                qje.W(fidVar3, wlsVar3, valueOf);
                tls tlsVar5 = d.h;
                qje.M(fidVar3, tlsVar5);
                wls wlsVar4 = d.d;
                qje.W(fidVar3, wlsVar4, d2);
                lhl0 a3 = khl0.a(lr20.a, x4c.E, fidVar3, 48);
                int hashCode3 = Long.hashCode(btsVar4.T);
                r1b0 o3 = btsVar4.o();
                f530 d3 = b.d(fidVar3, c530Var2);
                btsVar4.i0();
                if (btsVar4.S) {
                    btsVar4.n(slsVar4);
                } else {
                    btsVar4.r0();
                }
                qje.W(fidVar3, wlsVar, a3);
                qje.W(fidVar3, wlsVar2, o3);
                qje.W(fidVar3, wlsVar3, Integer.valueOf(hashCode3));
                qje.M(fidVar3, tlsVar5);
                qje.W(fidVar3, wlsVar4, d3);
                boolean k = btsVar4.k(tlsVar) | fidVar3.e(ib11Var);
                Object Q = btsVar4.Q();
                if (k || Q == o430Var) {
                    Q = new ej5(tlsVar, ib11Var, 0);
                    btsVar4.o0(Q);
                }
                ptb1.b(ib11Var, true, null, (sls) Q, true, null, null, null, null, null, fidVar3, ((intValue3 >> 3) & 14) | 24624, 996);
                if (list.size() != 1 || slsVar3 == null) {
                    btsVar4.e0(46380671);
                    btsVar4.t(false);
                } else {
                    btsVar4.e0(46263429);
                    oeb1.c(fidVar3, ljs0.q(c530Var2, 4.0f));
                    q5b1.h(str, slsVar3, fidVar3, 0);
                    btsVar4.t(false);
                }
                btsVar4.t(true);
                jra1.f(48, 4, fidVar3, an91.o(c530Var2, 0.0f, 4.0f, 0.0f, 0.0f, 13), ib11Var.l, false);
                btsVar4.t(true);
                return zy11Var;
            case 3:
                qm5 qm5Var = (qm5) obj7;
                oz40 oz40Var = (oz40) obj6;
                oz40 oz40Var2 = (oz40) obj5;
                fid fidVar4 = (fid) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                bts btsVar5 = (bts) fidVar4;
                if (btsVar5.V(intValue4 & 1, (intValue4 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    f530 o4 = an91.o(i9a1.c(bzk0.c(c530Var, AppColor$Palette.Background, qke.q)), 0.0f, 20.0f, 0.0f, 0.0f, 13);
                    boolean k2 = btsVar5.k(tlsVar);
                    Object Q2 = btsVar5.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new gm5(0, tlsVar);
                        btsVar5.o0(Q2);
                    }
                    f530 e = v0a1.e(o4, (tls) Q2);
                    String str2 = (String) oz40Var.getValue();
                    boolean k3 = btsVar5.k(tlsVar);
                    Object Q3 = btsVar5.Q();
                    if (k3 || Q3 == o430Var) {
                        Q3 = new d0(tlsVar, oz40Var, 1);
                        btsVar5.o0(Q3);
                    }
                    tls tlsVar6 = (tls) Q3;
                    boolean k4 = btsVar5.k(tlsVar);
                    Object Q4 = btsVar5.Q();
                    if (k4 || Q4 == o430Var) {
                        Q4 = new d0(tlsVar, oz40Var2, i3);
                        btsVar5.o0(Q4);
                    }
                    com.yandex.go.benefits_center.activation.ui.a.a(e, qm5Var, str2, tlsVar6, (tls) Q4, btsVar5, 0);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 4:
                paa paaVar = (paa) obj7;
                wg6 wg6Var2 = (wg6) obj5;
                lx40 lx40Var = (lx40) obj6;
                j690 j690Var2 = (j690) obj2;
                fid fidVar5 = (fid) obj3;
                int intValue5 = ((Integer) obj4).intValue();
                if ((intValue5 & 48) == 0) {
                    intValue5 |= ((bts) fidVar5).k(j690Var2) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar5;
                boolean V = btsVar6.V(intValue5 & 1, (intValue5 & 145) != 144);
                dmw0 dmw0Var = btsVar6.a;
                if (V) {
                    oaa oaaVar = paaVar instanceof oaa ? (oaa) paaVar : null;
                    nc3 b = com.yandex.go.chargers.offer.ui.compose.ui.component.a.b((oaaVar == null || (c8aVar = oaaVar.d) == null) ? null : c8aVar.f, btsVar6);
                    f530 c = ljs0.c(c530Var, 1.0f);
                    uo5 uo5Var = x4c.b;
                    z910 d4 = pi6.d(uo5Var, false);
                    int hashCode4 = Long.hashCode(btsVar6.T);
                    r1b0 o5 = btsVar6.o();
                    f530 d5 = b.d(btsVar6, c);
                    ohd.G1.getClass();
                    sls slsVar5 = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar5);
                    } else {
                        btsVar6.r0();
                    }
                    wls wlsVar5 = d.f;
                    qje.W(btsVar6, wlsVar5, d4);
                    wls wlsVar6 = d.e;
                    qje.W(btsVar6, wlsVar6, o5);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    wls wlsVar7 = d.g;
                    qje.W(btsVar6, wlsVar7, valueOf2);
                    tls tlsVar7 = d.h;
                    qje.M(btsVar6, tlsVar7);
                    wls wlsVar8 = d.d;
                    qje.W(btsVar6, wlsVar8, d5);
                    vr60 vr60Var = b.a;
                    tls tlsVar8 = this.b;
                    if (vr60Var == null) {
                        btsVar6.e0(-2047214538);
                        z = false;
                        btsVar6.t(false);
                        nc3Var = b;
                    } else {
                        nc3Var = b;
                        btsVar6.e0(-2047214537);
                        boolean k5 = btsVar6.k(tlsVar8) | btsVar6.e(oaaVar);
                        Object Q5 = btsVar6.Q();
                        if (k5 || Q5 == o430Var) {
                            Q5 = new cs8(15, tlsVar8, oaaVar);
                            btsVar6.o0(Q5);
                        }
                        com.yandex.go.chargers.offer.ui.compose.ui.component.a.a(vr60Var, (tls) Q5, btsVar6, 48);
                        z = false;
                        btsVar6.t(false);
                    }
                    f530 d6 = ooc.d(ljs0.c(an91.j(c530Var, j690Var2), 1.0f), null, 3);
                    z910 d7 = pi6.d(uo5Var, z);
                    int hashCode5 = Long.hashCode(btsVar6.T);
                    r1b0 o6 = btsVar6.o();
                    f530 d8 = b.d(btsVar6, d6);
                    btsVar6.i0();
                    if (btsVar6.S) {
                        btsVar6.n(slsVar5);
                    } else {
                        btsVar6.r0();
                    }
                    qje.W(btsVar6, wlsVar5, d7);
                    qje.W(btsVar6, wlsVar6, o6);
                    vfc.v(hashCode5, btsVar6, wlsVar7, btsVar6, tlsVar7);
                    qje.W(btsVar6, wlsVar8, d8);
                    com.yandex.go.chargers.offer.ui.compose.ui.a.c(c6a1.p(wg6Var2, lx40Var), paaVar, nc3Var, tlsVar8, btsVar6, 0);
                    btsVar6.t(true);
                    btsVar6.t(true);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 5:
                oip0 oip0Var = (oip0) obj7;
                ahj0 ahj0Var = (ahj0) obj6;
                oz40 oz40Var3 = (oz40) obj5;
                j690 j690Var3 = (j690) obj2;
                fid fidVar6 = (fid) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                if ((intValue6 & 48) == 0) {
                    intValue6 |= ((bts) fidVar6).k(j690Var3) ? 32 : 16;
                }
                int i4 = intValue6;
                bts btsVar7 = (bts) fidVar6;
                if (btsVar7.V(i4 & 1, (i4 & 145) != 144)) {
                    f530 o7 = an91.o(an91.j(pw91.u(c530Var, oip0Var, 14), j690Var3), 0.0f, 16.0f, 0.0f, 0.0f, 13);
                    sic a4 = qic.a(g43Var, x4c.G, btsVar7, 0);
                    int hashCode6 = Long.hashCode(btsVar7.T);
                    r1b0 o8 = btsVar7.o();
                    f530 d9 = b.d(btsVar7, o7);
                    ohd.G1.getClass();
                    sls slsVar6 = d.b;
                    if (btsVar7.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar7.i0();
                    if (btsVar7.S) {
                        btsVar7.n(slsVar6);
                    } else {
                        btsVar7.r0();
                    }
                    qje.W(btsVar7, d.f, a4);
                    qje.W(btsVar7, d.e, o8);
                    qje.W(btsVar7, d.g, Integer.valueOf(hashCode6));
                    qje.M(btsVar7, d.h);
                    qje.W(btsVar7, d.d, d9);
                    f530 m = an91.m(i6b1.b(c530Var), 8.0f, 0.0f, 2);
                    String str3 = (String) oz40Var3.getValue();
                    String str4 = ahj0Var.a.c;
                    Object Q6 = btsVar7.Q();
                    if (Q6 == o430Var) {
                        Q6 = new ttm(i2, oz40Var3);
                        btsVar7.o0(Q6);
                    }
                    heb1.b(str3, (tls) Q6, m, false, null, null, null, null, str4, null, null, null, null, null, null, false, null, 0.0f, null, null, null, null, false, 0, 0, null, null, null, null, null, null, btsVar7, 432, 0, 0, 0, 2147483128, 1);
                    f530 c2 = ljs0.c(an91.o(an91.k(c530Var, 8.0f), 0.0f, 8.0f, 0.0f, 0.0f, 13), 1.0f);
                    boolean k6 = btsVar7.k(tlsVar) | btsVar7.k(ahj0Var);
                    Object Q7 = btsVar7.Q();
                    if (k6 || Q7 == o430Var) {
                        Q7 = new kqe0(9, tlsVar, ahj0Var, oz40Var3);
                        btsVar7.o0(Q7);
                    }
                    vad.a.getClass();
                    ohb1.b(c2, false, null, (sls) Q7, vad.b, btsVar7, 24582, 6);
                    btsVar7.t(true);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            case 6:
                List list2 = (List) obj7;
                nmq0 nmq0Var = (nmq0) obj6;
                tls tlsVar9 = (tls) obj5;
                int intValue7 = ((Integer) obj2).intValue();
                fid fidVar7 = (fid) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                if ((intValue8 & 48) == 0) {
                    intValue8 |= fidVar7.c(intValue7) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar7;
                if (btsVar8.V(intValue8 & 1, (intValue8 & 145) != 144)) {
                    tkb1.a((vnx0) nmq0Var.b.get(((xj31) list2.get(intValue7)).getId()), null, this.b, tlsVar9, btsVar8, 0, 2);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
            default:
                androidx.compose.foundation.lazy.b bVar = (androidx.compose.foundation.lazy.b) obj7;
                psr0 psr0Var = (psr0) obj6;
                oz40 oz40Var4 = (oz40) obj5;
                j690 j690Var4 = (j690) obj2;
                fid fidVar8 = (fid) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                if ((intValue9 & 48) == 0) {
                    intValue9 |= ((bts) fidVar8).k(j690Var4) ? 32 : 16;
                }
                bts btsVar9 = (bts) fidVar8;
                if (btsVar9.V(intValue9 & 1, (intValue9 & 145) != 144)) {
                    f530 c3 = ljs0.c(c530Var, 1.0f);
                    boolean k7 = btsVar9.k(bVar);
                    Object Q8 = btsVar9.Q();
                    if (k7 || Q8 == o430Var) {
                        Q8 = new m4b0(bVar, oz40Var4, 1);
                        btsVar9.o0(Q8);
                    }
                    f530 y = eja1.y(c3, (tls) Q8);
                    i43 i43Var = new i43(8.0f, true, new quz(11));
                    boolean k8 = btsVar9.k(psr0Var) | btsVar9.k(tlsVar);
                    Object Q9 = btsVar9.Q();
                    if (k8 || Q9 == o430Var) {
                        Q9 = new lxo0(13, psr0Var, tlsVar, oz40Var4);
                        btsVar9.o0(Q9);
                    }
                    adb1.a(y, bVar, j690Var4, i43Var, null, null, false, null, (tls) Q9, btsVar9, ((intValue9 << 3) & 896) | HProv.ALG_CLASS_DATA_ENCRYPT, 488);
                } else {
                    btsVar9.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ dr5(paa paaVar, tls tlsVar, wg6 wg6Var, lx40 lx40Var) {
        this.a = 4;
        this.c = paaVar;
        this.b = tlsVar;
        this.x = wg6Var;
        this.w = lx40Var;
    }

    public /* synthetic */ dr5(tls tlsVar, Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = tlsVar;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
    }

    public /* synthetic */ dr5(Object obj, Object obj2, tls tlsVar, Object obj3, int i) {
        this.a = i;
        this.c = obj;
        this.w = obj2;
        this.b = tlsVar;
        this.x = obj3;
    }
}
