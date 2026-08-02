package xsna;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.vk.clips.sdk.shared.api.deps.video.SdkVideoFile;
import com.vk.clips.sdk.shared.api.routing.models.ClipFeedTab;
import com.vk.clips.viewer.api.routing.ClipsRouter;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.discover.VideoDiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverAction;
import com.vk.feed.core.models.discover.DiscoverGridItem;
import com.vk.feed.core.models.discover.DiscoverSimilarClipsAction;
import com.vk.feed.core.models.discover.DiscoverSimilarPostsAction;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.newsfeed.api.NewsfeedRouter;
import com.vk.newsfeed.presentation.model.ExcerptConfigFeatureType;
import com.vk.stat.scheme.CommonVideoStat$TypeScreenMode;
import com.vk.stat.scheme.CommonVideoStat$TypeVideoCardEvent;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.attachments.VideoAttachment;
import com.vkontakte.android.data.PostInteract;
import com.vkontakte.android.data.groups.FullSourceJoinApi;
import java.util.Collections;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.qi6;

/* compiled from: OnDiscoverItemClickListenerImpl.kt */
/* loaded from: classes4.dex */
public final class p580 {
    public final NewsfeedRouter a;
    public qi6.b b;
    public final Object c = msy.a(LazyThreadSafetyMode.NONE, new pm60(2));

    public p580(NewsfeedRouter newsfeedRouter) {
        this.a = newsfeedRouter;
    }

    public static fh5 b(View view) {
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView != null) {
            Object findContainingViewHolder = recyclerView.findContainingViewHolder(view);
            ent0 ent0Var = findContainingViewHolder instanceof ent0 ? (ent0) findContainingViewHolder : null;
            if (ent0Var != null) {
                dnt0 q3 = ent0Var.q3();
                if (q3 instanceof fh5) {
                    return (fh5) q3;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Type inference failed for: r2v7, types: [java.lang.Object, kotlin.Lazy] */
    public final void a(View view, DiscoverGridItem discoverGridItem) {
        View view2;
        int childAdapterPosition;
        fh5 b;
        NewsEntry newsEntry = discoverGridItem.c;
        ViewParent parent = view.getParent();
        RecyclerView recyclerView = parent instanceof RecyclerView ? (RecyclerView) parent : null;
        if (recyclerView == null) {
            childAdapterPosition = -1;
            view2 = view;
        } else {
            view2 = view;
            childAdapterPosition = recyclerView.getChildAdapterPosition(view2);
        }
        if (childAdapterPosition < 0) {
            childAdapterPosition = 0;
        }
        UiTracker uiTracker = UiTracker.a;
        new bjc(UiTracker.c(), SchemeStat$TypeClick.a.a(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CLICK_ITEM, null, null, null, null, null, 62, null), Integer.valueOf(childAdapterPosition), new MobileOfficialAppsFeedStat$TypeFeedMediaDiscoverItem(newsEntry.Cb().b))).q();
        DiscoverAction discoverAction = discoverGridItem.i;
        if (!(discoverAction instanceof DiscoverSimilarClipsAction)) {
            if (discoverAction instanceof DiscoverSimilarPostsAction) {
                Post R = di60.R(newsEntry);
                Context context = view2.getContext();
                DiscoverSimilarPostsAction discoverSimilarPostsAction = (DiscoverSimilarPostsAction) discoverAction;
                String str = discoverSimilarPostsAction.c;
                if (str == null) {
                    return;
                }
                String str2 = discoverSimilarPostsAction.b;
                List singletonList = R != null ? Collections.singletonList(R) : EmptyList.b;
                String d = UiTracker.d();
                String a = com.vk.stat.scheme.t0.a(MobileOfficialAppsCoreNavStat$EventScreen.DISCOVER_MEDIA_SIMILAR_NEWS);
                bpn0 bpn0Var = cqm0.a;
                if (str2 == null) {
                    str2 = "";
                }
                this.a.p(context, new NewsfeedRouter.d(str, singletonList, null, d, a, str2, ExcerptConfigFeatureType.DiscoverMediaPost, R != null ? R.L.b : null));
                return;
            }
            return;
        }
        if (discoverGridItem instanceof VideoDiscoverGridItem) {
            DiscoverSimilarClipsAction discoverSimilarClipsAction = (DiscoverSimilarClipsAction) discoverAction;
            pkd f = g620.f();
            VideoAttachment videoAttachment = ((VideoDiscoverGridItem) discoverGridItem).j;
            if (f.d(videoAttachment.k)) {
                String str3 = (((Boolean) this.c.getValue()).booleanValue() && di60.G(videoAttachment)) ? "ozon_block_similar" : "feed_discover_similar";
                String r = videoAttachment.k.r();
                if (r != null) {
                    SchemeStat$TypeClick b2 = SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(SchemeStat$EventItem.Type.CATALOG_ITEM, null, null, null, r, null, 46, null), new CommonVideoStat$TypeVideoCardEvent(CommonVideoStat$TypeVideoCardEvent.EventType.CLICK, CommonVideoStat$TypeScreenMode.PREVIEW), 2);
                    UiTracker uiTracker2 = UiTracker.a;
                    MobileOfficialAppsCoreNavStat$EventScreen c = UiTracker.c();
                    uzp0 uzp0Var = UiTracker.h;
                    uzp0Var.getClass();
                    new bjc(c, b2, uzp0Var.a).q();
                }
                com.vk.libvideo.autoplay.e eVar = com.vk.libvideo.autoplay.e.a;
                if (!com.vk.libvideo.autoplay.e.c()) {
                    com.vk.libvideo.autoplay.e.e(false);
                }
                SdkVideoFile c2 = g620.f().e0().c(videoAttachment.k);
                ClipsRouter a2 = g620.f().a();
                Context context2 = view2.getContext();
                String str4 = discoverSimilarClipsAction.b;
                String i = FullSourceJoinApi.EntryServiceType.DISCOVER.i();
                ClipsRouter.c(a2, context2, Collections.singletonList(new ClipFeedTab.NewsfeedDiscoverMedia(c2, str4, str3, false, i != null ? new ClipFeedTab.WithPayload.Payload(pn00.i(new Pair("entry_service", i))) : null, 8, null)), b(view2), null, null, null, null, false, null, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            } else {
                Activity h = e3m.h(view2.getContext());
                if (h != null && (b = b(view2)) != null) {
                    uc.r(b, h, true, discoverSimilarClipsAction.b, null, null, null, 224);
                }
            }
            PostInteract postInteract = videoAttachment.g;
            if (postInteract != null) {
                postInteract.zb(PostInteract.Type.video_start);
            }
        }
    }
}
