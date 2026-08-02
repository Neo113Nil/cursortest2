package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.scooters.analytics.ScootersAnalytics$ScootersActivePassesOpenedFromScreen;
import com.yandex.go.scooters.passes.domain.model.ScootersPassesFromScreen;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes5.dex */
public abstract class b0b1 {
    public static au2 a;

    public static final void a(String str, int i, fid fidVar, int i2) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(-1510603801);
        int i3 = i2 | (btsVar2.k(str) ? 32 : 16) | (btsVar2.c(i) ? 256 : 128);
        if (btsVar2.V(i3 & 1, (i3 & 147) != 146)) {
            f530 l = ymb1.l(c530.a, cyk0.c(6.0f));
            a7u0 a7u0Var = gl51.a;
            f530 l2 = an91.l(m4m0.b(l, ((el51) btsVar2.m(a7u0Var)).d(), qke.q), 8.0f, 4.0f);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            btsVar = btsVar2;
            ymb1.f(str, l2.k(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), ldc.b(((el51) btsVar2.m(a7u0Var)).n(), 0.5f, 0.0f, 0.0f, 0.0f, 14), null, lzr.E, null, 0L, 0L, 0L, new sjy0(i), 0, false, 0, null, null, btsVar, ((i3 >> 3) & 14) | HProv.ALG_CLASS_DATA_ENCRYPT, (i3 >> 6) & 14, 64488);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kau(str, i, i2);
        }
    }

    public static final void b(f530 f530Var, vbu vbuVar, fid fidVar, int i) {
        c530 c530Var;
        float f;
        bts btsVar = (bts) fidVar;
        btsVar.g0(233104212);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(vbuVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 c = ljs0.c(f530Var, 1.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, c);
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
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            c530 c530Var2 = c530.a;
            ymb1.j(vbuVar.a, an91.n(c530Var2, 16.0f, 20.0f, 16.0f, 12.0f), 0L, null, lzr.G, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, HProv.ALG_CLASS_DATA_ENCRYPT, 0, 65516);
            ymb1.f(vbuVar.b, an91.o(c530Var2, 16.0f, 0.0f, 16.0f, 16.0f, 2), ((el51) btsVar.m(gl51.a)).o(), null, null, null, 0L, 0L, 0L, null, 0, false, Integer.MAX_VALUE, null, null, btsVar, 48, HProv.ALG_TYPE_SECURECHANNEL, 57336);
            btsVar = btsVar;
            String str = vbuVar.f;
            if (str == null) {
                btsVar.e0(2109597519);
                btsVar.t(false);
                c530Var = c530Var2;
                f = 1.0f;
            } else {
                btsVar.e0(2109597520);
                ru.yandex.taxi.logistics.sdk.ui.component.icon.b b = ua3.b(str, null, null, btsVar, 14);
                if (b.k() instanceof sa3) {
                    btsVar.e0(-1126236092);
                    c530Var = c530Var2;
                    f = 1.0f;
                    o4b1.b(b, null, ljs0.e(ljs0.c(c530Var, 1.0f), 160.0f), null, null, 0.0f, null, btsVar, 432, 120);
                    btsVar.t(false);
                } else {
                    c530Var = c530Var2;
                    f = 1.0f;
                    btsVar.e0(-1126005018);
                    btsVar.t(false);
                }
                btsVar.t(false);
            }
            f530 o2 = an91.o(ljs0.c(c530Var, f), 8.0f, 8.0f, 8.0f, 0.0f, 8);
            lhl0 a3 = khl0.a(new i43(8.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d2 = b.d(btsVar, o2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d2);
            a(vbuVar.c, 5, btsVar, 6);
            a(vbuVar.d, 3, btsVar, 6);
            a(vbuVar.e, 6, btsVar, 6);
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new a6n(f530Var, vbuVar, i, 26);
        }
    }

    public static final au2 c() {
        au2 au2Var = a;
        if (au2Var != null) {
            return au2Var;
        }
        lgv lgvVar = new lgv("ArrowSorting", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 224);
        a6t0 a6t0Var = new a6t0(iq2.g);
        uq90 uq90Var = new uq90();
        uq90Var.k(10.29f, 8.64f);
        uq90Var.i(1.41f, -1.42f);
        uq90Var.h(7.0f, 2.52f);
        uq90Var.i(-4.71f, 4.7f);
        uq90Var.h(3.7f, 8.64f);
        uq90Var.h(6.0f, 6.34f);
        uq90Var.p(14.68f);
        uq90Var.g(2.0f);
        uq90Var.h(8.0f, 6.34f);
        uq90Var.c();
        uq90Var.j(20.29f, 15.39f);
        uq90Var.h(21.71f, 16.8f);
        uq90Var.h(17.0f, 21.51f);
        uq90Var.i(-4.7f, -4.7f);
        uq90Var.i(1.4f, -1.42f);
        uq90Var.i(2.3f, 2.3f);
        uq90Var.h(16.0f, 3.0f);
        uq90Var.g(2.0f);
        uq90Var.p(14.68f);
        uq90Var.c();
        lgvVar.b(1.0f, 1.0f, 0.0f, 4.0f, 0.0f, 1.0f, 0.0f, 1, 0, 0, a6t0Var, null, "", uq90Var.a);
        au2 a2 = rya1.a(lgvVar.d(), true);
        a = a2;
        return a2;
    }

    public static final ScootersAnalytics$ScootersActivePassesOpenedFromScreen d(ScootersPassesFromScreen scootersPassesFromScreen) {
        int i = yqm0.a[scootersPassesFromScreen.ordinal()];
        if (i == 1) {
            return ScootersAnalytics$ScootersActivePassesOpenedFromScreen.Discovery;
        }
        if (i == 2) {
            return ScootersAnalytics$ScootersActivePassesOpenedFromScreen.OfferCard;
        }
        if (i == 3) {
            return ScootersAnalytics$ScootersActivePassesOpenedFromScreen.Discovery;
        }
        w511.b();
        return null;
    }
}
