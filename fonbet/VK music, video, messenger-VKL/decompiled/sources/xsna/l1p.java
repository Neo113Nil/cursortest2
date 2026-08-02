package xsna;

import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.topbar.TopBar$Before;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.d;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;

/* compiled from: EditStorefrontAlbumTopBarContent.kt */
/* loaded from: classes18.dex */
public final class l1p {
    public static final void a(boolean z, gzs gzsVar, gzs gzsVar2, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        gzs gzsVar3;
        gzs gzsVar4;
        com.vk.core.compose.component.topbar.a aVar2;
        androidx.compose.runtime.a M = aVar.M(-685184817);
        int i2 = (M.l(z) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            gzsVar3 = gzsVar;
            i2 |= M.y(gzsVar3) ? 32 : 16;
        } else {
            gzsVar3 = gzsVar;
        }
        if ((i & 384) == 0) {
            gzsVar4 = gzsVar2;
            i2 |= M.y(gzsVar4) ? 256 : 128;
        } else {
            gzsVar4 = gzsVar2;
        }
        if (M.t(i2 & 1, (i2 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-685184817, i2, -1, "com.vk.ecomm.market.album.compose.EditStorefrontAlbumTopBarContent (EditStorefrontAlbumTopBarContent.kt:19)");
            }
            M.K(-1332597011);
            String N = d370.N(z ? R.string.market_edit_album_title : R.string.market_create_album_title, 0, M);
            M.j();
            Object x = M.x();
            a.C0011a.C0012a c0012a = a.C0011a.a;
            if (x == c0012a) {
                x = new nk(22);
                M.R(x);
            }
            TopBar$Middle.Text a = TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(N, null, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 14), null, null, null, M, 14);
            String N2 = d370.N(R.string.market_edit_album_top_bar_back_description, 0, M);
            Object x2 = M.x();
            if (x2 == c0012a) {
                x2 = new x8m(3);
                M.R(x2);
            }
            TopBar$Before.e a2 = e.a.a(gzsVar3, N2, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x2, 3), M, ((i2 >> 3) & 14) | 196608, 12);
            androidx.compose.runtime.a aVar3 = M;
            if (z) {
                aVar3.K(1639804841);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(983561468, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-Done24> (VkSdkIcons.kt:704)");
                }
                lg90 a3 = pg90.a(R.drawable.vk_icon_done_24, 0, aVar3);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                String N3 = d370.N(R.string.market_edit_album_top_bar_done_description, 0, aVar3);
                Object x3 = aVar3.x();
                if (x3 == c0012a) {
                    x3 = new gv3(23);
                    aVar3.R(x3);
                }
                d.c.C0760d a4 = d.c.C0760d.a.a(a3, N3, gzsVar4, null, null, com.vk.core.compose.component.semantics.b.a(null, (izs) x3, 3), aVar3, 1572872 | (i2 & 896), 24);
                aVar3 = aVar3;
                com.vk.core.compose.component.topbar.a a5 = d.a.a(a4, null, null, null, aVar3, 24576, 14);
                aVar3.j();
                aVar2 = a5;
            } else {
                aVar3.K(1640282551);
                aVar3.j();
                aVar2 = null;
            }
            androidx.compose.runtime.a aVar4 = aVar3;
            muv0.h(a, q630Var, null, null, a2, null, aVar2, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, aVar4, 48, 0, 8108);
            M = aVar4;
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            M.h();
        }
        androidx.compose.runtime.f s = M.s();
        if (s != null) {
            s.d = new k1p(z, gzsVar, gzsVar2, q630Var, i);
        }
    }
}
