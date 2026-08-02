package xsna;

import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import xsna.cri;
import xsna.dt1;
import xsna.tra0;

/* compiled from: Box.kt */
/* loaded from: classes11.dex */
public final class ja8 {
    public static final ph50<dt1, cp10> a = c(true);
    public static final ph50<dt1, cp10> b = c(false);
    public static final a c;

    /* compiled from: Box.kt */
    public static final class a implements cp10 {
        public static final a a = new a();

        @Override // xsna.cp10
        public final dp10 b(ep10 ep10Var, List<? extends zo10> list, long j) {
            return ep10Var.Q(o6j.k(j), o6j.j(j), jgp.b, new rf(7));
        }
    }

    static {
        dt1.a.getClass();
        dt1.a aVar = dt1.a.a;
        c = a.a;
    }

    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-211209833);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-211209833, i2, -1, "androidx.compose.foundation.layout.Box (Box.kt:232)");
            }
            int hashCode = Long.hashCode(n34.n(M));
            q630 c2 = qri.c(M, q630Var);
            sy90 D = M.D();
            cri.h7.getClass();
            LayoutNode.a aVar2 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar2);
            } else {
                M.f();
            }
            k9q0.w(M, c, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c2, cri.a.d);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new ts1(q630Var, i, 1);
        }
    }

    public static final void b(tra0.a aVar, tra0 tra0Var, zo10 zo10Var, LayoutDirection layoutDirection, int i, int i2, dt1 dt1Var) {
        dt1 dt1Var2;
        Object c2 = zo10Var.c();
        ia8 ia8Var = c2 instanceof ia8 ? (ia8) c2 : null;
        tra0.a.w(aVar, tra0Var, ((ia8Var == null || (dt1Var2 = ia8Var.p) == null) ? dt1Var : dt1Var2).a((tra0Var.b << 32) | (tra0Var.c & 4294967295L), (i << 32) | (i2 & 4294967295L), layoutDirection));
    }

    public static final ph50<dt1, cp10> c(boolean z) {
        ph50<dt1, cp10> ph50Var = new ph50<>(9);
        dt1.a.getClass();
        ty6 ty6Var = dt1.a.b;
        ph50Var.p(ty6Var, new ma8(ty6Var, z));
        ty6 ty6Var2 = dt1.a.c;
        ph50Var.p(ty6Var2, new ma8(ty6Var2, z));
        ty6 ty6Var3 = dt1.a.d;
        ph50Var.p(ty6Var3, new ma8(ty6Var3, z));
        ty6 ty6Var4 = dt1.a.e;
        ph50Var.p(ty6Var4, new ma8(ty6Var4, z));
        ty6 ty6Var5 = dt1.a.f;
        ph50Var.p(ty6Var5, new ma8(ty6Var5, z));
        ty6 ty6Var6 = dt1.a.g;
        ph50Var.p(ty6Var6, new ma8(ty6Var6, z));
        ty6 ty6Var7 = dt1.a.h;
        ph50Var.p(ty6Var7, new ma8(ty6Var7, z));
        ty6 ty6Var8 = dt1.a.i;
        ph50Var.p(ty6Var8, new ma8(ty6Var8, z));
        ty6 ty6Var9 = dt1.a.j;
        ph50Var.p(ty6Var9, new ma8(ty6Var9, z));
        return ph50Var;
    }

    public static final cp10 d(dt1 dt1Var, boolean z) {
        cp10 d = (z ? a : b).d(dt1Var);
        return d == null ? new ma8(dt1Var, z) : d;
    }
}
