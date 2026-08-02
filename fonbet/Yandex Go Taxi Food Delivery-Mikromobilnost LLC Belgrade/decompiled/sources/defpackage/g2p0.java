package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public abstract class g2p0 {
    public static final byk0 a = cyk0.c(24.0f);

    public static final void a(l2p0 l2p0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-261113705);
        int i2 = (btsVar.k(l2p0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 k = an91.k(i9a1.d(ljs0.c(c530Var, 1.0f)), 8.0f);
            sic a2 = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i3 = i2 & HProv.PP_DELETE_SAVED_PASSWD;
            f(l2p0Var, tlsVar, btsVar, i3);
            oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
            b(l2p0Var, tlsVar, btsVar, i3);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            d(l2p0Var, tlsVar, btsVar, i3);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d2p0(l2p0Var, tlsVar, i, 1);
        }
    }

    public static final void b(l2p0 l2p0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1907574555);
        int i2 = (btsVar.k(l2p0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new lao0(11, tlsVar);
                btsVar.o0(Q);
            }
            phb1.b((sls) Q, ljs0.c(c530.a, 1.0f), false, null, null, wwg.S(-536730308, true, new c2p0(l2p0Var, i3), btsVar), null, null, null, btsVar, 196656, 988);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d2p0(l2p0Var, tlsVar, i, 0);
        }
    }

    public static final void c(l2p0 l2p0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1298267854);
        int i2 = (btsVar.k(l2p0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            String str = l2p0Var.f;
            if (str.length() > 0) {
                btsVar.e0(517282992);
                f530 w = ljs0.w(ljs0.b, 3);
                z910 d = pi6.d(x4c.C, false);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d2 = b.d(btsVar, w);
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
                ovi0 a2 = mja1.a(str, null, 6);
                wcd.a.getClass();
                v0b1.a(a2, null, null, wcd.b, null, null, null, mhe.e, 0.0f, 0, btsVar, 12585984, 886);
                btsVar.t(true);
                btsVar.t(false);
            } else {
                btsVar.e0(517625108);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e2p0(l2p0Var, i, 1);
        }
    }

    public static final void d(l2p0 l2p0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-372156733);
        int i2 = (btsVar.k(l2p0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (l2p0Var.i.length() <= 0 || l2p0Var.j.length() <= 0) {
            btsVar.e0(-1610062497);
            btsVar.t(false);
        } else {
            btsVar.e0(-1610412425);
            String str = l2p0Var.i;
            ety0 ety0Var = xya1.e(btsVar).i.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            boolean z = ((i2 & 112) == 32) | ((i2 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new nao0(10, tlsVar, l2p0Var);
                btsVar.o0(Q);
            }
            jeb1.f(str, q791.d(c530.a, false, null, null, (sls) Q, 15), appColor$Palette, 0L, 0L, rly0.c, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var, btsVar, 1573248, 0, 16184);
            btsVar = btsVar;
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d2p0(l2p0Var, tlsVar, i, 3);
        }
    }

    public static final void e(l2p0 l2p0Var, fid fidVar, int i) {
        int i2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-24312566);
        if ((i & 6) == 0) {
            i2 = i | (btsVar.k(l2p0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            lhl0 a2 = khl0.a(lr20.a, x4c.F, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            CharSequence charSequence = l2p0Var.c;
            wp2 wp2Var = l2p0Var.e;
            CharSequence charSequence2 = l2p0Var.d;
            qgy.b(charSequence, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).f.c, null, btsVar, 0, 0, 12286);
            btsVar = btsVar;
            if (charSequence2.length() > 0) {
                btsVar.e0(836214183);
                oeb1.c(btsVar, ljs0.q(c530Var, 4.0f));
                z = true;
                wk4.a(BadgeSize.M, new mm4(wp2Var, new up2(zp2.a), new am4(new up2(ldc.b(tje.n(wp2Var, btsVar), 0.2f, 0.0f, 0.0f, 0.0f, 14)))), an91.d(6.0f, 0.0f, 6.0f, 2.0f, 2), an91.o(c530Var, 0.0f, 0.0f, 0.0f, 2.0f, 7), wwg.S(363410840, true, new jrn0(charSequence2, xya1.e(btsVar).h.b, 4), btsVar), btsVar, 200070);
                btsVar.t(false);
            } else {
                z = true;
                btsVar.e0(836603388);
                btsVar.t(false);
            }
            btsVar.t(z);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(l2p0Var, i, 5);
        }
    }

    public static final void f(l2p0 l2p0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2123418880);
        int i2 = (btsVar.k(l2p0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new lao0(12, tlsVar);
                btsVar.o0(Q);
            }
            xlb1.a((sls) Q, ljs0.c(c530.a, 1.0f), false, null, null, wwg.S(1461515921, true, new c2p0(l2p0Var, i3), btsVar), null, null, null, btsVar, 196656, 988);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new d2p0(l2p0Var, tlsVar, i, 2);
        }
    }

    public static final void g(l2p0 l2p0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2136126657);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(l2p0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new bpn0(tlsVar, 11, l2p0Var), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(l2p0Var, tlsVar, i, 10);
        }
    }

    public static final void h(l2p0 l2p0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1565264212);
        dmw0 dmw0Var = btsVar.a;
        int i3 = (btsVar.k(l2p0Var) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530 o = an91.o(f530Var.k(ljs0.b), 16.0f, 16.0f, 0.0f, 16.0f, 4);
            so5 so5Var = x4c.G;
            sic a2 = qic.a(lr20.g, so5Var, btsVar, 6);
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
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o2);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar = d.h;
            qje.M(btsVar, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            sic a3 = qic.a(lr20.c, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, c530.a);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d2);
            qgy.b(l2p0Var.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).f.d, null, btsVar, 0, 0, 12286);
            btsVar = btsVar;
            if (l2p0Var.b.length() > 0) {
                btsVar.e0(781119151);
                qgy.b(l2p0Var.b, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 16374);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(781198914);
                btsVar.t(false);
            }
            i2 = 1;
            btsVar.t(true);
            e(l2p0Var, btsVar, i3 & 14);
            btsVar.t(true);
        } else {
            i2 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new c1p0(l2p0Var, f530Var, i, i2);
        }
    }

    public static final void i(l2p0 l2p0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-308976014);
        int i2 = (btsVar.k(l2p0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 e = ljs0.e(an91.n(ljs0.c(c530.a, 1.0f), 16.0f, 16.0f, 16.0f, 12.0f), 132.0f);
            AppColor$Palette appColor$Palette = AppColor$Palette.BgMinor;
            byk0 byk0Var = a;
            f530 l = ymb1.l(bzk0.c(e, appColor$Palette, byk0Var), byk0Var);
            lhl0 a2 = khl0.a(lr20.g, x4c.D, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, l);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            int i3 = i2 & 14;
            h(l2p0Var, n.d(btsVar, d, d.d, 1.0f, true), btsVar, i3);
            c(l2p0Var, btsVar, i3);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new e2p0(l2p0Var, i, 0);
        }
    }
}
