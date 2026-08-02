package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: ReviewFriendsComposeView.kt */
/* loaded from: classes18.dex */
public final class lhg0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, izs izsVar) {
        androidx.compose.runtime.a M = aVar.M(-2078665338);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-2078665338, i2, -1, "com.vk.ecomm.reviews.impl.reviewfriends.presentation.content.Toolbar (ReviewFriendsComposeView.kt:105)");
            }
            TopBar$Before.e eVar = null;
            if (f9k.c(M)) {
                M.K(-680396604);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                }
                lg90 b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.vk_accessibility_back, 0, M);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (x == c0012a) {
                    x = new j6e0(2);
                    M.R(x);
                }
                com.vk.core.compose.component.semantics.a a = com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3);
                boolean z = (i2 & 112) == 32;
                Object x2 = M.x();
                if (z || x2 == c0012a) {
                    x2 = new f3(izsVar, 9);
                    M.R(x2);
                }
                eVar = TopBar$Before.e.a.a(b, N, (gzs) x2, null, null, a, M, 1572872, 24);
                M.j();
            } else {
                M.K(-679967689);
                M.j();
            }
            TopBar$Before.e eVar2 = eVar;
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            M = M;
            muv0.h(a2, q630.a.a, null, null, null, eVar2, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8156);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new h08(str, izsVar, i, 10);
        }
    }
}
