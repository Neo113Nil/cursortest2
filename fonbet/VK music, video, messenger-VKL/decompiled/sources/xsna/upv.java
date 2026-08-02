package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: IconCard.kt */
/* loaded from: classes18.dex */
public final class upv {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, q630 q630Var, lg90 lg90Var) {
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(1870559268);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(lg90Var) ? 32 : 16) | 384;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1870559268, i2, -1, "com.vk.design.demo.presentation.components.IconCard (IconCard.kt:24)");
            }
            q630.a aVar2 = q630.a.a;
            float f = 2;
            q630 D = s200.D(txj0.f(aVar2, 1.0f), f);
            uog0 b = vog0.b(4);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            iyk0 iyk0Var = rrv0.a;
            ylu0 ylu0Var = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630 a = r18.a(f, ylu0Var.getIcon().a, D, b);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var2 = (ylu0) M.r(iyk0Var);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            uov0.a(a, vog0.b(8), ylu0Var2.getBackground().x, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(-952398165, new mq1(6, lg90Var, str), M), M, 1572864, 56);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar2;
        } else {
            M.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new br0(i, 7, str, lg90Var, q630Var2);
        }
    }
}
