package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vkontakte.android.R;

/* compiled from: SearchScreenContent.kt */
/* loaded from: classes18.dex */
public final class myh0 {
    public static final void a(gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2, androidx.compose.runtime.a aVar, int i) {
        int i2;
        lg90 c;
        gzs<s3q0> gzsVar3 = gzsVar;
        androidx.compose.runtime.a M = aVar.M(-1339461706);
        if ((i & 6) == 0) {
            i2 = (M.y(gzsVar3) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= M.y(gzsVar2) ? 32 : 16;
        }
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1339461706, i2, -1, "com.vk.design.demo.presentation.screens.SearchScreenToolbar (SearchScreenContent.kt:147)");
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a("Search", null, null, null, null, M, 196614, 30), null, null, null, M, 14);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1616143740, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ArrowLeftOutline28> (VkSdkIcons.kt:100)");
            }
            lg90 b = or.b(M, -45049119, R.drawable.vk_icon_arrow_left_outline_28, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            int i3 = i2;
            TopBar$Before.e a2 = TopBar$Before.e.a.a(b, null, gzsVar3, null, null, null, M, 1572872 | ((i2 << 6) & 896), 58);
            if (((Boolean) M.r(vsx.b)).booleanValue()) {
                M.K(1267504514);
                c = jh.c(qzu0.a, M);
            } else {
                M.K(1267505347);
                c = j8.c(qzu0.a, M);
            }
            com.vk.core.compose.component.topbar.a a3 = d.a.a(d.c.C0760d.a.a(c, null, gzsVar2, null, null, null, M, 1572872 | ((i3 << 3) & 896), 58), null, null, null, M, 24576, 14);
            M = M;
            gzsVar3 = gzsVar;
            muv0.h(a, null, null, null, null, a2, a3, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8094);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new gga(gzsVar3, gzsVar2, i, 4);
        }
    }
}
