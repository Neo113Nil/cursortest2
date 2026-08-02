package xsna;

import android.content.Intent;
import android.view.View;
import androidx.compose.runtime.a;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.SectionNavigationLinksViewHolder;
import com.vk.catalog2.feature.music.ui.holder.MusicMyAudiosCatalogRootVh;
import com.vk.core.view.components.search.VkSearchView;
import com.vk.dto.common.VideoFile;
import com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.profile.design.view.profileheader.UserProfileBaseInfoView;
import com.vk.profile.user.impl.ui.edit.UserEditProfileModalBottomSheet;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vk.video.ui.discovery.minimizable.c;
import xsna.q630;
import xsna.roj0;
import xsna.vdh;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class w61 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ w61(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        ro40 ro40Var;
        String str;
        int i = this.b;
        int i2 = 7;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((x61) obj3).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                o48 o48Var = (o48) obj3;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1556035158, intValue, -1, "com.vk.design.demo.presentation.screens.BottomBarScreenContent.Content.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous>.<anonymous> (BottomBarScreenContent.kt:123)");
                    }
                    o48Var.b(0, aVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 2:
                break;
            case 3:
                vdh.a aVar2 = (vdh.a) obj3;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-761082986, intValue2, -1, "com.vk.profile.community.impl.ui.item.header.priorityblock.services.CommunityPriorityBlockServicesItem.ViewHolder.<anonymous> (CommunityPriorityBlockServicesItem.kt:97)");
                    }
                    rrv0.d(null, null, null, null, kai.c(-1730606127, new zu3(aVar2, 5), aVar3), aVar3, 24576, 15);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 4:
                jai jaiVar = (jai) obj3;
                androidx.compose.runtime.a aVar4 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar4.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-471697193, intValue3, -1, "com.vk.core.compose.modal.ComposeModalBottomSheetBuilder.setContent.<anonymous> (ComposeModalBottomSheetBuilder.kt:39)");
                    }
                    if (cq.i(0, aVar4, jaiVar)) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar4.h();
                }
                break;
            case 5:
                ((xlb0) obj).a();
                ((wfo) obj3).c(((ov70) obj2).a);
                break;
            case 6:
                izs izsVar = (izs) obj3;
                androidx.compose.runtime.a aVar5 = (androidx.compose.runtime.a) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (aVar5.t(intValue4 & 1, (intValue4 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1202157197, intValue4, -1, "com.vk.onboardingscreens.impl.georequest.presentation.view.GeoRequestContent.<anonymous> (GeoRequestContent.kt:34)");
                    }
                    q630 d = txj0.d(q630.a.a, 1.0f);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(1040687336, 0, -1, "com.vk.core.compose.theme.VkTheme.<get-colors> (VkTheme.kt:160)");
                    }
                    ylu0 ylu0Var = (ylu0) aVar5.r(rrv0.a);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    uov0.a(d, null, ylu0Var.getBackground().g, 0L, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, kai.c(1133444454, new dv4(izsVar, i2), aVar5), aVar5, 1572870, 58);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar5.h();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                ((co20) obj3).d(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 8:
                MusicMyAudiosCatalogRootVh musicMyAudiosCatalogRootVh = (MusicMyAudiosCatalogRootVh) obj3;
                if (!musicMyAudiosCatalogRootVh.v && (ro40Var = musicMyAudiosCatalogRootVh.x) != null && (str = musicMyAudiosCatalogRootVh.r) != null) {
                    i4a.b(ro40Var.a, str.equals(ro40Var.d.l()) ? ro40Var.l : ro40Var.m, null, new nk0(17, ro40Var, str));
                }
                break;
            case 9:
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                View view = ((NewsfeedCustomFragment2) obj3).b0;
                if (view != null) {
                    view.setVisibility(booleanValue ? 0 : 8);
                }
                break;
            case 10:
                String str2 = (String) obj2;
                VkSearchView vkSearchView = ((NewsfeedSearchFragment) obj3).T;
                if (vkSearchView != null) {
                    vkSearchView.setHint(str2);
                }
                break;
            case 11:
                ProductsSelectionBottomSheet productsSelectionBottomSheet = (ProductsSelectionBottomSheet) obj3;
                androidx.compose.runtime.a aVar6 = (androidx.compose.runtime.a) obj;
                int intValue5 = ((Integer) obj2).intValue();
                int i3 = ProductsSelectionBottomSheet.u1;
                if (aVar6.t(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(262802109, intValue5, -1, "com.vk.ecomm.products_selection.impl.ProductsSelectionBottomSheet.configureErrorStateView.<anonymous>.<anonymous> (ProductsSelectionBottomSheet.kt:280)");
                    }
                    boolean y = aVar6.y(productsSelectionBottomSheet);
                    Object x = aVar6.x();
                    if (y || x == a.C0011a.a) {
                        x = new wf40(productsSelectionBottomSheet, 19);
                        aVar6.R(x);
                    }
                    wwp.a(0, aVar6, (gzs) x, null);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar6.h();
                }
                break;
            case 12:
                break;
            case 13:
                SectionNavigationLinksViewHolder sectionNavigationLinksViewHolder = (SectionNavigationLinksViewHolder) obj3;
                androidx.compose.runtime.a aVar7 = (androidx.compose.runtime.a) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (aVar7.t(intValue6 & 1, (intValue6 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(2060206904, intValue6, -1, "com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.SectionNavigationLinksViewHolder.createView.<anonymous>.<anonymous> (SectionNavigationLinksViewHolder.kt:52)");
                    }
                    com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.b bVar = (com.vk.catalog2.common.ui.mvp.holder.search.section_navigator_vh.b) ((zak0) sectionNavigationLinksViewHolder.g).getValue();
                    if (bVar == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        rrv0.d(null, null, null, null, kai.c(1919319453, new gx(11, bVar, sectionNavigationLinksViewHolder), aVar7), aVar7, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar7.h();
                }
                break;
            case 14:
                roj0.a aVar8 = (roj0.a) obj3;
                androidx.compose.runtime.a aVar9 = (androidx.compose.runtime.a) obj;
                int intValue7 = ((Integer) obj2).intValue();
                if (aVar9.t(intValue7 & 1, (intValue7 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(473805247, intValue7, -1, "com.vk.video.ui.discovery.minimizable.doc2doc.SimilarVideosHorizontalSkeletonDelegate.ViewHolder.<anonymous> (SimilarVideosHorizontalSkeletonDelegate.kt:49)");
                    }
                    if (!((Boolean) ((zak0) aVar8.m).getValue()).booleanValue()) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        rrv0.e(true, null, null, null, null, null, zki.a, aVar9, 1572870, 62);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar9.h();
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((UserEditProfileModalBottomSheet) obj3).q1.a((Intent) obj);
                break;
            case 16:
                ((Integer) obj2).getClass();
                int i4 = UserProfileBaseInfoView.p;
                ((UserProfileBaseInfoView) obj3).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
            case 17:
                VideoMinimizableDiscoveryFragment videoMinimizableDiscoveryFragment = (VideoMinimizableDiscoveryFragment) obj3;
                boolean booleanValue2 = ((Boolean) obj2).booleanValue();
                int i5 = VideoMinimizableDiscoveryFragment.p1;
                c.c1 c1Var = new c.c1((VideoFile) obj, booleanValue2);
                videoMinimizableDiscoveryFragment.getClass();
                xn50.a.c(videoMinimizableDiscoveryFragment, c1Var);
                break;
            default:
                ((Integer) obj2).getClass();
                mnx0.b((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ w61(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
