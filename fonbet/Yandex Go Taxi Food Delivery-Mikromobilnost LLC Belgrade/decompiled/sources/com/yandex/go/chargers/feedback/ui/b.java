package com.yandex.go.chargers.feedback.ui;

import androidx.compose.animation.g;
import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.adjust.sdk.Constants;
import com.airbnb.lottie.AsyncUpdates;
import com.airbnb.lottie.compose.LottieAnimatableImpl;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.chargers.feedback.domain.model.ChargersFeedbackCompletedOrder$FinishingStage;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.aab1;
import defpackage.aii0;
import defpackage.an1;
import defpackage.an91;
import defpackage.awk0;
import defpackage.az9;
import defpackage.bts;
import defpackage.byk0;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.chb1;
import defpackage.cj6;
import defpackage.ck11;
import defpackage.cma1;
import defpackage.cvu0;
import defpackage.cyk0;
import defpackage.d17;
import defpackage.dbb1;
import defpackage.dc0;
import defpackage.dhj0;
import defpackage.did;
import defpackage.dmw0;
import defpackage.dv9;
import defpackage.dz9;
import defpackage.eab1;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fwi;
import defpackage.g43;
import defpackage.gji0;
import defpackage.hbb1;
import defpackage.hk2;
import defpackage.i43;
import defpackage.i9a1;
import defpackage.ilb1;
import defpackage.ira1;
import defpackage.jc0;
import defpackage.jeb1;
import defpackage.ju8;
import defpackage.khl0;
import defpackage.ky7;
import defpackage.kyh0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.ly3;
import defpackage.m3u0;
import defpackage.m6;
import defpackage.mhe;
import defpackage.n;
import defpackage.nsz;
import defpackage.nvi0;
import defpackage.o430;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.oip0;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.pw91;
import defpackage.q791;
import defpackage.qgy;
import defpackage.qic;
import defpackage.qje;
import defpackage.qk30;
import defpackage.qke;
import defpackage.quz;
import defpackage.r1b0;
import defpackage.r2z0;
import defpackage.r4d;
import defpackage.rz9;
import defpackage.s09;
import defpackage.sb0;
import defpackage.sb2;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.so5;
import defpackage.sp5;
import defpackage.sya1;
import defpackage.t0a;
import defpackage.tje;
import defpackage.tls;
import defpackage.tn9;
import defpackage.to5;
import defpackage.tse0;
import defpackage.ty9;
import defpackage.u08;
import defpackage.uh6;
import defpackage.uic;
import defpackage.uo5;
import defpackage.up2;
import defpackage.v0a;
import defpackage.v0b1;
import defpackage.vfc;
import defpackage.vqr;
import defpackage.w01;
import defpackage.w2o;
import defpackage.wg6;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.x0a;
import defpackage.x2y;
import defpackage.x4c;
import defpackage.xa6;
import defpackage.xo1;
import defpackage.xx8;
import defpackage.xya1;
import defpackage.ymb1;
import defpackage.yrz;
import defpackage.z910;
import defpackage.zmo;
import defpackage.zp2;
import defpackage.zpn;
import defpackage.zsz;
import defpackage.zx40;
import defpackage.zy11;
import defpackage.zy9;
import java.util.List;
import java.util.Set;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class b {
    public static final void a(CharSequence charSequence, boolean z, sls slsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-886625561);
        int i2 = i | (btsVar2.k(charSequence) ? 4 : 2) | (btsVar2.a(z) ? 32 : 16) | (btsVar2.e(slsVar) ? 256 : 128) | HProv.ALG_TYPE_SECURECHANNEL;
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            wp2 up2Var = z ? AppColor$Palette.ControlMinor : new up2(zp2.d);
            byk0 c = cyk0.c(13.0f);
            c530 c530Var = c530.a;
            f530 c2 = bzk0.c(ymb1.l(c530Var, c), up2Var, qke.q);
            xa6 a = eab1.a(0.5f, tje.n(AppColor$Palette.Line, btsVar2));
            f530 d = q791.d(aab1.b(c2, a.a, a.b, c), false, null, null, slsVar, 15);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar2, d);
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
            qje.W(btsVar2, d.f, d2);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d3);
            qgy.b(charSequence, null, an91.l(c530Var, 14.0f, 13.0f), AppColor$Palette.Text, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar2, (i2 & 14) | 3456, 0, 16370);
            btsVar = btsVar2;
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new r2z0(charSequence, z, slsVar, f530Var2, i, 5);
        }
    }

    public static final void b(ty9 ty9Var, tls tlsVar, fid fidVar, int i) {
        float f;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2120036949);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(ty9Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = bzk0.c(ymb1.l(n.e(c530Var, 8.0f, btsVar, c530Var, 1.0f), cyk0.c(24.0f)), AppColor$Palette.BgMinor, qke.q);
            boolean z2 = ty9Var.e != null;
            boolean z3 = ((i2 & 112) == 32) | ((i2 & 14) == 4 || btsVar.e(ty9Var));
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new u08(26, ty9Var, tlsVar);
                btsVar.o0(Q);
            }
            f530 d = q791.d(c, z2, null, null, (sls) Q, 14);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, d);
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
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            f530 k = an91.k(n.d(btsVar, d2, wlsVar4, 1.0f, true), 12.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            qgy.b(ty9Var.a, null, null, null, uh6.E(20), 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).f.c, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 12270);
            btsVar = btsVar;
            CharSequence charSequence = ty9Var.b;
            if (charSequence == null) {
                btsVar.e0(226046425);
                btsVar.t(false);
            } else {
                btsVar.e0(226046426);
                qgy.b(charSequence, null, null, AppColor$Palette.TextMinor, uh6.E(13), 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).h.a, null, btsVar, 27648, 0, 12262);
                btsVar = btsVar;
                btsVar.t(false);
            }
            tn9 tn9Var = ty9Var.c;
            if (tn9Var == null) {
                btsVar.e0(226250219);
                btsVar.t(false);
                f = 8.0f;
            } else {
                f = 8.0f;
                tse0.s(btsVar, 226250220, c530Var, 8.0f, btsVar);
                chb1.a(tn9Var, null, btsVar, 0, 2);
                btsVar.t(false);
            }
            btsVar.t(true);
            nvi0 nvi0Var = ty9Var.d;
            if (nvi0Var == null) {
                btsVar.e0(-1567739668);
                btsVar.t(false);
                z = true;
            } else {
                btsVar.e0(-1567739667);
                z = true;
                v0b1.a(nvi0Var, ljs0.m(c530Var, 92.0f), null, null, null, null, null, null, 0.0f, 0, btsVar, 432, 1016);
                btsVar.t(false);
                f = 8.0f;
            }
            n.y(btsVar, z, c530Var, f, btsVar);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(ty9Var, tlsVar, i, 24);
        }
    }

    public static final void c(List list, Set set, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(111938824);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(list) : btsVar.e(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(set) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            vqr.c(ljs0.c(an91.o(c530.a, 0.0f, 8.0f, 0.0f, 16.0f, 5), 1.0f), new i43(4.0f, true, new m6(9, x4c.H)), new i43(4.0f, true, new quz(11)), null, 0, 0, wwg.S(416722989, true, new qk30(list, set, tlsVar, 16), btsVar), btsVar, 1573302, 56);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) list, (Object) set, tlsVar, i, 8);
        }
    }

    public static final void d(final az9 az9Var, int i, Set set, boolean z, boolean z2, final tls tlsVar, oip0 oip0Var, fid fidVar, int i2) {
        bts btsVar;
        o430 o430Var;
        boolean z3;
        int i3;
        zy9 zy9Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1693118680);
        int i4 = i2 | (btsVar2.e(az9Var) ? 4 : 2) | (btsVar2.c(i) ? 32 : 16) | (btsVar2.k(set) ? 256 : 128) | (btsVar2.a(z) ? 2048 : 1024) | (btsVar2.a(z2) ? 16384 : 8192) | (btsVar2.e(tlsVar) ? 131072 : 65536) | (btsVar2.k(oip0Var) ? 1048576 : 524288);
        final int i5 = 0;
        if (btsVar2.V(i4 & 1, (i4 & 599187) != 599186)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(pw91.u(ljs0.c(c530Var, 1.0f), oip0Var, 14), 16.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, m);
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
            g(az9Var.a, az9Var.b, btsVar2, 0);
            o430 o430Var2 = did.a;
            if (z) {
                btsVar2.e0(-98857218);
                boolean z4 = ((i4 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072) | ((i4 & 14) == 4 || btsVar2.e(az9Var));
                Object Q = btsVar2.Q();
                if (z4 || Q == o430Var2) {
                    Q = new tls() { // from class: qz9
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            int i6 = i5;
                            zy11 zy11Var = zy11.a;
                            az9 az9Var2 = az9Var;
                            tls tlsVar2 = tlsVar;
                            switch (i6) {
                                case 0:
                                    tlsVar2.invoke(new i0a(((Integer) obj).intValue(), az9Var2.h));
                                    break;
                                default:
                                    tlsVar2.invoke(new e0a((xy9) obj, az9Var2.h));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar2.o0(Q);
                }
                j(i, (i4 >> 3) & 14, btsVar2, (tls) Q);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-98543932);
                btsVar2.t(false);
            }
            if (z2) {
                btsVar2.e0(-1527196847);
                zy9 zy9Var2 = az9Var.g;
                if (zy9Var2 == null) {
                    btsVar2.e0(-98462000);
                    btsVar2.t(false);
                    btsVar = btsVar2;
                    o430Var = o430Var2;
                    z3 = false;
                    i3 = 8;
                } else {
                    btsVar2.e0(-98461999);
                    CharSequence charSequence = zy9Var2.a;
                    if (charSequence == null) {
                        btsVar2.e0(-1199092762);
                        btsVar2.t(false);
                        btsVar = btsVar2;
                        o430Var = o430Var2;
                        zy9Var = zy9Var2;
                        z3 = false;
                    } else {
                        btsVar2.e0(-1199092761);
                        f530 m2 = an91.m(ljs0.c(c530Var, 1.0f), 0.0f, 12.0f, 1);
                        ety0 ety0Var = xya1.e(btsVar2).g.a;
                        zy9Var = zy9Var2;
                        o430Var = o430Var2;
                        z3 = false;
                        qgy.b(charSequence, null, m2, AppColor$Palette.TextMinor, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, ety0Var, null, btsVar2, 3456, 0, 12146);
                        btsVar = btsVar2;
                        btsVar.t(false);
                    }
                    List list = zy9Var.b;
                    boolean z5 = (i4 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072 ? true : z3;
                    Object Q2 = btsVar.Q();
                    if (z5 || Q2 == o430Var) {
                        Q2 = new dv9(2, tlsVar);
                        btsVar.o0(Q2);
                    }
                    i3 = 8;
                    c(list, set, (tls) Q2, btsVar, ((i4 >> 3) & 112) | 8);
                    btsVar.t(z3);
                }
                btsVar.t(z3);
            } else {
                btsVar = btsVar2;
                o430Var = o430Var2;
                z3 = false;
                i3 = 8;
                btsVar.e0(-97884252);
                btsVar.t(false);
            }
            ty9 ty9Var = az9Var.d;
            if (ty9Var == null) {
                btsVar.e0(-97846216);
                btsVar.t(z3);
            } else {
                btsVar.e0(-97846215);
                boolean z6 = (((i4 & 14) == 4 || btsVar.e(az9Var)) ? true : z3) | ((i4 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072 ? true : z3);
                Object Q3 = btsVar.Q();
                if (z6 || Q3 == o430Var) {
                    final int i6 = 1;
                    Q3 = new tls() { // from class: qz9
                        @Override // defpackage.tls
                        public final Object invoke(Object obj) {
                            int i62 = i6;
                            zy11 zy11Var = zy11.a;
                            az9 az9Var2 = az9Var;
                            tls tlsVar2 = tlsVar;
                            switch (i62) {
                                case 0:
                                    tlsVar2.invoke(new i0a(((Integer) obj).intValue(), az9Var2.h));
                                    break;
                                default:
                                    tlsVar2.invoke(new e0a((xy9) obj, az9Var2.h));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    btsVar.o0(Q3);
                }
                b(ty9Var, (tls) Q3, btsVar, i3);
                btsVar.t(z3);
            }
            e(az9Var.f, az9Var.h, tlsVar, btsVar, ((i4 >> 9) & 896) | i3);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new rz9(az9Var, i, set, z, z2, tlsVar, oip0Var, i2);
        }
    }

    public static final void e(v0a v0aVar, ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage, tls tlsVar, fid fidVar, int i) {
        int i2;
        ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage2;
        fwi fwiVar;
        float f;
        boolean z;
        ety0 ety0Var;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1827545695);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? btsVar.k(v0aVar) : btsVar.e(v0aVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.c(chargersFeedbackCompletedOrder$FinishingStage.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (Q == obj) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            boolean isEmpty = v0aVar.c.isEmpty();
            boolean z2 = !isEmpty;
            fwi fwiVar2 = (fwi) btsVar.m(j.h);
            ck11 K = sb2.K(Constants.MINIMAL_ERROR_STATUS_CODE, 0, null, 6);
            if (((Boolean) oz40Var.getValue()).booleanValue()) {
                fwiVar = fwiVar2;
                f = 24.0f;
            } else {
                fwiVar = fwiVar2;
                f = 16.0f;
            }
            fwi fwiVar3 = fwiVar;
            m3u0 b = androidx.compose.animation.core.b.b(f, K, "title_font_size", null, btsVar, 3120, 20);
            m3u0 b2 = androidx.compose.animation.core.b.b(((Boolean) oz40Var.getValue()).booleanValue() ? fwiVar3.w0(48.0f) : 0.0f, K, "translation_y", null, btsVar, 3120, 20);
            m3u0 b3 = androidx.compose.animation.core.b.b(((Boolean) oz40Var.getValue()).booleanValue() ? 0.0f : -1.0f, K, "horizontal_bias", null, btsVar, 3120, 20);
            m3u0 b4 = androidx.compose.animation.core.b.b(((Boolean) oz40Var.getValue()).booleanValue() ? 180.0f : 0.0f, K, "chevron_rotation", null, btsVar, 3120, 20);
            Object Q2 = btsVar.Q();
            if (Q2 == obj) {
                Q2 = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q2;
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(c530Var2, 1.0f);
            Object Q3 = btsVar.Q();
            if (Q3 == obj) {
                Q3 = new w01(4, oz40Var);
                btsVar.o0(Q3);
            }
            f530 m = an91.m(q791.b(c, zx40Var, null, z2, null, null, (sls) Q3, 24), 0.0f, 16.0f, 1);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, m);
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
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 c2 = ljs0.c(c530Var2, 1.0f);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar, c2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d3);
            f530 c3 = ljs0.c(c530Var2, 1.0f);
            boolean k = btsVar.k(b2);
            Object Q4 = btsVar.Q();
            if (k || Q4 == obj) {
                Q4 = new xo1(b2, 4);
                btsVar.o0(Q4);
            }
            f530 a2 = androidx.compose.ui.graphics.d.a(c3, (tls) Q4);
            sic a3 = qic.a(g43Var, new so5(((Number) b3.getValue()).floatValue()), btsVar, 0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, a2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar2);
            qje.W(btsVar, wlsVar4, d4);
            String str = v0aVar.a;
            long K2 = uh6.K(((Number) b.getValue()).floatValue(), 4294967296L);
            if (((Boolean) oz40Var.getValue()).booleanValue()) {
                btsVar.e0(1558145180);
                ety0Var = xya1.b(btsVar).f;
                z = false;
            } else {
                z = false;
                btsVar.e0(1558146423);
                ety0Var = xya1.e(btsVar).g.b;
            }
            btsVar.t(z);
            boolean z3 = z;
            jeb1.f(str, null, null, K2, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var, btsVar, 0, 0, 16246);
            bts btsVar2 = btsVar;
            String str2 = v0aVar.b;
            if (str2 == null) {
                btsVar2.e0(1057991703);
                btsVar2.t(z3);
            } else {
                btsVar2.e0(1057991704);
                jeb1.f(str2, null, AppColor$Palette.TextMinor, uh6.E(13), 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, null, btsVar2, 3456, 0, 32626);
                btsVar2 = btsVar2;
                btsVar2.t(z3);
            }
            btsVar2.t(true);
            Boolean valueOf2 = Boolean.valueOf(z2);
            if (isEmpty) {
                valueOf2 = null;
            }
            if (valueOf2 == null) {
                btsVar2.e0(795450958);
                btsVar2.t(z3);
                c530Var = c530Var2;
            } else {
                btsVar2.e0(795450959);
                c530Var = c530Var2;
                sya1.a(ilb1.a(), ira1.i(ljs0.m(cj6.a.a(c530Var, x4c.w), 24.0f), ((Number) b4.getValue()).floatValue()), null, AppColor$Palette.Text, btsVar2, HProv.ALG_TYPE_SECURECHANNEL, 4);
                btsVar2.t(z3);
            }
            btsVar2.t(true);
            boolean booleanValue = ((Boolean) oz40Var.getValue()).booleanValue();
            w2o d5 = k.d(null, null, 15);
            zmo l = k.l(null, null, 15);
            boolean k2 = btsVar2.k(b2);
            Object Q5 = btsVar2.Q();
            if (k2 || Q5 == obj) {
                Q5 = new xo1(b2, 5);
                btsVar2.o0(Q5);
            }
            chargersFeedbackCompletedOrder$FinishingStage2 = chargersFeedbackCompletedOrder$FinishingStage;
            bts btsVar3 = btsVar2;
            g.b(uic.a, booleanValue, androidx.compose.ui.graphics.d.a(c530Var, (tls) Q5), d5, l, null, wwg.S(1702638509, true, new qk30(v0aVar, chargersFeedbackCompletedOrder$FinishingStage2, tlsVar, 15), btsVar2), btsVar3, 1600518, 16);
            btsVar = btsVar3;
            btsVar.t(true);
        } else {
            chargersFeedbackCompletedOrder$FinishingStage2 = chargersFeedbackCompletedOrder$FinishingStage;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new s09((Object) v0aVar, (Object) chargersFeedbackCompletedOrder$FinishingStage2, tlsVar, i, 7);
        }
    }

    public static final void f(dz9 dz9Var, sls slsVar, sls slsVar2, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1740026636);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.e(dz9Var) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(slsVar2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            byk0 e = cyk0.e(24.0f, 24.0f, 0.0f, 0.0f, 12);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 d3 = i9a1.d(bzk0.c(ymb1.l(ljs0.c(hbb1.c(c530Var, dbb1.c(btsVar), false, 24.0f, null, 10), 1.0f), e), AppColor$Palette.BgFloating, qke.q));
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, d3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d4);
            if (dz9Var == null) {
                btsVar.e0(457199738);
                btsVar.t(false);
            } else {
                btsVar.e0(457199739);
                h(dz9Var, slsVar, btsVar, (i2 & 14) | 8 | (i2 & 112));
                btsVar.t(false);
            }
            ButtonStyle buttonStyle = ButtonStyle.Main;
            f530 k = an91.k(ljs0.c(c530Var, 1.0f), 8.0f);
            r4d.a.getClass();
            d17.c(k, false, null, buttonStyle, null, slsVar2, r4d.b, btsVar, ((i2 << 9) & ImageMetadata.JPEG_GPS_COORDINATES) | 1575942, 22);
            btsVar.t(true);
            if ((dz9Var != null ? dz9Var.e : null) == null) {
                btsVar.e0(1693138219);
                btsVar.t(false);
            } else {
                btsVar.e0(1693138220);
                i(dz9Var.e.intValue(), 0, btsVar, cj6.a.a(c530Var, x4c.B));
                btsVar.t(false);
            }
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(dz9Var, slsVar, slsVar2, i, 27);
        }
    }

    public static final void g(String str, nvi0 nvi0Var, fid fidVar, int i) {
        String str2;
        nvi0 nvi0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(956029925);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(nvi0Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 g = ljs0.g(c530Var, 72.0f, 0.0f, 2);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, g);
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
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, c530Var);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            jeb1.f(ohb1.e(btsVar, kyh0.chargers_feedback_order_completed_title), new x2y(1.0f, true), null, 0L, 0L, null, null, 0L, 2, false, 1, 0, null, xya1.b(btsVar).e, btsVar, 805306368, 48, 13820);
            f530 m = an91.m(c530Var, 0.0f, 12.0f, 1);
            z910 d3 = pi6.d(x4c.b, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d4);
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            ety0 ety0Var = xya1.e(btsVar).g.c;
            f530 o4 = an91.o(c530Var, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            uo5 uo5Var = x4c.w;
            cj6 cj6Var = cj6.a;
            f530 l = ymb1.l(cj6Var.a(o4, uo5Var), cyk0.c(4.0f));
            AppColor$Palette appColor$Palette2 = AppColor$Palette.ControlMinor;
            gji0 gji0Var = qke.q;
            jeb1.f(str, an91.l(bzk0.c(l, appColor$Palette2, gji0Var), 8.0f, 4.0f), appColor$Palette, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0Var, btsVar, (i2 & 14) | 384, 0, 16376);
            str2 = str;
            nvi0Var2 = nvi0Var;
            btsVar = btsVar;
            v0b1.a(nvi0Var2, ljs0.m(cj6Var.a(c530Var, uo5Var), 40.0f), null, null, null, null, null, mhe.e, 0.0f, 0, btsVar, ((i2 >> 3) & 14) | 12582912, 892);
            btsVar.t(true);
            btsVar.t(true);
            oeb1.c(btsVar, bzk0.c(ljs0.e(ljs0.c(c530Var, 1.0f), 0.5f), AppColor$Palette.Line, gji0Var));
            btsVar.t(true);
        } else {
            str2 = str;
            nvi0Var2 = nvi0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(str2, nvi0Var2, i, 25);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    public static final void h(dz9 dz9Var, sls slsVar, fid fidVar, int i) {
        dz9 dz9Var2;
        bts btsVar;
        wls wlsVar;
        sls slsVar2;
        wls wlsVar2;
        tls tlsVar;
        c530 c530Var;
        ?? r0;
        wls wlsVar3;
        bts btsVar2;
        bts btsVar3 = (bts) fidVar;
        btsVar3.g0(-1914920916);
        dmw0 dmw0Var = btsVar3.a;
        int i2 = i | (btsVar3.e(dz9Var) ? 4 : 2) | (btsVar3.e(slsVar) ? 32 : 16);
        if (btsVar3.V(i2 & 1, (i2 & 19) != 18)) {
            to5 to5Var = x4c.E;
            c530 c530Var2 = c530.a;
            f530 e = ljs0.e(ljs0.c(c530Var2, 1.0f), 56.0f);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar3.Q();
            if (z || Q == did.a) {
                Q = new jc0(15, slsVar);
                btsVar3.o0(Q);
            }
            f530 d = q791.d(e, false, null, null, (sls) Q, 15);
            lhl0 a = khl0.a(lr20.a, to5Var, btsVar3, 48);
            int hashCode = Long.hashCode(btsVar3.T);
            r1b0 o = btsVar3.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar3, d);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            zy11 zy11Var = null;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar3);
            } else {
                btsVar3.r0();
            }
            wls wlsVar4 = d.f;
            qje.W(btsVar3, wlsVar4, a);
            wls wlsVar5 = d.e;
            qje.W(btsVar3, wlsVar5, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar6 = d.g;
            qje.W(btsVar3, wlsVar6, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar3, tlsVar2);
            wls wlsVar7 = d.d;
            qje.W(btsVar3, wlsVar7, d2);
            nvi0 nvi0Var = dz9Var.f;
            if (nvi0Var == null) {
                btsVar3.e0(-1796645979);
                btsVar3.t(false);
                wlsVar = wlsVar4;
                wlsVar2 = wlsVar7;
                tlsVar = tlsVar2;
                c530Var = c530Var2;
                r0 = 0;
                wlsVar3 = wlsVar6;
                slsVar2 = slsVar3;
            } else {
                btsVar3.e0(-1796645978);
                wlsVar = wlsVar4;
                slsVar2 = slsVar3;
                wlsVar2 = wlsVar7;
                tlsVar = tlsVar2;
                c530Var = c530Var2;
                r0 = 0;
                wlsVar3 = wlsVar6;
                v0b1.a(nvi0Var, ljs0.m(c530Var2, 56.0f), null, null, null, null, null, mhe.f, 0.0f, 0, btsVar3, 12582960, 892);
                btsVar3.t(false);
                zy11Var = zy11.a;
            }
            if (zy11Var == null) {
                btsVar3.e0(-1796497984);
                oeb1.c(btsVar3, ljs0.q(c530Var, 16.0f));
                btsVar3.t(r0);
            } else {
                btsVar3.e0(2020253164);
                btsVar3.t(r0);
            }
            f530 o2 = an91.o(new x2y(1.0f, true), 0.0f, 0.0f, 16.0f, 0.0f, 11);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar3, r0);
            int hashCode2 = Long.hashCode(btsVar3.T);
            r1b0 o3 = btsVar3.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar3, o2);
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar2);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, wlsVar, a2);
            qje.W(btsVar3, wlsVar5, o3);
            vfc.v(hashCode2, btsVar3, wlsVar3, btsVar3, tlsVar);
            qje.W(btsVar3, wlsVar2, d3);
            dz9Var2 = dz9Var;
            qgy.b(dz9Var2.b, null, ljs0.c(c530Var, 1.0f), AppColor$Palette.Text, uh6.E(16), 0L, null, 0L, 2, 1, 0, xya1.e(btsVar3).g.a, null, btsVar3, 805334400, 6, 10722);
            bts btsVar4 = btsVar3;
            if (dz9Var2.c == null) {
                btsVar4.e0(1021031925);
                btsVar4.t(r0);
                btsVar2 = btsVar4;
            } else {
                btsVar4.e0(1021031926);
                qgy.b(dz9Var2.c, null, ljs0.c(c530Var, 1.0f), AppColor$Palette.TextMinor, uh6.E(13), 0L, null, 0L, 2, 1, 0, xya1.e(btsVar4).h.a, null, btsVar4, 805334400, 6, 10722);
                bts btsVar5 = btsVar4;
                btsVar5.t(r0);
                btsVar2 = btsVar5;
            }
            btsVar2.t(true);
            btsVar2.t(true);
            btsVar = btsVar2;
        } else {
            dz9Var2 = dz9Var;
            btsVar3.Y();
            btsVar = btsVar3;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(dz9Var2, slsVar, i, 26);
        }
    }

    public static final void i(int i, int i2, fid fidVar, f530 f530Var) {
        int i3;
        dc0 dc0Var;
        aii0 aii0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-723129237);
        int i4 = (btsVar.c(i) ? 4 : 2) | i2 | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i4 & 1, (i4 & 19) != 18)) {
            LottieCompositionResultImpl f = com.airbnb.lottie.compose.a.f(new zsz(i), btsVar, 0);
            int i5 = i4 & 14;
            boolean z = i5 == 4;
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (z || Q == obj) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            Integer valueOf = Integer.valueOf(i);
            boolean k = btsVar.k(oz40Var);
            Object Q2 = btsVar.Q();
            if (k || Q2 == obj) {
                Q2 = new ChargersFeedbackScreenKt$ChargersFeedbackPromoPlateAnimation$1$1(oz40Var, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, valueOf);
            yrz c = com.airbnb.lottie.compose.a.c((nsz) f.getValue(), ((Boolean) oz40Var.getValue()).booleanValue(), false, false, 0.0f, 1, btsVar, 956);
            boolean z2 = i5 == 4;
            Object Q3 = btsVar.Q();
            if (z2 || Q3 == obj) {
                Q3 = f.j(Boolean.FALSE);
                btsVar.o0(Q3);
            }
            oz40 oz40Var2 = (oz40) Q3;
            Integer valueOf2 = Integer.valueOf(i);
            Float valueOf3 = Float.valueOf(((Number) ((LottieAnimatableImpl) c).getValue()).floatValue());
            nsz nszVar = (nsz) f.getValue();
            boolean k2 = btsVar.k(f) | btsVar.k(c) | btsVar.k(oz40Var2);
            Object Q4 = btsVar.Q();
            if (k2 || Q4 == obj) {
                Q4 = new ChargersFeedbackScreenKt$ChargersFeedbackPromoPlateAnimation$2$1(f, c, oz40Var2, null);
                btsVar.o0(Q4);
            }
            zpn.g(valueOf2, valueOf3, nszVar, (wls) Q4, btsVar);
            if (((Boolean) oz40Var2.getValue()).booleanValue() || !((Boolean) oz40Var.getValue()).booleanValue()) {
                aii0Var = btsVar.v();
                if (aii0Var != null) {
                    dc0Var = new dc0(i, f530Var, i2, 6);
                    aii0Var.d = dc0Var;
                }
                return;
            }
            f530 e = ljs0.e(ljs0.c(f530Var, 1.0f), 122.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, e);
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
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            nsz nszVar2 = (nsz) f.getValue();
            AsyncUpdates asyncUpdates = AsyncUpdates.ENABLED;
            f530 c2 = ljs0.c(f530Var, 1.0f);
            boolean k3 = btsVar.k(c);
            Object Q5 = btsVar.Q();
            if (k3 || Q5 == obj) {
                Q5 = new ju8(25, c);
                btsVar.o0(Q5);
            }
            com.airbnb.lottie.compose.a.a(nszVar2, (sls) Q5, c2, false, false, false, false, null, false, null, null, mhe.d, false, false, null, asyncUpdates, false, btsVar, ImageMetadata.EDGE_MODE, 197040, 92120);
            btsVar = btsVar;
            btsVar.t(true);
            i3 = i;
        } else {
            i3 = i;
            btsVar.Y();
        }
        aii0Var = btsVar.v();
        if (aii0Var != null) {
            dc0Var = new dc0(i3, f530Var, i2, 7);
            aii0Var.d = dc0Var;
        }
    }

    public static final void j(int i, int i2, fid fidVar, tls tlsVar) {
        int i3;
        int i4;
        bts btsVar = (bts) fidVar;
        btsVar.g0(5234521);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.c(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = androidx.compose.ui.b.d(btsVar, c);
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
            oeb1.c(btsVar, ljs0.e(c530Var, 20.0f));
            jeb1.f(ohb1.e(btsVar, kyh0.chargers_feedback_rating_bar_title), ljs0.c(c530Var, 1.0f), AppColor$Palette.TextMinor, uh6.E(16), 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, null, btsVar, 3504, 0, 32624);
            oeb1.c(btsVar, ljs0.e(c530Var, 20.0f));
            i4 = 1;
            com.yandex.go.chargers.feedback.ui.components.a.a(null, i, 0, null, null, 0.0f, 0L, tlsVar, btsVar, ((i3 << 3) & 112) | ((i3 << 18) & 29360128));
            ly3.B(c530Var, 16.0f, btsVar, true);
        } else {
            i4 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new an1(i, tlsVar, i2, i4);
        }
    }

    public static final void k(t0a t0aVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1901988726);
        int i2 = i | (btsVar.k(t0aVar) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            oip0 o = pw91.o(btsVar);
            wg6 a = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 48, 0, 8189);
            androidx.compose.runtime.internal.a S = wwg.S(1222899178, true, new sp5(13, t0aVar, tlsVar), btsVar);
            androidx.compose.runtime.internal.a S2 = wwg.S(925399062, true, new dhj0(3, t0aVar, tlsVar, o), btsVar);
            btsVar = btsVar;
            com.yandex.go.design.compose.modal.bottomsheet.c.a(null, a, null, false, false, null, null, null, null, null, S, S2, btsVar, 0, 54, 1021);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(t0aVar, tlsVar, i, 27);
        }
    }

    public static final void l(x0a x0aVar, ChargersFeedbackCompletedOrder$FinishingStage chargersFeedbackCompletedOrder$FinishingStage, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1018640199);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | (btsVar2.k(x0aVar) ? 4 : 2) | (btsVar2.c(chargersFeedbackCompletedOrder$FinishingStage.ordinal()) ? 32 : 16) | (btsVar2.e(tlsVar) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), 32.0f);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar2, 48);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = androidx.compose.ui.b.d(btsVar2, e);
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
            qje.W(btsVar2, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar2, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            qgy.b(x0aVar.a, null, null, AppColor$Palette.TextMinor, uh6.E(16), 0L, null, 0L, 0, 0, 0, null, null, btsVar2, 27648, 0, 16358);
            x2y x2yVar = new x2y(1.0f, true);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d3 = androidx.compose.ui.b.d(btsVar2, x2yVar);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, d2);
            qje.W(btsVar2, wlsVar2, o2);
            vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar2);
            qje.W(btsVar2, wlsVar4, d3);
            hk2 hk2Var = new hk2(0);
            hk2Var.d(cvu0.u(100, Extension.DOT_CHAR));
            jeb1.d(hk2Var.i(), ljs0.c(c530Var, 1.0f), AppColor$Palette.Line, uh6.E(16), 0L, null, 0L, 0, false, 1, 0, null, null, xya1.e(btsVar2).g.a, btsVar2, 3504, 48, 30704);
            btsVar2.t(true);
            CharSequence charSequence = x0aVar.b;
            long E = uh6.E(16);
            ety0 ety0Var = xya1.e(btsVar2).g.a;
            f530 l = ymb1.l(c530Var, cyk0.c(4.0f));
            awk0 awk0Var = new awk0(0);
            boolean z = ((i2 & 896) == 256) | ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object Q = btsVar2.Q();
            if (z || Q == did.a) {
                Q = new sb0(11, tlsVar, x0aVar, chargersFeedbackCompletedOrder$FinishingStage);
                btsVar2.o0(Q);
            }
            qgy.b(charSequence, null, q791.b(l, null, null, true, null, awk0Var, (sls) Q, 8), null, E, 0L, new sjy0(6), 0L, 0, 0, 0, ety0Var, null, btsVar2, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 12138);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(x0aVar, chargersFeedbackCompletedOrder$FinishingStage, tlsVar, i, 26);
        }
    }
}
