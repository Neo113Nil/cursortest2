package xsna;

import com.vk.superapp.sessionmanagment.api.domain.di.SessionManagementComponent;
import com.vk.toggle.features.VoipFeatures;
import com.vk.video.ui.discovery.minimizable.VideoMinimizableDiscoveryFragment;
import java.lang.annotation.Annotation;
import ru.ok.android.webrtc.PeerConnectionClient;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class bzq0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ bzq0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return new eaf0();
            case 1:
                int i = VideoMinimizableDiscoveryFragment.p1;
                return Boolean.valueOf(fxc0.B().J().W0());
            case 2:
                return s3q0.a;
            case 3:
                return new tub0(fpf0.a(k1u0.class), new Annotation[0]);
            case 4:
                return ((SessionManagementComponent) com.vk.auth.main.f.a.getValue()).B2();
            case 5:
                o2l.a.getClass();
                return o2l.b("__dbg_call_webrtc_sdp_munging", false) ? new String[]{o2l.c("__dbg_call_webrtc_sdp_video_codecs", "")} : com.vk.toggle.b.A.a(VoipFeatures.H265_PRIORITIZED) ? new String[]{"H265", PeerConnectionClient.VIDEO_CODEC_H264, "VP8"} : new String[]{PeerConnectionClient.VIDEO_CODEC_H264, "VP8"};
            default:
                m5r b = com.vk.toggle.d.y0.b();
                if (b == null) {
                    m5r.b.getClass();
                    b = m5r.c;
                }
                return Integer.valueOf(b.a);
        }
    }
}
