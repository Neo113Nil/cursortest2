package xsna;

import android.media.CamcorderProfile;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.os.Build;
import android.util.Range;
import android.util.Size;
import androidx.annotation.Nullable;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.c;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Collection;
import java.util.List;
import java.util.RandomAccess;

/* compiled from: EncoderUtil.java */
/* loaded from: classes12.dex */
public final class hjp {
    public static final ArrayListMultimap<String, MediaCodecInfo> a = ArrayListMultimap.n();

    public static int a(int i, int i2) {
        if (i % 10 != 1) {
            return Math.round(i / i2) * i2;
        }
        return (int) (Math.floor(i / i2) * i2);
    }

    public static int b(MediaCodecInfo mediaCodecInfo, String str, int i) {
        int i2 = -1;
        for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
            if (codecProfileLevel.profile == i) {
                i2 = Math.max(i2, codecProfileLevel.level);
            }
        }
        return i2;
    }

    public static int c(MediaCodecInfo mediaCodecInfo, String str, int i) {
        MediaCodecInfo.AudioCapabilities audioCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getAudioCapabilities();
        audioCapabilities.getClass();
        int[] supportedSampleRates = audioCapabilities.getSupportedSampleRates();
        int i2 = 0;
        int i3 = Integer.MAX_VALUE;
        if (supportedSampleRates != null) {
            int length = supportedSampleRates.length;
            while (i2 < length) {
                int i4 = supportedSampleRates[i2];
                if (Math.abs(i4 - i) < Math.abs(i3 - i)) {
                    i3 = i4;
                }
                i2++;
            }
            return i3;
        }
        Range<Integer>[] supportedSampleRateRanges = audioCapabilities.getSupportedSampleRateRanges();
        int length2 = supportedSampleRateRanges.length;
        while (i2 < length2) {
            int intValue = supportedSampleRateRanges[i2].clamp(Integer.valueOf(i)).intValue();
            if (Math.abs(intValue - i) < Math.abs(i3 - i)) {
                i3 = intValue;
            }
            i2++;
        }
        return i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0034, code lost:
    
        if (r6.equals("video/hevc") == false) goto L4;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static com.google.common.collect.g d(int i, String str) {
        char c = 2;
        str.getClass();
        switch (str.hashCode()) {
            case -1851077871:
                if (str.equals("video/dolby-vision")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case -1662735862:
                if (str.equals(MimeTypes.VIDEO_AV1)) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case -1662541442:
                break;
            case 1331836730:
                if (str.equals("video/avc")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            case 1599127257:
                if (str.equals(com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes.VIDEO_VP9)) {
                    c = 4;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        switch (c) {
            case 0:
                if (i == 7) {
                    return ImmutableList.p(256);
                }
                break;
            case 1:
                if (i == 7) {
                    return ImmutableList.p(2);
                }
                if (i == 6) {
                    return ImmutableList.p(4096);
                }
                break;
            case 2:
                if (i == 7) {
                    return ImmutableList.p(2);
                }
                if (i == 6) {
                    return ImmutableList.p(4096);
                }
                break;
            case 3:
                if (i == 7) {
                    return ImmutableList.p(16);
                }
                break;
            case 4:
                if (i == 7 || i == 6) {
                    return ImmutableList.q(4096, 8192);
                }
        }
        ImmutableList.b bVar = ImmutableList.c;
        return com.google.common.collect.g.f;
    }

    public static synchronized ImmutableList<MediaCodecInfo> e(String str) {
        ImmutableList<MediaCodecInfo> m;
        synchronized (hjp.class) {
            j();
            ArrayListMultimap<String, MediaCodecInfo> arrayListMultimap = a;
            String u = o19.u(str);
            Collection<MediaCodecInfo> collection = arrayListMultimap.e.get(u);
            if (collection == null) {
                collection = arrayListMultimap.j();
            }
            List list = (List) collection;
            m = ImmutableList.m(list instanceof RandomAccess ? new c.f(u, list, null) : new c.j(u, list, null));
        }
        return m;
    }

    public static com.google.common.collect.g f(String str, @Nullable m6g m6gVar) {
        boolean isAlias;
        if (Build.VERSION.SDK_INT < 33 || m6gVar == null) {
            ImmutableList.b bVar = ImmutableList.c;
            return com.google.common.collect.g.f;
        }
        ImmutableList<MediaCodecInfo> e = e(str);
        ImmutableList.a aVar = new ImmutableList.a();
        for (int i = 0; i < e.size(); i++) {
            MediaCodecInfo mediaCodecInfo = e.get(i);
            isAlias = mediaCodecInfo.isAlias();
            if (!isAlias && h(mediaCodecInfo, str, m6gVar)) {
                aVar.c(mediaCodecInfo);
            }
        }
        return aVar.g();
    }

    @Nullable
    public static Size g(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        videoCapabilities.getClass();
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int a2 = a(i, widthAlignment);
        int a3 = a(i2, heightAlignment);
        if (i(mediaCodecInfo, str, a2, a3)) {
            return new Size(a2, a3);
        }
        float[] fArr = {0.95f, 0.9f, 0.85f, 0.8f, 0.75f, 0.7f, 0.6666667f, 0.6f, 0.55f, 0.5f, 0.4f, 0.33333334f, 0.25f};
        for (int i3 = 0; i3 < 13; i3++) {
            float f = fArr[i3];
            int a4 = a(Math.round(i * f), widthAlignment);
            int a5 = a(Math.round(i2 * f), heightAlignment);
            if (i(mediaCodecInfo, str, a4, a5)) {
                return new Size(a4, a5);
            }
        }
        int intValue = videoCapabilities.getSupportedHeightsFor(videoCapabilities.getSupportedWidths().clamp(Integer.valueOf(i)).intValue()).clamp(Integer.valueOf(i2)).intValue();
        if (intValue != i2) {
            i = a((int) Math.round((i * intValue) / i2), widthAlignment);
            i2 = a(intValue, heightAlignment);
        }
        if (i(mediaCodecInfo, str, i, i2)) {
            return new Size(i, i2);
        }
        return null;
    }

    public static boolean h(MediaCodecInfo mediaCodecInfo, String str, m6g m6gVar) {
        if (str.equals("video/dolby-vision") || mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("hdr-editing") || (m6gVar.c == 7 && Build.VERSION.SDK_INT >= 35 && mediaCodecInfo.getCapabilitiesForType(str).isFeatureSupported("hlg-editing"))) {
            com.google.common.collect.g d = d(m6gVar.c, str);
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : mediaCodecInfo.getCapabilitiesForType(str).profileLevels) {
                if (d.contains(Integer.valueOf(codecProfileLevel.profile))) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean i(MediaCodecInfo mediaCodecInfo, String str, int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(str).getVideoCapabilities();
        videoCapabilities.getClass();
        if (videoCapabilities.isSizeSupported(i, i2)) {
            return true;
        }
        if (i == 1920 && i2 == 1080) {
            return CamcorderProfile.hasProfile(6);
        }
        if (i == 3840 && i2 == 2160) {
            return CamcorderProfile.hasProfile(8);
        }
        return false;
    }

    public static synchronized void j() {
        synchronized (hjp.class) {
            if (a.f == 0) {
                for (MediaCodecInfo mediaCodecInfo : new MediaCodecList(0).getCodecInfos()) {
                    if (mediaCodecInfo.isEncoder()) {
                        for (String str : mediaCodecInfo.getSupportedTypes()) {
                            a.m(o19.u(str), mediaCodecInfo);
                        }
                    }
                }
            }
        }
    }
}
