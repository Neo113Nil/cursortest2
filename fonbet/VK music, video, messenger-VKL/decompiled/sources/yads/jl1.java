package yads;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Base64;
import android.util.Pair;
import com.ironsource.X3;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;
import java.nio.charset.Charset;
import xsna.emb;
import xsna.odj;
import xsna.xy6;

/* loaded from: classes10.dex */
public final class jl1 {
    public final String a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;

    public jl1(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.a = (String) ni.a((Object) str);
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = iu1.f(str2);
    }

    public final void a(String str) {
        StringBuilder a = xsna.t33.a("NoSupport [", str, "] [");
        a.append(this.a);
        a.append(", ");
        a.append(this.b);
        a.append("] [");
        a.append(mc3.e);
        a.append(X3.j.e);
        ji1.a(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, a.toString());
    }

    public final boolean b(nx0 nx0Var) {
        if (this.h) {
            return this.e;
        }
        Pair b = xl1.b(nx0Var);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    public final String toString() {
        return this.a;
    }

    public final Point a(int i, int i2) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = mc3.a;
        return new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final va0 a(nx0 nx0Var, nx0 nx0Var2) {
        nx0 nx0Var3;
        nx0 nx0Var4;
        int i = !mc3.a(nx0Var.m, nx0Var2.m) ? 8 : 0;
        if (this.h) {
            if (nx0Var.u != nx0Var2.u) {
                i |= 1024;
            }
            if (!this.e && (nx0Var.r != nx0Var2.r || nx0Var.s != nx0Var2.s)) {
                i |= 512;
            }
            if (!mc3.a(nx0Var.y, nx0Var2.y)) {
                i |= 2048;
            }
            String str = this.a;
            String str2 = mc3.d;
            kl1 kl1Var = ql2.c;
            if (str2.startsWith(kl1Var.b()) && kl1Var.a().equals(str) && !nx0Var.a(nx0Var2)) {
                i |= 2;
            }
            if (i == 0) {
                return new va0(this.a, nx0Var, nx0Var2, nx0Var.a(nx0Var2) ? 3 : 2, 0);
            }
            nx0Var3 = nx0Var;
            nx0Var4 = nx0Var2;
        } else {
            nx0Var3 = nx0Var;
            nx0Var4 = nx0Var2;
            if (nx0Var3.z != nx0Var4.z) {
                i |= 4096;
            }
            if (nx0Var3.A != nx0Var4.A) {
                i |= 8192;
            }
            if (nx0Var3.B != nx0Var4.B) {
                i |= 16384;
            }
            if (i == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair b = xl1.b(nx0Var3);
                Pair b2 = xl1.b(nx0Var4);
                if (b != null && b2 != null) {
                    int intValue = ((Integer) b.first).intValue();
                    int intValue2 = ((Integer) b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new va0(this.a, nx0Var3, nx0Var4, 3, 0);
                    }
                }
            }
            if (!nx0Var3.a(nx0Var4)) {
                i |= 32;
            }
            if (MimeTypes.AUDIO_OPUS.equals(this.b)) {
                i |= 2;
            }
            if (i == 0) {
                return new va0(this.a, nx0Var3, nx0Var4, 1, 0);
            }
        }
        return new va0(this.a, nx0Var3, nx0Var4, 0, i);
    }

    public final boolean a(nx0 nx0Var) {
        int i;
        Pair b;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.b.equals(nx0Var.m) && !this.b.equals(xl1.a(nx0Var))) {
            return false;
        }
        int i2 = 16;
        if (nx0Var.j != null && (b = xl1.b(nx0Var)) != null) {
            int intValue = ((Integer) b.first).intValue();
            int intValue2 = ((Integer) b.second).intValue();
            int i3 = 8;
            if ("video/dolby-vision".equals(nx0Var.m)) {
                if ("video/avc".equals(this.b)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(this.b)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (this.h || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (mc3.a <= 23 && MimeTypes.VIDEO_VP9.equals(this.b) && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
                    int intValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    if (intValue3 >= 180000000) {
                        i3 = 1024;
                    } else if (intValue3 >= 120000000) {
                        i3 = 512;
                    } else if (intValue3 >= 60000000) {
                        i3 = 256;
                    } else if (intValue3 >= 30000000) {
                        i3 = 128;
                    } else if (intValue3 >= 18000000) {
                        i3 = 64;
                    } else if (intValue3 >= 12000000) {
                        i3 = 32;
                    } else if (intValue3 >= 7200000) {
                        i3 = 16;
                    } else if (intValue3 < 3600000) {
                        i3 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i3;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == intValue && codecProfileLevel2.level >= intValue2) {
                        if ("video/hevc".equals(this.b) && 2 == intValue) {
                            byte[] decode = Base64.decode("c2FpbGZpc2g=", 0);
                            Charset charset = emb.b;
                            String str = new String(decode, charset);
                            String str2 = mc3.b;
                            if (!str.equals(str2) && !new String(Base64.decode("bWFybGlu", 0), charset).equals(str2)) {
                            }
                        }
                    }
                }
                a("codec.profileLevel, " + nx0Var.j + ", " + this.c);
                return false;
            }
        }
        if (this.h) {
            int i4 = nx0Var.r;
            if (i4 <= 0 || (i = nx0Var.s) <= 0) {
                return true;
            }
            if (mc3.a >= 21) {
                return a(i4, i, nx0Var.t);
            }
            boolean z = i4 * i <= xl1.a();
            if (!z) {
                a("legacyFrameSize, " + nx0Var.r + "x" + nx0Var.s);
            }
            return z;
        }
        int i5 = mc3.a;
        if (i5 >= 21) {
            int i6 = nx0Var.A;
            if (i6 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.d;
                if (codecCapabilities3 == null) {
                    a("sampleRate.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        a("sampleRate.aCaps");
                    } else if (!audioCapabilities.isSampleRateSupported(i6)) {
                        a("sampleRate.support, " + i6);
                    }
                }
                return false;
            }
            int i7 = nx0Var.z;
            if (i7 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.d;
                if (codecCapabilities4 == null) {
                    a("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        a("channelCount.aCaps");
                    } else {
                        String str3 = this.a;
                        String str4 = this.b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i5 < 26 || maxInputChannelCount <= 0) && !MimeTypes.AUDIO_MPEG.equals(str4) && !MimeTypes.AUDIO_AMR_NB.equals(str4) && !MimeTypes.AUDIO_AMR_WB.equals(str4) && !"audio/mp4a-latm".equals(str4) && !MimeTypes.AUDIO_VORBIS.equals(str4) && !MimeTypes.AUDIO_OPUS.equals(str4) && !MimeTypes.AUDIO_RAW.equals(str4) && !MimeTypes.AUDIO_FLAC.equals(str4) && !MimeTypes.AUDIO_ALAW.equals(str4) && !MimeTypes.AUDIO_MLAW.equals(str4) && !MimeTypes.AUDIO_MSGSM.equals(str4))) {
                            if (MimeTypes.AUDIO_AC3.equals(str4)) {
                                i2 = 6;
                            } else if (!MimeTypes.AUDIO_E_AC3.equals(str4)) {
                                i2 = 30;
                            }
                            StringBuilder b2 = xy6.b(maxInputChannelCount, "AssumedMaxChannelAdjustment: ", str3, ", [", " to ");
                            b2.append(i2);
                            b2.append(X3.j.e);
                            ji1.d(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, b2.toString());
                            maxInputChannelCount = i2;
                        }
                        if (maxInputChannelCount < i7) {
                            a("channelCount.support, " + i7);
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean a(int i, int i2, double d) {
        boolean isSizeSupported;
        boolean isSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i3 = mc3.a;
        Point point = new Point((((i + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i2 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i4 = point.x;
        int i5 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i4, i5, Math.floor(d));
        } else {
            isSizeSupported = videoCapabilities.isSizeSupported(i4, i5);
        }
        if (!isSizeSupported) {
            if (i < i2) {
                String str = this.a;
                byte[] decode = Base64.decode("T01YLk1USy5WSURFTy5ERUNPREVSLkhFVkM=", 0);
                Charset charset = emb.b;
                if (!new String(decode, charset).equals(str) || !new String(Base64.decode("bWN2NWE=", 0), charset).equals(mc3.b)) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point((((i2 + widthAlignment2) - 1) / widthAlignment2) * widthAlignment2, (((i + heightAlignment2) - 1) / heightAlignment2) * heightAlignment2);
                    int i6 = point2.x;
                    int i7 = point2.y;
                    if (d != -1.0d && d >= 1.0d) {
                        isSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i6, i7, Math.floor(d));
                    } else {
                        isSizeSupported2 = videoCapabilities.isSizeSupported(i6, i7);
                    }
                    if (isSizeSupported2) {
                        StringBuilder a = odj.a(i, i2, "sizeAndRate.rotated, ", "x", "x");
                        a.append(d);
                        StringBuilder a2 = xsna.t33.a("AssumedSupport [", a.toString(), "] [");
                        a2.append(this.a);
                        a2.append(", ");
                        a2.append(this.b);
                        a2.append("] [");
                        a2.append(mc3.e);
                        a2.append(X3.j.e);
                        ji1.a(com.mbridge.msdk.playercommon.exoplayer2.mediacodec.MediaCodecInfo.TAG, a2.toString());
                    }
                }
            }
            StringBuilder a3 = odj.a(i, i2, "sizeAndRate.support, ", "x", "x");
            a3.append(d);
            a(a3.toString());
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0041, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("TmV4dXMgMTA=", 0), r3).equals(r2) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0063, code lost:
    
        if (new java.lang.String(android.util.Base64.decode("T01YLkV4eW5vcy5BVkMuRGVjb2Rlci5zZWN1cmU=", 0), r3).equals(r5) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static jl1 a(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3, boolean z4) {
        boolean z5;
        int i;
        boolean z6 = true;
        if (codecCapabilities != null && (i = mc3.a) >= 19 && codecCapabilities.isFeatureSupported("adaptive-playback")) {
            if (i <= 22) {
                byte[] decode = Base64.decode("T0RST0lELVhVMw==", 0);
                Charset charset = emb.b;
                String str4 = new String(decode, charset);
                String str5 = mc3.d;
                if (!str4.equals(str5)) {
                }
                if (!new String(Base64.decode("T01YLkV4eW5vcy5BVkMuRGVjb2Rlcg==", 0), charset).equals(str)) {
                }
            }
            z5 = true;
            if (codecCapabilities != null && mc3.a >= 21) {
                codecCapabilities.isFeatureSupported("tunneled-playback");
            }
            return new jl1(str, str2, str3, codecCapabilities, z, z6, (!z4 || (codecCapabilities != null && mc3.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) ? z5 : false);
        }
        z5 = true;
        z6 = false;
        if (codecCapabilities != null) {
            codecCapabilities.isFeatureSupported("tunneled-playback");
        }
        return new jl1(str, str2, str3, codecCapabilities, z, z6, (!z4 || (codecCapabilities != null && mc3.a >= 21 && codecCapabilities.isFeatureSupported("secure-playback"))) ? z5 : false);
    }

    public final boolean a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (mc3.a >= 29 && MimeTypes.VIDEO_VP9.equals(this.b)) {
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
}
