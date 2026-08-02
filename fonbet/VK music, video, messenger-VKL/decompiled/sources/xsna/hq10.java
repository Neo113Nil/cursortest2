package xsna;

import android.content.Context;
import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.os.Build;
import android.util.Pair;
import android.util.Range;
import androidx.annotation.Nullable;
import androidx.media3.exoplayer.mediacodec.MediaCodecUtil;
import androidx.media3.exoplayer.mediacodec.d;
import com.google.common.collect.ImmutableList;
import com.ironsource.X3;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import xsna.rt50;

/* compiled from: MediaCodecInfo.java */
/* loaded from: classes12.dex */
public final class hq10 {
    public final String a;
    public final String b;
    public final String c;

    @Nullable
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final boolean j;
    public final boolean k;
    public final boolean l;
    public int m;
    public int n;
    public float o;

    public hq10(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, boolean z7) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.h = z;
        this.i = z2;
        this.j = z3;
        this.e = z4;
        this.f = z5;
        this.g = z6;
        this.k = z7;
        this.l = io20.p(str2);
        this.o = -3.4028235E38f;
        this.m = -1;
        this.n = -1;
    }

    public static boolean a(MediaCodecInfo.VideoCapabilities videoCapabilities, int i, int i2, double d) {
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        Point point = new Point(y2r0.g(i, widthAlignment) * widthAlignment, y2r0.g(i2, heightAlignment) * heightAlignment);
        int i3 = point.x;
        int i4 = point.y;
        if (d == -1.0d || d < 1.0d) {
            return videoCapabilities.isSizeSupported(i3, i4);
        }
        double floor = Math.floor(d);
        if (!videoCapabilities.areSizeAndRateSupported(i3, i4, floor)) {
            return false;
        }
        Range<Double> achievableFrameRatesFor = videoCapabilities.getAchievableFrameRatesFor(i3, i4);
        return achievableFrameRatesFor == null || floor <= achievableFrameRatesFor.getUpper().doubleValue();
    }

    public static hq10 j(String str, String str2, String str3, @Nullable MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z6;
        boolean z7;
        boolean z8;
        String str6;
        boolean z9 = codecCapabilities != null && codecCapabilities.isFeatureSupported("adaptive-playback");
        boolean z10 = codecCapabilities != null && codecCapabilities.isFeatureSupported("tunneled-playback");
        boolean z11 = z4 || (codecCapabilities != null && codecCapabilities.isFeatureSupported("secure-playback"));
        if (Build.VERSION.SDK_INT >= 35 && codecCapabilities != null && codecCapabilities.isFeatureSupported("detached-surface")) {
            String str7 = Build.MANUFACTURER;
            if (!str7.equals("Xiaomi") && !str7.equals("OPPO") && !str7.equals("realme") && !str7.equals("motorola") && !str7.equals("LENOVO")) {
                z5 = true;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z6 = z;
                z7 = z2;
                z8 = z3;
                str4 = str2;
                return new hq10(str6, str4, str5, codecCapabilities2, z6, z7, z8, z9, z10, z11, z5);
            }
        }
        z5 = false;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z6 = z;
        z7 = z2;
        z8 = z3;
        str6 = str;
        return new hq10(str6, str4, str5, codecCapabilities2, z6, z7, z8, z9, z10, z11, z5);
    }

    public final n8l b(androidx.media3.common.a aVar, androidx.media3.common.a aVar2) {
        androidx.media3.common.a aVar3;
        androidx.media3.common.a aVar4;
        int i;
        String str = aVar.n;
        m6g m6gVar = aVar.D;
        String str2 = aVar2.n;
        m6g m6gVar2 = aVar2.D;
        int i2 = !Objects.equals(str, str2) ? 8 : 0;
        if (this.l) {
            if (aVar.z != aVar2.z) {
                i2 |= 1024;
            }
            boolean z = (aVar.u == aVar2.u && aVar.v == aVar2.v) ? false : true;
            if (!this.e && z) {
                i2 |= 512;
            }
            if ((!m6g.g(m6gVar) || !m6g.g(m6gVar2)) && !Objects.equals(m6gVar, m6gVar2)) {
                i2 |= 2048;
            }
            if (Build.MODEL.startsWith("SM-T230") && "OMX.MARVELL.VIDEO.HW.CODA7542DECODER".equals(this.a) && !aVar.c(aVar2)) {
                i2 |= 2;
            }
            int i3 = aVar.w;
            if (i3 != -1 && (i = aVar.x) != -1 && i3 == aVar2.w && i == aVar2.x && z) {
                i2 |= 2;
            }
            if (i2 == 0 && Objects.equals(aVar2.n, "video/dolby-vision")) {
                Pair<Integer, Integer> b = tzf.b(aVar);
                Pair<Integer, Integer> b2 = tzf.b(aVar2);
                if (b == null || b2 == null || !((Integer) b.first).equals(b2.first)) {
                    i2 |= 2;
                }
            }
            if (i2 == 0) {
                return new n8l(this.a, aVar, aVar2, aVar.c(aVar2) ? 3 : 2, 0);
            }
            aVar3 = aVar;
            aVar4 = aVar2;
        } else {
            aVar3 = aVar;
            aVar4 = aVar2;
            if (aVar3.F != aVar4.F) {
                i2 |= 4096;
            }
            if (aVar3.G != aVar4.G) {
                i2 |= 8192;
            }
            if (aVar3.H != aVar4.H) {
                i2 |= 16384;
            }
            String str3 = this.b;
            if (i2 == 0 && (str3.equals("audio/mp4a-latm") || str3.equals("audio/ac4"))) {
                Pair<Integer, Integer> b3 = tzf.b(aVar3);
                Pair<Integer, Integer> b4 = tzf.b(aVar4);
                if (b3 != null && b4 != null) {
                    int intValue = ((Integer) b3.first).intValue();
                    int intValue2 = ((Integer) b4.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new n8l(this.a, aVar3, aVar4, 3, 0);
                    }
                    if (str3.equals("audio/ac4") && b3.equals(b4)) {
                        return new n8l(this.a, aVar3, aVar4, 3, 0);
                    }
                }
            }
            if (i2 == 0 && (str3.equals(MimeTypes.AUDIO_E_AC3_JOC) || str3.equals(MimeTypes.AUDIO_E_AC3))) {
                return new n8l(this.a, aVar3, aVar4, 3, 0);
            }
            if (!aVar3.c(aVar4)) {
                i2 |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(str3)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new n8l(this.a, aVar3, aVar4, 1, 0);
            }
        }
        return new n8l(this.a, aVar3, aVar4, 0, i2);
    }

    /* JADX WARN: Removed duplicated region for block: B:112:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00dc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean c(Context context, androidx.media3.common.a aVar, boolean z) {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.AudioCapabilities audioCapabilities;
        Pair<Integer, Integer> pair;
        String str;
        Pair<Integer, Integer> b = tzf.b(aVar);
        String str2 = aVar.n;
        String str3 = this.c;
        if (str2 != null && str2.equals("video/mv-hevc")) {
            String q = io20.q(str3);
            if (q.equals("video/mv-hevc")) {
                return true;
            }
            if (q.equals("video/hevc")) {
                HashMap<MediaCodecUtil.a, List<hq10>> hashMap = MediaCodecUtil.a;
                List<byte[]> list = aVar.q;
                int i = 0;
                loop0: while (true) {
                    if (i >= list.size()) {
                        pair = null;
                        str = null;
                        break;
                    }
                    byte[] bArr = list.get(i);
                    int length = bArr.length;
                    if (length > 3) {
                        boolean[] zArr = new boolean[3];
                        ImmutableList.b bVar = ImmutableList.c;
                        ImmutableList.a aVar2 = new ImmutableList.a();
                        int i2 = 0;
                        while (i2 < bArr.length) {
                            int b2 = rt50.b(bArr, i2, bArr.length, zArr);
                            if (b2 != bArr.length) {
                                aVar2.c(Integer.valueOf(b2));
                            }
                            i2 = b2 + 3;
                        }
                        com.google.common.collect.g g = aVar2.g();
                        for (int i3 = 0; i3 < g.e; i3++) {
                            if (((Integer) g.get(i3)).intValue() + 3 < length) {
                                yi90 yi90Var = new yi90(bArr, ((Integer) g.get(i3)).intValue() + 3, length);
                                rt50.b f = rt50.f(yi90Var);
                                if (f.a == 33 && f.b == 0) {
                                    yi90Var.j(4);
                                    int e = yi90Var.e(3);
                                    yi90Var.i();
                                    pair = null;
                                    rt50.c g2 = rt50.g(yi90Var, true, e, null);
                                    str = tzf.a(g2.a, g2.b, g2.c, g2.d, g2.e, g2.f);
                                    break loop0;
                                }
                            }
                        }
                    }
                    i++;
                }
                if (str != null) {
                    String trim = str.trim();
                    String str4 = y2r0.a;
                    b = tzf.c(str, trim.split("\\.", -1), aVar.D);
                    if (b != null) {
                        return true;
                    }
                    int intValue = ((Integer) b.first).intValue();
                    int intValue2 = ((Integer) b.second).intValue();
                    boolean equals = "video/dolby-vision".equals(str2);
                    String str5 = this.b;
                    if (equals) {
                        str5.getClass();
                        switch (str5) {
                            case "video/av01":
                            case "video/hevc":
                                intValue = 2;
                                break;
                            case "video/avc":
                                intValue = 8;
                                break;
                        }
                        intValue2 = 0;
                    }
                    if (!this.l && !str5.equals("audio/ac4") && intValue != 42) {
                        return true;
                    }
                    MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                    if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                        codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                    }
                    if (str5.equals("audio/ac4") && codecProfileLevelArr.length == 0) {
                        int i4 = ((codecCapabilities == null || (audioCapabilities = codecCapabilities.getAudioCapabilities()) == null) ? 2 : audioCapabilities.getMaxInputChannelCount()) > 18 ? 16 : 8;
                        codecProfileLevelArr = context.getPackageManager().hasSystemFeature("android.hardware.type.automotive") ? new MediaCodecInfo.CodecProfileLevel[]{MediaCodecUtil.b(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i4)} : new MediaCodecInfo.CodecProfileLevel[]{MediaCodecUtil.b(257, i4), MediaCodecUtil.b(513, i4), MediaCodecUtil.b(514, i4), MediaCodecUtil.b(IronSourceError.ERROR_RV_LOAD_DURING_LOAD, i4), MediaCodecUtil.b(IronSourceError.ERROR_RV_LOAD_SUCCESS_UNEXPECTED, i4)};
                    }
                    for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                        if (codecProfileLevel.profile == intValue && (codecProfileLevel.level >= intValue2 || !z)) {
                            if (!"video/hevc".equals(str5) || 2 != intValue) {
                                return true;
                            }
                            String str6 = Build.DEVICE;
                            if (!"sailfish".equals(str6) && !"marlin".equals(str6)) {
                                return true;
                            }
                        }
                    }
                    i("codec.profileLevel, " + aVar.k + ", " + str3);
                    return false;
                }
                b = pair;
            }
        }
        if (b != null) {
        }
    }

    public final boolean d(androidx.media3.common.a aVar) {
        return (Objects.equals(aVar.n, MimeTypes.AUDIO_FLAC) && aVar.H == 22 && Build.VERSION.SDK_INT < 34 && this.a.equals("c2.android.flac.decoder")) ? false : true;
    }

    public final boolean e(Context context, androidx.media3.common.a aVar) {
        int i;
        String str = aVar.n;
        String str2 = this.b;
        if ((!str2.equals(str) && !str2.equals(MediaCodecUtil.c(aVar))) || !c(context, aVar, true) || !d(aVar)) {
            return false;
        }
        if (this.l) {
            int i2 = aVar.u;
            if (i2 > 0 && (i = aVar.v) > 0) {
                return h(i2, i, aVar.y);
            }
        } else {
            int i3 = aVar.G;
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (i3 != -1) {
                if (codecCapabilities == null) {
                    i("sampleRate.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities == null) {
                    i("sampleRate.aCaps");
                    return false;
                }
                if (!audioCapabilities.isSampleRateSupported(i3)) {
                    i("sampleRate.support, " + i3);
                    return false;
                }
            }
            int i4 = aVar.F;
            if (i4 != -1) {
                if (codecCapabilities == null) {
                    i("channelCount.caps");
                    return false;
                }
                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                if (audioCapabilities2 == null) {
                    i("channelCount.aCaps");
                    return false;
                }
                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                if (maxInputChannelCount <= 1 && maxInputChannelCount <= 0 && !MimeTypes.AUDIO_MPEG.equals(str2) && !MimeTypes.AUDIO_AMR_NB.equals(str2) && !MimeTypes.AUDIO_AMR_WB.equals(str2) && !"audio/mp4a-latm".equals(str2) && !MimeTypes.AUDIO_VORBIS.equals(str2) && !MimeTypes.AUDIO_OPUS.equals(str2) && !MimeTypes.AUDIO_RAW.equals(str2) && !MimeTypes.AUDIO_FLAC.equals(str2) && !MimeTypes.AUDIO_ALAW.equals(str2) && !MimeTypes.AUDIO_MLAW.equals(str2) && !MimeTypes.AUDIO_MSGSM.equals(str2)) {
                    int i5 = MimeTypes.AUDIO_AC3.equals(str2) ? 6 : MimeTypes.AUDIO_E_AC3.equals(str2) ? 16 : 30;
                    StringBuilder b = xy6.b(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", this.a, ", [", " to ");
                    b.append(i5);
                    b.append(X3.j.e);
                    ahn.F(b.toString());
                    maxInputChannelCount = i5;
                }
                if (maxInputChannelCount < i4) {
                    i("channelCount.support, " + i4);
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean f() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (Build.VERSION.SDK_INT >= 29 && MimeTypes.VIDEO_VP9.equals(this.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean g(androidx.media3.common.a aVar) {
        if (this.l) {
            return this.e;
        }
        Pair<Integer, Integer> b = tzf.b(aVar);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r3 = r1.getSupportedPerformancePoints();
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x008b, code lost:
    
        if (r2 != false) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0092  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean h(int i, int i2, double d) {
        char c;
        Boolean bool;
        List supportedPerformancePoints;
        boolean covers;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            i("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            i("sizeAndRate.vCaps");
            return false;
        }
        int i3 = Build.VERSION.SDK_INT;
        if (i3 >= 29) {
            if (i3 >= 29 && (((bool = androidx.media3.exoplayer.mediacodec.d.a) == null || !bool.booleanValue()) && supportedPerformancePoints != null && !supportedPerformancePoints.isEmpty())) {
                h32.d();
                MediaCodecInfo.VideoCapabilities.PerformancePoint d2 = i32.d(i, i2, (int) d);
                int i4 = 0;
                while (true) {
                    if (i4 >= supportedPerformancePoints.size()) {
                        c = 1;
                        break;
                    }
                    covers = sl.b(supportedPerformancePoints.get(i4)).covers(d2);
                    if (covers) {
                        c = 2;
                        break;
                    }
                    i4++;
                }
                if (c == 1 && androidx.media3.exoplayer.mediacodec.d.a == null) {
                    int a = i3 >= 35 ? 2 : d.a.a(false);
                    int a2 = d.a.a(true);
                    boolean z = a == 0 || (a2 != 0 ? !(a == 2 && a2 == 2) : a != 2);
                    androidx.media3.exoplayer.mediacodec.d.a = Boolean.valueOf(z);
                }
                if (c != 2) {
                    if (c == 1) {
                        StringBuilder a3 = odj.a(i, i2, "sizeAndRate.cover, ", "x", "@");
                        a3.append(d);
                        i(a3.toString());
                        return false;
                    }
                }
                return true;
            }
            c = 0;
            if (c != 2) {
            }
            return true;
        }
        if (!a(videoCapabilities, i, i2, d)) {
            if (i < i2) {
                String str = this.a;
                if ((!"OMX.MTK.VIDEO.DECODER.HEVC".equals(str) || !"mcv5a".equals(Build.DEVICE)) && a(videoCapabilities, i2, i, d)) {
                    StringBuilder a4 = odj.a(i, i2, "sizeAndRate.rotated, ", "x", "@");
                    a4.append(d);
                    StringBuilder a5 = xe9.a("AssumedSupport [", a4.toString(), "] [", str, ", ");
                    a5.append(this.b);
                    a5.append("] [");
                    a5.append(y2r0.a);
                    a5.append(X3.j.e);
                    ahn.m(a5.toString());
                    return true;
                }
            }
            StringBuilder a6 = odj.a(i, i2, "sizeAndRate.support, ", "x", "@");
            a6.append(d);
            i(a6.toString());
            return false;
        }
        return true;
    }

    public final void i(String str) {
        StringBuilder a = t33.a("NoSupport [", str, "] [");
        a.append(this.a);
        a.append(", ");
        a.append(this.b);
        a.append("] [");
        a.append(y2r0.a);
        a.append(X3.j.e);
        ahn.m(a.toString());
    }

    public final String toString() {
        return this.a;
    }
}
