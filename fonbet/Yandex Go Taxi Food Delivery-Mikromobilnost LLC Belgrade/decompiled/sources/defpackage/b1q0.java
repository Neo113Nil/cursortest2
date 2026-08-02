package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.b;
import androidx.compose.ui.node.d;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes11.dex */
public abstract class b1q0 {
    public static final byk0 a = cyk0.c(20.0f);

    public static final void a(c1q0 c1q0Var, a aVar, f530 f530Var, fid fidVar, int i) {
        f530 f530Var2;
        bts btsVar = (bts) fidVar;
        btsVar.g0(-1545119429);
        int i2 = (i & 6) == 0 ? i | (btsVar.k(c1q0Var) ? 4 : 2) : i;
        a aVar2 = aVar;
        if ((i & 48) == 0) {
            i2 |= btsVar.e(aVar2) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (btsVar.V(i3 & 1, (i3 & 147) != 146)) {
            c530 c530Var = c530.a;
            f530 m = an91.m(c530Var, 16.0f, 0.0f, 2);
            byk0 byk0Var = a;
            f530 m2 = an91.m(bzk0.c(ymb1.l(m, byk0Var), AppColor$Palette.BgMinor, byk0Var), 0.0f, 4.0f, 1);
            sic a2 = qic.a(new i43(4.0f, true, new quz(11)), x4c.G, btsVar, 6);
            int hashCode = Long.hashCode(btsVar.T);
            r1b0 o = btsVar.o();
            f530 d = b.d(btsVar, m2);
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
            btsVar.e0(143484169);
            int i4 = 0;
            for (Object obj : c1q0Var.a) {
                int i5 = i4 + 1;
                if (i4 < 0) {
                    scc.m();
                    throw null;
                }
                aVar2.invoke(uic.a, Boolean.valueOf(i4 != scc.f(c1q0Var.a)), (o4q0) obj, btsVar, Integer.valueOf(((i3 << 6) & 7168) | 6));
                aVar2 = aVar;
                i4 = i5;
            }
            btsVar.t(false);
            btsVar.t(true);
            f530Var2 = c530Var;
        } else {
            btsVar.Y();
            f530Var2 = f530Var;
        }
        aii0 v = btsVar.v();
        if (v != null) {
            v.d = new ogo0(c1q0Var, aVar, f530Var2, i, 5);
        }
    }
}
