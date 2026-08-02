package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.theme.AppThemeType;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class nwa1 {
    public static final void a(iwl0 iwl0Var, tls tlsVar, f530 f530Var, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-307557206);
        dmw0 dmw0Var = btsVar2.a;
        int i2 = i | (btsVar2.k(iwl0Var) ? 4 : 2) | (btsVar2.e(tlsVar) ? 32 : 16) | (btsVar2.k(f530Var) ? 256 : 128);
        if (btsVar2.V(i2 & 1, (i2 & 147) != 146)) {
            sic a = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, f530Var);
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
            qje.W(btsVar2, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar2, wlsVar3, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar2, tlsVar2);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            d(iwl0Var, btsVar2, i2 & 14);
            g(iwl0Var.a, btsVar2, 0);
            c530 c530Var = c530.a;
            f530 g = ljs0.g(ljs0.c(c530Var, 1.0f), 73.0f, 0.0f, 2);
            uo5 uo5Var = x4c.b;
            z910 d2 = pi6.d(uo5Var, false);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d3 = b.d(btsVar2, g);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, d2);
            qje.W(btsVar2, wlsVar2, o2);
            vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar2);
            qje.W(btsVar2, wlsVar4, d3);
            jeb1.f(iwl0Var.b, cj6.a.a(an91.o(c530Var, 0.0f, 0.0f, 0.0f, 16.0f, 7), uo5Var), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.d(btsVar2).g.a, btsVar2, 384, 0, 16376);
            btsVar2.t(true);
            hwl0 hwl0Var = iwl0Var.e;
            fwl0 fwl0Var = hwl0Var instanceof fwl0 ? (fwl0) hwl0Var : null;
            String str = fwl0Var != null ? fwl0Var.a : null;
            if (str == null) {
                str = "";
            }
            String str2 = str;
            Object Q = btsVar2.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                Q = f.j(iwl0Var.d);
                btsVar2.o0(Q);
            }
            oz40 oz40Var = (oz40) Q;
            f530 c = ljs0.c(c530Var, 1.0f);
            String str3 = (String) oz40Var.getValue();
            String str4 = iwl0Var.c;
            boolean z = (i2 & 112) == 32;
            Object Q2 = btsVar2.Q();
            if (z || Q2 == o430Var) {
                Q2 = new d0(oz40Var, tlsVar, 12);
                btsVar2.o0(Q2);
            }
            rcb1.a(str3, (tls) Q2, c, false, null, null, null, null, str4, null, null, null, null, str2, null, false, 0.0f, null, null, null, null, true, 0, 0, null, null, null, null, null, null, btsVar2, 384, 384, 0, 2143272440);
            btsVar = btsVar2;
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new qeg0(iwl0Var, tlsVar, f530Var, i, 13);
        }
    }

    public static final void b(bwl0 bwl0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        boolean z;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1401576341);
        int i3 = (btsVar.k(bwl0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            f530 l = an91.l(i9a1.d(i9a1.c(ljs0.c(c530.a, 1.0f))), 8.0f, 8.0f);
            ButtonSize buttonSize = ButtonSize.L;
            boolean z2 = false;
            ButtonStyle buttonStyle = ButtonStyle.Main;
            if (!bwl0Var.b || bwl0Var.a) {
                i2 = 32;
                z = false;
            } else {
                i2 = 32;
                z = true;
            }
            if ((i3 & 112) == i2) {
                z2 = true;
            }
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new v6k0(19, tlsVar);
                btsVar.o0(Q);
            }
            d17.c(l, z, buttonSize, buttonStyle, null, (sls) Q, wwg.S(1722109561, true, new pdf0(20, bwl0Var), btsVar), btsVar, 1576320, 16);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(bwl0Var, tlsVar, i, 6);
        }
    }

    public static final void c(dwl0 dwl0Var, tls tlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-907626499);
        int i2 = (btsVar.k(dwl0Var) ? 4 : 2) | i | (btsVar.e(tlsVar) ? 32 : 16);
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (dwl0Var instanceof bwl0) {
            btsVar.e0(-350699743);
            b((bwl0) dwl0Var, tlsVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        } else {
            if (!(dwl0Var instanceof cwl0)) {
                throw unr0.y(-350701304, btsVar, false);
            }
            btsVar.e0(-350697402);
            e((cwl0) dwl0Var, tlsVar, btsVar, i2 & HProv.PP_DELETE_SAVED_PASSWD);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(dwl0Var, tlsVar, i, 5);
        }
    }

    public static final void d(iwl0 iwl0Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1569580226);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(iwl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), 64.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, e);
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
            sy2.a(btsVar);
            AppThemeType a = srt.a(btsVar);
            boolean c = btsVar.c(a.ordinal());
            Object Q = btsVar.Q();
            if (c || Q == did.a) {
                Q = Integer.valueOf(a == AppThemeType.Light ? iwl0Var.g.a : iwl0Var.g.b);
                btsVar.o0(Q);
            }
            o4b1.b(wya1.a(((Number) Q).intValue(), 0, btsVar), null, cj6.a.a(ljs0.e(c530Var, 26.0f), x4c.y), null, null, 0.0f, null, btsVar, 56, 120);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gaf0(iwl0Var, i, i3);
        }
    }

    public static final void e(final cwl0 cwl0Var, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        final cwl0 cwl0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(812479607);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(cwl0Var) ? 4 : 2) | (btsVar.e(tlsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 l = an91.l(i9a1.d(i9a1.c(ljs0.c(c530Var, 1.0f))), 8.0f, 8.0f);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, l);
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
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), ButtonSize.L.getSize());
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
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d3);
            jeb1.f(cwl0Var.a, cj6.a.a(c530Var, x4c.y), AppColor$Palette.Error, 0L, 0L, null, new sjy0(3), 0L, 0, false, 1, 0, null, null, btsVar, 384, 48, 30584);
            btsVar = btsVar;
            n.y(btsVar, true, c530Var, 8.0f, btsVar);
            f530 c = ljs0.c(c530Var, 1.0f);
            ButtonStyle buttonStyle = ButtonStyle.Minor;
            int i3 = i2 & 112;
            boolean z = i3 == 32;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z || Q == o430Var) {
                Q = new v6k0(17, tlsVar);
                btsVar.o0(Q);
            }
            final int i4 = 0;
            tlsVar2 = tlsVar;
            d17.c(c, false, null, buttonStyle, null, (sls) Q, wwg.S(-1658813659, true, new zls() { // from class: tvl0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i5 = i4;
                    zy11 zy11Var = zy11.a;
                    cwl0 cwl0Var3 = cwl0Var;
                    switch (i5) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                jeb1.f(cwl0Var3.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar2, 0, 0, 32766);
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
                                jeb1.f(cwl0Var3.c, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar3, 0, 0, 32766);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, 1575942, 22);
            f530 e2 = n.e(c530Var, 8.0f, btsVar, c530Var, 1.0f);
            ButtonStyle buttonStyle2 = ButtonStyle.Main;
            boolean z2 = i3 == 32;
            Object Q2 = btsVar.Q();
            if (z2 || Q2 == o430Var) {
                Q2 = new v6k0(18, tlsVar2);
                btsVar.o0(Q2);
            }
            final int i5 = 1;
            cwl0Var2 = cwl0Var;
            d17.c(e2, false, null, buttonStyle2, null, (sls) Q2, wwg.S(-1019747442, true, new zls() { // from class: tvl0
                @Override // defpackage.zls
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    int i52 = i5;
                    zy11 zy11Var = zy11.a;
                    cwl0 cwl0Var3 = cwl0Var2;
                    switch (i52) {
                        case 0:
                            fid fidVar2 = (fid) obj2;
                            int intValue = ((Integer) obj3).intValue();
                            bts btsVar2 = (bts) fidVar2;
                            if (!btsVar2.V(intValue & 1, (intValue & 17) != 16)) {
                                btsVar2.Y();
                                break;
                            } else {
                                jeb1.f(cwl0Var3.b, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar2, 0, 0, 32766);
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
                                jeb1.f(cwl0Var3.c, null, null, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, null, btsVar3, 0, 0, 32766);
                                break;
                            }
                    }
                    return zy11Var;
                }
            }, btsVar), btsVar, 1575942, 22);
            btsVar.t(true);
        } else {
            tlsVar2 = tlsVar;
            cwl0Var2 = cwl0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t7l0(cwl0Var2, tlsVar2, i, 4);
        }
    }

    public static final void f(iwl0 iwl0Var, tls tlsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1839268005);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(iwl0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.e(tlsVar) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new bgc(12);
                btsVar.o0(Q);
            }
            gya1.d(false, (sls) Q, btsVar, 48, 1);
            qy20.a(null, v2o.a, ymo.a, false, wwg.S(-824356615, true, new u5(9, iwl0Var, tlsVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 9);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(iwl0Var, tlsVar, i, 23);
        }
    }

    public static final void g(String str, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1982732048);
        int i2 = i | (btsVar.k(str) ? 4 : 2);
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 g = ljs0.g(ljs0.c(c530Var, 1.0f), 65.0f, 0.0f, 2);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, g);
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
            jeb1.f(str, cj6.a.a(an91.m(c530Var, 0.0f, 12.0f, 1), x4c.x), AppColor$Palette.Text, 0L, 0L, null, null, 0L, 0, false, 0, 0, null, xya1.e(btsVar).e.e, btsVar, (i2 & 14) | 384, 0, 16376);
            btsVar = btsVar;
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fzv(str, i, 26);
        }
    }

    public static final double h(double d) {
        return (d / 180.0d) * 3.141592653589793d;
    }

    public static final long i(long j, boolean z) {
        if (!z) {
            return j;
        }
        uh6.g(j);
        return uh6.K((float) (sty0.c(j) * 0.7d), 1095216660480L & j);
    }

    public static int j(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        if (i == 3) {
            return 4;
        }
        if (i != 4) {
            return i != 5 ? 0 : 6;
        }
        return 5;
    }
}
