package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import com.vk.catalog2.common.dto.ui.actions.UIBlockActionOpenUrl;
import com.vk.catalog2.common.dto.ui.market.UIBlockMarketGroupInfoItem;
import com.vk.catalog2.common.ui.core.analytics.tracking.SearchEntityAnswerAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.search.SearchEntityVideoPlaylistAnswerVh;
import com.vk.catalog2.common.ui.mvp.holder.market.MarketGroupItemLargeVh;
import com.vk.catalog2.feature.search.dto.ui.UIBlockSearchEntityVideoPlaylist;
import com.vk.clips.design.view.timeline.FragmentActionsView;
import com.vk.newsfeed.posting.impl.domain.model.PermissionType;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.mediapicker.localmedia.LocalMediaPickerFragment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.b;
import xsna.vrh0;
import xsna.xn50;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class k6p implements View.OnClickListener {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ k6p(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [xsna.las] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        View view2;
        Context context;
        Activity h;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((l6p) obj).getClass();
                break;
            case 1:
                vrh0.a aVar = ((zuq) obj).i;
                if (aVar != null) {
                    aVar.e(null);
                    break;
                }
                break;
            case 2:
                FragmentActionsView.a aVar2 = (FragmentActionsView.a) obj;
                s6k s6kVar = aVar2.l;
                ?? r0 = aVar2.n;
                s6kVar.invoke(r0 != 0 ? r0 : null);
                break;
            case 3:
                int i2 = LocalMediaPickerFragment.d0;
                efc0 go = ((LocalMediaPickerFragment) obj).go();
                if (go != null) {
                    go.C(new PostingAction.Permissions.Grant(PermissionType.GalleryView));
                    break;
                }
                break;
            case 4:
                MarketGroupItemLargeVh marketGroupItemLargeVh = (MarketGroupItemLargeVh) obj;
                view.getContext();
                UIBlockMarketGroupInfoItem uIBlockMarketGroupInfoItem = marketGroupItemLargeVh.k;
                if (uIBlockMarketGroupInfoItem != null) {
                    marketGroupItemLargeVh.b.b.d.j(new ru00(uIBlockMarketGroupInfoItem));
                    break;
                }
                break;
            case 5:
                zr80 zr80Var = (zr80) obj;
                UIBlockActionOpenUrl uIBlockActionOpenUrl = zr80Var.d;
                if (uIBlockActionOpenUrl != null) {
                    zr80Var.c.invoke(uIBlockActionOpenUrl);
                    break;
                }
                break;
            case 6:
                SearchEntityVideoPlaylistAnswerVh searchEntityVideoPlaylistAnswerVh = (SearchEntityVideoPlaylistAnswerVh) obj;
                UIBlockSearchEntityVideoPlaylist uIBlockSearchEntityVideoPlaylist = searchEntityVideoPlaylistAnswerVh.n;
                if (uIBlockSearchEntityVideoPlaylist != null && (view2 = searchEntityVideoPlaylistAnswerVh.j) != null && (context = view2.getContext()) != null && (h = e3m.h(context)) != null) {
                    searchEntityVideoPlaylistAnswerVh.b.a(new cfp0(uIBlockSearchEntityVideoPlaylist, new SearchEntityAnswerAnalyticsInfo(SearchEntityAnswerAnalyticsInfo.ClickTarget.Tap)));
                    String str = uIBlockSearchEntityVideoPlaylist.y.e;
                    ydt0.e(searchEntityVideoPlaylistAnswerVh.g.Y(), h, uIBlockSearchEntityVideoPlaylist.B, uIBlockSearchEntityVideoPlaylist.f, str != null ? searchEntityVideoPlaylistAnswerVh.d.b(SchemeStat$EventItem.Type.VIDEO_PLAYLIST, str, false) : null, 8);
                    break;
                }
                break;
            case 7:
                VideoRelatedVideosFragment videoRelatedVideosFragment = (VideoRelatedVideosFragment) obj;
                int i3 = VideoRelatedVideosFragment.n0;
                b.C1985b c1985b = b.C1985b.b;
                videoRelatedVideosFragment.getClass();
                xn50.a.c(videoRelatedVideosFragment, c1985b);
                break;
            default:
                ydz0 ydz0Var = (ydz0) obj;
                ydz0Var.c.a(view, new viy0(4, ydz0Var.x));
                break;
        }
    }
}
