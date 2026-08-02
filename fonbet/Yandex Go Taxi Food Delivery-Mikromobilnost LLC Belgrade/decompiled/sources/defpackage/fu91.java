package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.fragment.app.FragmentActivity;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.spinner.SpinnerSize;
import com.yandex.go.design.compose.theme.AppThemeType;
import com.yx360.design.compose.atoms.DsInputInline$Align;
import com.yx360.design.compose.atoms.DsInputInline$FocusPosition;
import com.yx360.design.compose.atoms.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class fu91 {
    public static final void a(final String str, final String str2, final tls tlsVar, final f530 f530Var, final ety0 ety0Var, final int i, int i2, DsInputInline$Align dsInputInline$Align, boolean z, DsInputInline$FocusPosition dsInputInline$FocusPosition, final lkx lkxVar, xjx xjxVar, fid fidVar, final int i3) {
        int i4;
        DsInputInline$FocusPosition dsInputInline$FocusPosition2;
        xjx xjxVar2;
        int i5;
        boolean z2;
        DsInputInline$Align dsInputInline$Align2;
        bts btsVar;
        final boolean z3;
        final int i6;
        final xjx xjxVar3;
        final DsInputInline$FocusPosition dsInputInline$FocusPosition3;
        final DsInputInline$Align dsInputInline$Align3;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(260774224);
        if ((i3 & 6) == 0) {
            i4 = (btsVar2.k(str) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= btsVar2.k(str2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= btsVar2.e(tlsVar) ? 256 : 128;
        }
        if ((i3 & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i4 |= btsVar2.k(f530Var) ? 2048 : 1024;
        }
        if ((i3 & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i4 |= btsVar2.k(ety0Var) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= btsVar2.c(i) ? 131072 : 65536;
        }
        if (((i4 | 920125440) & 306783379) == 306783378 && btsVar2.E()) {
            btsVar2.Y();
            i6 = i2;
            dsInputInline$Align3 = dsInputInline$Align;
            z3 = z;
            dsInputInline$FocusPosition3 = dsInputInline$FocusPosition;
            xjxVar3 = xjxVar;
            btsVar = btsVar2;
        } else {
            btsVar2.a0();
            if ((i3 & 1) == 0 || btsVar2.C()) {
                DsInputInline$Align dsInputInline$Align4 = DsInputInline$Align.Start;
                dsInputInline$FocusPosition2 = DsInputInline$FocusPosition.TapPosition;
                xjxVar2 = xjx.g;
                i5 = Integer.MAX_VALUE;
                z2 = true;
                dsInputInline$Align2 = dsInputInline$Align4;
            } else {
                btsVar2.Y();
                i5 = i2;
                dsInputInline$Align2 = dsInputInline$Align;
                z2 = z;
                dsInputInline$FocusPosition2 = dsInputInline$FocusPosition;
                xjxVar2 = xjxVar;
            }
            btsVar2.u();
            f530 c = ljs0.c(f530Var, 1.0f);
            DsInputInline$FocusPosition dsInputInline$FocusPosition4 = dsInputInline$FocusPosition2;
            a S = wwg.S(24538554, true, new d(dsInputInline$Align2, str, dsInputInline$FocusPosition2, ety0Var, z2, f530Var, i, tlsVar, lkxVar, xjxVar2, str2, i5), btsVar2);
            btsVar = btsVar2;
            xab1.a(c, null, S, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
            z3 = z2;
            i6 = i5;
            xjxVar3 = xjxVar2;
            dsInputInline$FocusPosition3 = dsInputInline$FocusPosition4;
            dsInputInline$Align3 = dsInputInline$Align2;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new wls() { // from class: hqm
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int O = vng.O(i3 | 1);
                    fu91.a(str, str2, tlsVar, f530Var, ety0Var, i, i6, dsInputInline$Align3, z3, dsInputInline$FocusPosition3, lkxVar, xjxVar3, (fid) obj, O);
                    return zy11.a;
                }
            };
        }
    }

    public static final void b(boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1086094749);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), 64.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, e);
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
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar2 = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            if (z) {
                btsVar.e0(-1841480291);
                String e2 = ohb1.e(btsVar, xxh0.common_back);
                f530 a = cj6.a.a(ljs0.i(c530Var, dsz0.b), x4c.x);
                boolean k = btsVar.k(e2);
                Object Q = btsVar.Q();
                Object obj = did.a;
                if (k || Q == obj) {
                    Q = new dcc0(e2, 23);
                    btsVar.o0(Q);
                }
                f530 a2 = fnq0.a(a, (tls) Q);
                boolean z3 = (i3 & 112) == 32;
                Object Q2 = btsVar.Q();
                if (z3 || Q2 == obj) {
                    Q2 = new v6k0(26, tlsVar);
                    btsVar.o0(Q2);
                }
                f530 d3 = q791.d(a2, false, null, null, (sls) Q2, 15);
                z910 d4 = pi6.d(x4c.y, false);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d5 = b.d(btsVar, d3);
                btsVar.i0();
                if (btsVar.S) {
                    btsVar.n(slsVar);
                } else {
                    btsVar.r0();
                }
                qje.W(btsVar, wlsVar, d4);
                qje.W(btsVar, wlsVar2, o2);
                vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar2);
                qje.W(btsVar, wlsVar4, d5);
                sya1.a(vza1.c(), null, null, null, btsVar, 384, 10);
                z2 = true;
                btsVar.t(true);
                btsVar.t(false);
            } else {
                z2 = true;
                btsVar.e0(-1840949819);
                btsVar.t(false);
            }
            btsVar.t(z2);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new pxl0(z, i, 0, tlsVar);
        }
    }

    public static final void c(eyl0 eyl0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1270050067);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(eyl0Var) ? 4 : 2) | i;
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
                Q = new v6k0(27, tlsVar);
                btsVar.o0(Q);
            }
            gya1.d(false, (sls) Q, btsVar, 0, 1);
            rzo.b(AppThemeType.Dark, null, wwg.S(-9648375, true, new t7l0(8, eyl0Var, tlsVar), btsVar), btsVar, 3120, 5);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(eyl0Var, tlsVar, i, 24);
        }
    }

    public static final void d(cyl0 cyl0Var, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        boolean z;
        sls slsVar;
        cyl0 cyl0Var2 = cyl0Var;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-799302556);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(cyl0Var2) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            k3r k3rVar = ljs0.c;
            uo5 uo5Var = x4c.b;
            z910 d = pi6.d(uo5Var, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k3rVar);
            ohd.G1.getClass();
            sls slsVar2 = androidx.compose.ui.node.d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            wls wlsVar = androidx.compose.ui.node.d.f;
            qje.W(btsVar, wlsVar, d);
            wls wlsVar2 = androidx.compose.ui.node.d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = androidx.compose.ui.node.d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = androidx.compose.ui.node.d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = androidx.compose.ui.node.d.d;
            qje.W(btsVar, wlsVar4, d2);
            int i3 = i2 & 112;
            b(!(cyl0Var2 instanceof ayl0), tlsVar, btsVar, i3);
            f530 m = an91.m(k3rVar, 16.0f, 0.0f, 2);
            so5 so5Var = x4c.H;
            sic a = qic.a(lr20.e, so5Var, btsVar, 54);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, m);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d3);
            c530 c530Var = c530.a;
            f530 j = vfc.j(so5Var, ljs0.e(c530Var, 100.0f));
            so5 so5Var2 = x4c.G;
            g43 g43Var = lr20.c;
            sic a2 = qic.a(g43Var, so5Var2, btsVar, 0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d4 = b.d(btsVar, j);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar2);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d4);
            jeb1.f(cyl0Var2.getTitle(), null, null, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.e(btsVar).b.e, btsVar, 0, 0, 16254);
            btsVar = btsVar;
            String subtitle = cyl0Var2.getSubtitle();
            if (subtitle != null) {
                tse0.s(btsVar, 1712025576, c530Var, 8.0f, btsVar);
                jeb1.f(subtitle, null, AppColor$Palette.BgInvert, 0L, 0L, null, new sjy0(3), 0L, 0, false, 0, 0, null, xya1.d(btsVar).g.a, btsVar, 384, 0, 16250);
                btsVar = btsVar;
                z = false;
                btsVar.t(false);
            } else {
                z = false;
                btsVar.e0(1712275436);
                btsVar.t(false);
            }
            btsVar.t(true);
            f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), 160.0f);
            z910 d5 = pi6.d(uo5Var, z);
            int hashCode4 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d6 = b.d(btsVar, e);
            btsVar.i0();
            if (btsVar.S) {
                slsVar = slsVar2;
                btsVar.n(slsVar);
            } else {
                slsVar = slsVar2;
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d5);
            qje.W(btsVar, wlsVar2, o4);
            vfc.v(hashCode4, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d6);
            uo5 uo5Var2 = x4c.y;
            cj6 cj6Var = cj6.a;
            ffb1.d(cj6Var.a(c530Var, uo5Var2), cyl0Var.a(), SpinnerSize.LARGE, btsVar, 384, 0);
            btsVar.t(true);
            btsVar.t(true);
            f530 l = an91.l(cj6Var.a(i9a1.d(ljs0.c(c530Var, 1.0f)), x4c.B), 8.0f, 8.0f);
            sic a3 = qic.a(g43Var, so5Var2, btsVar, 0);
            int hashCode5 = Long.hashCode(btsVar.T);
            r1b0 o5 = btsVar.o();
            f530 d7 = b.d(btsVar, l);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o5);
            vfc.v(hashCode5, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d7);
            cyl0Var2 = cyl0Var;
            if (cyl0Var2 instanceof zxl0) {
                btsVar.e0(-173060321);
                f530 c = ljs0.c(c530Var, 1.0f);
                ButtonSize buttonSize = ButtonSize.L;
                ButtonStyle buttonStyle = ButtonStyle.Main;
                boolean z2 = i3 == 32;
                Object Q = btsVar.Q();
                if (z2 || Q == did.a) {
                    tlsVar2 = tlsVar;
                    Q = new v6k0(28, tlsVar2);
                    btsVar.o0(Q);
                } else {
                    tlsVar2 = tlsVar;
                }
                bts btsVar2 = btsVar;
                d17.c(c, false, buttonSize, buttonStyle, null, (sls) Q, wwg.S(-744672946, true, new pdf0(21, cyl0Var2), btsVar), btsVar2, 1576326, 18);
                btsVar = btsVar2;
                btsVar.t(false);
            } else {
                tlsVar2 = tlsVar;
                btsVar.e0(-172733333);
                btsVar.t(false);
            }
            btsVar.t(true);
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(cyl0Var2, tlsVar2, i, 9);
        }
    }

    public static final void e(dyl0 dyl0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(33555315);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.k(dyl0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            k3r k3rVar = ljs0.c;
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k3rVar);
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
            qje.W(btsVar, wlsVar4, d);
            b(true, tlsVar, btsVar, (i2 & 112) | 6);
            f530 l = an91.l(new x2y(1.0f, true), 16.0f, 16.0f);
            z910 d2 = pi6.d(x4c.b, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, l);
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
            tbv tbvVar = dyl0Var.a;
            uo5 uo5Var = x4c.y;
            ywy ywyVar = (ywy) ffb1.e(tbvVar, btsVar).getValue();
            if (jl40.l(ywyVar, wwy.a)) {
                btsVar.e0(-1188024354);
                com.yandex.go.design.compose.loading.b.a(k3rVar, qke.q, false, null, null, null, false, btsVar, 54, 252);
                btsVar.t(false);
            } else if (ywyVar instanceof xwy) {
                btsVar.e0(-1187955534);
                j4b1.c(((xwy) ywyVar).a, k3rVar, null, null, uo5Var, mhe.b, 1.0f, 1, btsVar, 196656, 0);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                if (!jl40.l(ywyVar, vwy.a)) {
                    throw unr0.y(-1839441359, btsVar, false);
                }
                btsVar.e0(-1187881568);
                btsVar.t(false);
            }
            btsVar.t(true);
            f(dyl0Var, tlsVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new oxl0(dyl0Var, tlsVar, i, 1);
        }
    }

    public static final void f(final dyl0 dyl0Var, tls tlsVar, fid fidVar, int i) {
        final dyl0 dyl0Var2;
        c530 c530Var;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-211013401);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(dyl0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var2 = c530.a;
            f530 l = an91.l(i9a1.d(ljs0.c(c530Var2, 1.0f)), 8.0f, 8.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, l);
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
            qje.W(btsVar, wlsVar4, d);
            CharSequence charSequence = dyl0Var.b;
            if (charSequence != null) {
                btsVar.e0(1270272751);
                f530 e = ljs0.e(ljs0.c(c530Var2, 1.0f), ButtonSize.L.getSize());
                z910 d2 = pi6.d(x4c.b, false);
                int hashCode2 = Long.hashCode(btsVar.T);
                r1b0 o2 = btsVar.o();
                f530 d3 = b.d(btsVar, e);
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
                c530Var = c530Var2;
                z = true;
                qgy.b(charSequence, null, cj6.a.a(c530Var2, x4c.y), AppColor$Palette.TextMinor, 0L, 0L, new sjy0(3), 0L, 0, 2, 0, null, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6, 15218);
                btsVar = btsVar;
                btsVar.t(true);
                btsVar.t(false);
            } else {
                c530Var = c530Var2;
                z = true;
                btsVar.e0(1270601413);
                btsVar.t(false);
            }
            f530 c = ljs0.c(c530Var, 1.0f);
            ButtonStyle buttonStyle = ButtonStyle.Ghost;
            int i3 = i2 & 112;
            boolean z2 = i3 == 32 ? z : false;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new v6k0(29, tlsVar);
                btsVar.o0(Q);
            }
            final int i4 = 0;
            d17.c(c, false, null, buttonStyle, null, (sls) Q, wwg.S(-1486951175, z, new zls() { // from class: nxl0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    dyl0 dyl0Var3 = dyl0Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                jeb1.f(dyl0Var3.c, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.a, btsVar2, 0, 0, 16382);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                jeb1.f(dyl0Var3.d, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.b, btsVar3, 0, 0, 16382);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, 1575942, 22);
            f530 e2 = n.e(c530Var, 8.0f, btsVar, c530Var, 1.0f);
            ButtonStyle buttonStyle2 = ButtonStyle.Main;
            boolean z3 = i3 == 32;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new v6k0(25, tlsVar);
                btsVar.o0(Q2);
            }
            final int i5 = 1;
            dyl0Var2 = dyl0Var;
            d17.c(e2, false, null, buttonStyle2, null, (sls) Q2, wwg.S(775634736, true, new zls() { // from class: nxl0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i52 = i5;
                    zy11 zy11Var = zy11.a;
                    dyl0 dyl0Var3 = dyl0Var2;
                    switch (i52) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                jeb1.f(dyl0Var3.c, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar2).g.a, btsVar2, 0, 0, 16382);
                                break;
                            }
                        default:
                            fid fidVar3 = (fid) obj2;
                            int intValue2 = ((Integer) obj3).intValue();
                            bts btsVar3 = (bts) fidVar3;
                            if (!btsVar3.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                                btsVar3.Y();
                                break;
                            } else {
                                jeb1.f(dyl0Var3.d, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar3).g.b, btsVar3, 0, 0, 16382);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, 1575942, 22);
            btsVar.t(true);
        } else {
            dyl0Var2 = dyl0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new oxl0(dyl0Var2, tlsVar, i, 0);
        }
    }

    public static ph51 g(nh51 nh51Var, FragmentActivity fragmentActivity, vh51 vh51Var) {
        return new ph51(fragmentActivity, nh51Var.a, vh51Var, null, nh51Var.b);
    }

    public static final mpd0 h(com.yandex.plus.pay.ui.core.internal.a aVar) {
        mpd0 mpd0Var = aVar.a;
        if (mpd0Var != null) {
            return mpd0Var;
        }
        ny61.g("Tarifficator UI scenario must be initialized using:\nPlusPayUI.getProvider {\n    ...\n    withTarifficator(tarifficator)\n}");
        return null;
    }
}
