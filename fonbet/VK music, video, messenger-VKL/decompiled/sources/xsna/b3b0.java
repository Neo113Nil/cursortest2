package xsna;

import android.media.MediaCodecInfo;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b3b0 implements Callable {
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i;
        hq10 hq10Var;
        int i2 = 1;
        if (gz80.a(26)) {
            try {
                List<hq10> e = MediaCodecUtil.e("video/avc", false, false);
                hq10Var = e.isEmpty() ? null : e.get(0);
            } catch (Exception unused) {
            }
            if (hq10Var != null) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = hq10Var.d;
                int maxSupportedInstances = codecCapabilities == null ? -1 : codecCapabilities.getMaxSupportedInstances();
                Integer valueOf = maxSupportedInstances != -1 ? Integer.valueOf(maxSupportedInstances) : null;
                if (valueOf != null) {
                    i = valueOf.intValue() / 3;
                    i2 = swe0.g(i, 1, 2);
                }
            }
            i = 1;
            i2 = swe0.g(i, 1, 2);
        }
        return Integer.valueOf(i2);
    }
}
