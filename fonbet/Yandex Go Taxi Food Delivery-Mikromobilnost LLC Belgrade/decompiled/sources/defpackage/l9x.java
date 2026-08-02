package defpackage;

import androidx.lifecycle.compose.a;

/* loaded from: classes15.dex */
public abstract class l9x {
    public static final void a(int i, fid fidVar, sls slsVar, f530 f530Var) {
        int i2;
        n9x n9xVar;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-401977690);
        if ((i & 6) == 0) {
            i2 = (btsVar.e(slsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= btsVar.k(f530Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= 128;
        }
        if ((i2 & 147) == 146 && btsVar.E()) {
            btsVar.Y();
            aii0 v = btsVar.v();
            if (v != null) {
                v.d = new ve6(slsVar, f530Var, i, 5);
                return;
            }
            return;
        }
        btsVar.a0();
        if ((i & 1) == 0 || btsVar.C()) {
            btsVar.e0(-897180073);
            rs31 b = jjo.b(btsVar);
            hs31 a = jjo.a(btsVar);
            btsVar.e0(544794079);
            boolean e = btsVar.e(a);
            Object Q = btsVar.Q();
            if (e || Q == did.a) {
                Q = new w4(a, 14);
                btsVar.o0(Q);
            }
            tls tlsVar = (tls) Q;
            btsVar.t(false);
            yr31 G = ooc.G(qoi0.a(n9x.class), b, null, vfc.h(n9x.class, new zwv(), tlsVar), b instanceof q7u ? ((q7u) b).getDefaultViewModelCreationExtras() : w8f.b, btsVar);
            btsVar.t(false);
            n9xVar = (n9x) G;
        } else {
            btsVar.Y();
            n9xVar = null;
        }
        btsVar.u();
        a.c(n9xVar.w, null, btsVar, 0, 7);
        btsVar.m(q1z.a).getClass();
        ny61.u();
    }
}
