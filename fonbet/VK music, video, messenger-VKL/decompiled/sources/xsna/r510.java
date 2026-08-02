package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: MarketItemsForReviewComposeScreen.kt */
/* loaded from: classes18.dex */
public final class r510 {
    public static final void a(izs<? super e510, s3q0> izsVar, androidx.compose.runtime.a aVar, int i) {
        int i2;
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-2121565289);
        if ((i & 6) == 0) {
            i2 = (M.y(izsVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (M.t(i2 & 1, (i2 & 3) != 2)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2121565289, i2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.Toolbar (MarketItemsForReviewComposeScreen.kt:93)");
            }
            q630 H = s200.H(q630.a.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10, 7);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
            }
            lg90 b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            String N = d370.N(R.string.close, 0, M);
            boolean z = (i2 & 14) == 4;
            Object x = M.x();
            if (z || x == a.C0011a.a) {
                x = new fr0(izsVar, 3);
                M.R(x);
            }
            aVar2 = M;
            muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.market_items_for_review_bottomsheet_title_text, 0, M), null, null, null, null, aVar2, 196608, 30), null, null, null, aVar2, 14), H, null, null, null, TopBar$Before.e.a.a(b, N, (gzs) x, null, null, null, M, 1572872, 56), null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar2, 48, 0, 8156);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new ms3(izsVar, i, 2);
        }
    }
}
