package xsna;

import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog.mvi.legacy.api.CatalogLegacyComponent;
import com.vk.catalog2.common.ui.mvp.holder.container.VkBannerVh;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.core.view.components.banner.VkBanner;
import com.vk.core.view.components.counter.VkCounter;
import com.vk.core.view.components.text.VkText;
import com.vk.core.view.disableable.DisableableViewPager;
import com.vk.di.scope.FeatureScopesKt$createFeatureScope$scope$2;
import com.vk.di.scope.SharedScope;
import com.vk.libvideo.api.di.VideoAdvertisementsComponent;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;
import com.vk.movika.impl.VideoInteractiveFullscreenFragment;
import com.vk.newsfeed.posting.mediapicker.videovk.presentation.VkVideoPickerFragment;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.superapp.core.perf.BrowserPerfState;
import com.vk.trustedhash.di.TrustedHashComponent;
import com.vk.video.ui.smartcrop.api.router.SmartCropArguments;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragment;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.SettingsListFragment;
import kotlin.NoWhenBranchMatchedException;
import one.video.transform.TransformController;
import xsna.hww0;
import xsna.oyr0;
import xsna.tww0;
import xsna.wna0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class x2j0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x2j0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int a;
        int i = this.b;
        byte b = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                SettingsListFragment settingsListFragment = (SettingsListFragment) obj;
                ((jwn0) settingsListFragment.R0.getValue()).c(settingsListFragment.requireContext(), null);
                return s3q0.a;
            case 1:
                SmartCropFragment smartCropFragment = (SmartCropFragment) obj;
                qcy<Object>[] qcyVarArr = SmartCropFragment.Q;
                j4k0 j4k0Var = new j4k0((SmartCropArguments) smartCropFragment.N.getValue());
                l7m d = m7m.d(smartCropFragment);
                SmartCropFragmentInternalComponent.g.getClass();
                return (SmartCropFragmentInternalComponent) d.d(new FeatureScopesKt$createFeatureScope$scope$2(SharedScope.a, j4k0Var, fpf0.a(SmartCropFragmentInternalComponent.class), new pv7(b, 10))).a(fpf0.a(SmartCropFragmentInternalComponent.class));
            case 2:
                tyl0 tyl0Var = (tyl0) obj;
                mhy.j(tyl0Var.c());
                tyl0Var.d.postDelayed(new qd0(tyl0Var, 16), 300L);
                return s3q0.a;
            case 3:
                int i2 = StoryStatisticsViewersFragment.f0;
                return ((StoriesComponent) m7m.d((StoryStatisticsViewersFragment) obj).a(fpf0.a(StoriesComponent.class))).w();
            case 4:
                return Boolean.valueOf(((Number) ((mtk0) obj).getValue()).floatValue() > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            case 5:
                cmo0 cmo0Var = (cmo0) obj;
                kmo0 kmo0Var = kmo0.CHOOSE_COLOR;
                cmo0Var.w = kmo0Var;
                cmo0Var.b(kmo0Var);
                return s3q0.a;
            case 6:
                return new wna0((wna0.a) ((TransformController) obj).q.getValue());
            case 7:
                return ((TrustedHashComponent) m7m.e().a(fpf0.a(TrustedHashComponent.class))).c();
            case 8:
                return ((VkOnboardingComponent) m7m.d(((wwq0) obj).a).a(fpf0.a(VkOnboardingComponent.class))).p3();
            case 9:
                ((com.vk.video.ad.b) obj).h.b(oyr0.a.a);
                return s3q0.a;
            case 10:
                int i3 = VideoInteractiveFullscreenFragment.Q0;
                return ((VideoSubscriptionComponent) m7m.d((VideoInteractiveFullscreenFragment) obj).mo408a(fpf0.a(VideoSubscriptionComponent.class))).g0();
            case 11:
                int i4 = VideoLiveFragment.i0;
                return ((VideoAdvertisementsComponent) m7m.d((VideoLiveFragment) obj).mo408a(fpf0.a(VideoAdvertisementsComponent.class))).pc();
            case 12:
                return (NotificationsSettingsComponent) ((f8m) obj).a(fpf0.a(NotificationsSettingsComponent.class));
            case 13:
                ((h4t0) obj).g(false);
                return s3q0.a;
            case 14:
                DisableableViewPager disableableViewPager = ((VideoPlaylistRootVh) obj).x.o;
                if (disableableViewPager != null) {
                    return disableableViewPager;
                }
                return null;
            case 15:
                return Boolean.valueOf(((set0) ((zak0) ((tet0) obj).m).getValue()).p());
            case 16:
                fgt0 fgt0Var = (fgt0) obj;
                fgt0Var.f.Qc("video_playback_settings");
                fgt0Var.b = null;
                return s3q0.a;
            case 17:
                return VideoView.z((VideoView) obj);
            case 18:
                VkBannerVh vkBannerVh = (VkBannerVh) obj;
                int i5 = VkBannerVh.a.$EnumSwitchMapping$0[vkBannerVh.g.ordinal()];
                if (i5 == 1) {
                    VkBanner vkBanner = vkBannerVh.j;
                    a = e3m.a(R.dimen.catalog_banner_height_small, (vkBanner != null ? vkBanner : null).getContext());
                } else if (i5 == 2) {
                    VkBanner vkBanner2 = vkBannerVh.j;
                    a = e3m.a(R.dimen.catalog_banner_height_normal, (vkBanner2 != null ? vkBanner2 : null).getContext());
                } else {
                    if (i5 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    VkBanner vkBanner3 = vkBannerVh.j;
                    a = e3m.a(R.dimen.catalog_banner_height_large, (vkBanner3 != null ? vkBanner3 : null).getContext());
                }
                return Integer.valueOf(a);
            case 19:
                BrowserPerfState browserPerfState = ((com.vk.superapp.browser.ui.a) obj).G;
                if (browserPerfState != null) {
                    return browserPerfState;
                }
                return null;
            case 20:
                return ((CatalogLegacyComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.configuration.a) obj)).a(fpf0.a(CatalogLegacyComponent.class))).qf();
            case 21:
                VkCounter vkCounter = (VkCounter) obj;
                vkCounter.d = 1.0f;
                vkCounter.f = null;
                vkCounter.h = null;
                vkCounter.g = null;
                vkCounter.i.getPaint().setAlpha(255);
                return s3q0.a;
            case 22:
                return (VkText) ((quu0) obj).findViewById(R.id.feed_link_primary_cell_subtitle);
            case 23:
                int i6 = VkVideoPickerFragment.V;
                return ((VkVideoPickerFragment) obj).fo();
            case 24:
                pww0 pww0Var = (pww0) obj;
                pww0Var.T(tww0.j.c.b);
                pww0Var.C(hww0.k.b);
                return s3q0.a;
            case 25:
                ((o4x0) obj).c.o0();
                return s3q0.a;
            case 26:
                return ((com.vk.writebar.g) obj).f().findViewById(R.id.writebar_duration_area);
            default:
                ((f3y0) obj).N.Z0();
                return s3q0.a;
        }
    }
}
