package xsna;

import androidx.compose.foundation.layout.a;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import com.ironsource.X2;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.component.defaults.ButtonAppearance;
import com.vk.core.compose.component.defaults.ButtonSize;
import com.vk.core.compose.component.defaults.ButtonStyle;
import com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment;
import com.vk.music.ui.subscription.BuyMusicSubscriptionButton;
import com.vkontakte.android.R;
import xsna.cri;
import xsna.dt1;
import xsna.g8s;
import xsna.h8s;
import xsna.i8s;
import xsna.q630;
import xsna.q70;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class s70 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s70(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        a.C0011a.C0012a c0012a = a.C0011a.a;
        q630.a aVar = q630.a.a;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((q70.b) obj4).g((znj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 1:
                ((Integer) obj2).getClass();
                ro7.a((mtk0) obj4, (izs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 2:
                BuyMusicSubscriptionButton buyMusicSubscriptionButton = (BuyMusicSubscriptionButton) obj4;
                ys8 ys8Var = (ys8) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                int i2 = BuyMusicSubscriptionButton.z;
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(882113994, intValue, -1, "com.vk.music.ui.subscription.BuyMusicSubscriptionButton.onAttachedToWindow.<anonymous> (BuyMusicSubscriptionButton.kt:61)");
                    }
                    rrv0.d(null, null, null, null, kai.c(1870620783, new xs8(0, buyMusicSubscriptionButton, ys8Var), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 3:
                ((Integer) obj2).getClass();
                bxl.a((String) obj4, (q630) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 4:
                ((Integer) obj2).getClass();
                uwp.a(ne7.I(1), (androidx.compose.runtime.a) obj, (gzs) obj4, (q630) obj3);
                return s3q0.a;
            case 5:
                s53 s53Var = (s53) obj4;
                wh50 wh50Var = (wh50) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2055761095, intValue2, -1, "com.vk.ecomm.cart.impl.common.modal.InputCustomAddressContent.<anonymous> (InputCustomAddressContent.kt:58)");
                    }
                    a.m mVar = androidx.compose.foundation.layout.a.c;
                    dt1.a.getClass();
                    androidx.compose.foundation.layout.c a = androidx.compose.foundation.layout.b.a(mVar, dt1.a.n, aVar3, 0);
                    int hashCode = Long.hashCode(n34.n(aVar3));
                    sy90 D = aVar3.D();
                    q630 c = qri.c(aVar3, aVar);
                    cri.h7.getClass();
                    LayoutNode.a aVar4 = cri.a.b;
                    bly blyVar = null;
                    if (aVar3.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar3.H();
                    if (aVar3.L()) {
                        aVar3.I(aVar4);
                    } else {
                        aVar3.f();
                    }
                    k9q0.w(aVar3, a, cri.a.f);
                    k9q0.w(aVar3, D, cri.a.e);
                    k9q0.w(aVar3, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar3, cri.a.h);
                    k9q0.w(aVar3, c, cri.a.d);
                    String N = d370.N(R.string.ecomm_checkout_delivery_address, 0, aVar3);
                    float f = 16;
                    q630 H = s200.H(txj0.f(ahn.E(aVar, "checkout_custom_address_title"), 1.0f), f, f, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar3.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    long j = ylu0Var.getText().m;
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-473561179, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                    }
                    wuv0 wuv0Var = (wuv0) aVar3.r(rrv0.c);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    yqv0.c(N, H, j, null, null, 0, 3, null, 2, false, 0, 1, null, wuv0Var.C, aVar3, 100663344, 48, 5816);
                    tho0 tho0Var = (tho0) wh50Var.getValue();
                    Object x = aVar3.x();
                    if (x == c0012a) {
                        x = new fk4(1, wh50Var);
                        aVar3.R(x);
                    }
                    ybo0 a2 = g8s.e.a.a(tho0Var, (izs) x, null, null, 2, 8, false, null, null, null, null, aVar3, 221232, 24576, 16332);
                    q630 f2 = txj0.f(ahn.E(aVar, "checkout_custom_address_input"), 1.0f);
                    float f3 = kqu0.b;
                    q630 H2 = s200.H(f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    String N2 = d370.N(R.string.ecomm_checkout_custom_address_subhead, 0, aVar3);
                    if (((tho0) wh50Var.getValue()).a.c.length() >= 350) {
                        aVar3.K(1418294486);
                        blyVar = i8s.a.AbstractC3037a.C3038a.a(((tho0) wh50Var.getValue()).a.c.length(), IronSourceError.ERROR_NT_LOAD_AFTER_INIT_FAILED, null, aVar3, 3120, 4);
                        aVar3.j();
                    } else {
                        aVar3.K(1418514431);
                        aVar3.j();
                    }
                    nvu0.a(a2, H2, h8s.a.a(N2, true, null, blyVar, null, aVar3, 196656, 20), null, null, aVar3, 0, 24);
                    boolean J = aVar3.J(s53Var);
                    Object x2 = aVar3.x();
                    if (J || x2 == c0012a) {
                        x2 = new defpackage.e0(11, s53Var, wh50Var);
                        aVar3.R(x2);
                    }
                    gzs gzsVar = (gzs) x2;
                    ButtonSize buttonSize = ButtonSize.Large;
                    ButtonStyle buttonStyle = ButtonStyle.Primary;
                    ButtonAppearance buttonAppearance = ButtonAppearance.Accent;
                    q630 F = s200.F(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2, txj0.f(ahn.E(aVar, "checkout_custom_address_save_button"), 1.0f));
                    String N3 = d370.N(R.string.ecomm_checkout_save, 0, aVar3);
                    int length = ((tho0) wh50Var.getValue()).a.c.length();
                    bhu0.e(gzsVar, buttonSize, buttonStyle, buttonAppearance, F, null, false, false, null, null, null, N3, null, null, null, null, 3 <= length && length < 701, null, null, null, aVar3, X2.b.f, 0, 0, 4059104);
                    aVar3.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 6:
                q48 q48Var = (q48) obj4;
                MarketItemReviewsFragment marketItemReviewsFragment = (MarketItemReviewsFragment) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                int i3 = MarketItemReviewsFragment.w0;
                if (aVar5.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(559823011, intValue3, -1, "com.vk.ecomm.reviews.impl.marketitem.reviews.presentation.MarketItemReviewsFragment.handleShowOzonReviewsButton.<anonymous>.<anonymous> (MarketItemReviewsFragment.kt:440)");
                    }
                    q630 f4 = txj0.f(aVar, 1.0f);
                    String str = q48Var.a;
                    ButtonSize buttonSize2 = ButtonSize.Large;
                    ButtonStyle buttonStyle2 = ButtonStyle.Outline;
                    ButtonAppearance buttonAppearance2 = ButtonAppearance.Accent;
                    boolean y = aVar5.y(marketItemReviewsFragment) | aVar5.J(q48Var);
                    Object x3 = aVar5.x();
                    if (y || x3 == c0012a) {
                        x3 = new wo1(7, marketItemReviewsFragment, q48Var);
                        aVar5.R(x3);
                    }
                    bhu0.e((gzs) x3, buttonSize2, buttonStyle2, buttonAppearance2, f4, null, false, false, null, null, null, str, null, null, null, null, false, null, null, null, aVar5, 28080, 0, 0, 4190176);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                ((wl20) obj4).a((xpy) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ s70(Object obj, Object obj2, int i, int i2) {
        this.b = i2;
        this.c = obj;
        this.d = obj2;
    }
}
