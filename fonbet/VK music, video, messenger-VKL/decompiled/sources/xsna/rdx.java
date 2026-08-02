package xsna;

/* compiled from: InterestingStoriesAutoplayProgress.kt */
/* loaded from: classes18.dex */
public final class rdx {
    public final long a;
    public final long b;

    public rdx(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rdx)) {
            return false;
        }
        rdx rdxVar = (rdx) obj;
        return this.a == rdxVar.a && this.b == rdxVar.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InterestingStoriesAutoplayProgress(progressMs=");
        sb.append(this.a);
        sb.append(", durationMs=");
        return vu5.a(')', this.b, sb);
    }
}
