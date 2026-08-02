package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.badge.BadgeSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes13.dex */
public abstract class lzo0 {
    public static final byk0 a = cyk0.c(24.0f);

    public static final void a(vzo0 vzo0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-220197259);
        int i2 = (btsVar.k(vzo0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
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
            f(vzo0Var, tlsVar, btsVar, i3);
            oeb1.c(btsVar, ljs0.e(c530Var, 4.0f));
            b(vzo0Var, tlsVar, btsVar, i3);
            oeb1.c(btsVar, ljs0.e(c530Var, 8.0f));
            d(vzo0Var, tlsVar, btsVar, i3);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new izo0(vzo0Var, tlsVar, i, 0);
        }
    }

    public static final void b(vzo0 vzo0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(830082041);
        int i2 = (btsVar.k(vzo0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new lao0(8, tlsVar);
                btsVar.o0(Q);
            }
            phb1.b((sls) Q, ljs0.c(c530.a, 1.0f), false, null, null, wwg.S(1200219610, true, new jzo0(vzo0Var, i3), btsVar), null, null, null, btsVar, 196656, 988);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new izo0(vzo0Var, tlsVar, i, 1);
        }
    }

    public static final void c(vzo0 vzo0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1788650470);
        int i2 = (btsVar.k(vzo0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            String str = vzo0Var.e;
            if (str.length() > 0) {
                btsVar.e0(-1972943752);
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
                scd.a.getClass();
                v0b1.a(a2, null, null, scd.b, null, null, null, mhe.e, 0.0f, 0, btsVar, 12585984, 886);
                btsVar.t(true);
                btsVar.t(false);
            } else {
                btsVar.e0(-1972601636);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzo0(vzo0Var, i, 1);
        }
    }

    public static final void d(vzo0 vzo0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        aii0 v;
        gzo0 gzo0Var;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(441635233);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(vzo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.e(tlsVar) ? 32 : 16;
        }
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            uzo0 uzo0Var = vzo0Var.h;
            if (uzo0Var == null) {
                v = btsVar2.v();
                if (v == null) {
                    return;
                } else {
                    gzo0Var = new gzo0(vzo0Var, tlsVar, i, 3);
                }
            } else {
                CharSequence charSequence = uzo0Var.a;
                if (charSequence.length() == 0) {
                    v = btsVar2.v();
                    if (v == null) {
                        return;
                    } else {
                        gzo0Var = new gzo0(vzo0Var, tlsVar, i, 4);
                    }
                } else {
                    String str = uzo0Var.b;
                    if (str.length() == 0) {
                        v = btsVar2.v();
                        if (v == null) {
                            return;
                        } else {
                            gzo0Var = new gzo0(vzo0Var, tlsVar, i, 0);
                        }
                    } else {
                        String obj = charSequence.toString();
                        ety0 ety0Var = xya1.e(btsVar2).i.a;
                        AppColor$Palette appColor$Palette = AppColor$Palette.TextMinor;
                        boolean k = btsVar2.k(str) | ((i2 & 112) == 32);
                        Object Q = btsVar2.Q();
                        if (k || Q == did.a) {
                            Q = new a91(tlsVar, str, 14);
                            btsVar2.o0(Q);
                        }
                        btsVar = btsVar2;
                        jeb1.f(obj, q791.d(c530.a, false, null, null, (sls) Q, 15), appColor$Palette, 0L, 0L, rly0.c, new sjy0(3), 0L, 0, false, 0, 0, null, ety0Var, btsVar, 1573248, 0, 16184);
                    }
                }
            }
            v.d = gzo0Var;
        }
        btsVar = btsVar2;
        btsVar.Y();
        v = btsVar.v();
        if (v != null) {
            gzo0Var = new gzo0(vzo0Var, tlsVar, i, 1);
            v.d = gzo0Var;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v8 */
    public static final void e(final vzo0 vzo0Var, fid fidVar, final int i) {
        int i2;
        final vzo0 vzo0Var2;
        final ?? r14;
        final int i3;
        bts btsVar;
        boolean z;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2099186466);
        int i4 = btsVar2.S ? -btsVar2.I.v : btsVar2.G.i;
        if ((i & 6) == 0) {
            i2 = i | (btsVar2.k(vzo0Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        final int i5 = 0;
        if (btsVar2.V(i2 & 1, (i2 & 3) != 2)) {
            lhl0 a2 = khl0.a(lr20.a, x4c.F, btsVar2, 48);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar2, c530Var);
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
            qje.W(btsVar2, d.f, a2);
            qje.W(btsVar2, d.e, o);
            qje.W(btsVar2, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar2, d.h);
            qje.W(btsVar2, d.d, d);
            btsVar2.e0(-406217272);
            int i6 = i4;
            CharSequence charSequence = vzo0Var.c;
            szo0 szo0Var = vzo0Var.d;
            qgy.b(charSequence, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).f.c, null, btsVar2, 0, 0, 12286);
            bts btsVar3 = btsVar2;
            if (szo0Var == null) {
                btsVar3.x(i6);
                aii0 v = btsVar3.v();
                if (v != null) {
                    v.d = new wls() { // from class: hzo0
                        @Override // defpackage.wls
                        public final Object invoke(Object obj, Object obj2) {
                            int i7 = i5;
                            zy11 zy11Var = zy11.a;
                            int i8 = i;
                            vzo0 vzo0Var3 = vzo0Var;
                            fid fidVar2 = (fid) obj;
                            ((Integer) obj2).intValue();
                            switch (i7) {
                                case 0:
                                    lzo0.e(vzo0Var3, fidVar2, vng.O(i8 | 1));
                                    break;
                                default:
                                    lzo0.e(vzo0Var3, fidVar2, vng.O(i8 | 1));
                                    break;
                            }
                            return zy11Var;
                        }
                    };
                    return;
                }
                return;
            }
            vzo0Var2 = vzo0Var;
            CharSequence charSequence2 = szo0Var.a;
            wp2 wp2Var = szo0Var.b;
            if (charSequence2.length() > 0) {
                btsVar3.e0(-406078889);
                oeb1.c(btsVar3, ljs0.q(c530Var, 4.0f));
                f530 o2 = an91.o(c530Var, 0.0f, 0.0f, 0.0f, 2.0f, 7);
                mm4 mm4Var = new mm4(wp2Var, new up2(zp2.a), new am4(new up2(ldc.b(tje.n(wp2Var, btsVar3), 0.2f, 0.0f, 0.0f, 0.0f, 14))));
                ety0 ety0Var = xya1.e(btsVar3).h.b;
                BadgeSize badgeSize = BadgeSize.M;
                l690 d2 = an91.d(6.0f, 0.0f, 6.0f, 2.0f, 2);
                z = true;
                a S = wwg.S(363410840, true, new jrn0(charSequence2, ety0Var, 2), btsVar3);
                i3 = i;
                wk4.a(badgeSize, mm4Var, d2, o2, S, btsVar3, 200070);
                btsVar3.t(false);
            } else {
                i3 = i;
                z = true;
                btsVar3.e0(-405697372);
                btsVar3.t(false);
            }
            btsVar3.t(false);
            btsVar3.t(z);
            btsVar = btsVar3;
            r14 = z;
        } else {
            vzo0Var2 = vzo0Var;
            r14 = 1;
            i3 = i;
            btsVar2.Y();
            btsVar = btsVar2;
        }
        aii0 v2 = btsVar.v();
        if (v2 != null) {
            v2.d = new wls() { // from class: hzo0
                @Override // defpackage.wls
                public final Object invoke(Object obj, Object obj2) {
                    int i7 = r14;
                    zy11 zy11Var = zy11.a;
                    int i8 = i3;
                    vzo0 vzo0Var3 = vzo0Var2;
                    fid fidVar2 = (fid) obj;
                    ((Integer) obj2).intValue();
                    switch (i7) {
                        case 0:
                            lzo0.e(vzo0Var3, fidVar2, vng.O(i8 | 1));
                            break;
                        default:
                            lzo0.e(vzo0Var3, fidVar2, vng.O(i8 | 1));
                            break;
                    }
                    return zy11Var;
                }
            };
        }
    }

    public static final void f(vzo0 vzo0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1105891998);
        int i2 = (btsVar.k(vzo0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = (i2 & 112) == 32;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new lao0(9, tlsVar);
                btsVar.o0(Q);
            }
            xlb1.a((sls) Q, ljs0.c(c530.a, 1.0f), false, null, null, wwg.S(1664464367, true, new jzo0(vzo0Var, i3), btsVar), null, null, null, btsVar, 196656, 988);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new izo0(vzo0Var, tlsVar, i, 2);
        }
    }

    public static final void g(vzo0 vzo0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1740287334);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(vzo0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            rzo.b(null, "default", wwg.S(-294913678, true, new bpn0(tlsVar, 9, vzo0Var), btsVar), btsVar, 3456, 3);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gzo0(vzo0Var, tlsVar, i, 2);
        }
    }

    public static final void h(vzo0 vzo0Var, f530 f530Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1045417820);
        dmw0 dmw0Var = btsVar.a;
        int i2 = (btsVar.k(vzo0Var) ? 4 : 2) | i | (btsVar.k(f530Var) ? 32 : 16);
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
            qgy.b(vzo0Var.a, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.d(btsVar).f.d, null, btsVar, 0, 0, 12286);
            btsVar = btsVar;
            if (vzo0Var.b.length() > 0) {
                btsVar.e0(112889087);
                qgy.b(vzo0Var.b, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 0, 0, null, null, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 0, 16374);
                btsVar = btsVar;
                btsVar.t(false);
            } else {
                btsVar.e0(112968850);
                btsVar.t(false);
            }
            btsVar.t(true);
            e(vzo0Var, btsVar, i2 & 14);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(vzo0Var, f530Var, i, 29);
        }
    }

    public static final void i(vzo0 vzo0Var, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-879447414);
        int i2 = (btsVar.k(vzo0Var) ? 4 : 2) | i;
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
            h(vzo0Var, n.d(btsVar, d, d.d, 1.0f, true), btsVar, i3);
            c(vzo0Var, btsVar, i3);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzo0(vzo0Var, i, 0);
        }
    }
}
