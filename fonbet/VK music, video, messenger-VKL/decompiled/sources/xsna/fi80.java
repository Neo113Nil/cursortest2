package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: OnboardingTopBarAfter.kt */
/* loaded from: classes18.dex */
public final class fi80 extends com.vk.core.compose.component.topbar.d {
    public final wh50 c;
    public final wh50 d;

    public fi80(z4f z4fVar, zqf zqfVar) {
        this.c = androidx.compose.runtime.k.b(z4fVar);
        this.d = androidx.compose.runtime.k.b(zqfVar);
    }

    @Override // com.vk.core.compose.component.topbar.d
    public final void a(q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a M = aVar.M(-104682767);
        if ((i & 6) == 0) {
            i2 = (M.J(q630.a.a) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.J(this) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-104682767, i2, -1, "com.vk.ecomm.reviews.impl.communities.reviews.ui.view.OnboardingTopBarAfter.Content (OnboardingTopBarAfter.kt:24)");
            }
            String N = d370.N(R.string.pin_review_manage_subscription_hint_text, 0, M);
            boolean z = (i2 & 112) == 32;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new fa00(this, 12);
                M.R(x);
            }
            buv0 z2 = rdi.z(true, (izs) x, null, M, 6, 4);
            wh50 wh50Var = this.d;
            o9v0.a(N, z2, null, null, VkTooltip$MarkerSize.Size56, null, VkTooltip$BalloonPosition.BottomLeft, null, (gzs) ((zak0) wh50Var).getValue(), (gzs) ((zak0) wh50Var).getValue(), null, null, null, false, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, false, kai.c(-1029936386, new com.vk.movika.tools.controls.seekbar.s(this), M), M, 1597440, 805306368, 523436);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new b9q(this, i);
        }
    }
}
