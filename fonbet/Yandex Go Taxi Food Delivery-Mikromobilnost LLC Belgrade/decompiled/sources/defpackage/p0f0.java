package defpackage;

import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.icon.IconSpotSize;
import com.yandex.go.design.compose.loading.b;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class p0f0 {
    public static final float a = IconSpotSize.L.getSize() + 16.0f;

    public static final void a(t7k0 t7k0Var, f530 f530Var, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-261460070);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(t7k0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if (!btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar.Y();
        } else if (t7k0Var.b) {
            btsVar.e0(1913856304);
            b.a(ljs0.n(f530Var, 131.0f, 42.0f), null, false, null, null, null, false, btsVar, 0, 254);
            btsVar.t(false);
        } else {
            btsVar.e0(1913965827);
            a7u0 a7u0Var = j.h;
            sb2.b(a7u0Var.a(new iwi(((fwi) btsVar.m(a7u0Var)).getDensity(), 1.0f)), wwg.S(408111870, true, new o990(7, t7k0Var, f530Var), btsVar), btsVar, 56);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new lt90(t7k0Var, f530Var, i, 8);
        }
    }

    public static final void b(f530 f530Var, t7k0 t7k0Var, sls slsVar, sls slsVar2, fid fidVar, int i) {
        t7k0 t7k0Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1064071251);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(t7k0Var) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128) | (btsVar.e(slsVar2) ? 2048 : 1024);
        if (btsVar.V(i2 & 1, (i2 & 1171) != 1170)) {
            f530 e = ljs0.e(ljs0.c(bzk0.c(ymb1.l(f530Var, cyk0.c(32.0f)), AppColor$Palette.BgMinor, qke.q), 1.0f), 120.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = androidx.compose.ui.b.d(btsVar, e);
            ohd.G1.getClass();
            sls slsVar3 = d.b;
            if (dmw0Var == null) {
                cma1.b0();
                throw null;
            }
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
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
            uo5 uo5Var = x4c.x;
            cj6 cj6Var = cj6.a;
            c530 c530Var = c530.a;
            f530 a2 = cj6Var.a(c530Var, uo5Var);
            k3r k3rVar = ljs0.b;
            f530 b = q791.b(a2.k(k3rVar), null, null, t7k0Var.d, null, new awk0(0), slsVar, 8);
            uo5 uo5Var2 = x4c.y;
            z910 d3 = pi6.d(uo5Var2, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = androidx.compose.ui.b.d(btsVar, b);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d4);
            c(amb1.c(), t7k0Var.d, slsVar, an91.m(c530Var, 16.0f, 0.0f, 2), null, btsVar, (i2 & 896) | HProv.ALG_TYPE_SECURECHANNEL);
            btsVar.t(true);
            f530 b2 = q791.b(cj6Var.a(c530Var, x4c.z).k(k3rVar), null, null, t7k0Var.c, null, new awk0(0), slsVar2, 8);
            z910 d5 = pi6.d(uo5Var2, false);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d6 = androidx.compose.ui.b.d(btsVar, b2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d5);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d6);
            f530 m = an91.m(c530Var, 16.0f, 0.0f, 2);
            t7k0Var2 = t7k0Var;
            int i3 = i2 >> 3;
            c(cq91.b(), t7k0Var2.c, slsVar2, m, null, btsVar, (i3 & 896) | HProv.ALG_TYPE_SECURECHANNEL);
            btsVar.t(true);
            a(t7k0Var2, an91.m(ljs0.c(cj6Var.a(c530Var, uo5Var2), 1.0f), a, 0.0f, 2), btsVar, i3 & 14);
            btsVar.t(true);
        } else {
            t7k0Var2 = t7k0Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new zhb0(f530Var, t7k0Var2, slsVar, slsVar2, i, 4);
        }
    }

    public static final void c(au2 au2Var, boolean z, sls slsVar, f530 f530Var, IconSpotSize iconSpotSize, fid fidVar, int i) {
        int i2;
        bts btsVar;
        IconSpotSize iconSpotSize2;
        AppColor$Palette appColor$Palette;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1075631198);
        if ((i & 6) == 0) {
            i2 = (btsVar2.k(au2Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar2.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar2.e(slsVar) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar2.k(f530Var) ? 2048 : 1024;
        }
        int i3 = i2 | 221184;
        if (btsVar2.V(i3 & 1, (74899 & i3) != 74898)) {
            IconSpotSize iconSpotSize3 = IconSpotSize.L;
            if (z) {
                appColor$Palette = AppColor$Palette.Text;
            } else {
                if (z) {
                    w511.b();
                    return;
                }
                appColor$Palette = AppColor$Palette.Line;
            }
            AppColor$Palette appColor$Palette2 = appColor$Palette;
            btsVar = btsVar2;
            e5v.a(q791.d(ymb1.l(f530Var, cyk0.a), z, null, null, slsVar, 14), new hdu(AppColor$Palette.BgFloating, appColor$Palette2), null, iconSpotSize3, wwg.S(-1689991698, true, new ls40(6, iconSpotSize3, au2Var, appColor$Palette2), btsVar2), btsVar, ((i3 >> 3) & 7168) | 24960, 0);
            iconSpotSize2 = iconSpotSize3;
        } else {
            btsVar = btsVar2;
            btsVar.Y();
            iconSpotSize2 = iconSpotSize;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ym1(i, 10, au2Var, slsVar, f530Var, iconSpotSize2, z);
        }
    }
}
