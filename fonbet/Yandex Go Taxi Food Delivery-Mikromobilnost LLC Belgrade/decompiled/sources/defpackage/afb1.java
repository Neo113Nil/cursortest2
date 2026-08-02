package defpackage;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.n;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public abstract class afb1 {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r11v16 */
    public static final void a(x58 x58Var, final tls tlsVar, fid fidVar, int i) {
        final tls tlsVar2;
        bts btsVar;
        boolean z;
        float f;
        final ?? r11;
        float f2;
        Object obj;
        boolean z2;
        Object obj2;
        final x58 x58Var2 = x58Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1736759946);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | (btsVar2.e(x58Var2) ? 4 : 2) | (btsVar2.e(tlsVar) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            oip0 o = pw91.o(btsVar2);
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            Object obj3 = Q;
            if (Q == o430Var) {
                qxi d = f.d(new is6(o, 1));
                btsVar2.o0(d);
                obj3 = d;
            }
            m3u0 m3u0Var = (m3u0) obj3;
            c530 c530Var = c530.a;
            f530 o2 = an91.o(c530Var, 0.0f, 12.0f, 0.0f, 0.0f, 13);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o3 = btsVar2.o();
            f530 d2 = b.d(btsVar2, o2);
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
            qje.W(btsVar2, wlsVar2, o3);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar2, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d2);
            f530 u = pw91.u(an91.o(ljs0.g(c530Var, 0.0f, 400.0f, 1), 16.0f, 0.0f, 16.0f, 0.0f, 10), o, 14);
            sic a2 = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o4 = btsVar2.o();
            f530 d3 = b.d(btsVar2, u);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, a2);
            qje.W(btsVar2, wlsVar2, o4);
            vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar3);
            qje.W(btsVar2, wlsVar4, d3);
            String str = x58Var2.a;
            String str2 = x58Var2.e;
            String str3 = x58Var2.d;
            if (str == null) {
                btsVar2.e0(-1808824460);
                str = ohb1.e(btsVar2, kyh0.navigation_parking_info_title);
                z = false;
            } else {
                z = false;
                btsVar2.e0(-1808824987);
            }
            btsVar2.t(z);
            jeb1.f(str, c530Var, AppColor$Palette.Text, 0L, 0L, null, null, uh6.K(30.0f, 4294967296L), 0, false, 0, 0, null, xya1.e(btsVar2).e.d, btsVar2, 432, 0, 16120);
            f530 o5 = an91.o(c530Var, 0.0f, 6.0f, 0.0f, 0.0f, 13);
            to5 to5Var = x4c.E;
            lhl0 a3 = khl0.a(lr20.a, to5Var, btsVar2, 48);
            int hashCode3 = Long.hashCode(btsVar2.T);
            r1b0 o6 = btsVar2.o();
            f530 d4 = b.d(btsVar2, o5);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, a3);
            qje.W(btsVar2, wlsVar2, o6);
            vfc.v(hashCode3, btsVar2, wlsVar3, btsVar2, tlsVar3);
            qje.W(btsVar2, wlsVar4, d4);
            f530 m = ljs0.m(c530Var, 20.0f);
            au2 a4 = zeb1.a();
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            sya1.a(a4, m, null, appColor$Palette, btsVar2, 3120, 4);
            x58Var2 = x58Var;
            jeb1.f(x58Var.b, an91.o(c530Var, 2.0f, 0.0f, 0.0f, 0.0f, 14).k(new pa31(to5Var)), appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.b, btsVar2, 384, 0, 16248);
            bts btsVar3 = btsVar2;
            btsVar3.t(true);
            c(6, btsVar3, an91.o(c530Var, 0.0f, 21.0f, 0.0f, 0.0f, 13), ohb1.e(btsVar3, kyh0.navigator_parking_info_address), x58Var2.c.D1());
            if (str3 != null) {
                btsVar3.e0(-237952040);
                f = 16.0f;
                c(6, btsVar3, an91.o(c530Var, 0.0f, 16.0f, 0.0f, 0.0f, 13), ohb1.e(btsVar3, kyh0.common_time), str3);
                r11 = 0;
                btsVar3.t(false);
            } else {
                f = 16.0f;
                r11 = 0;
                btsVar3.e0(-237759840);
                btsVar3.t(false);
            }
            if (str2 != null) {
                btsVar3.e0(-237706334);
                f2 = f;
                c(6, btsVar3, an91.o(c530Var, 0.0f, f, 0.0f, 0.0f, 13), ohb1.e(btsVar3, kyh0.navigator_parking_info_payment), str2);
                btsVar3.t(r11);
            } else {
                f2 = f;
                btsVar3.e0(-237492992);
                btsVar3.t(r11);
            }
            btsVar3.t(true);
            f530 c = bzk0.c(hbb1.c(c530Var, dbb1.c(btsVar3), false, 24.0f, m3u0Var, 2), AppColor$Palette.Background, ((nx2) btsVar3.m(uy2.c)).a);
            WeakHashMap weakHashMap = a.w;
            f530 n = an91.n(c, f2, 20.0f, f2, w8a1.f(vuz.o(btsVar3).e, btsVar3).a() + 8.0f);
            boolean b = btsVar3.b(4.0f) | btsVar3.c(2) | btsVar3.a(r11);
            Object Q2 = btsVar3.Q();
            Object obj4 = Q2;
            if (b || Q2 == o430Var) {
                jg0 jg0Var = new jg0(3);
                btsVar3.o0(jg0Var);
                obj4 = jg0Var;
            }
            z910 z910Var = (z910) obj4;
            int hashCode4 = Long.hashCode(btsVar3.T);
            r1b0 o7 = btsVar3.o();
            f530 d5 = b.d(btsVar3, n);
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, wlsVar, z910Var);
            qje.W(btsVar3, wlsVar2, o7);
            vfc.v(hashCode4, btsVar3, wlsVar3, btsVar3, tlsVar3);
            qje.W(btsVar3, wlsVar4, d5);
            f530 c2 = ljs0.c(c530Var, 1.0f);
            int i3 = i2 & 112;
            int i4 = i2 & 14;
            boolean z3 = ((i4 == 4 || btsVar3.e(x58Var2)) ? true : r11) | (i3 == 32 ? true : r11);
            Object Q3 = btsVar3.Q();
            if (z3 || Q3 == o430Var) {
                sls slsVar2 = new sls() { // from class: w58
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = r11;
                        zy11 zy11Var = zy11.a;
                        x58 x58Var3 = x58Var2;
                        tls tlsVar4 = tlsVar;
                        switch (i5) {
                            case 0:
                                tlsVar4.invoke(new g68(x58Var3.c));
                                break;
                            default:
                                tlsVar4.invoke(new h68(x58Var3.c));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar3.o0(slsVar2);
                obj = slsVar2;
            } else {
                obj = Q3;
            }
            d4d.a.getClass();
            tlsVar2 = tlsVar;
            ohb1.b(c2, false, null, (sls) obj, d4d.b, btsVar3, 24582, 6);
            f530 c3 = ljs0.c(c530Var, 1.0f);
            boolean z4 = (i3 == 32) | (i4 == 4 || btsVar3.e(x58Var2));
            Object Q4 = btsVar3.Q();
            if (z4 || Q4 == o430Var) {
                z2 = true;
                final boolean z5 = true ? 1 : 0;
                sls slsVar3 = new sls() { // from class: w58
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i5 = z5;
                        zy11 zy11Var = zy11.a;
                        x58 x58Var3 = x58Var2;
                        tls tlsVar4 = tlsVar2;
                        switch (i5) {
                            case 0:
                                tlsVar4.invoke(new g68(x58Var3.c));
                                break;
                            default:
                                tlsVar4.invoke(new h68(x58Var3.c));
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar3.o0(slsVar3);
                obj2 = slsVar3;
            } else {
                z2 = true;
                obj2 = Q4;
            }
            ulb1.a(c3, false, null, (sls) obj2, d4d.c, btsVar3, 24582, 6);
            btsVar3.t(z2);
            btsVar3.t(z2);
            btsVar = btsVar3;
        } else {
            tlsVar2 = tlsVar;
            btsVar2.Y();
            btsVar = btsVar2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ky7(x58Var2, tlsVar2, i, 5);
        }
    }

    public static final void b(String str, au2 au2Var, wp2 wp2Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1656395466);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(au2Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            sic a = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530.a);
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
            sya1.a(au2Var, null, null, wp2Var, btsVar, ((i2 >> 3) & 14) | 3456, 2);
            jeb1.f(str, null, wp2Var, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar).h.c, btsVar, i2 & 910, 0, 16378);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ls6(str, au2Var, wp2Var, i, 1);
        }
    }

    public static final void c(int i, fid fidVar, f530 f530Var, String str, String str2) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1856064864);
        int i2 = i | (btsVar.k(str) ? 32 : 16) | (btsVar.k(str2) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var);
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
            jeb1.f(str, null, AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, ((i2 >> 3) & 14) | 384, 0, 16378);
            jeb1.f(str2, null, AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, ((i2 >> 6) & 14) | 384, 0, 16378);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ks6(f530Var, str, str2, i, 1);
        }
    }

    public static final qor d(androidx.compose.foundation.lazy.b bVar, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.e0(580205902);
        if (!((Boolean) btsVar.m(n.a)).booleanValue()) {
            btsVar.e0(1965838676);
            btsVar.t(false);
            qor g = jeb1.g(androidx.compose.animation.core.b.b(bVar.b() ? 1.0f : 0.0f, sb2.K(200, 0, null, 6), "Scroll animation effect", null, btsVar, 3120, 20));
            btsVar.t(false);
            return g;
        }
        btsVar.e0(1965718551);
        Object Q = btsVar.Q();
        if (Q == did.a) {
            Q = jeb1.g(f.d(new vs9(bVar, 10)));
            btsVar.o0(Q);
        }
        qor qorVar = (qor) Q;
        btsVar.t(false);
        btsVar.t(false);
        return qorVar;
    }

    public static final qnt0 e(pnt0 pnt0Var) {
        return new qnt0(0, pnt0Var);
    }
}
