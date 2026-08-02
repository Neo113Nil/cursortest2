package xsna;

/* compiled from: DownloadTracksSelectionExt.kt */
/* loaded from: classes3.dex */
public final class whs0 {
    public final long a;
    public final long b;

    public whs0(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whs0)) {
            return false;
        }
        whs0 whs0Var = (whs0) obj;
        return this.a == whs0Var.a && this.b == whs0Var.b;
    }

    public final int hashCode() {
        return Long.hashCode(this.b) + (Long.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDownloadSizes(approximateSizeBytes=");
        sb.append(this.a);
        sb.append(", exactSizeBytes=");
        return vu5.a(')', this.b, sb);
    }
}
