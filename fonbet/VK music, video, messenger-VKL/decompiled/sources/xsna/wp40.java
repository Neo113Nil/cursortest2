package xsna;

import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.FragmentActivity;
import com.vk.catalog2.common.ui.mvp.holder.stories.MusicClipsSelectorCatalogRootVh;
import com.vk.catalog2.feature.music.holders.podcast.PodcastCategoryVh;
import com.vk.documents.api.di.DocumentsComponent;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.SearchMode;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.podcast.impl.ui.offlinepage.presentation.fragment.OfflinePodcastEpisodesFragment;
import com.vk.music.stickyplayer.StickyMusicPlayerBottomSheet;
import com.vk.music.view.ThumbsImageView;
import com.vk.newsfeed.api.di.NewsFeedComponent;
import com.vk.newsfeed.impl.posting.attachments.PostingAttachActivity;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.onboardingpromo.impl.di.OnboardingPromoComponentImpl;
import com.vk.photoviewer.PhotoViewer;
import com.vk.popupmanager.api.di.PopupManagerComponent;
import com.vk.qrcode.QRStatsTracker;
import com.vk.settings.impl.presentation.base.fragment.setting.NotificationSettingFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.story.impl.di.StoriesComponentImpl;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.video.music.dialog.api.di.MusicInVideoDialogComponent;
import com.vk.voip.ui.avatars.VoipAvatarViewContainer;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import xsna.cqc0;
import xsna.ejd0;
import xsna.k840;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class wp40 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wp40(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v16, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Object obj;
        Object parcelable;
        int i = 5;
        switch (this.b) {
            case 0:
                return ((xp40) this.c).z0();
            case 1:
                ((MusicClipsSelectorCatalogRootVh) this.c).s.d();
                return s3q0.a;
            case 2:
                return ((sr60) ((mo60) this.c).o.getValue()).a();
            case 3:
                return (NewsFeedComponent) ((h7m) ((du60) this.c).a.getValue()).a(fpf0.a(NewsFeedComponent.class));
            case 4:
                NewsfeedSearchFragment newsfeedSearchFragment = (NewsfeedSearchFragment) this.c;
                qcy<Object>[] qcyVarArr = NewsfeedSearchFragment.p0;
                FragmentActivity activity = newsfeedSearchFragment.getActivity();
                if (activity != null) {
                    activity.onBackPressed();
                }
                return s3q0.a;
            case 5:
                NotificationSettingFragment notificationSettingFragment = (NotificationSettingFragment) this.c;
                qcy<Object>[] qcyVarArr2 = NotificationSettingFragment.W;
                return ((StoryViewerComponent) m7m.d(notificationSettingFragment).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 6:
                OfflinePodcastEpisodesFragment offlinePodcastEpisodesFragment = (OfflinePodcastEpisodesFragment) this.c;
                OfflinePodcastEpisodesFragment.b bVar = OfflinePodcastEpisodesFragment.Q;
                Bundle requireArguments = offlinePodcastEpisodesFragment.requireArguments();
                bVar.getClass();
                if (Build.VERSION.SDK_INT >= 33) {
                    parcelable = requireArguments.getParcelable("owner_id", UserId.class);
                    obj = (Parcelable) parcelable;
                } else {
                    Object parcelable2 = requireArguments.getParcelable("owner_id");
                    obj = (UserId) (parcelable2 instanceof UserId ? parcelable2 : null);
                }
                UserId userId = (UserId) obj;
                if (userId == null) {
                    userId = UserId.d;
                }
                String string = offlinePodcastEpisodesFragment.requireArguments().getString("podcast_title");
                if (string == null) {
                    string = "";
                }
                return new gv70(userId, string, new wu70(new jod((lq40) offlinePodcastEpisodesFragment.O.getValue()), MusicPlaybackLaunchContext.Fb(offlinePodcastEpisodesFragment.requireArguments().getString("ref", "")).Cb(offlinePodcastEpisodesFragment.requireArguments().getString("launch_origin", "unknown"))));
            case 7:
                OnboardingPromoComponentImpl onboardingPromoComponentImpl = (OnboardingPromoComponentImpl) this.c;
                qcy<Object>[] qcyVarArr3 = OnboardingPromoComponentImpl.c;
                return new mg80(new xg80(onboardingPromoComponentImpl.a.a, new rf80()));
            case 8:
                return "LivePlayerImpl.handleUnpublished() - state= " + wl80.this.G;
            case 9:
                ua90 ua90Var = (ua90) this.c;
                String string2 = ua90Var.a.getString(R.string.vkim_search_tab_title_dialogs);
                mkr0 mkr0Var = ua90Var.b;
                return new rwh0(string2, new ax0(mkr0Var, 5), SearchMode.PEERS, MobileOfficialAppsCoreNavStat$EventScreen.IM_SEARCH_CHATS, 32L, new rx30(mkr0Var, ua90Var.c, false), R.string.vkim_search_screen_peers_tab_description, 64);
            case 10:
                return (VoipAvatarViewContainer) ((dp90) this.c).b().findViewById(R.id.past_call_details_header_avatar);
            case 11:
                PhotoViewer photoViewer = (PhotoViewer) this.c;
                photoViewer.c(new PhotoViewer.t(0, photoViewer, PhotoViewer.class, "onShowAnimation", "onShowAnimation()V", 0), photoViewer.n, new PhotoViewer.u(0, photoViewer, PhotoViewer.class, "onFinishScaleIn", "onFinishScaleIn()V", 0), true);
                return s3q0.a;
            case 12:
                yj40 yj40Var = (yj40) this.c;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(yj40Var);
                return s3q0.a;
            case 13:
                ThumbsImageView thumbsImageView = ((heb0) this.c).a;
                return Integer.valueOf(e3m.a(R.dimen.vkim_msg_part_playlist_lowest_thumb_size, (thumbsImageView != null ? thumbsImageView : null).getContext()));
            case 14:
                return new mgb0(new z5((PodcastCategoryVh) this.c, i));
            case 15:
                PostingAttachActivity postingAttachActivity = (PostingAttachActivity) this.c;
                int i2 = PostingAttachActivity.X;
                return ((DocumentsComponent) ((k7m) m7m.f(postingAttachActivity)).mo408a(fpf0.a(DocumentsComponent.class))).P0();
            case 16:
                b6m.a().f(((cqc0.c) this.c).a);
                return s3q0.a;
            case 17:
                ((bkd0) this.c).n.invoke(ejd0.b.d.b);
                return s3q0.a;
            case 18:
                ((zv) this.c).invoke();
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_LINK);
                return s3q0.a;
            case 19:
                ((yrf0) this.c).a = null;
                MusicInVideoDialogComponent.Companion companion = MusicInVideoDialogComponent.Companion;
                return s3q0.a;
            case 20:
                return Float.valueOf(((Number) ((gzs) this.c).invoke()).floatValue());
            case 21:
                f3j0 f3j0Var = (f3j0) this.c;
                return new tlc0(new d80(f3j0Var), new vm9(f3j0Var, 4));
            case 22:
                com.vk.clips.sdk.shared.item.static_ads.c cVar = (com.vk.clips.sdk.shared.item.static_ads.c) this.c;
                return new aaz(cVar, cVar.m.a());
            case 23:
                return "setNextStatInfo() - " + ((g4b0) this.c);
            case 24:
                StickyMusicPlayerBottomSheet stickyMusicPlayerBottomSheet = (StickyMusicPlayerBottomSheet) this.c;
                int i3 = StickyMusicPlayerBottomSheet.c0;
                return ((PopupManagerComponent) ((k7m) m7m.c(stickyMusicPlayerBottomSheet)).a(fpf0.a(PopupManagerComponent.class))).Dc();
            case 25:
                ((wh50) this.c).setValue(Boolean.TRUE);
                return s3q0.a;
            case 26:
                StoriesComponentImpl storiesComponentImpl = (StoriesComponentImpl) this.c;
                qcy<Object>[] qcyVarArr4 = StoriesComponentImpl.N;
                return storiesComponentImpl.eb();
            case 27:
                return ((StoryViewerComponent) ((k7m) m7m.f((jtl0) this.c)).a(fpf0.a(StoryViewerComponent.class))).k6();
            case 28:
                return (View) ((Ref$ObjectRef) this.c).element;
            default:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) this.c;
                int i4 = StoryMediaPickerFragment.d0;
                return new com.vk.storycamera.picker.feature.c(storyMediaPickerFragment, storyMediaPickerFragment.fo(), new StoryMediaPickerFragment.d(1, storyMediaPickerFragment, StoryMediaPickerFragment.class, "onOpenCollage", "onOpenCollage(Landroid/os/Bundle;)V", 0));
        }
    }
}
