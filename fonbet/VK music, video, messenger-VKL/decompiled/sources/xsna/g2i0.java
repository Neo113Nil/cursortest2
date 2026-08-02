package xsna;

import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import org.chromium.base.version_info.VersionConstants;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: SectionTitleSkeleton.kt */
/* loaded from: classes17.dex */
public final class g2i0 {
    public static final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(178429140);
        int i2 = i | 54;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(178429140, i2, -1, "com.vk.games.presentation.components.skeleton.SectionTitleSkeleton (SectionTitleSkeleton.kt:21)");
            }
            q630.a aVar2 = q630.a.a;
            q630 a = wdj0.a(txj0.h(txj0.f(aVar2, 1.0f), 46), null);
            dt1.a.getClass();
            cp10 d = ja8.d(dt1.a.b, false);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, a);
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
            k9q0.w(M, d, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            float f = 16;
            q630 s = txj0.s(s200.H(aVar2, f, 18, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), VersionConstants.PRODUCT_MAJOR_VERSION, f);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (dt.c(hr80.m(s, ylu0Var.c().a, vog0.b(4)), M, 0)) {
                androidx.compose.runtime.b.e();
            }
            q630Var = aVar2;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s2 = M.s();
        if (s2 != null) {
            s2.d = new f2i0(q630Var, i, 0);
        }
    }
}
