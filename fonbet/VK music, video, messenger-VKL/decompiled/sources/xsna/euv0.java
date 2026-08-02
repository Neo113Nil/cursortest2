package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkTooltipLayout.kt */
/* loaded from: classes17.dex */
public final class euv0 {
    public static final void a(ktv0 ktv0Var, gtv0 gtv0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-197921145);
        int i2 = (M.J(ktv0Var) ? 4 : 2) | i | (M.J(gtv0Var) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-197921145, i2, -1, "com.vk.core.compose.component.tooltip.Tip (VkTooltipLayout.kt:20)");
            }
            pq3.e().getClass();
            long j = eo20.h;
            float c = uco.c(j);
            pq3.e().getClass();
            float f = ktv0Var.f(c, uco.b(j));
            pq3.e().getClass();
            float c2 = uco.c(j);
            pq3.e().getClass();
            q630 s = txj0.s(q630.a.a, f, ktv0Var.e(c2, uco.b(j)));
            long a = gtv0Var.a((i2 >> 3) & 14, M);
            boolean J = M.J(ktv0Var);
            Object x = M.x();
            if (J || x == a.C0011a.a) {
                x = new sz7(ktv0Var, 5);
                M.R(x);
            }
            ja8.a(hr80.m(s, a, new ujt((yzs) x)), M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new ljf(ktv0Var, gtv0Var, i, 10);
        }
    }

    public static final void b(final ktv0 ktv0Var, final gtv0 gtv0Var, final float f, final jai jaiVar, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(-1998283405);
        int i2 = i | (M.J(ktv0Var) ? 4 : 2) | (M.J(gtv0Var) ? 32 : 16) | (M.n(f) ? 256 : 128) | (M.y(jaiVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1998283405, i2, -1, "com.vk.core.compose.component.tooltip.TooltipContentContainer (VkTooltipLayout.kt:47)");
            }
            pq3.e().getClass();
            float f2 = eo20.c;
            pq3.e().getClass();
            q630 E = s200.E(hr80.m(a5j0.b(ktv0Var.d(eo20.h), ((pco) swe0.c(new pco(f), new pco(8))).b, vog0.b(f2), false, 0L, 0L, 24), gtv0Var.a((i2 >> 3) & 14, M), vog0.b(f2)), kqu0.v, kqu0.t);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.f, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, E);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            jaiVar.invoke(ra8.a, M, Integer.valueOf(6 | ((i2 >> 6) & 112)));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(gtv0Var, f, jaiVar, i) { // from class: xsna.duv0
                public final /* synthetic */ gtv0 c;
                public final /* synthetic */ float d;
                public final /* synthetic */ jai e;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    euv0.b(ktv0.this, this.c, this.d, this.e, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
