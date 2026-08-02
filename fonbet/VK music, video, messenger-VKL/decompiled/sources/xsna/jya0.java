package xsna;

/* compiled from: VideoState.kt */
/* loaded from: classes3.dex */
public final class jya0 {
    public final boolean a;
    public final boolean b;

    public jya0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jya0)) {
            return false;
        }
        jya0 jya0Var = (jya0) obj;
        return this.a == jya0Var.a && this.b == jya0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackQueueState(isPreviousAvailable=");
        sb.append(this.a);
        sb.append(", isNextAvailable=");
        return defpackage.q0.a(sb, this.b, ')');
    }
}
