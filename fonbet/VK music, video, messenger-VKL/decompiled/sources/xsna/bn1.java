package xsna;

import android.view.View;
import com.vk.catalog2.common.dto.ui.UIBlockGroupsCollection;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionPlayVideosFromBlock;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchEntityAnswerAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.search.SearchEntityVideoPlaylistAnswerVh;
import com.vk.catalog2.common.ui.mvp.holder.group.GroupsRedesignCollectionVh;
import com.vk.catalog2.common.ui.mvp.holder.market.MarketGroupItemLargeVh;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityVideoPlaylist;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.common.links.LaunchContext;
import com.vk.content.design.view.photo.albums.AlbumsHeaderView;
import com.vk.dto.video.VideoAlbum;
import com.vk.ecomm.reviews.impl.allreviews.presentation.MarketAllReviewsTabTypes;
import com.vk.newsfeed.common.PostActions;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.stickers.bonus.catalog.BonusCatalogFragment;
import com.yandex.div.internal.widget.menu.OverflowMenuWrapper;
import one.video.ad.ux.motion.view.OneVideoMotionHeaderView;
import xsna.cs00;
import xsna.p7z0;
import xsna.w19;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class bn1 implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ bn1(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r10v22, types: [com.vk.feed.core.models.news.NewsEntry] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        sws0 a;
        p7z0.f fVar;
        ?? q6;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                AlbumsHeaderView.a aVar = ((AlbumsHeaderView) obj).d;
                if (aVar != null) {
                    aVar.a();
                    break;
                }
                break;
            case 1:
                int i2 = BonusCatalogFragment.f0;
                ((BonusCatalogFragment) obj).io();
                break;
            case 2:
                ((o29) obj).b.invoke(w19.f.b);
                break;
            case 3:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj;
                int i3 = ClipsFavoriteFolderContentListFragment.W;
                clipsFavoriteFolderContentListFragment.getClass();
                xn50.a.c(clipsFavoriteFolderContentListFragment, a.g.b);
                break;
            case 4:
                ((err) obj).a.invoke();
                break;
            case 5:
                GroupsRedesignCollectionVh groupsRedesignCollectionVh = (GroupsRedesignCollectionVh) obj;
                UIBlockGroupsCollection uIBlockGroupsCollection = groupsRedesignCollectionVh.c;
                if (uIBlockGroupsCollection != null) {
                    maz.c((maz) groupsRedesignCollectionVh.d.getValue(), view.getContext(), uIBlockGroupsCollection.C, LaunchContext.A, null, null, 24);
                    break;
                }
                break;
            case 6:
                int i4 = LocalMediaPickerFragment.d0;
                efc0 go = ((LocalMediaPickerFragment) obj).go();
                if (go != null) {
                    go.C(new PostingAction.MediaPicker.SheetTransition(MediaPickerState.SheetState.Hidden));
                    break;
                }
                break;
            case 7:
                ((it00) obj).l.a(new cs00.o(MarketAllReviewsTabTypes.MARKET_ITEM));
                break;
            case 8:
                MarketGroupItemLargeVh marketGroupItemLargeVh = (MarketGroupItemLargeVh) obj;
                view.getContext();
                UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem = marketGroupItemLargeVh.k;
                if (uIBlockMarketGroupInfoItem != null) {
                    marketGroupItemLargeVh.b.b.d.j(new ru00(uIBlockMarketGroupInfoItem));
                    break;
                }
                break;
            case 9:
                xws0 xws0Var = ((OneVideoMotionHeaderView) obj).z;
                if (xws0Var != null && (a = xws0Var.a()) != null) {
                    rws0 rws0Var = a.a;
                    rws0Var.c.clear();
                    n0z0 n0z0Var = (n0z0) rws0Var.b;
                    bsz0 bsz0Var = n0z0Var.d;
                    if (bsz0Var != null && (fVar = n0z0Var.c) != null) {
                        h8z0.e(bsz0Var.a, "closedByUser", 1, null);
                        fVar.a(bsz0Var);
                        n0z0Var.d = null;
                        n0z0Var.e = null;
                        break;
                    }
                }
                break;
            case 10:
                ((OverflowMenuWrapper) obj).lambda$getOnMenuClickListener$0(view);
                break;
            case 11:
                lfb0 lfb0Var = (lfb0) obj;
                lfb0Var.j.setAdapter(lfb0Var.k);
                qfb0 Q0 = lfb0Var.j.Q0();
                int i5 = Q0.j;
                if (i5 == 0) {
                    i5 = 100;
                }
                Q0.tn(0, i5);
                break;
            case 12:
                SearchEntityVideoPlaylistAnswerVh searchEntityVideoPlaylistAnswerVh = (SearchEntityVideoPlaylistAnswerVh) obj;
                UIBlockSearchEntityVideoPlaylist uIBlockSearchEntityVideoPlaylist = searchEntityVideoPlaylistAnswerVh.n;
                VideoAlbum videoAlbum = uIBlockSearchEntityVideoPlaylist != null ? uIBlockSearchEntityVideoPlaylist.B : null;
                UIBlockActionPlayVideosFromBlock uIBlockActionPlayVideosFromBlock = uIBlockSearchEntityVideoPlaylist != null ? uIBlockSearchEntityVideoPlaylist.A : null;
                if (uIBlockSearchEntityVideoPlaylist != null && videoAlbum != null && uIBlockActionPlayVideosFromBlock != null) {
                    searchEntityVideoPlaylistAnswerVh.b.a(new cfp0(uIBlockSearchEntityVideoPlaylist, new SearchEntityAnswerAnalyticsInfo(SearchEntityAnswerAnalyticsInfo.ClickTarget.PlayAll)));
                    searchEntityVideoPlaylistAnswerVh.c.j(new SearchEntityVideoPlaylistAnswerVh.a(uIBlockActionPlayVideosFromBlock, videoAlbum.c, videoAlbum.b));
                    break;
                }
                break;
            case 13:
                myj0 myj0Var = (myj0) obj;
                if (!jjc.b() && (q6 = myj0Var.q6()) != 0) {
                    u1c0 J0 = myj0Var.J0();
                    myj0Var.D.sa(new NewsfeedExternalAction.d.a(q6, myj0Var.t6(), PostActions.ACTION_IGNORE.h(), J0 != null ? J0.k : 0));
                    break;
                }
                break;
            case 14:
                ((gzs) obj).invoke();
                break;
            default:
                ydz0 ydz0Var = (ydz0) obj;
                ydz0Var.c.a(view, new viy0(8, ydz0Var.x));
                break;
        }
    }
}
