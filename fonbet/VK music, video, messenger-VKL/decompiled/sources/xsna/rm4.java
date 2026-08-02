package xsna;

/* compiled from: AudioDecoderBufferOptimizationConfig.kt */
/* loaded from: classes3.dex */
public final class rm4 {
    public final boolean a;
    public final boolean b;

    public rm4(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm4)) {
            return false;
        }
        rm4 rm4Var = (rm4) obj;
        return this.a == rm4Var.a && this.b == rm4Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioDecoderBufferOptimizationConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", useForTranscoder=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
