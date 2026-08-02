package xsna;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: OneVideoExperimentalMediaCodecVideoRenderer.kt */
/* loaded from: classes8.dex */
public final class cl80 extends androidx.media3.exoplayer.video.c {
    @Override // androidx.media3.exoplayer.video.c, androidx.media3.exoplayer.mediacodec.MediaCodecRenderer
    public final int w0(androidx.media3.exoplayer.mediacodec.e eVar, androidx.media3.common.a aVar) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        int i = aVar.v;
        int i2 = aVar.u;
        if (i2 <= 0 && i <= 0) {
            return super.w0(eVar, aVar);
        }
        String str = aVar.n;
        List<hq10> decoderInfos = eVar.getDecoderInfos(str == null ? "unknown" : str, false, false);
        MediaCodecInfo[] codecInfos = new MediaCodecList(1).getCodecInfos();
        ArrayList arrayList = new ArrayList();
        for (MediaCodecInfo mediaCodecInfo : codecInfos) {
            if (!mediaCodecInfo.isEncoder()) {
                arrayList.add(mediaCodecInfo);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String[] supportedTypes = ((MediaCodecInfo) next).getSupportedTypes();
            int length = supportedTypes.length;
            int i3 = 0;
            while (true) {
                if (i3 >= length) {
                    break;
                }
                if (brm0.w(supportedTypes[i3], str, true)) {
                    arrayList2.add(next);
                    break;
                }
                i3++;
            }
        }
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) it2.next();
            ArrayList arrayList3 = new ArrayList();
            for (Object obj : decoderInfos) {
                if (epx.f(((hq10) obj).a, mediaCodecInfo2.getName())) {
                    arrayList3.add(obj);
                }
            }
            if (!arrayList3.isEmpty() && (videoCapabilities = mediaCodecInfo2.getCapabilitiesForType(str).getVideoCapabilities()) != null && videoCapabilities.areSizeAndRateSupported(i2, i, aVar.y)) {
                int w0 = super.w0(eVar, aVar);
                return (w0 & 3584) | (w0 & 24) | 4 | (w0 & 32) | (w0 & 64) | (w0 & 384);
            }
        }
        return super.w0(eVar, aVar);
    }
}
