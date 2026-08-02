package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: Common.kt */
/* loaded from: classes17.dex */
public final class wkg {
    public static final void a(String str, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-1358860938);
        if ((i & 6) == 0) {
            i2 = i | (M.J(str) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1358860938, i2, -1, "com.vk.core.tool.compose.onboarding.fullscreen.StepText (Common.kt:11)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
            }
            wuv0 wuv0Var = (wuv0) M.r(rrv0.c);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            frv0 frv0Var = wuv0Var.g;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 24;
            yqv0.c(str, s200.H(q630.a.a, f, 36, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8), ylu0Var.getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, frv0Var, M, i2 & 14, 0, 8120);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new vkg(str, i, 0);
        }
    }
}
