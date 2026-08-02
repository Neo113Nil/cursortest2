package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;

/* loaded from: classes5.dex */
public abstract class ib51 {
    public static final a7u0 a = new a7u0(new q251(7));

    public static final void a(String str, a aVar, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-2100834765);
        int i2 = (btsVar.k(str) ? 4 : 2) | i;
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            oy60 oy60Var = (oy60) btsVar.m(a);
            boolean e = ((i2 & 14) == 4) | btsVar.e(oy60Var);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new e331(22, oy60Var, str);
                btsVar.o0(Q);
            }
            f530 y = eja1.y(c530.a, (tls) Q);
            z910 d = pi6.d(x4c.b, false);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d2 = b.d(btsVar, y);
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
            aVar.invoke(cj6.a, btsVar, 54);
            btsVar.t(true);
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new xe5(str, aVar, i);
        }
    }
}
