package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public abstract class hub1 {
    public static au2 a;

    public static final void a(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-25453429);
        if (btsVar.V(i & 1, i != 0)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(ljs0.c(c530Var, 1.0f), 16.0f, 0.0f, 2);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
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
            com.yandex.go.design.compose.loading.b.a(ljs0.e(an91.o(ljs0.c(c530Var, 1.0f), 0.0f, 20.0f, 0.0f, 0.0f, 13), 12.0f), null, false, null, null, null, false, btsVar, 6, 254);
            com.yandex.go.design.compose.loading.b.a(ljs0.e(an91.o(ljs0.c(c530Var, 0.5f), 0.0f, 10.0f, 0.0f, 0.0f, 13), 12.0f), null, false, null, null, null, false, btsVar, 6, 254);
            com.yandex.go.design.compose.loading.b.a(ljs0.e(an91.o(ljs0.c(c530Var, 0.5f), 0.0f, 10.0f, 0.0f, 0.0f, 13), 12.0f), null, false, null, null, null, false, btsVar, 6, 254);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jiz0(i, 17);
        }
    }

    public static final void b(f530 f530Var, xfh xfhVar, boolean z, wp2 wp2Var, sls slsVar, a aVar, fid fidVar, int i) {
        int i2;
        xfh xfhVar2;
        sls slsVar2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(477011797);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(f530Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            xfhVar2 = xfhVar;
            i2 |= btsVar.k(xfhVar2) ? 32 : 16;
        } else {
            xfhVar2 = xfhVar;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.a(z) ? 256 : 128;
        }
        if ((i & HProv.ALG_TYPE_SECURECHANNEL) == 0) {
            i2 |= btsVar.k(wp2Var) ? 2048 : 1024;
        }
        if ((i & HProv.ALG_CLASS_DATA_ENCRYPT) == 0) {
            slsVar2 = slsVar;
            i2 |= btsVar.e(slsVar2) ? 16384 : 8192;
        } else {
            slsVar2 = slsVar;
        }
        if ((196608 & i) == 0) {
            i2 |= btsVar.e(aVar) ? 131072 : 65536;
        }
        if (btsVar.V(i2 & 1, (74899 & i2) != 74898)) {
            f530 o = an91.o(q791.d(m4m0.b(ymb1.l(ljs0.g(ljs0.c(f530Var, 1.0f), 88.0f, 0.0f, 2), cyk0.c(20.0f)), tje.n(wp2Var, btsVar), cyk0.c(20.0f)), false, null, null, slsVar2, 15), 8.0f, 6.0f, 8.0f, 0.0f, 8);
            boolean z2 = (i2 & 896) == 256;
            Object Q = btsVar.Q();
            if (z2 || Q == did.a) {
                Q = new yce(z, 14);
                btsVar.o0(Q);
            }
            f530 b = fnq0.b(o, true, (tls) Q);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, b);
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
            xfh xfhVar3 = xfhVar2;
            int i3 = i2;
            i891.b(null, xfhVar3, z, wp2Var, btsVar, i2 & 8176);
            f530 k = ljs0.c(c530.a, 1.0f).k(new x2y(1.0f, true));
            z910 d2 = pi6.d(x4c.y, false);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, k);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar3);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d2);
            qje.W(btsVar, wlsVar2, o3);
            vfc.v(hashCode2, btsVar, wlsVar3, btsVar, tlsVar);
            qje.W(btsVar, wlsVar4, d3);
            aVar.invoke(btsVar, Integer.valueOf((i3 >> 15) & 14));
            btsVar.t(true);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ye5(f530Var, xfhVar, z, wp2Var, slsVar, aVar, i, 7);
        }
    }
}
