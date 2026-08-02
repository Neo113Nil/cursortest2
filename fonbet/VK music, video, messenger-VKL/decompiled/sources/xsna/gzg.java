package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vkontakte.android.R;

/* compiled from: CommunityCreateReviewView.kt */
/* loaded from: classes18.dex */
public final class gzg {
    public static final void a(int i, androidx.compose.runtime.a aVar, String str, izs izsVar) {
        androidx.compose.runtime.a M = aVar.M(1139802603);
        int i2 = (M.J(str) ? 4 : 2) | i | (M.y(izsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1139802603, i2, -1, "com.vk.ecomm.reviews.impl.communities.createreview.presentation.view.Toolbar (CommunityCreateReviewView.kt:115)");
            }
            nek0 nek0Var = (nek0) M.r(uvi.q);
            TopBar$Before.e eVar = null;
            if (f9k.c(M)) {
                M.K(-151839242);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(976347900, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CancelOutline28> (VkSdkIcons.kt:280)");
                }
                lg90 b = or.b(M, 861936997, R.drawable.vk_icon_cancel_outline_28, M, 0);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N = d370.N(R.string.vk_back, 0, M);
                boolean J = M.J(nek0Var) | ((i2 & 112) == 32);
                Object x = M.x();
                a.C0011a.C0012a c0012a = a.C0011a.a;
                if (J || x == c0012a) {
                    x = new ss3(nek0Var, izsVar);
                    M.R(x);
                }
                gzs gzsVar = (gzs) x;
                Object x2 = M.x();
                if (x2 == c0012a) {
                    x2 = new af2(9);
                    M.R(x2);
                }
                eVar = TopBar$Before.e.a.a(b, N, gzsVar, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, 1572872, 24);
                M.j();
            } else {
                M.K(-151370926);
                M.j();
            }
            TopBar$Before.e eVar2 = eVar;
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            M = M;
            muv0.h(a, null, null, null, null, eVar2, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8158);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new wd0(str, izsVar, i, 4);
        }
    }
}
