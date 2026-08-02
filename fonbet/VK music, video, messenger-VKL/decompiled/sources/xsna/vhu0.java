package xsna;

import com.vk.toggle.features.VideoFeatures;
import javax.net.ssl.X509TrustManager;
import one.video.calls.sdk.net.signaling.WSSignaling;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class vhu0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ vhu0(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        X509TrustManager trustManager_delegate$lambda$0;
        switch (this.b) {
            case 0:
                VideoFeatures videoFeatures = VideoFeatures.VIDEO_AUTOPLAY_TRAILERS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 1:
                return tlo0.Companion.serializer();
            default:
                trustManager_delegate$lambda$0 = WSSignaling.trustManager_delegate$lambda$0(null);
                return trustManager_delegate$lambda$0;
        }
    }
}
