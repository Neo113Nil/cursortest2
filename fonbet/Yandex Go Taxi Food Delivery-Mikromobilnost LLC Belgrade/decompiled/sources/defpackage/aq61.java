package defpackage;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import java.nio.charset.Charset;
import org.webrtc.MediaStreamTrack;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.CryptoPro.JCSP.tools.common.window.ipc.RemoteBioParameters;

/* loaded from: classes7.dex */
public final class aq61 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public aq61(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        str.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = MediaStreamTrack.VIDEO_TRACK_KIND.equals(g681.d(str2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003c, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("TmV4dXMgMTA=", 0), r5).equals(r4) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x005e, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("T01YLkV4eW5vcy5BVkMuRGVjb2Rlci5zZWN1cmU=", 0), r5).equals(r8) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static aq61 a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        String str4;
        String str5;
        MediaCodecInfo.CodecCapabilities codecCapabilities2;
        boolean z5;
        String str6;
        int i;
        if (codecCapabilities != null && (i = rf71.a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i <= 22) {
                byte[] decode = Base64.decode("T0RST0lELVhVMw==", 0);
                Charset charset = uza.a;
                String str7 = new String(decode, charset);
                String str8 = rf71.d;
                if (!str7.equals(str8)) {
                }
                if (!new String(Base64.decode("T01YLkV4eW5vcy5BVkMuRGVjb2Rlcg==", 0), charset).equals(str)) {
                }
            }
            z3 = true;
            if (codecCapabilities != null && rf71.a >= 21) {
                codecCapabilities.isFeatureSupported("tunneled-playback");
            }
            if (!z2 || (codecCapabilities != null && rf71.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) {
                z4 = true;
                str4 = str2;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z5 = z;
                str6 = str;
            } else {
                z4 = false;
                str6 = str;
                str5 = str3;
                codecCapabilities2 = codecCapabilities;
                z5 = z;
                str4 = str2;
            }
            return new aq61(str6, str4, str5, codecCapabilities2, z5, z3, z4);
        }
        z3 = false;
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        if (z2) {
        }
        z4 = true;
        str4 = str2;
        str5 = str3;
        codecCapabilities2 = codecCapabilities;
        z5 = z;
        str6 = str;
        return new aq61(str6, str4, str5, codecCapabilities2, z5, z3, z4);
    }

    public final ko81 b(qd81 qd81Var, qd81 qd81Var2) {
        qd81 qd81Var3;
        qd81 qd81Var4;
        int i = !rf71.o(qd81Var.E, qd81Var2.E) ? 8 : 0;
        if (this.h) {
            if (qd81Var.M != qd81Var2.M) {
                i |= 1024;
            }
            if (!this.e && (qd81Var.J != qd81Var2.J || qd81Var.K != qd81Var2.K)) {
                i |= 512;
            }
            if (!rf71.o(qd81Var.Q, qd81Var2.Q)) {
                i |= 2048;
            }
            String str = rf71.d;
            mf81.c.getClass();
            byte[] decode = Base64.decode("U00tVDIzMA==", 0);
            Charset charset = uza.a;
            if (str.startsWith(new String(decode, charset)) && new String(Base64.decode("T01YLk1BUlZFTEwuVklERU8uSFcuQ09EQTc1NDJERUNPREVS", 0), charset).equals(this.a) && !qd81Var.a(qd81Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new ko81(this.a, qd81Var, qd81Var2, qd81Var.a(qd81Var2) ? 3 : 2, 0);
            }
            qd81Var3 = qd81Var;
            qd81Var4 = qd81Var2;
        } else {
            qd81Var3 = qd81Var;
            qd81Var4 = qd81Var2;
            if (qd81Var3.R != qd81Var4.R) {
                i |= 4096;
            }
            if (qd81Var3.S != qd81Var4.S) {
                i |= 8192;
            }
            if (qd81Var3.T != qd81Var4.T) {
                i |= 16384;
            }
            String str2 = this.b;
            if (i == 0 && "audio/mp4a-latm".equals(str2)) {
                Pair i2 = o581.i(qd81Var3);
                Pair i3 = o581.i(qd81Var4);
                if (i2 != null && i3 != null) {
                    int intValue = ((Integer) i2.first).intValue();
                    int intValue2 = ((Integer) i3.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new ko81(this.a, qd81Var3, qd81Var4, 3, 0);
                    }
                }
            }
            if (!qd81Var3.a(qd81Var4)) {
                i |= 32;
            }
            if ("audio/opus".equals(str2)) {
                i |= 2;
            }
            if (i == 0) {
                return new ko81(this.a, qd81Var3, qd81Var4, 1, 0);
            }
        }
        return new ko81(this.a, qd81Var3, qd81Var4, 0, i);
    }

    public final void c(String str) {
        int i = rf71.a;
        synchronized (nba1.a) {
        }
    }

    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r12v8 */
    public final boolean d(int i, int i2, double d) {
        ?? r12;
        double d2;
        boolean isSizeSupported;
        String str = this.a;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            c("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            c("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = rf71.a;
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        if (d == -1.0d || d < 1.0d) {
            r12 = 1;
            d2 = 1.0d;
            isSizeSupported = videoCapabilities.isSizeSupported(i4, i5);
        } else {
            r12 = 1;
            d2 = 1.0d;
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
        }
        if (isSizeSupported) {
            return r12;
        }
        if (i < i2) {
            byte[] decode = Base64.decode("T01YLk1USy5WSURFTy5ERUNPREVSLkhFVkM=", 0);
            Charset charset = uza.a;
            if (!new String(decode, charset).equals(str) || !new String(Base64.decode("bWN2NWE=", 0), charset).equals(rf71.b)) {
                int widthAlignment2 = videoCapabilities.getWidthAlignment();
                int heightAlignment2 = videoCapabilities.getHeightAlignment();
                Point point2 = new Point((((i2 + widthAlignment2) - r12) / widthAlignment2) * widthAlignment2, (((i + heightAlignment2) - r12) / heightAlignment2) * heightAlignment2);
                int i6 = point2.x;
                int i7 = point2.y;
                if ((d == -1.0d || d < d2) ? videoCapabilities.isSizeSupported(i6, i7) : videoCapabilities.areSizeAndRateSupported(i6, i7, Math.floor(d))) {
                    b64.s(i, i2, "sizeAndRate.rotated, ", RemoteBioParameters.X, RemoteBioParameters.X).append(d);
                    int i8 = rf71.a;
                    synchronized (nba1.a) {
                    }
                    return r12;
                }
            }
        }
        StringBuilder s = b64.s(i, i2, "sizeAndRate.support, ", RemoteBioParameters.X, RemoteBioParameters.X);
        s.append(d);
        c(s.toString());
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x018b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean e(qd81 qd81Var) {
        Pair i;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        int i2;
        boolean z;
        MediaCodecInfo.CodecCapabilities codecCapabilities;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        boolean z2;
        String str = qd81Var.E;
        int i3 = qd81Var.K;
        int i4 = qd81Var.J;
        String str2 = qd81Var.B;
        String str3 = this.b;
        if (!str3.equals(str) && !str3.equals(o581.c(qd81Var))) {
            return false;
        }
        boolean z3 = this.h;
        MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
        if (str2 != null && (i = o581.i(qd81Var)) != null) {
            int intValue = ((Integer) i.first).intValue();
            int intValue2 = ((Integer) i.second).intValue();
            if ("video/dolby-vision".equals(qd81Var.E)) {
                if ("video/avc".equals(str3)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(str3)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (z3 || intValue == 42) {
                if (codecCapabilities2 == null || (codecProfileLevelArr = codecCapabilities2.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                int i5 = 0;
                if (rf71.a <= 23 && "video/x-vnd.on2.vp9".equals(str3) && codecProfileLevelArr.length == 0) {
                    int intValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    int i6 = intValue3 >= 180000000 ? 1024 : intValue3 >= 120000000 ? 512 : intValue3 >= 60000000 ? 256 : intValue3 >= 30000000 ? 128 : intValue3 >= 18000000 ? 64 : intValue3 >= 12000000 ? 32 : intValue3 >= 7200000 ? 16 : intValue3 >= 3600000 ? 8 : intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i6;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                int length = codecProfileLevelArr.length;
                int i7 = 0;
                while (i7 < length) {
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel2 = codecProfileLevelArr[i7];
                    if (codecProfileLevel2.profile != intValue || codecProfileLevel2.level < intValue2) {
                        i2 = length;
                    } else if ("video/hevc".equals(str3) && 2 == intValue) {
                        i2 = length;
                        byte[] decode = Base64.decode("c2FpbGZpc2g=", i5);
                        Charset charset = uza.a;
                        String str4 = new String(decode, charset);
                        String str5 = rf71.b;
                        if (!str4.equals(str5)) {
                            z = z3;
                            codecCapabilities = codecCapabilities2;
                            if (!new String(Base64.decode("bWFybGlu", 0), charset).equals(str5)) {
                                if (!z) {
                                    if (i4 <= 0 || i3 <= 0) {
                                        return true;
                                    }
                                    if (rf71.a >= 21) {
                                        return d(i4, i3, qd81Var.L);
                                    }
                                    boolean z4 = i4 * i3 <= o581.a();
                                    if (!z4) {
                                        c("legacyFrameSize, " + i4 + RemoteBioParameters.X + i3);
                                    }
                                    return z4;
                                }
                                int i8 = rf71.a;
                                if (i8 < 21) {
                                    return true;
                                }
                                int i9 = qd81Var.S;
                                if (i9 == -1) {
                                    z2 = false;
                                } else {
                                    if (codecCapabilities == null) {
                                        c("sampleRate.caps");
                                        return false;
                                    }
                                    z2 = false;
                                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities.getAudioCapabilities();
                                    if (audioCapabilities == null) {
                                        c("sampleRate.aCaps");
                                        return false;
                                    }
                                    if (!audioCapabilities.isSampleRateSupported(i9)) {
                                        c("sampleRate.support, " + i9);
                                        return false;
                                    }
                                }
                                int i10 = qd81Var.R;
                                if (i10 == -1) {
                                    return true;
                                }
                                if (codecCapabilities == null) {
                                    c("channelCount.caps");
                                    return z2;
                                }
                                MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities.getAudioCapabilities();
                                if (audioCapabilities2 == null) {
                                    c("channelCount.aCaps");
                                    return z2;
                                }
                                int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                                if (maxInputChannelCount <= 1 && ((i8 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str3) && !"audio/3gpp".equals(str3) && !"audio/amr-wb".equals(str3) && !"audio/mp4a-latm".equals(str3) && !"audio/vorbis".equals(str3) && !"audio/opus".equals(str3) && !"audio/raw".equals(str3) && !"audio/flac".equals(str3) && !"audio/g711-alaw".equals(str3) && !"audio/g711-mlaw".equals(str3) && !"audio/gsm".equals(str3))) {
                                    maxInputChannelCount = "audio/ac3".equals(str3) ? 6 : "audio/eac3".equals(str3) ? 16 : 30;
                                    nba1.e();
                                }
                                if (maxInputChannelCount >= i10) {
                                    return true;
                                }
                                c("channelCount.support, " + i10);
                                return false;
                            }
                            i7++;
                            length = i2;
                            z3 = z;
                            codecCapabilities2 = codecCapabilities;
                            i5 = 0;
                        }
                    }
                    z = z3;
                    codecCapabilities = codecCapabilities2;
                    i7++;
                    length = i2;
                    z3 = z;
                    codecCapabilities2 = codecCapabilities;
                    i5 = 0;
                }
                StringBuilder x = unr0.x("codec.profileLevel, ", str2, Extension.FIX_SPACE);
                x.append(this.c);
                c(x.toString());
                return false;
            }
        }
        z = z3;
        codecCapabilities = codecCapabilities2;
        if (!z) {
        }
    }

    public final boolean f(qd81 qd81Var) {
        if (this.h) {
            return this.e;
        }
        Pair i = o581.i(qd81Var);
        return i != null && ((Integer) i.first).intValue() == 42;
    }

    public final String toString() {
        return this.a;
    }
}
