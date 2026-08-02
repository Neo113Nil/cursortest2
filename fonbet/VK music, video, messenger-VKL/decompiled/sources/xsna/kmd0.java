package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.ui.node.LayoutNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.q630;

/* compiled from: ProductCardRejectDetailsBottomSheet.kt */
/* loaded from: classes18.dex */
public final class kmd0 {
    public static final void a(int i, androidx.compose.runtime.a aVar, gzs gzsVar, q630 q630Var) {
        androidx.compose.runtime.a aVar2;
        androidx.compose.runtime.a M = aVar.M(2142980642);
        int i2 = i | (M.y(gzsVar) ? 4 : 2);
        if (M.t(i2 & 1, (i2 & 19) != 18)) {
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(2142980642, i2, -1, "com.vk.ecomm.market.good.ui.holder.reject.RejectInfoBottomSheetContent (ProductCardRejectDetailsBottomSheet.kt:74)");
            }
            a.m mVar = androidx.compose.foundation.layout.a.c;
            dt1.a.getClass();
            androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, M, 0);
            int hashCode = Long.hashCode(n34.n(M));
            sy90 D = M.D();
            q630 c = qri.c(M, q630Var);
            cri.h7.getClass();
            LayoutNode.a aVar3 = cri.a.b;
            if (M.N() == null) {
                n34.r();
                throw null;
            }
            M.H();
            if (M.L()) {
                M.I(aVar3);
            } else {
                M.f();
            }
            k9q0.w(M, a, cri.a.f);
            k9q0.w(M, D, cri.a.e);
            k9q0.w(M, Integer.valueOf(hashCode), cri.a.g);
            k9q0.t(M, cri.a.h);
            k9q0.w(M, c, cri.a.d);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1223610404, 0, -1, "com.vk.core.compose.icons.generated.VkSdkIcons.<get-ErrorOutline56> (VkSdkIcons.kt:814)");
            }
            lg90 a2 = pg90.a(R.drawable.vk_icon_error_outline_56, 0, M);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            pzu0.b(a2, null, s200.H(new gcv(dt1.a.o), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getIcon().a, M, 56, 0);
            String N = d370.N(R.string.reject_info_title, 0, M);
            float f = kqu0.w;
            q630.a aVar4 = q630.a.a;
            yqv0.c(N, txj0.f(s200.H(aVar4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), wlb0.h(M).getText().m, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).C, M, 0, 0, 8120);
            yqv0.c(d370.N(R.string.reject_info_description, 0, M), s200.H(txj0.f(ahn.E(aVar4, "product_card_reject_details_message"), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kqu0.t, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), wlb0.h(M).getText().r, null, null, 0, 3, null, 0, false, 0, 0, null, wlb0.l(M).i0, M, 0, 0, 8120);
            bhu0.e(gzsVar, ButtonSize.Large, ButtonStyle.Primary, ButtonAppearance.Accent, txj0.f(s200.H(ahn.E(aVar4, "product_card_reject_details_understand_button"), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 32, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), 1.0f), null, false, false, null, null, null, d370.N(R.string.reject_info_understand, 0, M), null, null, null, null, false, null, null, null, M, (i2 & 14) | 28080, 0, 0, 4190176);
            aVar2 = M;
            aVar2.G();
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
        } else {
            aVar2 = M;
            aVar2.h();
        }
        androidx.compose.runtime.f s = aVar2.s();
        if (s != null) {
            s.d = new onb(gzsVar, q630Var, i, 5);
        }
    }
}
