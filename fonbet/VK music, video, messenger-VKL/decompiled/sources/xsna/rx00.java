package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import xsna.q630;

/* compiled from: MarketEditAlbumGoodVariantsFragment.kt */
/* loaded from: classes18.dex */
public final class rx00 {
    public static final void a(String str, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        androidx.compose.runtime.a M = aVar.M(100510123);
        int i2 = i | (M.J(str) ? 4 : 2) | 3072;
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(100510123, i2, -1, "com.vk.ecomm.market.album.EditStorefrontAlbumVariantsTopBar (MarketEditAlbumGoodVariantsFragment.kt:168)");
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(str, null, null, null, null, M, (i2 & 14) | 196608, 30), null, null, null, M, 14);
            q630.a aVar3 = q630.a.a;
            q630 E = ahn.E(aVar3, "edit_storefront_album_edit_products_top_bar");
            TopBar$Before.e a2 = e.a.a(gzsVar, d370.N(R.string.market_edit_album_top_bar_back_description, 0, M), null, null, null, M, 196614, 28);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(983561468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done24> (VkSdkIcons.kt:704)");
            }
            lg90 a3 = pg90.a(R.drawable.vk_icon_done_24, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            muv0.h(a, E, null, null, a2, null, d.a.a(d.c.C0760d.a.a(a3, d370.N(R.string.market_edit_album_top_bar_done_description, 0, M), gzsVar2, null, null, null, M, 1573256, 56), null, null, null, M, 24576, 14), null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 0, 0, 8108);
            aVar2 = M;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new qx00(i, str, gzsVar, gzsVar2, q630Var2);
        }
    }
}
