package com.yandex.go.ai_widget.ui;

import android.content.res.Configuration;
import android.content.res.Resources;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.j;
import com.adjust.sdk.Constants;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.ai_widget.ui.a;
import com.yandex.go.ai_widget.ui.component.e;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.aii0;
import defpackage.an91;
import defpackage.ap1;
import defpackage.b0;
import defpackage.bp1;
import defpackage.bts;
import defpackage.c530;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cp1;
import defpackage.cra1;
import defpackage.d17;
import defpackage.did;
import defpackage.dmw0;
import defpackage.dwh0;
import defpackage.f530;
import defpackage.fgd;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fwi;
import defpackage.g3z;
import defpackage.g43;
import defpackage.gi91;
import defpackage.hi91;
import defpackage.j01;
import defpackage.j1h0;
import defpackage.jeb1;
import defpackage.k3r;
import defpackage.kyh0;
import defpackage.le;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m0;
import defpackage.m3u0;
import defpackage.mhe;
import defpackage.mt71;
import defpackage.n;
import defpackage.n2d;
import defpackage.nsz;
import defpackage.o0;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.oeb1;
import defpackage.ohb1;
import defpackage.ohd;
import defpackage.on70;
import defpackage.oz40;
import defpackage.pi6;
import defpackage.q0v;
import defpackage.qic;
import defpackage.qje;
import defpackage.qv10;
import defpackage.qy20;
import defpackage.r1b0;
import defpackage.sb2;
import defpackage.sg0;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.sm91;
import defpackage.so5;
import defpackage.teb;
import defpackage.tls;
import defpackage.tra1;
import defpackage.tse;
import defpackage.u5;
import defpackage.uic;
import defpackage.uo5;
import defpackage.up1;
import defpackage.vfc;
import defpackage.vp1;
import defpackage.vsz;
import defpackage.wls;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xg0;
import defpackage.xp1;
import defpackage.xvz;
import defpackage.xx8;
import defpackage.xya1;
import defpackage.yo1;
import defpackage.yrz;
import defpackage.yur;
import defpackage.z910;
import defpackage.zbd;
import defpackage.zls;
import defpackage.zo1;
import defpackage.zpn;
import defpackage.zy11;
import java.util.Arrays;
import java.util.List;
import kotlin.coroutines.EmptyCoroutineContext;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class a {
    public static final void a(int i, int i2, fid fidVar, sls slsVar, f530 f530Var, String str, boolean z) {
        f530 f530Var2;
        int i3;
        boolean z2;
        int i4;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-741089351);
        int i5 = (btsVar.k(str) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i5 | (btsVar.k(f530Var2) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 384;
            z2 = z;
        } else {
            z2 = z;
            i4 = i3 | (btsVar.a(z2) ? 256 : 128);
        }
        int i8 = i4 | (btsVar.e(slsVar) ? 2048 : 1024);
        if (btsVar.V(i8 & 1, (i8 & 1171) != 1170)) {
            f530 f530Var3 = i6 != 0 ? c530.a : f530Var2;
            z3 = i7 != 0 ? true : z2;
            d17.d(ljs0.c(f530Var3, 1.0f), z3, null, null, null, slsVar, wwg.S(-909541306, true, new le(str, 6), btsVar), btsVar, ((i8 >> 3) & 112) | 1572864 | ((i8 << 6) & ImageMetadata.JPEG_GPS_COORDINATES), 28);
            f530Var2 = f530Var3;
        } else {
            btsVar.Y();
            z3 = z2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bp1(str, f530Var2, z3, slsVar, i, i2);
        }
    }

    public static final void b(xp1 xp1Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1478584507);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(xp1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new AiWidgetEvaluationScreenKt$AiWidgetEvaluationScreen$1$1(tlsVar, null);
                btsVar.o0(Q);
            }
            zpn.e(btsVar, (wls) Q, zy11.a);
            qy20.a(null, null, null, false, wwg.S(-601564569, true, new u5(21, xp1Var, tlsVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 15);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(xp1Var, tlsVar, i, 15);
        }
    }

    public static final void c(wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-313516389);
        int i2 = 0;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            f530 a = on70.a(an91.m(ljs0.c(c530.a, 1.0f), 32.0f, 0.0f, 2), 0.8f);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, a);
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
            xvz.u(6, wlsVar, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cp1(i, i2, wlsVar);
        }
    }

    public static final void d(up1 up1Var, com.yandex.go.ai_widget.ui.component.b bVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-143806144);
        int i2 = i | (btsVar.k(up1Var) ? 4 : 2) | (btsVar.k(bVar) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            fgd fgdVar = (fgd) btsVar.m(g3z.a);
            List list = up1Var.b;
            f530 c = ljs0.c(c530.a, 1.0f);
            int i3 = i2 & 896;
            boolean e = btsVar.e(fgdVar) | (i3 == 256);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (e || Q == o430Var) {
                Q = new u5(22, fgdVar, tlsVar);
                btsVar.o0(Q);
            }
            zls zlsVar = (zls) Q;
            boolean z = i3 == 256;
            Object Q2 = btsVar.Q();
            if (z || Q2 == o430Var) {
                Q2 = new o0(19, tlsVar);
                btsVar.o0(Q2);
            }
            n2d.a.getClass();
            e.c(list, bVar, c, zlsVar, (sls) Q2, n2d.f, btsVar, (i2 & 112) | 196992);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(up1Var, bVar, tlsVar, i, 9);
        }
    }

    public static final void e(boolean z, String str, String str2, float f, float f2, fid fidVar, int i) {
        int i2;
        f530 f530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(76354690);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i | (btsVar.a(z) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.k(str2) ? 256 : 128) | (btsVar.b(f) ? 2048 : 1024) | (btsVar.b(f2) ? 16384 : 8192);
        if (btsVar.V(i3 & 1, (i3 & 9363) != 9362)) {
            LottieCompositionResultImpl f3 = com.airbnb.lottie.compose.a.f(new vsz("ai-widget-evaluator-heart.json"), btsVar, 6);
            yrz c = com.airbnb.lottie.compose.a.c((nsz) f3.getValue(), z, false, false, 0.0f, 1, btsVar, 956);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = vfc.g(btsVar);
            }
            yur yurVar = (yur) Q;
            Boolean valueOf = Boolean.valueOf(z);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new AiWidgetEvaluationScreenKt$CompletionAnimationContent$1$1(z, yurVar, null);
                btsVar.o0(Q2);
            }
            zpn.e(btsVar, (wls) Q2, valueOf);
            c530 c530Var = c530.a;
            f530 f4 = sm91.f(ljs0.c(c530Var, 1.0f), 0.0f, -32.0f, 1);
            boolean z3 = (i3 & HProv.ALG_CLASS_ALL) == 16384;
            Object Q3 = btsVar.Q();
            if (z3 || Q3 == o430Var) {
                Q3 = new yo1(f2, 0);
                btsVar.o0(Q3);
            }
            f530 d = sm91.d(f4, (tls) Q3);
            int i5 = 20;
            if (z) {
                i2 = 0;
                btsVar.e0(362438314);
                btsVar.t(false);
                f530Var = c530Var;
            } else {
                btsVar.e0(362437401);
                Object Q4 = btsVar.Q();
                if (Q4 == o430Var) {
                    Q4 = new teb(i5);
                    btsVar.o0(Q4);
                }
                f530Var = fnq0.a(c530Var, (tls) Q4);
                i2 = 0;
                btsVar.t(false);
            }
            f530 k = d.k(f530Var);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar, i2);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
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
            Integer valueOf2 = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf2);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            nsz nszVar = (nsz) f3.getValue();
            boolean k2 = (i4 == 4) | btsVar.k(c);
            Object Q5 = btsVar.Q();
            if (k2 || Q5 == o430Var) {
                Q5 = new zo1(z, c, 0);
                btsVar.o0(Q5);
            }
            sls slsVar2 = (sls) Q5;
            f530 c2 = ljs0.c(c530Var, 1.0f);
            Object Q6 = btsVar.Q();
            if (Q6 == o430Var) {
                Q6 = new teb(20);
                btsVar.o0(Q6);
            }
            com.airbnb.lottie.compose.a.a(nszVar, slsVar2, fnq0.a(c2, (tls) Q6), false, false, false, false, null, false, null, null, null, false, false, null, null, false, btsVar, 0, 0, 131064);
            oeb1.c(btsVar, ljs0.e(c530Var, 24.0f));
            f530 b = tra1.b(c530Var, f);
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, b);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            f530 d4 = hi91.d(gi91.b(ljs0.c(c530Var, 1.0f), yurVar), false, null, 3);
            Object Q7 = btsVar.Q();
            if (Q7 == o430Var) {
                Q7 = new j01(17);
                btsVar.o0(Q7);
            }
            f530 b2 = fnq0.b(d4, false, (tls) Q7);
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            jeb1.f(str, b2, appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).e.d, btsVar, ((i3 >> 3) & 14) | 384, 0, 16248);
            btsVar = btsVar;
            jeb1.f(str2, n.e(c530Var, 8.0f, btsVar, c530Var, 1.0f), appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, ((i3 >> 6) & 14) | 432, 0, 16248);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ap1(z, str, str2, f, f2, i);
        }
    }

    public static final void f(final up1 up1Var, final tls tlsVar, fid fidVar, int i) {
        up1 up1Var2;
        tls tlsVar2;
        String str;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1359182412);
        int i2 = (btsVar.k(up1Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            fwi fwiVar = (fwi) btsVar.m(j.h);
            btsVar.e0(-568891138);
            float w0 = fwiVar.w0(((Configuration) btsVar.m(AndroidCompositionLocals_androidKt.a)).screenWidthDp);
            btsVar.t(false);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = zpn.j(EmptyCoroutineContext.a, btsVar);
                btsVar.o0(Q);
            }
            tse tseVar = (tse) Q;
            boolean b = btsVar.b(w0);
            Object Q2 = btsVar.Q();
            if (b || Q2 == o430Var) {
                Q2 = new com.yandex.go.ai_widget.ui.component.b(tseVar, w0);
                btsVar.o0(Q2);
            }
            final com.yandex.go.ai_widget.ui.component.b bVar = (com.yandex.go.ai_widget.ui.component.b) Q2;
            final boolean z = up1Var.i;
            Object Q3 = btsVar.Q();
            if (Q3 == o430Var) {
                Q3 = f.j(Boolean.FALSE);
                btsVar.o0(Q3);
            }
            final oz40 oz40Var = (oz40) Q3;
            Boolean valueOf = Boolean.valueOf(z);
            boolean a = btsVar.a(z);
            Object Q4 = btsVar.Q();
            if (a || Q4 == o430Var) {
                Q4 = new AiWidgetEvaluationScreenKt$ContentScreen$1$1(z, oz40Var, null);
                btsVar.o0(Q4);
            }
            zpn.e(btsVar, (wls) Q4, valueOf);
            final m3u0 b2 = androidx.compose.animation.core.b.b(z ? 0.0f : 1.0f, sb2.K(Constants.MINIMAL_ERROR_STATUS_CODE, 0, null, 6), null, null, btsVar, 48, 28);
            final m3u0 b3 = androidx.compose.animation.core.b.b(((Boolean) oz40Var.getValue()).booleanValue() ? 1.0f : 0.0f, sb2.K(Constants.MINIMAL_ERROR_STATUS_CODE, 0, null, 6), null, null, btsVar, 48, 28);
            final m3u0 b4 = androidx.compose.animation.core.b.b(((Boolean) oz40Var.getValue()).booleanValue() ? 0.0f : 24.0f, sb2.K(Constants.MINIMAL_ERROR_STATUS_CODE, 0, null, 6), null, null, btsVar, 48, 28);
            String str2 = up1Var.a;
            int i3 = up1Var.h;
            if (i3 > 0) {
                btsVar.e0(-383879777);
                str = ((Resources) btsVar.m(AndroidCompositionLocals_androidKt.c)).getQuantityString(dwh0.texts_evaluator_remaining_texts_hint, i3, Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                btsVar.t(false);
            } else {
                btsVar.e0(-383766782);
                btsVar.t(false);
                str = "";
            }
            String str3 = str;
            boolean z2 = (i2 & 112) == 32;
            Object Q5 = btsVar.Q();
            if (z2 || Q5 == o430Var) {
                Q5 = new o0(21, tlsVar);
                btsVar.o0(Q5);
            }
            up1Var2 = up1Var;
            tlsVar2 = tlsVar;
            i((sls) Q5, str2, str3, wwg.S(-410672726, true, new b0(up1Var, b4, tlsVar, oz40Var, b3), btsVar), wwg.S(-1246411719, true, new zls() { // from class: dp1
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    fid fidVar2 = (fid) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    bts btsVar2 = (bts) fidVar2;
                    if (btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                        up1 up1Var3 = up1Var;
                        boolean z3 = z;
                        com.yandex.go.ai_widget.ui.component.b bVar2 = com.yandex.go.ai_widget.ui.component.b.this;
                        a.c(wwg.S(1767580115, true, new wo1(up1Var3, z3, bVar2, tlsVar, oz40Var, b3, b4), btsVar2), btsVar2, 6);
                        float floatValue = ((Number) b2.getValue()).floatValue();
                        f530 f530Var = c530.a;
                        f530 b5 = tra1.b(f530Var, floatValue);
                        if (z3) {
                            btsVar2.e0(494234576);
                            Object Q6 = btsVar2.Q();
                            if (Q6 == did.a) {
                                Q6 = new teb(20);
                                btsVar2.o0(Q6);
                            }
                            f530Var = fnq0.a(f530Var, (tls) Q6);
                        } else {
                            btsVar2.e0(494235489);
                        }
                        btsVar2.t(false);
                        xqa1.a(bVar2, b5.k(f530Var), btsVar2, 0);
                    } else {
                        btsVar2.Y();
                    }
                    return zy11.a;
                }
            }, btsVar), btsVar, 27648, 0);
        } else {
            up1Var2 = up1Var;
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(up1Var2, tlsVar2, i, 10);
        }
    }

    public static final void g(vp1 vp1Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1211007349);
        int i2 = (btsVar.k(vp1Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            String e = ohb1.e(btsVar, vp1Var.a ? kyh0.common_close : kyh0.texts_evaluator_error_button_text);
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new o0(22, tlsVar);
                btsVar.o0(Q);
            }
            androidx.compose.runtime.internal.a S = wwg.S(-197736745, true, new xx8(8, e, vp1Var, tlsVar), btsVar);
            n2d.a.getClass();
            i((sls) Q, null, null, S, n2d.e, btsVar, 27648, 6);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(vp1Var, tlsVar, i, 9);
        }
    }

    public static final void h(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1602029755);
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 f = sm91.f(ljs0.c(c530Var, 1.0f), 0.0f, -32.0f, 1);
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f);
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
            o4b1.b(mt71.m(j1h0.ai_widget_error, 0, btsVar), null, ljs0.m(c530Var, 160.0f), null, mhe.b, 0.0f, null, btsVar, 25016, 104);
            f530 e = n.e(c530Var, 24.0f, btsVar, c530Var, 1.0f);
            String e2 = ohb1.e(btsVar, kyh0.texts_evaluator_error_title);
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            jeb1.f(e2, e, appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).e.d, btsVar, 432, 0, 16248);
            jeb1.f(ohb1.e(btsVar, kyh0.texts_evaluator_error_subtitle), n.e(c530Var, 8.0f, btsVar, c530Var, 1.0f), appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, 432, 0, 16248);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zbd(i, 12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:48:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x006c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void i(sls slsVar, String str, String str2, wls wlsVar, zls zlsVar, fid fidVar, int i, int i2) {
        String str3;
        int i3;
        String str4;
        int i4;
        wls wlsVar2;
        zls zlsVar2;
        String str5;
        aii0 v;
        sls slsVar2;
        String str6;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1324171058);
        dmw0 dmw0Var = btsVar.a;
        int i5 = (btsVar.e(slsVar) ? 4 : 2) | i;
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 = i5 | 48;
            str3 = str;
        } else {
            str3 = str;
            i3 = i5 | (btsVar.k(str3) ? 32 : 16);
        }
        int i7 = i2 & 4;
        if (i7 != 0) {
            i4 = i3 | 384;
            str4 = str2;
        } else {
            str4 = str2;
            i4 = i3 | (btsVar.k(str4) ? 256 : 128);
        }
        int i8 = i2 & 8;
        if (i8 != 0) {
            i4 |= HProv.ALG_TYPE_SECURECHANNEL;
        } else if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            wlsVar2 = wlsVar;
            i4 |= btsVar.e(wlsVar2) ? 2048 : 1024;
            if (btsVar.V(i4 & 1, (i4 & 9363) == 9362)) {
                zlsVar2 = zlsVar;
                btsVar.Y();
                str5 = str4;
            } else {
                String str7 = i6 != 0 ? "" : str3;
                if (i7 != 0) {
                    str4 = "";
                }
                if (i8 != 0) {
                    wlsVar2 = null;
                }
                k3r k3rVar = ljs0.c;
                so5 so5Var = x4c.G;
                sic a = qic.a(lr20.c, so5Var, btsVar, 0);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, k3rVar);
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
                wls wlsVar3 = d.f;
                qje.W(btsVar, wlsVar3, a);
                wls wlsVar4 = d.e;
                qje.W(btsVar, wlsVar4, o);
                Integer valueOf = Integer.valueOf(hashCode);
                wls wlsVar5 = d.g;
                qje.W(btsVar, wlsVar5, valueOf);
                tls tlsVar = d.h;
                qje.M(btsVar, tlsVar);
                wls wlsVar6 = d.d;
                qje.W(btsVar, wlsVar6, d);
                int i9 = ((i4 << 9) & 7168) | (i4 & ru.cprocsp.NGate.tools.Constants.RESULT_CHECK_ERROR_KEY_NOT_FOUND);
                String str8 = str4;
                cra1.a(null, str7, str8, slsVar, btsVar, i9);
                uo5 uo5Var = x4c.b;
                z910 d2 = pi6.d(uo5Var, false);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d3 = b.d(btsVar, k3rVar);
                btsVar.i0();
                String str9 = str7;
                if (btsVar.S) {
                    slsVar2 = slsVar3;
                    btsVar.n(slsVar2);
                } else {
                    slsVar2 = slsVar3;
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar3, d2);
                qje.W(btsVar, wlsVar4, o2);
                vfc.v(hashCode2, btsVar, wlsVar5, btsVar, tlsVar);
                qje.W(btsVar, wlsVar6, d3);
                if (wlsVar2 == null) {
                    btsVar.e0(292686695);
                    btsVar.t(false);
                    str6 = str8;
                } else {
                    btsVar.e0(292686696);
                    f530 l = an91.l(cj6.a.a(ljs0.c(c530.a, 1.0f), x4c.B), 8.0f, 8.0f);
                    z910 d4 = pi6.d(uo5Var, false);
                    int hashCode3 = Long.hashCode(btsVar.T);
                    r1b0 o3 = btsVar.o();
                    f530 d5 = b.d(btsVar, l);
                    btsVar.i0();
                    str6 = str8;
                    if (btsVar.S) {
                        btsVar.n(slsVar2);
                    } else {
                        btsVar.r0();
                    }
                    qje.W(btsVar, wlsVar3, d4);
                    qje.W(btsVar, wlsVar4, o3);
                    vfc.v(hashCode3, btsVar, wlsVar5, btsVar, tlsVar);
                    qje.W(btsVar, wlsVar6, d5);
                    qv10.A(0, wlsVar2, btsVar, true, false);
                }
                sic a2 = qic.a(lr20.f, so5Var, btsVar, 6);
                int hashCode4 = Long.hashCode(btsVar.T);
                r1b0 o4 = btsVar.o();
                f530 d6 = b.d(btsVar, k3rVar);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar2);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar3, a2);
                qje.W(btsVar, wlsVar4, o4);
                vfc.v(hashCode4, btsVar, wlsVar5, btsVar, tlsVar);
                qje.W(btsVar, wlsVar6, d6);
                zlsVar2 = zlsVar;
                zlsVar2.invoke(uic.a, btsVar, 54);
                btsVar.t(true);
                btsVar.t(true);
                btsVar.t(true);
                str5 = str6;
                str3 = str9;
            }
            wls wlsVar7 = wlsVar2;
            v = btsVar.v();
            if (v == null) {
                v.d = new xg0(slsVar, str3, str5, wlsVar7, zlsVar2, i, i2);
                return;
            }
            return;
        }
        wlsVar2 = wlsVar;
        if (btsVar.V(i4 & 1, (i4 & 9363) == 9362)) {
        }
        wls wlsVar72 = wlsVar2;
        v = btsVar.v();
        if (v == null) {
        }
    }

    public static final void j(tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-461464667);
        int i2 = 2;
        int i3 = (btsVar.e(tlsVar) ? 4 : 2) | i;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            boolean z = (i3 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new o0(20, tlsVar);
                btsVar.o0(Q);
            }
            n2d.a.getClass();
            i((sls) Q, null, null, null, n2d.c, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 14);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new sg0(i, i2, tlsVar);
        }
    }
}
