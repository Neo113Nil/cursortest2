package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes12.dex */
public abstract class j0z {
    public static final byk0 a = cyk0.c(12.0f);
    public static final byk0 b = cyk0.c(20.0f);

    public static final void a(f530 f530Var, wnb wnbVar, tls tlsVar, fid fidVar, int i) {
        tls tlsVar2;
        f530 f530Var2;
        sls slsVar;
        wnb wnbVar2 = wnbVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1524568990);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(f530Var) ? 4 : 2) | (btsVar.k(wnbVar2) ? 32 : 16) | (btsVar.e(tlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 k = f530Var.k(ljs0.c);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, k);
            ohd.G1.getClass();
            sls slsVar2 = d.b;
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
            wls wlsVar = d.f;
            qje.W(btsVar, wlsVar, a2);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            Integer valueOf = Integer.valueOf(hashCode);
            wls wlsVar3 = d.g;
            qje.W(btsVar, wlsVar3, valueOf);
            tls tlsVar3 = d.h;
            qje.M(btsVar, tlsVar3);
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            a S = wwg.S(-980139476, true, new s0v(13, tlsVar, wnbVar2), btsVar);
            c530 c530Var = c530.a;
            crb1.b(c530Var, S, null, null, null, null, null, btsVar, 54, HProv.PP_SAME_MEDIA);
            f530 c = ljs0.c(c530Var, 1.0f);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            f530 k2 = c.k(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
            sic a3 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, k2);
            btsVar.i0();
            if (btsVar.S) {
                slsVar = slsVar2;
                btsVar.n(slsVar);
            } else {
                slsVar = slsVar2;
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o2);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d2);
            b(btsVar, 6);
            f530 c2 = ljs0.c(c530Var, 1.0f);
            if (1.0f <= 0.0d) {
                gxv.a("invalid weight; must be greater than zero");
            }
            f530 u = pw91.u(c2.k(new x2y(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true)), pw91.o(btsVar), 12);
            sic a4 = qic.a(new i43(8.0f, true, new quz(11)), so5Var, btsVar, 6);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, u);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a4);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode3, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d3);
            f530 e = ljs0.e(ljs0.c(an91.m(c530Var, 16.0f, 0.0f, 2), 1.0f), 256.0f);
            byk0 byk0Var = b;
            sls slsVar3 = slsVar;
            com.yandex.go.design.compose.loading.b.a(e, byk0Var, false, null, null, null, false, btsVar, 54, 252);
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(an91.o(an91.m(c530Var, 16.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 8.0f, 7), 1.0f), 64.0f), byk0Var, false, null, null, null, false, btsVar, 54, 252);
            com.yandex.go.design.compose.loading.b.a(ljs0.e(ljs0.c(an91.n(c530Var, 16.0f, 8.0f, 28.0f, 16.0f), 1.0f), 25.0f), byk0Var, false, null, null, null, false, btsVar, 48, 252);
            f530 o4 = an91.o(pw91.l(ljs0.c(c530Var, 1.0f), pw91.o(btsVar), 12), 16.0f, 0.0f, 0.0f, 16.0f, 6);
            lhl0 a5 = khl0.a(new i43(8.0f, true, new quz(11)), x4c.D, btsVar, 6);
            int hashCode4 = Long.hashCode(btsVar.T);
            r1b0 o5 = btsVar.o();
            f530 d4 = b.d(btsVar, o4);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a5);
            qje.W(btsVar, wlsVar2, o5);
            vfc.v(hashCode4, btsVar, wlsVar3, btsVar, tlsVar3);
            qje.W(btsVar, wlsVar4, d4);
            btsVar.e0(-1718665004);
            for (int i3 = 0; i3 < 3; i3++) {
                com.yandex.go.design.compose.loading.b.a(ljs0.n(f530Var, 120.0f, 76.0f), b, false, null, null, null, false, btsVar, 48, 252);
            }
            f530Var2 = f530Var;
            ly3.A(btsVar, false, true, true, true);
            wnbVar2 = wnbVar;
            tlsVar2 = tlsVar;
            i891.a(wnbVar2.a, tlsVar2, btsVar, (i2 >> 3) & 112);
            btsVar.t(true);
            tka0.a(btsVar, 0);
        } else {
            tlsVar2 = tlsVar;
            f530Var2 = f530Var;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new gxm(f530Var2, wnbVar2, tlsVar2, i, 20);
        }
    }

    public static final void b(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(364321880);
        int i2 = 0;
        if (btsVar.V(i & 1, (i & 3) != 2)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(an91.o(c530Var, 8.0f, 0.0f, 0.0f, 0.0f, 14), 0.0f, 0.0f, 0.0f, 8.0f, 7);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, o);
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
            qje.W(btsVar, d.e, o2);
            qje.W(btsVar, d.g, Integer.valueOf(hashCode));
            qje.M(btsVar, d.h);
            qje.W(btsVar, d.d, d2);
            f530 c = ljs0.c(c530Var, 1.0f);
            e8d.a.getClass();
            ydb1.a(c, e8d.b, e8d.c, null, null, null, null, false, btsVar, 438, 248);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i0z(i, i2);
        }
    }
}
