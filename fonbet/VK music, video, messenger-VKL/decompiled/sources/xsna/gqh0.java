package xsna;

import com.vk.attachpicker.stickers.selection.searchmode.SearchMode;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.catalog2.common.ui.holders.video.VideoProfileHorizontallScrollItemWithHighlightVh;
import com.vk.catalog2.common.ui.mvp.holder.container.VerticalListVh;
import com.vk.editor.di.StoryEditorExtDepsComponent;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.geo.api.di.GeoComponent;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.fragment.api.di.MusicFragmentComponent;
import com.vk.music.model.di.AudioModelsComponent;
import com.vk.newsfeed.impl.fragments.video.tree.VideoCommentsTreeInPlayerFragment;
import com.vk.onboarding.api.di.VkOnboardingComponent;
import com.vk.onboardingscreens.api.di.OnboardingScreensComponent;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.sharing.api.di.SharingComponent;
import com.vk.socialgraph.init.TopicsFragmentNewContainer;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.story.viewer.stat.di.StoryStatisticsComponent;
import com.vk.superapp.bridges.SuperappUiRouterBridge;
import com.vk.video.growth.api.di.VideoGrowthComponent;
import com.vk.video.growth.impl.di.VideoGrowthComponentImpl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class gqh0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ gqh0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v47, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v74, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v76, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        int i = this.b;
        int i2 = 1;
        Object obj = this.c;
        switch (i) {
            case 0:
                return ((hqh0) obj).i;
            case 1:
                return Boolean.valueOf(((afi0) obj).w == SearchMode.FULL);
            case 2:
                return ((StoryEditorExtDepsComponent) ((k7m) m7m.f((pii0) obj)).a(fpf0.a(StoryEditorExtDepsComponent.class))).Xd();
            case 3:
                return new io.reactivex.rxjava3.internal.operators.observable.s0(new x8f((b6l0) obj, i2)).r0(io.reactivex.rxjava3.schedulers.a.a()).e();
            case 4:
                return new hpj0(((StoryEditorExtDepsComponentImpl) obj).b.s());
            case 5:
                ((ebm0) obj).b.r();
                return s3q0.a;
            case 6:
                int i3 = StoryStatisticsViewersFragment.f0;
                return ((StoryStatisticsComponent) m7m.d((StoryStatisticsViewersFragment) obj).a(fpf0.a(StoryStatisticsComponent.class))).h7();
            case 7:
                throw ((Throwable) obj);
            case 8:
                int i4 = TopicsFragmentNewContainer.Q;
                return ((OnboardingScreensComponent) m7m.d((TopicsFragmentNewContainer) obj).mo408a(fpf0.a(OnboardingScreensComponent.class))).a2();
            case 9:
                int i5 = zfp0.x1;
                return ((MusicFragmentComponent) m7m.d((zfp0) obj).a(fpf0.a(MusicFragmentComponent.class))).tc();
            case 10:
                return z9r.a(((dbq0) obj).a, "incrementRetryCount(): file ");
            case 11:
                int i6 = UserProfileFragment.p0;
                return ((VkOnboardingComponent) ((k7m) m7m.f((UserProfileFragment) obj)).a(fpf0.a(VkOnboardingComponent.class))).p3();
            case 12:
                return Boolean.valueOf(((VerticalListVh) obj).p.h());
            case 13:
                String[] strArr = VideoCommentsTreeInPlayerFragment.c0;
                return ((AudioModelsComponent) m7m.d((VideoCommentsTreeInPlayerFragment) obj).a(fpf0.a(AudioModelsComponent.class))).r();
            case 14:
                return ((InfoBridgeComponent) ((VideoGrowthComponentImpl) obj).b.getValue()).t().b();
            case 15:
                com.vk.video.ui.discovery.minimizable.g gVar = (com.vk.video.ui.discovery.minimizable.g) obj;
                return new com.vk.video.ui.discovery.minimizable.related_videos.k(new m1t0(), new sdy(), new hkp(6), gVar.t, gVar.k, gVar.f.Y1(), new hus0(1, gVar, com.vk.video.ui.discovery.minimizable.g.class, "sendAction", "sendAction([Lcom/vk/mvi/core/data/MviAction;)V", 0), new hsc0(gVar, 25));
            case 16:
                return (VideoGrowthComponent) ((f8m) obj).a(fpf0.a(VideoGrowthComponent.class));
            case 17:
                return (SharingComponent) ((g8m) obj).a(fpf0.a(SharingComponent.class));
            case 18:
                return ((VkClientMultiAccountComponent) ((k7m) m7m.f((VideoProfileHorizontallScrollItemWithHighlightVh) obj)).a(fpf0.a(VkClientMultiAccountComponent.class))).a();
            case 19:
                VideoView videoView = (VideoView) obj;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                int i7 = 22;
                return new wqt0(videoView.getViewBinding(), videoView.G0, videoView.getContext(), new orj0(videoView, 27), new oqh0(videoView, i7), new ghn0(videoView, 17), new ejf0(videoView, 23), new yqd0(videoView, i7));
            case 20:
                return Boolean.valueOf(((sqt0) obj).H);
            case 21:
                return (VideoGrowthComponent) ((k7m) m7m.f((nst0) obj)).a(fpf0.a(VideoGrowthComponent.class));
            case 22:
                com.vk.superapp.browser.ui.a aVar = (com.vk.superapp.browser.ui.a) obj;
                tvv0 wn = aVar.wn();
                agu0 agu0Var = (agu0) aVar.s.getValue();
                v1w0 v1w0Var = (v1w0) aVar.p.getValue();
                v93 v93Var = new v93(aVar.k, v1w0Var, aVar.xn(), aVar.l);
                wwv0 yn = aVar.yn();
                SuperappUiRouterBridge superappUiRouterBridge = e370.d;
                if (superappUiRouterBridge == null) {
                    superappUiRouterBridge = null;
                }
                return new m1w0(wn, v93Var, agu0Var, v1w0Var, yn, superappUiRouterBridge.P(aVar));
            case 23:
                return ((GeoComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.configuration.a) obj)).mo408a(fpf0.a(GeoComponent.class))).ee();
            default:
                return Boolean.valueOf(((VkCheckEditText) obj).c.getText().length() == 0);
        }
    }
}
