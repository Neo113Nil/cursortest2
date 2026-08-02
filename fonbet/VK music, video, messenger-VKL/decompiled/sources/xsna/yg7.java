package xsna;

import androidx.compose.runtime.a;
import com.vk.attachpicker.PhotoVideoAttachActivity;
import com.vk.attachpicker.fragment.gallery.GalleryFragmentImpl;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockList;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.clips.design.view.component.badge.ClipBadge;
import com.vk.clips.sdk.shared.item.static_ads.StaticAdsItemPatch;
import com.vk.common.presentation.base.view.swiperefreshlayout.SwipeDrawableRefreshLayout;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.reviews.impl.marketitem.replies.presentation.MarketItemReviewRepliesFragment;
import com.vk.ecomm.reviews.impl.replies.presentation.view.RepliesView;
import com.vk.newsfeed.common.presentation.newsfeed.ListLoadingState;
import com.vk.newsfeed.impl.presentation.similar.presentation.fragment.DiscoverSimilarFeedFragment;
import com.vk.profile.core.tabs.ui.clips.Clips;
import com.vk.search.params.api.VkGroupsSearchParams;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import xsna.loh0;
import xsna.wae;
import xsna.wk50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class yg7 implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yg7(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.wzs
    public final Object invoke(Object obj, Object obj2) {
        int i = this.b;
        Object obj3 = null;
        int i2 = 2;
        int i3 = -1;
        int i4 = 0;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                ((bh7) obj4).d(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ((zp8) obj4).a(ne7.I(7), (androidx.compose.runtime.a) obj);
                break;
            case 2:
                ClipBadge clipBadge = (ClipBadge) obj4;
                VkImageSimple vkImageSimple = (VkImageSimple) obj;
                rzt0 rzt0Var = (rzt0) obj2;
                float f = 0;
                vkImageSimple.setPadding(e3m.a(R.dimen.vk_ui_spacing_size2_xs, clipBadge.getContext()), iah0.a(f), e3m.a(R.dimen.vk_ui_spacing_size_s, clipBadge.getContext()), iah0.a(f));
                if (rzt0Var instanceof wae.a) {
                    vkImageSimple.setImageResource(((wae.a) rzt0Var).a);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                r1h.a((loh0.d.a) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 4:
                Clips clips = (Clips) obj4;
                androidx.compose.runtime.a aVar = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(740102968, intValue, -1, "com.vk.profile.core.tabs.ui.clips.CommunityProfileContentClipsViewHolder.setupShimmers.<anonymous>.<anonymous> (CommunityProfileContentClipsViewHolder.kt:271)");
                    }
                    tth.a(null, kai.c(1270329597, new uq5(clips, i2), aVar), aVar, 48);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar.h();
                }
                break;
            case 5:
                ((Integer) obj).getClass();
                zak0 zak0Var = (zak0) ((f1i) obj4).j1;
                VkGroupsSearchParams copy = ((VkGroupsSearchParams) zak0Var.getValue()).copy();
                copy.d = (VkGroupsSearchParams.SortType) obj2;
                zak0Var.setValue(copy);
                break;
            case 6:
                DiscoverSimilarFeedFragment discoverSimilarFeedFragment = (DiscoverSimilarFeedFragment) obj4;
                ListLoadingState listLoadingState = (ListLoadingState) obj2;
                qcy<Object>[] qcyVarArr = DiscoverSimilarFeedFragment.s0;
                boolean z = listLoadingState == ListLoadingState.REFRESHING;
                SwipeDrawableRefreshLayout swipeDrawableRefreshLayout = discoverSimilarFeedFragment.c0;
                if (swipeDrawableRefreshLayout != null) {
                    swipeDrawableRefreshLayout.setRefreshing(z);
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                cfp.b((q630) obj4, (androidx.compose.runtime.a) obj, ne7.I(1));
                break;
            case 8:
                mww mwwVar = (mww) obj4;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (aVar2.t(intValue2 & 1, (intValue2 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1795707902, intValue2, -1, "com.vk.ecomm.market.good.ui.holder.InfoWithImageHolder.onBind.<anonymous>.<anonymous> (InfoWithImageHolder.kt:39)");
                    }
                    boolean J = aVar2.J(mwwVar);
                    Object x = aVar2.x();
                    if (J || x == a.C0011a.a) {
                        x = new c5f(mwwVar, 27);
                        aVar2.R(x);
                    }
                    oww.a(mwwVar, (gzs) x, null, aVar2, 0);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                break;
            case 9:
                MarketItemReviewRepliesFragment marketItemReviewRepliesFragment = (MarketItemReviewRepliesFragment) obj4;
                if (((Boolean) obj2).booleanValue()) {
                    qcy<Object>[] qcyVarArr2 = MarketItemReviewRepliesFragment.b0;
                } else {
                    RepliesView repliesView = marketItemReviewRepliesFragment.T;
                    if (repliesView != null) {
                        repliesView.d();
                    }
                }
                break;
            case 10:
                int i5 = PhotoVideoAttachActivity.g0;
                ((GalleryFragmentImpl) obj4).Qg(((Integer) obj).intValue(), (Integer) obj2);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ((gxa0) obj4).a(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            case 12:
                mjd0 mjd0Var = (mjd0) obj4;
                androidx.compose.runtime.a aVar3 = (androidx.compose.runtime.a) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (aVar3.t(intValue3 & 1, (intValue3 & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1208405076, intValue3, -1, "com.vk.ecomm.market.good.ui.holder.ProductCardBannerHolder.onBind.<anonymous> (ProductCardBannerHolder.kt:35)");
                    }
                    if (mjd0Var == null) {
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                        break;
                    } else {
                        rrv0.d(null, null, null, null, kai.c(1905980071, new jd4(mjd0Var, 12), aVar3), aVar3, 24576, 15);
                        if (androidx.compose.runtime.b.d()) {
                            androidx.compose.runtime.b.e();
                        }
                    }
                } else {
                    aVar3.h();
                }
                break;
            case 13:
                ((wk50.a) obj4).b(new StaticAdsItemPatch.a.b((cut0) obj, (cut0) obj2));
                break;
            case 14:
                VideoAlbum videoAlbum = (VideoAlbum) obj4;
                UIBlockList uIBlockList = (UIBlockList) obj;
                ArrayList<UIBlock> arrayList = uIBlockList.y;
                Iterator<T> it = arrayList.iterator();
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        UIBlock uIBlock = (UIBlock) next;
                        if ((uIBlock instanceof UIBlockList) && uIBlock.h.contains("albums_remove")) {
                            obj3 = next;
                        }
                    }
                }
                UIBlock uIBlock2 = (UIBlock) obj3;
                if (uIBlock2 != null) {
                    ArrayList<UIBlock> arrayList2 = ((UIBlockList) uIBlock2).y;
                    Iterator<UIBlock> it2 = arrayList2.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            if (((UIBlockVideoAlbum) it2.next()).y.b == videoAlbum.b) {
                                i3 = i4;
                            } else {
                                i4++;
                            }
                        }
                    }
                }
                break;
            case 15:
                ((Integer) obj2).getClass();
                ((tet0) obj4).o(ne7.I(1), (androidx.compose.runtime.a) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                ((m8v0) obj4).A(ne7.I(9), (androidx.compose.runtime.a) obj);
                break;
        }
        return s3q0.a;
    }

    public /* synthetic */ yg7(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
