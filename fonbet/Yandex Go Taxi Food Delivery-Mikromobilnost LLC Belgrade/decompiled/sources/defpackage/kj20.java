package defpackage;

import androidx.compose.runtime.f;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import androidx.compose.ui.platform.j;
import java.util.ArrayList;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;

/* loaded from: classes5.dex */
public abstract class kj20 {
    public static final byk0 a = cyk0.e(18.0f, 18.0f, 0.0f, 0.0f, 12);
    public static final byk0 b = cyk0.c(18.0f);

    public static final void a(String str, sls slsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(445419960);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.e(slsVar) ? 32 : 16);
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            long c = ((el51) btsVar.m(gl51.a)).c();
            byk0 byk0Var = a;
            c530 c530Var = c530.a;
            f530 k = an91.k(m4m0.b(c530Var, c, byk0Var), 8.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, k);
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
            qje.W(btsVar, d.e, o);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            a.a(slsVar, ljs0.c(ljs0.e(c530Var, 56.0f), 1.0f), null, 0L, 0L, null, false, str, null, null, wwg.S(636331125, true, new le(str, 28), btsVar), btsVar, ((i2 >> 3) & 14) | ((i2 << 27) & 1879048192), 3580);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new fj5(i, 2, slsVar, str);
        }
    }

    public static final void b(String str, String str2, ArrayList arrayList, v4v v4vVar, tls tlsVar, fid fidVar, int i) {
        wls wlsVar;
        androidx.compose.runtime.internal.a S;
        tls tlsVar2 = tlsVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1508459784);
        dmw0 dmw0Var = btsVar.a;
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.k(str2) ? 32 : 16) | (btsVar.e(arrayList) ? 256 : 128) | (btsVar.k(v4vVar) ? 2048 : 1024) | (btsVar.e(tlsVar2) ? 16384 : 8192);
        if (btsVar.V(i2 & 1, (i2 & 9363) != 9362)) {
            a7u0 a7u0Var = gl51.a;
            long c = ((el51) btsVar.m(a7u0Var)).c();
            c530 c530Var = c530.a;
            byk0 byk0Var = a;
            f530 b2 = m4m0.b(c530Var, c, byk0Var);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, b2);
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
            wls wlsVar2 = d.f;
            qje.W(btsVar, wlsVar2, d);
            wls wlsVar3 = d.e;
            qje.W(btsVar, wlsVar3, o);
            wls wlsVar4 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar4);
            }
            wls wlsVar5 = d.d;
            qje.W(btsVar, wlsVar5, d2);
            fwi fwiVar = (fwi) btsVar.m(j.h);
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (Q == o430Var) {
                wlsVar = wlsVar2;
                Q = f.j(new y7m(0.0f));
                btsVar.o0(Q);
            } else {
                wlsVar = wlsVar2;
            }
            oz40 oz40Var = (oz40) Q;
            f530 b3 = m4m0.b(c530Var, ((el51) btsVar.m(a7u0Var)).i(), byk0Var);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            wls wlsVar6 = wlsVar;
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d3 = b.d(btsVar, b3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar6, a2);
            qje.W(btsVar, wlsVar3, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar4);
            }
            qje.W(btsVar, wlsVar5, d3);
            if (v4vVar == null) {
                btsVar.e0(-1136430767);
                btsVar.t(false);
                S = null;
            } else {
                btsVar.e0(-1136430766);
                S = wwg.S(-1809483330, true, new mb(v4vVar, 15), btsVar);
                btsVar.t(false);
            }
            androidx.compose.runtime.internal.a aVar = S;
            f530 b4 = ljs0.b(m4m0.b(c530Var, ((el51) btsVar.m(a7u0Var)).c(), b), 0.0f, 72.0f, 1);
            boolean k = btsVar.k(fwiVar);
            Object Q2 = btsVar.Q();
            if (k || Q2 == o430Var) {
                Q2 = new ooi(fwiVar, oz40Var, 5);
                btsVar.o0(Q2);
            }
            web1.c(xm91.b(b4, (tls) Q2), 0.0f, false, 0.0f, null, null, wwg.S(1424986904, true, new kq5(str, str2, 6), btsVar), null, null, aVar, null, null, false, btsVar, 1573248, 0, 7610);
            btsVar = btsVar;
            f530 b5 = m4m0.b(c530Var, ((el51) btsVar.m(a7u0Var)).c(), byk0Var);
            sic a3 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d4 = b.d(btsVar, b5);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar6, a3);
            qje.W(btsVar, wlsVar3, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                b64.z(hashCode3, btsVar, hashCode3, wlsVar4);
            }
            qje.W(btsVar, wlsVar5, d4);
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
            btsVar.e0(1334726332);
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                e((hj20) obj, i3 == scc.f(arrayList), tlsVar, btsVar, (i2 >> 6) & 896);
                i3 = i4;
            }
            tlsVar2 = tlsVar;
            tse0.t(btsVar, false, true, true);
            f530 o4 = an91.o(s1a1.g(ljs0.c(c530Var, 1.0f), 1.0f), 40.0f, ((y7m) oz40Var.getValue()).a, 40.0f, 0.0f, 8);
            k8d.a.getClass();
            xab1.a(o4, null, k8d.b, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new b0(str, str2, arrayList, v4vVar, tlsVar2, i, 21);
        }
    }

    public static final void c(fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1460732372);
        dmw0 dmw0Var = btsVar.a;
        if (btsVar.V(i & 1, i != 0)) {
            a7u0 a7u0Var = gl51.a;
            long c = ((el51) btsVar.m(a7u0Var)).c();
            c530 c530Var = c530.a;
            byk0 byk0Var = a;
            f530 e = ljs0.e(m4m0.b(c530Var, c, byk0Var), 348.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, e);
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
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d2);
            f530 o2 = an91.o(s1a1.g(ljs0.c(c530Var, 1.0f), 1.0f), 40.0f, 70.0f, 40.0f, 0.0f, 8);
            k8d.a.getClass();
            xab1.a(o2, null, k8d.d, btsVar, HProv.ALG_TYPE_SECURECHANNEL, 6);
            f530 b2 = m4m0.b(c530Var, ((el51) btsVar.m(a7u0Var)).i(), byk0Var);
            so5 so5Var = x4c.G;
            g43 g43Var = lr20.c;
            sic a2 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o3 = btsVar.o();
            f530 d3 = b.d(btsVar, b2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o3);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d3);
            btsVar = btsVar;
            web1.c(m4m0.b(c530Var, ((el51) btsVar.m(a7u0Var)).c(), b), 72.0f, false, 0.0f, null, null, k8d.e, null, null, null, null, null, false, btsVar, 1572912, 0, 8124);
            f530 b3 = m4m0.b(c530Var, ((el51) btsVar.m(a7u0Var)).c(), byk0Var);
            sic a3 = qic.a(g43Var, so5Var, btsVar, 0);
            int hashCode3 = Long.hashCode(btsVar.T);
            r1b0 o4 = btsVar.o();
            f530 d4 = b.d(btsVar, b3);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a3);
            qje.W(btsVar, wlsVar2, o4);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode3))) {
                b64.z(hashCode3, btsVar, hashCode3, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d4);
            oeb1.c(btsVar, ljs0.e(c530Var, 16.0f));
            btsVar.e0(-899888756);
            for (int i2 = 0; i2 < 2; i2++) {
                pmb1.d(54, 0, btsVar, ljs0.e(c530Var, 62.0f));
                dk91.a(0.0f, 6, 6, 0L, btsVar, an91.o(c530Var, 56.0f, 0.0f, 16.0f, 0.0f, 10));
            }
            btsVar.t(false);
            pmb1.d(6, 2, btsVar, null);
            tse0.t(btsVar, true, true, true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new i0z(i, 4);
        }
    }

    public static final void d(int i, int i2, fid fidVar) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1485969771);
        int i3 = (btsVar.c(i) ? 4 : 2) | i2;
        if (btsVar.V(i3 & 1, (i3 & 3) != 2)) {
            lhl0 a2 = khl0.a(lr20.a, x4c.D, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            btsVar.e0(611668459);
            int i4 = (i / 7) + 10;
            if (1 <= i4) {
                int i5 = 1;
                while (true) {
                    s3b1.f(new cuj0(tzg0.ic_dot, null, null, null, 30), null, null, btsVar, 0, 6);
                    oeb1.c(btsVar, ljs0.q(c530Var, 3.1f));
                    if (i5 == i4) {
                        break;
                    } else {
                        i5++;
                    }
                }
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new jj20(i, i2, 0);
        }
    }

    public static final void e(hj20 hj20Var, boolean z, tls tlsVar, fid fidVar, int i) {
        int i2;
        f530 a2;
        boolean z2;
        boolean z3;
        boolean z4;
        androidx.compose.runtime.internal.a S;
        bts btsVar = (bts) fidVar;
        btsVar.g0(152246290);
        dmw0 dmw0Var = btsVar.a;
        if ((i & 6) == 0) {
            i2 = (btsVar.k(hj20Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.a(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= btsVar.e(tlsVar) ? 256 : 128;
        }
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            sic a3 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            c530 c530Var = c530.a;
            f530 d = b.d(btsVar, c530Var);
            ohd.G1.getClass();
            sls slsVar = d.b;
            androidx.compose.runtime.internal.a aVar = null;
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
            qje.W(btsVar, wlsVar, a3);
            wls wlsVar2 = d.e;
            qje.W(btsVar, wlsVar2, o);
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            String str = hj20Var.c;
            v4v v4vVar = hj20Var.b;
            if (str == null) {
                btsVar.e0(893656363);
                btsVar.t(false);
                z2 = false;
                a2 = null;
            } else {
                btsVar.e0(893656364);
                boolean k = ((i2 & 896) == 256) | btsVar.k(str);
                Object Q = btsVar.Q();
                Object obj = did.a;
                if (k || Q == obj) {
                    Q = new a91(tlsVar, str, 7);
                    btsVar.o0(Q);
                }
                f530 d2 = q791.d(c530Var, false, null, null, (sls) Q, 15);
                boolean z5 = (i2 & 14) == 4;
                Object Q2 = btsVar.Q();
                if (z5 || Q2 == obj) {
                    Q2 = new k200(28, hj20Var);
                    btsVar.o0(Q2);
                }
                a2 = fnq0.a(d2, (tls) Q2);
                z2 = false;
                btsVar.t(false);
            }
            if (a2 == null) {
                a2 = c530Var;
            }
            z910 d3 = pi6.d(x4c.b, z2);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d4 = b.d(btsVar, a2);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, d3);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            qje.W(btsVar, wlsVar4, d4);
            f530 e = ljs0.e(c530Var, 62.0f);
            if (v4vVar == null) {
                btsVar.e0(2097374975);
                z3 = false;
                btsVar.t(false);
                S = null;
                z4 = true;
            } else {
                z3 = false;
                btsVar.e0(2097374976);
                z4 = true;
                S = wwg.S(604566743, true, new mb(v4vVar, 14), btsVar);
                btsVar.t(false);
            }
            androidx.compose.runtime.internal.a S2 = wwg.S(-858248334, z4, new sc20(4, hj20Var), btsVar);
            if (str != null) {
                k8d.a.getClass();
                aVar = k8d.c;
            }
            androidx.compose.runtime.internal.a aVar2 = S;
            boolean z6 = z3;
            web1.c(e, 0.0f, false, 0.0f, null, aVar2, S2, null, null, aVar, null, str == null ? oa01.c : oa01.a, false, btsVar, 1572870, 0, 5534);
            btsVar = btsVar;
            btsVar.t(z4);
            if (z) {
                btsVar.e0(894522938);
                btsVar.t(z6);
            } else {
                btsVar.e0(1552871179);
                dk91.a(0.0f, 0, 6, 0L, btsVar, an91.o(c530Var, v4vVar != null ? 56.0f : 16.0f, 0.0f, 16.0f, 0.0f, 10));
                btsVar.t(z6);
            }
            btsVar.t(z4);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new kj5(hj20Var, z, tlsVar, i, 7);
        }
    }
}
