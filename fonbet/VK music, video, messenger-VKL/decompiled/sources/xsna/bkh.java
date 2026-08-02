package xsna;

import androidx.compose.material3.SheetValue;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.compose.generated.VkTypographyToken;
import com.vk.core.compose.modal.internal.BottomSheetBehavior;
import com.vk.im.ui.views.ScrollToBottomView;
import com.vk.im.ui.views.StencilLayout;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.Pair;
import xsna.q630;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes5.dex */
public final /* synthetic */ class bkh implements wzs {
    public final /* synthetic */ int b;

    public /* synthetic */ bkh(int i) {
        this.b = i;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        q630.a aVar = q630.a.a;
        switch (i) {
            case 0:
                return new Pair((it80) obj, (it80) obj2);
            case 1:
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(160265364, intValue, -1, "com.vk.profile.community.impl.ui.profile.content.shimmers.market.ComposableSingletons$CommunityProfileContentGoodsShimmerKt.lambda$160265364.<anonymous> (CommunityProfileContentGoodsShimmer.kt:32)");
                    }
                    float f = 10;
                    jih.a(s200.H(q630.a.a, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f, f, 2), aVar2, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 2:
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(318024254, intValue2, -1, "com.vk.games.presentation.catalog.screen.ComposableSingletons$GamesCatalogMainTabScreenKt.lambda$318024254.<anonymous> (GamesCatalogMainTabScreen.kt:111)");
                    }
                    f9t.e(txj0.f(aVar, 1.0f), aVar3, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                return s3q0.a;
            case 3:
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-214101895, intValue3, -1, "com.vk.notifications.list.impl.presentation.base.view.list.ComposableSingletons$NotificationListAppBarKt.lambda$-214101895.<anonymous> (NotificationListAppBar.kt:51)");
                    }
                    f9t.e(txj0.f(aVar, 1.0f), aVar4, 6);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                return s3q0.a;
            case 4:
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1110108481, intValue4, -1, "com.vk.ecomm.storefrontservices.impl.presentation.ui.ComposableSingletons$ServicesItemKt.lambda$1110108481.<anonymous> (ServicesItem.kt:308)");
                    }
                    q630 f2 = txj0.f(aVar, 1.0f);
                    Object x = aVar5.x();
                    if (x == a.C0011a.a) {
                        x = new z90(23);
                        aVar5.R(x);
                    }
                    lqy.a(f2, null, null, null, null, null, false, null, (izs) x, aVar5, 805306374, 510);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                return s3q0.a;
            case 5:
                return new BottomSheetBehavior((com.vk.core.ui.bottomsheet.internal.b) obj, (u080) obj2);
            case 6:
                ((Integer) obj2).getClass();
                vso.b(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 7:
                ((Integer) obj2).getClass();
                t8s.h(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                xd70.a(ne7.I(1), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 9:
                ((ScrollToBottomView) obj).a(((kkm) obj2).f(R.attr.vk_legacy_accent));
                return s3q0.a;
            case 10:
                return (SheetValue) ((zak0) ((gdj0) obj2).d.g).getValue();
            case 11:
                int f3 = ((kkm) obj2).f(R.attr.vk_ui_text_accent);
                float f4 = nts0.D;
                int i2 = StencilLayout.i;
                ((StencilLayout) obj).a(f3, f4, null);
                return s3q0.a;
            case 12:
                return new Pair((u490) obj, (List) obj2);
            default:
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                VkTypographyToken vkTypographyToken = VkTypographyToken.DisplayTitle1;
                aVar6.K(1718529698);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(1718529698, intValue5, -1, "com.vk.core.compose.generated.VkTypographyToken.Companion.matches$delegate.<anonymous>.<anonymous> (VkTypographyToken.kt:197)");
                }
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.f(-473561179, 6, -1, "com.vk.core.compose.theme.VkTheme.<get-typography> (VkTheme.kt:165)");
                }
                wuv0 wuv0Var = (wuv0) aVar6.r(rrv0.c);
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                frv0 frv0Var = wuv0Var.i0;
                if (androidx.compose.runtime.b.d()) {
                    androidx.compose.runtime.b.e();
                }
                aVar6.j();
                return frv0Var;
        }
    }

    public /* synthetic */ bkh(int i, int i2) {
        this.b = i2;
    }
}
