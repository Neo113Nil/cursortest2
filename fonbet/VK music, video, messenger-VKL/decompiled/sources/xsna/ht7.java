package xsna;

import android.content.Intent;
import com.vk.core.tool.view.onboarding.VkOnboardingBanner;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Good;
import com.vk.dto.fave.MarketFavable;
import com.vk.im.edu.ui.compose.item.OrganizationItemView;
import com.vk.newsfeed.impl.presentation.newsfeed_geo.presentation.fragment.GeoPostsFragment;
import com.vk.stat.scheme.CommonMarketStat$TypeRefSource;
import com.vkontakte.android.attachments.MarketAttachment;
import xsna.mt00;
import xsna.pbh;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ht7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ ht7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        MarketAttachment marketAttachment;
        Good good;
        int i = this.b;
        int i2 = 7;
        char c = 1;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((kt7) obj3).b(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                break;
            case 2:
                pbh.a aVar = (pbh.a) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1651717310, intValue, -1, "com.vk.profile.community.impl.ui.item.header.CommunityOnboardingBannerItem.CommunityNewOnBoardingHolder.<anonymous> (CommunityOnboardingBannerItem.kt:70)");
                    }
                    rrv0.a(null, null, kai.c(172376342, new it7(aVar, c == true ? 1 : 0), aVar2), aVar2, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 3:
                fuh fuhVar = (fuh) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-881681578, intValue2, -1, "com.vk.profile.community.impl.ui.profile.viewdelegates.CommunityProfileTopBarDelegateBase.<anonymous> (CommunityProfileTopBarDelegates.kt:32)");
                    }
                    fuhVar.n(0, aVar3);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((axq) obj3).c(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 5:
                ((Integer) obj2).getClass();
                t8s.r((fxt0) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 6:
                q3p0 q3p0Var = (q3p0) obj2;
                VkTopBar vkTopBar = ((GeoPostsFragment) obj3).Y;
                if (vkTopBar != null) {
                    VkTopBar.Middle.Text.Title title = new VkTopBar.Middle.Text.Title(q3p0Var.a, (e4) null, (VkTopBar.Middle.Text.Title.a) null, (VkTopBar.Middle.Text.Title.Size) null, 14);
                    String str = q3p0Var.b;
                    vkTopBar.setMiddle(new VkTopBar.Middle.Text(title, str != null ? new VkTopBar.Middle.Text.c(oq.d(tlo0.Companion, str), null, null, 28) : null, null, null, 12));
                }
                break;
            case 7:
                vz00 vz00Var = (vz00) obj3;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                gmq gmqVar = (gmq) obj2;
                if ((gmqVar instanceof MarketFavable) && (marketAttachment = (MarketAttachment) vz00Var.C) != null && (good = marketAttachment.f) != null) {
                    MarketFavable marketFavable = (MarketFavable) gmqVar;
                    if (marketFavable.b == good.b) {
                        good.J = booleanValue;
                        vz00Var.b7(booleanValue);
                        mt00.h(new mt00.a((int) marketFavable.b, marketFavable.c, booleanValue, CommonMarketStat$TypeRefSource.POST, null, null, null, null, null, null, 8176));
                        break;
                    }
                }
                break;
            case 8:
                ((Integer) obj2).getClass();
                ((go20) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int i3 = OrganizationItemView.m;
                ((OrganizationItemView) obj3).o(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 10:
                ((Integer) obj2).getClass();
                kdd0.e((gzs) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 11:
                voj0 voj0Var = (voj0) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-656973640, intValue3, -1, "com.vk.video.ui.discovery.minimizable.recycler.similar.ui.SimilarViewHolder.<anonymous> (SimilarViewHolder.kt:65)");
                    }
                    rrv0.e(true, null, null, null, null, null, kai.c(1685988571, new it7(voj0Var, i2), aVar4), aVar4, 1572870, 62);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 12:
                int intValue4 = ((Integer) obj2).intValue();
                int i4 = d9m0.n1;
                ((d9m0) obj3).startActivityForResult((Intent) obj, intValue4);
                break;
            default:
                ((Integer) obj2).getClass();
                int i5 = VkOnboardingBanner.y;
                ((VkOnboardingBanner) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ ht7(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
