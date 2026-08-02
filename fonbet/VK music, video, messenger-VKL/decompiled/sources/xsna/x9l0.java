package xsna;

import android.content.Context;
import android.graphics.Rect;
import android.widget.TextView;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.oauth.di.OAuthComponent;
import com.vk.camera.editor.stories.impl.background.views.StoryBackgroundRecyclerPaginatedView;
import com.vk.catalog2.common.dto.api.ui.action.UIBlockAction;
import com.vk.catalog2.common.dto.ui.UIBlockPlaceholder;
import com.vk.catalog2.common.ui.mvp.holder.container.VkBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.paging.list.VkErrorView;
import com.vk.core.view.components.picture.VkPicture;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.im.design.view.comments.VkCommentView;
import com.vk.im.ui.views.msg.TimeAndStatusView;
import com.vk.libvideo.adfree.api.di.VideoAdFreeSubscriptionComponent;
import com.vk.libvideo.api.di.OnboardingComponent;
import com.vk.libvideo.api.di.VideoTimerComponent;
import com.vk.libvideo.api.seek.di.VideoSeekComponent;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment.d;
import com.vk.music.stickyplayer.domain.PlayerContext;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.VkVideoPickerFragment;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.stories.design.view.viewer.reactions.StoryMainReactionButton;
import com.vk.story.api.di.StoriesComponent;
import com.vk.video.growth.api.data.VideoGrowthType;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import xsna.b78;
import xsna.sx40;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes6.dex */
public final /* synthetic */ class x9l0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x9l0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i2 = StickersDrawingViewGroup.j0;
                ((StickersDrawingViewGroup) obj).invalidate();
                return s3q0.a;
            case 1:
                return ((StoriesComponent) ((k7m) m7m.f((dvl0) obj)).a(fpf0.a(StoriesComponent.class))).gd();
            case 2:
                int i3 = StoryBackgroundRecyclerPaginatedView.O;
                ((VkErrorView) obj).a();
                return s3q0.a;
            case 3:
                return new irj0(((StoryEditorExtDepsComponentImpl) obj).b.p());
            case 4:
                ebm0 ebm0Var = (ebm0) obj;
                nzl0 nzl0Var = ebm0Var.b;
                StoryMainReactionButton storyMainReactionButton = ebm0Var.h.c;
                return new jd80(nzl0Var, storyMainReactionButton != null ? storyMainReactionButton : null, new os30(ebm0Var, 28));
            case 5:
                ((uov) ((pn0) obj).b).setActionInProgress(false);
                return s3q0.a;
            case 6:
                return TimeAndStatusView.a((TimeAndStatusView) obj);
            case 7:
                ((fuv0) obj).close();
                return s3q0.a;
            case 8:
                ((com.vk.video.ad.b) obj).f.f();
                return s3q0.a;
            case 9:
                return ((eos0) obj).d == VideoGrowthType.BOTTOM_SHEET_AND_BUTTON ? com.vk.toggle.d.D.b() : com.vk.toggle.d.F.b();
            case 10:
                int i4 = VideoInteractiveFullscreenFragment.Q0;
                return ((VideoInteractiveFullscreenFragment) obj).new d();
            case 11:
                int i5 = VideoLiveFragment.i0;
                return ((VideoSeekComponent) m7m.d((VideoLiveFragment) obj).mo408a(fpf0.a(VideoSeekComponent.class))).E1();
            case 12:
                int i6 = VideoMinimizableDiscoveryFragment.p1;
                ((VideoMinimizableDiscoveryFragment) obj).ko().e2().getClass();
                return null;
            case 13:
                return (OnboardingComponent) ((f8m) obj).a(fpf0.a(OnboardingComponent.class));
            case 14:
                int i7 = VideoOfflineFragment.f1;
                return ((VideoTimerComponent) m7m.d((VideoOfflineFragment) obj).a(fpf0.a(VideoTimerComponent.class))).R0();
            case 15:
                ((VideoPlaylistRootVh) obj).w.d();
                return s3q0.a;
            case 16:
                return (ucg0) ((zjt0) obj).N.getValue();
            case 17:
                ((b78.i) obj).a().invoke(new sx40.m0(false, PlayerContext.MINI));
                return s3q0.a;
            case 18:
                VkTopBar vkTopBar = ((q9u0) obj).j;
                if (vkTopBar == null) {
                    vkTopBar = null;
                }
                zhf0 rightExtraRect = vkTopBar.getRightExtraRect();
                if (epx.f(rightExtraRect, zhf0.e)) {
                    return null;
                }
                return new Rect((int) rightExtraRect.a, (int) rightExtraRect.b, (int) rightExtraRect.c, (int) rightExtraRect.d);
            case 19:
                VkBannerVh vkBannerVh = (VkBannerVh) obj;
                UIBlockPlaceholder uIBlockPlaceholder = vkBannerVh.l;
                UIBlockAction uIBlockAction = vkBannerVh.m;
                if (uIBlockPlaceholder != null && uIBlockAction != null) {
                    com.vk.catalog2.common.ui.mvp.util.a aVar = vkBannerVh.e;
                    VkBanner vkBanner = vkBannerVh.j;
                    com.vk.catalog2.common.ui.mvp.util.a.e(aVar, (vkBanner != null ? vkBanner : null).getContext(), uIBlockPlaceholder, uIBlockAction, null, 56);
                    vkBannerVh.c.a(new cfp0(uIBlockPlaceholder, vkBannerVh.m));
                    vkBannerVh.a(uIBlockPlaceholder, uIBlockAction, true);
                }
                return s3q0.a;
            case 20:
                return ((com.vk.superapp.browser.ui.a) obj).yn().l;
            case 21:
                return ((VideoAdFreeSubscriptionComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.configuration.a) obj)).a(fpf0.a(VideoAdFreeSubscriptionComponent.class))).G1();
            case 22:
                ((VkCommentView) obj).x.q();
                return s3q0.a;
            case 23:
                return (VkPicture) ((quu0) obj).findViewById(R.id.feed_link_primary_cell_picture);
            case 24:
                com.vk.superapp.verification.account.d dVar = (com.vk.superapp.verification.account.d) obj;
                com.vk.auth.oauth.di.b p1 = ((OAuthComponent) m7m.d(dVar).a(fpf0.a(OAuthComponent.class))).p1();
                Context requireContext = dVar.requireContext();
                VkOAuthService vkOAuthService = dVar.G;
                return p1.a(requireContext, vkOAuthService != null ? vkOAuthService : null);
            case 25:
                VkVideoPickerFragment vkVideoPickerFragment = (VkVideoPickerFragment) obj;
                int i8 = VkVideoPickerFragment.V;
                return new q2t0(vkVideoPickerFragment, vkVideoPickerFragment.fo());
            case 26:
                va9 va9Var = ((v5x0) obj).f;
                w5w0 d = va9Var.d(((rew0) va9Var.f.getValue()).f());
                return d == null ? va9.r : d;
            default:
                return (TextView) ((com.vk.writebar.g) obj).f().findViewById(R.id.writebar_cancel);
        }
    }
}
