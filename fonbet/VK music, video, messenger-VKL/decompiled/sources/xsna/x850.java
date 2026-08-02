package xsna;

import android.animation.ValueAnimator;
import android.app.Activity;
import android.widget.TextView;
import android.widget.ViewAnimator;
import com.airbnb.lottie.LottieAnimationView;
import com.unity3d.ads.core.domain.GetHeaderBiddingToken;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.clips.design.view.camera.settings.ModalSettingsPrivacyOption;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.im.engine.reporters.performance.PerformanceEventType;
import com.vk.libvideo.api.di.VideoApiHelperComponent;
import com.vk.music.design.view.subscription.MusicSubscriptionBannerView;
import com.vk.music.fragment.api.di.MusicFragmentComponent;
import com.vk.music.player.api.di.PlayerUIComponent;
import com.vk.newsfeed.impl.fragments.PostViewFragment;
import com.vk.onboardingscreens.impl.di.OnboardingScreensComponentImpl;
import com.vk.photos.root.photoflow.presentation.PhotoFlowFragment;
import com.vk.photos.ui.album.PhotoAlbumFragment;
import com.vk.settings.api.di.NotificationsSettingsComponent;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.video.music.dialog.api.domain.entity.PlaylistOnboardingButton;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.NewsfeedSettingsFragment;
import java.util.concurrent.Semaphore;
import xsna.cqc0;
import xsna.doe0;
import xsna.ejd0;
import xsna.rwi0;
import xsna.sw50;
import xsna.x2a0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class x850 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ x850(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v54, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v0, types: [android.content.Intent, com.vk.gallerypicker.configuration.GalleryPickerSourceConfiguration$EntryPoint] */
    /* JADX WARN: Type inference failed for: r1v11 */
    @Override // xsna.gzs
    public final Object invoke() {
        l7m f;
        xk40 v2;
        GetHeaderBiddingToken initialize$lambda$220$lambda$97;
        int i = this.b;
        int i2 = 0;
        Object obj = this.c;
        switch (i) {
            case 0:
                int i3 = MusicSubscriptionBannerView.x;
                return (LottieAnimationView) ((MusicSubscriptionBannerView) obj).findViewById(R.id.animation);
            case 1:
                return new gjl((cl50) obj);
            case 2:
                int i4 = NewsfeedSettingsFragment.v0;
                return ((NotificationsSettingsComponent) ((k7m) m7m.f((NewsfeedSettingsFragment) obj)).a(fpf0.a(NotificationsSettingsComponent.class))).a();
            case 3:
                nwy nwyVar = ((OnboardingScreensComponentImpl) obj).b;
                qcy<Object> qcyVar = OnboardingScreensComponentImpl.h[0];
                return new azq0((gzq0) nwyVar.c());
            case 4:
                return Boolean.valueOf(((tw90) obj).c.a(PerformanceEventType.MESSAGES_HISTORY_MERGE));
            case 5:
                return new x2a0.a(((x2a0) obj).A0);
            case 6:
                int i5 = PhotoAlbumFragment.r0;
                rwi.d().g().d((PhotoAlbumFragment) obj, 3890, 0, new sw50.f.a(r1, r1, 30));
                return s3q0.a;
            case 7:
                com.vk.photos.root.photoflow.presentation.j jVar = ((PhotoFlowFragment) obj).R;
                return bwt0.F((jVar != null ? jVar : 0).l.getRecyclerView());
            case 8:
                xbb0 xbb0Var = (xbb0) obj;
                xbb0Var.a.invoke(PlaylistOnboardingButton.Understand);
                dw20 dw20Var = xbb0Var.b;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 9:
                Activity activity = ((ifb0) obj).D;
                w8i w8iVar = activity instanceof w8i ? (w8i) activity : null;
                if (w8iVar != null && (f = m7m.f(w8iVar)) != null) {
                    MusicFragmentComponent musicFragmentComponent = (MusicFragmentComponent) ((k7m) f).a(fpf0.a(MusicFragmentComponent.class));
                    if (musicFragmentComponent != null && (v2 = musicFragmentComponent.v2()) != null) {
                        return v2;
                    }
                }
                return new zk40();
            case 10:
                return (TextView) ((hpb0) obj).g(R.id.poll_add_option_btn);
            case 11:
                return new o3o((a2o) ((com.vk.newsfeed.common.util.j) obj).d.getValue());
            case 12:
                ((Semaphore) obj).release();
                return s3q0.a;
            case 13:
                PostViewFragment postViewFragment = (PostViewFragment) obj;
                String[] strArr = PostViewFragment.T0;
                return new hbt0(postViewFragment.kn(), postViewFragment, postViewFragment.E0.getLifecycle(), null, null, 131064);
            case 14:
                return (VideoApiHelperComponent) ((e7m) obj).a(fpf0.a(VideoApiHelperComponent.class));
            case 15:
                ModalSettingsPrivacyOption modalSettingsPrivacyOption = new ModalSettingsPrivacyOption(((cqc0.c) obj).a, null, 6);
                modalSettingsPrivacyOption.setTitle(R.string.clips_posting_privacy_add_friends_or_lists);
                bwt0.p0(modalSettingsPrivacyOption, false);
                return modalSettingsPrivacyOption;
            case 16:
                gzs gzsVar = (gzs) ((zak0) ((f9d0) obj).i).getValue();
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                return s3q0.a;
            case 17:
                ((gzs) obj).invoke();
                return s3q0.a;
            case 18:
                ((jkd0) obj).n.invoke(ejd0.b.a.b);
                return s3q0.a;
            case 19:
                return ((MarketComponent) ((zqd0) obj).b.getValue()).rc();
            case 20:
                return new one0(((xne0) obj).a.kn(), doe0.b.a);
            case 21:
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.setInterpolator(new pkk(0.42f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.58f, 1.0f));
                ofFloat.setDuration(150L);
                ofFloat.addUpdateListener(new l6f0((m6f0) obj, i2));
                return ofFloat;
            case 22:
                int i6 = osf0.q1;
                return ((SessionManagementComponent) m7m.d((osf0) obj).a(fpf0.a(SessionManagementComponent.class))).J2();
            case 23:
                return (f5z) obj;
            case 24:
                initialize$lambda$220$lambda$97 = ServiceProvider.initialize$lambda$220$lambda$97((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$97;
            case 25:
                ((mwi0) obj).V(rwi0.c.C3640c.a);
                return s3q0.a;
            case 26:
                return (ViewAnimator) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_footer_animator);
            case 27:
                ((vbr0) obj).a();
                return s3q0.a;
            case 28:
                return (PlayerUIComponent) ((k7m) m7m.c((jfl0) obj)).a(fpf0.a(PlayerUIComponent.class));
            default:
                return ((StoryViewerComponent) ((k7m) m7m.f((ncm0) obj)).a(fpf0.a(StoryViewerComponent.class))).l9();
        }
    }
}
