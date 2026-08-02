package xsna;

import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import org.chromium.net.NetError;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: InterestSkeleton.kt */
/* loaded from: classes4.dex */
public final class odx {
    public static final void a(q630 q630Var, uog0 uog0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(1677464975);
        int i2 = (M.J(q630Var) ? 4 : 2) | i | 16;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            M.V();
            if ((i & 1) == 0 || M.i()) {
                uog0Var = vog0.b(28);
            } else {
                M.h();
            }
            int i3 = i2 & NetError.ERR_SSL_VERSION_OR_CIPHER_MISMATCH;
            M.S();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1677464975, i3, -1, "com.vk.onboardingscreens.impl.recomthemes.presentation.view.SkeletonInterest (InterestSkeleton.kt:29)");
            }
            q630 a = qri.a(txj0.f(q630Var, 1.0f), a5x.a, new qgi(4));
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(androidx.compose.foundation.layout.a.c, dt1.a.o, M, 48);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            q630.a aVar3 = q630.a.a;
            q630 d = rte0.d(txj0.q(aVar3, 72), uog0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 F = s200.F(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, 1, hr80.m(d, ylu0Var.getBackground().x, uog0Var));
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new wb1(17);
                M.R(x);
            }
            ja8.a(xa4.J(F, false, (gzs) x), M, 0);
            f9t.e(txj0.h(aVar3, 15), M, 6);
            q630 h = txj0.h(txj0.v(aVar3, 44), 8);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 2;
            ja8.a(s200.D(hr80.m(h, ylu0Var2.c().a, vog0.b(f)), f), M, 0);
            if (xga0.c(aVar3, 11, M, 6)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h08(q630Var, uog0Var, i, 5);
        }
    }
}
