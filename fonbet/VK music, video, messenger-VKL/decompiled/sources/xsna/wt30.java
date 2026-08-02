package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.app.ActivityOptions;
import android.app.PendingIntent;
import android.app.RemoteAction;
import android.content.Context;
import android.os.Build;
import android.os.SystemClock;
import android.util.Log;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.ui.holders.analytics.MusicAnalyticsInfo;
import com.vk.catalog2.common.ui.holders.api.search.SearchStatInfoProvider;
import com.vk.catalog2.common.ui.mvp.holder.container.ShowAllListRootVh;
import com.vk.catalog2.common.ui.mvp.holder.video.QuestionnaireVh;
import com.vk.catalog2.feature.music.holders.MusicPlaylistCellVh;
import com.vk.clips.internal.nps.api.di.ClipsInternalNpsComponent;
import com.vk.core.view.components.cell.VkCell;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.Playlist;
import com.vk.dto.podcast.PodcastPage;
import com.vk.ecomm.reviews.api.di.ReviewsComponent;
import com.vk.feed.settings.impl.presentation.filtered.NewsfeedFilteredSourcesFragment;
import com.vk.musc.kidsmode.api.di.MusicKidsModeComponent;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.analytics.api.di.PlayerAnalyticsComponent;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.music.snippet.api.di.AudioSnippetComponent;
import com.vk.music.snippet.api.player.SnippetPlayerMode;
import com.vk.newsfeed.common.recycler.holders.attachments.market.FeedGoodsPhotoHolder;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.newsfeed.impl.presentation.suggested.presentation.fragment.SuggestedPostsFragment;
import com.vk.poll.views.PollSettingView;
import com.vk.posting.di.PostingComponent;
import com.vk.queuesync.sync.models.SuperAppQueueAccessException;
import com.vk.search.communities.map.impl.ui.details.SearchCommunitiesOnMapDetailsFragment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.video.ui.upload.impl.publish.presentation.publish.fragment.PublishFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsAccountFragment;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.go4;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes2.dex */
public final /* synthetic */ class wt30 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wt30(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v17, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v19, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Activity h;
        Playlist playlist;
        UIBlock uIBlock;
        PodcastPage podcastPage;
        MusicTrack musicTrack;
        ActivityOptions pendingIntentBackgroundActivityStartMode;
        int i = this.b;
        char c = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                return new wng0(0, e3m.d(R.attr.im_msg_part_story_corner_radius, ((xt30) obj).t())).mutate();
            case 1:
                MusicPlaylistCellVh musicPlaylistCellVh = (MusicPlaylistCellVh) obj;
                b5a b5aVar = musicPlaylistCellVh.c;
                if (!musicPlaylistCellVh.a()) {
                    VkCell vkCell = musicPlaylistCellVh.k;
                    if (vkCell == null) {
                        vkCell = null;
                    }
                    Context context = vkCell.getContext();
                    if (context != null && (h = e3m.h(context)) != null && (playlist = musicPlaylistCellVh.j) != null && (uIBlock = musicPlaylistCellVh.i) != null) {
                        SchemeStat$EventItem.Type type = playlist.Eb() ? SchemeStat$EventItem.Type.ALBUM : SchemeStat$EventItem.Type.PLAYLIST;
                        SearchStatInfoProvider searchStatInfoProvider = musicPlaylistCellVh.g;
                        fl4.p(musicPlaylistCellVh.f, h, MusicPlaybackLaunchContext.Fb(uIBlock.f).Cb(uIBlock.p.h()), playlist, null, new p9a(b5aVar, uIBlock, searchStatInfoProvider != null ? searchStatInfoProvider.b(type, playlist.F, false) : null), 8);
                        b5aVar.a(new cfp0(uIBlock, new MusicAnalyticsInfo(MusicAnalyticsInfo.ClickTarget.Menu)));
                    }
                }
                return s3q0.a;
            case 2:
                z550 z550Var = (z550) obj;
                dx40 dx40Var = (dx40) z550Var.p.getValue();
                Context context2 = z550Var.getContext();
                SnippetPlayerMode snippetPlayerMode = SnippetPlayerMode.LONGTAP;
                Activity activity = z550Var.h;
                return new eck0(dx40Var, new fck0(new go4.a(2, false), null, 6), context2, snippetPlayerMode, ((AudioSnippetComponent) m7m.a(activity).mo408a(fpf0.a(AudioSnippetComponent.class))).H3(), ((PlayerAnalyticsComponent) m7m.a(activity).a(fpf0.a(PlayerAnalyticsComponent.class))).a1());
            case 3:
                int i2 = NewsfeedFilteredSourcesFragment.a0;
                return new yi60(((NewsfeedFilteredSourcesFragment) obj).In());
            case 4:
                for (qi6 qi6Var : (List) obj) {
                    FeedGoodsPhotoHolder feedGoodsPhotoHolder = qi6Var instanceof FeedGoodsPhotoHolder ? (FeedGoodsPhotoHolder) qi6Var : null;
                    if (feedGoodsPhotoHolder != null) {
                        feedGoodsPhotoHolder.n1();
                    }
                }
                return s3q0.a;
            case 5:
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) obj;
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                return new ar60((tr60) newsfeedSearchFragment.Q.getValue(), (AtomicReference) newsfeedSearchFragment.P.getValue(), newsfeedSearchFragment, newsfeedSearchFragment.O, new v100(newsfeedSearchFragment, 12));
            case 6:
                return ((e2b0) obj).y.n();
            case 7:
                int i3 = PodcastEpisodeFragment.u0;
                com.vk.music.podcast.impl.ui.episode.b bVar = (com.vk.music.podcast.impl.ui.episode.b) ((PodcastEpisodeFragment) obj).S;
                if (bVar == null || (podcastPage = bVar.e) == null || (musicTrack = podcastPage.b) == null) {
                    return s3q0.a;
                }
                bVar.b(musicTrack);
                return s3q0.a;
            case 8:
                return (PollSettingView) ((hpb0) obj).g(R.id.poll_option_disable_unvote);
            case 9:
                return ((PostingComponent) ((k7m) m7m.f((dcc0) obj)).mo408a(fpf0.a(PostingComponent.class))).H6().h();
            case 10:
                okc0 okc0Var = (okc0) obj;
                okc0Var.e.invoke();
                okc0Var.f.invoke();
                return s3q0.a;
            case 11:
                PublishFragmentInternalComponent publishFragmentInternalComponent = (PublishFragmentInternalComponent) obj;
                nwy nwyVar = publishFragmentInternalComponent.p;
                qcy<Object>[] qcyVarArr2 = PublishFragmentInternalComponent.w;
                qcy<Object> qcyVar = qcyVarArr2[7];
                vbe0 vbe0Var = (vbe0) nwyVar.c();
                nwy nwyVar2 = publishFragmentInternalComponent.q;
                qcy<Object> qcyVar2 = qcyVarArr2[8];
                cde0 cde0Var = (cde0) nwyVar2.c();
                nwy nwyVar3 = publishFragmentInternalComponent.r;
                qcy<Object> qcyVar3 = qcyVarArr2[9];
                hee0 hee0Var = (hee0) nwyVar3.c();
                nwy nwyVar4 = publishFragmentInternalComponent.o;
                qcy<Object> qcyVar4 = qcyVarArr2[6];
                return new uce0(vbe0Var, cde0Var, hee0Var, (jed0) nwyVar4.c(), publishFragmentInternalComponent.d.A());
            case 12:
                int i4 = QuestionnaireVh.q;
                return (ClipsInternalNpsComponent) ((k7m) m7m.f((QuestionnaireVh) obj)).a(fpf0.a(ClipsInternalNpsComponent.class));
            case 13:
                e2f0 e2f0Var = (e2f0) obj;
                FrameLayout frameLayout = new FrameLayout(e2f0Var.a.getCtx());
                frameLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
                frameLayout.addView(e2f0Var.b());
                frameLayout.setClipToPadding(false);
                frameLayout.setClipChildren(false);
                return frameLayout;
            case 14:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                ofFloat.setStartDelay(0L);
                ofFloat.setDuration(133L);
                ofFloat.setInterpolator(new LinearInterpolator());
                ofFloat.addUpdateListener(new ve6((p6f0) obj, c == true ? 1 : 0));
                return ofFloat;
            case 15:
                int i5 = SearchCommunitiesOnMapDetailsFragment.T;
                return ((ReviewsComponent) m7m.d((SearchCommunitiesOnMapDetailsFragment) obj).a(fpf0.a(ReviewsComponent.class))).Md();
            case 16:
                idi0 idi0Var = (idi0) obj;
                return Boolean.valueOf(idi0Var.g && idi0Var.b.b().length() == 0);
            case 17:
                int i6 = SettingsAccountFragment.l0;
                ((SettingsAccountFragment) obj).finish();
                return s3q0.a;
            case 18:
                return (AppCompatImageView) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_back_button);
            case 19:
                ShowAllListRootVh showAllListRootVh = (ShowAllListRootVh) obj;
                return new t8a(showAllListRootVh.m.b.d, fxc0.B(), ((BridgeComponent) ((k7m) m7m.f(showAllListRootVh)).a(fpf0.a(BridgeComponent.class))).F());
            case 20:
                return SignalingTransport.a((SignalingTransport) obj);
            case 21:
                return ((MusicKidsModeComponent) ((k7m) m7m.c((jfl0) obj)).a(fpf0.a(MusicKidsModeComponent.class))).n();
            case 22:
                yrl0 yrl0Var = (yrl0) obj;
                yrl0Var.c = Long.valueOf(SystemClock.elapsedRealtime());
                if (yrl0Var.i != null) {
                    yrl0Var.i = Long.valueOf(SystemClock.elapsedRealtime());
                }
                return s3q0.a;
            case 23:
                ((com.vk.story.viewer.impl.presentation.stories.view.storyview.b) obj).c();
                return s3q0.a;
            case 24:
                qcy<Object>[] qcyVarArr3 = SuggestedPostsFragment.r0;
                return new v3n0(new wm80((SuggestedPostsFragment) obj, 25));
            case 25:
                zan0 zan0Var = (zan0) obj;
                try {
                    fco0.c();
                    zan0Var.a(zan0Var.b);
                    return s3q0.a;
                } catch (SuperAppQueueAccessException e) {
                    zan0Var.getClass();
                    if (!e.d().b) {
                        if (e.d().a == 1) {
                            throw new InterruptedException();
                        }
                        throw e;
                    }
                    xan0<?> xan0Var = zan0Var.b;
                    if (xan0Var != null) {
                        xan0Var.e.invoke();
                    }
                    throw new InterruptedException();
                }
            case 26:
                return (CoordinatorLayout) ((Activity) obj).findViewById(R.id.photos_root_content_container);
            case 27:
                PendingIntent actionIntent = ((RemoteAction) obj).getActionIntent();
                if (Build.VERSION.SDK_INT >= 34) {
                    try {
                        pendingIntentBackgroundActivityStartMode = ActivityOptions.makeBasic().setPendingIntentBackgroundActivityStartMode(1);
                        actionIntent.send(pendingIntentBackgroundActivityStartMode.toBundle());
                    } catch (PendingIntent.CanceledException e2) {
                        Log.e("TextClassification", "error sending pendingIntent: " + actionIntent + " error: " + e2);
                    }
                } else {
                    actionIntent.send();
                }
                return s3q0.a;
            case 28:
                gzs<s3q0> gzsVar = ((com.vk.clips.design.view.component.video.preview.b) obj).j;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            default:
                ((etv0) obj).b(false);
                return s3q0.a;
        }
    }
}
