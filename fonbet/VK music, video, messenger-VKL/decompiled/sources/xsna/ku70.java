package xsna;

import android.os.Handler;
import android.os.HandlerThread;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.ecomm.onlinebooking.api.router.di.OnlineBookingComponent$Companion$STUB$1;
import com.vk.libvideo.embedded_players.ui.fragments.VideoEmbedFragment;
import com.vk.libvideo.pip.VideoPipStateHolder;
import com.vk.toggle.b;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.StoriesFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.video.ui.smartcrop.impl.presentation.fragment.SmartCropFragmentInternalComponent;
import java.lang.annotation.Annotation;
import org.json.JSONObject;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class ku70 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ku70(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        JSONObject g;
        switch (this.b) {
            case 0:
                return Boolean.valueOf(MusicFeatures.AUDIO_NEW_DOWNLOADED_FILTERS.h());
            case 1:
                return new Handler(((HandlerThread) sy70.d0.getValue()).getLooper());
            case 2:
                return new Exception();
            case 3:
                qcy<Object>[] qcyVarArr = OnlineBookingComponent$Companion$STUB$1.c;
                return new OnlineBookingComponent$Companion$STUB$1.a();
            case 4:
                return new qu80();
            case 5:
                com.vk.registration.funnels.b.a.getClass();
                com.vk.registration.funnels.b.x();
                return s3q0.a;
            case 6:
                return s3q0.a;
            case 7:
                return (aof0) qof0.t.getValue();
            case 8:
                return s3q0.a;
            case 9:
                return Boolean.valueOf(com.vk.toggle.d.O());
            case 10:
                SmartCropFragmentInternalComponent.a aVar = SmartCropFragmentInternalComponent.g;
                bpn0 bpn0Var = qu5.a;
                if (bpn0Var == null) {
                    bpn0Var = null;
                }
                return (o1b0) bpn0Var.getValue();
            case 11:
                eqy<bek0> eqyVar = com.vk.toggle.d.a;
                b.d i = com.vk.toggle.b.A.i(StoriesFeatures.NEW_PRELOADER);
                return Integer.valueOf((i == null || (g = i.g()) == null) ? 1 : g.optInt("deep"));
            case 12:
                return fvp0.a;
            case 13:
                int i2 = VideoCatalogRootVh.M0;
                VideoFeatures videoFeatures = VideoFeatures.LAZY_SEARCH_VIEW;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 14:
                int i3 = VideoEmbedFragment.q0;
                VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_ACTION_AFTER_LOGIN;
                videoFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures2));
            case 15:
                VideoPipStateHolder.a.getClass();
                return Boolean.valueOf(VideoPipStateHolder.g());
            default:
                return new tub0(fpf0.a(dko.class), new Annotation[0]);
        }
    }
}
