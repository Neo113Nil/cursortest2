package xsna;

/* compiled from: MediaLoadAudioData.kt */
/* loaded from: classes3.dex */
public final class or10 {
    public final long a;
    public final long b;
    public final int c;

    public or10(long j, long j2, int i) {
        this.a = j;
        this.b = j2;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof or10)) {
            return false;
        }
        or10 or10Var = (or10) obj;
        return this.a == or10Var.a && this.b == or10Var.b && this.c == or10Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MediaLoadAudioData(mediaStartTimeMs=");
        sb.append(this.a);
        sb.append(", mediaEndTimeMs=");
        sb.append(this.b);
        sb.append(", dataType=");
        return vu5.b(sb, this.c, ')');
    }
}
