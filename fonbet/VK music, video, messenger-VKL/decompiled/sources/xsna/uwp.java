package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ErrorState.kt */
/* loaded from: classes5.dex */
public final class uwp {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        q630 q630Var2;
        gzs gzsVar2 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(902177710);
        int i2 = i | (M.y(gzsVar2) ? 4 : 2) | 48;
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(902177710, i2, -1, "com.vk.settings.impl.presentation.base.view.ErrorState (ErrorState.kt:32)");
            }
            q630.a aVar2 = q630.a.a;
            q630 f = txj0.f(aVar2, 1.0f);
            a.c cVar = androidx.compose.foundation.layout.a.e;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(cVar, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, f);
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
            float f2 = 48;
            f9t.e(txj0.h(aVar2, f2), M, 6);
            vqv.a(pg90.a(R.drawable.vk_icon_illustration_antenna_light_56, 0, M), null, txj0.q(aVar2, 56), l5g.k, M, 3512, 0);
            float f3 = 32;
            q630 H = s200.H(txj0.f(aVar2, 1.0f), f3, 12, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
            String N = d370.N(R.string.error_state_title, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.X;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            yqv0.c(N, H, ylu0Var.getText().p, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, 0, 0, 8120);
            f9t.e(txj0.h(aVar2, 16), M, 6);
            gzsVar2 = gzsVar;
            bhu0.e(gzsVar2, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Accent, null, null, false, false, null, null, null, d370.N(R.string.try_again, 0, M), null, null, null, null, false, null, null, null, M, (i2 & 14) | X2.b.f, 0, 0, 4190192);
            M = M;
            q630.a aVar4 = aVar2;
            boolean c2 = xga0.c(aVar4, f2, M, 6);
            q630Var2 = aVar4;
            if (c2) {
                androidx.compose.runtime.b.e();
                q630Var2 = aVar4;
            }
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new s70(gzsVar2, q630Var2, i, 4);
        }
    }
}
