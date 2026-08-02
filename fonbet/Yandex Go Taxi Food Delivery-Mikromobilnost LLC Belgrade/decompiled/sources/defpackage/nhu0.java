package defpackage;

import androidx.compose.foundation.layout.IntrinsicSize;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import com.yandex.go.masstransit.sdk.checkout.impl.uicomponents.ModalTitleSize;
import com.yandex.go.summary.ui.compose.common.animation.c;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;

/* loaded from: classes11.dex */
public final /* synthetic */ class nhu0 implements bms {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nhu0(tls tlsVar, nvz0 nvz0Var) {
        this.a = 2;
        this.c = tlsVar;
        this.b = nvz0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        Object obj5;
        int i = this.a;
        int i2 = 8;
        int i3 = 3;
        o430 o430Var = did.a;
        g43 g43Var = lr20.c;
        int i4 = 14;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        Object obj6 = this.c;
        Object obj7 = this.b;
        switch (i) {
            case 0:
                rhu0 rhu0Var = (rhu0) obj7;
                tls tlsVar = (tls) obj6;
                j690 j690Var = (j690) obj2;
                fid fidVar = (fid) obj3;
                int intValue = ((Integer) obj4).intValue();
                if ((intValue & 48) == 0) {
                    intValue |= ((bts) fidVar).k(j690Var) ? 32 : 16;
                }
                bts btsVar = (bts) fidVar;
                boolean V = btsVar.V(intValue & 1, (intValue & 145) != 144);
                dmw0 dmw0Var = btsVar.a;
                if (V) {
                    f530 o = an91.o(an91.j(c530Var, j690Var), 0.0f, 0.0f, 0.0f, 12.0f, 7);
                    so5 so5Var = x4c.G;
                    sic a = qic.a(g43Var, so5Var, btsVar, 0);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d = b.d(btsVar, o);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (dmw0Var == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    wls wlsVar = d.f;
                    qje.W(btsVar, wlsVar, a);
                    wls wlsVar2 = d.e;
                    qje.W(btsVar, wlsVar2, o2);
                    Integer valueOf = Integer.valueOf(hashCode);
                    wls wlsVar3 = d.g;
                    qje.W(btsVar, wlsVar3, valueOf);
                    tls tlsVar2 = d.h;
                    qje.M(btsVar, tlsVar2);
                    wls wlsVar4 = d.d;
                    qje.W(btsVar, wlsVar4, d);
                    CharSequence charSequence = rhu0Var.a;
                    List list = rhu0Var.b;
                    if (charSequence == null) {
                        btsVar.e0(-367115412);
                        btsVar.t(false);
                    } else {
                        btsVar.e0(-367115411);
                        unb1.a(null, charSequence, ModalTitleSize.L, btsVar, 384, 1);
                        btsVar.t(false);
                    }
                    f530 u = pw91.u(c530Var, pw91.o(btsVar), 14);
                    sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
                    int hashCode2 = Long.hashCode(btsVar.T);
                    r1b0 o3 = btsVar.o();
                    f530 d2 = b.d(btsVar, u);
                    btsVar.i0();
                    if (btsVar.S) {
                        btsVar.n(slsVar);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar, a2);
                    qje.W(btsVar, wlsVar2, o3);
                    vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
                    qje.W(btsVar, wlsVar4, d2);
                    btsVar.e0(-605436634);
                    int i5 = 0;
                    for (Object obj8 : list) {
                        int i6 = i5 + 1;
                        if (i5 < 0) {
                            scc.m();
                            throw null;
                        }
                        lhu0 lhu0Var = (lhu0) obj8;
                        if (lhu0Var instanceof egu0) {
                            btsVar.e0(-1595862268);
                            ogb1.a((egu0) lhu0Var, tlsVar, i5 != scc.f(list), btsVar, 0);
                            btsVar.t(false);
                        } else {
                            if (!(lhu0Var instanceof viu0)) {
                                throw unr0.y(-2129690875, btsVar, false);
                            }
                            btsVar.e0(-1595614051);
                            sgb1.a((viu0) lhu0Var, tlsVar, i5 != scc.f(list), btsVar, 0);
                            btsVar.t(false);
                        }
                        i5 = i6;
                    }
                    tse0.t(btsVar, false, true, true);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 1:
                BodyAlign bodyAlign = (BodyAlign) obj7;
                AppColor$Palette appColor$Palette = (AppColor$Palette) obj6;
                CharSequence charSequence2 = (CharSequence) obj2;
                fid fidVar2 = (fid) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= (intValue2 & 64) == 0 ? ((bts) fidVar2).k(charSequence2) : fidVar2.e(charSequence2) ? 32 : 16;
                }
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 145) != 144)) {
                    qgy.b(charSequence2, null, an91.o(c530.a, 0.0f, 2.0f, 0.0f, 0.0f, 13), appColor$Palette, 0L, 0L, new sjy0(bodyAlign.getTextAlign()), 0L, 2, 1, 0, xya1.e(btsVar2).h.a, null, btsVar2, ((intValue2 >> 3) & 14) | 805306752, 3078, 2418);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 2:
                tls tlsVar3 = (tls) obj6;
                nvz0 nvz0Var = (nvz0) obj7;
                final quz0 quz0Var = (quz0) obj2;
                fid fidVar3 = (fid) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                if ((intValue3 & 48) == 0) {
                    intValue3 |= ((bts) fidVar3).k(quz0Var) ? 32 : 16;
                }
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 145) != 144)) {
                    long n = tje.n(quz0Var.a, btsVar3);
                    puz0 puz0Var = quz0Var.g;
                    boolean z2 = puz0Var != null;
                    boolean k = ((intValue3 & 112) == 32) | btsVar3.k(tlsVar3);
                    Object Q = btsVar3.Q();
                    if (k || Q == o430Var) {
                        Q = new rmy0(i4, quz0Var, tlsVar3);
                        btsVar3.o0(Q);
                    }
                    zpn.a(zy11Var, (tls) Q, btsVar3);
                    Object Q2 = btsVar3.Q();
                    if (Q2 == o430Var) {
                        Q2 = new teb(20);
                        btsVar3.o0(Q2);
                    }
                    f530 d3 = fj91.d(fnq0.a(c530Var, (tls) Q2), IntrinsicSize.Max);
                    boolean a3 = btsVar3.a(z2) | btsVar3.k(tlsVar3) | btsVar3.e(puz0Var);
                    Object Q3 = btsVar3.Q();
                    if (a3 || Q3 == o430Var) {
                        Q3 = new ex0(z2, tlsVar3, puz0Var, 19);
                        btsVar3.o0(Q3);
                    }
                    f530 a4 = vmb1.a(d3, z2, null, (sls) Q3, 30);
                    boolean d4 = btsVar3.d(n) | btsVar3.k(nvz0Var);
                    Object Q4 = btsVar3.Q();
                    if (d4 || Q4 == o430Var) {
                        Q4 = new j5y(n, nvz0Var, i2);
                        btsVar3.o0(Q4);
                    }
                    f530 g = bb1.g(a4, (tls) Q4);
                    boolean k2 = btsVar3.k(nvz0Var);
                    Object Q5 = btsVar3.Q();
                    if (k2 || Q5 == o430Var) {
                        Q5 = new jvx0(12, nvz0Var);
                        btsVar3.o0(Q5);
                    }
                    f530 F = kp50.F(g, (zls) Q5);
                    SlotSize slotSize = SlotSize.XS;
                    final int i7 = r15 ? 1 : 0;
                    final int i8 = 1;
                    ydb1.a(F, null, wwg.S(-1884612202, true, new zls() { // from class: guz0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj9, Object obj10, Object obj11) {
                            int i9 = i7;
                            zy11 zy11Var2 = zy11.a;
                            quz0 quz0Var2 = quz0Var;
                            switch (i9) {
                                case 0:
                                    ebp0 ebp0Var = (ebp0) obj9;
                                    fid fidVar4 = (fid) obj10;
                                    int intValue4 = ((Integer) obj11).intValue();
                                    if ((intValue4 & 6) == 0) {
                                        intValue4 |= ((bts) fidVar4).k(ebp0Var) ? 4 : 2;
                                    }
                                    bts btsVar4 = (bts) fidVar4;
                                    if (!btsVar4.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        huz0.a(ebp0Var, quz0Var2.c, null, btsVar4, intValue4 & 14);
                                        break;
                                    }
                                default:
                                    ibp0 ibp0Var = (ibp0) obj9;
                                    fid fidVar5 = (fid) obj10;
                                    int intValue5 = ((Integer) obj11).intValue();
                                    if ((intValue5 & 6) == 0) {
                                        intValue5 |= ((bts) fidVar5).k(ibp0Var) ? 4 : 2;
                                    }
                                    bts btsVar5 = (bts) fidVar5;
                                    if (!btsVar5.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                        btsVar5.Y();
                                        break;
                                    } else {
                                        huz0.c(ibp0Var, quz0Var2.d, null, btsVar5, intValue5 & 14);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar3), null, wwg.S(1409451600, true, new zls() { // from class: guz0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj9, Object obj10, Object obj11) {
                            int i9 = i8;
                            zy11 zy11Var2 = zy11.a;
                            quz0 quz0Var2 = quz0Var;
                            switch (i9) {
                                case 0:
                                    ebp0 ebp0Var = (ebp0) obj9;
                                    fid fidVar4 = (fid) obj10;
                                    int intValue4 = ((Integer) obj11).intValue();
                                    if ((intValue4 & 6) == 0) {
                                        intValue4 |= ((bts) fidVar4).k(ebp0Var) ? 4 : 2;
                                    }
                                    bts btsVar4 = (bts) fidVar4;
                                    if (!btsVar4.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        huz0.a(ebp0Var, quz0Var2.c, null, btsVar4, intValue4 & 14);
                                        break;
                                    }
                                default:
                                    ibp0 ibp0Var = (ibp0) obj9;
                                    fid fidVar5 = (fid) obj10;
                                    int intValue5 = ((Integer) obj11).intValue();
                                    if ((intValue5 & 6) == 0) {
                                        intValue5 |= ((bts) fidVar5).k(ibp0Var) ? 4 : 2;
                                    }
                                    bts btsVar5 = (bts) fidVar5;
                                    if (!btsVar5.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                        btsVar5.Y();
                                        break;
                                    } else {
                                        huz0.c(ibp0Var, quz0Var2.d, null, btsVar5, intValue5 & 14);
                                        break;
                                    }
                            }
                            return zy11Var2;
                        }
                    }, btsVar3), null, slotSize, false, btsVar3, 1597824, MSException.ERROR_BUSY);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 3:
                id01 id01Var = (id01) obj7;
                tls tlsVar4 = (tls) obj6;
                j690 j690Var2 = (j690) obj2;
                fid fidVar4 = (fid) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= ((bts) fidVar4).k(j690Var2) ? 32 : 16;
                }
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 145) != 144)) {
                    f530 o4 = an91.o(an91.j(c530Var, j690Var2), 0.0f, 0.0f, 0.0f, 4.0f, 7);
                    sic a5 = qic.a(g43Var, x4c.G, btsVar4, 0);
                    int hashCode3 = Long.hashCode(btsVar4.T);
                    r1b0 o5 = btsVar4.o();
                    f530 d5 = b.d(btsVar4, o4);
                    ohd.G1.getClass();
                    sls slsVar2 = d.b;
                    if (btsVar4.a == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar4.i0();
                    if (btsVar4.S) {
                        btsVar4.n(slsVar2);
                    } else {
                        btsVar4.r0();
                    }
                    qje.W(btsVar4, d.f, a5);
                    qje.W(btsVar4, d.e, o5);
                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode3));
                    qje.M(btsVar4, d.h);
                    qje.W(btsVar4, d.d, d5);
                    id01Var.getClass();
                    btsVar4.e0(-485809188);
                    btsVar4.t(false);
                    fsb1.a(0, btsVar4, tlsVar4, null, id01Var.a);
                    btsVar4.t(true);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
            case 4:
                vzu vzuVar = (vzu) obj7;
                tls tlsVar5 = (tls) obj6;
                int intValue5 = ((Integer) obj2).intValue();
                fid fidVar5 = (fid) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                if ((intValue6 & 48) == 0) {
                    intValue6 |= fidVar5.c(intValue5) ? 32 : 16;
                }
                bts btsVar5 = (bts) fidVar5;
                if (btsVar5.V(intValue6 & 1, (intValue6 & 145) != 144)) {
                    kt60 kt60Var = (kt60) vzuVar.b.get(intValue5);
                    boolean k3 = ((intValue6 & 112) == 32) | btsVar5.k(vzuVar);
                    Object Q6 = btsVar5.Q();
                    if (k3 || Q6 == o430Var) {
                        z = true;
                        zc31 zc31Var = new zc31(intValue5, vzuVar, true ? 1 : 0);
                        btsVar5.o0(zc31Var);
                        obj5 = zc31Var;
                    } else {
                        z = true;
                        obj5 = Q6;
                    }
                    f530 b = fnq0.b(c530Var, z, (tls) obj5);
                    boolean k4 = btsVar5.k(kt60Var) | btsVar5.k(tlsVar5);
                    Object Q7 = btsVar5.Q();
                    Object obj9 = Q7;
                    if (k4 || Q7 == o430Var) {
                        zr01 zr01Var = new zr01(28, kt60Var, tlsVar5);
                        btsVar5.o0(zr01Var);
                        obj9 = zr01Var;
                    }
                    a8a1.g(b, kt60Var, (sls) obj9, btsVar5, 0);
                } else {
                    btsVar5.Y();
                }
                return zy11Var;
            case 5:
                fg31 fg31Var = (fg31) obj7;
                tls tlsVar6 = (tls) obj6;
                fg31 fg31Var2 = (fg31) obj2;
                fid fidVar6 = (fid) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                if ((intValue7 & 48) == 0) {
                    intValue7 |= ((bts) fidVar6).k(fg31Var2) ? 32 : 16;
                }
                bts btsVar6 = (bts) fidVar6;
                if (btsVar6.V(intValue7 & 1, (intValue7 & 145) != 144)) {
                    bpl0 bpl0Var = fg31Var2.b;
                    androidx.compose.foundation.lazy.b a6 = a7y.a(0, 3, btsVar6);
                    jjp0 jjp0Var = fg31Var.d;
                    int i9 = fg31Var.a;
                    if (jjp0Var instanceof ijp0) {
                        btsVar6.e0(-810831984);
                        c.a(a6, i9, 0.0f, btsVar6, 0);
                        btsVar6.t(false);
                    } else {
                        if (!(jjp0Var instanceof hjp0)) {
                            throw unr0.y(-810835446, btsVar6, false);
                        }
                        btsVar6.e0(-810824602);
                        c.b(a6, i9, 0.0f, btsVar6, 0);
                        btsVar6.t(false);
                    }
                    f530 c = ljs0.c(c530Var, 1.0f);
                    boolean k5 = btsVar6.k(bpl0Var);
                    Object Q8 = btsVar6.Q();
                    Object obj10 = Q8;
                    if (k5 || Q8 == o430Var) {
                        uzr uzrVar = new uzr(i3, bpl0Var);
                        btsVar6.o0(uzrVar);
                        obj10 = uzrVar;
                    }
                    f530 b2 = fnq0.b(c, false, (tls) obj10);
                    l690 d6 = an91.d(16.0f, 8.0f, 16.0f, 0.0f, 8);
                    boolean k6 = btsVar6.k(bpl0Var) | btsVar6.k(tlsVar6);
                    Object Q9 = btsVar6.Q();
                    Object obj11 = Q9;
                    if (k6 || Q9 == o430Var) {
                        kej0 kej0Var = new kej0(2, tlsVar6, bpl0Var);
                        btsVar6.o0(kej0Var);
                        obj11 = kej0Var;
                    }
                    adb1.b(b2, a6, d6, null, null, null, false, null, (tls) obj11, btsVar6, 0, 504);
                } else {
                    btsVar6.Y();
                }
                return zy11Var;
            case 6:
                rx41 rx41Var = (rx41) obj7;
                tls tlsVar7 = (tls) obj6;
                fid fidVar7 = (fid) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (btsVar7.V(intValue8 & 1, (intValue8 & HProv.PP_SECURITY_LEVEL) != 128)) {
                    rzo.b(null, "default", wwg.S(1511888050, true, new bpn0(i4, rx41Var, tlsVar7), btsVar7), btsVar7, 3456, 3);
                } else {
                    btsVar7.Y();
                }
                return zy11Var;
            default:
                nz41 nz41Var = (nz41) obj7;
                tls tlsVar8 = (tls) obj6;
                j690 j690Var3 = (j690) obj2;
                fid fidVar8 = (fid) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                if ((intValue9 & 48) == 0) {
                    intValue9 |= ((bts) fidVar8).k(j690Var3) ? 32 : 16;
                }
                bts btsVar8 = (bts) fidVar8;
                boolean V2 = btsVar8.V(intValue9 & 1, (intValue9 & 145) != 144);
                dmw0 dmw0Var2 = btsVar8.a;
                if (V2) {
                    f530 j = an91.j(c530Var, j690Var3);
                    so5 so5Var2 = x4c.H;
                    sic a7 = qic.a(g43Var, so5Var2, btsVar8, 48);
                    int hashCode4 = Long.hashCode(btsVar8.T);
                    r1b0 o6 = btsVar8.o();
                    f530 d7 = b.d(btsVar8, j);
                    ohd.G1.getClass();
                    sls slsVar3 = d.b;
                    if (dmw0Var2 == null) {
                        cma1.b0();
                        throw null;
                    }
                    btsVar8.i0();
                    if (btsVar8.S) {
                        btsVar8.n(slsVar3);
                    } else {
                        btsVar8.r0();
                    }
                    wls wlsVar5 = d.f;
                    qje.W(btsVar8, wlsVar5, a7);
                    wls wlsVar6 = d.e;
                    qje.W(btsVar8, wlsVar6, o6);
                    Integer valueOf2 = Integer.valueOf(hashCode4);
                    wls wlsVar7 = d.g;
                    qje.W(btsVar8, wlsVar7, valueOf2);
                    tls tlsVar9 = d.h;
                    qje.M(btsVar8, tlsVar9);
                    wls wlsVar8 = d.d;
                    qje.W(btsVar8, wlsVar8, d7);
                    ru.yandex.taxi.orderforanother.v2.c.d(nz41Var.a, null, btsVar8, 0);
                    ru.yandex.taxi.orderforanother.v2.c.b(nz41Var.b, null, btsVar8, 0);
                    f530 o7 = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 24.0f, 0.0f, 36.0f, 5);
                    lhl0 a8 = khl0.a(new i43(12.0f, true, new m6(9, so5Var2)), x4c.D, btsVar8, 6);
                    int hashCode5 = Long.hashCode(btsVar8.T);
                    r1b0 o8 = btsVar8.o();
                    f530 d8 = b.d(btsVar8, o7);
                    btsVar8.i0();
                    if (btsVar8.S) {
                        btsVar8.n(slsVar3);
                    } else {
                        btsVar8.r0();
                    }
                    qje.W(btsVar8, wlsVar5, a8);
                    qje.W(btsVar8, wlsVar6, o8);
                    vfc.v(hashCode5, btsVar8, wlsVar7, btsVar8, tlsVar9);
                    qje.W(btsVar8, wlsVar8, d8);
                    ru.yandex.taxi.orderforanother.v2.c.c(null, nz41Var.c, tlsVar8, btsVar8, 0);
                    ru.yandex.taxi.orderforanother.v2.c.c(null, nz41Var.d, tlsVar8, btsVar8, 0);
                    btsVar8.t(true);
                    btsVar8.t(true);
                } else {
                    btsVar8.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ nhu0(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }
}
