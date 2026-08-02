package yads;

import android.media.MediaCodec;

/* loaded from: classes10.dex */
public final class ml1 extends Exception {
    public final String b;
    public final boolean c;
    public final jl1 d;
    public final String e;

    public ml1(int i, nx0 nx0Var, sl1 sl1Var, boolean z) {
        this("Decoder init failed: [" + i + "], " + nx0Var, sl1Var, nx0Var.m, z, null, a(i));
    }

    public static String a(int i) {
        StringBuilder c = xsna.r11.c("com.monetization.ads.exoplayer2.mediacodec.MediaCodecRenderer_", i < 0 ? "neg_" : "");
        c.append(Math.abs(i));
        return c.toString();
    }

    public ml1(String str, Throwable th, String str2, boolean z, jl1 jl1Var, String str3) {
        super(str, th);
        this.b = str2;
        this.c = z;
        this.d = jl1Var;
        this.e = str3;
    }

    public static String a(Exception exc) {
        if (exc instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) exc).getDiagnosticInfo();
        }
        return null;
    }
}
