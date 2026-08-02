package xsna;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.ads.di.NewsfeedOptionalAdsComponentImpl;
import com.vk.attachpicker.di.AttachPickerComponent;
import com.vk.attachpicker.fragment.gallery.PostingAttachGalleryFragment;
import com.vk.attachpicker.impl.ImagePickerActivity;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.holders.search.SearchStaticMapPreviewVh;
import com.vk.catalog2.feature.music.holders.MusicKidsAgeCategoryVh;
import com.vk.catalog2.feature.music.search.history.di.SearchHistoryRepoComponentImpl;
import com.vk.catalog2.feature.music.ui.holder.MusicShowAllListVh;
import com.vk.documents.impl.SearchDocumentsListFragment;
import com.vk.documents.impl.SearchDocumentsListFragment.c;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.geo.api.data.IconDrawConfig;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.podcast.impl.ui.page.PodcastFragment;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_custom.presentation.fragment.NewsfeedCustomFragment2;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.newsfeed.posting.impl.domain.model.PostingScreenContext;
import com.vk.newsfeed.posting.impl.presentation.base.fragment.PostingFragment;
import com.vk.notifications.list.impl.presentation.base.fragment.list.NotificationListFragment;
import com.vk.photos.root.di.PhotosComponent;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.root.selectalbum.presentation.SelectAlbumBottomSheet;
import com.vk.settings.api.di.ManageCommunitiesNotificationsComponent;
import com.vk.stories.design.view.StoryProgressView;
import com.vk.toggle.features.FeedFeatures;
import com.vkontakte.android.R;
import java.util.concurrent.atomic.AtomicReference;
import xsna.aex;
import xsna.rfa0.l;
import xsna.rhc0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class v100 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ v100(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r2v28, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v31, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                lm50 lm50Var = (lm50) obj;
                return "[apply state] New MVI state [" + fpf0.a(lm50Var.getClass()).l() + "] with data: " + lm50Var + ' ' + x100.a(null);
            case 1:
                xm00 xm00Var = (xm00) obj;
                return new AtomicReference(xm00Var.c.invoke(((AtomicReference) xm00Var.d.getValue()).get()));
            case 2:
                return new e22(new bqz0(new bpn0(new sk4(24))), ((z940) obj).D);
            case 3:
                return ((PlayerAnalyticsComponent) ((k7m) m7m.f((com.vk.catalog2.feature.music.configuration.b) obj)).a(fpf0.a(PlayerAnalyticsComponent.class))).z7();
            case 4:
                return ((BridgeComponent) ((k7m) m7m.f((MusicKidsAgeCategoryVh) obj)).a(fpf0.a(BridgeComponent.class))).p();
            case 5:
                return ((MusicShowAllListVh) obj).v;
            case 6:
                return m33.a(R.drawable.vk_icon_illustration_disclaimer_contraindications_feed_360w, ((bv50) obj).b.getContext());
            case 7:
                return (NewsFeedComponent) ((k7m) m7m.f((fa60) obj)).a(fpf0.a(NewsFeedComponent.class));
            case 8:
                qcy<Object>[] qcyVarArr = NewsfeedCustomFragment2.r0;
                return ((NewsfeedCustomFragment2) obj).fo();
            case 9:
                rm60 rm60Var = (rm60) obj;
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                FeedFeatures feedFeatures = FeedFeatures.FRIEND_LIKES_PHOTO;
                feedFeatures.getClass();
                com.vk.toggle.b bVar = com.vk.toggle.b.A;
                if (!bVar.a(feedFeatures)) {
                    FeedFeatures feedFeatures2 = FeedFeatures.FRIEND_COMMENTS_PHOTO;
                    feedFeatures2.getClass();
                    if (!bVar.a(feedFeatures2)) {
                        return null;
                    }
                }
                RecyclerView recyclerView = rm60Var.a;
                FeedRecyclerView feedRecyclerView = recyclerView instanceof FeedRecyclerView ? (FeedRecyclerView) recyclerView : null;
                if (feedRecyclerView == null) {
                    return null;
                }
                RecyclerView.Adapter adapter = feedRecyclerView.getAdapter();
                ho60 ho60Var = adapter instanceof ho60 ? (ho60) adapter : null;
                if (ho60Var == null) {
                    return null;
                }
                b2r b2rVar = new b2r(feedRecyclerView, ho60Var);
                feedRecyclerView.setOverlayComponentTouchListener(new k290(feedRecyclerView, b2rVar));
                return b2rVar;
            case 10:
                mo60 mo60Var = (mo60) obj;
                return new awy(mo60Var.d, new lo60((AtomicReference) mo60Var.a.b), mo60Var.w);
            case 11:
                return ((NewsfeedOptionalAdsComponentImpl) obj).a.Q8();
            case 12:
                qcy<Object>[] qcyVarArr2 = NewsfeedSearchFragment.p0;
                return ((NewsfeedSearchFragment) obj).fo().a;
            case 13:
                int i2 = NotificationListFragment.a0;
                return ((BridgeComponent) m7m.d((NotificationListFragment) obj).a(fpf0.a(BridgeComponent.class))).i1();
            case 14:
                int i3 = id70.q1;
                return ((ManageCommunitiesNotificationsComponent) m7m.d((id70) obj).mo408a(fpf0.a(ManageCommunitiesNotificationsComponent.class))).a();
            case 15:
                final u2a0 u2a0Var = (u2a0) obj;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: xsna.t2a0
                    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                        u2a0 u2a0Var2 = u2a0.this;
                        ((StoryProgressView) u2a0Var2.r.getValue()).setProgress(floatValue);
                        long j = (long) (15000 * floatValue);
                        aex.a.C2538a c2538a = u2a0Var2.s;
                        if (c2538a != null) {
                            c2538a.a = Long.valueOf(j);
                            c2538a.b = 15000L;
                        }
                    }
                });
                ofFloat.setDuration(5000L);
                u2a0Var.n.getClass();
                ofFloat.setStartDelay(500L);
                return ofFloat;
            case 16:
                int i4 = PhotoFlowFragment.m0;
                return ((PhotoFlowFragment) obj).fo().J3();
            case 17:
                return ((rfa0) obj).new l();
            case 18:
                ((com.vk.video.ui.discovery.minimizable.related_videos.a) obj).a.invoke(com.vk.video.ui.discovery.minimizable.d.b);
                return s3q0.a;
            case 19:
                int i5 = PodcastFragment.m0;
                return ((MusicKidsModeComponent) m7m.d((PodcastFragment) obj).a(fpf0.a(MusicKidsModeComponent.class))).T9();
            case 20:
                String[] strArr = PostViewFragment.T0;
                c9c0 Co = ((PostViewFragment) obj).Co();
                if (Co != null) {
                    ((com.vk.newsfeed.impl.presenters.b) Co).i1(R.id.postviewfragment_options);
                }
                return s3q0.a;
            case 21:
                int i6 = PostingAttachGalleryFragment.p0;
                ((AttachPickerComponent) m7m.d((PostingAttachGalleryFragment) obj).a(fpf0.a(AttachPickerComponent.class))).getClass();
                return ImagePickerActivity.class;
            case 22:
                PostingFragment postingFragment = (PostingFragment) obj;
                int i7 = PostingFragment.L0;
                return ((Posting2Component) ((k7m) m7m.f(postingFragment)).mo408a(fpf0.a(Posting2Component.class))).C9(((PostingScreenContext) ((rbc0) postingFragment.m0.getValue()).m.getValue()).c.toString());
            case 23:
                rhc0 rhc0Var = (rhc0) obj;
                return new yyf(rhc0Var.b, new rhc0.a(rhc0Var.c));
            case 24:
                return ((BridgeComponent) ((k7m) m7m.f((jed0) obj)).a(fpf0.a(BridgeComponent.class))).s();
            case 25:
                jgh0 jgh0Var = (jgh0) obj;
                return Boolean.valueOf(((wak0) jgh0Var.a).getIntValue() < jgh0Var.f());
            case 26:
                int i8 = SearchDocumentsListFragment.h0;
                return ((SearchDocumentsListFragment) obj).new c();
            case 27:
                SearchHistoryRepoComponentImpl searchHistoryRepoComponentImpl = (SearchHistoryRepoComponentImpl) obj;
                return new ivh0(searchHistoryRepoComponentImpl.b.Q0(), searchHistoryRepoComponentImpl.a.a.a());
            case 28:
                return new IconDrawConfig(false, 0, 0, 0, -16777216, -1, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, ((SearchStaticMapPreviewVh) obj).l, 0, true, 28.0f, 30.5f, 0, 12, 573391, null);
            default:
                int i9 = SelectAlbumBottomSheet.p1;
                return ((PhotosComponent) ((k7m) m7m.f((SelectAlbumBottomSheet) obj)).a(fpf0.a(PhotosComponent.class))).d3();
        }
    }

    public /* synthetic */ v100(lm50 lm50Var, x100 x100Var) {
        this.b = 0;
        this.c = lm50Var;
    }
}
