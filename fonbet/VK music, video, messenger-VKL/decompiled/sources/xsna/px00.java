package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.core.compose.component.topbar.TopBar$Middle;
import com.vk.core.compose.component.topbar.e;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: MarketEditAlbumFinishedFragment.kt */
/* loaded from: classes18.dex */
public final class px00 {
    public static final void a(gzs gzsVar, gzs gzsVar2, gzs gzsVar3, q630 q630Var, androidx.compose.runtime.a aVar, int i) {
        androidx.compose.runtime.a aVar2;
        int i2;
        androidx.compose.runtime.a M = aVar.M(-394634225);
        int i3 = i | 3072;
        if (M.t(i3 & 1, (i3 & 1171) != 1170)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-394634225, i3, -1, "com.vk.ecomm.market.album.EditStorefrontAlbumSuccessScreenContent (MarketEditAlbumFinishedFragment.kt:134)");
            }
            q630.a aVar3 = q630.a.a;
            q630 d = txj0.d(aVar3, 1.0f);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, d);
            cri.h7.getClass();
            LayoutNode.a aVar4 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            cri.a.c cVar = cri.a.f;
            k9q0.w(M, a, cVar);
            cri.a.e eVar = cri.a.e;
            k9q0.w(M, D, eVar);
            Integer valueOf = Integer.valueOf(hashCode);
            cri.a.b bVar = cri.a.g;
            k9q0.w(M, valueOf, bVar);
            cri.a.C2678a c2678a = cri.a.h;
            k9q0.t(M, c2678a);
            cri.a.d dVar = cri.a.d;
            k9q0.w(M, c, dVar);
            muv0.h(TopBar$Middle.Text.b.a(TopBar$Middle.Text.Title.b.a(d370.N(R.string.market_create_album_title, 0, M), null, null, null, null, M, 196608, 30), null, null, null, M, 14), txj0.f(aVar3, 1.0f), null, null, e.a.a(gzsVar, d370.N(R.string.market_edit_album_top_bar_back_description, 0, M), null, null, null, M, 196614, 28), null, null, null, false, 0L, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, M, 48, 0, 8172);
            q630 d2 = txj0.d(aVar3, 1.0f);
            cp10 d3 = ja8.d(dt1.a.f, false);
            int hashCode2 = Long.hashCode(n34.n(M));
            sy90 D2 = M.D();
            q630 c2 = qri.c(M, d2);
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar4);
            } else {
                M.f();
            }
            k9q0.w(M, d3, cVar);
            k9q0.w(M, D2, eVar);
            ur.d(hashCode2, M, bVar, M, c2678a);
            k9q0.w(M, c2, dVar);
            if (androidx.compose.runtime.b.d()) {
                i2 = -1;
                androidx.compose.runtime.b.f(1444785948, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-CheckCircleOutline56> (VkSdkIcons.kt:374)");
            } else {
                i2 = -1;
            }
            lg90 b = or.b(M, 1751086399, R.drawable.vk_icon_check_circle_outline_56, M, 0);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(1040687336, 0, i2, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
            }
            ylu0 ylu0Var = (ylu0) M.r(rrv0.a);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            t8p0 a2 = csa0.a(b, ylu0Var.getIcon().i, 0L, null, null, M, 196616, 28);
            vl20 a3 = zra0.a.a(d370.N(R.string.market_album_created, 0, M), null, d370.N(R.string.market_album_created_description, 0, M), null, M, 196608, 26);
            String N = d370.N(R.string.market_album_promote, 0, M);
            ButtonSize buttonSize = ButtonSize.Small;
            ButtonStyle buttonStyle = ButtonStyle.Primary;
            ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
            q630Var = aVar3;
            ldv0.d(null, a2, a3, wra0.b.a(wra0.a.C3954a.a(N, gzsVar2, buttonSize, buttonStyle, buttonAppearance, false, null, null, null, null, null, null, false, false, null, null, M, 28080, 12582912, 131040), wra0.a.C3954a.a(d370.N(R.string.market_album_skip, 0, M), gzsVar3, buttonSize, ButtonStyle.Tertiary, buttonAppearance, false, null, null, null, null, null, null, false, false, null, null, M, 28080, 12582912, 131040), null, M, 12), null, null, false, M, 0, 113);
            aVar2 = M;
            if (kr.f(aVar2)) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        q630 q630Var2 = q630Var;
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new m8k(gzsVar, gzsVar2, gzsVar3, q630Var2, i);
        }
    }
}
