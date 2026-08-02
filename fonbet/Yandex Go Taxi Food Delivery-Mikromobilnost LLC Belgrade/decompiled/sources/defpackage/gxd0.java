package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public abstract class gxd0 {
    public static final ldf a = new ldf(0.42f, 0.0f, 1.0f, 1.0f);
    public static final ldf b = new ldf(0.0f, 0.0f, 0.58f, 1.0f);

    public static final void a(sls slsVar, String str, boolean z, fid fidVar, int i) {
        long n;
        long g;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1309412226);
        int i2 = 4;
        int i3 = i | (btsVar.e(slsVar) ? 4 : 2) | (btsVar.k(str) ? 32 : 16) | (btsVar.a(z) ? 256 : 128);
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            if (z) {
                btsVar.e0(-80264372);
                n = ((el51) btsVar.m(gl51.a)).m();
            } else {
                btsVar.e0(-80263254);
                n = ((el51) btsVar.m(gl51.a)).n();
            }
            btsVar.t(false);
            long j = n;
            if (z) {
                btsVar.e0(-80260886);
                g = ((el51) btsVar.m(gl51.a)).b();
            } else {
                btsVar.e0(-80259826);
                g = ((el51) btsVar.m(gl51.a)).g();
            }
            btsVar.t(false);
            long j2 = g;
            f530 e = ljs0.e(ljs0.s(c530.a, 32.0f, 0.0f, 2), 32.0f);
            awk0 awk0Var = new awk0(1);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object Q = btsVar.Q();
            o430 o430Var = did.a;
            if (z2 || Q == o430Var) {
                Q = new e350(9, slsVar);
                btsVar.o0(Q);
            }
            f530 w = r5a1.w(e, z, false, awk0Var, (tls) Q, 10);
            byk0 e2 = ((YandexShapes) btsVar.m(qm51.a)).e();
            boolean z3 = (i3 & 112) == 32;
            Object Q2 = btsVar.Q();
            if (z3 || Q2 == o430Var) {
                Q2 = new dcc0(str, 4);
                btsVar.o0(Q2);
            }
            a.b(slsVar, w, e2, j2, 0L, null, null, null, false, null, null, new l27((tls) Q2), wwg.S(1051712897, true, new rk4(str, j, i2), btsVar), btsVar, i4, 384, 2032);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new mr1(slsVar, str, z, i, 17);
        }
    }

    public static final void b(int i, fid fidVar, tls tlsVar, List list, boolean z) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1359728131);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(list) ? 4 : 2) | i;
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
            l690 b2 = an91.b(12.0f, 0.0f, 2);
            i43 i43Var = new i43(4.0f, true, new quz(11));
            boolean e = ((i2 & 112) == 32) | btsVar.e(list) | ((i2 & 896) == 256);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new rx3(list, z, tlsVar, 10);
                btsVar.o0(Q);
            }
            adb1.b(null, null, b2, i43Var, null, null, false, null, (tls) Q, btsVar, 24960, 491);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ts(i, tlsVar, list, z);
        }
    }

    public static final void c(dbu dbuVar, fid fidVar, int i) {
        androidx.compose.runtime.internal.a S;
        bts btsVar = (bts) fidVar;
        btsVar.g0(1452395632);
        int i2 = (btsVar.k(dbuVar) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            String str = dbuVar.c;
            if (str == null) {
                btsVar.e0(817818197);
                btsVar.t(false);
                S = null;
            } else {
                btsVar.e0(817818198);
                S = wwg.S(-1155623928, true, new fzv(str, 17), btsVar);
                btsVar.t(false);
            }
            web1.c(null, 0.0f, false, 0.0f, null, S, wwg.S(1465946708, true, new dxd0(dbuVar), btsVar), null, null, null, null, null, false, btsVar, 1572864, 0, 8095);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new dxd0(dbuVar, i);
        }
    }

    public static final void d(String str, ArrayList arrayList, boolean z, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(834918701);
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.e(arrayList) ? 32 : 16) | (btsVar2.a(z) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024);
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.g(ljs0.c(c530Var, 1.0f), 48.0f, 0.0f, 2), 16.0f, 0.0f, 0.0f, 0.0f, 14);
            lhl0 a2 = khl0.a(lr20.g, x4c.E, btsVar2, 54);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = b.d(btsVar2, o);
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
            qje.W(btsVar2, d.e, o2);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            ymb1.f(str, an91.m(c530Var, 0.0f, 13.0f, 1), 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, (i2 & 14) | 48, 0, 65532);
            btsVar = btsVar2;
            b((i2 >> 3) & 1022, btsVar, tlsVar, arrayList, z);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cxd0(str, arrayList, z, tlsVar, i, 0);
        }
    }

    public static final void e(pxd0 pxd0Var, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(1589867362);
        int i2 = (btsVar.k(pxd0Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            f530 u = ljs0.u(c530.a, null, 3);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, u);
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
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d);
            c(pxd0Var.c, btsVar, 0);
            cza1.a(!pxd0Var.f, 0, null, null, wwg.S(200241727, true, new bxd0(pxd0Var, wlsVar), btsVar), btsVar, HProv.ALG_CLASS_DATA_ENCRYPT);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new bxd0(pxd0Var, wlsVar, i);
        }
    }

    public static final void f(String str, LinkedHashMap linkedHashMap, wls wlsVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-717804948);
        int i2 = i | (btsVar.k(str) ? 4 : 2) | (btsVar.e(linkedHashMap) ? 32 : 16) | (btsVar.e(wlsVar) ? 256 : 128);
        if (btsVar.V(i2 & 1, (i2 & 147) != 146)) {
            f530 c = ljs0.c(ljs0.u(c530.a, null, 3), 1.0f);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, c);
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
            wls wlsVar2 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar2);
            }
            qje.W(btsVar, d.d, d2);
            Object Q = btsVar.Q();
            if (Q == did.a) {
                Q = new vld0(7);
                btsVar.o0(Q);
            }
            androidx.compose.animation.a.b(str, null, (tls) Q, null, null, null, wwg.S(1967613724, true, new l0(25, linkedHashMap, wlsVar), btsVar), btsVar, (i2 & 14) | 1573248, 58);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new t240(str, linkedHashMap, wlsVar, i, 26);
        }
    }

    public static final void g(String str, ArrayList arrayList, boolean z, tls tlsVar, fid fidVar, int i) {
        bts btsVar;
        bts btsVar2 = (bts) fidVar;
        btsVar2.g0(1254839835);
        int i2 = i | (btsVar2.k(str) ? 4 : 2) | (btsVar2.e(arrayList) ? 32 : 16) | (btsVar2.a(z) ? 256 : 128) | (btsVar2.e(tlsVar) ? 2048 : 1024);
        if (btsVar2.V(i2 & 1, (i2 & 1171) != 1170)) {
            c530 c530Var = c530.a;
            f530 o = an91.o(ljs0.g(ljs0.c(c530Var, 1.0f), 84.0f, 0.0f, 2), 0.0f, 0.0f, 0.0f, 12.0f, 7);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar2, 0);
            int hashCode = Long.hashCode(btsVar2.T);
            r1b0 o2 = btsVar2.o();
            f530 d = b.d(btsVar2, o);
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
            qje.W(btsVar2, d.e, o2);
            wls wlsVar = d.g;
            if (btsVar2.S || !jl40.l(btsVar2.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar2, hashCode, wlsVar);
            }
            qje.W(btsVar2, d.d, d);
            ymb1.f(str, an91.l(c530Var, 16.0f, 13.0f), 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, (i2 & 14) | 48, 0, 65532);
            btsVar = btsVar2;
            b((i2 >> 3) & 1022, btsVar, tlsVar, arrayList, z);
            btsVar.t(true);
        } else {
            btsVar = btsVar2;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new cxd0(str, arrayList, z, tlsVar, i, 1);
        }
    }
}
