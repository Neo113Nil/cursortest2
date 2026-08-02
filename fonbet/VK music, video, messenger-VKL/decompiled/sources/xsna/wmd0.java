package xsna;

import android.content.Context;
import android.view.View;
import android.widget.RadioButton;
import androidx.recyclerview.widget.RecyclerView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.bridges.di.BridgeComponent;
import com.vk.catalog2.common.ui.mvp.holder.header.toolbar.ToolbarRedesignVh;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoItemListSmallVh;
import com.vk.clips.viewer.edit.api.di.ClipViewerEditSdkComponent;
import com.vk.core.telemetry.VideoOpenTelemetryComponentImpl;
import com.vk.core.view.components.button.VkButton;
import com.vk.donut.video.api.di.DonutVideoComponent;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.libvideo.api.minimizable.VideoMinimizableState;
import com.vk.libvideo.ui.video2.skippablepart.VideoSkippablePartView;
import com.vk.narratives.api.di.NarrativeComponent;
import com.vk.profile.questions.impl.QuestionsListFragment;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stickers.keyboard.StickersView;
import com.vk.superapp.multiaccount.impl.ui.relateduser.RelatedUserStackView;
import com.vk.video.assistant.api.di.AiAssistantComponent;
import com.vk.video.ui.catalog.VideoCatalogFragment;
import com.vk.video.ui.discovery.minimizable.dialog.episodes.VideoEpisodesFragment;
import com.vk.video.ui.discovery.minimizable.dialog.related_videos.VideoRelatedVideosFragment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.HashSet;
import xsna.bcp0;
import xsna.k840;
import xsna.tmd0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class wmd0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wmd0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v36, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v60, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v72, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v96, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v16, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        LottieAnimationView lottieAnimationView;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((ml1) obj).invoke(tmd0.e.a);
                return s3q0.a;
            case 1:
                com.vk.ecomm.product_list.presentation.a aVar = (com.vk.ecomm.product_list.presentation.a) obj;
                return ((ModerationComponent) m7m.d(aVar).mo408a(fpf0.a(ModerationComponent.class))).pa().b(aVar.requireContext(), aVar, false);
            case 2:
                ((xah) obj).invoke();
                return s3q0.a;
            case 3:
                int i2 = QuestionsListFragment.f0;
                return ((BridgeComponent) m7m.d((QuestionsListFragment) obj).a(fpf0.a(BridgeComponent.class))).p();
            case 4:
                RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
                frf0.f(SchemeStatSak$EventScreen.OTHER, SchemeStatSak$EventScreen.QR_CODE_DISPLAY_CODE, (ArrayList) obj, false, null, null, 56);
                return s3q0.a;
            case 5:
                return ((RelatedUserStackView) obj).i;
            case 6:
                return ((NarrativeComponent) m7m.d((e8j0) obj).a(fpf0.a(NarrativeComponent.class))).n4();
            case 7:
                return (VkButton) ((com.vk.sharing.core.view.f) obj).findViewById(R.id.sharing_redesign_send_button);
            case 8:
                apk0 apk0Var = (apk0) ((bpk0) obj).h;
                if (apk0Var != null) {
                    apk0Var.d4();
                }
                return s3q0.a;
            case 9:
                return Boolean.valueOf(((StickersView) obj).D.a());
            case 10:
                bdm0 bdm0Var = (bdm0) obj;
                if (f4m.h(bdm0Var.i) && (lottieAnimationView = bdm0Var.g) != null) {
                    lottieAnimationView.m0();
                }
                return s3q0.a;
            case 11:
                ((ToolbarRedesignVh) obj).u = null;
                return s3q0.a;
            case 12:
                bcp0.a aVar2 = bcp0.w;
                return (VideoMinimizableState) ((io.reactivex.rxjava3.subjects.d) ((bcp0) obj).s.getValue()).P0();
            case 13:
                yj40 yj40Var = (yj40) obj;
                r5v0 r5v0Var = k840.a.h;
                (r5v0Var != null ? r5v0Var : null).b(yj40Var);
                return s3q0.a;
            case 14:
                jrp0 jrp0Var = (jrp0) obj;
                return Long.valueOf(-nzo.g(jrp0Var.c, jrp0Var.a));
            case 15:
                return ((ClipViewerEditSdkComponent) ((kzq0) obj).a.mo408a(fpf0.a(ClipViewerEditSdkComponent.class))).a();
            case 16:
                return Boolean.valueOf(((DonutVideoComponent) m7m.a(((exr0) obj).a.getActivity()).a(fpf0.a(DonutVideoComponent.class))).J().a());
            case 17:
                int i3 = VideoCatalogFragment.l0;
                ((qo5) ((VideoCatalogFragment) obj).a0.getValue()).getClass();
                return Boolean.FALSE;
            case 18:
                VideoEpisodesFragment videoEpisodesFragment = (VideoEpisodesFragment) obj;
                int i4 = VideoEpisodesFragment.V;
                Context requireContext = videoEpisodesFragment.requireContext();
                ((com.vk.video.kidsprofile.restricteduseractions.a) videoEpisodesFragment.S.getValue()).getClass();
                ezs0 s = fxc0.B().s();
                jan0 jan0Var = new jan0(videoEpisodesFragment, 7);
                re0 re0Var = new re0(12);
                HashSet hashSet = iah0.a;
                isp ispVar = new isp(fnj.d(requireContext) ? R.layout.video_episode_full_tablet : R.layout.video_episode_full, re0Var, null, s, false, jan0Var, null);
                ispVar.h.d.add(new jsp(ispVar));
                return ispVar;
            case 19:
                Object obj2 = VideoItemListSmallVh.c0;
                return ((DonutVideoComponent) ((VideoItemListSmallVh) obj).X.getValue()).s3();
            case 20:
                return Long.valueOf(((VideoOpenTelemetryComponentImpl) obj).a.s().c().b);
            case 21:
                int i5 = VideoRelatedVideosFragment.n0;
                return ((AiAssistantComponent) m7m.d((VideoRelatedVideosFragment) obj).mo408a(fpf0.a(AiAssistantComponent.class))).Sd();
            case 22:
                return VideoSkippablePartView.b((VideoSkippablePartView) obj);
            case 23:
                ((alt0) obj).b = false;
                return s3q0.a;
            case 24:
                return new w29((vtt0) obj, 13);
            case 25:
                int i6 = fpu0.c0;
                ((fpu0) obj).un().getState().g().a.J().l1();
                return s3q0.a;
            case 26:
                return (RadioButton) ((View) ((hgw0) obj).f.getValue()).findViewById(R.id.call_by_link_media_setting_enabled_radio_button);
            case 27:
                return (RecyclerView) ((sow0) obj).d().findViewById(R.id.call_group_selector_recycler);
            default:
                ((qgx0) obj).c.e();
                return s3q0.a;
        }
    }
}
