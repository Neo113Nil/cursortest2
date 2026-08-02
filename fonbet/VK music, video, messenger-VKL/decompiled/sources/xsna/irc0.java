package xsna;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import androidx.compose.ui.platform.ComposeView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.catalog2.common.ui.mvp.holder.header.ToolbarVh;
import com.vk.catalog2.common.ui.mvp.holder.video.mvi.VideoCatalogMviVh;
import com.vk.catalog2.common.ui.mvp.video.albumbottomsheet.VideoCatalogAlbumBottomSheetRedesign;
import com.vk.clips.design.view.editor.speed.SpeedView;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.view.components.picture.VkImageSimple;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.newsfeed.impl.posting.profilefriendslists.ProfileFriendsFragment;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.newsfeed.impl.presentation.postponed.presentation.fragment.PostponedPostsFragment;
import com.vk.profile.user.api.di.ProfileOnboardingComponent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.socialgraph.SocialGraphActivity;
import com.vk.stat.scheme.MobileOfficialAppsStoriesStat$TypeStoryPublishItem;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.story.api.di.StoriesComponent;
import com.vk.storycamera.builder.StoryCameraParams;
import com.vk.storycamera.picker.template.ui.StoryTemplateFragment;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.video.growth.impl.di.VideoGrowthComponentImpl;
import com.vk.video.kidsprofile.restricteduseractions.VideoRestrictedUserActionsComponent;
import com.vk.video.music.dialog.api.di.MusicInVideoDialogComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.UnreadCounterSettingsFragment;
import kotlin.LazyThreadSafetyMode;
import xsna.qyr0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class irc0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ irc0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v43, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Activity b;
        int i = this.b;
        boolean z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                qcy<Object>[] qcyVarArr = PostponedPostsFragment.q0;
                return m7m.d((PostponedPostsFragment) obj);
            case 1:
                return ((BridgeComponent) ((k7m) m7m.f((aed0) obj)).a(fpf0.a(BridgeComponent.class))).s();
            case 2:
                return Boolean.valueOf(((cxo) obj).j0);
            case 3:
                int i2 = ProfileFriendsFragment.k0;
                zwd0 zwd0Var = (zwd0) ((ProfileFriendsFragment) obj).S;
                if (zwd0Var != null) {
                    zwd0Var.Qa();
                }
                return s3q0.a;
            case 4:
                qcy<Object>[] qcyVarArr2 = ReactionsFeedFragment.q0;
                return m7m.d((ReactionsFeedFragment) obj);
            case 5:
                y5f0 y5f0Var = (y5f0) obj;
                y5f0Var.a.setPopupVisibility$design_release(true);
                m3r m3rVar = y5f0Var.a;
                m3rVar.i();
                y5f0Var.g.start();
                m3rVar.postOnAnimationDelayed(y5f0Var.f, Math.max((y5f0.j * (y5f0Var.b.getReactionViews().length - 1)) + y5f0.i + y5f0.k, y5f0.l));
                return s3q0.a;
            case 6:
                return Boolean.valueOf(((afi0) obj).m);
            case 7:
                znj0 znj0Var = (znj0) obj;
                return new qoj0(e43.l(new koj0(new o440(znj0Var, 27)), new roj0(znj0Var.h), new aoj0(new b6f0(znj0Var, 7))));
            case 8:
                ((zak0) ((a9k0) obj).i).setValue(Boolean.valueOf(!((Boolean) ((zak0) r0).getValue()).booleanValue()));
                return s3q0.a;
            case 9:
                int i3 = SocialGraphActivity.i;
                return Integer.valueOf(((SocialGraphActivity) obj).getSupportFragmentManager().hashCode());
            case 10:
                int i4 = SpeedView.B;
                return (VkImageSimple) ((SpeedView) obj).findViewById(R.id.speed_arrow);
            case 11:
                PopupStickerView popupStickerView = ((q3l0) obj).n;
                if (popupStickerView != null) {
                    popupStickerView.e();
                }
                return s3q0.a;
            case 12:
                return Boolean.valueOf(!((StickersDrawingViewGroup) obj).r.e);
            case 13:
                return (Enum[]) ((Class) obj).getEnumConstants();
            case 14:
                return new yqj0(((StoryEditorExtDepsComponentImpl) obj).b.t().b());
            case 15:
                int i5 = StoryMediaPickerFragment.d0;
                com.vk.storycamera.picker.feature.c cVar = (com.vk.storycamera.picker.feature.c) ((StoryMediaPickerFragment) obj).Y.getValue();
                StoryCameraParams a = cVar.a();
                MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint a2 = pbk.a(a.c);
                if (a2 == null) {
                    a2 = MobileOfficialAppsStoriesStat$TypeStoryPublishItem.CreationEntryPoint.NEW_STORY_AVATAR;
                }
                com.vk.storycamera.builder.a aVar = new com.vk.storycamera.builder.a(a.b, a2);
                aVar.b(a);
                FragmentImpl fragmentImpl = cVar.a;
                Intent B = aVar.B(fragmentImpl.kn(), true);
                LayoutInflater.Factory activity = fragmentImpl.getActivity();
                ey50 ey50Var = activity instanceof ey50 ? (ey50) activity : null;
                ww50<?> Y = ey50Var != null ? ey50Var.Y() : null;
                if (Y == null || !Y.q(18941, B, fragmentImpl)) {
                    fragmentImpl.startActivityForResult(B, 18941, null);
                }
                return s3q0.a;
            case 16:
                int i6 = StoryStatisticsViewersFragment.f0;
                Bundle arguments = ((StoryStatisticsViewersFragment) obj).getArguments();
                if (arguments != null) {
                    return (StoryOwner) arguments.getParcelable("STORY_OWNER");
                }
                return null;
            case 17:
                int i7 = StoryTemplateFragment.U;
                return ((StoriesComponent) m7m.d((StoryTemplateFragment) obj).a(fpf0.a(StoriesComponent.class))).td();
            case 18:
                ((cmo0) obj).dismiss();
                return s3q0.a;
            case 19:
                return ((SearchUiComponent) ((k7m) m7m.f((ToolbarVh) obj)).a(fpf0.a(SearchUiComponent.class))).lf();
            case 20:
                int i8 = UnreadCounterSettingsFragment.n0;
                return ((BridgeComponent) ((k7m) m7m.f((UnreadCounterSettingsFragment) obj)).a(fpf0.a(BridgeComponent.class))).s();
            case 21:
                int i9 = UserProfileFragment.p0;
                return ((ProfileOnboardingComponent) ((k7m) m7m.f((UserProfileFragment) obj)).mo408a(fpf0.a(ProfileOnboardingComponent.class))).Fe();
            case 22:
                qcy<Object>[] qcyVarArr3 = qyr0.m1;
                return new qyr0.d((qyr0) obj);
            case 23:
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) obj;
                if (videoAutoPlay.M0() && videoAutoPlay.R0() != AutoPlayMinifiedState.PIP) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 24:
                wjs0.a(new hwr0(((VideoCatalogAlbumBottomSheetRedesign) obj).a.a));
                return s3q0.a;
            case 25:
                ComposeView composeView = ((VideoCatalogMviVh) obj).m;
                if (composeView != null && (b = enj.b(composeView)) != null) {
                    b.reportFullyDrawn();
                }
                return s3q0.a;
            case 26:
                int i10 = VideoCatalogSearchRootVh.S;
                return ((BridgeComponent) ((k7m) m7m.f((VideoCatalogSearchRootVh) obj)).a(fpf0.a(BridgeComponent.class))).s();
            case 27:
                int i11 = VideoEmbedFragment.q0;
                return ((VideoRestrictedUserActionsComponent) m7m.d((VideoEmbedFragment) obj).a(fpf0.a(VideoRestrictedUserActionsComponent.class))).e2();
            case 28:
                VideoGrowthComponentImpl videoGrowthComponentImpl = (VideoGrowthComponentImpl) obj;
                qcy<Object>[] qcyVarArr4 = VideoGrowthComponentImpl.k;
                return new jit0(msy.a(LazyThreadSafetyMode.NONE, new ipq0(videoGrowthComponentImpl, 5)), videoGrowthComponentImpl.Z7());
            default:
                return (MusicInVideoDialogComponent) ((f8m) obj).c(fpf0.a(MusicInVideoDialogComponent.class));
        }
    }
}
