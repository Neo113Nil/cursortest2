package xsna;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Pair;
import kotlin.Result;
import kotlin.collections.EmptyList;

/* compiled from: MediaCodecHolder.kt */
/* loaded from: classes3.dex */
public final class gq10 {
    public static final a a = new a();
    public static volatile b b;

    /* compiled from: MediaCodecHolder.kt */
    public static final class a {
        public static LinkedHashMap a(f100 f100Var, boolean z) {
            String str;
            String str2;
            Object failure;
            MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
            ArrayList arrayList = new ArrayList();
            for (MediaCodecInfo mediaCodecInfo : codecInfos) {
                if (mediaCodecInfo.isEncoder() == z) {
                    arrayList.add(mediaCodecInfo);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                MediaCodecInfo mediaCodecInfo2 = (MediaCodecInfo) it.next();
                String[] supportedTypes = mediaCodecInfo2.getSupportedTypes();
                int e = on00.e(supportedTypes.length);
                if (e < 16) {
                    e = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(e);
                for (String str3 : supportedTypes) {
                    Pair pair = new Pair(str3, mediaCodecInfo2);
                    linkedHashMap.put(pair.i(), pair.j());
                }
                g5g.z(arrayList2, rn00.w(linkedHashMap));
            }
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            Iterator it2 = arrayList2.iterator();
            while (it2.hasNext()) {
                Map.Entry entry = (Map.Entry) it2.next();
                String str4 = (String) entry.getKey();
                Object obj = linkedHashMap2.get(str4);
                if (obj == null) {
                    obj = s5a.a(str4, linkedHashMap2);
                }
                ((List) obj).add((MediaCodecInfo) entry.getValue());
            }
            if (f100Var == null) {
                return linkedHashMap2;
            }
            StringBuilder sb = new StringBuilder(i5s.a(new StringBuilder("codec infos for "), z ? "encoder" : "decoder", " requested:\n"));
            Iterator it3 = linkedHashMap2.keySet().iterator();
            while (true) {
                String str5 = "MediaCodecsHolder";
                if (!it3.hasNext()) {
                    LinkedHashMap linkedHashMap3 = linkedHashMap2;
                    f100Var.i("MediaCodecsHolder", sb.toString());
                    return linkedHashMap3;
                }
                String str6 = (String) it3.next();
                sb.append(str6 + " ->\n");
                List list = (List) linkedHashMap2.get(str6);
                if (list != null) {
                    Iterator it4 = list.iterator();
                    while (it4.hasNext()) {
                        MediaCodecInfo mediaCodecInfo3 = (MediaCodecInfo) it4.next();
                        LinkedHashMap linkedHashMap4 = linkedHashMap2;
                        Iterator it5 = it3;
                        Iterator it6 = it4;
                        String str7 = str5;
                        try {
                            boolean b = b(mediaCodecInfo3, str6);
                            MediaCodecInfo.CodecCapabilities capabilitiesForType = mediaCodecInfo3.getCapabilitiesForType(str6);
                            str = str6;
                            try {
                                sb.append("    " + mediaCodecInfo3.getName() + " - max_instances=" + Integer.valueOf(capabilitiesForType.getMaxSupportedInstances()));
                                StringBuilder sb2 = new StringBuilder(", is_hardware=");
                                sb2.append(b);
                                sb.append(sb2.toString());
                                MediaCodecInfo.VideoCapabilities videoCapabilities = capabilitiesForType.getVideoCapabilities();
                                if (videoCapabilities != null) {
                                    sb.append(", v_bitrate=" + videoCapabilities.getBitrateRange());
                                    sb.append(", width=" + videoCapabilities.getSupportedWidths());
                                    sb.append(", height=" + videoCapabilities.getSupportedHeights());
                                    sb.append(", fps=" + videoCapabilities.getSupportedFrameRates());
                                    sb.append(", width_alignment=" + videoCapabilities.getWidthAlignment());
                                    sb.append(", height_alignment=" + videoCapabilities.getHeightAlignment());
                                }
                                MediaCodecInfo.AudioCapabilities audioCapabilities = capabilitiesForType.getAudioCapabilities();
                                if (audioCapabilities != null) {
                                    sb.append(", a_bitrate=" + audioCapabilities.getBitrateRange());
                                    sb.append(", max_channels=" + audioCapabilities.getMaxInputChannelCount());
                                    StringBuilder sb3 = new StringBuilder(", sample_rate=");
                                    try {
                                        failure = audioCapabilities.getSupportedSampleRates();
                                    } catch (Throwable th) {
                                        failure = new Result.Failure(th);
                                    }
                                    if (failure instanceof Result.Failure) {
                                        failure = null;
                                    }
                                    int[] iArr = (int[]) failure;
                                    sb3.append(iArr != null ? rl3.X(HiAnalyticsConstant.REPORT_VAL_SEPARATOR, iArr) : null);
                                    sb.append(sb3.toString());
                                }
                                sb.append("\n");
                                str2 = str7;
                            } catch (Throwable th2) {
                                th = th2;
                                str2 = str7;
                                try {
                                    f100Var.a(str2, th);
                                    it3 = it5;
                                    str5 = str2;
                                    linkedHashMap2 = linkedHashMap4;
                                    it4 = it6;
                                    str6 = str;
                                } finally {
                                    sb.append("\n");
                                }
                            }
                        } catch (Throwable th3) {
                            th = th3;
                            str = str6;
                        }
                        it3 = it5;
                        str5 = str2;
                        linkedHashMap2 = linkedHashMap4;
                        it4 = it6;
                        str6 = str;
                    }
                }
                it3 = it3;
                linkedHashMap2 = linkedHashMap2;
            }
        }

        public static boolean b(MediaCodecInfo mediaCodecInfo, String str) {
            boolean isHardwareAccelerated;
            if (Build.VERSION.SDK_INT < 29) {
                return !c(mediaCodecInfo, str);
            }
            isHardwareAccelerated = mediaCodecInfo.isHardwareAccelerated();
            return isHardwareAccelerated;
        }

        public static boolean c(MediaCodecInfo mediaCodecInfo, String str) {
            boolean isSoftwareOnly;
            if (Build.VERSION.SDK_INT >= 29) {
                isSoftwareOnly = mediaCodecInfo.isSoftwareOnly();
                return isSoftwareOnly;
            }
            if (!brm0.B(str, "audio/", true)) {
                String lowerCase = mediaCodecInfo.getName().toLowerCase(Locale.ROOT);
                if (!brm0.B(lowerCase, "arc.", false) && !brm0.B(lowerCase, "omx.google.", false) && !brm0.B(lowerCase, "omx.ffmpeg.", false) && ((!brm0.B(lowerCase, "omx.sec.", false) || !drm0.D(lowerCase, ".sw.", false)) && !lowerCase.equals("omx.qcom.video.decoder.hevcswvdec") && !brm0.B(lowerCase, "c2.android.", false) && !brm0.B(lowerCase, "c2.google.", false) && (brm0.B(lowerCase, "omx.", false) || brm0.B(lowerCase, "c2.", false)))) {
                    return false;
                }
            }
            return true;
        }
    }

    /* compiled from: MediaCodecHolder.kt */
    public static final class b {
        public final LinkedHashMap a;
        public final LinkedHashMap b;

        public b(LinkedHashMap linkedHashMap, LinkedHashMap linkedHashMap2) {
            this.a = linkedHashMap;
            this.b = linkedHashMap2;
        }
    }

    public gq10(f100 f100Var) {
        a aVar = a;
        if (b != null) {
            return;
        }
        synchronized (aVar) {
            if (b != null) {
                return;
            }
            b = new b(a.a(f100Var, true), a.a(f100Var, false));
            s3q0 s3q0Var = s3q0.a;
        }
    }

    public static List a(String str, boolean z, boolean z2) {
        if (!z2) {
            return b(str, z);
        }
        List b2 = b(str, z);
        ArrayList arrayList = new ArrayList();
        for (Object obj : b2) {
            if (a.c((MediaCodecInfo) obj, str)) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static List b(String str, boolean z) {
        if (str.length() == 0) {
            return EmptyList.b;
        }
        if (z) {
            b bVar = b;
            List list = (List) (bVar != null ? bVar : null).a.get(str);
            return list == null ? EmptyList.b : list;
        }
        b bVar2 = b;
        List list2 = (List) (bVar2 != null ? bVar2 : null).b.get(str);
        return list2 == null ? EmptyList.b : list2;
    }

    public static ArrayList c(String str) {
        List b2 = b(str, true);
        ArrayList arrayList = new ArrayList(c5g.u(b2, 10));
        Iterator it = b2.iterator();
        while (it.hasNext()) {
            arrayList.add(((MediaCodecInfo) it.next()).getCapabilitiesForType(str));
        }
        return arrayList;
    }

    public static boolean d(MediaCodecInfo mediaCodecInfo, MediaFormat mediaFormat) {
        MediaCodecInfo.CodecCapabilities capabilitiesForType;
        String string = mediaFormat.getString("mime");
        if (!rl3.G(mediaCodecInfo.getSupportedTypes(), string) || (capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(string)) == null) {
            return false;
        }
        new gr10(mediaFormat);
        return capabilitiesForType.isFormatSupported(mediaFormat);
    }
}
