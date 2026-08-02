package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;

/* compiled from: ExplicitTransparentIcon.kt */
/* loaded from: classes3.dex */
public final class w9q {
    public static final void a(int i, int i2, androidx.compose.runtime.a aVar, q630 q630Var) {
        q630 q630Var2;
        int i3;
        androidx.compose.runtime.a M = aVar.M(-378361152);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            q630Var2 = q630Var;
        } else {
            q630Var2 = q630Var;
            i3 = (M.J(q630Var2) ? 4 : 2) | i;
        }
        int i5 = i3 | 48;
        if (M.t(i5 & 1, (i5 & 19) != 18)) {
            q630 q630Var3 = i4 != 0 ? q630.a.a : q630Var2;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-378361152, i5, -1, "com.vk.music.bottomsheets.track.redesigned.presentation.components.ExplicitTransparentIcon (ExplicitTransparentIcon.kt:11)");
            }
            q630 H = s200.H(q630Var3, 4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            M.K(-1762618006);
            qzu0.a.getClass();
            lg90 P = qzu0.P(M);
            M.j();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(P, null, H, ylu0Var.q().d, M, 56, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = q630Var3;
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new v9q(q630Var2, i, i2);
        }
    }
}
