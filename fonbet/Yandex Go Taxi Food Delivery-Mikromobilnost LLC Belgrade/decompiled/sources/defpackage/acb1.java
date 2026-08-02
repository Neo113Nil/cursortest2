package defpackage;

import android.content.Context;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.ArrayList;
import kotlin.reflect.KVariance;

/* loaded from: classes5.dex */
public abstract class acb1 {
    public static final void a(qt6 qt6Var, fid fidVar, int i) {
        ArrayList arrayList = qt6Var.a;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-94917199);
        int i2 = (btsVar.k(qt6Var) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 o = an91.o(c530.a, 0.0f, 0.0f, 16.0f, 0.0f, 11);
            sic a = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d = b.d(btsVar, o);
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
            qje.W(btsVar, d.e, o2);
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d);
            btsVar.e0(-381000050);
            int i3 = 0;
            for (Object obj : arrayList) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    scc.m();
                    throw null;
                }
                b((st6) obj, i3 == scc.f(arrayList), btsVar, 0);
                i3 = i4;
            }
            btsVar.t(false);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new tn1(qt6Var, i, 26);
        }
    }

    public static final void b(st6 st6Var, boolean z, fid fidVar, int i) {
        int i2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(323092033);
        dmw0 dmw0Var = btsVar.a;
        int i3 = (btsVar.k(st6Var) ? 4 : 2) | i | (btsVar.a(z) ? 32 : 16);
        if (btsVar.V(i3 & 1, (i3 & 19) != 18)) {
            c530 c530Var = c530.a;
            f530 e = ljs0.e(ljs0.c(c530Var, 1.0f), 56.0f);
            lhl0 a = khl0.a(lr20.a, x4c.E, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, e);
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
            wls wlsVar3 = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar3);
            }
            wls wlsVar4 = d.d;
            qje.W(btsVar, wlsVar4, d);
            c(0L, btsVar, 0);
            f530 c = ljs0.c(c530Var, 1.0f);
            sic a2 = qic.a(lr20.c, x4c.G, btsVar, 0);
            int hashCode2 = Long.hashCode(btsVar.T);
            r1b0 o2 = btsVar.o();
            f530 d2 = b.d(btsVar, c);
            btsVar.i0();
            if (btsVar.S) {
                btsVar.n(slsVar);
            } else {
                btsVar.r0();
            }
            qje.W(btsVar, wlsVar, a2);
            qje.W(btsVar, wlsVar2, o2);
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode2))) {
                b64.z(hashCode2, btsVar, hashCode2, wlsVar3);
            }
            x2y d3 = n.d(btsVar, d2, wlsVar4, 1.0f, true);
            String str = st6Var.a;
            String str2 = st6Var.b;
            a7u0 a7u0Var = gl51.a;
            web1.e(d3, null, null, str, null, ((el51) btsVar.m(a7u0Var)).n(), null, null, null, 0, false, 0, null, str2, null, null, null, null, false, ((el51) btsVar.m(a7u0Var)).o(), 0, false, 0, false, null, false, btsVar, 0, 0, 0, 266305462);
            btsVar = btsVar;
            if (z) {
                btsVar.e0(1896542683);
            } else {
                btsVar.e0(-1185747596);
                dk91.a(0.0f, 0, 7, 0L, btsVar, null);
            }
            btsVar.t(false);
            i2 = 1;
            btsVar.t(true);
            btsVar.t(true);
        } else {
            i2 = 1;
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new uge(i, i2, st6Var, z);
        }
    }

    public static final void c(long j, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(22412400);
        int i2 = i | 2;
        int i3 = 0;
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            btsVar.a0();
            if ((i & 1) == 0 || btsVar.C()) {
                j = ((el51) btsVar.m(gl51.a)).j();
            } else {
                btsVar.Y();
            }
            btsVar.u();
            c530 c530Var = c530.a;
            f530 m = ljs0.m(c530Var, 56.0f);
            z910 d = pi6.d(x4c.y, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, m);
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
            wls wlsVar = d.g;
            if (btsVar.S || !jl40.l(btsVar.Q(), Integer.valueOf(hashCode))) {
                b64.z(hashCode, btsVar, hashCode, wlsVar);
            }
            qje.W(btsVar, d.d, d2);
            f530 m2 = ljs0.m(c530Var, 24.0f);
            boolean d3 = btsVar.d(j);
            Object Q = btsVar.Q();
            if (d3 || Q == did.a) {
                Q = new cs0(j, 7);
                btsVar.o0(Q);
            }
            qeb1.a(6, btsVar, (tls) Q, m2);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ot6(i, i3, j);
        }
    }

    public static final void d(Context context, String str) {
        context.deleteSharedPreferences(str);
    }

    public static ogx e(an11 an11Var) {
        return new ogx(KVariance.INVARIANT, an11Var);
    }
}
