package ru.ok.android.webrtc.codecs;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import java.util.ArrayList;
import kotlin.Lazy;
import xsna.bpn0;
import xsna.px0;
import xsna.rl3;
import xsna.swe0;

/* loaded from: classes9.dex */
public final class CodecListEstimator {
    public final Lazy a = new bpn0(new px0(this, 23));

    public static final int a(CodecListEstimator codecListEstimator) {
        boolean isHardwareAccelerated;
        codecListEstimator.getClass();
        int i = 0;
        if (Build.VERSION.SDK_INT >= 29) {
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (rl3.G(mediaCodecInfo.getSupportedTypes(), "video/avc") && !mediaCodecInfo.isEncoder()) {
                    isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
                    if (isHardwareAccelerated) {
                        arrayList.add(mediaCodecInfo);
                    }
                }
            }
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj = arrayList.get(i2);
                i2++;
                MediaCodecInfo.CodecCapabilities capabilitiesForType = ((MediaCodecInfo) obj).getCapabilitiesForType("video/avc");
                if (capabilitiesForType.getMaxSupportedInstances() > 0) {
                    i = capabilitiesForType.getMaxSupportedInstances();
                    break;
                }
            }
        }
        return swe0.g(i - 5, 4, 10);
    }

    public final int getMaxH264DecoderInstancesSupported() {
        return ((Number) this.a.getValue()).intValue();
    }
}
