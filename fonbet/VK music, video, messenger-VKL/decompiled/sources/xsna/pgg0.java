package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ReviewBlockCell.kt */
/* loaded from: classes18.dex */
public final class pgg0 {
    public static final void a(final rgg0 rgg0Var, final ngg0 ngg0Var, final q630 q630Var, final igg0 igg0Var, final jgg0 jgg0Var, androidx.compose.runtime.a aVar, final int i) {
        androidx.compose.runtime.a M = aVar.M(30235652);
        int i2 = (M.J(rgg0Var) ? 4 : 2) | i | (M.J(ngg0Var) ? 32 : 16) | (M.J(q630Var) ? 256 : 128) | (M.J(igg0Var) ? 2048 : 1024) | (M.J(jgg0Var) ? 16384 : 8192);
        if (M.t(i2 & 1, (i2 & 9363) != 9362)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(30235652, i2, -1, "com.vk.ecomm.design.compose.reviewcell.ReviewBlockCell (ReviewBlockCell.kt:26)");
            }
            q630 f = txj0.f(q630Var, 1.0f);
            a.j g = androidx.compose.foundation.layout.a.g(6);
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(g, dt1.a.n, M, 6);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar3 = q630.a.a;
            rgg0Var.a(txj0.f(aVar3, 1.0f), M, ((i2 << 3) & 112) | 6);
            if (igg0Var == null) {
                M.K(1585829256);
            } else {
                M.K(-1472864871);
                igg0Var.a(txj0.f(aVar3, 1.0f), M, ((i2 >> 6) & 112) | 6);
            }
            M.j();
            if (jgg0Var == null) {
                M.K(1585890760);
            } else {
                M.K(-1472862887);
                jgg0Var.a(txj0.f(aVar3, 1.0f), M, ((i2 >> 9) & 112) | 6);
            }
            M.j();
            ngg0Var.a(txj0.f(aVar3, 1.0f), M, (i2 & 112) | 6);
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wzs(ngg0Var, q630Var, igg0Var, jgg0Var, i) { // from class: xsna.ogg0
                public final /* synthetic */ ngg0 c;
                public final /* synthetic */ q630 d;
                public final /* synthetic */ igg0 e;
                public final /* synthetic */ jgg0 f;

                @Override // xsna.wzs
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int I = ne7.I(1);
                    pgg0.a(rgg0.this, this.c, this.d, this.e, this.f, (androidx.compose.runtime.a) obj, I);
                    return s3q0.a;
                }
            };
        }
    }
}
