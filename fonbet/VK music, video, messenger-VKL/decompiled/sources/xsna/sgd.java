package xsna;

/* compiled from: ClipsAudioDecoderBufferOptimizationConfig.kt */
/* loaded from: classes16.dex */
public final class sgd {
    public static final sgd c = new sgd(false, false);
    public final boolean a;
    public final boolean b;

    public sgd(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgd)) {
            return false;
        }
        sgd sgdVar = (sgd) obj;
        return this.a == sgdVar.a && this.b == sgdVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClipsAudioDecoderBufferOptimizationConfig(isEnabled=");
        sb.append(this.a);
        sb.append(", useForTranscoder=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
