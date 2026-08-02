package com.yandex.go.scooters.ignition.controlling;

import androidx.compose.ui.platform.j;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import defpackage.aii0;
import defpackage.an91;
import defpackage.apn0;
import defpackage.bpn0;
import defpackage.bts;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cpn0;
import defpackage.cyk0;
import defpackage.dbb1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.dx2;
import defpackage.eja1;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.g43;
import defpackage.gqn0;
import defpackage.hbb1;
import defpackage.hqn0;
import defpackage.i9a1;
import defpackage.iqn0;
import defpackage.jeb1;
import defpackage.jqn0;
import defpackage.kqn0;
import defpackage.ljs0;
import defpackage.lqn0;
import defpackage.lr20;
import defpackage.mqn0;
import defpackage.n;
import defpackage.na01;
import defpackage.nqn0;
import defpackage.nx2;
import defpackage.o430;
import defpackage.ohd;
import defpackage.oip0;
import defpackage.oqn0;
import defpackage.p1b1;
import defpackage.phb1;
import defpackage.pi6;
import defpackage.ppn0;
import defpackage.pqn0;
import defpackage.pw91;
import defpackage.q791;
import defpackage.qic;
import defpackage.qje;
import defpackage.qqn0;
import defpackage.r1b0;
import defpackage.rly0;
import defpackage.rpn0;
import defpackage.rqn0;
import defpackage.rzo;
import defpackage.scc;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.so5;
import defpackage.t7l0;
import defpackage.tls;
import defpackage.tse0;
import defpackage.unr0;
import defpackage.uo5;
import defpackage.uy2;
import defpackage.vfc;
import defpackage.wls;
import defpackage.wwg;
import defpackage.wzl0;
import defpackage.x4c;
import defpackage.xbd;
import defpackage.xlb1;
import defpackage.xya1;
import defpackage.ydb1;
import defpackage.ymb1;
import defpackage.yon0;
import defpackage.yrl;
import defpackage.yx40;
import defpackage.z910;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public abstract class d {
    public static final void a(final rqn0 rqn0Var, tls tlsVar, yx40 yx40Var, oip0 oip0Var, fid fidVar, int i) {
        int i2;
        boolean z;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1759827541);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i & 6;
        cj6 cj6Var = cj6.a;
        if (i3 == 0) {
            i2 = (btsVar.k(cj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(rqn0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(yx40Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(oip0Var) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            uo5 uo5Var = x4c.B;
            c530 c530Var = c530.a;
            f530 d = i9a1.d(ljs0.c(bzk0.c(hbb1.c(cj6Var.a(c530Var, uo5Var), dbb1.c(btsVar), false, 0.0f, p1b1.f(oip0Var, btsVar), 6), AppColor$Palette.BgFloating, ((nx2) btsVar.m(uy2.c)).a), 1.0f));
            boolean z3 = (i2 & 7168) == 2048;
            Object Q = btsVar.Q();
            boolean z4 = z3;
            o430 o430Var = did.a;
            if (z4 || Q == o430Var) {
                Q = new dx2(yx40Var, 10);
                btsVar.o0(Q);
            }
            f530 k = an91.k(eja1.y(d, (tls) Q), 8.0f);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, a);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            boolean z5 = rqn0Var.a;
            gqn0 gqn0Var = rqn0Var.e;
            if (z5) {
                btsVar.e0(-57175074);
                boolean z6 = rqn0Var.f;
                f530 c = ljs0.c(c530Var, 1.0f);
                int i4 = i2 & 896;
                boolean z7 = i4 == 256;
                Object Q2 = btsVar.Q();
                if (z7 || Q2 == o430Var) {
                    Q2 = new wzl0(19, tlsVar);
                    btsVar.o0(Q2);
                }
                final int i5 = 0;
                int i6 = i2;
                phb1.b((sls) Q2, c, z6, null, null, wwg.S(-353089637, true, new zls() { // from class: qpn0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i7 = i5;
                        zy11 zy11Var = zy11.a;
                        rqn0 rqn0Var2 = rqn0Var;
                        switch (i7) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var, rqn0Var2.d, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue & 14, 0, 8190);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var2, rqn0Var2.d, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 8190);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, btsVar, 196656, 984);
                if (gqn0Var != null) {
                    btsVar.e0(-56838197);
                    String str = gqn0Var.a;
                    ety0 ety0Var = xya1.e(btsVar).i.a;
                    AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
                    f530 o2 = an91.o(c530Var, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    boolean z8 = ((i6 & 112) == 32) | (i4 == 256);
                    Object Q3 = btsVar.Q();
                    if (z8 || Q3 == o430Var) {
                        Q3 = new rpn0(tlsVar, rqn0Var);
                        btsVar.o0(Q3);
                    }
                    jeb1.f(str, q791.d(o2, false, null, null, (sls) Q3, 15), appColor$Palette, 0L, 0L, rly0.c, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var, btsVar, 1573248, 0, 16184);
                    btsVar = btsVar;
                    z2 = false;
                    btsVar.t(false);
                } else {
                    z2 = false;
                    btsVar.e0(-56336307);
                    btsVar.t(false);
                }
                btsVar.t(z2);
                z = true;
            } else {
                int i7 = i2;
                btsVar.e0(-56300688);
                boolean b = btsVar.b(4.0f) | btsVar.a(false);
                Object Q4 = btsVar.Q();
                if (b || Q4 == o430Var) {
                    Q4 = new cpn0(1);
                    btsVar.o0(Q4);
                }
                z910 z910Var = (z910) Q4;
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o3 = btsVar.o();
                f530 d3 = androidx.compose.ui.b.d(btsVar, c530Var);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, z910Var);
                qje.W(btsVar, wlsVar2, o3);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
                qje.W(btsVar, wlsVar4, d3);
                boolean z9 = rqn0Var.g ? true : rqn0Var.f;
                int i8 = i7 & 896;
                boolean z10 = (i8 == 256) | ((i7 & 112) == 32);
                Object Q5 = btsVar.Q();
                if (z10 || Q5 == o430Var) {
                    Q5 = new rpn0(rqn0Var, tlsVar);
                    btsVar.o0(Q5);
                }
                sls slsVar2 = (sls) Q5;
                final int i9 = 1;
                xlb1.a(slsVar2, null, z9, null, null, wwg.S(-2114581370, true, new zls() { // from class: qpn0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        int i72 = i9;
                        zy11 zy11Var = zy11.a;
                        rqn0 rqn0Var2 = rqn0Var;
                        switch (i72) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var, rqn0Var2.d, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar2, intValue & 14, 0, 8190);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var2, rqn0Var2.d, null, null, null, 0, 0, null, null, null, 0, 0, null, btsVar3, intValue2 & 14, 0, 8190);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, null, null, btsVar, ImageMetadata.EDGE_MODE, 986);
                boolean z11 = i8 == 256;
                Object Q6 = btsVar.Q();
                if (z11 || Q6 == o430Var) {
                    Q6 = new wzl0(20, tlsVar);
                    btsVar.o0(Q6);
                }
                xbd.a.getClass();
                phb1.b((sls) Q6, null, false, null, null, xbd.c, null, null, null, btsVar, ImageMetadata.EDGE_MODE, 990);
                z = true;
                btsVar.t(true);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ppn0(rqn0Var, tlsVar, yx40Var, oip0Var, i, 1);
        }
    }

    public static final void b(rqn0 rqn0Var, tls tlsVar, fid fidVar, int i) {
        rqn0 rqn0Var2;
        tls tlsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1111305589);
        int i2 = (btsVar.k(rqn0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 v = rqn0Var.a ? ljs0.c : ljs0.v(c530.a, null, 3);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, v);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, d);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = androidx.compose.runtime.f.g(0);
                btsVar.o0(Q);
            }
            yx40 yx40Var = (yx40) Q;
            oip0 o2 = pw91.o(btsVar);
            int i3 = i2 << 3;
            int i4 = (i3 & 112) | 3078 | (i3 & 896);
            rqn0Var2 = rqn0Var;
            tlsVar2 = tlsVar;
            c(rqn0Var2, tlsVar2, yx40Var, o2, btsVar, i4);
            a(rqn0Var2, tlsVar2, yx40Var, o2, btsVar, i4);
            btsVar.t(true);
        } else {
            rqn0Var2 = rqn0Var;
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new t7l0(rqn0Var2, tlsVar2, i, 21);
        }
    }

    public static final void c(rqn0 rqn0Var, tls tlsVar, yx40 yx40Var, oip0 oip0Var, fid fidVar, int i) {
        yx40 yx40Var2;
        so5 so5Var;
        so5 so5Var2 = x4c.G;
        bts btsVar = (bts) fidVar;
        btsVar.g0(859725395);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i & 6;
        cj6 cj6Var = cj6.a;
        int i3 = i2 == 0 ? (btsVar.k(cj6Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= btsVar.k(rqn0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            yx40Var2 = yx40Var;
            i3 |= btsVar.k(yx40Var2) ? 2048 : 1024;
        } else {
            yx40Var2 = yx40Var;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.k(oip0Var) ? 16384 : 8192;
        }
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            uo5 uo5Var = x4c.c;
            c530 c530Var = c530.a;
            f530 u = pw91.u(i9a1.d(an91.o(cj6Var.a(c530Var, uo5Var), 0.0f, 0.0f, 0.0f, ((fwi) btsVar.m(j.h)).H(yx40Var2.getIntValue()), 7)), oip0Var, 14);
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var2, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, u);
            ohd.G1.getClass();
            sls slsVar = androidx.compose.ui.node.d.b;
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            btsVar.e0(-1292621622);
            for (jqn0 jqn0Var : rqn0Var.c) {
                if (jqn0Var instanceof iqn0) {
                    btsVar.e0(-1511818563);
                    d(((iqn0) jqn0Var).a, tlsVar, btsVar, (i3 >> 3) & 112);
                    btsVar.t(false);
                    so5Var = so5Var2;
                } else {
                    if (!(jqn0Var instanceof hqn0)) {
                        throw unr0.y(1890892483, btsVar, false);
                    }
                    btsVar.e0(-1511691866);
                    f530 l = ymb1.l(bzk0.c(an91.m(c530Var, 16.0f, 0.0f, 2), AppColor$Palette.BgMinor, cyk0.c(24.0f)), cyk0.c(24.0f));
                    sic a2 = qic.a(g43Var, so5Var2, btsVar, 0);
                    int hashCode2 = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d2 = androidx.compose.ui.b.d(btsVar, l);
                    ohd.G1.getClass();
                    sls slsVar2 = androidx.compose.ui.node.d.b;
                    btsVar.i0();
                    so5Var = so5Var2;
                    if (btsVar.S) {
                        btsVar.n(slsVar2);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, androidx.compose.ui.node.d.f, a2);
                    qje.W(btsVar, androidx.compose.ui.node.d.e, o2);
                    qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode2));
                    qje.M(btsVar, androidx.compose.ui.node.d.h);
                    qje.W(btsVar, androidx.compose.ui.node.d.d, d2);
                    btsVar.e0(-1900936420);
                    List list = ((hqn0) jqn0Var).a;
                    int i4 = 0;
                    for (Object obj : list) {
                        int i5 = i4 + 1;
                        if (i4 < 0) {
                            scc.m();
                            throw null;
                        }
                        d((qqn0) obj, tlsVar, btsVar, (i3 >> 3) & 112);
                        if (i4 < scc.f(list)) {
                            btsVar.e0(386581288);
                            yrl.e(null, null, btsVar, 0, 7);
                            btsVar.t(false);
                        } else {
                            btsVar.e0(386637026);
                            btsVar.t(false);
                        }
                        i4 = i5;
                    }
                    tse0.t(btsVar, false, true, false);
                }
                so5Var2 = so5Var;
            }
            n.y(btsVar, false, c530Var, 8.0f, btsVar);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ppn0(rqn0Var, tlsVar, yx40Var, oip0Var, i, 0);
        }
    }

    public static final void d(final qqn0 qqn0Var, final tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(908191717);
        final int i3 = 2;
        final int i4 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(qqn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        final int i5 = 0;
        final int i6 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (qqn0Var instanceof lqn0) {
            btsVar.e0(1940640960);
            ydb1.a(null, null, wwg.S(-565398852, true, new zls() { // from class: npn0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    au2 au2Var;
                    int i7 = i5;
                    zy11 zy11Var = zy11.a;
                    qqn0 qqn0Var2 = qqn0Var;
                    switch (i7) {
                        case 0:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                p9b1.c(ebp0Var, ((lqn0) qqn0Var2).a, c530.a, tp2.a, xya1.e(btsVar2).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, null, btsVar2, intValue & 14, 0, 0);
                                break;
                            }
                        case 1:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var, mja1.a(((kqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                break;
                            }
                        case 2:
                            ebp0 ebp0Var2 = (ebp0) obj;
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= ((bts) fidVar4).k(ebp0Var2) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar4;
                            if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                kqn0 kqn0Var = (kqn0) qqn0Var2;
                                p9b1.c(ebp0Var2, kqn0Var.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, kqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, intValue3 & 14, 0, 0);
                                break;
                            }
                        case 3:
                            ibp0 ibp0Var2 = (ibp0) obj;
                            fid fidVar5 = (fid) obj2;
                            int intValue4 = ((Integer) obj3).intValue();
                            if ((intValue4 & 6) == 0) {
                                intValue4 |= ((bts) fidVar5).k(ibp0Var2) ? 4 : 2;
                            }
                            bts btsVar5 = (bts) fidVar5;
                            if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                int i8 = upn0.a[((oqn0) qqn0Var2).c.ordinal()];
                                if (i8 == 1) {
                                    au2Var = d6b1.a;
                                    if (au2Var == null) {
                                        lgv lgvVar = new lgv("BellL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                        a6t0 a6t0Var = new a6t0(iq2.g);
                                        uq90 e = nnm.e(20.79f, 16.39f);
                                        e.a(5.0f, 5.0f, false, true, 18.64f, 13.0f);
                                        e.i(-0.75f, -4.11f);
                                        e.b(6.0f, 6.0f, false, false, -4.25f, -4.69f);
                                        e.h(13.33f, 2.0f);
                                        e.g(-2.66f);
                                        e.i(-0.32f, 2.23f);
                                        e.b(6.0f, 6.0f, false, false, -4.24f, 4.69f);
                                        e.h(5.36f, 13.0f);
                                        e.b(5.2f, 5.2f, false, true, -2.15f, 3.5f);
                                        e.i(-0.21f, 0.11f);
                                        e.o(18.0f);
                                        e.e(0.0f, 1.1f, 4.0f, 2.0f, 9.0f, 2.0f);
                                        e.n(9.0f, -0.9f, 9.0f, -2.0f);
                                        e.p(-1.5f);
                                        e.c();
                                        e.j(8.43f, 20.81f);
                                        e.b(4.0f, 4.0f, false, false, 7.13f, 0.0f);
                                        e.b(33.0f, 33.0f, false, true, -7.13f, 0.0f);
                                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                        au2Var = rya1.a(lgvVar.d(), true);
                                        d6b1.a = au2Var;
                                    }
                                } else if (i8 == 2) {
                                    au2Var = jgb1.e();
                                } else if (i8 != 3) {
                                    w511.b();
                                    break;
                                } else {
                                    au2Var = l9b1.a;
                                    if (au2Var == null) {
                                        lgv lgvVar2 = new lgv("Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                        a6t0 a6t0Var2 = new a6t0(iq2.g);
                                        uq90 uq90Var = new uq90();
                                        uq90Var.j(11.0f, 23.0f);
                                        uq90Var.g(1.5f);
                                        uq90Var.i(5.91f, -6.0f);
                                        uq90Var.i(-5.0f, -5.0f);
                                        uq90Var.i(5.0f, -5.0f);
                                        uq90Var.i(-6.0f, -6.0f);
                                        uq90Var.h(11.0f, 1.0f);
                                        uq90Var.p(8.59f);
                                        uq90Var.i(-3.8f, -3.8f);
                                        uq90Var.i(-1.4f, 1.42f);
                                        uq90Var.h(10.58f, 12.0f);
                                        uq90Var.i(-4.8f, 4.8f);
                                        uq90Var.i(1.42f, 1.4f);
                                        uq90Var.i(3.8f, -3.78f);
                                        uq90Var.c();
                                        uq90Var.j(13.0f, 9.59f);
                                        tse0.u(uq90Var, 15.59f, 7.0f, 13.0f, 4.41f);
                                        uq90Var.j(13.0f, 14.41f);
                                        uq90Var.p(5.18f);
                                        uq90Var.h(15.59f, 17.0f);
                                        uq90Var.c();
                                        lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", uq90Var.a);
                                        au2Var = rya1.a(lgvVar2.d(), true);
                                        l9b1.a = au2Var;
                                    }
                                }
                                udb1.c(ibp0Var2, au2Var, null, null, btsVar5, intValue4 & 14, 14);
                            } else {
                                btsVar5.Y();
                            }
                            break;
                        case 4:
                            ebp0 ebp0Var3 = (ebp0) obj;
                            fid fidVar6 = (fid) obj2;
                            int intValue5 = ((Integer) obj3).intValue();
                            if ((intValue5 & 6) == 0) {
                                intValue5 |= ((bts) fidVar6).k(ebp0Var3) ? 4 : 2;
                            }
                            bts btsVar6 = (bts) fidVar6;
                            if (!btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                btsVar6.Y();
                                break;
                            } else {
                                oqn0 oqn0Var = (oqn0) qqn0Var2;
                                p9b1.c(ebp0Var3, oqn0Var.a, c530.a, tp2.a, xya1.e(btsVar6).g.a, 2, Integer.MAX_VALUE, oqn0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar6).h.a, 2, Integer.MAX_VALUE, null, btsVar6, intValue5 & 14, 0, 0);
                                break;
                            }
                        case 5:
                            ibp0 ibp0Var3 = (ibp0) obj;
                            fid fidVar7 = (fid) obj2;
                            int intValue6 = ((Integer) obj3).intValue();
                            if ((intValue6 & 6) == 0) {
                                intValue6 |= ((bts) fidVar7).k(ibp0Var3) ? 4 : 2;
                            }
                            bts btsVar7 = (bts) fidVar7;
                            if (!btsVar7.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                                btsVar7.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var3, mja1.a(((pqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar7, intValue6 & 14, 510);
                                break;
                            }
                        case 6:
                            ebp0 ebp0Var4 = (ebp0) obj;
                            fid fidVar8 = (fid) obj2;
                            int intValue7 = ((Integer) obj3).intValue();
                            if ((intValue7 & 6) == 0) {
                                intValue7 |= ((bts) fidVar8).k(ebp0Var4) ? 4 : 2;
                            }
                            bts btsVar8 = (bts) fidVar8;
                            if (!btsVar8.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                                btsVar8.Y();
                                break;
                            } else {
                                pqn0 pqn0Var = (pqn0) qqn0Var2;
                                p9b1.c(ebp0Var4, pqn0Var.b, c530.a, tp2.a, xya1.e(btsVar8).g.a, 2, Integer.MAX_VALUE, pqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar8).h.a, 2, Integer.MAX_VALUE, null, btsVar8, intValue7 & 14, 0, 0);
                                break;
                            }
                        case 7:
                            ibp0 ibp0Var4 = (ibp0) obj;
                            fid fidVar9 = (fid) obj2;
                            int intValue8 = ((Integer) obj3).intValue();
                            if ((intValue8 & 6) == 0) {
                                intValue8 |= ((bts) fidVar9).k(ibp0Var4) ? 4 : 2;
                            }
                            bts btsVar9 = (bts) fidVar9;
                            if (!btsVar9.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                                btsVar9.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var4, mja1.a(((nqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar9, intValue8 & 14, 510);
                                break;
                            }
                        case 8:
                            ebp0 ebp0Var5 = (ebp0) obj;
                            fid fidVar10 = (fid) obj2;
                            int intValue9 = ((Integer) obj3).intValue();
                            if ((intValue9 & 6) == 0) {
                                intValue9 |= ((bts) fidVar10).k(ebp0Var5) ? 4 : 2;
                            }
                            bts btsVar10 = (bts) fidVar10;
                            if (!btsVar10.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                                btsVar10.Y();
                                break;
                            } else {
                                nqn0 nqn0Var = (nqn0) qqn0Var2;
                                p9b1.c(ebp0Var5, nqn0Var.b, c530.a, tp2.a, xya1.e(btsVar10).g.a, 2, Integer.MAX_VALUE, nqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar10).h.a, 2, Integer.MAX_VALUE, null, btsVar10, intValue9 & 14, 0, 0);
                                break;
                            }
                        case 9:
                            ibp0 ibp0Var5 = (ibp0) obj;
                            fid fidVar11 = (fid) obj2;
                            int intValue10 = ((Integer) obj3).intValue();
                            if ((intValue10 & 6) == 0) {
                                intValue10 |= ((bts) fidVar11).k(ibp0Var5) ? 4 : 2;
                            }
                            bts btsVar11 = (bts) fidVar11;
                            if (!btsVar11.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                                btsVar11.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var5, mja1.a(((mqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar11, intValue10 & 14, 510);
                                break;
                            }
                        default:
                            ebp0 ebp0Var6 = (ebp0) obj;
                            fid fidVar12 = (fid) obj2;
                            int intValue11 = ((Integer) obj3).intValue();
                            if ((intValue11 & 6) == 0) {
                                intValue11 |= ((bts) fidVar12).k(ebp0Var6) ? 4 : 2;
                            }
                            bts btsVar12 = (bts) fidVar12;
                            if (!btsVar12.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                                btsVar12.Y();
                                break;
                            } else {
                                mqn0 mqn0Var = (mqn0) qqn0Var2;
                                p9b1.c(ebp0Var6, mqn0Var.b, c530.a, tp2.a, xya1.e(btsVar12).g.a, 2, Integer.MAX_VALUE, mqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar12).h.a, 2, Integer.MAX_VALUE, null, btsVar12, intValue11 & 14, 0, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, null, null, false, btsVar, 384, 251);
            btsVar.t(false);
        } else if (qqn0Var instanceof pqn0) {
            btsVar.e0(1940766510);
            final int i7 = 5;
            final int i8 = 6;
            ydb1.a(null, wwg.S(308179342, true, new zls() { // from class: npn0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    au2 au2Var;
                    int i72 = i7;
                    zy11 zy11Var = zy11.a;
                    qqn0 qqn0Var2 = qqn0Var;
                    switch (i72) {
                        case 0:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                p9b1.c(ebp0Var, ((lqn0) qqn0Var2).a, c530.a, tp2.a, xya1.e(btsVar2).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, null, btsVar2, intValue & 14, 0, 0);
                                break;
                            }
                        case 1:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var, mja1.a(((kqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                break;
                            }
                        case 2:
                            ebp0 ebp0Var2 = (ebp0) obj;
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= ((bts) fidVar4).k(ebp0Var2) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar4;
                            if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                kqn0 kqn0Var = (kqn0) qqn0Var2;
                                p9b1.c(ebp0Var2, kqn0Var.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, kqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, intValue3 & 14, 0, 0);
                                break;
                            }
                        case 3:
                            ibp0 ibp0Var2 = (ibp0) obj;
                            fid fidVar5 = (fid) obj2;
                            int intValue4 = ((Integer) obj3).intValue();
                            if ((intValue4 & 6) == 0) {
                                intValue4 |= ((bts) fidVar5).k(ibp0Var2) ? 4 : 2;
                            }
                            bts btsVar5 = (bts) fidVar5;
                            if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                int i82 = upn0.a[((oqn0) qqn0Var2).c.ordinal()];
                                if (i82 == 1) {
                                    au2Var = d6b1.a;
                                    if (au2Var == null) {
                                        lgv lgvVar = new lgv("BellL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                        a6t0 a6t0Var = new a6t0(iq2.g);
                                        uq90 e = nnm.e(20.79f, 16.39f);
                                        e.a(5.0f, 5.0f, false, true, 18.64f, 13.0f);
                                        e.i(-0.75f, -4.11f);
                                        e.b(6.0f, 6.0f, false, false, -4.25f, -4.69f);
                                        e.h(13.33f, 2.0f);
                                        e.g(-2.66f);
                                        e.i(-0.32f, 2.23f);
                                        e.b(6.0f, 6.0f, false, false, -4.24f, 4.69f);
                                        e.h(5.36f, 13.0f);
                                        e.b(5.2f, 5.2f, false, true, -2.15f, 3.5f);
                                        e.i(-0.21f, 0.11f);
                                        e.o(18.0f);
                                        e.e(0.0f, 1.1f, 4.0f, 2.0f, 9.0f, 2.0f);
                                        e.n(9.0f, -0.9f, 9.0f, -2.0f);
                                        e.p(-1.5f);
                                        e.c();
                                        e.j(8.43f, 20.81f);
                                        e.b(4.0f, 4.0f, false, false, 7.13f, 0.0f);
                                        e.b(33.0f, 33.0f, false, true, -7.13f, 0.0f);
                                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                        au2Var = rya1.a(lgvVar.d(), true);
                                        d6b1.a = au2Var;
                                    }
                                } else if (i82 == 2) {
                                    au2Var = jgb1.e();
                                } else if (i82 != 3) {
                                    w511.b();
                                    break;
                                } else {
                                    au2Var = l9b1.a;
                                    if (au2Var == null) {
                                        lgv lgvVar2 = new lgv("Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                        a6t0 a6t0Var2 = new a6t0(iq2.g);
                                        uq90 uq90Var = new uq90();
                                        uq90Var.j(11.0f, 23.0f);
                                        uq90Var.g(1.5f);
                                        uq90Var.i(5.91f, -6.0f);
                                        uq90Var.i(-5.0f, -5.0f);
                                        uq90Var.i(5.0f, -5.0f);
                                        uq90Var.i(-6.0f, -6.0f);
                                        uq90Var.h(11.0f, 1.0f);
                                        uq90Var.p(8.59f);
                                        uq90Var.i(-3.8f, -3.8f);
                                        uq90Var.i(-1.4f, 1.42f);
                                        uq90Var.h(10.58f, 12.0f);
                                        uq90Var.i(-4.8f, 4.8f);
                                        uq90Var.i(1.42f, 1.4f);
                                        uq90Var.i(3.8f, -3.78f);
                                        uq90Var.c();
                                        uq90Var.j(13.0f, 9.59f);
                                        tse0.u(uq90Var, 15.59f, 7.0f, 13.0f, 4.41f);
                                        uq90Var.j(13.0f, 14.41f);
                                        uq90Var.p(5.18f);
                                        uq90Var.h(15.59f, 17.0f);
                                        uq90Var.c();
                                        lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", uq90Var.a);
                                        au2Var = rya1.a(lgvVar2.d(), true);
                                        l9b1.a = au2Var;
                                    }
                                }
                                udb1.c(ibp0Var2, au2Var, null, null, btsVar5, intValue4 & 14, 14);
                            } else {
                                btsVar5.Y();
                            }
                            break;
                        case 4:
                            ebp0 ebp0Var3 = (ebp0) obj;
                            fid fidVar6 = (fid) obj2;
                            int intValue5 = ((Integer) obj3).intValue();
                            if ((intValue5 & 6) == 0) {
                                intValue5 |= ((bts) fidVar6).k(ebp0Var3) ? 4 : 2;
                            }
                            bts btsVar6 = (bts) fidVar6;
                            if (!btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                btsVar6.Y();
                                break;
                            } else {
                                oqn0 oqn0Var = (oqn0) qqn0Var2;
                                p9b1.c(ebp0Var3, oqn0Var.a, c530.a, tp2.a, xya1.e(btsVar6).g.a, 2, Integer.MAX_VALUE, oqn0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar6).h.a, 2, Integer.MAX_VALUE, null, btsVar6, intValue5 & 14, 0, 0);
                                break;
                            }
                        case 5:
                            ibp0 ibp0Var3 = (ibp0) obj;
                            fid fidVar7 = (fid) obj2;
                            int intValue6 = ((Integer) obj3).intValue();
                            if ((intValue6 & 6) == 0) {
                                intValue6 |= ((bts) fidVar7).k(ibp0Var3) ? 4 : 2;
                            }
                            bts btsVar7 = (bts) fidVar7;
                            if (!btsVar7.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                                btsVar7.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var3, mja1.a(((pqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar7, intValue6 & 14, 510);
                                break;
                            }
                        case 6:
                            ebp0 ebp0Var4 = (ebp0) obj;
                            fid fidVar8 = (fid) obj2;
                            int intValue7 = ((Integer) obj3).intValue();
                            if ((intValue7 & 6) == 0) {
                                intValue7 |= ((bts) fidVar8).k(ebp0Var4) ? 4 : 2;
                            }
                            bts btsVar8 = (bts) fidVar8;
                            if (!btsVar8.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                                btsVar8.Y();
                                break;
                            } else {
                                pqn0 pqn0Var = (pqn0) qqn0Var2;
                                p9b1.c(ebp0Var4, pqn0Var.b, c530.a, tp2.a, xya1.e(btsVar8).g.a, 2, Integer.MAX_VALUE, pqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar8).h.a, 2, Integer.MAX_VALUE, null, btsVar8, intValue7 & 14, 0, 0);
                                break;
                            }
                        case 7:
                            ibp0 ibp0Var4 = (ibp0) obj;
                            fid fidVar9 = (fid) obj2;
                            int intValue8 = ((Integer) obj3).intValue();
                            if ((intValue8 & 6) == 0) {
                                intValue8 |= ((bts) fidVar9).k(ibp0Var4) ? 4 : 2;
                            }
                            bts btsVar9 = (bts) fidVar9;
                            if (!btsVar9.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                                btsVar9.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var4, mja1.a(((nqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar9, intValue8 & 14, 510);
                                break;
                            }
                        case 8:
                            ebp0 ebp0Var5 = (ebp0) obj;
                            fid fidVar10 = (fid) obj2;
                            int intValue9 = ((Integer) obj3).intValue();
                            if ((intValue9 & 6) == 0) {
                                intValue9 |= ((bts) fidVar10).k(ebp0Var5) ? 4 : 2;
                            }
                            bts btsVar10 = (bts) fidVar10;
                            if (!btsVar10.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                                btsVar10.Y();
                                break;
                            } else {
                                nqn0 nqn0Var = (nqn0) qqn0Var2;
                                p9b1.c(ebp0Var5, nqn0Var.b, c530.a, tp2.a, xya1.e(btsVar10).g.a, 2, Integer.MAX_VALUE, nqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar10).h.a, 2, Integer.MAX_VALUE, null, btsVar10, intValue9 & 14, 0, 0);
                                break;
                            }
                        case 9:
                            ibp0 ibp0Var5 = (ibp0) obj;
                            fid fidVar11 = (fid) obj2;
                            int intValue10 = ((Integer) obj3).intValue();
                            if ((intValue10 & 6) == 0) {
                                intValue10 |= ((bts) fidVar11).k(ibp0Var5) ? 4 : 2;
                            }
                            bts btsVar11 = (bts) fidVar11;
                            if (!btsVar11.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                                btsVar11.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var5, mja1.a(((mqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar11, intValue10 & 14, 510);
                                break;
                            }
                        default:
                            ebp0 ebp0Var6 = (ebp0) obj;
                            fid fidVar12 = (fid) obj2;
                            int intValue11 = ((Integer) obj3).intValue();
                            if ((intValue11 & 6) == 0) {
                                intValue11 |= ((bts) fidVar12).k(ebp0Var6) ? 4 : 2;
                            }
                            bts btsVar12 = (bts) fidVar12;
                            if (!btsVar12.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                                btsVar12.Y();
                                break;
                            } else {
                                mqn0 mqn0Var = (mqn0) qqn0Var2;
                                p9b1.c(ebp0Var6, mqn0Var.b, c530.a, tp2.a, xya1.e(btsVar12).g.a, 2, Integer.MAX_VALUE, mqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar12).h.a, 2, Integer.MAX_VALUE, null, btsVar12, intValue11 & 14, 0, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), wwg.S(1406243699, true, new zls() { // from class: npn0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    au2 au2Var;
                    int i72 = i8;
                    zy11 zy11Var = zy11.a;
                    qqn0 qqn0Var2 = qqn0Var;
                    switch (i72) {
                        case 0:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar2.Y();
                                break;
                            } else {
                                p9b1.c(ebp0Var, ((lqn0) qqn0Var2).a, c530.a, tp2.a, xya1.e(btsVar2).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, null, btsVar2, intValue & 14, 0, 0);
                                break;
                            }
                        case 1:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var, mja1.a(((kqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                break;
                            }
                        case 2:
                            ebp0 ebp0Var2 = (ebp0) obj;
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            if ((intValue3 & 6) == 0) {
                                intValue3 |= ((bts) fidVar4).k(ebp0Var2) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar4;
                            if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                kqn0 kqn0Var = (kqn0) qqn0Var2;
                                p9b1.c(ebp0Var2, kqn0Var.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, kqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, intValue3 & 14, 0, 0);
                                break;
                            }
                        case 3:
                            ibp0 ibp0Var2 = (ibp0) obj;
                            fid fidVar5 = (fid) obj2;
                            int intValue4 = ((Integer) obj3).intValue();
                            if ((intValue4 & 6) == 0) {
                                intValue4 |= ((bts) fidVar5).k(ibp0Var2) ? 4 : 2;
                            }
                            bts btsVar5 = (bts) fidVar5;
                            if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                int i82 = upn0.a[((oqn0) qqn0Var2).c.ordinal()];
                                if (i82 == 1) {
                                    au2Var = d6b1.a;
                                    if (au2Var == null) {
                                        lgv lgvVar = new lgv("BellL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                        a6t0 a6t0Var = new a6t0(iq2.g);
                                        uq90 e = nnm.e(20.79f, 16.39f);
                                        e.a(5.0f, 5.0f, false, true, 18.64f, 13.0f);
                                        e.i(-0.75f, -4.11f);
                                        e.b(6.0f, 6.0f, false, false, -4.25f, -4.69f);
                                        e.h(13.33f, 2.0f);
                                        e.g(-2.66f);
                                        e.i(-0.32f, 2.23f);
                                        e.b(6.0f, 6.0f, false, false, -4.24f, 4.69f);
                                        e.h(5.36f, 13.0f);
                                        e.b(5.2f, 5.2f, false, true, -2.15f, 3.5f);
                                        e.i(-0.21f, 0.11f);
                                        e.o(18.0f);
                                        e.e(0.0f, 1.1f, 4.0f, 2.0f, 9.0f, 2.0f);
                                        e.n(9.0f, -0.9f, 9.0f, -2.0f);
                                        e.p(-1.5f);
                                        e.c();
                                        e.j(8.43f, 20.81f);
                                        e.b(4.0f, 4.0f, false, false, 7.13f, 0.0f);
                                        e.b(33.0f, 33.0f, false, true, -7.13f, 0.0f);
                                        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                        au2Var = rya1.a(lgvVar.d(), true);
                                        d6b1.a = au2Var;
                                    }
                                } else if (i82 == 2) {
                                    au2Var = jgb1.e();
                                } else if (i82 != 3) {
                                    w511.b();
                                    break;
                                } else {
                                    au2Var = l9b1.a;
                                    if (au2Var == null) {
                                        lgv lgvVar2 = new lgv("Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                        a6t0 a6t0Var2 = new a6t0(iq2.g);
                                        uq90 uq90Var = new uq90();
                                        uq90Var.j(11.0f, 23.0f);
                                        uq90Var.g(1.5f);
                                        uq90Var.i(5.91f, -6.0f);
                                        uq90Var.i(-5.0f, -5.0f);
                                        uq90Var.i(5.0f, -5.0f);
                                        uq90Var.i(-6.0f, -6.0f);
                                        uq90Var.h(11.0f, 1.0f);
                                        uq90Var.p(8.59f);
                                        uq90Var.i(-3.8f, -3.8f);
                                        uq90Var.i(-1.4f, 1.42f);
                                        uq90Var.h(10.58f, 12.0f);
                                        uq90Var.i(-4.8f, 4.8f);
                                        uq90Var.i(1.42f, 1.4f);
                                        uq90Var.i(3.8f, -3.78f);
                                        uq90Var.c();
                                        uq90Var.j(13.0f, 9.59f);
                                        tse0.u(uq90Var, 15.59f, 7.0f, 13.0f, 4.41f);
                                        uq90Var.j(13.0f, 14.41f);
                                        uq90Var.p(5.18f);
                                        uq90Var.h(15.59f, 17.0f);
                                        uq90Var.c();
                                        lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", uq90Var.a);
                                        au2Var = rya1.a(lgvVar2.d(), true);
                                        l9b1.a = au2Var;
                                    }
                                }
                                udb1.c(ibp0Var2, au2Var, null, null, btsVar5, intValue4 & 14, 14);
                            } else {
                                btsVar5.Y();
                            }
                            break;
                        case 4:
                            ebp0 ebp0Var3 = (ebp0) obj;
                            fid fidVar6 = (fid) obj2;
                            int intValue5 = ((Integer) obj3).intValue();
                            if ((intValue5 & 6) == 0) {
                                intValue5 |= ((bts) fidVar6).k(ebp0Var3) ? 4 : 2;
                            }
                            bts btsVar6 = (bts) fidVar6;
                            if (!btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                btsVar6.Y();
                                break;
                            } else {
                                oqn0 oqn0Var = (oqn0) qqn0Var2;
                                p9b1.c(ebp0Var3, oqn0Var.a, c530.a, tp2.a, xya1.e(btsVar6).g.a, 2, Integer.MAX_VALUE, oqn0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar6).h.a, 2, Integer.MAX_VALUE, null, btsVar6, intValue5 & 14, 0, 0);
                                break;
                            }
                        case 5:
                            ibp0 ibp0Var3 = (ibp0) obj;
                            fid fidVar7 = (fid) obj2;
                            int intValue6 = ((Integer) obj3).intValue();
                            if ((intValue6 & 6) == 0) {
                                intValue6 |= ((bts) fidVar7).k(ibp0Var3) ? 4 : 2;
                            }
                            bts btsVar7 = (bts) fidVar7;
                            if (!btsVar7.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                                btsVar7.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var3, mja1.a(((pqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar7, intValue6 & 14, 510);
                                break;
                            }
                        case 6:
                            ebp0 ebp0Var4 = (ebp0) obj;
                            fid fidVar8 = (fid) obj2;
                            int intValue7 = ((Integer) obj3).intValue();
                            if ((intValue7 & 6) == 0) {
                                intValue7 |= ((bts) fidVar8).k(ebp0Var4) ? 4 : 2;
                            }
                            bts btsVar8 = (bts) fidVar8;
                            if (!btsVar8.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                                btsVar8.Y();
                                break;
                            } else {
                                pqn0 pqn0Var = (pqn0) qqn0Var2;
                                p9b1.c(ebp0Var4, pqn0Var.b, c530.a, tp2.a, xya1.e(btsVar8).g.a, 2, Integer.MAX_VALUE, pqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar8).h.a, 2, Integer.MAX_VALUE, null, btsVar8, intValue7 & 14, 0, 0);
                                break;
                            }
                        case 7:
                            ibp0 ibp0Var4 = (ibp0) obj;
                            fid fidVar9 = (fid) obj2;
                            int intValue8 = ((Integer) obj3).intValue();
                            if ((intValue8 & 6) == 0) {
                                intValue8 |= ((bts) fidVar9).k(ibp0Var4) ? 4 : 2;
                            }
                            bts btsVar9 = (bts) fidVar9;
                            if (!btsVar9.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                                btsVar9.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var4, mja1.a(((nqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar9, intValue8 & 14, 510);
                                break;
                            }
                        case 8:
                            ebp0 ebp0Var5 = (ebp0) obj;
                            fid fidVar10 = (fid) obj2;
                            int intValue9 = ((Integer) obj3).intValue();
                            if ((intValue9 & 6) == 0) {
                                intValue9 |= ((bts) fidVar10).k(ebp0Var5) ? 4 : 2;
                            }
                            bts btsVar10 = (bts) fidVar10;
                            if (!btsVar10.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                                btsVar10.Y();
                                break;
                            } else {
                                nqn0 nqn0Var = (nqn0) qqn0Var2;
                                p9b1.c(ebp0Var5, nqn0Var.b, c530.a, tp2.a, xya1.e(btsVar10).g.a, 2, Integer.MAX_VALUE, nqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar10).h.a, 2, Integer.MAX_VALUE, null, btsVar10, intValue9 & 14, 0, 0);
                                break;
                            }
                        case 9:
                            ibp0 ibp0Var5 = (ibp0) obj;
                            fid fidVar11 = (fid) obj2;
                            int intValue10 = ((Integer) obj3).intValue();
                            if ((intValue10 & 6) == 0) {
                                intValue10 |= ((bts) fidVar11).k(ibp0Var5) ? 4 : 2;
                            }
                            bts btsVar11 = (bts) fidVar11;
                            if (!btsVar11.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                                btsVar11.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var5, mja1.a(((mqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar11, intValue10 & 14, 510);
                                break;
                            }
                        default:
                            ebp0 ebp0Var6 = (ebp0) obj;
                            fid fidVar12 = (fid) obj2;
                            int intValue11 = ((Integer) obj3).intValue();
                            if ((intValue11 & 6) == 0) {
                                intValue11 |= ((bts) fidVar12).k(ebp0Var6) ? 4 : 2;
                            }
                            bts btsVar12 = (bts) fidVar12;
                            if (!btsVar12.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                                btsVar12.Y();
                                break;
                            } else {
                                mqn0 mqn0Var = (mqn0) qqn0Var2;
                                p9b1.c(ebp0Var6, mqn0Var.b, c530.a, tp2.a, xya1.e(btsVar12).g.a, 2, Integer.MAX_VALUE, mqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar12).h.a, 2, Integer.MAX_VALUE, null, btsVar12, intValue11 & 14, 0, 0);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, null, null, false, btsVar, 432, 249);
            btsVar.t(false);
        } else {
            boolean z = qqn0Var instanceof nqn0;
            c530 c530Var = c530.a;
            o430 o430Var = did.a;
            if (z) {
                btsVar.e0(1941029049);
                androidx.compose.runtime.internal.a aVar = na01.a;
                boolean z2 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object Q = btsVar.Q();
                if (z2 || Q == o430Var) {
                    Q = new sls() { // from class: opn0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i9 = i6;
                            zy11 zy11Var = zy11.a;
                            qqn0 qqn0Var2 = qqn0Var;
                            tls tlsVar2 = tlsVar;
                            switch (i9) {
                                case 0:
                                    oqn0 oqn0Var = (oqn0) qqn0Var2;
                                    tlsVar2.invoke(new wpn0(oqn0Var.c, oqn0Var.d));
                                    break;
                                case 1:
                                    tlsVar2.invoke(new cqn0(((nqn0) qqn0Var2).d));
                                    break;
                                case 2:
                                    tlsVar2.invoke(new bqn0(((mqn0) qqn0Var2).d, true));
                                    break;
                                default:
                                    tlsVar2.invoke(new aqn0(((kqn0) qqn0Var2).d));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q);
                }
                final int i9 = 7;
                final int i10 = 8;
                ydb1.a(q791.d(c530Var, false, null, null, (sls) Q, 15), wwg.S(-2056557105, true, new zls() { // from class: npn0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        au2 au2Var;
                        int i72 = i9;
                        zy11 zy11Var = zy11.a;
                        qqn0 qqn0Var2 = qqn0Var;
                        switch (i72) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var, ((lqn0) qqn0Var2).a, c530.a, tp2.a, xya1.e(btsVar2).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, null, btsVar2, intValue & 14, 0, 0);
                                    break;
                                }
                            case 1:
                                ibp0 ibp0Var = (ibp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var, mja1.a(((kqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                    break;
                                }
                            case 2:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar4 = (fid) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((bts) fidVar4).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar4 = (bts) fidVar4;
                                if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    kqn0 kqn0Var = (kqn0) qqn0Var2;
                                    p9b1.c(ebp0Var2, kqn0Var.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, kqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, intValue3 & 14, 0, 0);
                                    break;
                                }
                            case 3:
                                ibp0 ibp0Var2 = (ibp0) obj;
                                fid fidVar5 = (fid) obj2;
                                int intValue4 = ((Integer) obj3).intValue();
                                if ((intValue4 & 6) == 0) {
                                    intValue4 |= ((bts) fidVar5).k(ibp0Var2) ? 4 : 2;
                                }
                                bts btsVar5 = (bts) fidVar5;
                                if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                    int i82 = upn0.a[((oqn0) qqn0Var2).c.ordinal()];
                                    if (i82 == 1) {
                                        au2Var = d6b1.a;
                                        if (au2Var == null) {
                                            lgv lgvVar = new lgv("BellL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                            a6t0 a6t0Var = new a6t0(iq2.g);
                                            uq90 e = nnm.e(20.79f, 16.39f);
                                            e.a(5.0f, 5.0f, false, true, 18.64f, 13.0f);
                                            e.i(-0.75f, -4.11f);
                                            e.b(6.0f, 6.0f, false, false, -4.25f, -4.69f);
                                            e.h(13.33f, 2.0f);
                                            e.g(-2.66f);
                                            e.i(-0.32f, 2.23f);
                                            e.b(6.0f, 6.0f, false, false, -4.24f, 4.69f);
                                            e.h(5.36f, 13.0f);
                                            e.b(5.2f, 5.2f, false, true, -2.15f, 3.5f);
                                            e.i(-0.21f, 0.11f);
                                            e.o(18.0f);
                                            e.e(0.0f, 1.1f, 4.0f, 2.0f, 9.0f, 2.0f);
                                            e.n(9.0f, -0.9f, 9.0f, -2.0f);
                                            e.p(-1.5f);
                                            e.c();
                                            e.j(8.43f, 20.81f);
                                            e.b(4.0f, 4.0f, false, false, 7.13f, 0.0f);
                                            e.b(33.0f, 33.0f, false, true, -7.13f, 0.0f);
                                            lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                            au2Var = rya1.a(lgvVar.d(), true);
                                            d6b1.a = au2Var;
                                        }
                                    } else if (i82 == 2) {
                                        au2Var = jgb1.e();
                                    } else if (i82 != 3) {
                                        w511.b();
                                        break;
                                    } else {
                                        au2Var = l9b1.a;
                                        if (au2Var == null) {
                                            lgv lgvVar2 = new lgv("Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                            a6t0 a6t0Var2 = new a6t0(iq2.g);
                                            uq90 uq90Var = new uq90();
                                            uq90Var.j(11.0f, 23.0f);
                                            uq90Var.g(1.5f);
                                            uq90Var.i(5.91f, -6.0f);
                                            uq90Var.i(-5.0f, -5.0f);
                                            uq90Var.i(5.0f, -5.0f);
                                            uq90Var.i(-6.0f, -6.0f);
                                            uq90Var.h(11.0f, 1.0f);
                                            uq90Var.p(8.59f);
                                            uq90Var.i(-3.8f, -3.8f);
                                            uq90Var.i(-1.4f, 1.42f);
                                            uq90Var.h(10.58f, 12.0f);
                                            uq90Var.i(-4.8f, 4.8f);
                                            uq90Var.i(1.42f, 1.4f);
                                            uq90Var.i(3.8f, -3.78f);
                                            uq90Var.c();
                                            uq90Var.j(13.0f, 9.59f);
                                            tse0.u(uq90Var, 15.59f, 7.0f, 13.0f, 4.41f);
                                            uq90Var.j(13.0f, 14.41f);
                                            uq90Var.p(5.18f);
                                            uq90Var.h(15.59f, 17.0f);
                                            uq90Var.c();
                                            lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", uq90Var.a);
                                            au2Var = rya1.a(lgvVar2.d(), true);
                                            l9b1.a = au2Var;
                                        }
                                    }
                                    udb1.c(ibp0Var2, au2Var, null, null, btsVar5, intValue4 & 14, 14);
                                } else {
                                    btsVar5.Y();
                                }
                                break;
                            case 4:
                                ebp0 ebp0Var3 = (ebp0) obj;
                                fid fidVar6 = (fid) obj2;
                                int intValue5 = ((Integer) obj3).intValue();
                                if ((intValue5 & 6) == 0) {
                                    intValue5 |= ((bts) fidVar6).k(ebp0Var3) ? 4 : 2;
                                }
                                bts btsVar6 = (bts) fidVar6;
                                if (!btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                    btsVar6.Y();
                                    break;
                                } else {
                                    oqn0 oqn0Var = (oqn0) qqn0Var2;
                                    p9b1.c(ebp0Var3, oqn0Var.a, c530.a, tp2.a, xya1.e(btsVar6).g.a, 2, Integer.MAX_VALUE, oqn0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar6).h.a, 2, Integer.MAX_VALUE, null, btsVar6, intValue5 & 14, 0, 0);
                                    break;
                                }
                            case 5:
                                ibp0 ibp0Var3 = (ibp0) obj;
                                fid fidVar7 = (fid) obj2;
                                int intValue6 = ((Integer) obj3).intValue();
                                if ((intValue6 & 6) == 0) {
                                    intValue6 |= ((bts) fidVar7).k(ibp0Var3) ? 4 : 2;
                                }
                                bts btsVar7 = (bts) fidVar7;
                                if (!btsVar7.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                                    btsVar7.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var3, mja1.a(((pqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar7, intValue6 & 14, 510);
                                    break;
                                }
                            case 6:
                                ebp0 ebp0Var4 = (ebp0) obj;
                                fid fidVar8 = (fid) obj2;
                                int intValue7 = ((Integer) obj3).intValue();
                                if ((intValue7 & 6) == 0) {
                                    intValue7 |= ((bts) fidVar8).k(ebp0Var4) ? 4 : 2;
                                }
                                bts btsVar8 = (bts) fidVar8;
                                if (!btsVar8.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                                    btsVar8.Y();
                                    break;
                                } else {
                                    pqn0 pqn0Var = (pqn0) qqn0Var2;
                                    p9b1.c(ebp0Var4, pqn0Var.b, c530.a, tp2.a, xya1.e(btsVar8).g.a, 2, Integer.MAX_VALUE, pqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar8).h.a, 2, Integer.MAX_VALUE, null, btsVar8, intValue7 & 14, 0, 0);
                                    break;
                                }
                            case 7:
                                ibp0 ibp0Var4 = (ibp0) obj;
                                fid fidVar9 = (fid) obj2;
                                int intValue8 = ((Integer) obj3).intValue();
                                if ((intValue8 & 6) == 0) {
                                    intValue8 |= ((bts) fidVar9).k(ibp0Var4) ? 4 : 2;
                                }
                                bts btsVar9 = (bts) fidVar9;
                                if (!btsVar9.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                                    btsVar9.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var4, mja1.a(((nqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar9, intValue8 & 14, 510);
                                    break;
                                }
                            case 8:
                                ebp0 ebp0Var5 = (ebp0) obj;
                                fid fidVar10 = (fid) obj2;
                                int intValue9 = ((Integer) obj3).intValue();
                                if ((intValue9 & 6) == 0) {
                                    intValue9 |= ((bts) fidVar10).k(ebp0Var5) ? 4 : 2;
                                }
                                bts btsVar10 = (bts) fidVar10;
                                if (!btsVar10.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                                    btsVar10.Y();
                                    break;
                                } else {
                                    nqn0 nqn0Var = (nqn0) qqn0Var2;
                                    p9b1.c(ebp0Var5, nqn0Var.b, c530.a, tp2.a, xya1.e(btsVar10).g.a, 2, Integer.MAX_VALUE, nqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar10).h.a, 2, Integer.MAX_VALUE, null, btsVar10, intValue9 & 14, 0, 0);
                                    break;
                                }
                            case 9:
                                ibp0 ibp0Var5 = (ibp0) obj;
                                fid fidVar11 = (fid) obj2;
                                int intValue10 = ((Integer) obj3).intValue();
                                if ((intValue10 & 6) == 0) {
                                    intValue10 |= ((bts) fidVar11).k(ibp0Var5) ? 4 : 2;
                                }
                                bts btsVar11 = (bts) fidVar11;
                                if (!btsVar11.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                                    btsVar11.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var5, mja1.a(((mqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar11, intValue10 & 14, 510);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var6 = (ebp0) obj;
                                fid fidVar12 = (fid) obj2;
                                int intValue11 = ((Integer) obj3).intValue();
                                if ((intValue11 & 6) == 0) {
                                    intValue11 |= ((bts) fidVar12).k(ebp0Var6) ? 4 : 2;
                                }
                                bts btsVar12 = (bts) fidVar12;
                                if (!btsVar12.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                                    btsVar12.Y();
                                    break;
                                } else {
                                    mqn0 mqn0Var = (mqn0) qqn0Var2;
                                    p9b1.c(ebp0Var6, mqn0Var.b, c530.a, tp2.a, xya1.e(btsVar12).g.a, 2, Integer.MAX_VALUE, mqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar12).h.a, 2, Integer.MAX_VALUE, null, btsVar12, intValue11 & 14, 0, 0);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), wwg.S(-958492748, true, new zls() { // from class: npn0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        au2 au2Var;
                        int i72 = i10;
                        zy11 zy11Var = zy11.a;
                        qqn0 qqn0Var2 = qqn0Var;
                        switch (i72) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var, ((lqn0) qqn0Var2).a, c530.a, tp2.a, xya1.e(btsVar2).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, null, btsVar2, intValue & 14, 0, 0);
                                    break;
                                }
                            case 1:
                                ibp0 ibp0Var = (ibp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var, mja1.a(((kqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                    break;
                                }
                            case 2:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar4 = (fid) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((bts) fidVar4).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar4 = (bts) fidVar4;
                                if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    kqn0 kqn0Var = (kqn0) qqn0Var2;
                                    p9b1.c(ebp0Var2, kqn0Var.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, kqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, intValue3 & 14, 0, 0);
                                    break;
                                }
                            case 3:
                                ibp0 ibp0Var2 = (ibp0) obj;
                                fid fidVar5 = (fid) obj2;
                                int intValue4 = ((Integer) obj3).intValue();
                                if ((intValue4 & 6) == 0) {
                                    intValue4 |= ((bts) fidVar5).k(ibp0Var2) ? 4 : 2;
                                }
                                bts btsVar5 = (bts) fidVar5;
                                if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                    int i82 = upn0.a[((oqn0) qqn0Var2).c.ordinal()];
                                    if (i82 == 1) {
                                        au2Var = d6b1.a;
                                        if (au2Var == null) {
                                            lgv lgvVar = new lgv("BellL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                            a6t0 a6t0Var = new a6t0(iq2.g);
                                            uq90 e = nnm.e(20.79f, 16.39f);
                                            e.a(5.0f, 5.0f, false, true, 18.64f, 13.0f);
                                            e.i(-0.75f, -4.11f);
                                            e.b(6.0f, 6.0f, false, false, -4.25f, -4.69f);
                                            e.h(13.33f, 2.0f);
                                            e.g(-2.66f);
                                            e.i(-0.32f, 2.23f);
                                            e.b(6.0f, 6.0f, false, false, -4.24f, 4.69f);
                                            e.h(5.36f, 13.0f);
                                            e.b(5.2f, 5.2f, false, true, -2.15f, 3.5f);
                                            e.i(-0.21f, 0.11f);
                                            e.o(18.0f);
                                            e.e(0.0f, 1.1f, 4.0f, 2.0f, 9.0f, 2.0f);
                                            e.n(9.0f, -0.9f, 9.0f, -2.0f);
                                            e.p(-1.5f);
                                            e.c();
                                            e.j(8.43f, 20.81f);
                                            e.b(4.0f, 4.0f, false, false, 7.13f, 0.0f);
                                            e.b(33.0f, 33.0f, false, true, -7.13f, 0.0f);
                                            lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                            au2Var = rya1.a(lgvVar.d(), true);
                                            d6b1.a = au2Var;
                                        }
                                    } else if (i82 == 2) {
                                        au2Var = jgb1.e();
                                    } else if (i82 != 3) {
                                        w511.b();
                                        break;
                                    } else {
                                        au2Var = l9b1.a;
                                        if (au2Var == null) {
                                            lgv lgvVar2 = new lgv("Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                            a6t0 a6t0Var2 = new a6t0(iq2.g);
                                            uq90 uq90Var = new uq90();
                                            uq90Var.j(11.0f, 23.0f);
                                            uq90Var.g(1.5f);
                                            uq90Var.i(5.91f, -6.0f);
                                            uq90Var.i(-5.0f, -5.0f);
                                            uq90Var.i(5.0f, -5.0f);
                                            uq90Var.i(-6.0f, -6.0f);
                                            uq90Var.h(11.0f, 1.0f);
                                            uq90Var.p(8.59f);
                                            uq90Var.i(-3.8f, -3.8f);
                                            uq90Var.i(-1.4f, 1.42f);
                                            uq90Var.h(10.58f, 12.0f);
                                            uq90Var.i(-4.8f, 4.8f);
                                            uq90Var.i(1.42f, 1.4f);
                                            uq90Var.i(3.8f, -3.78f);
                                            uq90Var.c();
                                            uq90Var.j(13.0f, 9.59f);
                                            tse0.u(uq90Var, 15.59f, 7.0f, 13.0f, 4.41f);
                                            uq90Var.j(13.0f, 14.41f);
                                            uq90Var.p(5.18f);
                                            uq90Var.h(15.59f, 17.0f);
                                            uq90Var.c();
                                            lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", uq90Var.a);
                                            au2Var = rya1.a(lgvVar2.d(), true);
                                            l9b1.a = au2Var;
                                        }
                                    }
                                    udb1.c(ibp0Var2, au2Var, null, null, btsVar5, intValue4 & 14, 14);
                                } else {
                                    btsVar5.Y();
                                }
                                break;
                            case 4:
                                ebp0 ebp0Var3 = (ebp0) obj;
                                fid fidVar6 = (fid) obj2;
                                int intValue5 = ((Integer) obj3).intValue();
                                if ((intValue5 & 6) == 0) {
                                    intValue5 |= ((bts) fidVar6).k(ebp0Var3) ? 4 : 2;
                                }
                                bts btsVar6 = (bts) fidVar6;
                                if (!btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                    btsVar6.Y();
                                    break;
                                } else {
                                    oqn0 oqn0Var = (oqn0) qqn0Var2;
                                    p9b1.c(ebp0Var3, oqn0Var.a, c530.a, tp2.a, xya1.e(btsVar6).g.a, 2, Integer.MAX_VALUE, oqn0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar6).h.a, 2, Integer.MAX_VALUE, null, btsVar6, intValue5 & 14, 0, 0);
                                    break;
                                }
                            case 5:
                                ibp0 ibp0Var3 = (ibp0) obj;
                                fid fidVar7 = (fid) obj2;
                                int intValue6 = ((Integer) obj3).intValue();
                                if ((intValue6 & 6) == 0) {
                                    intValue6 |= ((bts) fidVar7).k(ibp0Var3) ? 4 : 2;
                                }
                                bts btsVar7 = (bts) fidVar7;
                                if (!btsVar7.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                                    btsVar7.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var3, mja1.a(((pqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar7, intValue6 & 14, 510);
                                    break;
                                }
                            case 6:
                                ebp0 ebp0Var4 = (ebp0) obj;
                                fid fidVar8 = (fid) obj2;
                                int intValue7 = ((Integer) obj3).intValue();
                                if ((intValue7 & 6) == 0) {
                                    intValue7 |= ((bts) fidVar8).k(ebp0Var4) ? 4 : 2;
                                }
                                bts btsVar8 = (bts) fidVar8;
                                if (!btsVar8.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                                    btsVar8.Y();
                                    break;
                                } else {
                                    pqn0 pqn0Var = (pqn0) qqn0Var2;
                                    p9b1.c(ebp0Var4, pqn0Var.b, c530.a, tp2.a, xya1.e(btsVar8).g.a, 2, Integer.MAX_VALUE, pqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar8).h.a, 2, Integer.MAX_VALUE, null, btsVar8, intValue7 & 14, 0, 0);
                                    break;
                                }
                            case 7:
                                ibp0 ibp0Var4 = (ibp0) obj;
                                fid fidVar9 = (fid) obj2;
                                int intValue8 = ((Integer) obj3).intValue();
                                if ((intValue8 & 6) == 0) {
                                    intValue8 |= ((bts) fidVar9).k(ibp0Var4) ? 4 : 2;
                                }
                                bts btsVar9 = (bts) fidVar9;
                                if (!btsVar9.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                                    btsVar9.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var4, mja1.a(((nqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar9, intValue8 & 14, 510);
                                    break;
                                }
                            case 8:
                                ebp0 ebp0Var5 = (ebp0) obj;
                                fid fidVar10 = (fid) obj2;
                                int intValue9 = ((Integer) obj3).intValue();
                                if ((intValue9 & 6) == 0) {
                                    intValue9 |= ((bts) fidVar10).k(ebp0Var5) ? 4 : 2;
                                }
                                bts btsVar10 = (bts) fidVar10;
                                if (!btsVar10.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                                    btsVar10.Y();
                                    break;
                                } else {
                                    nqn0 nqn0Var = (nqn0) qqn0Var2;
                                    p9b1.c(ebp0Var5, nqn0Var.b, c530.a, tp2.a, xya1.e(btsVar10).g.a, 2, Integer.MAX_VALUE, nqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar10).h.a, 2, Integer.MAX_VALUE, null, btsVar10, intValue9 & 14, 0, 0);
                                    break;
                                }
                            case 9:
                                ibp0 ibp0Var5 = (ibp0) obj;
                                fid fidVar11 = (fid) obj2;
                                int intValue10 = ((Integer) obj3).intValue();
                                if ((intValue10 & 6) == 0) {
                                    intValue10 |= ((bts) fidVar11).k(ibp0Var5) ? 4 : 2;
                                }
                                bts btsVar11 = (bts) fidVar11;
                                if (!btsVar11.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                                    btsVar11.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var5, mja1.a(((mqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar11, intValue10 & 14, 510);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var6 = (ebp0) obj;
                                fid fidVar12 = (fid) obj2;
                                int intValue11 = ((Integer) obj3).intValue();
                                if ((intValue11 & 6) == 0) {
                                    intValue11 |= ((bts) fidVar12).k(ebp0Var6) ? 4 : 2;
                                }
                                bts btsVar12 = (bts) fidVar12;
                                if (!btsVar12.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                                    btsVar12.Y();
                                    break;
                                } else {
                                    mqn0 mqn0Var = (mqn0) qqn0Var2;
                                    p9b1.c(ebp0Var6, mqn0Var.b, c530.a, tp2.a, xya1.e(btsVar12).g.a, 2, Integer.MAX_VALUE, mqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar12).h.a, 2, Integer.MAX_VALUE, null, btsVar12, intValue11 & 14, 0, 0);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, aVar, null, null, false, btsVar, 432, 232);
                btsVar.t(false);
            } else if (qqn0Var instanceof mqn0) {
                btsVar.e0(1941428267);
                androidx.compose.runtime.internal.a aVar2 = na01.a;
                boolean z3 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                Object Q2 = btsVar.Q();
                if (z3 || Q2 == o430Var) {
                    Q2 = new sls() { // from class: opn0
                        @Override // defpackage.sls
                        public final Object invoke() {
                            int i92 = i3;
                            zy11 zy11Var = zy11.a;
                            qqn0 qqn0Var2 = qqn0Var;
                            tls tlsVar2 = tlsVar;
                            switch (i92) {
                                case 0:
                                    oqn0 oqn0Var = (oqn0) qqn0Var2;
                                    tlsVar2.invoke(new wpn0(oqn0Var.c, oqn0Var.d));
                                    break;
                                case 1:
                                    tlsVar2.invoke(new cqn0(((nqn0) qqn0Var2).d));
                                    break;
                                case 2:
                                    tlsVar2.invoke(new bqn0(((mqn0) qqn0Var2).d, true));
                                    break;
                                default:
                                    tlsVar2.invoke(new aqn0(((kqn0) qqn0Var2).d));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q2);
                }
                f530 d = q791.d(c530Var, false, null, null, (sls) Q2, 15);
                final int i11 = 9;
                final int i12 = 10;
                ydb1.a(d, wwg.S(-126326256, true, new zls() { // from class: npn0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        au2 au2Var;
                        int i72 = i11;
                        zy11 zy11Var = zy11.a;
                        qqn0 qqn0Var2 = qqn0Var;
                        switch (i72) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var, ((lqn0) qqn0Var2).a, c530.a, tp2.a, xya1.e(btsVar2).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, null, btsVar2, intValue & 14, 0, 0);
                                    break;
                                }
                            case 1:
                                ibp0 ibp0Var = (ibp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var, mja1.a(((kqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                    break;
                                }
                            case 2:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar4 = (fid) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((bts) fidVar4).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar4 = (bts) fidVar4;
                                if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    kqn0 kqn0Var = (kqn0) qqn0Var2;
                                    p9b1.c(ebp0Var2, kqn0Var.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, kqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, intValue3 & 14, 0, 0);
                                    break;
                                }
                            case 3:
                                ibp0 ibp0Var2 = (ibp0) obj;
                                fid fidVar5 = (fid) obj2;
                                int intValue4 = ((Integer) obj3).intValue();
                                if ((intValue4 & 6) == 0) {
                                    intValue4 |= ((bts) fidVar5).k(ibp0Var2) ? 4 : 2;
                                }
                                bts btsVar5 = (bts) fidVar5;
                                if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                    int i82 = upn0.a[((oqn0) qqn0Var2).c.ordinal()];
                                    if (i82 == 1) {
                                        au2Var = d6b1.a;
                                        if (au2Var == null) {
                                            lgv lgvVar = new lgv("BellL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                            a6t0 a6t0Var = new a6t0(iq2.g);
                                            uq90 e = nnm.e(20.79f, 16.39f);
                                            e.a(5.0f, 5.0f, false, true, 18.64f, 13.0f);
                                            e.i(-0.75f, -4.11f);
                                            e.b(6.0f, 6.0f, false, false, -4.25f, -4.69f);
                                            e.h(13.33f, 2.0f);
                                            e.g(-2.66f);
                                            e.i(-0.32f, 2.23f);
                                            e.b(6.0f, 6.0f, false, false, -4.24f, 4.69f);
                                            e.h(5.36f, 13.0f);
                                            e.b(5.2f, 5.2f, false, true, -2.15f, 3.5f);
                                            e.i(-0.21f, 0.11f);
                                            e.o(18.0f);
                                            e.e(0.0f, 1.1f, 4.0f, 2.0f, 9.0f, 2.0f);
                                            e.n(9.0f, -0.9f, 9.0f, -2.0f);
                                            e.p(-1.5f);
                                            e.c();
                                            e.j(8.43f, 20.81f);
                                            e.b(4.0f, 4.0f, false, false, 7.13f, 0.0f);
                                            e.b(33.0f, 33.0f, false, true, -7.13f, 0.0f);
                                            lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                            au2Var = rya1.a(lgvVar.d(), true);
                                            d6b1.a = au2Var;
                                        }
                                    } else if (i82 == 2) {
                                        au2Var = jgb1.e();
                                    } else if (i82 != 3) {
                                        w511.b();
                                        break;
                                    } else {
                                        au2Var = l9b1.a;
                                        if (au2Var == null) {
                                            lgv lgvVar2 = new lgv("Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                            a6t0 a6t0Var2 = new a6t0(iq2.g);
                                            uq90 uq90Var = new uq90();
                                            uq90Var.j(11.0f, 23.0f);
                                            uq90Var.g(1.5f);
                                            uq90Var.i(5.91f, -6.0f);
                                            uq90Var.i(-5.0f, -5.0f);
                                            uq90Var.i(5.0f, -5.0f);
                                            uq90Var.i(-6.0f, -6.0f);
                                            uq90Var.h(11.0f, 1.0f);
                                            uq90Var.p(8.59f);
                                            uq90Var.i(-3.8f, -3.8f);
                                            uq90Var.i(-1.4f, 1.42f);
                                            uq90Var.h(10.58f, 12.0f);
                                            uq90Var.i(-4.8f, 4.8f);
                                            uq90Var.i(1.42f, 1.4f);
                                            uq90Var.i(3.8f, -3.78f);
                                            uq90Var.c();
                                            uq90Var.j(13.0f, 9.59f);
                                            tse0.u(uq90Var, 15.59f, 7.0f, 13.0f, 4.41f);
                                            uq90Var.j(13.0f, 14.41f);
                                            uq90Var.p(5.18f);
                                            uq90Var.h(15.59f, 17.0f);
                                            uq90Var.c();
                                            lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", uq90Var.a);
                                            au2Var = rya1.a(lgvVar2.d(), true);
                                            l9b1.a = au2Var;
                                        }
                                    }
                                    udb1.c(ibp0Var2, au2Var, null, null, btsVar5, intValue4 & 14, 14);
                                } else {
                                    btsVar5.Y();
                                }
                                break;
                            case 4:
                                ebp0 ebp0Var3 = (ebp0) obj;
                                fid fidVar6 = (fid) obj2;
                                int intValue5 = ((Integer) obj3).intValue();
                                if ((intValue5 & 6) == 0) {
                                    intValue5 |= ((bts) fidVar6).k(ebp0Var3) ? 4 : 2;
                                }
                                bts btsVar6 = (bts) fidVar6;
                                if (!btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                    btsVar6.Y();
                                    break;
                                } else {
                                    oqn0 oqn0Var = (oqn0) qqn0Var2;
                                    p9b1.c(ebp0Var3, oqn0Var.a, c530.a, tp2.a, xya1.e(btsVar6).g.a, 2, Integer.MAX_VALUE, oqn0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar6).h.a, 2, Integer.MAX_VALUE, null, btsVar6, intValue5 & 14, 0, 0);
                                    break;
                                }
                            case 5:
                                ibp0 ibp0Var3 = (ibp0) obj;
                                fid fidVar7 = (fid) obj2;
                                int intValue6 = ((Integer) obj3).intValue();
                                if ((intValue6 & 6) == 0) {
                                    intValue6 |= ((bts) fidVar7).k(ibp0Var3) ? 4 : 2;
                                }
                                bts btsVar7 = (bts) fidVar7;
                                if (!btsVar7.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                                    btsVar7.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var3, mja1.a(((pqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar7, intValue6 & 14, 510);
                                    break;
                                }
                            case 6:
                                ebp0 ebp0Var4 = (ebp0) obj;
                                fid fidVar8 = (fid) obj2;
                                int intValue7 = ((Integer) obj3).intValue();
                                if ((intValue7 & 6) == 0) {
                                    intValue7 |= ((bts) fidVar8).k(ebp0Var4) ? 4 : 2;
                                }
                                bts btsVar8 = (bts) fidVar8;
                                if (!btsVar8.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                                    btsVar8.Y();
                                    break;
                                } else {
                                    pqn0 pqn0Var = (pqn0) qqn0Var2;
                                    p9b1.c(ebp0Var4, pqn0Var.b, c530.a, tp2.a, xya1.e(btsVar8).g.a, 2, Integer.MAX_VALUE, pqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar8).h.a, 2, Integer.MAX_VALUE, null, btsVar8, intValue7 & 14, 0, 0);
                                    break;
                                }
                            case 7:
                                ibp0 ibp0Var4 = (ibp0) obj;
                                fid fidVar9 = (fid) obj2;
                                int intValue8 = ((Integer) obj3).intValue();
                                if ((intValue8 & 6) == 0) {
                                    intValue8 |= ((bts) fidVar9).k(ibp0Var4) ? 4 : 2;
                                }
                                bts btsVar9 = (bts) fidVar9;
                                if (!btsVar9.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                                    btsVar9.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var4, mja1.a(((nqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar9, intValue8 & 14, 510);
                                    break;
                                }
                            case 8:
                                ebp0 ebp0Var5 = (ebp0) obj;
                                fid fidVar10 = (fid) obj2;
                                int intValue9 = ((Integer) obj3).intValue();
                                if ((intValue9 & 6) == 0) {
                                    intValue9 |= ((bts) fidVar10).k(ebp0Var5) ? 4 : 2;
                                }
                                bts btsVar10 = (bts) fidVar10;
                                if (!btsVar10.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                                    btsVar10.Y();
                                    break;
                                } else {
                                    nqn0 nqn0Var = (nqn0) qqn0Var2;
                                    p9b1.c(ebp0Var5, nqn0Var.b, c530.a, tp2.a, xya1.e(btsVar10).g.a, 2, Integer.MAX_VALUE, nqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar10).h.a, 2, Integer.MAX_VALUE, null, btsVar10, intValue9 & 14, 0, 0);
                                    break;
                                }
                            case 9:
                                ibp0 ibp0Var5 = (ibp0) obj;
                                fid fidVar11 = (fid) obj2;
                                int intValue10 = ((Integer) obj3).intValue();
                                if ((intValue10 & 6) == 0) {
                                    intValue10 |= ((bts) fidVar11).k(ibp0Var5) ? 4 : 2;
                                }
                                bts btsVar11 = (bts) fidVar11;
                                if (!btsVar11.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                                    btsVar11.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var5, mja1.a(((mqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar11, intValue10 & 14, 510);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var6 = (ebp0) obj;
                                fid fidVar12 = (fid) obj2;
                                int intValue11 = ((Integer) obj3).intValue();
                                if ((intValue11 & 6) == 0) {
                                    intValue11 |= ((bts) fidVar12).k(ebp0Var6) ? 4 : 2;
                                }
                                bts btsVar12 = (bts) fidVar12;
                                if (!btsVar12.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                                    btsVar12.Y();
                                    break;
                                } else {
                                    mqn0 mqn0Var = (mqn0) qqn0Var2;
                                    p9b1.c(ebp0Var6, mqn0Var.b, c530.a, tp2.a, xya1.e(btsVar12).g.a, 2, Integer.MAX_VALUE, mqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar12).h.a, 2, Integer.MAX_VALUE, null, btsVar12, intValue11 & 14, 0, 0);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), wwg.S(971738101, true, new zls() { // from class: npn0
                    @Override // defpackage.zls
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        au2 au2Var;
                        int i72 = i12;
                        zy11 zy11Var = zy11.a;
                        qqn0 qqn0Var2 = qqn0Var;
                        switch (i72) {
                            case 0:
                                ebp0 ebp0Var = (ebp0) obj;
                                fid fidVar2 = (fid) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                }
                                bts btsVar2 = (bts) fidVar2;
                                if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                    btsVar2.Y();
                                    break;
                                } else {
                                    p9b1.c(ebp0Var, ((lqn0) qqn0Var2).a, c530.a, tp2.a, xya1.e(btsVar2).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, null, btsVar2, intValue & 14, 0, 0);
                                    break;
                                }
                            case 1:
                                ibp0 ibp0Var = (ibp0) obj;
                                fid fidVar3 = (fid) obj2;
                                int intValue2 = ((Integer) obj3).intValue();
                                if ((intValue2 & 6) == 0) {
                                    intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                }
                                bts btsVar3 = (bts) fidVar3;
                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                    btsVar3.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var, mja1.a(((kqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                    break;
                                }
                            case 2:
                                ebp0 ebp0Var2 = (ebp0) obj;
                                fid fidVar4 = (fid) obj2;
                                int intValue3 = ((Integer) obj3).intValue();
                                if ((intValue3 & 6) == 0) {
                                    intValue3 |= ((bts) fidVar4).k(ebp0Var2) ? 4 : 2;
                                }
                                bts btsVar4 = (bts) fidVar4;
                                if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                    btsVar4.Y();
                                    break;
                                } else {
                                    kqn0 kqn0Var = (kqn0) qqn0Var2;
                                    p9b1.c(ebp0Var2, kqn0Var.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, kqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, intValue3 & 14, 0, 0);
                                    break;
                                }
                            case 3:
                                ibp0 ibp0Var2 = (ibp0) obj;
                                fid fidVar5 = (fid) obj2;
                                int intValue4 = ((Integer) obj3).intValue();
                                if ((intValue4 & 6) == 0) {
                                    intValue4 |= ((bts) fidVar5).k(ibp0Var2) ? 4 : 2;
                                }
                                bts btsVar5 = (bts) fidVar5;
                                if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                    int i82 = upn0.a[((oqn0) qqn0Var2).c.ordinal()];
                                    if (i82 == 1) {
                                        au2Var = d6b1.a;
                                        if (au2Var == null) {
                                            lgv lgvVar = new lgv("BellL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                            a6t0 a6t0Var = new a6t0(iq2.g);
                                            uq90 e = nnm.e(20.79f, 16.39f);
                                            e.a(5.0f, 5.0f, false, true, 18.64f, 13.0f);
                                            e.i(-0.75f, -4.11f);
                                            e.b(6.0f, 6.0f, false, false, -4.25f, -4.69f);
                                            e.h(13.33f, 2.0f);
                                            e.g(-2.66f);
                                            e.i(-0.32f, 2.23f);
                                            e.b(6.0f, 6.0f, false, false, -4.24f, 4.69f);
                                            e.h(5.36f, 13.0f);
                                            e.b(5.2f, 5.2f, false, true, -2.15f, 3.5f);
                                            e.i(-0.21f, 0.11f);
                                            e.o(18.0f);
                                            e.e(0.0f, 1.1f, 4.0f, 2.0f, 9.0f, 2.0f);
                                            e.n(9.0f, -0.9f, 9.0f, -2.0f);
                                            e.p(-1.5f);
                                            e.c();
                                            e.j(8.43f, 20.81f);
                                            e.b(4.0f, 4.0f, false, false, 7.13f, 0.0f);
                                            e.b(33.0f, 33.0f, false, true, -7.13f, 0.0f);
                                            lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                            au2Var = rya1.a(lgvVar.d(), true);
                                            d6b1.a = au2Var;
                                        }
                                    } else if (i82 == 2) {
                                        au2Var = jgb1.e();
                                    } else if (i82 != 3) {
                                        w511.b();
                                        break;
                                    } else {
                                        au2Var = l9b1.a;
                                        if (au2Var == null) {
                                            lgv lgvVar2 = new lgv("Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                            a6t0 a6t0Var2 = new a6t0(iq2.g);
                                            uq90 uq90Var = new uq90();
                                            uq90Var.j(11.0f, 23.0f);
                                            uq90Var.g(1.5f);
                                            uq90Var.i(5.91f, -6.0f);
                                            uq90Var.i(-5.0f, -5.0f);
                                            uq90Var.i(5.0f, -5.0f);
                                            uq90Var.i(-6.0f, -6.0f);
                                            uq90Var.h(11.0f, 1.0f);
                                            uq90Var.p(8.59f);
                                            uq90Var.i(-3.8f, -3.8f);
                                            uq90Var.i(-1.4f, 1.42f);
                                            uq90Var.h(10.58f, 12.0f);
                                            uq90Var.i(-4.8f, 4.8f);
                                            uq90Var.i(1.42f, 1.4f);
                                            uq90Var.i(3.8f, -3.78f);
                                            uq90Var.c();
                                            uq90Var.j(13.0f, 9.59f);
                                            tse0.u(uq90Var, 15.59f, 7.0f, 13.0f, 4.41f);
                                            uq90Var.j(13.0f, 14.41f);
                                            uq90Var.p(5.18f);
                                            uq90Var.h(15.59f, 17.0f);
                                            uq90Var.c();
                                            lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", uq90Var.a);
                                            au2Var = rya1.a(lgvVar2.d(), true);
                                            l9b1.a = au2Var;
                                        }
                                    }
                                    udb1.c(ibp0Var2, au2Var, null, null, btsVar5, intValue4 & 14, 14);
                                } else {
                                    btsVar5.Y();
                                }
                                break;
                            case 4:
                                ebp0 ebp0Var3 = (ebp0) obj;
                                fid fidVar6 = (fid) obj2;
                                int intValue5 = ((Integer) obj3).intValue();
                                if ((intValue5 & 6) == 0) {
                                    intValue5 |= ((bts) fidVar6).k(ebp0Var3) ? 4 : 2;
                                }
                                bts btsVar6 = (bts) fidVar6;
                                if (!btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                    btsVar6.Y();
                                    break;
                                } else {
                                    oqn0 oqn0Var = (oqn0) qqn0Var2;
                                    p9b1.c(ebp0Var3, oqn0Var.a, c530.a, tp2.a, xya1.e(btsVar6).g.a, 2, Integer.MAX_VALUE, oqn0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar6).h.a, 2, Integer.MAX_VALUE, null, btsVar6, intValue5 & 14, 0, 0);
                                    break;
                                }
                            case 5:
                                ibp0 ibp0Var3 = (ibp0) obj;
                                fid fidVar7 = (fid) obj2;
                                int intValue6 = ((Integer) obj3).intValue();
                                if ((intValue6 & 6) == 0) {
                                    intValue6 |= ((bts) fidVar7).k(ibp0Var3) ? 4 : 2;
                                }
                                bts btsVar7 = (bts) fidVar7;
                                if (!btsVar7.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                                    btsVar7.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var3, mja1.a(((pqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar7, intValue6 & 14, 510);
                                    break;
                                }
                            case 6:
                                ebp0 ebp0Var4 = (ebp0) obj;
                                fid fidVar8 = (fid) obj2;
                                int intValue7 = ((Integer) obj3).intValue();
                                if ((intValue7 & 6) == 0) {
                                    intValue7 |= ((bts) fidVar8).k(ebp0Var4) ? 4 : 2;
                                }
                                bts btsVar8 = (bts) fidVar8;
                                if (!btsVar8.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                                    btsVar8.Y();
                                    break;
                                } else {
                                    pqn0 pqn0Var = (pqn0) qqn0Var2;
                                    p9b1.c(ebp0Var4, pqn0Var.b, c530.a, tp2.a, xya1.e(btsVar8).g.a, 2, Integer.MAX_VALUE, pqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar8).h.a, 2, Integer.MAX_VALUE, null, btsVar8, intValue7 & 14, 0, 0);
                                    break;
                                }
                            case 7:
                                ibp0 ibp0Var4 = (ibp0) obj;
                                fid fidVar9 = (fid) obj2;
                                int intValue8 = ((Integer) obj3).intValue();
                                if ((intValue8 & 6) == 0) {
                                    intValue8 |= ((bts) fidVar9).k(ibp0Var4) ? 4 : 2;
                                }
                                bts btsVar9 = (bts) fidVar9;
                                if (!btsVar9.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                                    btsVar9.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var4, mja1.a(((nqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar9, intValue8 & 14, 510);
                                    break;
                                }
                            case 8:
                                ebp0 ebp0Var5 = (ebp0) obj;
                                fid fidVar10 = (fid) obj2;
                                int intValue9 = ((Integer) obj3).intValue();
                                if ((intValue9 & 6) == 0) {
                                    intValue9 |= ((bts) fidVar10).k(ebp0Var5) ? 4 : 2;
                                }
                                bts btsVar10 = (bts) fidVar10;
                                if (!btsVar10.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                                    btsVar10.Y();
                                    break;
                                } else {
                                    nqn0 nqn0Var = (nqn0) qqn0Var2;
                                    p9b1.c(ebp0Var5, nqn0Var.b, c530.a, tp2.a, xya1.e(btsVar10).g.a, 2, Integer.MAX_VALUE, nqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar10).h.a, 2, Integer.MAX_VALUE, null, btsVar10, intValue9 & 14, 0, 0);
                                    break;
                                }
                            case 9:
                                ibp0 ibp0Var5 = (ibp0) obj;
                                fid fidVar11 = (fid) obj2;
                                int intValue10 = ((Integer) obj3).intValue();
                                if ((intValue10 & 6) == 0) {
                                    intValue10 |= ((bts) fidVar11).k(ibp0Var5) ? 4 : 2;
                                }
                                bts btsVar11 = (bts) fidVar11;
                                if (!btsVar11.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                                    btsVar11.Y();
                                    break;
                                } else {
                                    tdb1.d(ibp0Var5, mja1.a(((mqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar11, intValue10 & 14, 510);
                                    break;
                                }
                            default:
                                ebp0 ebp0Var6 = (ebp0) obj;
                                fid fidVar12 = (fid) obj2;
                                int intValue11 = ((Integer) obj3).intValue();
                                if ((intValue11 & 6) == 0) {
                                    intValue11 |= ((bts) fidVar12).k(ebp0Var6) ? 4 : 2;
                                }
                                bts btsVar12 = (bts) fidVar12;
                                if (!btsVar12.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                                    btsVar12.Y();
                                    break;
                                } else {
                                    mqn0 mqn0Var = (mqn0) qqn0Var2;
                                    p9b1.c(ebp0Var6, mqn0Var.b, c530.a, tp2.a, xya1.e(btsVar12).g.a, 2, Integer.MAX_VALUE, mqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar12).h.a, 2, Integer.MAX_VALUE, null, btsVar12, intValue11 & 14, 0, 0);
                                    break;
                                }
                        }
                        return zy11Var;
                    }
                }, btsVar), null, aVar2, null, null, false, btsVar, 432, 232);
                btsVar.t(false);
            } else {
                final int i13 = 3;
                if (qqn0Var instanceof kqn0) {
                    btsVar.e0(1941834150);
                    androidx.compose.runtime.internal.a aVar3 = na01.a;
                    boolean z4 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                    Object Q3 = btsVar.Q();
                    if (z4 || Q3 == o430Var) {
                        Q3 = new sls() { // from class: opn0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i92 = i13;
                                zy11 zy11Var = zy11.a;
                                qqn0 qqn0Var2 = qqn0Var;
                                tls tlsVar2 = tlsVar;
                                switch (i92) {
                                    case 0:
                                        oqn0 oqn0Var = (oqn0) qqn0Var2;
                                        tlsVar2.invoke(new wpn0(oqn0Var.c, oqn0Var.d));
                                        break;
                                    case 1:
                                        tlsVar2.invoke(new cqn0(((nqn0) qqn0Var2).d));
                                        break;
                                    case 2:
                                        tlsVar2.invoke(new bqn0(((mqn0) qqn0Var2).d, true));
                                        break;
                                    default:
                                        tlsVar2.invoke(new aqn0(((kqn0) qqn0Var2).d));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar.o0(Q3);
                    }
                    ydb1.a(q791.d(c530Var, false, null, null, (sls) Q3, 15), wwg.S(1803904593, true, new zls() { // from class: npn0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            au2 au2Var;
                            int i72 = i6;
                            zy11 zy11Var = zy11.a;
                            qqn0 qqn0Var2 = qqn0Var;
                            switch (i72) {
                                case 0:
                                    ebp0 ebp0Var = (ebp0) obj;
                                    fid fidVar2 = (fid) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                    }
                                    bts btsVar2 = (bts) fidVar2;
                                    if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                        btsVar2.Y();
                                        break;
                                    } else {
                                        p9b1.c(ebp0Var, ((lqn0) qqn0Var2).a, c530.a, tp2.a, xya1.e(btsVar2).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, null, btsVar2, intValue & 14, 0, 0);
                                        break;
                                    }
                                case 1:
                                    ibp0 ibp0Var = (ibp0) obj;
                                    fid fidVar3 = (fid) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                    }
                                    bts btsVar3 = (bts) fidVar3;
                                    if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var, mja1.a(((kqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                        break;
                                    }
                                case 2:
                                    ebp0 ebp0Var2 = (ebp0) obj;
                                    fid fidVar4 = (fid) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    if ((intValue3 & 6) == 0) {
                                        intValue3 |= ((bts) fidVar4).k(ebp0Var2) ? 4 : 2;
                                    }
                                    bts btsVar4 = (bts) fidVar4;
                                    if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        kqn0 kqn0Var = (kqn0) qqn0Var2;
                                        p9b1.c(ebp0Var2, kqn0Var.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, kqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, intValue3 & 14, 0, 0);
                                        break;
                                    }
                                case 3:
                                    ibp0 ibp0Var2 = (ibp0) obj;
                                    fid fidVar5 = (fid) obj2;
                                    int intValue4 = ((Integer) obj3).intValue();
                                    if ((intValue4 & 6) == 0) {
                                        intValue4 |= ((bts) fidVar5).k(ibp0Var2) ? 4 : 2;
                                    }
                                    bts btsVar5 = (bts) fidVar5;
                                    if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                        int i82 = upn0.a[((oqn0) qqn0Var2).c.ordinal()];
                                        if (i82 == 1) {
                                            au2Var = d6b1.a;
                                            if (au2Var == null) {
                                                lgv lgvVar = new lgv("BellL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                                a6t0 a6t0Var = new a6t0(iq2.g);
                                                uq90 e = nnm.e(20.79f, 16.39f);
                                                e.a(5.0f, 5.0f, false, true, 18.64f, 13.0f);
                                                e.i(-0.75f, -4.11f);
                                                e.b(6.0f, 6.0f, false, false, -4.25f, -4.69f);
                                                e.h(13.33f, 2.0f);
                                                e.g(-2.66f);
                                                e.i(-0.32f, 2.23f);
                                                e.b(6.0f, 6.0f, false, false, -4.24f, 4.69f);
                                                e.h(5.36f, 13.0f);
                                                e.b(5.2f, 5.2f, false, true, -2.15f, 3.5f);
                                                e.i(-0.21f, 0.11f);
                                                e.o(18.0f);
                                                e.e(0.0f, 1.1f, 4.0f, 2.0f, 9.0f, 2.0f);
                                                e.n(9.0f, -0.9f, 9.0f, -2.0f);
                                                e.p(-1.5f);
                                                e.c();
                                                e.j(8.43f, 20.81f);
                                                e.b(4.0f, 4.0f, false, false, 7.13f, 0.0f);
                                                e.b(33.0f, 33.0f, false, true, -7.13f, 0.0f);
                                                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                                au2Var = rya1.a(lgvVar.d(), true);
                                                d6b1.a = au2Var;
                                            }
                                        } else if (i82 == 2) {
                                            au2Var = jgb1.e();
                                        } else if (i82 != 3) {
                                            w511.b();
                                            break;
                                        } else {
                                            au2Var = l9b1.a;
                                            if (au2Var == null) {
                                                lgv lgvVar2 = new lgv("Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                                a6t0 a6t0Var2 = new a6t0(iq2.g);
                                                uq90 uq90Var = new uq90();
                                                uq90Var.j(11.0f, 23.0f);
                                                uq90Var.g(1.5f);
                                                uq90Var.i(5.91f, -6.0f);
                                                uq90Var.i(-5.0f, -5.0f);
                                                uq90Var.i(5.0f, -5.0f);
                                                uq90Var.i(-6.0f, -6.0f);
                                                uq90Var.h(11.0f, 1.0f);
                                                uq90Var.p(8.59f);
                                                uq90Var.i(-3.8f, -3.8f);
                                                uq90Var.i(-1.4f, 1.42f);
                                                uq90Var.h(10.58f, 12.0f);
                                                uq90Var.i(-4.8f, 4.8f);
                                                uq90Var.i(1.42f, 1.4f);
                                                uq90Var.i(3.8f, -3.78f);
                                                uq90Var.c();
                                                uq90Var.j(13.0f, 9.59f);
                                                tse0.u(uq90Var, 15.59f, 7.0f, 13.0f, 4.41f);
                                                uq90Var.j(13.0f, 14.41f);
                                                uq90Var.p(5.18f);
                                                uq90Var.h(15.59f, 17.0f);
                                                uq90Var.c();
                                                lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", uq90Var.a);
                                                au2Var = rya1.a(lgvVar2.d(), true);
                                                l9b1.a = au2Var;
                                            }
                                        }
                                        udb1.c(ibp0Var2, au2Var, null, null, btsVar5, intValue4 & 14, 14);
                                    } else {
                                        btsVar5.Y();
                                    }
                                    break;
                                case 4:
                                    ebp0 ebp0Var3 = (ebp0) obj;
                                    fid fidVar6 = (fid) obj2;
                                    int intValue5 = ((Integer) obj3).intValue();
                                    if ((intValue5 & 6) == 0) {
                                        intValue5 |= ((bts) fidVar6).k(ebp0Var3) ? 4 : 2;
                                    }
                                    bts btsVar6 = (bts) fidVar6;
                                    if (!btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                        btsVar6.Y();
                                        break;
                                    } else {
                                        oqn0 oqn0Var = (oqn0) qqn0Var2;
                                        p9b1.c(ebp0Var3, oqn0Var.a, c530.a, tp2.a, xya1.e(btsVar6).g.a, 2, Integer.MAX_VALUE, oqn0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar6).h.a, 2, Integer.MAX_VALUE, null, btsVar6, intValue5 & 14, 0, 0);
                                        break;
                                    }
                                case 5:
                                    ibp0 ibp0Var3 = (ibp0) obj;
                                    fid fidVar7 = (fid) obj2;
                                    int intValue6 = ((Integer) obj3).intValue();
                                    if ((intValue6 & 6) == 0) {
                                        intValue6 |= ((bts) fidVar7).k(ibp0Var3) ? 4 : 2;
                                    }
                                    bts btsVar7 = (bts) fidVar7;
                                    if (!btsVar7.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                                        btsVar7.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var3, mja1.a(((pqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar7, intValue6 & 14, 510);
                                        break;
                                    }
                                case 6:
                                    ebp0 ebp0Var4 = (ebp0) obj;
                                    fid fidVar8 = (fid) obj2;
                                    int intValue7 = ((Integer) obj3).intValue();
                                    if ((intValue7 & 6) == 0) {
                                        intValue7 |= ((bts) fidVar8).k(ebp0Var4) ? 4 : 2;
                                    }
                                    bts btsVar8 = (bts) fidVar8;
                                    if (!btsVar8.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                                        btsVar8.Y();
                                        break;
                                    } else {
                                        pqn0 pqn0Var = (pqn0) qqn0Var2;
                                        p9b1.c(ebp0Var4, pqn0Var.b, c530.a, tp2.a, xya1.e(btsVar8).g.a, 2, Integer.MAX_VALUE, pqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar8).h.a, 2, Integer.MAX_VALUE, null, btsVar8, intValue7 & 14, 0, 0);
                                        break;
                                    }
                                case 7:
                                    ibp0 ibp0Var4 = (ibp0) obj;
                                    fid fidVar9 = (fid) obj2;
                                    int intValue8 = ((Integer) obj3).intValue();
                                    if ((intValue8 & 6) == 0) {
                                        intValue8 |= ((bts) fidVar9).k(ibp0Var4) ? 4 : 2;
                                    }
                                    bts btsVar9 = (bts) fidVar9;
                                    if (!btsVar9.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                                        btsVar9.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var4, mja1.a(((nqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar9, intValue8 & 14, 510);
                                        break;
                                    }
                                case 8:
                                    ebp0 ebp0Var5 = (ebp0) obj;
                                    fid fidVar10 = (fid) obj2;
                                    int intValue9 = ((Integer) obj3).intValue();
                                    if ((intValue9 & 6) == 0) {
                                        intValue9 |= ((bts) fidVar10).k(ebp0Var5) ? 4 : 2;
                                    }
                                    bts btsVar10 = (bts) fidVar10;
                                    if (!btsVar10.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                                        btsVar10.Y();
                                        break;
                                    } else {
                                        nqn0 nqn0Var = (nqn0) qqn0Var2;
                                        p9b1.c(ebp0Var5, nqn0Var.b, c530.a, tp2.a, xya1.e(btsVar10).g.a, 2, Integer.MAX_VALUE, nqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar10).h.a, 2, Integer.MAX_VALUE, null, btsVar10, intValue9 & 14, 0, 0);
                                        break;
                                    }
                                case 9:
                                    ibp0 ibp0Var5 = (ibp0) obj;
                                    fid fidVar11 = (fid) obj2;
                                    int intValue10 = ((Integer) obj3).intValue();
                                    if ((intValue10 & 6) == 0) {
                                        intValue10 |= ((bts) fidVar11).k(ibp0Var5) ? 4 : 2;
                                    }
                                    bts btsVar11 = (bts) fidVar11;
                                    if (!btsVar11.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                                        btsVar11.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var5, mja1.a(((mqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar11, intValue10 & 14, 510);
                                        break;
                                    }
                                default:
                                    ebp0 ebp0Var6 = (ebp0) obj;
                                    fid fidVar12 = (fid) obj2;
                                    int intValue11 = ((Integer) obj3).intValue();
                                    if ((intValue11 & 6) == 0) {
                                        intValue11 |= ((bts) fidVar12).k(ebp0Var6) ? 4 : 2;
                                    }
                                    bts btsVar12 = (bts) fidVar12;
                                    if (!btsVar12.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                                        btsVar12.Y();
                                        break;
                                    } else {
                                        mqn0 mqn0Var = (mqn0) qqn0Var2;
                                        p9b1.c(ebp0Var6, mqn0Var.b, c530.a, tp2.a, xya1.e(btsVar12).g.a, 2, Integer.MAX_VALUE, mqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar12).h.a, 2, Integer.MAX_VALUE, null, btsVar12, intValue11 & 14, 0, 0);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar), wwg.S(-1392998346, true, new zls() { // from class: npn0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            au2 au2Var;
                            int i72 = i3;
                            zy11 zy11Var = zy11.a;
                            qqn0 qqn0Var2 = qqn0Var;
                            switch (i72) {
                                case 0:
                                    ebp0 ebp0Var = (ebp0) obj;
                                    fid fidVar2 = (fid) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                    }
                                    bts btsVar2 = (bts) fidVar2;
                                    if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                        btsVar2.Y();
                                        break;
                                    } else {
                                        p9b1.c(ebp0Var, ((lqn0) qqn0Var2).a, c530.a, tp2.a, xya1.e(btsVar2).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, null, btsVar2, intValue & 14, 0, 0);
                                        break;
                                    }
                                case 1:
                                    ibp0 ibp0Var = (ibp0) obj;
                                    fid fidVar3 = (fid) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                    }
                                    bts btsVar3 = (bts) fidVar3;
                                    if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var, mja1.a(((kqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                        break;
                                    }
                                case 2:
                                    ebp0 ebp0Var2 = (ebp0) obj;
                                    fid fidVar4 = (fid) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    if ((intValue3 & 6) == 0) {
                                        intValue3 |= ((bts) fidVar4).k(ebp0Var2) ? 4 : 2;
                                    }
                                    bts btsVar4 = (bts) fidVar4;
                                    if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        kqn0 kqn0Var = (kqn0) qqn0Var2;
                                        p9b1.c(ebp0Var2, kqn0Var.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, kqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, intValue3 & 14, 0, 0);
                                        break;
                                    }
                                case 3:
                                    ibp0 ibp0Var2 = (ibp0) obj;
                                    fid fidVar5 = (fid) obj2;
                                    int intValue4 = ((Integer) obj3).intValue();
                                    if ((intValue4 & 6) == 0) {
                                        intValue4 |= ((bts) fidVar5).k(ibp0Var2) ? 4 : 2;
                                    }
                                    bts btsVar5 = (bts) fidVar5;
                                    if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                        int i82 = upn0.a[((oqn0) qqn0Var2).c.ordinal()];
                                        if (i82 == 1) {
                                            au2Var = d6b1.a;
                                            if (au2Var == null) {
                                                lgv lgvVar = new lgv("BellL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                                a6t0 a6t0Var = new a6t0(iq2.g);
                                                uq90 e = nnm.e(20.79f, 16.39f);
                                                e.a(5.0f, 5.0f, false, true, 18.64f, 13.0f);
                                                e.i(-0.75f, -4.11f);
                                                e.b(6.0f, 6.0f, false, false, -4.25f, -4.69f);
                                                e.h(13.33f, 2.0f);
                                                e.g(-2.66f);
                                                e.i(-0.32f, 2.23f);
                                                e.b(6.0f, 6.0f, false, false, -4.24f, 4.69f);
                                                e.h(5.36f, 13.0f);
                                                e.b(5.2f, 5.2f, false, true, -2.15f, 3.5f);
                                                e.i(-0.21f, 0.11f);
                                                e.o(18.0f);
                                                e.e(0.0f, 1.1f, 4.0f, 2.0f, 9.0f, 2.0f);
                                                e.n(9.0f, -0.9f, 9.0f, -2.0f);
                                                e.p(-1.5f);
                                                e.c();
                                                e.j(8.43f, 20.81f);
                                                e.b(4.0f, 4.0f, false, false, 7.13f, 0.0f);
                                                e.b(33.0f, 33.0f, false, true, -7.13f, 0.0f);
                                                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                                au2Var = rya1.a(lgvVar.d(), true);
                                                d6b1.a = au2Var;
                                            }
                                        } else if (i82 == 2) {
                                            au2Var = jgb1.e();
                                        } else if (i82 != 3) {
                                            w511.b();
                                            break;
                                        } else {
                                            au2Var = l9b1.a;
                                            if (au2Var == null) {
                                                lgv lgvVar2 = new lgv("Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                                a6t0 a6t0Var2 = new a6t0(iq2.g);
                                                uq90 uq90Var = new uq90();
                                                uq90Var.j(11.0f, 23.0f);
                                                uq90Var.g(1.5f);
                                                uq90Var.i(5.91f, -6.0f);
                                                uq90Var.i(-5.0f, -5.0f);
                                                uq90Var.i(5.0f, -5.0f);
                                                uq90Var.i(-6.0f, -6.0f);
                                                uq90Var.h(11.0f, 1.0f);
                                                uq90Var.p(8.59f);
                                                uq90Var.i(-3.8f, -3.8f);
                                                uq90Var.i(-1.4f, 1.42f);
                                                uq90Var.h(10.58f, 12.0f);
                                                uq90Var.i(-4.8f, 4.8f);
                                                uq90Var.i(1.42f, 1.4f);
                                                uq90Var.i(3.8f, -3.78f);
                                                uq90Var.c();
                                                uq90Var.j(13.0f, 9.59f);
                                                tse0.u(uq90Var, 15.59f, 7.0f, 13.0f, 4.41f);
                                                uq90Var.j(13.0f, 14.41f);
                                                uq90Var.p(5.18f);
                                                uq90Var.h(15.59f, 17.0f);
                                                uq90Var.c();
                                                lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", uq90Var.a);
                                                au2Var = rya1.a(lgvVar2.d(), true);
                                                l9b1.a = au2Var;
                                            }
                                        }
                                        udb1.c(ibp0Var2, au2Var, null, null, btsVar5, intValue4 & 14, 14);
                                    } else {
                                        btsVar5.Y();
                                    }
                                    break;
                                case 4:
                                    ebp0 ebp0Var3 = (ebp0) obj;
                                    fid fidVar6 = (fid) obj2;
                                    int intValue5 = ((Integer) obj3).intValue();
                                    if ((intValue5 & 6) == 0) {
                                        intValue5 |= ((bts) fidVar6).k(ebp0Var3) ? 4 : 2;
                                    }
                                    bts btsVar6 = (bts) fidVar6;
                                    if (!btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                        btsVar6.Y();
                                        break;
                                    } else {
                                        oqn0 oqn0Var = (oqn0) qqn0Var2;
                                        p9b1.c(ebp0Var3, oqn0Var.a, c530.a, tp2.a, xya1.e(btsVar6).g.a, 2, Integer.MAX_VALUE, oqn0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar6).h.a, 2, Integer.MAX_VALUE, null, btsVar6, intValue5 & 14, 0, 0);
                                        break;
                                    }
                                case 5:
                                    ibp0 ibp0Var3 = (ibp0) obj;
                                    fid fidVar7 = (fid) obj2;
                                    int intValue6 = ((Integer) obj3).intValue();
                                    if ((intValue6 & 6) == 0) {
                                        intValue6 |= ((bts) fidVar7).k(ibp0Var3) ? 4 : 2;
                                    }
                                    bts btsVar7 = (bts) fidVar7;
                                    if (!btsVar7.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                                        btsVar7.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var3, mja1.a(((pqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar7, intValue6 & 14, 510);
                                        break;
                                    }
                                case 6:
                                    ebp0 ebp0Var4 = (ebp0) obj;
                                    fid fidVar8 = (fid) obj2;
                                    int intValue7 = ((Integer) obj3).intValue();
                                    if ((intValue7 & 6) == 0) {
                                        intValue7 |= ((bts) fidVar8).k(ebp0Var4) ? 4 : 2;
                                    }
                                    bts btsVar8 = (bts) fidVar8;
                                    if (!btsVar8.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                                        btsVar8.Y();
                                        break;
                                    } else {
                                        pqn0 pqn0Var = (pqn0) qqn0Var2;
                                        p9b1.c(ebp0Var4, pqn0Var.b, c530.a, tp2.a, xya1.e(btsVar8).g.a, 2, Integer.MAX_VALUE, pqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar8).h.a, 2, Integer.MAX_VALUE, null, btsVar8, intValue7 & 14, 0, 0);
                                        break;
                                    }
                                case 7:
                                    ibp0 ibp0Var4 = (ibp0) obj;
                                    fid fidVar9 = (fid) obj2;
                                    int intValue8 = ((Integer) obj3).intValue();
                                    if ((intValue8 & 6) == 0) {
                                        intValue8 |= ((bts) fidVar9).k(ibp0Var4) ? 4 : 2;
                                    }
                                    bts btsVar9 = (bts) fidVar9;
                                    if (!btsVar9.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                                        btsVar9.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var4, mja1.a(((nqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar9, intValue8 & 14, 510);
                                        break;
                                    }
                                case 8:
                                    ebp0 ebp0Var5 = (ebp0) obj;
                                    fid fidVar10 = (fid) obj2;
                                    int intValue9 = ((Integer) obj3).intValue();
                                    if ((intValue9 & 6) == 0) {
                                        intValue9 |= ((bts) fidVar10).k(ebp0Var5) ? 4 : 2;
                                    }
                                    bts btsVar10 = (bts) fidVar10;
                                    if (!btsVar10.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                                        btsVar10.Y();
                                        break;
                                    } else {
                                        nqn0 nqn0Var = (nqn0) qqn0Var2;
                                        p9b1.c(ebp0Var5, nqn0Var.b, c530.a, tp2.a, xya1.e(btsVar10).g.a, 2, Integer.MAX_VALUE, nqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar10).h.a, 2, Integer.MAX_VALUE, null, btsVar10, intValue9 & 14, 0, 0);
                                        break;
                                    }
                                case 9:
                                    ibp0 ibp0Var5 = (ibp0) obj;
                                    fid fidVar11 = (fid) obj2;
                                    int intValue10 = ((Integer) obj3).intValue();
                                    if ((intValue10 & 6) == 0) {
                                        intValue10 |= ((bts) fidVar11).k(ibp0Var5) ? 4 : 2;
                                    }
                                    bts btsVar11 = (bts) fidVar11;
                                    if (!btsVar11.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                                        btsVar11.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var5, mja1.a(((mqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar11, intValue10 & 14, 510);
                                        break;
                                    }
                                default:
                                    ebp0 ebp0Var6 = (ebp0) obj;
                                    fid fidVar12 = (fid) obj2;
                                    int intValue11 = ((Integer) obj3).intValue();
                                    if ((intValue11 & 6) == 0) {
                                        intValue11 |= ((bts) fidVar12).k(ebp0Var6) ? 4 : 2;
                                    }
                                    bts btsVar12 = (bts) fidVar12;
                                    if (!btsVar12.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                                        btsVar12.Y();
                                        break;
                                    } else {
                                        mqn0 mqn0Var = (mqn0) qqn0Var2;
                                        p9b1.c(ebp0Var6, mqn0Var.b, c530.a, tp2.a, xya1.e(btsVar12).g.a, 2, Integer.MAX_VALUE, mqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar12).h.a, 2, Integer.MAX_VALUE, null, btsVar12, intValue11 & 14, 0, 0);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar), null, aVar3, null, null, false, btsVar, 432, 232);
                    btsVar.t(false);
                } else {
                    if (!(qqn0Var instanceof oqn0)) {
                        throw unr0.y(893885100, btsVar, false);
                    }
                    btsVar.e0(1942215047);
                    boolean z5 = ((oqn0) qqn0Var).d == 0;
                    boolean z6 = ((i2 & 14) == 4) | ((i2 & 112) == 32);
                    Object Q4 = btsVar.Q();
                    if (z6 || Q4 == o430Var) {
                        Q4 = new sls() { // from class: opn0
                            @Override // defpackage.sls
                            public final Object invoke() {
                                int i92 = i5;
                                zy11 zy11Var = zy11.a;
                                qqn0 qqn0Var2 = qqn0Var;
                                tls tlsVar2 = tlsVar;
                                switch (i92) {
                                    case 0:
                                        oqn0 oqn0Var = (oqn0) qqn0Var2;
                                        tlsVar2.invoke(new wpn0(oqn0Var.c, oqn0Var.d));
                                        break;
                                    case 1:
                                        tlsVar2.invoke(new cqn0(((nqn0) qqn0Var2).d));
                                        break;
                                    case 2:
                                        tlsVar2.invoke(new bqn0(((mqn0) qqn0Var2).d, true));
                                        break;
                                    default:
                                        tlsVar2.invoke(new aqn0(((kqn0) qqn0Var2).d));
                                        break;
                                }
                                return zy11Var;
                            }
                        };
                        btsVar.o0(Q4);
                    }
                    sls slsVar = (sls) Q4;
                    ydb1.a(q791.d(c530Var, false, null, null, slsVar, 15), wwg.S(564755562, true, new zls() { // from class: npn0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            au2 au2Var;
                            int i72 = i13;
                            zy11 zy11Var = zy11.a;
                            qqn0 qqn0Var2 = qqn0Var;
                            switch (i72) {
                                case 0:
                                    ebp0 ebp0Var = (ebp0) obj;
                                    fid fidVar2 = (fid) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                    }
                                    bts btsVar2 = (bts) fidVar2;
                                    if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                        btsVar2.Y();
                                        break;
                                    } else {
                                        p9b1.c(ebp0Var, ((lqn0) qqn0Var2).a, c530.a, tp2.a, xya1.e(btsVar2).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, null, btsVar2, intValue & 14, 0, 0);
                                        break;
                                    }
                                case 1:
                                    ibp0 ibp0Var = (ibp0) obj;
                                    fid fidVar3 = (fid) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                    }
                                    bts btsVar3 = (bts) fidVar3;
                                    if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var, mja1.a(((kqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                        break;
                                    }
                                case 2:
                                    ebp0 ebp0Var2 = (ebp0) obj;
                                    fid fidVar4 = (fid) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    if ((intValue3 & 6) == 0) {
                                        intValue3 |= ((bts) fidVar4).k(ebp0Var2) ? 4 : 2;
                                    }
                                    bts btsVar4 = (bts) fidVar4;
                                    if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        kqn0 kqn0Var = (kqn0) qqn0Var2;
                                        p9b1.c(ebp0Var2, kqn0Var.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, kqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, intValue3 & 14, 0, 0);
                                        break;
                                    }
                                case 3:
                                    ibp0 ibp0Var2 = (ibp0) obj;
                                    fid fidVar5 = (fid) obj2;
                                    int intValue4 = ((Integer) obj3).intValue();
                                    if ((intValue4 & 6) == 0) {
                                        intValue4 |= ((bts) fidVar5).k(ibp0Var2) ? 4 : 2;
                                    }
                                    bts btsVar5 = (bts) fidVar5;
                                    if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                        int i82 = upn0.a[((oqn0) qqn0Var2).c.ordinal()];
                                        if (i82 == 1) {
                                            au2Var = d6b1.a;
                                            if (au2Var == null) {
                                                lgv lgvVar = new lgv("BellL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                                a6t0 a6t0Var = new a6t0(iq2.g);
                                                uq90 e = nnm.e(20.79f, 16.39f);
                                                e.a(5.0f, 5.0f, false, true, 18.64f, 13.0f);
                                                e.i(-0.75f, -4.11f);
                                                e.b(6.0f, 6.0f, false, false, -4.25f, -4.69f);
                                                e.h(13.33f, 2.0f);
                                                e.g(-2.66f);
                                                e.i(-0.32f, 2.23f);
                                                e.b(6.0f, 6.0f, false, false, -4.24f, 4.69f);
                                                e.h(5.36f, 13.0f);
                                                e.b(5.2f, 5.2f, false, true, -2.15f, 3.5f);
                                                e.i(-0.21f, 0.11f);
                                                e.o(18.0f);
                                                e.e(0.0f, 1.1f, 4.0f, 2.0f, 9.0f, 2.0f);
                                                e.n(9.0f, -0.9f, 9.0f, -2.0f);
                                                e.p(-1.5f);
                                                e.c();
                                                e.j(8.43f, 20.81f);
                                                e.b(4.0f, 4.0f, false, false, 7.13f, 0.0f);
                                                e.b(33.0f, 33.0f, false, true, -7.13f, 0.0f);
                                                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                                au2Var = rya1.a(lgvVar.d(), true);
                                                d6b1.a = au2Var;
                                            }
                                        } else if (i82 == 2) {
                                            au2Var = jgb1.e();
                                        } else if (i82 != 3) {
                                            w511.b();
                                            break;
                                        } else {
                                            au2Var = l9b1.a;
                                            if (au2Var == null) {
                                                lgv lgvVar2 = new lgv("Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                                a6t0 a6t0Var2 = new a6t0(iq2.g);
                                                uq90 uq90Var = new uq90();
                                                uq90Var.j(11.0f, 23.0f);
                                                uq90Var.g(1.5f);
                                                uq90Var.i(5.91f, -6.0f);
                                                uq90Var.i(-5.0f, -5.0f);
                                                uq90Var.i(5.0f, -5.0f);
                                                uq90Var.i(-6.0f, -6.0f);
                                                uq90Var.h(11.0f, 1.0f);
                                                uq90Var.p(8.59f);
                                                uq90Var.i(-3.8f, -3.8f);
                                                uq90Var.i(-1.4f, 1.42f);
                                                uq90Var.h(10.58f, 12.0f);
                                                uq90Var.i(-4.8f, 4.8f);
                                                uq90Var.i(1.42f, 1.4f);
                                                uq90Var.i(3.8f, -3.78f);
                                                uq90Var.c();
                                                uq90Var.j(13.0f, 9.59f);
                                                tse0.u(uq90Var, 15.59f, 7.0f, 13.0f, 4.41f);
                                                uq90Var.j(13.0f, 14.41f);
                                                uq90Var.p(5.18f);
                                                uq90Var.h(15.59f, 17.0f);
                                                uq90Var.c();
                                                lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", uq90Var.a);
                                                au2Var = rya1.a(lgvVar2.d(), true);
                                                l9b1.a = au2Var;
                                            }
                                        }
                                        udb1.c(ibp0Var2, au2Var, null, null, btsVar5, intValue4 & 14, 14);
                                    } else {
                                        btsVar5.Y();
                                    }
                                    break;
                                case 4:
                                    ebp0 ebp0Var3 = (ebp0) obj;
                                    fid fidVar6 = (fid) obj2;
                                    int intValue5 = ((Integer) obj3).intValue();
                                    if ((intValue5 & 6) == 0) {
                                        intValue5 |= ((bts) fidVar6).k(ebp0Var3) ? 4 : 2;
                                    }
                                    bts btsVar6 = (bts) fidVar6;
                                    if (!btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                        btsVar6.Y();
                                        break;
                                    } else {
                                        oqn0 oqn0Var = (oqn0) qqn0Var2;
                                        p9b1.c(ebp0Var3, oqn0Var.a, c530.a, tp2.a, xya1.e(btsVar6).g.a, 2, Integer.MAX_VALUE, oqn0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar6).h.a, 2, Integer.MAX_VALUE, null, btsVar6, intValue5 & 14, 0, 0);
                                        break;
                                    }
                                case 5:
                                    ibp0 ibp0Var3 = (ibp0) obj;
                                    fid fidVar7 = (fid) obj2;
                                    int intValue6 = ((Integer) obj3).intValue();
                                    if ((intValue6 & 6) == 0) {
                                        intValue6 |= ((bts) fidVar7).k(ibp0Var3) ? 4 : 2;
                                    }
                                    bts btsVar7 = (bts) fidVar7;
                                    if (!btsVar7.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                                        btsVar7.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var3, mja1.a(((pqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar7, intValue6 & 14, 510);
                                        break;
                                    }
                                case 6:
                                    ebp0 ebp0Var4 = (ebp0) obj;
                                    fid fidVar8 = (fid) obj2;
                                    int intValue7 = ((Integer) obj3).intValue();
                                    if ((intValue7 & 6) == 0) {
                                        intValue7 |= ((bts) fidVar8).k(ebp0Var4) ? 4 : 2;
                                    }
                                    bts btsVar8 = (bts) fidVar8;
                                    if (!btsVar8.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                                        btsVar8.Y();
                                        break;
                                    } else {
                                        pqn0 pqn0Var = (pqn0) qqn0Var2;
                                        p9b1.c(ebp0Var4, pqn0Var.b, c530.a, tp2.a, xya1.e(btsVar8).g.a, 2, Integer.MAX_VALUE, pqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar8).h.a, 2, Integer.MAX_VALUE, null, btsVar8, intValue7 & 14, 0, 0);
                                        break;
                                    }
                                case 7:
                                    ibp0 ibp0Var4 = (ibp0) obj;
                                    fid fidVar9 = (fid) obj2;
                                    int intValue8 = ((Integer) obj3).intValue();
                                    if ((intValue8 & 6) == 0) {
                                        intValue8 |= ((bts) fidVar9).k(ibp0Var4) ? 4 : 2;
                                    }
                                    bts btsVar9 = (bts) fidVar9;
                                    if (!btsVar9.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                                        btsVar9.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var4, mja1.a(((nqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar9, intValue8 & 14, 510);
                                        break;
                                    }
                                case 8:
                                    ebp0 ebp0Var5 = (ebp0) obj;
                                    fid fidVar10 = (fid) obj2;
                                    int intValue9 = ((Integer) obj3).intValue();
                                    if ((intValue9 & 6) == 0) {
                                        intValue9 |= ((bts) fidVar10).k(ebp0Var5) ? 4 : 2;
                                    }
                                    bts btsVar10 = (bts) fidVar10;
                                    if (!btsVar10.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                                        btsVar10.Y();
                                        break;
                                    } else {
                                        nqn0 nqn0Var = (nqn0) qqn0Var2;
                                        p9b1.c(ebp0Var5, nqn0Var.b, c530.a, tp2.a, xya1.e(btsVar10).g.a, 2, Integer.MAX_VALUE, nqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar10).h.a, 2, Integer.MAX_VALUE, null, btsVar10, intValue9 & 14, 0, 0);
                                        break;
                                    }
                                case 9:
                                    ibp0 ibp0Var5 = (ibp0) obj;
                                    fid fidVar11 = (fid) obj2;
                                    int intValue10 = ((Integer) obj3).intValue();
                                    if ((intValue10 & 6) == 0) {
                                        intValue10 |= ((bts) fidVar11).k(ibp0Var5) ? 4 : 2;
                                    }
                                    bts btsVar11 = (bts) fidVar11;
                                    if (!btsVar11.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                                        btsVar11.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var5, mja1.a(((mqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar11, intValue10 & 14, 510);
                                        break;
                                    }
                                default:
                                    ebp0 ebp0Var6 = (ebp0) obj;
                                    fid fidVar12 = (fid) obj2;
                                    int intValue11 = ((Integer) obj3).intValue();
                                    if ((intValue11 & 6) == 0) {
                                        intValue11 |= ((bts) fidVar12).k(ebp0Var6) ? 4 : 2;
                                    }
                                    bts btsVar12 = (bts) fidVar12;
                                    if (!btsVar12.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                                        btsVar12.Y();
                                        break;
                                    } else {
                                        mqn0 mqn0Var = (mqn0) qqn0Var2;
                                        p9b1.c(ebp0Var6, mqn0Var.b, c530.a, tp2.a, xya1.e(btsVar12).g.a, 2, Integer.MAX_VALUE, mqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar12).h.a, 2, Integer.MAX_VALUE, null, btsVar12, intValue11 & 14, 0, 0);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar), wwg.S(-1884944155, true, new zls() { // from class: npn0
                        @Override // defpackage.zls
                        public final Object invoke(Object obj, Object obj2, Object obj3) {
                            au2 au2Var;
                            int i72 = i4;
                            zy11 zy11Var = zy11.a;
                            qqn0 qqn0Var2 = qqn0Var;
                            switch (i72) {
                                case 0:
                                    ebp0 ebp0Var = (ebp0) obj;
                                    fid fidVar2 = (fid) obj2;
                                    int intValue = ((Integer) obj3).intValue();
                                    if ((intValue & 6) == 0) {
                                        intValue |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                                    }
                                    bts btsVar2 = (bts) fidVar2;
                                    if (!btsVar2.V(intValue & 1, (intValue & 19) != 18)) {
                                        btsVar2.Y();
                                        break;
                                    } else {
                                        p9b1.c(ebp0Var, ((lqn0) qqn0Var2).a, c530.a, tp2.a, xya1.e(btsVar2).f.c, 2, Integer.MAX_VALUE, "", AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 2, Integer.MAX_VALUE, null, btsVar2, intValue & 14, 0, 0);
                                        break;
                                    }
                                case 1:
                                    ibp0 ibp0Var = (ibp0) obj;
                                    fid fidVar3 = (fid) obj2;
                                    int intValue2 = ((Integer) obj3).intValue();
                                    if ((intValue2 & 6) == 0) {
                                        intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                    }
                                    bts btsVar3 = (bts) fidVar3;
                                    if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                        btsVar3.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var, mja1.a(((kqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                        break;
                                    }
                                case 2:
                                    ebp0 ebp0Var2 = (ebp0) obj;
                                    fid fidVar4 = (fid) obj2;
                                    int intValue3 = ((Integer) obj3).intValue();
                                    if ((intValue3 & 6) == 0) {
                                        intValue3 |= ((bts) fidVar4).k(ebp0Var2) ? 4 : 2;
                                    }
                                    bts btsVar4 = (bts) fidVar4;
                                    if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                        btsVar4.Y();
                                        break;
                                    } else {
                                        kqn0 kqn0Var = (kqn0) qqn0Var2;
                                        p9b1.c(ebp0Var2, kqn0Var.b, c530.a, tp2.a, xya1.e(btsVar4).g.a, 2, Integer.MAX_VALUE, kqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar4).h.a, 2, Integer.MAX_VALUE, null, btsVar4, intValue3 & 14, 0, 0);
                                        break;
                                    }
                                case 3:
                                    ibp0 ibp0Var2 = (ibp0) obj;
                                    fid fidVar5 = (fid) obj2;
                                    int intValue4 = ((Integer) obj3).intValue();
                                    if ((intValue4 & 6) == 0) {
                                        intValue4 |= ((bts) fidVar5).k(ibp0Var2) ? 4 : 2;
                                    }
                                    bts btsVar5 = (bts) fidVar5;
                                    if (btsVar5.V(intValue4 & 1, (intValue4 & 19) != 18)) {
                                        int i82 = upn0.a[((oqn0) qqn0Var2).c.ordinal()];
                                        if (i82 == 1) {
                                            au2Var = d6b1.a;
                                            if (au2Var == null) {
                                                lgv lgvVar = new lgv("BellL", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                                a6t0 a6t0Var = new a6t0(iq2.g);
                                                uq90 e = nnm.e(20.79f, 16.39f);
                                                e.a(5.0f, 5.0f, false, true, 18.64f, 13.0f);
                                                e.i(-0.75f, -4.11f);
                                                e.b(6.0f, 6.0f, false, false, -4.25f, -4.69f);
                                                e.h(13.33f, 2.0f);
                                                e.g(-2.66f);
                                                e.i(-0.32f, 2.23f);
                                                e.b(6.0f, 6.0f, false, false, -4.24f, 4.69f);
                                                e.h(5.36f, 13.0f);
                                                e.b(5.2f, 5.2f, false, true, -2.15f, 3.5f);
                                                e.i(-0.21f, 0.11f);
                                                e.o(18.0f);
                                                e.e(0.0f, 1.1f, 4.0f, 2.0f, 9.0f, 2.0f);
                                                e.n(9.0f, -0.9f, 9.0f, -2.0f);
                                                e.p(-1.5f);
                                                e.c();
                                                e.j(8.43f, 20.81f);
                                                e.b(4.0f, 4.0f, false, false, 7.13f, 0.0f);
                                                e.b(33.0f, 33.0f, false, true, -7.13f, 0.0f);
                                                lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 0, 0, 0, a6t0Var, null, "", e.a);
                                                au2Var = rya1.a(lgvVar.d(), true);
                                                d6b1.a = au2Var;
                                            }
                                        } else if (i82 == 2) {
                                            au2Var = jgb1.e();
                                        } else if (i82 != 3) {
                                            w511.b();
                                            break;
                                        } else {
                                            au2Var = l9b1.a;
                                            if (au2Var == null) {
                                                lgv lgvVar2 = new lgv("Bluetooth", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
                                                a6t0 a6t0Var2 = new a6t0(iq2.g);
                                                uq90 uq90Var = new uq90();
                                                uq90Var.j(11.0f, 23.0f);
                                                uq90Var.g(1.5f);
                                                uq90Var.i(5.91f, -6.0f);
                                                uq90Var.i(-5.0f, -5.0f);
                                                uq90Var.i(5.0f, -5.0f);
                                                uq90Var.i(-6.0f, -6.0f);
                                                uq90Var.h(11.0f, 1.0f);
                                                uq90Var.p(8.59f);
                                                uq90Var.i(-3.8f, -3.8f);
                                                uq90Var.i(-1.4f, 1.42f);
                                                uq90Var.h(10.58f, 12.0f);
                                                uq90Var.i(-4.8f, 4.8f);
                                                uq90Var.i(1.42f, 1.4f);
                                                uq90Var.i(3.8f, -3.78f);
                                                uq90Var.c();
                                                uq90Var.j(13.0f, 9.59f);
                                                tse0.u(uq90Var, 15.59f, 7.0f, 13.0f, 4.41f);
                                                uq90Var.j(13.0f, 14.41f);
                                                uq90Var.p(5.18f);
                                                uq90Var.h(15.59f, 17.0f);
                                                uq90Var.c();
                                                lgvVar2.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var2, null, "", uq90Var.a);
                                                au2Var = rya1.a(lgvVar2.d(), true);
                                                l9b1.a = au2Var;
                                            }
                                        }
                                        udb1.c(ibp0Var2, au2Var, null, null, btsVar5, intValue4 & 14, 14);
                                    } else {
                                        btsVar5.Y();
                                    }
                                    break;
                                case 4:
                                    ebp0 ebp0Var3 = (ebp0) obj;
                                    fid fidVar6 = (fid) obj2;
                                    int intValue5 = ((Integer) obj3).intValue();
                                    if ((intValue5 & 6) == 0) {
                                        intValue5 |= ((bts) fidVar6).k(ebp0Var3) ? 4 : 2;
                                    }
                                    bts btsVar6 = (bts) fidVar6;
                                    if (!btsVar6.V(intValue5 & 1, (intValue5 & 19) != 18)) {
                                        btsVar6.Y();
                                        break;
                                    } else {
                                        oqn0 oqn0Var = (oqn0) qqn0Var2;
                                        p9b1.c(ebp0Var3, oqn0Var.a, c530.a, tp2.a, xya1.e(btsVar6).g.a, 2, Integer.MAX_VALUE, oqn0Var.b, AppColor$Palette.TextMinor, xya1.e(btsVar6).h.a, 2, Integer.MAX_VALUE, null, btsVar6, intValue5 & 14, 0, 0);
                                        break;
                                    }
                                case 5:
                                    ibp0 ibp0Var3 = (ibp0) obj;
                                    fid fidVar7 = (fid) obj2;
                                    int intValue6 = ((Integer) obj3).intValue();
                                    if ((intValue6 & 6) == 0) {
                                        intValue6 |= ((bts) fidVar7).k(ibp0Var3) ? 4 : 2;
                                    }
                                    bts btsVar7 = (bts) fidVar7;
                                    if (!btsVar7.V(intValue6 & 1, (intValue6 & 19) != 18)) {
                                        btsVar7.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var3, mja1.a(((pqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar7, intValue6 & 14, 510);
                                        break;
                                    }
                                case 6:
                                    ebp0 ebp0Var4 = (ebp0) obj;
                                    fid fidVar8 = (fid) obj2;
                                    int intValue7 = ((Integer) obj3).intValue();
                                    if ((intValue7 & 6) == 0) {
                                        intValue7 |= ((bts) fidVar8).k(ebp0Var4) ? 4 : 2;
                                    }
                                    bts btsVar8 = (bts) fidVar8;
                                    if (!btsVar8.V(intValue7 & 1, (intValue7 & 19) != 18)) {
                                        btsVar8.Y();
                                        break;
                                    } else {
                                        pqn0 pqn0Var = (pqn0) qqn0Var2;
                                        p9b1.c(ebp0Var4, pqn0Var.b, c530.a, tp2.a, xya1.e(btsVar8).g.a, 2, Integer.MAX_VALUE, pqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar8).h.a, 2, Integer.MAX_VALUE, null, btsVar8, intValue7 & 14, 0, 0);
                                        break;
                                    }
                                case 7:
                                    ibp0 ibp0Var4 = (ibp0) obj;
                                    fid fidVar9 = (fid) obj2;
                                    int intValue8 = ((Integer) obj3).intValue();
                                    if ((intValue8 & 6) == 0) {
                                        intValue8 |= ((bts) fidVar9).k(ibp0Var4) ? 4 : 2;
                                    }
                                    bts btsVar9 = (bts) fidVar9;
                                    if (!btsVar9.V(intValue8 & 1, (intValue8 & 19) != 18)) {
                                        btsVar9.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var4, mja1.a(((nqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar9, intValue8 & 14, 510);
                                        break;
                                    }
                                case 8:
                                    ebp0 ebp0Var5 = (ebp0) obj;
                                    fid fidVar10 = (fid) obj2;
                                    int intValue9 = ((Integer) obj3).intValue();
                                    if ((intValue9 & 6) == 0) {
                                        intValue9 |= ((bts) fidVar10).k(ebp0Var5) ? 4 : 2;
                                    }
                                    bts btsVar10 = (bts) fidVar10;
                                    if (!btsVar10.V(intValue9 & 1, (intValue9 & 19) != 18)) {
                                        btsVar10.Y();
                                        break;
                                    } else {
                                        nqn0 nqn0Var = (nqn0) qqn0Var2;
                                        p9b1.c(ebp0Var5, nqn0Var.b, c530.a, tp2.a, xya1.e(btsVar10).g.a, 2, Integer.MAX_VALUE, nqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar10).h.a, 2, Integer.MAX_VALUE, null, btsVar10, intValue9 & 14, 0, 0);
                                        break;
                                    }
                                case 9:
                                    ibp0 ibp0Var5 = (ibp0) obj;
                                    fid fidVar11 = (fid) obj2;
                                    int intValue10 = ((Integer) obj3).intValue();
                                    if ((intValue10 & 6) == 0) {
                                        intValue10 |= ((bts) fidVar11).k(ibp0Var5) ? 4 : 2;
                                    }
                                    bts btsVar11 = (bts) fidVar11;
                                    if (!btsVar11.V(intValue10 & 1, (intValue10 & 19) != 18)) {
                                        btsVar11.Y();
                                        break;
                                    } else {
                                        tdb1.d(ibp0Var5, mja1.a(((mqn0) qqn0Var2).a, null, 6), null, null, null, null, 0.0f, 0, null, btsVar11, intValue10 & 14, 510);
                                        break;
                                    }
                                default:
                                    ebp0 ebp0Var6 = (ebp0) obj;
                                    fid fidVar12 = (fid) obj2;
                                    int intValue11 = ((Integer) obj3).intValue();
                                    if ((intValue11 & 6) == 0) {
                                        intValue11 |= ((bts) fidVar12).k(ebp0Var6) ? 4 : 2;
                                    }
                                    bts btsVar12 = (bts) fidVar12;
                                    if (!btsVar12.V(intValue11 & 1, (intValue11 & 19) != 18)) {
                                        btsVar12.Y();
                                        break;
                                    } else {
                                        mqn0 mqn0Var = (mqn0) qqn0Var2;
                                        p9b1.c(ebp0Var6, mqn0Var.b, c530.a, tp2.a, xya1.e(btsVar12).g.a, 2, Integer.MAX_VALUE, mqn0Var.c, AppColor$Palette.TextMinor, xya1.e(btsVar12).h.a, 2, Integer.MAX_VALUE, null, btsVar12, intValue11 & 14, 0, 0);
                                        break;
                                    }
                            }
                            return zy11Var;
                        }
                    }, btsVar), null, wwg.S(-1869198627, true, new yon0(slsVar, z5, i5), btsVar), x4c.E, SlotSize.L, false, btsVar, 25008, 8);
                    btsVar.t(false);
                }
            }
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(qqn0Var, tlsVar, i, i6);
        }
    }

    public static final void e(rqn0 rqn0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1304955582);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(rqn0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i4 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new bpn0(i4, rqn0Var, tlsVar), btsVar), btsVar, 3456, 3);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ScootersIgnitionControllingScreenKt$ScootersIgnitionControllingScreen$2$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(rqn0Var, tlsVar, i, i3);
        }
    }
}
