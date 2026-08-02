package xsna;

import android.widget.FrameLayout;
import android.widget.ProgressBar;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.articles.ArticleFragment;
import com.vk.catalog2.common.dto.api.CatalogFilterData;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroupFilter;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.ui.holders.video.group_filter.GroupFilterTileVh;
import com.vk.core.view.ArrowSendButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.dto.common.id.UserId;
import com.vk.dto.user.UserProfile;
import com.vk.dto.user.UserSex;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.lists.DefaultErrorView;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.profile.community.address.impl.presentation.CommunityAddressesFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes15.dex */
public final /* synthetic */ class bo3 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bo3(UIBlockGroupFilter uIBlockGroupFilter, GroupFilterTileVh groupFilterTileVh) {
        this.b = 9;
        this.c = uIBlockGroupFilter;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ImageSize Cb;
        Object obj3;
        switch (this.b) {
            case 0:
                ArticleFragment articleFragment = (ArticleFragment) this.c;
                com.vk.articles.a aVar = articleFragment.m0;
                if (aVar == null || aVar.l) {
                    articleFragment.wo();
                } else {
                    ProgressBar progressBar = articleFragment.f0;
                    if (progressBar != null) {
                        progressBar.setVisibility(4);
                    }
                    FrameLayout frameLayout = articleFragment.e0;
                    if (frameLayout != null) {
                        frameLayout.setVisibility(0);
                    }
                    DefaultErrorView defaultErrorView = articleFragment.g0;
                    if (defaultErrorView != null) {
                        defaultErrorView.setVisibility(4);
                    }
                }
                break;
            case 1:
                kd4 kd4Var = (kd4) this.c;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-963891585, intValue, -1, "com.vk.music.stickyplayer.presentation.components.audiobook.AudioBookBigPlayerControls.Content.<anonymous> (AudioBookBigPlayerControls.kt:38)");
                    }
                    kd4Var.e(0, aVar2);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 2:
                jai jaiVar = (jai) this.c;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1414446638, intValue2, -1, "com.vk.music.stickyplayer.presentation.components.BigPlayerScaffoldLayout.<anonymous>.<anonymous>.<anonymous> (BigPlayerScaffold.kt:543)");
                    }
                    if (cq.i(0, aVar3, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 3:
                UserProfile userProfile = (UserProfile) this.c;
                UserId userId = (UserId) obj;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                if (userId == null) {
                    break;
                } else {
                    long j = userProfile.c.b;
                    String str = userProfile.d;
                    String str2 = userProfile.e;
                    Image image = userProfile.O;
                    if ((image == null || (Cb = image.Cb(iah0.f().widthPixels, true, false)) == null || (r3 = Cb.d.d) == null) && (r3 = userProfile.h) == null) {
                        String str3 = "";
                    }
                    boolean z = userProfile.i == UserSex.FEMALE;
                    boolean z2 = userProfile.B.b;
                    String valueOf = String.valueOf(userProfile.c.b);
                    break;
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                ((o2f) this.c).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 5:
                CommunityAddressesFragment communityAddressesFragment = (CommunityAddressesFragment) this.c;
                int intValue3 = ((Integer) obj).intValue();
                int intValue4 = ((Integer) obj2).intValue();
                int i = intValue3 + communityAddressesFragment.n0;
                communityAddressesFragment.p0 = i;
                communityAddressesFragment.q0 = intValue4;
                int a = iah0.a(8) + i;
                communityAddressesFragment.B0 = a;
                ndr0 ndr0Var = communityAddressesFragment.r0;
                if (ndr0Var != null) {
                    ndr0Var.q(a);
                }
                communityAddressesFragment.to();
                RecyclerView recyclerView = communityAddressesFragment.V;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                int i2 = communityAddressesFragment.m0;
                VkTopBar vkTopBar = communityAddressesFragment.c0;
                recyclerView.setPadding(0, i2, 0, (vkTopBar != null ? vkTopBar : null).getMeasuredHeight() - iah0.a(12));
                break;
            case 6:
                avh avhVar = (avh) this.c;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1140034628, intValue5, -1, "com.vk.profile.core.tabs.ui.videos.CommunityProfileVideoItemViewHolderRedesigned.<anonymous> (CommunityProfileVideoItemViewHolderRedesigned.kt:92)");
                    }
                    rrv0.a(null, null, kai.c(1971599460, new id4(avhVar, 2), aVar4), aVar4, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 7:
                wzs wzsVar = (wzs) this.c;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-2118324901, intValue6, -1, "com.vk.design.demo.presentation.screens.ComposableSingletons$SubnavigationBarScreenContentKt.lambda$1416872206.<anonymous>.<anonymous> (SubnavigationBarScreenContent.kt:482)");
                    }
                    wzsVar.invoke(aVar5, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 8:
                String str4 = (String) obj2;
                VkTopBar vkTopBar2 = ((DiscoverSimilarFeedFragment) this.c).a0;
                if (vkTopBar2 != null) {
                    vkTopBar2.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(tlo0.Companion, str4), null, null, null, null, 30), null, null == true ? 1 : 0, null == true ? 1 : 0, 14));
                }
                break;
            case 9:
                UIBlockGroupFilter uIBlockGroupFilter = (UIBlockGroupFilter) this.c;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                int i3 = 10;
                ArrayList arrayList2 = new ArrayList(c5g.u(arrayList, 10));
                for (UIBlock uIBlock : arrayList) {
                    if ((uIBlock instanceof UIBlockList) && epx.f(uIBlockGroupFilter.B, uIBlock.b)) {
                        UIBlockList uIBlockList2 = (UIBlockList) uIBlock;
                        ArrayList<UIBlock> arrayList3 = uIBlockList2.y;
                        ArrayList arrayList4 = new ArrayList();
                        for (Object obj4 : arrayList3) {
                            if (obj4 instanceof UIBlockGroupFilter) {
                                arrayList4.add(obj4);
                            }
                        }
                        Iterator it = arrayList4.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj3 = it.next();
                                if (((UIBlockGroupFilter) obj3).z.e) {
                                }
                            } else {
                                obj3 = null;
                            }
                        }
                        UIBlockGroupFilter uIBlockGroupFilter2 = (UIBlockGroupFilter) obj3;
                        ArrayList arrayList5 = new ArrayList(c5g.u(arrayList4, i3));
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            UIBlockGroupFilter uIBlockGroupFilter3 = (UIBlockGroupFilter) it2.next();
                            String str5 = uIBlockGroupFilter.b;
                            boolean z3 = false;
                            boolean f = epx.f(str5, uIBlockGroupFilter2 != null ? uIBlockGroupFilter2.b : null) ? false : epx.f(str5, uIBlockGroupFilter3.b);
                            boolean f2 = epx.f(str5, uIBlockGroupFilter2 != null ? uIBlockGroupFilter2.b : null);
                            if (!epx.f(str5, uIBlockGroupFilter2 != null ? uIBlockGroupFilter2.b : null) && !epx.f(str5, uIBlockGroupFilter3.b)) {
                                z3 = true;
                            }
                            arrayList5.add(new UIBlockGroupFilter(uIBlockGroupFilter3.y, CatalogFilterData.zb(uIBlockGroupFilter3.z, null, null, f, 503), CatalogFilterData.zb(uIBlockGroupFilter3.A, null, null, f2, 503), uIBlockGroupFilter3.B, z3));
                        }
                        uIBlock = new UIBlockList(uIBlockList2, arrayList5);
                    }
                    arrayList2.add(uIBlock);
                    i3 = 10;
                }
                break;
            case 10:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) this.c;
                List<? extends hfz> list = (List) obj2;
                RepliesView repliesView = marketItemReviewRepliesFragment.T;
                if (repliesView != null) {
                    repliesView.g(list);
                }
                RepliesView repliesView2 = marketItemReviewRepliesFragment.T;
                if (repliesView2 != null) {
                    repliesView2.c();
                }
                break;
            case 11:
                la10 la10Var = (la10) this.c;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (aVar6.t(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1785335852, intValue7, -1, "com.vk.ecomm.products_multipicker.impl.presentation.view.MarketPickerPageController.<anonymous>.<anonymous> (MarketMultiPickerPageController.kt:82)");
                    }
                    kci.a(((wak0) la10Var.I).getIntValue(), 0, aVar6, la10Var.H);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 12:
                kkm kkmVar = (kkm) obj2;
                ArrowSendButton arrowSendButton = ((xia0) this.c).h;
                if (arrowSendButton == null) {
                    arrowSendButton = null;
                }
                arrowSendButton.setColor(kkmVar.f(R.attr.vk_legacy_accent));
                break;
            case 13:
                break;
            case 14:
                t95 t95Var = (t95) this.c;
                long longValue = ((Long) obj).longValue();
                long longValue2 = ((Long) obj2).longValue();
                if (longValue2 > 0) {
                    t95Var.b.invoke(Float.valueOf(swe0.f(longValue / longValue2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f)));
                }
                break;
            default:
                ((Integer) obj2).getClass();
                uox0.a((List) this.c, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ bo3(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    public /* synthetic */ bo3(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
