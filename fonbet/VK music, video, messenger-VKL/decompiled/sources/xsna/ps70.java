package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;

/* compiled from: ObtainVerificationToolbar.kt */
/* loaded from: classes18.dex */
public final class ps70 {
    public static final void a(String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a M = aVar.M(-381703088);
        int i2 = i | (M.J(str) ? 4 : 2) | (M.y(gzsVar) ? 32 : 16) | (M.y(gzsVar2) ? 256 : 128);
        if (M.t(i2 & 1, (i2 & 147) != 146)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-381703088, i2, -1, "com.vk.ecomm.verifiedseller.impl.screens.obtainverification.ui.ObtainVerificationToolbar (ObtainVerificationToolbar.kt:17)");
            }
            String N = d370.N(R.string.ecomm_verifiedseller_top_bar_back, 0, M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new q8w(11);
                M.R(x);
            }
            TopBar$Before.e a = e.a.a(gzsVar, N, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, ((i2 >> 3) & 14) | 196608, 12);
            TopBar$Middle.Text a2 = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(905875124, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-InfoCircleOutline28> (VkSdkIcons.kt:1278)");
            }
            lg90 b = or.b(M, 1646480040, R.drawable.vk_icon_info_circle_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a2, null, null, null, a, null, d.a.a(d.c.C0760d.a.a(b, d370.N(R.string.ecomm_verifiedseller_info, 0, M), gzsVar2, null, null, null, M, 1572872 | (i2 & 896), 56), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8110);
            M = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new tnc(i, 5, str, gzsVar, gzsVar2);
        }
    }
}
