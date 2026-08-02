package com.yandex.go.design.compose.ratingbar;

import android.content.res.Resources;
import android.graphics.PointF;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.airbnb.lottie.compose.LottieCompositionResultImpl;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import defpackage.aii0;
import defpackage.an91;
import defpackage.awk0;
import defpackage.b8i0;
import defpackage.bts;
import defpackage.c36;
import defpackage.c530;
import defpackage.c8i0;
import defpackage.cbg0;
import defpackage.cj6;
import defpackage.cma1;
import defpackage.cuz;
import defpackage.d8i0;
import defpackage.did;
import defpackage.doj;
import defpackage.dzg0;
import defpackage.f530;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.g8i0;
import defpackage.gza1;
import defpackage.i8i0;
import defpackage.id00;
import defpackage.j73;
import defpackage.k8i0;
import defpackage.khl0;
import defpackage.l8i0;
import defpackage.lhl0;
import defpackage.ljs0;
import defpackage.lr20;
import defpackage.m3u0;
import defpackage.m8i0;
import defpackage.mfe0;
import defpackage.mhe;
import defpackage.n;
import defpackage.nm50;
import defpackage.nsz;
import defpackage.o430;
import defpackage.o4b1;
import defpackage.ohd;
import defpackage.ovi0;
import defpackage.oz40;
import defpackage.pa90;
import defpackage.pi6;
import defpackage.q791;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.rad;
import defpackage.rwh0;
import defpackage.rzo;
import defpackage.six;
import defpackage.sls;
import defpackage.tfx;
import defpackage.tje;
import defpackage.tls;
import defpackage.tse0;
import defpackage.ttz;
import defpackage.uo5;
import defpackage.v0b1;
import defpackage.wls;
import defpackage.wp2;
import defpackage.wya1;
import defpackage.x4c;
import defpackage.x7i0;
import defpackage.xg0;
import defpackage.y6i0;
import defpackage.ymg0;
import defpackage.yrz;
import defpackage.yx40;
import defpackage.z910;
import defpackage.zpn;
import defpackage.zsz;
import java.util.Arrays;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class a {
    public static final void a(f530 f530Var, int i, int i2, m8i0 m8i0Var, tls tlsVar, fid fidVar, int i3) {
        int i4;
        int i5;
        int i6;
        Object ratingBarKt$RatingBar$1$1;
        yx40 yx40Var;
        oz40 oz40Var;
        o430 o430Var;
        int i7;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-490666773);
        if ((i3 & 6) == 0) {
            i4 = (btsVar.k(f530Var) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= btsVar.c(i) ? 32 : 16;
        }
        int i8 = i4 | 384;
        m8i0 m8i0Var2 = m8i0Var;
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i8 |= btsVar.k(m8i0Var2) ? 2048 : 1024;
        }
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i8 |= btsVar.e(tlsVar) ? 16384 : 8192;
        }
        int i9 = i8;
        if (btsVar.V(i9 & 1, (i9 & 9363) != 9362)) {
            btsVar.a0();
            if ((i3 & 1) == 0 || btsVar.C()) {
                i6 = 5;
            } else {
                btsVar.Y();
                i6 = i2;
            }
            btsVar.u();
            int i10 = i6 < 1 ? 1 : i6;
            int d = y6i0.d(i, 0, i10 - 1);
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (Q == o430Var2) {
                Q = f.g(0);
                btsVar.o0(Q);
            }
            yx40 yx40Var2 = (yx40) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var2) {
                Q2 = f.j(Boolean.FALSE);
                btsVar.o0(Q2);
            }
            oz40 oz40Var2 = (oz40) Q2;
            Integer valueOf = Integer.valueOf(d);
            boolean c = ((i9 & 112) == 32) | btsVar.c(d);
            Object Q3 = btsVar.Q();
            if (c || Q3 == o430Var2) {
                yx40Var = yx40Var2;
                oz40Var = oz40Var2;
                o430Var = o430Var2;
                i7 = i10;
                ratingBarKt$RatingBar$1$1 = new RatingBarKt$RatingBar$1$1(i, yx40Var, d, oz40Var, null);
                btsVar.o0(ratingBarKt$RatingBar$1$1);
            } else {
                yx40Var = yx40Var2;
                ratingBarKt$RatingBar$1$1 = Q3;
                oz40Var = oz40Var2;
                i7 = i10;
                o430Var = o430Var2;
            }
            zpn.e(btsVar, (wls) ratingBarKt$RatingBar$1$1, valueOf);
            String[] stringArray = ((Resources) btsVar.m(AndroidCompositionLocals_androidKt.c)).getStringArray(ymg0.rating_view_titles);
            lhl0 a = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, f530Var);
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
            qje.W(btsVar, d.d, d2);
            btsVar.e0(-293071356);
            int i11 = 0;
            while (i11 < i7) {
                String str = (i11 < 0 || i11 >= stringArray.length) ? "" : stringArray[i11];
                boolean c2 = btsVar.c(i11) | ((57344 & i9) == 16384);
                Object Q4 = btsVar.Q();
                if (c2 || Q4 == o430Var) {
                    Q4 = new x7i0(oz40Var, i11, yx40Var, tlsVar);
                    btsVar.o0(Q4);
                }
                int i12 = (i9 & 7168) | 432;
                int i13 = i9;
                yx40 yx40Var3 = yx40Var;
                int i14 = i7;
                oz40 oz40Var3 = oz40Var;
                c(i11, yx40Var3, oz40Var3, m8i0Var2, str, (sls) Q4, btsVar, i12);
                i11++;
                m8i0Var2 = m8i0Var;
                i6 = i6;
                o430Var = o430Var;
                oz40Var = oz40Var3;
                i7 = i14;
                yx40Var = yx40Var3;
                i9 = i13;
            }
            btsVar.t(false);
            btsVar.t(true);
            i5 = i6;
        } else {
            btsVar.Y();
            i5 = i2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nm50(f530Var, i, i5, m8i0Var, tlsVar, i3);
        }
    }

    public static final void b(f530 f530Var, m3u0 m3u0Var, m3u0 m3u0Var2, k8i0 k8i0Var, String str, fid fidVar, int i) {
        int i2;
        m3u0 m3u0Var3;
        m3u0 m3u0Var4;
        String str2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1317317430);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            m3u0Var3 = m3u0Var;
            i2 |= btsVar.k(m3u0Var3) ? 32 : 16;
        } else {
            m3u0Var3 = m3u0Var;
        }
        if ((i & 384) == 0) {
            m3u0Var4 = m3u0Var2;
            i2 |= btsVar.k(m3u0Var4) ? 256 : 128;
        } else {
            m3u0Var4 = m3u0Var2;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar.k(k8i0Var) : btsVar.e(k8i0Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            str2 = str;
            i2 |= btsVar.k(str2) ? 16384 : 8192;
        } else {
            str2 = str;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            wp2 wp2Var = k8i0Var instanceof i8i0 ? ((i8i0) k8i0Var).a : AppColor$Palette.Control;
            int i3 = dzg0.ic_rating_star_rounded_corners;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = id00.a(1.0f);
                btsVar.o0(Q);
            }
            androidx.compose.animation.core.a aVar = (androidx.compose.animation.core.a) Q;
            c36 c36Var = null;
            if (((Boolean) m3u0Var3.getValue()).booleanValue()) {
                btsVar.e0(-1086468128);
                Object value = m3u0Var4.getValue();
                boolean e = btsVar.e(aVar);
                Object Q2 = btsVar.Q();
                if (e || Q2 == o430Var) {
                    Q2 = new RatingBarKt$SelectedStar$1$1(aVar, null);
                    btsVar.o0(Q2);
                }
                zpn.e(btsVar, (wls) Q2, value);
                btsVar.t(false);
            } else {
                btsVar.e0(-1085983784);
                btsVar.t(false);
            }
            btsVar.e0(-1085518226);
            float floatValue = ((Number) aVar.e()).floatValue();
            f530 b = gza1.b(f530Var, floatValue, floatValue);
            int i4 = (i2 >> 6) & 896;
            pa90 a = wya1.a(i3, 0, btsVar);
            if (wp2Var == null) {
                btsVar.e0(-1411607277);
                btsVar.t(false);
            } else {
                btsVar.e0(-1411607276);
                c36Var = tse0.e(tje.n(wp2Var, btsVar), 5, btsVar, false);
            }
            o4b1.b(a, str2, b, null, null, 0.0f, c36Var, btsVar, 8 | ((i4 >> 3) & 112), 56);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mfe0(f530Var, m3u0Var3, m3u0Var4, k8i0Var, str, i);
        }
    }

    public static final void c(int i, m3u0 m3u0Var, m3u0 m3u0Var2, m8i0 m8i0Var, String str, sls slsVar, fid fidVar, int i2) {
        int i3;
        m3u0 m3u0Var3;
        awk0 awk0Var;
        boolean z;
        boolean z2;
        f530 f530Var;
        o430 o430Var;
        uo5 uo5Var = x4c.y;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1348774293);
        if ((i2 & 6) == 0) {
            i3 = (btsVar.c(i) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= btsVar.k(m3u0Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            m3u0Var3 = m3u0Var2;
            i3 |= btsVar.k(m3u0Var3) ? 256 : 128;
        } else {
            m3u0Var3 = m3u0Var2;
        }
        if ((i2 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.k(m8i0Var) ? 2048 : 1024;
        }
        if ((i2 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i3 |= btsVar.k(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= btsVar.e(slsVar) ? 131072 : 65536;
        }
        if (btsVar.V(i3 & 1, (74899 & i3) != 74898)) {
            boolean z3 = ((Number) m3u0Var.getValue()).intValue() - 1 == i;
            boolean z4 = ((Number) m3u0Var.getValue()).intValue() - 1 >= i;
            boolean booleanValue = ((Boolean) m3u0Var3.getValue()).booleanValue();
            float f = m8i0Var.b;
            boolean a = btsVar.a(z3) | btsVar.a(z4) | btsVar.a(booleanValue) | btsVar.k(d8i0.a);
            Object Q = btsVar.Q();
            o430 o430Var2 = did.a;
            if (a || Q == o430Var2) {
                Q = n.f(false, btsVar);
            }
            oz40 oz40Var = (oz40) Q;
            awk0 awk0Var2 = new awk0(0);
            boolean z5 = (i3 & ImageMetadata.JPEG_GPS_COORDINATES) == 131072;
            Object Q2 = btsVar.Q();
            if (z5 || Q2 == o430Var2) {
                awk0Var = awk0Var2;
                z = z4;
                RatingBarKt$Star$clickableModifier$1$1 ratingBarKt$Star$clickableModifier$1$1 = new RatingBarKt$Star$clickableModifier$1$1(0, slsVar, sls.class, "invoke", "invoke()Ljava/lang/Object;", 0);
                btsVar.o0(ratingBarKt$Star$clickableModifier$1$1);
                Q2 = ratingBarKt$Star$clickableModifier$1$1;
            } else {
                z = z4;
                awk0Var = awk0Var2;
            }
            c530 c530Var = c530.a;
            f530 b = q791.b(c530Var, null, null, false, null, awk0Var, (sls) ((tfx) Q2), 12);
            f530 m = an91.m(c530Var, m8i0Var.c, 0.0f, 2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, m);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, d.f, d);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            cj6 cj6Var = cj6.a;
            if (z) {
                btsVar.e0(-1427329217);
                ovi0 a2 = m8i0Var.a.a();
                if (a2 == null) {
                    btsVar.e0(-1427278564);
                    btsVar.t(false);
                    o430Var = o430Var2;
                    f530Var = b;
                } else {
                    btsVar.e0(-1427278563);
                    f530 a3 = cj6Var.a(ljs0.m(c530Var, f), uo5Var);
                    rad.a.getClass();
                    f530Var = b;
                    o430Var = o430Var2;
                    v0b1.a(a2, a3, null, rad.b, null, null, null, mhe.b, 0.0f, 0, btsVar, 12585984, 884);
                    btsVar = btsVar;
                    btsVar.t(false);
                }
                f530 a4 = cj6Var.a(ljs0.m(f530Var, f), uo5Var);
                Object Q3 = btsVar.Q();
                if (Q3 == o430Var) {
                    Q3 = new cbg0(18);
                    btsVar.o0(Q3);
                }
                z2 = false;
                b(fnq0.b(a4, false, (tls) Q3), oz40Var, m3u0Var, m8i0Var.a, str, btsVar, ((i3 << 3) & 896) | (57344 & i3));
                btsVar.t(false);
            } else {
                btsVar.e0(-1426670529);
                f530 a5 = cj6Var.a(ljs0.m(b, f), uo5Var);
                Object Q4 = btsVar.Q();
                if (Q4 == o430Var2) {
                    Q4 = new cbg0(19);
                    btsVar.o0(Q4);
                }
                z2 = false;
                e((i3 >> 6) & 896, btsVar, fnq0.b(a5, false, (tls) Q4), str);
                btsVar.t(false);
            }
            btsVar.e0(-1425928451);
            btsVar.t(z2);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xg0(i, m3u0Var, m3u0Var2, m8i0Var, str, slsVar, i2);
        }
    }

    public static final void d(f530 f530Var, m3u0 m3u0Var, g8i0 g8i0Var, m3u0 m3u0Var2, fid fidVar, int i) {
        int i2;
        m3u0 m3u0Var3;
        m3u0 m3u0Var4;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-372821345);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            m3u0Var3 = m3u0Var;
            i2 |= btsVar.k(m3u0Var3) ? 32 : 16;
        } else {
            m3u0Var3 = m3u0Var;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(g8i0Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            m3u0Var4 = m3u0Var2;
            i2 |= btsVar.k(m3u0Var4) ? 2048 : 1024;
        } else {
            m3u0Var4 = m3u0Var2;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            wp2 wp2Var = g8i0Var.a;
            LottieCompositionResultImpl f = com.airbnb.lottie.compose.a.f(new zsz(rwh0.animation_star), btsVar, 0);
            PointF pointF = cuz.a;
            Integer valueOf = Integer.valueOf(rzo.X(tje.n(wp2Var, btsVar)));
            String[] strArr = {"**"};
            btsVar.f0(-1788530187);
            btsVar.f0(1613443961);
            boolean k = btsVar.k(strArr);
            Object Q = btsVar.Q();
            Object obj = did.a;
            if (k || Q == obj) {
                Q = new six((String[]) Arrays.copyOf(strArr, 1));
                btsVar.o0(Q);
            }
            six sixVar = (six) Q;
            btsVar.t(false);
            btsVar.f0(1613444012);
            boolean k2 = btsVar.k(sixVar) | btsVar.k(valueOf);
            Object Q2 = btsVar.Q();
            if (k2 || Q2 == obj) {
                Q2 = new com.airbnb.lottie.compose.d(sixVar, valueOf);
                btsVar.o0(Q2);
            }
            btsVar.t(false);
            btsVar.t(false);
            com.airbnb.lottie.compose.d[] dVarArr = {(com.airbnb.lottie.compose.d) Q2};
            btsVar.f0(-395574495);
            int hashCode = Arrays.hashCode(dVarArr);
            btsVar.f0(34468001);
            boolean c = btsVar.c(hashCode);
            Object Q3 = btsVar.Q();
            if (c || Q3 == obj) {
                Q3 = new ttz(j73.d0(dVarArr));
                btsVar.o0(Q3);
            }
            ttz ttzVar = (ttz) Q3;
            btsVar.t(false);
            btsVar.t(false);
            if (((Boolean) m3u0Var4.getValue()).booleanValue()) {
                btsVar.e0(65351278);
                btsVar.c0(-1799007030, m3u0Var3.getValue());
                yrz c2 = com.airbnb.lottie.compose.a.c((nsz) f.getValue(), false, false, false, 0.0f, 0, btsVar, 1022);
                nsz nszVar = (nsz) f.getValue();
                boolean k3 = btsVar.k(c2);
                Object Q4 = btsVar.Q();
                if (k3 || Q4 == obj) {
                    z = false;
                    Q4 = new b8i0(c2, 0);
                    btsVar.o0(Q4);
                } else {
                    z = false;
                }
                int i3 = ((i2 << 6) & 896) | 1073741824;
                boolean z2 = z;
                com.airbnb.lottie.compose.a.a(nszVar, (sls) Q4, f530Var, false, false, false, false, null, false, ttzVar, null, null, false, false, null, null, false, btsVar, i3, 0, 130552);
                btsVar = btsVar;
                btsVar.t(z2);
                btsVar.t(z2);
            } else {
                btsVar.e0(65617475);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c8i0(f530Var, m3u0Var3, g8i0Var, m3u0Var4, i);
        }
    }

    public static final void e(int i, fid fidVar, f530 f530Var, String str) {
        int i2;
        f530 f530Var2;
        String str2;
        c36 e;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1256182002);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            int i3 = i & 64;
            l8i0 l8i0Var = l8i0.a;
            i2 |= i3 == 0 ? btsVar.k(l8i0Var) : btsVar.e(l8i0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(str) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            AppColor$Palette appColor$Palette = AppColor$Palette.BgMinor;
            int i4 = dzg0.ic_rating_star_rounded_corners;
            btsVar.e0(-866751217);
            int i5 = (i2 & 896) | ((i2 << 3) & 112);
            pa90 a = wya1.a(i4, 0, btsVar);
            if (appColor$Palette == null) {
                btsVar.e0(-1411607277);
                btsVar.t(false);
                e = null;
            } else {
                btsVar.e0(-1411607276);
                e = tse0.e(tje.n(appColor$Palette, btsVar), 5, btsVar, false);
            }
            f530Var2 = f530Var;
            str2 = str;
            o4b1.b(a, str2, f530Var2, null, null, 0.0f, e, btsVar, ((i5 >> 3) & 112) | 8 | ((i5 << 3) & 896), 56);
            btsVar.t(false);
        } else {
            f530Var2 = f530Var;
            str2 = str;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new doj(f530Var2, str2, i, 2);
        }
    }
}
