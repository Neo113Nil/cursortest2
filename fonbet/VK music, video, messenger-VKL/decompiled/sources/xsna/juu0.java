package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: VkFeedFooterDonutCounter.kt */
/* loaded from: classes18.dex */
public final class juu0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, gzs gzsVar, q630 q630Var, lg90 lg90Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1379823761);
        int i2 = i | (M.y(lg90Var) ? 4 : 2) | (M.J(str) ? 32 : 16) | (M.y(gzsVar) ? 2048 : 1024);
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1379823761, i2, -1, "com.vk.feed.design.compose.newsfeed.footer.VkFeedFooterDonutCounter (VkFeedFooterDonutCounter.kt:32)");
            }
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = vog0.b(6);
                M.R(x);
            }
            uog0 uog0Var = (uog0) x;
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = ir.h(M);
            }
            sg50 sg50Var = (sg50) x2;
            Object x3 = M.x();
            if (x3 == c0012a) {
                x3 = qer0.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 6, 0L, true);
                M.R(x3);
            }
            q630 b = ojc.b(cuw.a(rte0.d(q630Var, uog0Var), sg50Var, (guw) x3), sg50Var, null, false, null, gzsVar, 28);
            dt1.a.getClass();
            androidx.compose.foundation.layout.k a = androidx.compose.foundation.layout.j.a(androidx.compose.foundation.layout.a.a, dt1.a.l, M, 48);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, b);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            pzu0.b(lg90Var, null, s200.H(q630.a.a, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10), l5g.k, M, (i2 & 14) | 3512, 0);
            M.K(854351323);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.i0;
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            aVar2 = M;
            yqv0.c(str, null, ylu0Var.getText().s, null, null, 0, 0, null, 2, false, 0, 1, null, frv0Var, aVar2, ((i2 >> 3) & 14) | 100663296, 48, 5882);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new m2s0(gzsVar, str, q630Var, lg90Var, i);
        }
    }
}
