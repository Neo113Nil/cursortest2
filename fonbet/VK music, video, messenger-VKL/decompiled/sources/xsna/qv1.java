package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkTopBar.kt */
/* loaded from: classes17.dex */
public final class qv1 extends TopBar$Before {
    public final TopBar$Before c;
    public final float d;

    public qv1(TopBar$Before topBar$Before, float f) {
        this.c = topBar$Before;
        this.d = f;
    }

    @Override // com.vk.core.compose.component.topbar.TopBar$Before
    public final void e(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(685520853);
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
                androidx.compose.runtime.b.f(685520853, i2, -1, "com.vk.core.compose.component.AlphaWrapperBefore.Content (VkTopBar.kt:461)");
            }
            float f = this.d;
            if (f > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                M.K(-217670948);
                q630 a = o19.a(q630Var, f);
                dt1.a.getClass();
                cp10 d = ja8.d(dt1.a.b, false);
                int hashCode = Long.hashCode(n34.n(M));
                sy90 D = M.D();
                q630 c = qri.c(M, a);
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
                this.c.e(q630.a.a, M, 6);
                M.G();
            } else {
                M.K(-233407571);
            }
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new pv1(this, q630Var, i, 0);
        }
    }
}
