package xsna;

import com.ironsource.adapters.fyber.interstitial.FyberInterstitialAdapter;
import com.vk.catalog2.feature.music.ui.holder.AudioBookPersonCatalogRootVh;
import com.vk.content.design.view.photo.flow.PhotoFlowToolbarView;
import com.vk.feature.uxpolls.modalpoll.UxPollsModalFragment;
import com.vk.libvideo.design.view.video.VideoView;
import com.vk.superapp.ui.SuperAppFragment;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.voip.ui.asr_online.AsrOnlineView;
import java.util.concurrent.ThreadPoolExecutor;
import ru.ok.face.morphing.FaceMorphingProcessor;
import ru.ok.tensorflow.classification.Classifier;
import xsna.jwj0;
import xsna.skm0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes7.dex */
public final /* synthetic */ class wk implements Runnable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wk(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                ((AccessibilityEvents.h) obj).invoke();
                break;
            case 1:
                int i2 = AsrOnlineView.e;
                ((AsrOnlineView) obj).fullScroll(130);
                break;
            case 2:
                AudioBookPersonCatalogRootVh audioBookPersonCatalogRootVh = (AudioBookPersonCatalogRootVh) obj;
                g3a.a(audioBookPersonCatalogRootVh.w, audioBookPersonCatalogRootVh);
                break;
            case 3:
                bwt0.p0(((fp6) obj).m, true);
                break;
            case 4:
                re9 re9Var = (re9) obj;
                re9Var.b.a.add(re9Var.m.h);
                break;
            case 5:
                ((Classifier) obj).lambda$initGPUResources$0();
                break;
            case 6:
                ((q850) ((qyd) obj).a.b).d.g(false);
                break;
            case 7:
                d3m.f((cqj) obj, 0L, 0L, null, null, true, 15);
                break;
            case 8:
                androidx.media3.exoplayer.video.a.this.h.onFirstFrameRendered();
                break;
            case 9:
                ((ThreadPoolExecutor) adn.b.getValue()).execute(new gv2((jwj0.a.C3151a) obj, 7));
                break;
            case 10:
                ((axm0) obj).onComplete();
                break;
            case 11:
                ((FaceMorphingProcessor) obj).lambda$initGPUResources$1();
                break;
            case 12:
                FyberInterstitialAdapter.destroyAd$lambda$3((FyberInterstitialAdapter) obj);
                break;
            case 13:
                ((gzs) obj).invoke();
                break;
            case 14:
                com.vk.media.ok.a aVar = ((com.vk.media.ok.b) obj).h;
                if (aVar != null) {
                    aVar.u(true);
                    break;
                }
                break;
            case 15:
                PhotoFlowToolbarView photoFlowToolbarView = (PhotoFlowToolbarView) obj;
                if (photoFlowToolbarView.z) {
                    photoFlowToolbarView.v.sendAccessibilityEvent(8);
                    break;
                }
                break;
            case 16:
                ((com.vk.profile.core.cover.a) obj).b(true);
                break;
            case 17:
                ((skm0.a) obj).o0();
                break;
            case 18:
                ((SuperAppFragment) obj).d0.a();
                break;
            case 19:
                int i3 = UxPollsModalFragment.f0;
                ((UxPollsModalFragment) obj).tn();
                break;
            default:
                VideoView videoView = (VideoView) obj;
                qcy<Object>[] qcyVarArr = VideoView.T0;
                videoView.j0(videoView.getViewBinding().c.getTransformController().e);
                break;
        }
    }
}
