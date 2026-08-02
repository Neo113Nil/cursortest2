package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.tool.onboarding.VkTooltip$BalloonPosition;
import com.vk.core.tool.onboarding.VkTooltip$BalloonTilt;
import com.vk.core.tool.onboarding.VkTooltip$MarkerSize;

/* compiled from: CommunityProfileTopBarManageAction.kt */
/* loaded from: classes5.dex */
public final class kuh extends d.b {
    public final wh50 d;
    public final wh50 e;
    public final wh50 f;

    public kuh(String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        this.d = androidx.compose.runtime.k.b(str);
        this.e = androidx.compose.runtime.k.b(gzsVar);
        this.f = androidx.compose.runtime.k.b(gzsVar2);
    }

    @Override // com.vk.core.compose.component.topbar.d.b
    public final void e(mtk0 mtk0Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-1059427856);
        int i2 = (M.J(mtk0Var) ? 32 : 16) | i | (M.J(this) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1059427856, i2, -1, "com.vk.profile.community.impl.ui.profile.widget.topbar.rightaction.CommunityProfileTopBarManageAction.Content (CommunityProfileTopBarManageAction.kt:30)");
            }
            String str = (String) ((zak0) this.d).getValue();
            if (str == null) {
                M.K(-1995415931);
                M.j();
                aVar2 = M;
            } else {
                M.K(-1995415930);
                Object x = M.x();
                if (x == a.C0011a.a) {
                    x = new juh(this);
                    M.R(x);
                }
                wh50 wh50Var = this.f;
                aVar2 = M;
                o9v0.a(str, (juh) x, null, null, VkTooltip$MarkerSize.Size56, null, VkTooltip$BalloonPosition.BottomLeft, VkTooltip$BalloonTilt.Right, (gzs) ((zak0) wh50Var).getValue(), (gzs) ((zak0) wh50Var).getValue(), null, null, null, true, null, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, false, true, kai.c(249812987, new ta8(this, mtk0Var), M), aVar2, 14180400, 905972736, 252972);
                aVar2.j();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new x7d(this, mtk0Var, i, 3);
        }
    }
}
