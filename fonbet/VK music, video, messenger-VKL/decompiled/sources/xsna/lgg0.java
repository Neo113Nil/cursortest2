package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ReviewBlockAttachImpl.kt */
/* loaded from: classes18.dex */
public final class lgg0 implements igg0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c = androidx.compose.runtime.k.b(null);

    public lgg0(kgg0 kgg0Var, izs izsVar) {
        this.a = androidx.compose.runtime.k.b(kgg0Var);
        this.b = androidx.compose.runtime.k.b(izsVar);
    }

    @Override // xsna.igg0
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(-1836281891);
        if ((i & 6) == 0) {
            i2 = (M.J(q630Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1836281891, i2, -1, "com.vk.ecomm.design.compose.reviewcell.ReviewBlockAttachImpl.Content (ReviewBlockAttachImpl.kt:32)");
            }
            float f = 6;
            q630Var2 = q630Var;
            q630 H = s200.H(q630Var2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, 5);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            bjw.a(48, M, ((kgg0) ((zak0) this.a).getValue()).a, (izs) ((zak0) this.b).getValue(), ahn.E(q630.a.a, "review_block_image_attach"));
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            q630Var2 = q630Var;
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new qz5(this, q630Var2, i, 4);
        }
    }
}
