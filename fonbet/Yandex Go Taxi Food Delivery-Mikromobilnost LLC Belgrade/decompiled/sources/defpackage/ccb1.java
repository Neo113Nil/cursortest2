package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import com.yandex.go.sharing_personal_goals.SharingPersonalGoalsProgressStyle;
import java.util.List;
import java.util.WeakHashMap;

/* loaded from: classes11.dex */
public abstract class ccb1 {
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static final void a(psr0 psr0Var, tls tlsVar, f530 f530Var, fid fidVar, int i, int i2) {
        f530 f530Var2;
        int i3;
        f530 f530Var3;
        f530 f530Var4;
        c530 c530Var;
        float f;
        ButtonStyle buttonStyle;
        msr0 msr0Var;
        String str;
        bts btsVar = (bts) fidVar;
        btsVar.g0(619382595);
        int i4 = 2;
        int i5 = 32;
        int i6 = i | (btsVar.k(psr0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 = i6 | 384;
            f530Var2 = f530Var;
        } else {
            f530Var2 = f530Var;
            i3 = i6 | (btsVar.k(f530Var2) ? 256 : 128);
        }
        ?? r7 = 1;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var2 = c530.a;
            f530 f530Var5 = i7 != 0 ? c530Var2 : f530Var2;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, f530Var5);
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
            List a2 = psr0Var != null ? psr0Var.a() : null;
            float f2 = 1.0f;
            float f3 = 8.0f;
            float f4 = 0.0f;
            if (a2 == null) {
                btsVar.e0(1091263501);
                btsVar.t(false);
                f530Var4 = f530Var5;
                c530Var = c530Var2;
                f = 8.0f;
            } else {
                btsVar.e0(1091263502);
                int i8 = 0;
                for (Object obj : a2) {
                    int i9 = i8 + 1;
                    if (i8 < 0) {
                        scc.m();
                        throw null;
                    }
                    lrr0 lrr0Var = (lrr0) obj;
                    f530 m = an91.m(ljs0.c(c530Var2, f2), f3, f4, i4);
                    int i10 = csr0.a[lrr0Var.b.ordinal()];
                    if (i10 == r7) {
                        buttonStyle = ButtonStyle.Main;
                    } else {
                        if (i10 != i4) {
                            w511.b();
                            return;
                        }
                        buttonStyle = ButtonStyle.Minor;
                    }
                    boolean k = ((i3 & 112) == i5 ? r7 : false) | btsVar.k(lrr0Var);
                    Object Q = btsVar.Q();
                    if (k || Q == did.a) {
                        Q = new ppr0(r7, tlsVar, lrr0Var);
                        btsVar.o0(Q);
                    }
                    c530 c530Var3 = c530Var2;
                    d17.c(m, false, null, buttonStyle, null, (sls) Q, wwg.S(-1120968784, r7, new w7o0(13, lrr0Var), btsVar), btsVar, 1572870, 22);
                    oeb1.c(btsVar, ljs0.e(c530Var3, 8.0f));
                    c530Var2 = c530Var3;
                    f3 = 8.0f;
                    i8 = i9;
                    f530Var5 = f530Var5;
                    f2 = 1.0f;
                    r7 = 1;
                    f4 = 0.0f;
                    i4 = 2;
                    i5 = 32;
                }
                f530Var4 = f530Var5;
                c530Var = c530Var2;
                f = f3;
                btsVar.t(false);
            }
            if (!(psr0Var instanceof msr0) || (str = (msr0Var = (msr0) psr0Var).e) == null || evu0.J(str)) {
                btsVar.e0(1092483817);
                btsVar.t(false);
            } else {
                btsVar.e0(1092109988);
                jeb1.f(msr0Var.e, an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2), AppColor$Palette.TextMinor, 0L, 0L, rly0.c, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).i.a, btsVar, 1573296, 0, 16184);
                btsVar = btsVar;
                ly3.B(c530Var, f, btsVar, false);
            }
            btsVar.t(true);
            f530Var3 = f530Var4;
        } else {
            btsVar.Y();
            f530Var3 = f530Var2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(psr0Var, tlsVar, f530Var3, i, i2);
        }
    }

    public static final void b(final BitmapDrawable bitmapDrawable, final f530 f530Var, fid fidVar, final int i) {
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(388114016);
        int i2 = (btsVar.e(bitmapDrawable) ? 4 : 2) | i;
        final int i3 = 0;
        final int i4 = 1;
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else {
            if (bitmapDrawable == null) {
                v = btsVar.v();
                if (v != null) {
                    wlsVar = new wls(bitmapDrawable, f530Var, i, i3) { // from class: zrr0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ BitmapDrawable b;
                        public final /* synthetic */ f530 c;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i5 = this.a;
                            zy11 zy11Var = zy11.a;
                            f530 f530Var2 = this.c;
                            BitmapDrawable bitmapDrawable2 = this.b;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).getClass();
                            switch (i5) {
                                case 0:
                                    ccb1.b(bitmapDrawable2, f530Var2, fidVar2, vng.O(49));
                                    break;
                                default:
                                    ccb1.b(bitmapDrawable2, f530Var2, fidVar2, vng.O(49));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            f530 m = ljs0.m(f530Var, 36.0f);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, m);
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
            o4b1.c(new u92(bitmapDrawable.getBitmap()), null, ljs0.m(c530.a, 30.0f), null, mhe.b, 0.0f, null, 0, btsVar, 25008, 232);
            btsVar.t(true);
        }
        v = btsVar.v();
        if (v != null) {
            wlsVar = new wls(bitmapDrawable, f530Var, i, i4) { // from class: zrr0
                public final /* synthetic */ int a;
                public final /* synthetic */ BitmapDrawable b;
                public final /* synthetic */ f530 c;

                {
                    this.a = i4;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i5 = this.a;
                    zy11 zy11Var = zy11.a;
                    f530 f530Var2 = this.c;
                    BitmapDrawable bitmapDrawable2 = this.b;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).getClass();
                    switch (i5) {
                        case 0:
                            ccb1.b(bitmapDrawable2, f530Var2, fidVar2, vng.O(49));
                            break;
                        default:
                            ccb1.b(bitmapDrawable2, f530Var2, fidVar2, vng.O(49));
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void c(jrr0 jrr0Var, sls slsVar, fid fidVar, int i) {
        sls slsVar2;
        bts btsVar;
        boolean z;
        float f;
        long n;
        wls wlsVar;
        c530 c530Var;
        tls tlsVar;
        wls wlsVar2;
        f530 f530Var;
        jrr0 jrr0Var2 = jrr0Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-514608224);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | (btsVar2.k(jrr0Var2) ? 4 : 2) | (btsVar2.e(slsVar) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var2 = c530.a;
            f530 c = ljs0.c(c530Var2, 1.0f);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, c);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            String str = null;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar3);
            } else {
                btsVar2.r0();
            }
            wls wlsVar3 = d.f;
            qje.W(btsVar2, wlsVar3, a);
            wls wlsVar4 = d.e;
            qje.W(btsVar2, wlsVar4, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar5 = d.g;
            qje.W(btsVar2, wlsVar5, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar2, tlsVar2);
            wls wlsVar6 = d.d;
            qje.W(btsVar2, wlsVar6, d);
            f530 l = ymb1.l(ljs0.c(c530Var2, 1.0f), cyk0.c(20.0f));
            AppColor$Palette appColor$Palette = AppColor$Palette.BgMinor;
            f530 c2 = bzk0.c(l, appColor$Palette, qke.q);
            boolean z2 = jrr0Var2.i;
            boolean z3 = jrr0Var2.j;
            if (z2 && z3) {
                z = z3;
                f = 1.0f;
            } else {
                z = z3;
                f = 0.0f;
            }
            if (z2 && z) {
                btsVar2.e0(1080845022);
                n = tje.n(AppColor$Palette.Control, btsVar2);
                btsVar2.t(false);
            } else {
                btsVar2.e0(1080908510);
                n = tje.n(appColor$Palette, btsVar2);
                btsVar2.t(false);
            }
            f530 a2 = aab1.a(f, n, c2, cyk0.c(20.0f));
            if (z) {
                wlsVar = wlsVar6;
                c530Var = c530Var2;
                tlsVar = tlsVar2;
                wlsVar2 = wlsVar4;
                f530Var = q791.d(c530Var, false, null, null, slsVar, 15);
            } else {
                wlsVar = wlsVar6;
                c530Var = c530Var2;
                tlsVar = tlsVar2;
                wlsVar2 = wlsVar4;
                f530Var = c530Var;
            }
            f530 l2 = an91.l(a2.k(f530Var), 12.0f, 16.0f);
            sic a3 = qic.a(g43Var, so5Var, btsVar2, 0);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d2 = b.d(btsVar2, l2);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar3);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar3, a3);
            qje.W(btsVar2, wlsVar2, o2);
            vfc.v(hashCode2, btsVar2, wlsVar5, btsVar2, tlsVar);
            qje.W(btsVar2, wlsVar, d2);
            f530 c3 = ljs0.c(c530Var, 1.0f);
            lhl0 a4 = khl0.a(lr20.g, x4c.D, btsVar2, 54);
            int hashCode3 = Long.hashCode(btsVar2.T);
            r1b0 o3 = btsVar2.o();
            f530 d3 = b.d(btsVar2, c3);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar3);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar3, a4);
            qje.W(btsVar2, wlsVar2, o3);
            vfc.v(hashCode3, btsVar2, wlsVar5, btsVar2, tlsVar);
            qje.W(btsVar2, wlsVar, d3);
            String str2 = jrr0Var.b;
            ety0 ety0Var = xya1.e(btsVar2).g.b;
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            wls wlsVar7 = wlsVar2;
            jeb1.f(str2, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), null, 0L, 0L, null, null, 0L, 0, false, 2, 0, null, ety0Var, btsVar2, 0, 48, 14332);
            bts btsVar3 = btsVar2;
            String str3 = jrr0Var.d;
            if (str3 != null && !evu0.J(str3)) {
                str = str3;
            }
            if (str == null) {
                btsVar3.e0(-1324494282);
                btsVar3.t(false);
            } else {
                btsVar3.e0(-1324494281);
                c530 c530Var3 = c530Var;
                c530Var = c530Var3;
                jeb1.f(str, an91.o(c530Var3, 8.0f, 0.0f, 0.0f, 0.0f, 14), AppColor$Palette.TextMinor, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).h.a, btsVar3, 432, 0, 16376);
                btsVar3 = btsVar3;
                btsVar3.t(false);
            }
            btsVar3.t(true);
            if (evu0.J(jrr0Var.c)) {
                btsVar3.e0(1976438734);
                btsVar3.t(false);
            } else {
                tse0.s(btsVar3, 1976253261, c530Var, 2.0f, btsVar3);
                bts btsVar4 = btsVar3;
                jeb1.f(jrr0Var.c, null, null, 0L, 0L, null, null, 0L, 0, false, 2, 0, null, xya1.e(btsVar4).h.a, btsVar4, 0, 48, 14334);
                btsVar3 = btsVar4;
                btsVar3.t(false);
            }
            f530 e = n.e(c530Var, 16.0f, btsVar3, c530Var, 1.0f);
            lhl0 a5 = khl0.a(lr20.a, x4c.E, btsVar3, 48);
            int hashCode4 = Long.hashCode(btsVar3.T);
            r1b0 o4 = btsVar3.o();
            f530 d4 = b.d(btsVar3, e);
            btsVar3.i0();
            if (btsVar3.S) {
                btsVar3.n(slsVar3);
            } else {
                btsVar3.r0();
            }
            qje.W(btsVar3, wlsVar3, a5);
            qje.W(btsVar3, wlsVar7, o4);
            vfc.v(hashCode4, btsVar3, wlsVar5, btsVar3, tlsVar);
            qje.W(btsVar3, wlsVar, d4);
            c530 c530Var4 = c530Var;
            b(jrr0Var.g, an91.o(c530Var4, 0.0f, 0.0f, 12.0f, 0.0f, 11), btsVar3, 48);
            Integer num = jrr0Var.e;
            Integer num2 = jrr0Var.f;
            SharingPersonalGoalsProgressStyle sharingPersonalGoalsProgressStyle = jrr0Var.k;
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            jrr0Var2 = jrr0Var;
            btsVar = btsVar3;
            slsVar2 = slsVar;
            d(num, num2, sharingPersonalGoalsProgressStyle, new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), btsVar, 0);
            b(jrr0Var2.h, an91.o(c530Var4, 12.0f, 0.0f, 0.0f, 0.0f, 14), btsVar, 48);
            tse0.t(btsVar, true, true, true);
        } else {
            slsVar2 = slsVar;
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(jrr0Var2, slsVar2, i, 7);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0076  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(Integer num, Integer num2, SharingPersonalGoalsProgressStyle sharingPersonalGoalsProgressStyle, f530 f530Var, fid fidVar, int i) {
        SharingPersonalGoalsProgressStyle sharingPersonalGoalsProgressStyle2;
        int i2;
        int i3;
        int i4;
        wp2 wp2Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1679056853);
        int i5 = i | (btsVar.k(num) ? 4 : 2) | (btsVar.k(num2) ? 32 : 16) | (btsVar.c(sharingPersonalGoalsProgressStyle.ordinal()) ? 256 : 128) | (btsVar.k(f530Var) ? 2048 : 1024);
        if (btsVar.V(i5 & 1, (i5 & 1171) != 1170)) {
            if (num2 != null) {
                Integer num3 = num2.intValue() > 0 ? num2 : null;
                if (num3 != null) {
                    i2 = num3.intValue();
                    if (num == null) {
                        i3 = y6i0.d(num.intValue(), 0, i2);
                        sharingPersonalGoalsProgressStyle2 = sharingPersonalGoalsProgressStyle;
                    } else {
                        sharingPersonalGoalsProgressStyle2 = sharingPersonalGoalsProgressStyle;
                        i3 = sharingPersonalGoalsProgressStyle2 == SharingPersonalGoalsProgressStyle.SUCCESS ? i2 : 0;
                    }
                    i4 = csr0.b[sharingPersonalGoalsProgressStyle2.ordinal()];
                    if (i4 != 1) {
                        wp2Var = AppColor$Palette.Line;
                    } else {
                        if (i4 != 2) {
                            w511.b();
                            return;
                        }
                        wp2Var = new up2(eq2.c);
                    }
                    lhl0 a = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar, 6);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o = btsVar.o();
                    f530 d = b.d(btsVar, f530Var);
                    ohd.G1.getClass();
                    sls slsVar = d.b;
                    if (btsVar.a != null) {
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
                    btsVar.e0(-1262235531);
                    int i6 = 0;
                    while (i6 < i2) {
                        pi6.a(bzk0.c(ymb1.l(ljs0.e(new x2y(1.0f, true), 4.0f), cyk0.c(4.0f)), i6 < i3 ? wp2Var : AppColor$Palette.ControlMinor, qke.q), btsVar, 0);
                        i6++;
                    }
                    btsVar.t(false);
                    btsVar.t(true);
                }
            }
            i2 = 5;
            if (num == null) {
            }
            i4 = csr0.b[sharingPersonalGoalsProgressStyle2.ordinal()];
            if (i4 != 1) {
            }
            lhl0 a2 = khl0.a(new i43(4.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, f530Var);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (btsVar.a != null) {
            }
        } else {
            sharingPersonalGoalsProgressStyle2 = sharingPersonalGoalsProgressStyle;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(num, num2, sharingPersonalGoalsProgressStyle2, f530Var, i, 15);
        }
    }

    public static final void e(psr0 psr0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-172935348);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(psr0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = f.j(Boolean.FALSE);
                btsVar.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            androidx.compose.foundation.lazy.b a = a7y.a(0, 3, btsVar);
            wg6 a2 = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar, 48, 0, 8189);
            WeakHashMap weakHashMap = a.w;
            sd2 sd2Var = vuz.o(btsVar).g;
            lg6 c = qab1.c(a2, null, null, btsVar, 0, 6);
            androidx.compose.runtime.internal.a S = wwg.S(1151912254, true, new asr0(i3, tlsVar), btsVar);
            fdd.a.getClass();
            c.a(null, a2, c, false, false, null, sd2Var, S, null, fdd.c, wwg.S(117556928, true, new r5y(a, oz40Var, psr0Var, tlsVar), btsVar), wwg.S(-1947137044, true, new dr5(a, psr0Var, tlsVar, oz40Var, 7), btsVar), btsVar, 817889280, 54, 313);
            btsVar = btsVar;
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(psr0Var, tlsVar, i, 15);
        }
    }

    public static final void f(String str, String str2, Bundle bundle) {
        if (str2 != null) {
            bundle.putString(str, str2);
        }
    }
}
