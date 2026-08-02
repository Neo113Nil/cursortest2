package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;
import xsna.wra0;
import xsna.zra0;

/* compiled from: MarketItemsForReviewComposeErrorScreen.kt */
/* loaded from: classes18.dex */
public final class n510 {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        gzs gzsVar2;
        androidx.compose.runtime.a aVar2;
        q630 q630Var2;
        lg90 a;
        androidx.compose.runtime.a M = aVar.M(-498007081);
        int i2 = i | 6 | (M.y(gzsVar) ? 32 : 16);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-498007081, i2, -1, "com.vk.ecomm.reviews.impl.itemsforreview.presentation.view.MarketItemsForReviewComposeErrorScreen (MarketItemsForReviewComposeErrorScreen.kt:29)");
            }
            q630.a aVar3 = q630.a.a;
            q630 H = s200.H(txj0.f(aVar3, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 54, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 64, 5);
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a2 = androidx.compose.foundation.layout.b.a(mVar, dt1.a.o, M, 54);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, H);
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
            k9q0.w(M, a2, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (we7.m(M)) {
                M.K(759611840);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1060812596, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaDark56> (VkSdkIcons.kt:1084)");
                }
                a = pg90.a(R.drawable.vk_icon_illustration_antenna_dark_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            } else {
                M.K(759682303);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-1159337732, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-IllustrationAntennaLight56> (VkSdkIcons.kt:1088)");
                }
                a = pg90.a(R.drawable.vk_icon_illustration_antenna_light_56, 0, M);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                M.j();
            }
            t8p0 a3 = csa0.a(a, 0L, 0L, null, null, M, 196616, 30);
            String N = d370.N(R.string.market_items_for_review_bottomsheet_error_state_text, 0, M);
            Object x = M.x();
            if (x == a.C0011a.a) {
                x = new y8m(9);
                M.R(x);
            }
            aVar2 = M;
            gzsVar2 = gzsVar;
            ldv0.d(null, a3, zra0.a.a(null, null, N, com.vk.core.compose.component.semantics.b.a(null, (izs) x, 3), M, 196608, 11), wra0.b.a(wra0.a.C3954a.a(d370.N(R.string.market_items_for_review_bottomsheet_error_state_try_again_text, 0, M), gzsVar, ButtonSize.Medium, ButtonStyle.Tertiary, ButtonAppearance.Accent, false, null, null, null, null, null, null, false, false, null, null, aVar2, (i2 & 112) | 28032, 12582912, 131040), null, null, aVar2, 14), null, null, false, aVar2, 0, 113);
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            q630Var2 = aVar3;
        } else {
            gzsVar2 = gzsVar;
            aVar2 = M;
            aVar2.h();
            q630Var2 = q630Var;
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new m510(q630Var2, gzsVar2, i);
        }
    }
}
