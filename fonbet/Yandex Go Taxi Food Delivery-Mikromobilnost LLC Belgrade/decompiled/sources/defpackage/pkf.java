package defpackage;

import android.graphics.drawable.Drawable;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import androidx.compose.ui.unit.LayoutDirection;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import kotlin.Triple;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes12.dex */
public abstract class pkf {
    /* JADX WARN: Removed duplicated region for block: B:13:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x005b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(f530 f530Var, String str, boolean z, ehr0 ehr0Var, fid fidVar, int i, int i2) {
        String str2;
        int i3;
        boolean z2;
        ehr0 ehr0Var2;
        int i4;
        int i5;
        boolean z3;
        ehr0 ehr0Var3;
        aii0 v;
        boolean z4;
        ehr0 ehr0Var4;
        int i6;
        f530 f530Var2 = f530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-725469016);
        dmw0 dmw0Var = btsVar.a;
        int i7 = (btsVar.k(f530Var2) ? 4 : 2) | i;
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 = i7 | 48;
            str2 = str;
        } else {
            str2 = str;
            i3 = i7 | (btsVar.k(str2) ? 32 : 16);
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            z2 = z;
            i3 |= btsVar.a(z2) ? 256 : 128;
            if ((i2 & 8) != 0) {
                ehr0Var2 = ehr0Var;
                if (btsVar.k(ehr0Var2)) {
                    i4 = 2048;
                    i5 = i3 | i4;
                    if (btsVar.V(i5 & 1, (i5 & 1171) != 1170)) {
                        btsVar.a0();
                        if ((i & 1) == 0 || btsVar.C()) {
                            if (i8 != 0) {
                                str2 = null;
                            }
                            if (i9 != 0) {
                                z2 = false;
                            }
                            if ((i2 & 8) != 0) {
                                ehr0Var2 = cyk0.c(100.0f);
                            }
                        } else {
                            btsVar.Y();
                        }
                        String str3 = str2;
                        boolean z5 = z2;
                        btsVar.u();
                        LayoutDirection layoutDirection = (LayoutDirection) btsVar.m(j.n);
                        long c = tje.c(0.1f, iq2.d);
                        if (z5) {
                            btsVar.e0(-171677834);
                            f530 e = ljs0.e(f530Var2, 64.0f);
                            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
                            z4 = z5;
                            int hashCode = Long.hashCode(btsVar.T);
                            r1b0 o = btsVar.o();
                            f530 d = b.d(btsVar, e);
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
                            long j = c;
                            wls wlsVar4 = d.d;
                            qje.W(btsVar, wlsVar4, d);
                            if (str3 != null) {
                                j = zp2.a;
                            }
                            long j2 = j;
                            c530 c530Var = c530.a;
                            f530 c2 = str3 == null ? ljs0.c(c530Var, 1.0f) : c530Var;
                            boolean c3 = btsVar.c(layoutDirection.ordinal());
                            Object Q = btsVar.Q();
                            if (c3 || Q == did.a) {
                                i6 = 0;
                                Q = new eo1(i6, layoutDirection);
                                btsVar.o0(Q);
                            } else {
                                i6 = 0;
                            }
                            f530 a2 = androidx.compose.ui.graphics.d.a(c530Var, (tls) Q);
                            ehr0Var4 = ehr0Var2;
                            o4b1.b(mt71.m(j1h0.ai_widget_message_tail, i6, btsVar), null, a2, null, null, 0.0f, new c36(tje.n(new up2(j2), btsVar), 5), btsVar, 56, 56);
                            f530 c4 = bzk0.c(ljs0.e(c2, 56.0f), new up2(j2), ehr0Var4);
                            z910 d2 = pi6.d(x4c.y, false);
                            int hashCode2 = Long.hashCode(btsVar.T);
                            r1b0 o2 = btsVar.o();
                            f530 d3 = b.d(btsVar, c4);
                            btsVar.i0();
                            if (btsVar.S) {
                                btsVar.n(slsVar);
                            } else {
                                btsVar.r0();
                            }
                            qje.W(btsVar, wlsVar, d2);
                            qje.W(btsVar, wlsVar2, o2);
                            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
                            qje.W(btsVar, wlsVar4, d3);
                            if (str3 == null) {
                                btsVar.e0(1304993284);
                                btsVar.t(false);
                                str2 = str3;
                            } else {
                                btsVar.e0(1304993285);
                                str2 = str3;
                                jeb1.f(str2, an91.m(c530Var, 16.0f, 0.0f, 2), new up2(iq2.g), 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, 48, 0, 16376);
                                btsVar = btsVar;
                                btsVar.t(false);
                            }
                            tse0.t(btsVar, true, true, false);
                            f530Var2 = f530Var;
                        } else {
                            str2 = str3;
                            z4 = z5;
                            ehr0Var4 = ehr0Var2;
                            btsVar.e0(-170710014);
                            f530Var2 = f530Var;
                            pi6.a(bzk0.c(ljs0.c(ljs0.e(f530Var2, 56.0f), 1.0f), new up2(c), ehr0Var4), btsVar, 0);
                            btsVar.t(false);
                        }
                        z3 = z4;
                        ehr0Var3 = ehr0Var4;
                    } else {
                        btsVar.Y();
                        z3 = z2;
                        ehr0Var3 = ehr0Var2;
                    }
                    String str4 = str2;
                    v = btsVar.v();
                    if (v != null) {
                        v.d = new fo1(f530Var2, str4, z3, ehr0Var3, i, i2, 0);
                        return;
                    }
                    return;
                }
            } else {
                ehr0Var2 = ehr0Var;
            }
            i4 = 1024;
            i5 = i3 | i4;
            if (btsVar.V(i5 & 1, (i5 & 1171) != 1170)) {
            }
            String str42 = str2;
            v = btsVar.v();
            if (v != null) {
            }
        }
        z2 = z;
        if ((i2 & 8) != 0) {
        }
        i4 = 1024;
        i5 = i3 | i4;
        if (btsVar.V(i5 & 1, (i5 & 1171) != 1170)) {
        }
        String str422 = str2;
        v = btsVar.v();
        if (v != null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v10, types: [f530] */
    public static final void b(bo1 bo1Var, fid fidVar, int i) {
        int i2;
        bo1 bo1Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1828773272);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? btsVar.k(bo1Var) : btsVar.e(bo1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(c530Var, 24.0f, 0.0f, 2);
            jeb1.f(bo1Var.d, m, new up2(iq2.g), 0L, 0L, null, null, 0L, 0, false, 0, 0, null, ety0.a(xya1.b(btsVar).g, 0L, uh6.E(36), lzr.x, null, null, uh6.w(-0.001d), null, null, null, 0, uh6.E(40), null, null, 16646009), btsVar, 48, 0, 16376);
            btsVar = btsVar;
            f530 o = an91.o(n.e(c530Var, 8.0f, btsVar, c530Var, 1.0f), 24.0f, 0.0f, 0.0f, 0.0f, 14);
            i43 i43Var = new i43(4.0f, true, new quz(11));
            to5 to5Var = x4c.F;
            lhl0 a = khl0.a(i43Var, to5Var, btsVar, 54);
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
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            String str = bo1Var.e;
            nhl0 nhl0Var = nhl0.a;
            a(str == null ? nhl0Var.a(c530Var, 0.7f, true) : c530Var, str, true, cyk0.e(0.0f, 100.0f, 100.0f, 28.0f, 1), btsVar, 384, 0);
            a(nhl0Var.a(c530Var, 1.0f, true), null, false, cyk0.e(100.0f, 0.0f, 0.0f, 100.0f, 6), btsVar, 0, 6);
            n.y(btsVar, true, c530Var, 4.0f, btsVar);
            f530 o3 = an91.o(ljs0.c(c530Var, 1.0f), 24.0f, 0.0f, 0.0f, 0.0f, 14);
            lhl0 a2 = khl0.a(new i43(4.0f, true, new quz(11)), to5Var, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d2 = b.d(btsVar, o3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            bo1Var2 = bo1Var;
            a(nhl0Var.a(c530Var, 1.0f, true), null, false, null, btsVar, 0, 14);
            a(nhl0Var.a(c530Var, 0.4f, true), null, false, cyk0.e(100.0f, 0.0f, 0.0f, 100.0f, 6), btsVar, 0, 6);
            btsVar.t(true);
        } else {
            bo1Var2 = bo1Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(bo1Var2, i, 4);
        }
    }

    public static final void c(co1 co1Var, fid fidVar, int i) {
        int i2;
        Triple triple;
        c530 c530Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1867437753);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = i | ((i & 8) == 0 ? btsVar.k(co1Var) : btsVar.e(co1Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 k = an91.k(ljs0.c, 24.0f);
            sic a = qic.a(lr20.g, x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(c530Var2, 1.0f);
            String str = co1Var.d;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            jeb1.f(str, c, appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).g.a, btsVar, 432, 0, 16248);
            int i3 = go1.a[co1Var.g.ordinal()];
            if (i3 == 1) {
                c530Var = c530Var2;
                triple = new Triple(Integer.valueOf(j1h0.ai_widget_onboarding_arrow_right), an91.o(c530Var2, 0.0f, 0.0f, 32.0f, 0.0f, 11), x4c.z);
            } else if (i3 != 2) {
                w511.b();
                return;
            } else {
                triple = new Triple(Integer.valueOf(j1h0.ai_widget_onboarding_arrow_left), an91.o(c530Var2, 32.0f, 0.0f, 0.0f, 0.0f, 14), x4c.x);
                c530Var = c530Var2;
            }
            int intValue = ((Number) triple.getFirst()).intValue();
            f530 f530Var = (f530) triple.getSecond();
            jt1 jt1Var = (jt1) triple.getThird();
            f530 c2 = ljs0.c(c530Var, 1.0f);
            if (1.3f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            f530 k2 = c2.k(new x2y(1.3f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.3f, true));
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, k2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            o4b1.b(mt71.m(intValue, 0, btsVar), null, cj6.a.a(f530Var, jt1Var), null, null, 0.0f, new c36(tje.n(AppColor$Palette.Line, btsVar), 5), btsVar, 56, 56);
            btsVar.t(true);
            f530 c3 = ljs0.c(c530Var, 1.0f);
            if (2.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            jeb1.f(co1Var.e, c3.k(new x2y(2.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 2.0f, true)), appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).f.c, btsVar, 384, 0, 16248);
            jeb1.f(co1Var.f, ljs0.c(c530Var, 1.0f), AppColor$Palette.TextMinor, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).h.a, btsVar, 432, 0, 16248);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(co1Var, i, 5);
        }
    }

    public static final void d(f530 f530Var, do1 do1Var, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1127809113);
        dmw0 dmw0Var = btsVar.a;
        int i3 = i | 6;
        if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? btsVar.k(do1Var) : btsVar.e(do1Var) ? 32 : 16;
        }
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            byk0 c = cyk0.c(32.0f);
            byk0 c2 = cyk0.c(24.0f);
            f530Var2 = c530.a;
            f530 k = an91.k(bzk0.c(hbb1.b(on70.a(f530Var2, 0.8f), dbb1.b(btsVar), c, false, 12), AppColor$Palette.BgFloating, c), 8.0f);
            z910 d = pi6.d(x4c.b, false);
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
            i2 = 14;
            f530 c3 = bzk0.c(ljs0.c, do1Var.a(), c2);
            xa6 a = eab1.a(0.5f, tje.n(AppColor$Palette.Line, btsVar));
            f530 b = aab1.b(c3, a.a, a.b, c2);
            sic a2 = qic.a(lr20.e, x4c.G, btsVar, 6);
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
            if (do1Var instanceof co1) {
                btsVar.e0(1260656674);
                c((co1) do1Var, btsVar, (i3 >> 3) & 14);
                btsVar.t(false);
            } else {
                if (!(do1Var instanceof bo1)) {
                    throw unr0.y(1260655541, btsVar, false);
                }
                btsVar.e0(1260658943);
                b((bo1) do1Var, btsVar, ((i3 >> 3) & 14) | 8);
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(true);
        } else {
            i2 = 14;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(f530Var2, do1Var, i, i2);
        }
    }

    public static iw8 e(e5g e5gVar, boolean z) {
        e5gVar.getClass();
        Boolean valueOf = Boolean.valueOf(z);
        iw8 iw8Var = new iw8();
        iw8Var.f = e5gVar;
        int i = 6;
        icg icgVar = new icg(e5gVar, i);
        iw8Var.a = icgVar;
        icg icgVar2 = new icg(e5gVar, 18);
        int i2 = 2;
        icg icgVar3 = new icg(e5gVar, i2);
        icg icgVar4 = new icg(e5gVar, 7);
        int i3 = 9;
        int i4 = 10;
        fq21 fq21Var = new fq21(icgVar3, new im21(icgVar4, i3), new x(icgVar4, i3), new x(icgVar4, i4), 0);
        iw8Var.b = fq21Var;
        iw8Var.c = n3w.a(new er21(new s421(icgVar, icgVar2, fq21Var, new icg(e5gVar, 11), 2)));
        iw8Var.d = new icg(e5gVar, 4);
        int i5 = 3;
        iw8Var.e = new icg(e5gVar, i5);
        iw8Var.g = new icg(e5gVar, 21);
        xvf0 b = i5m.b(new tw11(new icg(e5gVar, 5), i));
        icg icgVar5 = new icg(e5gVar, 8);
        iw8Var.h = icgVar5;
        int i6 = 14;
        iw8Var.i = new mg11(b, icgVar5, i6);
        iw8Var.j = new icg(e5gVar, 22);
        iw8Var.k = new icg(e5gVar, 23);
        iw8Var.l = new qd21((icg) iw8Var.d, i5m.b(new jpn0((icg) iw8Var.e, (icg) iw8Var.g, (mg11) iw8Var.i, (icg) iw8Var.d, (icg) iw8Var.j, (icg) iw8Var.k, n3w.a(valueOf), new icg(e5gVar, 19), 23, false)), new icg(e5gVar, 13), new icg(e5gVar, i4), (fq21) iw8Var.b, 2);
        iw8Var.m = new icg(e5gVar, 16);
        iw8Var.n = new icg(e5gVar, 0);
        iw8Var.o = new icg(e5gVar, i3);
        xvf0 b2 = i5m.b(new z1n0((icg) iw8Var.a, 26));
        icg icgVar6 = new icg(e5gVar, 17);
        icg icgVar7 = new icg(e5gVar, i6);
        iw8Var.p = n3w.a(new jr21(new fn6((qd21) iw8Var.l, (icg) iw8Var.g, (icg) iw8Var.m, (icg) iw8Var.n, (icg) iw8Var.o, (icg) iw8Var.j, b2, (fq21) iw8Var.b, icgVar6, icgVar7, new icg(e5gVar, 15), new sk21(icgVar7, (icg) iw8Var.h, (icg) iw8Var.d, i2))));
        iw8Var.q = n3w.a(new vt7(new cxq0((icg) iw8Var.a, new icg(e5gVar, 1), new icg(e5gVar, 12), new of7(new icg(e5gVar, 20), i5), 6)));
        return iw8Var;
    }

    public static void f(String str) {
        xby.l(jst.e, "ORGANIZATIONS_DISCOVERY_ERROR.UNKNOWN_DEEPLINK_PARAM", null, null, oyr.p("Unknown value: ", str, " for presentation_mode param in deeplink"), 6);
    }

    public static final UiStateDrawableWrapper g(Drawable drawable, String str, ThemeType themeType) {
        return new UiStateDrawableWrapper(themeType == null ? new vt11(str) : new wt11(themeType, str), drawable);
    }
}
