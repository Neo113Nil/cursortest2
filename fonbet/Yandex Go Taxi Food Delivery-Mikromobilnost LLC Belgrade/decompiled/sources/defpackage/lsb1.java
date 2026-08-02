package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.LinkedHashMap;

/* loaded from: classes11.dex */
public abstract class lsb1 {
    public static final void a(xxe xxeVar, fid fidVar, int i) {
        int i2;
        long j;
        dty0 dty0Var = xxeVar.e;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-205856205);
        if ((i & 6) == 0) {
            i2 = (btsVar.k(xxeVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (btsVar.V(i2 & 1, (i2 & 3) != 2)) {
            f530 j2 = an91.j(ljs0.c(c530.a, 1.0f), xxeVar.f);
            boolean z = (i2 & 14) == 4;
            Object Q = btsVar.Q();
            if (z || Q == did.a) {
                Q = new vqb(29, xxeVar);
                btsVar.o0(Q);
            }
            f530 a = fnq0.a(j2, (tls) Q);
            lhl0 a2 = khl0.a(lr20.a, x4c.F, btsVar, 48);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, a);
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
            zgb1.a(xxeVar.c, null, 0, false, null, null, false, null, btsVar, 0, 254);
            x2y x2yVar = new x2y(1.0f, true);
            ldc ldcVar = dty0Var.c;
            if (ldcVar == null) {
                btsVar.e0(202254079);
                j = ((el51) btsVar.m(gl51.a)).n();
                btsVar.t(false);
            } else {
                btsVar.e0(202252746);
                btsVar.t(false);
                j = ldcVar.a;
            }
            long j3 = j;
            lzr lzrVar = dty0Var.b;
            sty0 sty0Var = dty0Var.a;
            koy0.a(x2yVar, null, sty0Var != null ? sty0Var.a : sty0.c, j3, lzrVar, 0L, 0L, null, btsVar, 0, 978);
            btsVar = btsVar;
            zgb1.a(xxeVar.d, null, 0, false, null, null, false, null, btsVar, 0, 254);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new z4(xxeVar, i, 11);
        }
    }

    public static final void b(sq50 sq50Var, gz50 gz50Var) {
        g0c a = qoi0.a(gz50.class);
        LinkedHashMap linkedHashMap = sq50Var.a;
        if (gz50Var != null) {
            linkedHashMap.put(a, gz50Var);
        } else {
            linkedHashMap.remove(a);
        }
    }

    public static final lum c(sls slsVar) {
        return new lum(new jiz0(3), ie01.a, new e350(22, slsVar), je01.a);
    }
}
