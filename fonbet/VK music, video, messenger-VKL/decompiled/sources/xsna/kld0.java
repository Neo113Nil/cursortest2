package xsna;

import android.widget.TextView;
import com.vk.bridges.di.AuthBridgeComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.ImBridgeComponent;
import com.vk.bridges.di.InfoBridgeComponent;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.editor.analytics.StoryEditorEvents;
import com.vk.im.ui.views.RestrictionVKEnhancedImageView;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.compose.base.timeline.TimelineViewState;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.multiaccount.api.di.VkClientMultiAccountComponent;
import com.vk.music.pref.CrossfadeOnboarding;
import com.vk.newsfeed.impl.presentation.newsfeed_reactions.presentation.fragment.ReactionsFeedFragment;
import com.vk.profile.user.impl.di.UserProfileParamsComponentImpl;
import com.vk.profile.user.impl.ui.UserProfileFragment;
import com.vk.resetcounters.impl.di.ResetCountersComponentImpl;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.story.api.di.StoriesComponent;
import com.vk.story.archive.impl.presentation.StoryArchiveFragment;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.superapp.browser.internal.bridges.JsApiMethodType;
import com.vk.video.music.api.di.MusicInVideoComponent;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import com.vkontakte.android.R;
import org.json.JSONObject;
import ru.mail.libverify.controls.VerificationController;
import xsna.ath0;
import xsna.ker0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class kld0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ kld0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v53, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v56, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v78, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v23, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        Boolean lambda$hasIncompletedVerification$10;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                dw20 dw20Var = ((lld0) obj).c;
                if (dw20Var != null) {
                    dw20Var.dismiss();
                }
                return s3q0.a;
            case 1:
                qcy<Object>[] qcyVarArr = ReactionsFeedFragment.q0;
                return ((ReactionsFeedFragment) obj).getActivity();
            case 2:
                ((c6f0) obj).a();
                return s3q0.a;
            case 3:
                return (TextView) ((prf0) obj).a.findViewById(R.id.nativeads_rating);
            case 4:
                ResetCountersComponentImpl resetCountersComponentImpl = (ResetCountersComponentImpl) obj;
                nwy nwyVar = resetCountersComponentImpl.b;
                qcy<Object> qcyVar = ResetCountersComponentImpl.d[0];
                return new i9g0((j9g0) nwyVar.c(), resetCountersComponentImpl.a.q6());
            case 5:
                int i2 = RestrictionVKEnhancedImageView.b0;
                ((RestrictionVKEnhancedImageView) obj).postInvalidateOnAnimation();
                return s3q0.a;
            case 6:
                i1h0 i1h0Var = (i1h0) obj;
                e2h0<T, Object> e2h0Var = i1h0Var.b;
                T t = i1h0Var.e;
                if (t != 0) {
                    return e2h0Var.i(i1h0Var, t);
                }
                throw new IllegalArgumentException("Value should be initialized");
            case 7:
                return ((ath0.a) obj).j;
            case 8:
                return ((afi0) obj).p;
            case 9:
                cxl0 cxl0Var = (cxl0) StoryArchiveFragment.this.S;
                if (cxl0Var != null) {
                    cxl0Var.V0();
                }
                return s3q0.a;
            case 10:
                return ((StoriesComponent) ((k7m) m7m.f((azl0) obj)).a(fpf0.a(StoriesComponent.class))).eb();
            case 11:
                ((c4m0) obj).e.o5().i(StoryEditorEvents.GEO_ACCESS_DECLINE);
                return s3q0.a;
            case 12:
                return ((StoryEditorComponent) ((k7m) m7m.c(((vfm0) obj).b)).a(fpf0.a(StoryEditorComponent.class))).ff();
            case 13:
                int i3 = StoryStatisticsViewersFragment.f0;
                return ((StoryViewerComponent) m7m.d((StoryStatisticsViewersFragment) obj).a(fpf0.a(StoryViewerComponent.class))).l9();
            case 14:
                int i4 = x9n0.p1;
                return ((VkClientMultiAccountComponent) m7m.d((x9n0) obj).a(fpf0.a(VkClientMultiAccountComponent.class))).getExperiments();
            case 15:
                return Long.valueOf(((TimelineViewState) obj).a.getValue().longValue());
            case 16:
                zfp0 zfp0Var = (zfp0) obj;
                return new nc50(zfp0Var.o1, zfp0Var.p1, zfp0Var.v1, ((BridgeComponent) zfp0Var.i1.getValue()).Le(), (gxh) zfp0Var.j1.getValue(), zfp0.bo(zfp0Var.requireArguments()), (i940) zfp0Var.k1.getValue(), ((com.vk.music.pref.a) zfp0Var.l1.getValue()).q() != CrossfadeOnboarding.None);
            case 17:
                int i5 = UserProfileFragment.p0;
                return (ImBridgeComponent) ((k7m) m7m.f((UserProfileFragment) obj)).a(fpf0.a(ImBridgeComponent.class));
            case 18:
                UserProfileParamsComponentImpl userProfileParamsComponentImpl = (UserProfileParamsComponentImpl) obj;
                return new hzd0(userProfileParamsComponentImpl.a, userProfileParamsComponentImpl.Df());
            case 19:
                ((ubr0) obj).c.n(JsApiMethodType.SHOW_LEADER_BOARD_BOX, new JSONObject().put("success", true));
                return s3q0.a;
            case 20:
                return new ker0.a((ybv0) ((ker0) obj).yn());
            case 21:
                lambda$hasIncompletedVerification$10 = ((VerificationController) obj).lambda$hasIncompletedVerification$10();
                return lambda$hasIncompletedVerification$10;
            case 22:
                return ((AuthBridgeComponent) ((k7m) m7m.f((b9s0) obj)).a(fpf0.a(AuthBridgeComponent.class))).s();
            case 23:
                ((zak0) ((gj2) ((gas0) obj).l.getValue()).b).setValue(Boolean.valueOf(!((Boolean) ((zak0) ((gj2) r3.l.getValue()).b).getValue()).booleanValue()));
                return s3q0.a;
            case 24:
                return (InfoBridgeComponent) ((g8m) obj).a(fpf0.a(InfoBridgeComponent.class));
            case 25:
                return new i1t0(true, ((g7s0) obj).J().Y1());
            case 26:
                return ((VideoMinimizableDiscoveryFragment) obj).H0;
            case 27:
                return (MusicInVideoComponent) ((f8m) obj).a(fpf0.a(MusicInVideoComponent.class));
            case 28:
                final h4t0 h4t0Var = (h4t0) obj;
                return new b.a() { // from class: xsna.g4t0
                    @Override // com.vk.libvideo.autoplay.b.a
                    public final void a(xh5 xh5Var, xh5 xh5Var2) {
                        h4t0 h4t0Var2 = h4t0.this;
                        if (epx.f(h4t0Var2.i, xh5Var2 != null ? xh5Var2.a : null)) {
                            return;
                        }
                        yg5 yg5Var = xh5Var2 != null ? xh5Var2.a : null;
                        h4t0Var2.i = yg5Var;
                        VideoPipStateHolder.a.getClass();
                        VideoPipStateHolder.i(yg5Var);
                        h4t0Var2.l.a();
                    }
                };
            default:
                ((nst0) obj).e = null;
                return s3q0.a;
        }
    }
}
