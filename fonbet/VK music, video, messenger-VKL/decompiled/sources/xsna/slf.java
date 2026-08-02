package xsna;

import android.os.SystemClock;
import com.facebook.imagepipeline.request.ImageRequestBuilder;
import com.vk.api.generated.shortVideo.dto.ShortVideoGetResponseDto;
import java.util.concurrent.Callable;
import org.webrtc.HardwareVideoEncoderV2;
import org.webrtc.VideoCodecStatus;
import xsna.ded;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes17.dex */
public final /* synthetic */ class slf implements Callable {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ slf(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        VideoCodecStatus lambda$releaseCodecThread$3;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                fgj0 fgj0Var = fgj0.a;
                ShortVideoGetResponseDto shortVideoGetResponseDto = ((ded.h) obj).a;
                fgj0Var.getClass();
                return fgj0.a(shortVideoGetResponseDto);
            case 1:
                lambda$releaseCodecThread$3 = ((HardwareVideoEncoderV2) obj).lambda$releaseCodecThread$3();
                return lambda$releaseCodecThread$3;
            case 2:
                return ((ysw) obj).c.c().i();
            case 3:
                return rhs.b().g(((ImageRequestBuilder) obj).a());
            default:
                ((l2t0) obj).C(new z1t0(SystemClock.elapsedRealtime()));
                return s3q0.a;
        }
    }
}
