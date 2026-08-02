package xsna;

import android.widget.Button;
import com.unity3d.ads.core.domain.GetRequestPolicy;
import com.unity3d.services.UnityAdsConstants;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.catalog2.common.dto.ui.UIBlockVideo;
import com.vk.catalog2.common.ui.mvp.holder.clip.VideoCatalogSearchRootVh;
import com.vk.clips.design.view.editor.speed.SpeedView;
import com.vk.core.view.components.text.VkText;
import com.vk.editor.di.StoryEditorExtDepsComponentImpl;
import com.vk.libvideo.api.di.VideoAutologinComponent;
import com.vk.libvideo.api.di.VideoSubscriptionComponent;
import com.vk.libvideo.autoplay.AutoPlayMinifiedState;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.autoplay.b;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.libvideo.live.impl.fragment.VideoLiveFragment;
import com.vk.libvideo.live.impl.views.liveswipe.LiveSwipeView;
import com.vk.libvideo.minified_player.VideoMinifiedPlayerStateHolder;
import com.vk.libvideo.offline.ui.VideoOfflineFragment;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stories.design.view.stats.tabs.viewers.mvi.StoryStatisticsViewersFragment;
import com.vk.stories.design.view.stickers.StickersDrawingViewGroup;
import com.vk.storycamera.picker.template.ui.StoryTemplateFragment;
import com.vk.storycamera.picker.ui.StoryMediaPickerFragment;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragment;
import com.vkontakte.android.R;
import java.util.ListIterator;
import ru.mail.libverify.controls.VerificationController;
import ru.ok.android.api.core.ApiRequestException;
import xsna.d4k0;
import xsna.fmc0;
import xsna.znj0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class tbe0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tbe0(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i;
        GetRequestPolicy initialize$lambda$220$lambda$106;
        LiveSwipeView liveSwipeView;
        int i2 = this.b;
        r2 = 0;
        int i3 = 0;
        Object obj = this.c;
        switch (i2) {
            case 0:
                ((ube0) obj).a.e(fmc0.m.d.a);
                return s3q0.a;
            case 1:
                ((b410) obj).invoke();
                return s3q0.a;
            case 2:
                ((pbf0) obj).v6(jcr.c);
                return s3q0.a;
            case 3:
                SchemeStatSak$EventScreen schemeStatSak$EventScreen = (SchemeStatSak$EventScreen) obj;
                sk3<RegistrationFunnelScreenStack.RegistrationFunnelScreen> sk3Var = frf0.a.b;
                if (schemeStatSak$EventScreen == null) {
                    par0.a.getClass();
                    par0.f("[RegistrationFunnelScreenStack] markScreenSkippable: trying to update a null screen " + sk3Var);
                } else {
                    ListIterator<RegistrationFunnelScreenStack.RegistrationFunnelScreen> listIterator = sk3Var.listIterator(sk3Var.size());
                    while (true) {
                        if (!listIterator.hasPrevious()) {
                            i = -1;
                        } else if (listIterator.previous().b == schemeStatSak$EventScreen) {
                            i = listIterator.nextIndex();
                        }
                    }
                    if (i > 0) {
                        sk3Var.set(i, new RegistrationFunnelScreenStack.RegistrationFunnelScreen(sk3Var.get(i).b, true));
                    } else {
                        par0.a.getClass();
                        par0.b("[RegistrationFunnelScreenStack] markScreenSkippable: trying to update unknown screen " + schemeStatSak$EventScreen + " in stack " + sk3Var);
                    }
                }
                return s3q0.a;
            case 4:
                return Float.valueOf(c1h.v((c1h) obj, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1));
            case 5:
                initialize$lambda$220$lambda$106 = ServiceProvider.initialize$lambda$220$lambda$106((ServicesRegistry) obj);
                return initialize$lambda$220$lambda$106;
            case 6:
                ((io.reactivex.rxjava3.core.b) obj).onComplete();
                return s3q0.a;
            case 7:
                return Float.valueOf(((kih0) obj).getDuration() / 1000.0f);
            case 8:
                return new znj0.b(((znj0) obj).b);
            case 9:
                qcy<Object>[] qcyVarArr = SmartCropFragment.Q;
                ((SmartCropFragment) obj).eo().b(d4k0.g.b);
                return s3q0.a;
            case 10:
                ((zak0) ((a9k0) obj).h).setValue(Boolean.valueOf(!r4.f()));
                return s3q0.a;
            case 11:
                int i4 = SpeedView.B;
                return (VkText) ((SpeedView) obj).findViewById(R.id.speed_after_text);
            case 12:
                int i5 = StickersDrawingViewGroup.j0;
                ((StickersDrawingViewGroup) obj).w();
                return s3q0.a;
            case 13:
                return new vll0(new h6o0((y330) ((lml0) obj).c.g.getValue()));
            case 14:
                qcy<Object>[] qcyVarArr2 = StoryEditorExtDepsComponentImpl.r;
                evl0 B7 = ((StoryEditorExtDepsComponentImpl) obj).d.B7();
                nf9 nf9Var = nf9.b;
                return new n1m0(B7, nf9.e());
            case 15:
                StoryMediaPickerFragment storyMediaPickerFragment = (StoryMediaPickerFragment) obj;
                int i6 = StoryMediaPickerFragment.d0;
                mzp0 mzp0Var = storyMediaPickerFragment.J;
                if (mzp0Var != null) {
                    mzp0Var.d(null);
                }
                storyMediaPickerFragment.On().a();
                return s3q0.a;
            case 16:
                return StoryStatisticsViewersFragment.fo((StoryStatisticsViewersFragment) obj);
            case 17:
                int i7 = StoryTemplateFragment.U;
                return ((LinksBridgeComponent) j6i.b(m7m.d((StoryTemplateFragment) obj), LinksBridgeComponent.class)).p();
            case 18:
                return go9.b("Api request exception occurred: ", ((ApiRequestException) obj).getMessage());
            case 19:
                return Long.valueOf(((VerificationController) obj).internalGetIvtUnblockTimeout());
            case 20:
                return (Button) ((com.vk.voip.ui.settings.participants_view.o) obj).itemView.findViewById(R.id.permission_banner_btn);
            case 21:
                return Boolean.valueOf(((VideoAutoPlay) obj).R0() == AutoPlayMinifiedState.PIP);
            case 22:
                return ((VideoCatalogSearchRootVh) obj).G.b.ck();
            case 23:
                int i8 = VideoEmbedFragment.q0;
                return ((VideoSubscriptionComponent) m7m.d((VideoEmbedFragment) obj).mo408a(fpf0.a(VideoSubscriptionComponent.class))).g0();
            case 24:
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                return b.C1208b.a().e(((UIBlockVideo) obj).B, null);
            case 25:
                VideoLiveFragment.a aVar = ((VideoLiveFragment) obj).O;
                if (aVar != null && (liveSwipeView = aVar.a) != null) {
                    i3 = liveSwipeView.getCurrentPosition();
                }
                return Integer.valueOf(i3);
            case 26:
                return (VideoAutologinComponent) ((f8m) obj).a(fpf0.a(VideoAutologinComponent.class));
            case 27:
                int i9 = VideoOfflineFragment.f1;
                return new edt0(((VideoOfflineFragment) obj).requireContext());
            case 28:
                hbt0 hbt0Var = (hbt0) obj;
                if (!hbt0Var.j) {
                    VideoPipStateHolder.a.getClass();
                    if (!VideoPipStateHolder.d()) {
                        VideoMinifiedPlayerStateHolder.a.getClass();
                        if (VideoMinifiedPlayerStateHolder.b()) {
                            hbt0Var.A();
                        } else {
                            hbt0Var.D();
                        }
                    }
                }
                return s3q0.a;
            default:
                qcy<Object>[] qcyVarArr3 = VideoView.T0;
                return new q0a(((VideoView) obj).getContext());
        }
    }
}
