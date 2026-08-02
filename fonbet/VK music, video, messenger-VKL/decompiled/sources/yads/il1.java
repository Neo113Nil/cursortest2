package yads;

import android.media.MediaCodec;

/* loaded from: classes10.dex */
public class il1 extends qa0 {
    public final String b;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public il1(IllegalStateException illegalStateException, jl1 jl1Var) {
        super(r0.toString(), illegalStateException);
        StringBuilder sb = new StringBuilder("Decoder failed: ");
        sb.append(jl1Var == null ? null : jl1Var.a);
        this.b = mc3.a >= 21 ? a(illegalStateException) : null;
    }

    public static String a(IllegalStateException illegalStateException) {
        if (illegalStateException instanceof MediaCodec.CodecException) {
            return ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        return null;
    }
}
