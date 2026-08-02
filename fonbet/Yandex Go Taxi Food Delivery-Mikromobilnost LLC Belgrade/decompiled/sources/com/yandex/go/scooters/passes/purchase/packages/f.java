package com.yandex.go.scooters.passes.purchase.packages;

import android.graphics.Bitmap;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.slot.SlotSize;
import com.yandex.go.design.compose.slot.body.BodyAlign;
import com.yandex.go.scooters.passes.purchase.packages.f;
import defpackage.aab1;
import defpackage.aii0;
import defpackage.am4;
import defpackage.an91;
import defpackage.apn0;
import defpackage.bj6;
import defpackage.bpn0;
import defpackage.bts;
import defpackage.byk0;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.d8o0;
import defpackage.dbb1;
import defpackage.did;
import defpackage.dmw0;
import defpackage.dx2;
import defpackage.e3o0;
import defpackage.e8o0;
import defpackage.eja1;
import defpackage.ety0;
import defpackage.f530;
import defpackage.f8o0;
import defpackage.fid;
import defpackage.g8o0;
import defpackage.h8o0;
import defpackage.hbb1;
import defpackage.i9a1;
import defpackage.jcd;
import defpackage.jeb1;
import defpackage.jrn0;
import defpackage.jt1;
import defpackage.khl0;
import defpackage.kj5;
import defpackage.l690;
import defpackage.l8o0;
import defpackage.ldc;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m8o0;
import defpackage.mhe;
import defpackage.mm4;
import defpackage.mr1;
import defpackage.nvi0;
import defpackage.o3b1;
import defpackage.o430;
import defpackage.o8o0;
import defpackage.ofb1;
import defpackage.ohd;
import defpackage.oip0;
import defpackage.oz40;
import defpackage.p1b1;
import defpackage.p8o0;
import defpackage.p8y;
import defpackage.pdf0;
import defpackage.phb1;
import defpackage.q6a1;
import defpackage.q791;
import defpackage.qeg0;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rly0;
import defpackage.rzo;
import defpackage.s7o0;
import defpackage.scc;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.t7l0;
import defpackage.tje;
import defpackage.tls;
import defpackage.tmm0;
import defpackage.tse0;
import defpackage.ttm;
import defpackage.up2;
import defpackage.v0b1;
import defpackage.vfc;
import defpackage.vub1;
import defpackage.w1b1;
import defpackage.w7o0;
import defpackage.wk4;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.wzl0;
import defpackage.x4c;
import defpackage.xya1;
import defpackage.ydb1;
import defpackage.ye5;
import defpackage.ymb1;
import defpackage.yon0;
import defpackage.yrl;
import defpackage.yx40;
import defpackage.zls;
import defpackage.zpn;
import defpackage.zy11;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.CryptoPro.JCSP.MSCAPI.MSException;
import ru.cprocsp.NGate.tools.Constants;

