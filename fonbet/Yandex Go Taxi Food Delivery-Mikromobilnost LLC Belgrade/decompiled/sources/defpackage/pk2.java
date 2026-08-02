package defpackage;

import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.EmptyList;

/* loaded from: classes10.dex */
public abstract class pk2 {
    public static final Pair a;

    static {
        EmptyList emptyList = EmptyList.a;
        a = new Pair(emptyList, emptyList);
    }

    public static final void a(kk2 kk2Var, List list, fid fidVar, int i) {
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1794596951);
        int i2 = (i & 6) == 0 ? (btsVar.k(kk2Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(list) ? 32 : 16;
        }
        if (btsVar.V(i2 & 1, (i2 & 19) != 18)) {
            int size = list.size();
            for (int i3 = 0; i3 < size; i3++) {
                ik2 ik2Var = (ik2) list.get(i3);
                zls zlsVar = (zls) ik2Var.a;
                int i4 = ik2Var.b;
                int i5 = ik2Var.c;
                Object Q = btsVar.Q();
                if (Q == did.a) {
                    Q = ok2.a;
                    btsVar.o0(Q);
                }
                z910 z910Var = (z910) Q;
                int hashCode = Long.hashCode(btsVar.T);
                r1b0 o = btsVar.o();
                f530 d = b.d(btsVar, c530.a);
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
                qje.W(btsVar, d.f, z910Var);
                qje.W(btsVar, d.e, o);
                qje.W(btsVar, d.g, Integer.valueOf(hashCode));
                qje.M(btsVar, d.h);
                qje.W(btsVar, d.d, d);
                zlsVar.invoke(kk2Var.subSequence(i4, i5).b, btsVar, 0);
                btsVar.t(true);
            }
        } else {
            btsVar.Y();
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new m0(kk2Var, list, i, 19);
        }
    }
}
