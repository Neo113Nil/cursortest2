package xsna;

/* compiled from: AudioPlayerPoolImpl.kt */
/* loaded from: classes3.dex */
public final class ys4 {
    public final int a;
    public final int b;
    public final boolean c;

    public ys4() {
        this(false);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ys4)) {
            return false;
        }
        ys4 ys4Var = (ys4) obj;
        return this.a == ys4Var.a && this.b == ys4Var.b && this.c == ys4Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + shy.a(this.b, Integer.hashCode(this.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AudioPlayerPoolConfig(minSize=");
        sb.append(this.a);
        sb.append(", maxSize=");
        sb.append(this.b);
        sb.append(", isReuseAudioPlayerAllowed=");
        return defpackage.q0.a(sb, this.c, ')');
    }

    public ys4(boolean z) {
        this.a = 2;
        this.b = 6;
        this.c = z;
    }
}
