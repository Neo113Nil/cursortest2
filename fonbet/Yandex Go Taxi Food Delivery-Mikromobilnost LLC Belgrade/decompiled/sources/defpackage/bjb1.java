package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.modal.bottomsheet.c;
import defpackage.aja;
import defpackage.an91;
import defpackage.bja;
import defpackage.bjb1;
import defpackage.bts;
import defpackage.c530;
import defpackage.cma1;
import defpackage.did;
import defpackage.f530;
import defpackage.fid;
import defpackage.j690;
import defpackage.ljs0;
import defpackage.ohd;
import defpackage.pi6;
import defpackage.qje;
import defpackage.r1b0;
import defpackage.s1h0;
import defpackage.sls;
import defpackage.tls;
import defpackage.unr0;
import defpackage.wls;
import defpackage.x4c;
import defpackage.xia;
import defpackage.yia;
import defpackage.z910;
import defpackage.zia;
import defpackage.zpn;
import defpackage.zy11;
import jason.statham.interpreter.error.a;

/* loaded from: classes11.dex */
public abstract class bjb1 {
    public static au2 a;

    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var, CharSequence charSequence) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-913199665);
        int i2 = (btsVar.k(charSequence) ? 4 : 2) | i | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.k(f530Var) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            ohb1.b(f530Var, false, ButtonSize.L, slsVar, wwg.S(-473558468, true, new or9(3, charSequence), btsVar), btsVar, ((i2 >> 6) & 14) | 24960 | ((i2 << 6) & 7168), 2);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new j9a(charSequence, slsVar, f530Var, i, 4);
        }
    }

    public static final void b(bja bjaVar, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1934208083);
        int i2 = (btsVar.k(bjaVar) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        int i3 = 1;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 d = i9a1.d(ljs0.c(an91.k(c530.a, 8.0f), 1.0f));
            boolean z = bjaVar instanceof aja;
            o430 o430Var = did.a;
            if (z) {
                btsVar.e0(712027343);
                CharSequence charSequence = ((aja) bjaVar).c;
                boolean z2 = (i2 & 112) == 32;
                Object Q = btsVar.Q();
                if (z2 || Q == o430Var) {
                    Q = new fv9(8, tlsVar);
                    btsVar.o0(Q);
                }
                a(0, btsVar, (sls) Q, d, charSequence);
                btsVar.t(false);
            } else if (bjaVar instanceof yia) {
                btsVar.e0(712234578);
                CharSequence charSequence2 = ((yia) bjaVar).c;
                boolean z3 = (i2 & 112) == 32;
                Object Q2 = btsVar.Q();
                if (z3 || Q2 == o430Var) {
                    Q2 = new fv9(9, tlsVar);
                    btsVar.o0(Q2);
                }
                a(0, btsVar, (sls) Q2, d, charSequence2);
                btsVar.t(false);
            } else if (bjaVar instanceof zia) {
                btsVar.e0(-946849481);
                btsVar.t(false);
            } else {
                if (!(bjaVar instanceof xia)) {
                    throw unr0.y(-946863529, btsVar, false);
                }
                btsVar.e0(-946848777);
                btsVar.t(false);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cia(bjaVar, tlsVar, i, i3);
        }
    }

    public static final void c(CharSequence charSequence, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(2126447358);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), 0.0f, 228.0f, 1);
            sic a2 = qic.a(lr20.c, x4c.H, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m);
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
            ffb1.d(null, null, null, btsVar, 0, 7);
            oeb1.c(btsVar, ljs0.e(c530Var, 26.0f));
            qgy.b(charSequence, null, ljs0.c(c530Var, 1.0f), null, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar).f.c, null, btsVar, (i2 & 14) | 384, 0, 12154);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new un1(i, 6, charSequence);
        }
    }

    public static final void d(int i, CharSequence charSequence, CharSequence charSequence2, fid fidVar, int i2) {
        int i3;
        CharSequence charSequence3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(802685192);
        dmw0 dmw0Var = btsVar.a;
        int i4 = i2 | (btsVar.c(i) ? 4 : 2) | (btsVar.k(charSequence) ? 32 : 16) | (btsVar.k(charSequence2) ? 256 : 128);
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 c = ljs0.c(c530Var, 1.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
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
            so5 so5Var = x4c.H;
            f530 o2 = an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 80.0f, 0.0f, 0.0f, 13);
            sic a2 = qic.a(lr20.c, so5Var, btsVar, 48);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            oeb1.c(btsVar, ljs0.e(c530Var, 20.0f));
            ety0 ety0Var = xya1.b(btsVar).c;
            AppColor$Palette appColor$Palette = AppColor$Palette.Text;
            qgy.b(charSequence, null, an91.m(c530Var, 16.0f, 0.0f, 2), appColor$Palette, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, ety0Var, null, btsVar, ((i4 >> 3) & 14) | 3456, 0, 12146);
            btsVar = btsVar;
            if (charSequence2 == null || evu0.J(charSequence2)) {
                charSequence3 = charSequence2;
                btsVar.e0(536318398);
                btsVar.t(false);
            } else {
                tse0.s(btsVar, 536030098, c530Var, 8.0f, btsVar);
                qgy.b(charSequence2, null, an91.m(c530Var, 16.0f, 0.0f, 2), appColor$Palette, 0L, 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar).g.a, null, btsVar, ((i4 >> 6) & 14) | 3456, 0, 12146);
                charSequence3 = charSequence2;
                btsVar = btsVar;
                btsVar.t(false);
            }
            ly3.B(c530Var, 12.0f, btsVar, true);
            i3 = i;
            o4b1.b(mt71.m(i3, i4 & 14, btsVar), null, sm91.f(ljs0.m(cj6.a.a(c530Var, x4c.c), 180.0f), 0.0f, -80.0f, 1), null, null, 0.0f, null, btsVar, 56, 120);
            btsVar.t(true);
        } else {
            i3 = i;
            charSequence3 = charSequence2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dia(i3, i2, charSequence, charSequence3);
        }
    }

    public static final void e(final bja bjaVar, final tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        sls slsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(2098374436);
        int i2 = (btsVar2.k(bjaVar) ? 4 : 2) | i | (btsVar2.e(tlsVar) ? 32 : 16);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            boolean z = bjaVar instanceof zia;
            if (z) {
                btsVar2.e0(-575982759);
                Object Q = btsVar2.Q();
                if (Q == did.a) {
                    Q = new bgc(12);
                    btsVar2.o0(Q);
                }
                gya1.d(false, (sls) Q, btsVar2, 48, 1);
                btsVar2.t(false);
            } else {
                btsVar2.e0(-575947202);
                btsVar2.t(false);
            }
            wg6 a2 = com.yandex.go.design.compose.modal.bottomsheet.b.a(false, 0.0f, null, false, null, null, null, null, btsVar2, 48, 0, 8189);
            if (z) {
                btsVar2.e0(-575702055);
                btsVar2.t(false);
                slsVar = null;
            } else {
                btsVar2.e0(-2096780085);
                slsVar = (sls) btsVar2.m(c3z.a);
                btsVar2.t(false);
            }
            lg6 c = qab1.c(a2, null, slsVar, btsVar2, 0, 2);
            f5d.a.getClass();
            c.a(null, a2, c, false, false, null, null, null, null, f5d.b, wwg.S(832677680, true, new sp5(16, bjaVar, tlsVar), btsVar2), wwg.S(-982667644, true, new bms() { // from class: com.yandex.go.chargers.passes.ui.purchase.a
                @Override // defpackage.bms
                public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
                    j690 j690Var = (j690) obj2;
                    fid fidVar2 = (fid) obj3;
                    int intValue = ((Integer) obj4).intValue();
                    if ((intValue & 48) == 0) {
                        intValue |= ((bts) fidVar2).k(j690Var) ? 32 : 16;
                    }
                    bts btsVar3 = (bts) fidVar2;
                    if (btsVar3.V(intValue & 1, (intValue & 145) != 144)) {
                        f530 c2 = ljs0.c(an91.j(c530.a, j690Var), 1.0f);
                        z910 d = pi6.d(x4c.b, false);
                        int hashCode = Long.hashCode(btsVar3.T);
                        r1b0 o = btsVar3.o();
                        f530 d2 = androidx.compose.ui.b.d(btsVar3, c2);
                        ohd.G1.getClass();
                        sls slsVar2 = androidx.compose.ui.node.d.b;
                        if (btsVar3.a == null) {
                            cma1.b0();
                            throw null;
                        }
                        btsVar3.i0();
                        if (btsVar3.S) {
                            btsVar3.n(slsVar2);
                        } else {
                            btsVar3.r0();
                        }
                        qje.W(btsVar3, androidx.compose.ui.node.d.f, d);
                        qje.W(btsVar3, androidx.compose.ui.node.d.e, o);
                        qje.W(btsVar3, androidx.compose.ui.node.d.g, Integer.valueOf(hashCode));
                        qje.M(btsVar3, androidx.compose.ui.node.d.h);
                        qje.W(btsVar3, androidx.compose.ui.node.d.d, d2);
                        bja bjaVar2 = bja.this;
                        if (bjaVar2 instanceof zia) {
                            btsVar3.e0(1758737348);
                            bjb1.c(((zia) bjaVar2).a, btsVar3, 0);
                            btsVar3.t(false);
                        } else if (bjaVar2 instanceof aja) {
                            btsVar3.e0(1758881560);
                            aja ajaVar = (aja) bjaVar2;
                            bjb1.d(s1h0.chargers_passes_buy_success_top, ajaVar.a, ajaVar.b, btsVar3, 0);
                            btsVar3.t(false);
                        } else if (bjaVar2 instanceof yia) {
                            btsVar3.e0(1759126491);
                            yia yiaVar = (yia) bjaVar2;
                            bjb1.d(s1h0.chargers_passes_buy_fail_top, yiaVar.a, yiaVar.b, btsVar3, 0);
                            btsVar3.t(false);
                        } else {
                            if (!(bjaVar2 instanceof xia)) {
                                throw unr0.y(-774551149, btsVar3, false);
                            }
                            btsVar3.e0(1759367485);
                            tls tlsVar2 = tlsVar;
                            boolean k = btsVar3.k(tlsVar2) | btsVar3.k(bjaVar2);
                            Object Q2 = btsVar3.Q();
                            if (k || Q2 == did.a) {
                                Q2 = new ChargersPassesPurchaseScreenKt$ChargersPassesPurchaseScreen$3$1$1$1(tlsVar2, bjaVar2, null);
                                btsVar3.o0(Q2);
                            }
                            zpn.e(btsVar3, (wls) Q2, bjaVar2);
                            btsVar3.t(false);
                        }
                        btsVar3.t(true);
                    } else {
                        btsVar3.Y();
                    }
                    return zy11.a;
                }
            }, btsVar2), btsVar2, 805309440, 54, 497);
            btsVar = btsVar2;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cia(bjaVar, tlsVar, i, 0);
        }
    }

    public static Number f(Object obj) {
        if (obj instanceof Long) {
            return Long.valueOf(Math.abs(((Number) obj).longValue()));
        }
        if (obj instanceof Double) {
            return Double.valueOf(Math.abs(((Number) obj).doubleValue()));
        }
        throw a.a("Function \"abs\" is not defined for ".concat(rhb1.e(obj)));
    }

    public static Number g(Object obj, Object obj2) {
        if (obj instanceof Double) {
            if (obj2 instanceof Double) {
                return Double.valueOf(Math.max(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (obj2 instanceof Long) {
                return Double.valueOf(Math.max(((Number) obj).doubleValue(), ((Number) obj2).longValue()));
            }
        }
        if (obj instanceof Long) {
            if (obj2 instanceof Double) {
                return Double.valueOf(Math.max(((Number) obj).longValue(), ((Number) obj2).doubleValue()));
            }
            if (obj2 instanceof Long) {
                return Long.valueOf(Math.max(((Number) obj).longValue(), ((Number) obj2).longValue()));
            }
        }
        throw a.a("Function \"max\" is not defined for " + rhb1.e(obj) + " and " + rhb1.e(obj2));
    }

    public static Number h(Object obj, Object obj2) {
        if (obj instanceof Double) {
            if (obj2 instanceof Double) {
                return Double.valueOf(Math.min(((Number) obj).doubleValue(), ((Number) obj2).doubleValue()));
            }
            if (obj2 instanceof Long) {
                return Double.valueOf(Math.min(((Number) obj).doubleValue(), ((Number) obj2).longValue()));
            }
        }
        if (obj instanceof Long) {
            if (obj2 instanceof Double) {
                return Double.valueOf(Math.min(((Number) obj).longValue(), ((Number) obj2).doubleValue()));
            }
            if (obj2 instanceof Long) {
                return Long.valueOf(Math.min(((Number) obj).longValue(), ((Number) obj2).longValue()));
            }
        }
        throw a.a("Function \"min\" is not defined for " + obj + " and " + obj2);
    }
}
