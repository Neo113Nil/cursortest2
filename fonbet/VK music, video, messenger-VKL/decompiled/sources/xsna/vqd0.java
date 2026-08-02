package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ProductNameContent.kt */
/* loaded from: classes18.dex */
public final class vqd0 {
    public final wh50 a;
    public final wh50 b;
    public final wh50 c;
    public final wh50 d;

    public vqd0(String str, lg90 lg90Var, long j, l5g l5gVar) {
        this.a = androidx.compose.runtime.k.b(lg90Var);
        this.b = zy60.d(j);
        this.c = androidx.compose.runtime.k.b(l5gVar);
        this.d = androidx.compose.runtime.k.b(str);
    }

    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(549891569);
        int i2 = i | 6 | (M.J(this) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(549891569, i2, -1, "com.vk.ecomm.design.compose.tile.impl.description.ProductNameContent.Content (ProductNameContent.kt:39)");
            }
            q630.a aVar3 = q630.a.a;
            q630 j = txj0.j(16, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, aVar3);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, j);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            lg90 lg90Var = (lg90) ((zak0) this.a).getValue();
            l5g l5gVar = (l5g) ((zak0) this.c).getValue();
            if (lg90Var == null || l5gVar == null) {
                M.K(175668621);
            } else {
                M.K(177473162);
                pzu0.b(lg90Var, null, ahn.E(mxr.b(2, s200.H(aVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.r, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), false), "product_name_icon"), l5gVar.a, M, 56, 0);
            }
            M.j();
            String str = (String) ((zak0) this.d).getValue();
            q630 E = ahn.E(aVar3, "product_name_description");
            long j2 = ((l5g) ((zak0) this.b).getValue()).a;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.i0;
            aVar2 = M;
            q630Var2 = aVar3;
            yqv0.c(str, E, j2, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar2, 100663344, 48, 5880);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new a6(this, q630Var2, i, 11);
        }
    }
}
