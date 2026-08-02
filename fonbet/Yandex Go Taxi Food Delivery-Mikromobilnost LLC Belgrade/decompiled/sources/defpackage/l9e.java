package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.widget.AnyTouchCatcherFrameLayout;

/* loaded from: classes14.dex */
public abstract class l9e {
    public static final void a(f530 f530Var, wp2 wp2Var, k43 k43Var, sls slsVar, a aVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1610190018);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(wp2Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.k(k43Var) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.e(slsVar) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            i2 |= btsVar.e(aVar) ? 16384 : 8192;
        }
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            f530 l = an91.l(q791.d(bzk0.c(ymb1.l(ljs0.c(f530Var, 1.0f).k(ljs0.b), cyk0.c(72.0f)), wp2Var, qke.q), false, null, null, slsVar, 15), 16.0f, 12.0f);
            sic a = qic.a(k43Var, x4c.G, btsVar, (((i2 >> 3) & 112) >> 3) & 14);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, l);
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
            qje.W(btsVar, d.f, a);
            qje.W(btsVar, d.e, o);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d);
            nnm.p((i2 >> 12) & 14, aVar, btsVar, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new nc0(f530Var, (Object) wp2Var, (Object) k43Var, (Object) slsVar, (Object) aVar, i, 4);
        }
    }

    public static final void b(f530 f530Var, l7k0 l7k0Var, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-181788851);
        int i2 = (btsVar.k(f530Var) ? 4 : 2) | i | (btsVar.k(l7k0Var) ? 32 : 16) | (btsVar.e(slsVar) ? 256 : 128);
        if (!btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            btsVar.Y();
        } else if (l7k0Var instanceof k7k0) {
            btsVar.e0(1394578429);
            e(f530Var, (k7k0) l7k0Var, slsVar, btsVar, i2 & 1022);
            btsVar.t(false);
        } else {
            if (!(l7k0Var instanceof j7k0)) {
                throw unr0.y(1394576993, btsVar, false);
            }
            btsVar.e0(1394580988);
            d(f530Var, (j7k0) l7k0Var, slsVar, btsVar, i2 & 1022);
            btsVar.t(false);
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xx8(f530Var, l7k0Var, slsVar, i, 6);
        }
    }

    public static final void c(String str, wp2 wp2Var, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(909202397);
        int i2 = i | (btsVar2.k(str) ? 4 : 2);
        if (btsVar2.V(i2 & 1, (i2 & 19) != 18)) {
            btsVar = btsVar2;
            jeb1.f(str, null, wp2Var, 0L, 0L, null, null, 0L, 5, false, 1, 0, null, xya1.e(btsVar2).g.a, btsVar, (i2 & 14) | 805306752, 48, 13818);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new q0v(str, wp2Var, i, 4);
        }
    }

    public static final void d(f530 f530Var, j7k0 j7k0Var, sls slsVar, fid fidVar, int i) {
        int i2;
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-234508704);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(j7k0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            slsVar2 = slsVar;
            i2 |= btsVar.e(slsVar2) ? 256 : 128;
        } else {
            slsVar2 = slsVar;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            a(f530Var, new up2(ldc.b(tje.n(AppColor$Palette.Error, btsVar), 0.12f, 0.0f, 0.0f, 0.0f, 14)), lr20.e, slsVar2, wwg.S(-926661410, true, new tn1(6, j7k0Var), btsVar), btsVar, (i2 & 14) | 24960 | ((i2 << 3) & 7168));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(f530Var, j7k0Var, slsVar, i, 1);
        }
    }

    public static final void e(f530 f530Var, k7k0 k7k0Var, sls slsVar, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(2115781138);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(k7k0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(slsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            a(f530Var, AppColor$Palette.BgMinor, lr20.c, slsVar, wwg.S(-1618005744, true, new tn1(5, k7k0Var), btsVar), btsVar, (i2 & 14) | 25008 | ((i2 << 3) & 7168));
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ku0(f530Var, k7k0Var, slsVar, i, 0);
        }
    }

    public static final boolean f(String str) {
        return (str == null || evu0.J(str) || !evu0.y(str, "oid", false)) ? false : true;
    }

    public static tqc g(osx0 osx0Var, AnyTouchCatcherFrameLayout anyTouchCatcherFrameLayout, hnx0 hnx0Var, pe31 pe31Var, qr31 qr31Var, n070 n070Var, boolean z) {
        osx0Var.getClass();
        anyTouchCatcherFrameLayout.getClass();
        hnx0Var.getClass();
        pe31Var.getClass();
        qr31Var.getClass();
        n070Var.getClass();
        Boolean valueOf = Boolean.valueOf(z);
        tqc tqcVar = new tqc();
        int i = 0;
        tqcVar.c = new yag(osx0Var, i);
        tqcVar.d = new xag(osx0Var, 5);
        int i2 = 16;
        tqcVar.e = new xag(osx0Var, i2);
        int i3 = 24;
        tqcVar.f = new xag(osx0Var, i3);
        xag xagVar = new xag(osx0Var, 9);
        tqcVar.g = xagVar;
        int i4 = 18;
        tqcVar.a = i5m.b(new uzu0(new qy0(xagVar, 20), i4));
        xag xagVar2 = new xag(osx0Var, 17);
        xag xagVar3 = (xag) tqcVar.g;
        int i5 = 23;
        tqcVar.h = new umt0((xvf0) xagVar2, (xvf0) new vrt0(xagVar3, i5), (xvf0) new abx0(xagVar3, 6), (xvf0) new i0b0(xagVar3, i4), 11);
        tqcVar.i = new xag(osx0Var, 11);
        tqcVar.j = new xag(osx0Var, 26);
        tqcVar.k = new xag(osx0Var, 7);
        xag xagVar4 = new xag(osx0Var, 22);
        tqcVar.l = xagVar4;
        xag xagVar5 = new xag(osx0Var, 15);
        tqcVar.m = xagVar5;
        rbx0 rbx0Var = new rbx0(xagVar5, i2);
        tqcVar.n = rbx0Var;
        tqcVar.o = new mg11(xagVar4, rbx0Var, i3);
        tqcVar.p = n3w.a(hnx0Var);
        n3w a = n3w.a(pe31Var);
        tqcVar.q = a;
        int i6 = 2;
        tqcVar.r = new xv8((xag) tqcVar.d, (xag) tqcVar.e, (xag) tqcVar.f, tqcVar.a, (umt0) tqcVar.h, (xag) tqcVar.i, (xag) tqcVar.j, (xag) tqcVar.k, (mg11) tqcVar.o, (n3w) tqcVar.p, a, new xag(osx0Var, i6), new xag(osx0Var, 27));
        tqcVar.s = new xag(osx0Var, 8);
        tqcVar.t = n3w.a(anyTouchCatcherFrameLayout);
        xag xagVar6 = new xag(osx0Var, 25);
        xag xagVar7 = new xag(osx0Var, i5);
        y101 y101Var = new y101(xagVar6, xagVar7, rj31.a, 13);
        xag xagVar8 = new xag(osx0Var, 21);
        rbx0 rbx0Var2 = new rbx0(new xag(osx0Var, 1), i);
        yag yagVar = new yag(osx0Var, i6);
        xag xagVar9 = new xag(osx0Var, 19);
        rbx0 rbx0Var3 = new rbx0(new xag(osx0Var, 3), 4);
        rbx0 rbx0Var4 = new rbx0(xagVar6, 14);
        xag xagVar10 = new xag(osx0Var, i);
        xag xagVar11 = new xag(osx0Var, 29);
        xag xagVar12 = new xag(osx0Var, 10);
        l180 l180Var = new l180(xagVar12, 11);
        xag xagVar13 = new xag(osx0Var, 28);
        tqcVar.u = xagVar13;
        int i7 = 12;
        tqcVar.v = new z6x0(y101Var, new flx0(new g3b(xagVar6, xagVar8, rbx0Var2, yagVar, xagVar7, xagVar9, (umt0) tqcVar.h, rbx0Var3, rbx0Var4, xagVar10, xagVar11, xagVar12, l180Var, xagVar13, new s90(xagVar6, xagVar12, (xag) tqcVar.m, i7), new xag(osx0Var, i7), new cys0((xvf0) new xag(osx0Var, 18), (xvf0) new miv0(xagVar12, 0), 17), new xag(osx0Var, 20), new xag(osx0Var, 14), new xag(osx0Var, 6)), new ivo0((xag) tqcVar.l, 24), 0), (rbx0) tqcVar.n, new yag(osx0Var, 1), 26);
        tqcVar.w = new rct0((xvf0) new xag(osx0Var, 4), (xvf0) xagVar13, (xvf0) xagVar12, (xvf0) new jv21(xagVar6, xagVar12, 20), (xvf0) new i5s0(xagVar6, 16), 14);
        tqcVar.x = n3w.a(valueOf);
        tqcVar.y = new xag(osx0Var, 13);
        tqcVar.z = n3w.a(qr31Var);
        tqcVar.b = i5m.b(new lu90((yag) tqcVar.c, (xv8) tqcVar.r, (xag) tqcVar.s, (n3w) tqcVar.t, (z6x0) tqcVar.v, (rct0) tqcVar.w, (n3w) tqcVar.q, (n3w) tqcVar.x, (xag) tqcVar.y, (n3w) tqcVar.z, (xag) tqcVar.u, n3w.a(n070Var)));
        return tqcVar;
    }

    public static u8h h(avy0 avy0Var) {
        return new u8h(avy0Var.b, avy0Var.a);
    }
}
