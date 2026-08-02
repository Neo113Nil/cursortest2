package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public abstract class pao0 {
    public static final byk0 a = cyk0.c(24.0f);

    public static final void a(yao0 yao0Var, tls tlsVar, fid fidVar, int i) {
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-141202647);
        int i2 = (btsVar.k(yao0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            CharSequence charSequence = yao0Var.d;
            String str = yao0Var.e;
            if (charSequence.length() > 0) {
                btsVar.e0(-1794886875);
                c530 c530Var = c530.a;
                f530 k = an91.k(c530Var, 8.0f);
                AppColor$Palette appColor$Palette = AppColor$Palette.Fog;
                byk0 byk0Var = a;
                f530 l = ymb1.l(bzk0.c(k, appColor$Palette, byk0Var), byk0Var);
                boolean z2 = (i2 & 112) == 32;
                Object Q = btsVar.Q();
                if (z2 || Q == did.a) {
                    Q = new wzl0(29, tlsVar);
                    btsVar.o0(Q);
                }
                f530 n = an91.n(q791.d(l, false, null, null, (sls) Q, 15), 8.0f, 4.0f, 4.0f, 4.0f);
                lhl0 a2 = khl0.a(lr20.a, x4c.E, btsVar, 48);
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, n);
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
                CharSequence charSequence2 = yao0Var.d;
                AppColor$Palette appColor$Palette2 = AppColor$Palette.EverFront;
                qgy.b(charSequence2, null, null, appColor$Palette2, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).i.a, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 12278);
                btsVar = btsVar;
                if (str.length() > 0) {
                    btsVar.e0(-1297845349);
                    oeb1.c(btsVar, ljs0.q(c530Var, 4.0f));
                    ovi0 a3 = mja1.a(str, new jfv(appColor$Palette2), 4);
                    lcd.a.getClass();
                    v0b1.a(a3, null, null, lcd.c, null, null, null, null, 0.0f, 0, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 1014);
                    z = false;
                    btsVar.t(false);
                } else {
                    z = false;
                    btsVar.e0(-1297631046);
                    btsVar.t(false);
                }
                btsVar.t(true);
                btsVar.t(z);
            } else {
                btsVar.e0(-1794129607);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kao0(yao0Var, tlsVar, i, 2);
        }
    }

    public static final void b(yao0 yao0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-17141051);
        int i2 = (btsVar.k(yao0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
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
            g(yao0Var, tlsVar, btsVar, i3);
            oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
            c(yao0Var, tlsVar, btsVar, i3);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            e(yao0Var, tlsVar, btsVar, i3);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kao0(yao0Var, tlsVar, i, 4);
        }
    }

    public static final void c(yao0 yao0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1700686263);
        int i2 = (btsVar.k(yao0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new lao0(1, tlsVar);
                btsVar.o0(Q);
            }
            phb1.b((sls) Q, ljs0.c(c530.a, 1.0f), false, null, null, wwg.S(-347571798, true, new mao0(yao0Var, i3), btsVar), null, null, null, btsVar, 196656, 988);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kao0(yao0Var, tlsVar, i, 6);
        }
    }

    public static final void d(yao0 yao0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-329159799);
        int i3 = i | (btsVar.k(yao0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
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
            if (yao0Var.f.length() > 0) {
                btsVar.e0(1060530106);
                ovi0 a2 = mja1.a(yao0Var.f, null, 6);
                lcd.a.getClass();
                v0b1.a(a2, null, null, lcd.b, null, null, null, mhe.e, 0.0f, 0, btsVar, 12585984, 886);
                btsVar.t(false);
            } else {
                btsVar.e0(1060738643);
                btsVar.t(false);
            }
            a(yao0Var, tlsVar, btsVar, i3 & HProv.PP_DELETE_SAVED_PASSWD);
            i2 = 1;
            btsVar.t(true);
        } else {
            i2 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kao0(yao0Var, tlsVar, i, i2);
        }
    }

    public static final void e(yao0 yao0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(192387057);
        int i3 = (btsVar.k(yao0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i4 = 0;
        if (!btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            i2 = 0;
            btsVar.Y();
        } else if (yao0Var.i.length() <= 0 || yao0Var.j.length() <= 0) {
            i2 = 0;
            btsVar.e0(1917012625);
            btsVar.t(false);
        } else {
            btsVar.e0(1916665580);
            String str = yao0Var.i;
            ety0 ety0Var = xya1.e(btsVar).i.a;
            AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
            boolean z = ((i3 & 112) == 32) | ((i3 & 14) == 4);
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new nao0(i4, tlsVar, yao0Var);
                btsVar.o0(Q);
            }
            i2 = 0;
            jeb1.f(str, q791.d(c530.a, false, null, null, (sls) Q, 15), appColor$Palette, 0L, 0L, rly0.c, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var, btsVar, 1573248, 0, 16184);
            btsVar = btsVar;
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kao0(yao0Var, tlsVar, i, i2);
        }
    }

    public static final void f(yao0 yao0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1849053070);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(yao0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            lhl0 a2 = khl0.a(lr20.a, x4c.F, btsVar, 48);
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
            qje.W(btsVar, d.f, a2);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            qgy.b(yao0Var.c, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).f.c, null, btsVar, 0, 0, 12286);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(yao0Var, i, 4);
        }
    }

    public static final void g(yao0 yao0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1378669458);
        int i2 = (btsVar.k(yao0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new lao0(0, tlsVar);
                btsVar.o0(Q);
            }
            xlb1.a((sls) Q, ljs0.c(c530.a, 1.0f), false, null, null, wwg.S(2093220159, true, new mao0(yao0Var, i3), btsVar), null, null, null, btsVar, 196656, 988);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kao0(yao0Var, tlsVar, i, 5);
        }
    }

    public static final void h(yao0 yao0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1927135386);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(yao0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new bpn0(tlsVar, 5, yao0Var), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new apn0(yao0Var, tlsVar, i, 7);
        }
    }

    public static final void i(yao0 yao0Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(988760460);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.k(yao0Var) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
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
            qgy.b(yao0Var.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).f.d, null, btsVar, 0, 0, 12286);
            btsVar = btsVar;
            if (yao0Var.b.length() > 0) {
                btsVar.e0(-811260209);
                qgy.b(yao0Var.b, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 16374);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(-811180446);
                btsVar.t(false);
            }
            btsVar.t(true);
            f(yao0Var, btsVar, i2 & 14);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(yao0Var, f530Var, i, 25);
        }
    }

    public static final void j(yao0 yao0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1936403667);
        int i2 = (btsVar.k(yao0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
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
            i(yao0Var, n.d(btsVar, d, d.d, 1.0f, true), btsVar, i2 & 14);
            d(yao0Var, tlsVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kao0(yao0Var, tlsVar, i, 3);
        }
    }
}
