package com.yandex.go.loyalty.impl.selector.ui;

import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonForm;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import com.yandex.go.loyalty.impl.selector.ui.a;
import defpackage.adb1;
import defpackage.adp;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.bgc;
import defpackage.bts;
import defpackage.byk0;
import defpackage.bzk0;
import defpackage.c3z;
import defpackage.c530;
import defpackage.cma1;
import defpackage.ctq;
import defpackage.cx20;
import defpackage.cyk0;
import defpackage.cz20;
import defpackage.d17;
import defpackage.dc0;
import defpackage.did;
import defpackage.exz;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.gi0;
import defpackage.hc0;
import defpackage.hxz;
import defpackage.ixz;
import defpackage.jeb1;
import defpackage.jl40;
import defpackage.jxz;
import defpackage.kxz;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m4m0;
import defpackage.mqu;
import defpackage.nxu;
import defpackage.o430;
import defpackage.ohd;
import defpackage.or9;
import defpackage.pi6;
import defpackage.q6a1;
import defpackage.q791;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qje;
import defpackage.qk30;
import defpackage.r1b0;
import defpackage.r2z0;
import defpackage.s0v;
import defpackage.sic;
import defpackage.sls;
import defpackage.swu;
import defpackage.tiy;
import defpackage.tls;
import defpackage.uiy;
import defpackage.unr0;
import defpackage.up2;
import defpackage.vmz;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wu40;
import defpackage.wwg;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.yce;
import defpackage.ydb1;
import defpackage.ymb1;
import defpackage.z910;
import defpackage.zls;
import defpackage.zp2;
import defpackage.zpn;
import defpackage.zy11;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class a {
    public static final void a(f530 f530Var, sls slsVar, boolean z, CharSequence charSequence, uiy uiyVar, fid fidVar, int i) {
        CharSequence charSequence2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(707858619);
        int i2 = 4;
        int i3 = i | (btsVar2.k(f530Var) ? 4 : 2) | (btsVar2.e(slsVar) ? 32 : 16) | (btsVar2.a(z) ? 256 : 128) | (btsVar2.k(charSequence) ? 2048 : 1024) | (btsVar2.k(uiyVar) ? 16384 : 8192);
        if (!btsVar2.V(i3 & 1, (i3 & 9363) != 9362)) {
            charSequence2 = charSequence;
            btsVar = btsVar2;
            btsVar.Y();
        } else if (uiyVar != null) {
            btsVar2.e0(-473096719);
            byk0 byk0Var = cyk0.a;
            f530 l = an91.l(q791.d(ymb1.l(m4m0.a(q6a1.c(f530Var, z), new tiy(uiyVar), byk0Var, 4), byk0Var), z, null, new awk0(0), slsVar, 10), 14.0f, 9.0f);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar2, l);
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
            qje.W(btsVar2, d.f, d);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d2);
            qgy.b(charSequence, null, null, new up2(zp2.a), 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).h.b, null, btsVar2, (i3 >> 9) & 14, 0, 12278);
            charSequence2 = charSequence;
            btsVar = btsVar2;
            btsVar.t(true);
            btsVar.t(false);
        } else {
            charSequence2 = charSequence;
            btsVar = btsVar2;
            btsVar.e0(-472561752);
            d17.c(f530Var, z, ButtonSize.XS, ButtonStyle.Main, ButtonForm.Circle, slsVar, wwg.S(-1390051973, true, new or9(i2, charSequence2), btsVar), btsVar, (i3 & 14) | 1600896 | ((i3 >> 3) & 112) | ((i3 << 12) & ImageMetadata.JPEG_GPS_COORDINATES), 0);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new hc0(f530Var, slsVar, z, charSequence2, uiyVar, i, 7);
        }
    }

    public static final void b(f530 f530Var, boolean z, jxz jxzVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1477446870);
        int i2 = i | (btsVar.a(z) ? 32 : 16) | (btsVar.k(jxzVar) ? 256 : 128) | (btsVar.e(tlsVar) ? 2048 : 1024);
        if (!btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            btsVar.Y();
        } else if (jl40.l(jxzVar, hxz.a)) {
            btsVar.e0(-1807726123);
            e(f530Var, btsVar, 6);
            btsVar.t(false);
        } else {
            if (!(jxzVar instanceof ixz)) {
                throw unr0.y(-1807727264, btsVar, false);
            }
            btsVar.e0(-1807723920);
            d(f530Var, z, (ixz) jxzVar, tlsVar, btsVar, i2 & 8190);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(f530Var, z, jxzVar, tlsVar, i, 9);
        }
    }

    public static final void c(final boolean z, final boolean z2, final tls tlsVar, final ixz ixzVar, final tls tlsVar2, final boolean z3, fid fidVar, final int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1207295140);
        if ((i & 6) == 0) {
            i2 = (btsVar2.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.a(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.k(ixzVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.e(tlsVar2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.a(z3) ? 131072 : 65536;
        }
        final int i3 = 0;
        if (btsVar2.V(i2 & 1, (74899 & i2) != 74898)) {
            f530 f530Var = c530.a;
            if (z3) {
                btsVar2.e0(-473060261);
                int i4 = i2 & 112;
                boolean z4 = i4 == 32;
                Object Q = btsVar2.Q();
                o430 o430Var = did.a;
                if (z4 || Q == o430Var) {
                    Q = new yce(z2, 9);
                    btsVar2.o0(Q);
                }
                f530 b = fnq0.b(f530Var, false, (tls) Q);
                boolean z5 = ((i2 & 7168) == 2048) | (i4 == 32) | ((i2 & 14) == 4) | ((i2 & 896) == 256);
                Object Q2 = btsVar2.Q();
                if (z5 || Q2 == o430Var) {
                    Q2 = new swu(tlsVar, ixzVar, z2, z);
                    btsVar2.o0(Q2);
                }
                f530Var = q791.b(b, null, null, false, null, new awk0(0), (sls) Q2, 12);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-472766040);
                btsVar2.t(false);
            }
            f530 f530Var2 = f530Var;
            final int i5 = 1;
            final int i6 = 2;
            btsVar = btsVar2;
            ydb1.a(f530Var2, wwg.S(-596745742, true, new zls() { // from class: mwz
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = i3;
                    zy11 zy11Var = zy11.a;
                    ixz ixzVar2 = ixzVar;
                    switch (i7) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var, mja1.b(ixzVar2.c, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue & 14, 510);
                                break;
                            }
                        case 1:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar3;
                            if (!btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                p9b1.c(ebp0Var, ixzVar2.b, null, null, xya1.e(btsVar4).f.c, 0, 0, null, null, null, 0, 0, BodyAlign.Start, btsVar4, intValue2 & 14, 384, 6134);
                                break;
                            }
                        default:
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            bts btsVar5 = (bts) fidVar4;
                            if (!btsVar5.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                btsVar5.Y();
                                break;
                            } else if (!(ixzVar2.f instanceof exz)) {
                                btsVar5.e0(622398686);
                                btsVar5.t(false);
                                break;
                            } else {
                                btsVar5.e0(622262224);
                                exz exzVar = (exz) ixzVar2.f;
                                qgy.b(exzVar.a, exzVar.b, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar5, 0, 0, 16380);
                                btsVar5.t(false);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar2), wwg.S(1274149677, true, new zls() { // from class: mwz
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = i5;
                    zy11 zy11Var = zy11.a;
                    ixz ixzVar2 = ixzVar;
                    switch (i7) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var, mja1.b(ixzVar2.c, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue & 14, 510);
                                break;
                            }
                        case 1:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar3;
                            if (!btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                p9b1.c(ebp0Var, ixzVar2.b, null, null, xya1.e(btsVar4).f.c, 0, 0, null, null, null, 0, 0, BodyAlign.Start, btsVar4, intValue2 & 14, 384, 6134);
                                break;
                            }
                        default:
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            bts btsVar5 = (bts) fidVar4;
                            if (!btsVar5.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                btsVar5.Y();
                                break;
                            } else if (!(ixzVar2.f instanceof exz)) {
                                btsVar5.e0(622398686);
                                btsVar5.t(false);
                                break;
                            } else {
                                btsVar5.e0(622262224);
                                exz exzVar = (exz) ixzVar2.f;
                                qgy.b(exzVar.a, exzVar.b, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar5, 0, 0, 16380);
                                btsVar5.t(false);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar2), wwg.S(-939534748, true, new zls() { // from class: mwz
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i7 = i6;
                    zy11 zy11Var = zy11.a;
                    ixz ixzVar2 = ixzVar;
                    switch (i7) {
                        case 0:
                            ibp0 ibp0Var = (ibp0) obj;
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            if ((intValue & 6) == 0) {
                                intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                            }
                            bts btsVar3 = (bts) fidVar2;
                            if (!btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                                btsVar3.Y();
                                break;
                            } else {
                                tdb1.d(ibp0Var, mja1.b(ixzVar2.c, null, 6), null, null, null, null, 0.0f, 0, null, btsVar3, intValue & 14, 510);
                                break;
                            }
                        case 1:
                            ebp0 ebp0Var = (ebp0) obj;
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            if ((intValue2 & 6) == 0) {
                                intValue2 |= ((bts) fidVar3).k(ebp0Var) ? 4 : 2;
                            }
                            bts btsVar4 = (bts) fidVar3;
                            if (!btsVar4.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                btsVar4.Y();
                                break;
                            } else {
                                p9b1.c(ebp0Var, ixzVar2.b, null, null, xya1.e(btsVar4).f.c, 0, 0, null, null, null, 0, 0, BodyAlign.Start, btsVar4, intValue2 & 14, 384, 6134);
                                break;
                            }
                        default:
                            fid fidVar4 = (fid) obj2;
                            int intValue3 = ((Integer) obj3).intValue();
                            bts btsVar5 = (bts) fidVar4;
                            if (!btsVar5.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                                btsVar5.Y();
                                break;
                            } else if (!(ixzVar2.f instanceof exz)) {
                                btsVar5.e0(622398686);
                                btsVar5.t(false);
                                break;
                            } else {
                                btsVar5.e0(622262224);
                                exz exzVar = (exz) ixzVar2.f;
                                qgy.b(exzVar.a, exzVar.b, null, null, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar5, 0, 0, 16380);
                                btsVar5.t(false);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar2), wwg.S(-146173465, true, new zls() { // from class: nwz
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    ibp0 ibp0Var = (ibp0) obj;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    if ((intValue & 6) == 0) {
                        intValue |= ((bts) fidVar2).k(ibp0Var) ? 4 : 2;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue & 1, (intValue & 19) != 18)) {
                        ixz ixzVar2 = ixzVar;
                        gxz gxzVar = ixzVar2.f;
                        boolean z6 = gxzVar instanceof exz;
                        c530 c530Var = c530.a;
                        boolean z7 = z;
                        if (z6) {
                            btsVar3.e0(443228449);
                            wfa1.a(z2, an91.o(c530Var, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, !z7, btsVar3, 0, 4);
                            btsVar3.t(false);
                        } else {
                            if (!(gxzVar instanceof fxz)) {
                                throw unr0.y(1261221956, btsVar3, false);
                            }
                            btsVar3.e0(443412093);
                            fxz fxzVar = (fxz) gxzVar;
                            f530 b2 = ofb1.b(an91.o(c530Var, 0.0f, 0.0f, 8.0f, 0.0f, 11), fxzVar.b, null, 14);
                            boolean a = btsVar3.a(z7);
                            Object obj4 = tlsVar2;
                            boolean k = a | btsVar3.k(obj4) | btsVar3.k(ixzVar2);
                            Object Q3 = btsVar3.Q();
                            if (k || Q3 == did.a) {
                                Q3 = new ex0(z7, obj4, ixzVar2, 12);
                                btsVar3.o0(Q3);
                            }
                            a.a(b2, (sls) Q3, !z7, fxzVar.a, fxzVar.c, btsVar3, 0);
                            btsVar3.t(false);
                        }
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar2), null, null, false, btsVar, 28080, 224);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: owz
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    a.c(z, z2, tlsVar, ixzVar, tlsVar2, z3, (fid) obj, vng.O(i | 1));
                    return zy11.a;
                }
            };
        }
    }

    public static final void d(f530 f530Var, boolean z, ixz ixzVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1732905630);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= btsVar.a(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(ixzVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 o = an91.o(bzk0.c(f530Var, AppColor$Palette.BgMinor, cyk0.c(20.0f)), 0.0f, 0.0f, 0.0f, 16.0f, 7);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, o);
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
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            boolean z3 = ixzVar.e;
            boolean z4 = ixzVar.f instanceof exz;
            boolean z5 = (i2 & 7168) == 2048;
            Object Q = btsVar.Q();
            if (z5 || Q == did.a) {
                Q = new adp(8, tlsVar);
                btsVar.o0(Q);
            }
            int i3 = (i2 >> 3) & 14;
            int i4 = i2 << 3;
            c(z2, z3, (tls) Q, ixzVar, tlsVar, z4, btsVar, (i4 & HProv.ALG_CLASS_ALL) | i3 | (i4 & 7168));
            jeb1.f(ixzVar.d, an91.m(c530.a, 12.0f, 0.0f, 2), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, 48, 0, 16380);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gi0(f530Var, z, ixzVar, tlsVar, i, 12);
        }
    }

    public static final void e(f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1810060232);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            com.yandex.go.design.compose.loading.b.a(ljs0.e(f530Var, 112.0f), cyk0.c(20.0f), false, null, null, null, false, btsVar, 0, 252);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dc0(f530Var, i, 11);
        }
    }

    public static final void f(kxz kxzVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-525365753);
        int i2 = i | (btsVar.k(kxzVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
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
            jeb1.f(kxzVar.a, an91.n(c530Var, 16.0f, 20.0f, 16.0f, 12.0f), null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).e.d, btsVar, 0, 0, 16380);
            f530 o2 = an91.o(new x2y(1.0f, false), 12.0f, 0.0f, 12.0f, 8.0f, 2);
            int i3 = i2 & 14;
            int i4 = i2 & 112;
            boolean z = (i3 == 4) | (i4 == 32);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new vmz(2, kxzVar, tlsVar);
                btsVar.o0(Q);
            }
            adb1.a(o2, null, null, null, null, null, false, null, (tls) Q, btsVar, 0, 510);
            ButtonSize buttonSize = ButtonSize.L;
            ButtonStyle buttonStyle = ButtonStyle.Main;
            f530 k = an91.k(ljs0.c(c530Var, 1.0f), 8.0f);
            boolean z2 = !kxzVar.c.b;
            boolean z3 = (i3 == 4) | (i4 == 32);
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new mqu(26, kxzVar, tlsVar);
                btsVar.o0(Q2);
            }
            d17.c(k, z2, buttonSize, buttonStyle, null, (sls) Q2, wwg.S(-1527021387, true, new ctq(20, kxzVar), btsVar), btsVar, 1576326, 16);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s0v(kxzVar, tlsVar, i, 19);
        }
    }

    public static final void g(kxz kxzVar, tls tlsVar, fid fidVar, int i) {
        int i2;
        sls slsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-150645248);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(kxzVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        boolean z = false;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z2 = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            wp2 wp2Var = null;
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new LoyaltySelectorModalViewKt$LoyaltySelectorModalView$1$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            if (kxzVar.c.b) {
                btsVar.e0(368567212);
                Object Q2 = btsVar.Q();
                if (Q2 == o430Var) {
                    Q2 = new bgc(12);
                    btsVar.o0(Q2);
                }
                slsVar = (sls) Q2;
                btsVar.t(false);
            } else {
                btsVar.e0(368595422);
                slsVar = (sls) btsVar.m(c3z.a);
                btsVar.t(false);
            }
            cx20.a(null, null, new cz20(wp2Var, slsVar, z, 13), null, null, false, false, wwg.S(-1685182486, true, new wu40(5, slsVar), btsVar), wwg.S(741675442, true, new qk30(23, kxzVar, tlsVar, slsVar), btsVar), btsVar, 113246208, HProv.PP_PASSWD_TERM);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nxu(kxzVar, tlsVar, i, 6);
        }
    }
}
