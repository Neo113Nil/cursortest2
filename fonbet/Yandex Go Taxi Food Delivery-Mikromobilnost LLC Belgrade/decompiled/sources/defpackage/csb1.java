package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.compose.button.ButtonStyle;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import java.util.concurrent.CancellationException;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class csb1 {
    public static final void a(f530 f530Var, fid fidVar, int i) {
        c36 e;
        c36 e2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(998194175);
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            f530 n = an91.n(f530Var, 16.0f, 8.0f, 16.0f, 8.0f);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            int i2 = e0h0.ic_point_24;
            AppColor$Palette appColor$Palette = AppColor$Palette.Line;
            pa90 a2 = wya1.a(i2, 0, btsVar);
            if (appColor$Palette == null) {
                btsVar.e0(-1411607277);
                btsVar.t(false);
                e = null;
            } else {
                btsVar.e0(-1411607276);
                e = tse0.e(tje.n(appColor$Palette, btsVar), 5, btsVar, false);
            }
            c530 c530Var = c530.a;
            o4b1.b(a2, null, c530Var, null, null, 0.0f, e, btsVar, 8, 56);
            pi6.a(bzk0.c(an91.o(ljs0.e(c530Var, 4.0f).k(new x2y(1.0f, true)), 4.0f, 0.0f, 4.0f, 0.0f, 10), appColor$Palette, cyk0.c(4.0f)), btsVar, 0);
            pa90 a3 = wya1.a(e0h0.ic_point_24, 0, btsVar);
            if (appColor$Palette == null) {
                btsVar.e0(-1411607277);
                btsVar.t(false);
                e2 = null;
            } else {
                btsVar.e0(-1411607276);
                e2 = tse0.e(tje.n(appColor$Palette, btsVar), 5, btsVar, false);
            }
            o4b1.b(a3, null, c530Var, null, null, 0.0f, e2, btsVar, 8, 56);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new orq0(f530Var, i, 2);
        }
    }

    public static final void b(boolean z, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, boolean z2, f530 f530Var, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-539569875);
        dmw0 dmw0Var = btsVar2.a;
        if ((i & 6) == 0) {
            i2 = (btsVar2.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar2.k(charSequence) : btsVar2.e(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? btsVar2.k(charSequence2) : btsVar2.e(charSequence2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= (i & 4096) == 0 ? btsVar2.k(charSequence3) : btsVar2.e(charSequence3) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar2.a(z2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar2.k(f530Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= btsVar2.e(slsVar) ? 1048576 : 524288;
        }
        int i3 = i2;
        if (btsVar2.V(i3 & 1, (i3 & 599187) != 599186)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            lhl0 a = khl0.a(lr20.f, x4c.F, btsVar2, 54);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o = btsVar2.o();
            f530 d = b.d(btsVar2, c);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
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
            tls tlsVar = d.h;
            qje.M(btsVar2, tlsVar);
            wls wlsVar4 = d.d;
            qje.W(btsVar2, wlsVar4, d);
            c530 c530Var = c530.a;
            f530 k = an91.o(c530Var, 0.0f, 4.0f, 0.0f, 0.0f, 13).k(new x2y(1.0f, false));
            sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode2 = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d2 = b.d(btsVar2, k);
            btsVar2.i0();
            if (btsVar2.S) {
                btsVar2.n(slsVar2);
            } else {
                btsVar2.r0();
            }
            qje.W(btsVar2, wlsVar, a2);
            qje.W(btsVar2, wlsVar2, o2);
            vfc.v(hashCode2, btsVar2, wlsVar3, btsVar2, tlsVar);
            qje.W(btsVar2, wlsVar4, d2);
            qgy.b(charSequence, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar2).g.b, null, btsVar2, (i3 >> 3) & 14, 0, 12286);
            oeb1.c(btsVar2, ljs0.e(c530Var, 4.0f));
            int i4 = i3 >> 6;
            qgy.b(charSequence2, null, null, AppColor$Palette.TextMinor, 0L, 0L, null, 0L, 0, 2, 0, xya1.e(btsVar2).h.a, null, btsVar2, (i4 & 14) | HProv.ALG_TYPE_SECURECHANNEL, 6, 11254);
            btsVar = btsVar2;
            btsVar.t(true);
            oeb1.c(btsVar, ljs0.q(c530Var, 8.0f));
            d(z, charSequence3, z2, slsVar, btsVar, (i3 & 14) | (i4 & 112) | (i4 & 896) | ((i3 >> 9) & 7168));
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new vx20(z, charSequence, charSequence2, charSequence3, z2, f530Var, slsVar, i);
        }
    }

    public static final void c(bb01 bb01Var, sls slsVar, sls slsVar2, fid fidVar, int i) {
        wls wlsVar;
        wls wlsVar2;
        wls wlsVar3;
        byk0 byk0Var;
        c530 c530Var;
        tls tlsVar;
        wls wlsVar4;
        float f;
        so5 so5Var;
        int i2;
        g43 g43Var;
        sls slsVar3;
        int i3;
        bb01 bb01Var2 = bb01Var;
        boolean z = bb01Var2.k;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1532696713);
        dmw0 dmw0Var = btsVar.a;
        int i4 = i | (btsVar.k(bb01Var2) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16) | (btsVar.e(slsVar2) ? 256 : 128);
        if (btsVar.V(i4 & 1, (i4 & 147) != 146)) {
            byk0 c = cyk0.c(24.0f);
            c530 c530Var2 = c530.a;
            f530 c2 = ljs0.c(c530Var2, 1.0f);
            za01 za01Var = bb01Var2.l;
            f530 k = tra1.b(c2, z ? 1.0f : 0.64f).k(za01Var != null ? bzk0.c(c530Var2, za01Var.b, c) : c530Var2);
            so5 so5Var2 = x4c.G;
            g43 g43Var2 = lr20.c;
            sic a = qic.a(g43Var2, so5Var2, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar4 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar4);
            } else {
                btsVar.r0();
            }
            wls wlsVar5 = d.f;
            qje.W(btsVar, wlsVar5, a);
            wls wlsVar6 = d.e;
            qje.W(btsVar, wlsVar6, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar7 = d.g;
            qje.W(btsVar, wlsVar7, valueOf);
            tls tlsVar2 = d.h;
            qje.M(btsVar, tlsVar2);
            wls wlsVar8 = d.d;
            qje.W(btsVar, wlsVar8, d);
            if (za01Var == null || !z) {
                wlsVar = wlsVar5;
                wlsVar2 = wlsVar8;
                wlsVar3 = wlsVar6;
                byk0Var = c;
                c530Var = c530Var2;
                tlsVar = tlsVar2;
                wlsVar4 = wlsVar7;
                f = 1.0f;
                so5Var = so5Var2;
                i2 = i4;
                g43Var = g43Var2;
                slsVar3 = slsVar4;
                i3 = 0;
                btsVar.e0(-631760273);
                btsVar.t(false);
            } else {
                btsVar.e0(-632015124);
                byk0Var = c;
                i2 = i4;
                wlsVar = wlsVar5;
                wlsVar3 = wlsVar6;
                wlsVar2 = wlsVar8;
                c530Var = c530Var2;
                slsVar3 = slsVar4;
                wlsVar4 = wlsVar7;
                so5Var = so5Var2;
                tlsVar = tlsVar2;
                g43Var = g43Var2;
                f = 1.0f;
                i3 = 0;
                qgy.b(za01Var.a, null, an91.m(ljs0.c(c530Var2, 1.0f), 0.0f, 5.0f, 1), null, uh6.E(13), 0L, new sjy0(3), 0L, 0, 0, 0, xya1.e(btsVar).h.b, null, btsVar, 24960, 0, 12138);
                btsVar = btsVar;
                btsVar.t(false);
            }
            byk0 byk0Var2 = byk0Var;
            f530 l = ymb1.l(ljs0.c(c530Var, f), byk0Var2);
            bb01Var2 = bb01Var;
            boolean z2 = bb01Var2.k;
            int i5 = ((i2 & 112) == 32 ? 1 : i3) | ((i2 & 14) == 4 ? 1 : i3);
            Object Q = btsVar.Q();
            if (i5 != 0 || Q == did.a) {
                Q = new i5y0(19, bb01Var2, slsVar);
                btsVar.o0(Q);
            }
            f530 o2 = an91.o(ofb1.b(bzk0.c(q791.d(l, z2, null, null, (sls) Q, 14), AppColor$Palette.BgMinor, byk0Var2), bb01Var2.j, null, 14), 0.0f, 12.0f, 0.0f, 12.0f, 5);
            sic a2 = qic.a(g43Var, so5Var, btsVar, i3);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar3, o3);
            vfc.v(hashCode2, btsVar, wlsVar4, btsVar, tlsVar);
            qje.W(btsVar, wlsVar2, d2);
            e(bb01Var2.a, bb01Var2.b, bb01Var2.c, bb01Var2.d, bb01Var2.e, btsVar, 0);
            a(c530Var, btsVar, 6);
            bts btsVar2 = btsVar;
            b(bb01Var2.k, bb01Var2.f, bb01Var2.g, bb01Var2.h, bb01Var2.i, an91.o(c530Var, 16.0f, 0.0f, 12.0f, 0.0f, 10), slsVar2, btsVar2, ((i2 << 12) & 3670016) | ImageMetadata.EDGE_MODE);
            btsVar = btsVar2;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nvs0(bb01Var2, slsVar, slsVar2, i, 21);
        }
    }

    public static final void d(boolean z, CharSequence charSequence, boolean z2, sls slsVar, fid fidVar, int i) {
        int i2;
        boolean z3;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1476389811);
        if ((i & 6) == 0) {
            i2 = (btsVar.a(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? btsVar.k(charSequence) : btsVar.e(charSequence) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z2) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            if (z2) {
                btsVar.e0(1631441045);
                int i3 = i2;
                d17.c(ljs0.b(tra1.b(c530Var, z ? 1.0f : 0.5f), 100.0f, 0.0f, 2), z, ButtonSize.M, ButtonStyle.Main, null, slsVar, wwg.S(-1855504967, true, new or9(15, charSequence), btsVar), btsVar, (458752 & (i3 << 6)) | ((i3 << 3) & 112) | 1576320, 16);
                btsVar.t(false);
            } else {
                int i4 = i2;
                if (z2) {
                    throw unr0.y(-1471394280, btsVar, false);
                }
                btsVar.e0(1631988102);
                boolean z4 = charSequence.length() == 0;
                if (z4) {
                    btsVar.e0(1632008283);
                    pi6.a(ljs0.a(c530Var, 100.0f, 48.0f), btsVar, 6);
                    btsVar.t(false);
                    z3 = false;
                } else {
                    if (z4) {
                        throw unr0.y(-1471375876, btsVar, false);
                    }
                    btsVar.e0(-1471367948);
                    boolean z5 = (i4 & 112) == 32 || ((i4 & 64) != 0 && btsVar.e(charSequence));
                    Object Q = btsVar.Q();
                    if (z5 || Q == did.a) {
                        Q = new oau(7, charSequence);
                        btsVar.o0(Q);
                    }
                    f530 o = an91.o(ljs0.e(an91.m(ljs0.b(fnq0.b(c530Var, false, (tls) Q), 100.0f, 0.0f, 2), 4.0f, 0.0f, 2), 48.0f), 0.0f, 0.0f, 0.0f, 8.0f, 7);
                    z910 d = pi6.d(x4c.C, false);
                    int hashCode = Long.hashCode(btsVar.T);
                    r1b0 o2 = btsVar.o();
                    f530 d2 = b.d(btsVar, o);
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
                    qje.W(btsVar, d.f, d);
                    qje.W(btsVar, d.e, o2);
                    qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                    qje.M(btsVar, d.h);
                    qje.W(btsVar, d.d, d2);
                    qgy.b(charSequence, null, null, null, 0L, 0L, null, 0L, 0, 0, 0, xya1.e(btsVar).g.b, null, btsVar, (i4 >> 3) & 14, 0, 12286);
                    btsVar = btsVar;
                    btsVar.t(true);
                    z3 = false;
                    btsVar.t(false);
                }
                btsVar.t(z3);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fgb(i, slsVar, charSequence, z, z2);
        }
    }

    public static final void e(CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, CharSequence charSequence4, CharSequence charSequence5, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1707309729);
        int i2 = i | (btsVar.k(charSequence) ? 4 : 2) | (btsVar.k(charSequence2) ? 32 : 16) | (btsVar.k(charSequence3) ? 256 : 128) | (btsVar.k(charSequence4) ? 2048 : 1024) | (btsVar.k(charSequence5) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            ydb1.a(null, null, wwg.S(-639610642, true, new vg0(charSequence, charSequence2, charSequence5, charSequence3, charSequence4, 16), btsVar), null, null, null, null, false, btsVar, 384, 251);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0(charSequence, charSequence2, charSequence3, charSequence4, charSequence5, i, 28);
        }
    }

    public static final boolean f(ps50 ps50Var) {
        int i;
        return (ps50Var instanceof ls50) && 400 <= (i = ((ls50) ps50Var).a) && i < 500;
    }

    public static final boolean g(ps50 ps50Var) {
        if (ps50Var instanceof ms50) {
            return true;
        }
        if (!(ps50Var instanceof ls50)) {
            return (ps50Var instanceof ks50) || (ps50Var instanceof is50);
        }
        int i = ((ls50) ps50Var).a;
        return 400 <= i && i < 500;
    }

    public static final void h(Throwable th) {
        if (th instanceof CancellationException) {
            throw th;
        }
    }
}
