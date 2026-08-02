package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: MarketRatingBlock.kt */
/* loaded from: classes18.dex */
public final class sd10 {
    public static final void a(cye0 cye0Var, q630 q630Var, wxe0 wxe0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-2080349243);
        int i2 = (M.J(cye0Var) ? 4 : 2) | i | 384 | (M.J(wxe0Var) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2080349243, i2, -1, "com.vk.ecomm.design.compose.ratingblock.MarketRatingBlock (MarketRatingBlock.kt:36)");
            }
            float f = 12;
            q630 d = rte0.d(txj0.f(q630Var, 1.0f), vog0.b(f));
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f2 = 4;
            q630 E = s200.E(hr80.m(d, ylu0Var.getBackground().B, androidx.compose.ui.graphics.e.a), f, f2);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
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
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            cye0Var.a(((i2 << 3) & 112) | 6, M);
            M.K(315957522);
            M.j();
            if (wxe0Var == null) {
                M.K(316190642);
            } else {
                M.K(316190643);
                q630.a aVar3 = q630.a.a;
                f9t.e(txj0.h(aVar3, f2), M, 6);
                jqu0.a(txj0.f(aVar3, 1.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 6, 14);
                f9t.e(txj0.h(aVar3, 8), M, 6);
                wxe0Var.a(6, M);
            }
            M.j();
            M.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new an7(i, 4, cye0Var, q630Var, wxe0Var);
        }
    }
}
