package com.yandex.go.summary.ui.compose.common.selector;

import androidx.compose.animation.k;
import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.m;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.haptic.HapticEffect;
import com.yandex.go.summary.ui.compose.common.selector.a;
import defpackage.a990;
import defpackage.aii0;
import defpackage.an91;
import defpackage.b3z0;
import defpackage.bts;
import defpackage.byk0;
import defpackage.bzk0;
import defpackage.c530;
import defpackage.cma1;
import defpackage.cyk0;
import defpackage.dhj0;
import defpackage.did;
import defpackage.dr5;
import defpackage.ety0;
import defpackage.f530;
import defpackage.fg31;
import defpackage.fgd;
import defpackage.fid;
import defpackage.fnq0;
import defpackage.fsk0;
import defpackage.g3z;
import defpackage.glq0;
import defpackage.hlq0;
import defpackage.igr0;
import defpackage.isk0;
import defpackage.jeb1;
import defpackage.jl40;
import defpackage.jrb1;
import defpackage.khl0;
import defpackage.lhl0;
import defpackage.lr20;
import defpackage.ls40;
import defpackage.ly3;
import defpackage.mmq0;
import defpackage.nhu0;
import defpackage.nmq0;
import defpackage.nvs0;
import defpackage.o430;
import defpackage.o91;
import defpackage.oc0;
import defpackage.ogo0;
import defpackage.ohd;
import defpackage.omq0;
import defpackage.otr0;
import defpackage.oz40;
import defpackage.prt;
import defpackage.qe31;
import defpackage.qh2;
import defpackage.qic;
import defpackage.qje;
import defpackage.qk30;
import defpackage.r1b0;
import defpackage.rx3;
import defpackage.sic;
import defpackage.sjy0;
import defpackage.sls;
import defpackage.tkb1;
import defpackage.tls;
import defpackage.ttb1;
import defpackage.tx40;
import defpackage.ty2;
import defpackage.tyo0;
import defpackage.ua31;
import defpackage.ugh;
import defpackage.up2;
import defpackage.ur70;
import defpackage.vj31;
import defpackage.w2o;
import defpackage.wg0;
import defpackage.wj31;
import defpackage.wls;
import defpackage.wp01;
import defpackage.wp2;
import defpackage.wwg;
import defpackage.x4c;
import defpackage.xj31;
import defpackage.xuz0;
import defpackage.xya1;
import defpackage.ymb1;
import defpackage.yn91;
import defpackage.zhb0;
import defpackage.zpn;
import defpackage.zx40;
import java.util.List;
import java.util.Locale;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class a {
    public static final void a(vj31 vj31Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        f530 a;
        boolean z = vj31Var.c;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1277805316);
        int i2 = i | (btsVar.k(vj31Var) ? 4 : 2) | (btsVar.k(f530Var) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar);
            }
            zx40 zx40Var = (zx40) Q;
            AppColor$Palette appColor$Palette = z ? AppColor$Palette.Text : AppColor$Palette.Line;
            fgd fgdVar = (fgd) btsVar.m(g3z.a);
            boolean z2 = !z;
            int i3 = i2 & 14;
            boolean k = (i3 == 4) | ((i2 & 896) == 256) | btsVar.k(fgdVar);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new wp01(4, tlsVar, vj31Var, fgdVar);
                btsVar.o0(Q2);
            }
            sls slsVar = (sls) Q2;
            boolean a2 = (i3 == 4) | btsVar.a(z2) | btsVar.k(slsVar);
            Object Q3 = btsVar.Q();
            int i4 = 19;
            if (a2 || Q3 == o430Var) {
                Q3 = new rx3(vj31Var, z2, slsVar, 19);
                btsVar.o0(Q3);
            }
            f530 a3 = fnq0.a(f530Var, (tls) Q3);
            Object obj = null;
            if (!z) {
                a3 = b.a(a3, m.a(), new qk30(i4, zx40Var, slsVar, obj));
            }
            a = b.a(a3, m.a(), new com.yandex.go.summary.ui.compose.common.animation.a(zx40Var));
            f530 k2 = an91.k(a, 8.0f);
            lhl0 a4 = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k2);
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
            qje.W(btsVar, d.f, a4);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            String upperCase = vj31Var.b.toUpperCase(Locale.ROOT);
            ty2.a(btsVar);
            ety0 ety0Var = prt.a.a;
            if (ety0Var == null) {
                btsVar.e0(-1764333326);
                ety0Var = xya1.e(btsVar).g.c;
            } else {
                btsVar.e0(-1764335899);
            }
            btsVar.t(false);
            jeb1.f(upperCase, null, appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var, btsVar, 0, 0, 16250);
            btsVar = btsVar;
            ttb1.a(vj31Var.f, null, k.e(null, 3).a(k.a(null, null, 15)).a(k.o(3, null, null)), k.f(null, 3).a(k.i(null, null, 15)).a(k.t(3, null, null)), "VerticalBadgeItem", wwg.S(-214186025, true, new o91(11, tlsVar), btsVar), btsVar, 224640, 2);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0((Object) vj31Var, (Object) f530Var, tlsVar, i, 26);
        }
    }

    public static final void b(mmq0 mmq0Var, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(230490841);
        int i2 = i | (btsVar.k(mmq0Var) ? 4 : 2) | 48 | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530Var2 = c530.a;
            f530 d = b.d(btsVar, f530Var2);
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
            xuz0.a(-14.0f, 48, btsVar, null);
            tkb1.a(mmq0Var.a, f530Var2, tlsVar, tlsVar2, btsVar, i2 & 8176, 0);
            btsVar.t(true);
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(mmq0Var, f530Var2, tlsVar, tlsVar2, i, 14);
        }
    }

    public static final void c(final nmq0 nmq0Var, f530 f530Var, final tls tlsVar, final tls tlsVar2, fid fidVar, final int i) {
        final f530 f530Var2;
        aii0 v;
        wls wlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(105272271);
        int i2 = i | (btsVar.k(nmq0Var) ? 4 : 2) | 48 | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            boolean isEmpty = nmq0Var.a.b.a.isEmpty();
            final c530 c530Var = c530.a;
            if (isEmpty) {
                v = btsVar.v();
                if (v != null) {
                    final int i3 = 0;
                    wlsVar = new wls(nmq0Var, c530Var, tlsVar, tlsVar2, i, i3) { // from class: ilq0
                        public final /* synthetic */ int a;
                        public final /* synthetic */ nmq0 b;
                        public final /* synthetic */ f530 c;
                        public final /* synthetic */ tls w;
                        public final /* synthetic */ tls x;

                        {
                            this.a = i3;
                        }

                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.a;
                            zy11 zy11Var = zy11.a;
                            switch (i4) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int O = vng.O(1);
                                    a.c(this.b, this.c, this.w, this.x, (fid) obj, O);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int O2 = vng.O(1);
                                    a.c(this.b, this.c, this.w, this.x, (fid) obj, O2);
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    v.d = wlsVar;
                }
                return;
            }
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c530Var);
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
            i(nmq0Var.a, null, tlsVar, btsVar, i2 & 896);
            xuz0.a(-14.0f, 48, btsVar, null);
            if (nmq0Var.c) {
                btsVar.e0(1613567000);
                f(nmq0Var, null, tlsVar, tlsVar2, btsVar, i2 & 8078);
                btsVar.t(false);
            } else {
                btsVar.e0(1613780497);
                g(nmq0Var, null, tlsVar, tlsVar2, btsVar, i2 & 8078);
                btsVar.t(false);
            }
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        v = btsVar.v();
        if (v != null) {
            final int i4 = 1;
            wlsVar = new wls(nmq0Var, f530Var2, tlsVar, tlsVar2, i, i4) { // from class: ilq0
                public final /* synthetic */ int a;
                public final /* synthetic */ nmq0 b;
                public final /* synthetic */ f530 c;
                public final /* synthetic */ tls w;
                public final /* synthetic */ tls x;

                {
                    this.a = i4;
                }

                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.a;
                    zy11 zy11Var = zy11.a;
                    switch (i42) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int O = vng.O(1);
                            a.c(this.b, this.c, this.w, this.x, (fid) obj, O);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int O2 = vng.O(1);
                            a.c(this.b, this.c, this.w, this.x, (fid) obj, O2);
                            break;
                    }
                    return zy11Var;
                }
            };
            v.d = wlsVar;
        }
    }

    public static final void d(omq0 omq0Var, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-102222673);
        int i2 = (btsVar.k(omq0Var) ? 4 : 2) | i | 48 | (btsVar.e(tlsVar) ? 256 : 128) | (btsVar.e(tlsVar2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            Object Q = btsVar.Q();
            int i3 = 29;
            if (Q == did.a) {
                Q = new tyo0(29);
                btsVar.o0(Q);
            }
            androidx.compose.runtime.internal.a S = wwg.S(1312814709, true, new wg0(i3, yn91.g(tlsVar, (tls) Q, btsVar, ((i2 >> 6) & 14) | 48)), btsVar);
            androidx.compose.runtime.internal.a S2 = wwg.S(-469212324, true, new ls40(omq0Var, tlsVar, tlsVar2, 18), btsVar);
            c530 c530Var = c530.a;
            jrb1.d(c530Var, S, S2, btsVar, 438);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(omq0Var, f530Var2, tlsVar, tlsVar2, i, 13);
        }
    }

    public static final void e(final wj31 wj31Var, f530 f530Var, final tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        ety0 ety0Var;
        boolean z = wj31Var.c;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1763906033);
        int i2 = i | (btsVar2.k(wj31Var) ? 4 : 2) | (btsVar2.k(f530Var) ? 32 : 16) | (btsVar2.e(tlsVar) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            ty2.a(btsVar2);
            byk0 byk0Var = prt.a.b;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = ly3.i(btsVar2);
            }
            zx40 zx40Var = (zx40) Q;
            wp2 up2Var = z ? AppColor$Palette.BgMinor : new up2(up2.b);
            if (z) {
                btsVar2.e0(-399769944);
                ety0Var = xya1.e(btsVar2).h.b;
                btsVar2.t(false);
            } else {
                btsVar2.e0(-399723289);
                ety0Var = xya1.e(btsVar2).h.a;
                btsVar2.t(false);
            }
            ety0 ety0Var2 = ety0Var;
            AppColor$Palette appColor$Palette = z ? AppColor$Palette.Text : AppColor$Palette.TextMinor;
            final fgd fgdVar = (fgd) btsVar2.m(g3z.a);
            boolean z2 = !z;
            int i3 = i2 & 14;
            int i4 = i2 & 896;
            boolean k = (i3 == 4) | (i4 == 256) | btsVar2.k(fgdVar);
            Object Q2 = btsVar2.Q();
            if (k || Q2 == o430Var) {
                final int i5 = 0;
                Q2 = new sls() { // from class: bg31
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i6 = i5;
                        zy11 zy11Var = zy11.a;
                        fgd fgdVar2 = fgdVar;
                        wj31 wj31Var2 = wj31Var;
                        tls tlsVar2 = tlsVar;
                        switch (i6) {
                            case 0:
                                tlsVar2.invoke(new imq0(wj31Var2));
                                fgdVar2.a(HapticEffect.ClickMedium);
                                break;
                            default:
                                tlsVar2.invoke(new imq0(wj31Var2));
                                fgdVar2.a(HapticEffect.ClickMedium);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q2);
            }
            sls slsVar = (sls) Q2;
            boolean a = (i3 == 4) | btsVar2.a(z2) | btsVar2.k(slsVar);
            Object Q3 = btsVar2.Q();
            if (a || Q3 == o430Var) {
                Q3 = new rx3(wj31Var, z2, slsVar, 18);
                btsVar2.o0(Q3);
            }
            f530 l = ymb1.l(bzk0.c(fnq0.a(f530Var, (tls) Q3), up2Var, byk0Var), byk0Var);
            isk0 a2 = fsk0.a(6, true);
            boolean e = (i4 == 256) | (i3 == 4) | btsVar2.e(fgdVar);
            Object Q4 = btsVar2.Q();
            if (e || Q4 == o430Var) {
                final int i6 = 1;
                Q4 = new sls() { // from class: bg31
                    @Override // defpackage.sls
                    public final Object invoke() {
                        int i62 = i6;
                        zy11 zy11Var = zy11.a;
                        fgd fgdVar2 = fgdVar;
                        wj31 wj31Var2 = wj31Var;
                        tls tlsVar2 = tlsVar;
                        switch (i62) {
                            case 0:
                                tlsVar2.invoke(new imq0(wj31Var2));
                                fgdVar2.a(HapticEffect.ClickMedium);
                                break;
                            default:
                                tlsVar2.invoke(new imq0(wj31Var2));
                                fgdVar2.a(HapticEffect.ClickMedium);
                                break;
                        }
                        return zy11Var;
                    }
                };
                btsVar2.o0(Q4);
            }
            sls slsVar2 = (sls) Q4;
            if (!z) {
                l = b.a(l, m.a(), new qk30(19, zx40Var, slsVar2, a2));
            }
            btsVar = btsVar2;
            jeb1.f(wj31Var.b, an91.l(l, 12.0f, 8.0f), appColor$Palette, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var2, btsVar, 0, 0, 16248);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0((Object) wj31Var, (Object) f530Var, tlsVar, i, 27);
        }
    }

    public static final void f(nmq0 nmq0Var, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        Object obj;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(552114883);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(nmq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            obj = tlsVar2;
            i3 |= btsVar2.e(obj) ? 2048 : 1024;
        } else {
            obj = tlsVar2;
        }
        int i4 = i3;
        if (btsVar2.V(i4 & 1, (i4 & 1171) != 1170)) {
            fg31 fg31Var = nmq0Var.a;
            List list = fg31Var.b.a;
            int i5 = fg31Var.a;
            boolean e = btsVar2.e(list);
            Object Q = btsVar2.Q();
            Object obj2 = did.a;
            if (e || Q == obj2) {
                Q = new oc0(list, 5);
                btsVar2.o0(Q);
            }
            ugh b = a990.b(i5, (sls) Q, btsVar2, 0, 2);
            oz40 n = f.n(list, btsVar2);
            oz40 n2 = f.n(Integer.valueOf(i5), btsVar2);
            oz40 n3 = f.n(tlsVar, btsVar2);
            fgd fgdVar = (fgd) btsVar2.m(g3z.a);
            boolean k = btsVar2.k(b) | btsVar2.k(n2) | btsVar2.k(n) | btsVar2.k(n3) | btsVar2.e(fgdVar);
            Object Q2 = btsVar2.Q();
            if (k || Q2 == obj2) {
                Object selectorItemKt$TariffSelectorPagerItem$3$1 = new SelectorItemKt$TariffSelectorPagerItem$3$1(b, n2, n, fgdVar, n3, null);
                btsVar2.o0(selectorItemKt$TariffSelectorPagerItem$3$1);
                Q2 = selectorItemKt$TariffSelectorPagerItem$3$1;
            }
            zpn.e(btsVar2, (wls) Q2, b);
            Integer valueOf = Integer.valueOf(i5);
            boolean c = btsVar2.c(i5) | btsVar2.k(n) | btsVar2.k(b);
            Object Q3 = btsVar2.Q();
            if (c || Q3 == obj2) {
                Q3 = new SelectorItemKt$TariffSelectorPagerItem$4$1(i5, b, n, null);
                btsVar2.o0(Q3);
            }
            zpn.f(b, valueOf, (wls) Q3, btsVar2);
            boolean e2 = btsVar2.e(list);
            Object Q4 = btsVar2.Q();
            if (e2 || Q4 == obj2) {
                Q4 = new qh2(list, 15);
                btsVar2.o0(Q4);
            }
            androidx.compose.runtime.internal.a S = wwg.S(207832260, true, new dr5(list, nmq0Var, tlsVar, obj, 6), btsVar2);
            int i6 = i4 & 112;
            c530 c530Var = c530.a;
            btsVar = btsVar2;
            otr0.a(b, c530Var, null, null, 0.0f, null, null, false, (tls) Q4, null, null, null, S, btsVar, i6, 15356);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new glq0(nmq0Var, f530Var2, tlsVar, tlsVar2, i, 0);
        }
    }

    public static final void g(nmq0 nmq0Var, f530 f530Var, tls tlsVar, tls tlsVar2, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(948910621);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(nmq0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i3 |= btsVar.e(tlsVar2) ? 2048 : 1024;
        }
        if (btsVar.V(i3 & 1, (i3 & 1171) != 1170)) {
            fg31 fg31Var = nmq0Var.a;
            List list = fg31Var.b.a;
            int i4 = fg31Var.a;
            xj31 xj31Var = (xj31) kotlin.collections.a.S(i4, list);
            if (xj31Var == null) {
                aii0 v = btsVar.v();
                if (v != null) {
                    v.d = new ogo0(nmq0Var, tlsVar, tlsVar2, i);
                    return;
                }
                return;
            }
            qe31 qe31Var = new qe31(xj31Var.getId(), i4);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new hlq0(0);
                btsVar.o0(Q);
            }
            tls tlsVar3 = (tls) Q;
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new hlq0(1);
                btsVar.o0(Q2);
            }
            c530 c530Var = c530.a;
            androidx.compose.animation.a.b(qe31Var, c530Var, tlsVar3, null, "VerticalIdWithIndexAnimatedContent", (tls) Q2, wwg.S(-1629432702, true, new dhj0(16, nmq0Var, tlsVar, tlsVar2), btsVar), btsVar, (i3 & 112) | 1794432, 8);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new glq0(nmq0Var, f530Var2, tlsVar, tlsVar2, i, 1);
        }
    }

    public static final void h(ua31 ua31Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar;
        f530 f530Var2;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(490034000);
        if ((i & 6) == 0) {
            i2 = i | (btsVar2.k(ua31Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = cyk0.c(8.0f);
                btsVar2.o0(Q);
            }
            byk0 byk0Var = (byk0) Q;
            wp2 wp2Var = ua31Var.d;
            wp2 wp2Var2 = ua31Var.d;
            Float f = ua31Var.e;
            boolean k = btsVar2.k(wp2Var);
            Object Q2 = btsVar2.Q();
            if (k || Q2 == o430Var) {
                Q2 = jl40.l(wp2Var2, new up2(up2.b)) ? null : new igr0(wp2Var2, 8.0f, 2.0f);
                btsVar2.o0(Q2);
            }
            igr0 igr0Var = (igr0) Q2;
            boolean k2 = btsVar2.k(f);
            Object Q3 = btsVar2.Q();
            if (k2 || Q3 == o430Var) {
                Q3 = f.f(f != null ? f.floatValue() : 1.0f);
                btsVar2.o0(Q3);
            }
            tx40 tx40Var = (tx40) Q3;
            c530 c530Var = c530.a;
            f530 a = igr0Var != null ? b.a(c530Var, m.a(), new ls40(20, igr0Var, byk0Var, tx40Var)) : c530Var;
            String str = ua31Var.f;
            if (str != null) {
                btsVar2.e0(10011341);
                boolean k3 = ((i3 & 112) == 32) | btsVar2.k(str);
                Object Q4 = btsVar2.Q();
                if (k3 || Q4 == o430Var) {
                    Q4 = new VerticalSelectorItemKt$VerticalBadgeItem$1$1(tlsVar, str, null);
                    btsVar2.o0(Q4);
                }
                zpn.e(btsVar2, (wls) Q4, str);
                btsVar2.t(false);
            } else {
                btsVar2.e0(10139154);
                btsVar2.t(false);
            }
            btsVar = btsVar2;
            jeb1.f(ua31Var.a, an91.l(bzk0.c(an91.o(c530Var, 4.0f, 0.0f, 0.0f, 0.0f, 14), ua31Var.c, byk0Var).k(a), 4.0f, 2.0f), ua31Var.b, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).i.b, btsVar, 0, 0, 16376);
            f530Var2 = c530Var;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(ua31Var, tlsVar, f530Var2, i, 14);
        }
    }

    public static final void i(fg31 fg31Var, f530 f530Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-797284538);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(fg31Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | 48;
        if ((i & 384) == 0) {
            i3 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            fg31 fg31Var2 = fg31Var.c ? fg31Var : null;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = new ur70(29);
                btsVar.o0(Q);
            }
            w2o a = k.q(1, (tls) Q, null).a(k.d(null, null, 15)).a(k.e(null, 3));
            Object Q2 = btsVar.Q();
            if (Q2 == o430Var) {
                Q2 = new ur70(29);
                btsVar.o0(Q2);
            }
            c530 c530Var = c530.a;
            ttb1.a(fg31Var2, c530Var, a, k.v(1, (tls) Q2, null).a(k.l(null, null, 15)).a(k.f(null, 3)), "VerticalSelectorItem", wwg.S(-984082879, true, new nhu0(5, fg31Var, tlsVar), btsVar), btsVar, (i3 & 112) | 224640, 0);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b3z0(fg31Var, f530Var2, tlsVar, i, 15);
        }
    }
}
