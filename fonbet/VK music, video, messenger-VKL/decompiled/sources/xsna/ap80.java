package xsna;

import android.graphics.Paint;
import android.os.Handler;
import android.os.Looper;
import com.vk.catalog2.common.ui.mvp.holder.video.VideoCatalogRootVh;
import com.vk.core.apps.BuildInfo;
import com.vk.core.preference.Preference;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.feed.design.view.newsfeed.header.subtitle.VkFeedPostHeaderSubtitleTextView;
import com.vk.libvideo.ui.dialog.single.VideoDialog;
import com.vk.reefton.literx.schedulers.ExecutorScheduler;
import com.vk.toggle.features.MusicFeatures;
import com.vk.toggle.features.VideoFeatures;
import com.vk.voip.OKVoipEngine;
import com.vk.voip.stereo.stub.room.di.VoipStereoComponentStub;
import java.lang.annotation.Annotation;
import java.util.concurrent.Executors;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes18.dex */
public final /* synthetic */ class ap80 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ ap80(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        boolean z = false;
        z = false;
        z = false;
        switch (this.b) {
            case 0:
                OnlineBookingInternalComponent.a aVar = OnlineBookingInternalComponent.n;
                return new es();
            case 1:
                return new lfa0();
            case 2:
                return Boolean.valueOf(MusicFeatures.OFFLINE_PENDING_UI.h());
            case 3:
                return new yd10();
            case 4:
                return new Handler((Looper) xk80.v0.getValue());
            case 5:
                return new ExecutorScheduler(Executors.newSingleThreadExecutor(new pof0()));
            case 6:
                return s3q0.a;
            case 7:
                return new l1h0(z ? 1 : 0);
            case 8:
                return new jgh0(0);
            case 9:
                return new j3m0();
            case 10:
                return new zqu();
            case 11:
                return new h9x(0L);
            case 12:
                int i = VideoCatalogRootVh.M0;
                VideoFeatures videoFeatures = VideoFeatures.LAZY_ERROR_VIEW;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 13:
                int i2 = VideoDialog.P0;
                if (BuildInfo.s()) {
                    VideoFeatures videoFeatures2 = VideoFeatures.VIDEO_OPEN_STANDALONE_BOTTOMSHEET_BGR_VIEW;
                    videoFeatures2.getClass();
                    if (com.vk.toggle.b.A.a(videoFeatures2) && Preference.j().getBoolean("video_background", true)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
            case 14:
                return com.vk.toggle.d.D.b();
            case 15:
                return "voip_effects";
            case 16:
                return new tub0(fpf0.a(k1u0.class), new Annotation[0]);
            case 17:
                int i3 = VkFeedPostHeaderSubtitleTextView.K;
                return rik0.b(4.0f);
            case 18:
                Paint paint = new Paint();
                paint.setAlpha(7);
                return paint;
            case 19:
                pqo pqoVar = bjv0.a;
                return Boolean.TRUE;
            case 20:
                OKVoipEngine.b.getClass();
                return OKVoipEngine.A().getVideoState();
            default:
                qcy<Object>[] qcyVarArr = VoipStereoComponentStub.b;
                return new VoipStereoComponentStub.d();
        }
    }
}
