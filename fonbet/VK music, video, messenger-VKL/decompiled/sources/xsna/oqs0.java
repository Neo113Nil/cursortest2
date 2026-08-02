package xsna;

/* compiled from: VideoInterval.kt */
@ozl
/* loaded from: classes8.dex */
public final class oqs0 {
    public final long a;
    public final String b;

    public oqs0(long j, String str) {
        this.a = j;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oqs0)) {
            return false;
        }
        oqs0 oqs0Var = (oqs0) obj;
        return this.a == oqs0Var.a && epx.f(this.b, oqs0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "VideoInterval(position=" + this.a + ", title=" + this.b + ")";
    }
}