/* loaded from: classes11.dex */
public abstract class f {
    public static final void a(d8o0 d8o0Var, ety0 ety0Var, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(580748374);
        int i2 = i | (btsVar.k(d8o0Var) ? 4 : 2) | (btsVar.k(ety0Var) ? 32 : 16) | 384;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            CharSequence charSequence = d8o0Var.a;
            wp2 wp2Var = d8o0Var.b;
            mm4 mm4Var = new mm4(wp2Var, AppColor$Palette.EverFront, new am4(new up2(ldc.b(tje.n(wp2Var, btsVar), 0.2f, 0.0f, 0.0f, 0.0f, 14))));
            BadgeSize badgeSize = BadgeSize.M;
            l690 d = an91.d(6.0f, 0.0f, 6.0f, 2.0f, 2);
            androidx.compose.runtime.internal.a S = wwg.S(363410840, true, new jrn0(charSequence, ety0Var, i3), btsVar);
            c530 c530Var = c530.a;
            wk4.a(badgeSize, mm4Var, d, c530Var, S, btsVar, 200070);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(d8o0Var, ety0Var, f530Var2, i, 19);
        }
    }

    public static final void b(bj6 bj6Var, p8o0 p8o0Var, boolean z, tls tlsVar, oip0 oip0Var, yx40 yx40Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1079503896);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(bj6Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(p8o0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(tlsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.k(oip0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.k(yx40Var) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            jt1 jt1Var = x4c.B;
            c530 c530Var = c530.a;
            f530 d = i9a1.d(ljs0.c(ymb1.l(bzk0.c(hbb1.c(bj6Var.a(c530Var, jt1Var), dbb1.c(btsVar), false, 0.0f, p1b1.f(oip0Var, btsVar), 6), AppColor$Palette.BgFloating, cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12)), 1.0f));
            boolean z2 = (458752 & i2) == 131072;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new dx2(yx40Var, 12);
                btsVar.o0(Q);
            }
            f530 o = an91.o(eja1.y(d, (tls) Q), 0.0f, 8.0f, 8.0f, 8.0f, 1);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, o);
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
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, c530Var);
            btsVar.i0();
            int i3 = i2;
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            m8o0 m8o0Var = p8o0Var.h;
            h8o0 h8o0Var = p8o0Var.j;
            int i4 = (i3 >> 3) & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND;
            i(m8o0Var, z, tlsVar, btsVar, i4);
            k(p8o0Var.i, z, tlsVar, btsVar, i4);
            btsVar.t(true);
            if (h8o0Var != null) {
                tse0.s(btsVar, -158817476, c530Var, 8.0f, btsVar);
                f(h8o0Var, z, tlsVar, btsVar, i4);
                btsVar.t(false);
            } else {
                btsVar.e0(-158721376);
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ye5(bj6Var, p8o0Var, z, tlsVar, oip0Var, yx40Var, i, 10);
        }
    }

    public static final void c(e8o0 e8o0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1819437341);
        int i2 = 2;
        int i3 = (btsVar.k(e8o0Var) ? 4 : 2) | i;
        int i4 = 0;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            ydb1.a(bzk0.c(c530.a, AppColor$Palette.BgMinor, cyk0.c(24.0f)), null, wwg.S(254547380, true, new w7o0(i4, e8o0Var), btsVar), null, null, null, SlotSize.XS, false, btsVar, 1573248, 186);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(e8o0Var, i, i2);
        }
    }

    public static final void d(final g8o0 g8o0Var, final oip0 oip0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1182574079);
        int i2 = (btsVar.k(g8o0Var) ? 4 : 2) | i | (btsVar.k(oip0Var) ? 32 : 16);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = androidx.compose.runtime.f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            final oz40 oz40Var = (oz40) Q;
            f530 l = ymb1.l(bzk0.c(c530.a, AppColor$Palette.BgMinor, cyk0.c(24.0f)), cyk0.c(24.0f));
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            boolean k = btsVar.k(oz40Var);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new ttm(20, oz40Var);
                btsVar.o0(Q2);
            }
            w1b1.a(booleanValue, (tls) Q2, l, wwg.S(2036002265, true, new yon0(wwg.S(-2099845713, true, new pdf0(28, g8o0Var), btsVar), booleanValue, i3), btsVar), wwg.S(-1154143487, true, new zls() { // from class: com.yandex.go.scooters.passes.purchase.packages.c
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r2v11, types: [kotlin.coroutines.Continuation] */
                /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Throwable] */
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    androidx.compose.runtime.internal.a aVar;
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    final int i4 = 1;
                    final int i5 = 0;
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                        sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
                        int hashCode = Long.hashCode(btsVar2.T);
                        r1b0 o = btsVar2.o();
                        f530 d = androidx.compose.ui.b.d(btsVar2, c530.a);
                        ohd.G1.getClass();
                        sls slsVar = androidx.compose.ui.node.d.b;
                        f530 f530Var = null;
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
                        qje.W(btsVar2, androidx.compose.ui.node.d.f, a);
                        qje.W(btsVar2, androidx.compose.ui.node.d.e, o);
                        qje.W(btsVar2, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar2, androidx.compose.ui.node.d.h);
                        qje.W(btsVar2, androidx.compose.ui.node.d.d, d);
                        btsVar2.e0(154196377);
                        int i6 = 0;
                        for (Object obj4 : g8o0Var.c) {
                            int i7 = i6 + 1;
                            if (i6 < 0) {
                                ?? r2 = f530Var;
                                scc.m();
                                throw r2;
                            }
                            final f8o0 f8o0Var = (f8o0) obj4;
                            if (i6 > 0) {
                                btsVar2.e0(558802319);
                                yrl.d(f530Var, btsVar2, 0);
                                btsVar2.t(false);
                            } else {
                                btsVar2.e0(558844603);
                                btsVar2.t(false);
                            }
                            if (f8o0Var.c != null) {
                                btsVar2.e0(558906727);
                                aVar = wwg.S(457573526, true, new zls() { // from class: u7o0
                                    @Override // defpackage.zls
                                    public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                        int i8 = i5;
                                        zy11 zy11Var = zy11.a;
                                        f8o0 f8o0Var2 = f8o0Var;
                                        switch (i8) {
                                            case 0:
                                                ibp0 ibp0Var = (ibp0) obj5;
                                                fid fidVar3 = (fid) obj6;
                                                int intValue2 = ((Integer) obj7).intValue();
                                                if ((intValue2 & 6) == 0) {
                                                    intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                                }
                                                bts btsVar3 = (bts) fidVar3;
                                                if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                    btsVar3.Y();
                                                    break;
                                                } else {
                                                    tdb1.d(ibp0Var, f8o0Var2.c, null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                                    break;
                                                }
                                            default:
                                                ebp0 ebp0Var = (ebp0) obj5;
                                                fid fidVar4 = (fid) obj6;
                                                int intValue3 = ((Integer) obj7).intValue();
                                                if ((intValue3 & 6) == 0) {
                                                    intValue3 |= ((bts) fidVar4).k(ebp0Var) ? 4 : 2;
                                                }
                                                bts btsVar4 = (bts) fidVar4;
                                                if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                                    btsVar4.Y();
                                                    break;
                                                } else {
                                                    m9b1.b(ebp0Var, f8o0Var2.a, null, null, xya1.e(btsVar4).g.b, 0, 0, f8o0Var2.b, null, null, 0, 0, null, btsVar4, intValue3 & 14, 0, 32630);
                                                    break;
                                                }
                                        }
                                        return zy11Var;
                                    }
                                }, btsVar2);
                                btsVar2.t(false);
                            } else {
                                btsVar2.e0(558994612);
                                btsVar2.t(false);
                                aVar = p8y.a;
                            }
                            ydb1.a(null, aVar, wwg.S(1517558582, true, new zls() { // from class: u7o0
                                @Override // defpackage.zls
                                public final Object invoke(Object obj5, Object obj6, Object obj7) {
                                    int i8 = i4;
                                    zy11 zy11Var = zy11.a;
                                    f8o0 f8o0Var2 = f8o0Var;
                                    switch (i8) {
                                        case 0:
                                            ibp0 ibp0Var = (ibp0) obj5;
                                            fid fidVar3 = (fid) obj6;
                                            int intValue2 = ((Integer) obj7).intValue();
                                            if ((intValue2 & 6) == 0) {
                                                intValue2 |= ((bts) fidVar3).k(ibp0Var) ? 4 : 2;
                                            }
                                            bts btsVar3 = (bts) fidVar3;
                                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                                                btsVar3.Y();
                                                break;
                                            } else {
                                                tdb1.d(ibp0Var, f8o0Var2.c, null, null, null, null, 0.0f, 0, null, btsVar3, intValue2 & 14, 510);
                                                break;
                                            }
                                        default:
                                            ebp0 ebp0Var = (ebp0) obj5;
                                            fid fidVar4 = (fid) obj6;
                                            int intValue3 = ((Integer) obj7).intValue();
                                            if ((intValue3 & 6) == 0) {
                                                intValue3 |= ((bts) fidVar4).k(ebp0Var) ? 4 : 2;
                                            }
                                            bts btsVar4 = (bts) fidVar4;
                                            if (!btsVar4.V(intValue3 & 1, (intValue3 & 19) != 18)) {
                                                btsVar4.Y();
                                                break;
                                            } else {
                                                m9b1.b(ebp0Var, f8o0Var2.a, null, null, xya1.e(btsVar4).g.b, 0, 0, f8o0Var2.b, null, null, 0, 0, null, btsVar4, intValue3 & 14, 0, 32630);
                                                break;
                                            }
                                    }
                                    return zy11Var;
                                }
                            }, btsVar2), null, null, null, null, false, btsVar2, 384, 249);
                            f530Var = f530Var;
                            i6 = i7;
                        }
                        ?? r22 = f530Var;
                        btsVar2.t(false);
                        btsVar2.t(true);
                        oz40 oz40Var2 = oz40Var;
                        Boolean bool = (Boolean) oz40Var2.getValue();
                        bool.booleanValue();
                        boolean k2 = btsVar2.k(oz40Var2);
                        oip0 oip0Var2 = oip0.this;
                        boolean k3 = k2 | btsVar2.k(oip0Var2);
                        Object Q3 = btsVar2.Q();
                        if (k3 || Q3 == did.a) {
                            Q3 = new ScootersPackagesPurchaseScreenKt$Details$3$2$1(oz40Var2, oip0Var2, r22);
                            btsVar2.o0(Q3);
                        }
                        zpn.f(bool, oip0Var2, (wls) Q3, btsVar2);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 27648);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(g8o0Var, oip0Var, i, 24);
        }
    }

    public static final void e(p8o0 p8o0Var, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1424472091);
        int i2 = i | (btsVar.k(p8o0Var) ? 4 : 2);
        byte b = 0;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c530.a);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            vub1.b(wwg.S(-1073830617, true, new s7o0(p8o0Var, b, b), btsVar), wwg.S(636820230, true, new s7o0(p8o0Var, i3, b), btsVar), null, 0.0f, null, null, btsVar, 54, 60);
            if (p8o0Var.b.length() > 0) {
                btsVar.e0(-1645654891);
                z = true;
                qgy.b(p8o0Var.b, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.b, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                z = true;
                btsVar.e0(-1645518243);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s7o0(p8o0Var, i);
        }
    }

    public static final void f(h8o0 h8o0Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1830895298);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(h8o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            String str = h8o0Var.a;
            ety0 ety0Var = xya1.e(btsVar2).i.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            boolean z2 = !z;
            f530 c = q6a1.c(c530.a, z2);
            boolean z3 = ((i2 & 896) == 256) | ((i2 & 14) == 4);
            Object Q = btsVar2.Q();
            if (z3 || Q == did.a) {
                Q = new tmm0(29, tlsVar, h8o0Var);
                btsVar2.o0(Q);
            }
            btsVar = btsVar2;
            jeb1.f(str, q791.d(c, z2, null, null, (sls) Q, 14), appColor$Palette, 0L, 0L, rly0.c, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var, btsVar, 1573248, 0, 16184);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(h8o0Var, z, tlsVar, i, 14);
        }
    }

    public static final void g(final l8o0 l8o0Var, boolean z, tls tlsVar, fid fidVar, int i) {
        f530 f530Var;
        f530 c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1140241645);
        int i2 = i | (btsVar.k(l8o0Var) ? 4 : 2) | (btsVar.a(z) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        final int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            byk0 c2 = cyk0.c(24.0f);
            boolean z2 = !z;
            c530 c530Var = c530.a;
            f530 c3 = q6a1.c(c530Var, z2);
            if (l8o0Var.f) {
                btsVar.e0(42805313);
                f530Var = c3;
                c = aab1.a(2.0f, tje.n(AppColor$Palette.Control, btsVar), c530Var, c2);
                btsVar.t(false);
            } else {
                f530Var = c3;
                btsVar.e0(42894283);
                btsVar.t(false);
                c = bzk0.c(c530Var, AppColor$Palette.BgMinor, c2);
            }
            f530 l = ymb1.l(f530Var.k(c), c2);
            boolean z3 = ((i2 & 14) == 4) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new tmm0(28, tlsVar, l8o0Var);
                btsVar.o0(Q);
            }
            final int i4 = 1;
            ydb1.a(q791.d(l, z2, null, null, (sls) Q, 14), null, wwg.S(285266174, true, new zls() { // from class: r7o0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i3;
                    zy11 zy11Var = zy11.a;
                    final l8o0 l8o0Var2 = l8o0Var;
                    Object[] objArr = 0;
                    final int i6 = 1;
                    switch (i5) {
                        case 0:
                            final ebp0 ebp0Var = (ebp0) obj;
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
                                final Object[] objArr2 = objArr == true ? 1 : 0;
                                vub1.b(wwg.S(-1718141956, true, new wls() { // from class: v7o0
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj4, Object obj5) {
                                        int i7 = objArr2;
                                        zy11 zy11Var2 = zy11.a;
                                        l8o0 l8o0Var3 = l8o0Var2;
                                        switch (i7) {
                                            case 0:
                                                fid fidVar3 = (fid) obj4;
                                                int intValue2 = ((Integer) obj5).intValue();
                                                bts btsVar3 = (bts) fidVar3;
                                                if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                    m9b1.b(ebp0Var, l8o0Var3.b, null, null, null, 0, 0, l8o0Var3.c, null, null, 0, 0, null, btsVar3, 0, 0, 32638);
                                                } else {
                                                    btsVar3.Y();
                                                }
                                                return zy11Var2;
                                            default:
                                                fid fidVar4 = (fid) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                bts btsVar4 = (bts) fidVar4;
                                                if (btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    jt1 alignment = ((BodyAlign) btsVar4.m(u76.a)).getAlignment();
                                                    ebp0 ebp0Var2 = ebp0Var;
                                                    ebp0Var2.getClass();
                                                    f530 m = an91.m(cj6.a.a(c530.a, alignment), 0.0f, ebp0Var2.c() == SlotSize.XS ? 0.0f : 2.0f, 1);
                                                    sic a = qic.a(lr20.c, x4c.I, btsVar4, 48);
                                                    int hashCode = Long.hashCode(btsVar4.T);
                                                    r1b0 o = btsVar4.o();
                                                    f530 d = b.d(btsVar4, m);
                                                    ohd.G1.getClass();
                                                    sls slsVar = d.b;
                                                    if (btsVar4.a == null) {
                                                        cma1.b0();
                                                        throw null;
                                                    }
                                                    btsVar4.i0();
                                                    if (btsVar4.S) {
                                                        btsVar4.n(slsVar);
                                                    } else {
                                                        btsVar4.r0();
                                                    }
                                                    qje.W(btsVar4, d.f, a);
                                                    qje.W(btsVar4, d.e, o);
                                                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode));
                                                    qje.M(btsVar4, d.h);
                                                    qje.W(btsVar4, d.d, d);
                                                    k8o0 k8o0Var = l8o0Var3.d;
                                                    if (k8o0Var instanceof j8o0) {
                                                        btsVar4.e0(2000504037);
                                                        qgy.b(((j8o0) k8o0Var).a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar4).g.b, null, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                                        btsVar4.t(false);
                                                    } else {
                                                        if (!(k8o0Var instanceof i8o0)) {
                                                            throw unr0.y(895812156, btsVar4, false);
                                                        }
                                                        btsVar4.e0(2000764716);
                                                        f.a(((i8o0) k8o0Var).a, xya1.e(btsVar4).g.b, null, btsVar4, 0);
                                                        btsVar4.t(false);
                                                    }
                                                    if (l8o0Var3.e.length() > 0) {
                                                        btsVar4.e0(2000951770);
                                                        qgy.b(l8o0Var3.e, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar4).h.a, null, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                                        btsVar4.t(false);
                                                    } else {
                                                        btsVar4.e0(2001139599);
                                                        btsVar4.t(false);
                                                    }
                                                    btsVar4.t(true);
                                                } else {
                                                    btsVar4.Y();
                                                }
                                                return zy11Var2;
                                        }
                                    }
                                }, btsVar2), wwg.S(-208120131, true, new wls() { // from class: v7o0
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj4, Object obj5) {
                                        int i7 = i6;
                                        zy11 zy11Var2 = zy11.a;
                                        l8o0 l8o0Var3 = l8o0Var2;
                                        switch (i7) {
                                            case 0:
                                                fid fidVar3 = (fid) obj4;
                                                int intValue2 = ((Integer) obj5).intValue();
                                                bts btsVar3 = (bts) fidVar3;
                                                if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                    m9b1.b(ebp0Var, l8o0Var3.b, null, null, null, 0, 0, l8o0Var3.c, null, null, 0, 0, null, btsVar3, 0, 0, 32638);
                                                } else {
                                                    btsVar3.Y();
                                                }
                                                return zy11Var2;
                                            default:
                                                fid fidVar4 = (fid) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                bts btsVar4 = (bts) fidVar4;
                                                if (btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    jt1 alignment = ((BodyAlign) btsVar4.m(u76.a)).getAlignment();
                                                    ebp0 ebp0Var2 = ebp0Var;
                                                    ebp0Var2.getClass();
                                                    f530 m = an91.m(cj6.a.a(c530.a, alignment), 0.0f, ebp0Var2.c() == SlotSize.XS ? 0.0f : 2.0f, 1);
                                                    sic a = qic.a(lr20.c, x4c.I, btsVar4, 48);
                                                    int hashCode = Long.hashCode(btsVar4.T);
                                                    r1b0 o = btsVar4.o();
                                                    f530 d = b.d(btsVar4, m);
                                                    ohd.G1.getClass();
                                                    sls slsVar = d.b;
                                                    if (btsVar4.a == null) {
                                                        cma1.b0();
                                                        throw null;
                                                    }
                                                    btsVar4.i0();
                                                    if (btsVar4.S) {
                                                        btsVar4.n(slsVar);
                                                    } else {
                                                        btsVar4.r0();
                                                    }
                                                    qje.W(btsVar4, d.f, a);
                                                    qje.W(btsVar4, d.e, o);
                                                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode));
                                                    qje.M(btsVar4, d.h);
                                                    qje.W(btsVar4, d.d, d);
                                                    k8o0 k8o0Var = l8o0Var3.d;
                                                    if (k8o0Var instanceof j8o0) {
                                                        btsVar4.e0(2000504037);
                                                        qgy.b(((j8o0) k8o0Var).a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar4).g.b, null, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                                        btsVar4.t(false);
                                                    } else {
                                                        if (!(k8o0Var instanceof i8o0)) {
                                                            throw unr0.y(895812156, btsVar4, false);
                                                        }
                                                        btsVar4.e0(2000764716);
                                                        f.a(((i8o0) k8o0Var).a, xya1.e(btsVar4).g.b, null, btsVar4, 0);
                                                        btsVar4.t(false);
                                                    }
                                                    if (l8o0Var3.e.length() > 0) {
                                                        btsVar4.e0(2000951770);
                                                        qgy.b(l8o0Var3.e, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar4).h.a, null, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                                        btsVar4.t(false);
                                                    } else {
                                                        btsVar4.e0(2001139599);
                                                        btsVar4.t(false);
                                                    }
                                                    btsVar4.t(true);
                                                } else {
                                                    btsVar4.Y();
                                                }
                                                return zy11Var2;
                                        }
                                    }
                                }, btsVar2), null, 0.0f, null, null, btsVar2, 54, 60);
                                break;
                            }
                        default:
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
                                wfa1.a(l8o0Var2.f, an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, true, btsVar3, 0, 4);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, wwg.S(550909496, true, new zls() { // from class: r7o0
                /* JADX WARN: Multi-variable type inference failed */
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    final l8o0 l8o0Var2 = l8o0Var;
                    Object[] objArr = 0;
                    final int i6 = 1;
                    switch (i5) {
                        case 0:
                            final ebp0 ebp0Var = (ebp0) obj;
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
                                final int objArr2 = objArr == true ? 1 : 0;
                                vub1.b(wwg.S(-1718141956, true, new wls() { // from class: v7o0
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj4, Object obj5) {
                                        int i7 = objArr2;
                                        zy11 zy11Var2 = zy11.a;
                                        l8o0 l8o0Var3 = l8o0Var2;
                                        switch (i7) {
                                            case 0:
                                                fid fidVar3 = (fid) obj4;
                                                int intValue2 = ((Integer) obj5).intValue();
                                                bts btsVar3 = (bts) fidVar3;
                                                if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                    m9b1.b(ebp0Var, l8o0Var3.b, null, null, null, 0, 0, l8o0Var3.c, null, null, 0, 0, null, btsVar3, 0, 0, 32638);
                                                } else {
                                                    btsVar3.Y();
                                                }
                                                return zy11Var2;
                                            default:
                                                fid fidVar4 = (fid) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                bts btsVar4 = (bts) fidVar4;
                                                if (btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    jt1 alignment = ((BodyAlign) btsVar4.m(u76.a)).getAlignment();
                                                    ebp0 ebp0Var2 = ebp0Var;
                                                    ebp0Var2.getClass();
                                                    f530 m = an91.m(cj6.a.a(c530.a, alignment), 0.0f, ebp0Var2.c() == SlotSize.XS ? 0.0f : 2.0f, 1);
                                                    sic a = qic.a(lr20.c, x4c.I, btsVar4, 48);
                                                    int hashCode = Long.hashCode(btsVar4.T);
                                                    r1b0 o = btsVar4.o();
                                                    f530 d = b.d(btsVar4, m);
                                                    ohd.G1.getClass();
                                                    sls slsVar = d.b;
                                                    if (btsVar4.a == null) {
                                                        cma1.b0();
                                                        throw null;
                                                    }
                                                    btsVar4.i0();
                                                    if (btsVar4.S) {
                                                        btsVar4.n(slsVar);
                                                    } else {
                                                        btsVar4.r0();
                                                    }
                                                    qje.W(btsVar4, d.f, a);
                                                    qje.W(btsVar4, d.e, o);
                                                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode));
                                                    qje.M(btsVar4, d.h);
                                                    qje.W(btsVar4, d.d, d);
                                                    k8o0 k8o0Var = l8o0Var3.d;
                                                    if (k8o0Var instanceof j8o0) {
                                                        btsVar4.e0(2000504037);
                                                        qgy.b(((j8o0) k8o0Var).a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar4).g.b, null, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                                        btsVar4.t(false);
                                                    } else {
                                                        if (!(k8o0Var instanceof i8o0)) {
                                                            throw unr0.y(895812156, btsVar4, false);
                                                        }
                                                        btsVar4.e0(2000764716);
                                                        f.a(((i8o0) k8o0Var).a, xya1.e(btsVar4).g.b, null, btsVar4, 0);
                                                        btsVar4.t(false);
                                                    }
                                                    if (l8o0Var3.e.length() > 0) {
                                                        btsVar4.e0(2000951770);
                                                        qgy.b(l8o0Var3.e, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar4).h.a, null, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                                        btsVar4.t(false);
                                                    } else {
                                                        btsVar4.e0(2001139599);
                                                        btsVar4.t(false);
                                                    }
                                                    btsVar4.t(true);
                                                } else {
                                                    btsVar4.Y();
                                                }
                                                return zy11Var2;
                                        }
                                    }
                                }, btsVar2), wwg.S(-208120131, true, new wls() { // from class: v7o0
                                    @Override // defpackage.wls
                                    public final Object invoke(Object obj4, Object obj5) {
                                        int i7 = i6;
                                        zy11 zy11Var2 = zy11.a;
                                        l8o0 l8o0Var3 = l8o0Var2;
                                        switch (i7) {
                                            case 0:
                                                fid fidVar3 = (fid) obj4;
                                                int intValue2 = ((Integer) obj5).intValue();
                                                bts btsVar3 = (bts) fidVar3;
                                                if (btsVar3.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                                                    m9b1.b(ebp0Var, l8o0Var3.b, null, null, null, 0, 0, l8o0Var3.c, null, null, 0, 0, null, btsVar3, 0, 0, 32638);
                                                } else {
                                                    btsVar3.Y();
                                                }
                                                return zy11Var2;
                                            default:
                                                fid fidVar4 = (fid) obj4;
                                                int intValue3 = ((Integer) obj5).intValue();
                                                bts btsVar4 = (bts) fidVar4;
                                                if (btsVar4.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                                                    jt1 alignment = ((BodyAlign) btsVar4.m(u76.a)).getAlignment();
                                                    ebp0 ebp0Var2 = ebp0Var;
                                                    ebp0Var2.getClass();
                                                    f530 m = an91.m(cj6.a.a(c530.a, alignment), 0.0f, ebp0Var2.c() == SlotSize.XS ? 0.0f : 2.0f, 1);
                                                    sic a = qic.a(lr20.c, x4c.I, btsVar4, 48);
                                                    int hashCode = Long.hashCode(btsVar4.T);
                                                    r1b0 o = btsVar4.o();
                                                    f530 d = b.d(btsVar4, m);
                                                    ohd.G1.getClass();
                                                    sls slsVar = d.b;
                                                    if (btsVar4.a == null) {
                                                        cma1.b0();
                                                        throw null;
                                                    }
                                                    btsVar4.i0();
                                                    if (btsVar4.S) {
                                                        btsVar4.n(slsVar);
                                                    } else {
                                                        btsVar4.r0();
                                                    }
                                                    qje.W(btsVar4, d.f, a);
                                                    qje.W(btsVar4, d.e, o);
                                                    qje.W(btsVar4, d.g, Integer.valueOf(hashCode));
                                                    qje.M(btsVar4, d.h);
                                                    qje.W(btsVar4, d.d, d);
                                                    k8o0 k8o0Var = l8o0Var3.d;
                                                    if (k8o0Var instanceof j8o0) {
                                                        btsVar4.e0(2000504037);
                                                        qgy.b(((j8o0) k8o0Var).a, null, null, AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar4).g.b, null, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                                        btsVar4.t(false);
                                                    } else {
                                                        if (!(k8o0Var instanceof i8o0)) {
                                                            throw unr0.y(895812156, btsVar4, false);
                                                        }
                                                        btsVar4.e0(2000764716);
                                                        f.a(((i8o0) k8o0Var).a, xya1.e(btsVar4).g.b, null, btsVar4, 0);
                                                        btsVar4.t(false);
                                                    }
                                                    if (l8o0Var3.e.length() > 0) {
                                                        btsVar4.e0(2000951770);
                                                        qgy.b(l8o0Var3.e, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar4).h.a, null, btsVar4, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                                                        btsVar4.t(false);
                                                    } else {
                                                        btsVar4.e0(2001139599);
                                                        btsVar4.t(false);
                                                    }
                                                    btsVar4.t(true);
                                                } else {
                                                    btsVar4.Y();
                                                }
                                                return zy11Var2;
                                        }
                                    }
                                }, btsVar2), null, 0.0f, null, null, btsVar2, 54, 60);
                                break;
                            }
                        default:
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
                                wfa1.a(l8o0Var2.f, an91.o(c530.a, 8.0f, 0.0f, ibp0Var.c() == SlotSize.XS ? 4.0f : 16.0f, 0.0f, 10), null, null, true, btsVar3, 0, 4);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), null, null, false, btsVar, 24960, MSException.ERROR_MORE_DATA);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(l8o0Var, z, tlsVar, i, 25);
        }
    }

    public static final void h(int i, fid fidVar, tls tlsVar, List list, boolean z) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(460283791);
        int i2 = (btsVar.k(list) ? 4 : 2) | i | (btsVar.a(z) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = androidx.compose.ui.b.d(btsVar, c530Var);
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
            qje.W(btsVar, androidx.compose.ui.node.d.f, a);
            qje.W(btsVar, androidx.compose.ui.node.d.e, o);
            qje.W(btsVar, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, androidx.compose.ui.node.d.h);
            qje.W(btsVar, androidx.compose.ui.node.d.d, d);
            btsVar.e0(-1565300023);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                l8o0 l8o0Var = (l8o0) obj;
                if (i3 > 0) {
                    tse0.s(btsVar, 53989325, c530Var, 8.0f, btsVar);
                    btsVar.t(false);
                } else {
                    btsVar.e0(54034492);
                    btsVar.t(false);
                }
                g(l8o0Var, z, tlsVar, btsVar, i2 & Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                i3 = i4;
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(list, z, tlsVar, i, 24);
        }
    }

    public static final void i(m8o0 m8o0Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1463160864);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(m8o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Bitmap bitmap = m8o0Var.a;
            Bitmap bitmap2 = m8o0Var.b;
            boolean z2 = !z;
            f530 m = ljs0.m(q6a1.c(c530.a, z2), 56.0f);
            boolean z3 = (i2 & 896) == 256;
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new wzl0(28, tlsVar);
                btsVar.o0(Q);
            }
            o3b1.b(bitmap, q791.d(m, z2, null, null, (sls) Q, 14), bitmap2, btsVar, 48);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(m8o0Var, z, tlsVar, i, 13);
        }
    }

    public static final void j(nvi0 nvi0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1995801501);
        int i2 = (btsVar.k(nvi0Var) ? 4 : 2) | i;
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 b = ljs0.b(an91.o(ljs0.c(c530.a, 1.0f), 0.0f, 16.0f, 0.0f, 0.0f, 13), 0.0f, 156.0f, 1);
            jcd.a.getClass();
            v0b1.a(nvi0Var, b, null, jcd.c, null, null, null, mhe.a, 0.0f, 0, btsVar, 12586032, 884);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e3o0(nvi0Var, i, i3);
        }
    }

    public static final void k(o8o0 o8o0Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2024949858);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(o8o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 b = ofb1.b(c530.a, z, null, 14);
            boolean z2 = !z;
            boolean z3 = (i2 & 896) == 256;
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new wzl0(27, tlsVar);
                btsVar.o0(Q);
            }
            phb1.b((sls) Q, b, z2, null, null, wwg.S(122855005, true, new pdf0(29, o8o0Var), btsVar), null, null, null, btsVar, ImageMetadata.EDGE_MODE, 984);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(o8o0Var, z, tlsVar, i, 12);
        }
    }

    public static final void l(p8o0 p8o0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(196456375);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(p8o0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new bpn0(i3, p8o0Var, tlsVar), btsVar), btsVar, 3456, 3);
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new ScootersPackagesPurchaseScreenKt$ScootersPackagesPurchaseScreen$2$1(tlsVar, p8o0Var, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(p8o0Var, tlsVar, i, 6);
        }
    }
}
