package xsna;

import com.unity3d.services.UnityAdsConstants;
import xsna.q630;
import xsna.uhg0;

/* compiled from: ReviewFriendsComposeView.kt */
/* loaded from: classes18.dex */
public final class khg0 extends i6v0<uhg0, ehg0> {
    @Override // xsna.xpo0
    public final /* bridge */ /* synthetic */ void a(ao50 ao50Var, izs izsVar, androidx.compose.runtime.a aVar) {
        h((uhg0) ao50Var, izsVar, aVar, 512);
    }

    public final void h(uhg0 uhg0Var, izs<? super ehg0, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-268445080);
        int i2 = i | (M.J(uhg0Var) ? 4 : 2) | (M.y(izsVar) ? 32 : 16) | (M.y(this) ? 256 : 128);
        int i3 = 1;
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-268445080, i2, -1, "com.vk.ecomm.reviews.impl.reviewfriends.presentation.content.ReviewFriendsComposeView.ThemedContent (ReviewFriendsComposeView.kt:37)");
            }
            wh50 d = d(uhg0.c.a, new n0u0[]{uhg0Var.c, uhg0Var.a, uhg0Var.b}, M, (i2 & 896) | 518);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            float f = 12;
            aVar2 = M;
            phv0.b(rte0.d(q630.a.a, vog0.d(f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12)), kai.c(-294644689, new oa5(izsVar, 9), M), null, null, null, 0, ylu0Var.getBackground().g, 0L, kai.c(993283012, new f220(d, this, izsVar, i3), M), aVar2, 805306416, 380);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new i87(i, 6, this, uhg0Var, izsVar);
        }
    }
}
