package xsna;

/* compiled from: TransformConfig.kt */
/* loaded from: classes3.dex */
public final class wjp0 {
    public final boolean a;
    public final boolean b;

    public wjp0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wjp0)) {
            return false;
        }
        wjp0 wjp0Var = (wjp0) obj;
        return this.a == wjp0Var.a && this.b == wjp0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TranscodeConfig(transcodeAudio=");
        sb.append(this.a);
        sb.append(", transcodeVideo=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
