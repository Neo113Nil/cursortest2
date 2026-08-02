package xsna;

/* compiled from: ReefBandwidthInfo.kt */
/* loaded from: classes5.dex */
public final class zmf0 {
    public final int a;
    public final long b;
    public final long c;

    public zmf0(int i, long j, long j2) {
        this.a = i;
        this.b = j;
        this.c = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zmf0)) {
            return false;
        }
        zmf0 zmf0Var = (zmf0) obj;
        zmf0Var.getClass();
        return this.a == zmf0Var.a && this.b == zmf0Var.b && this.c == zmf0Var.c;
    }

    public final int hashCode() {
        return Long.hashCode(-1L) + bh10.a(bh10.a(bh10.a(shy.a(this.a, Integer.hashCode(-1) * 31, 31), 31, this.b), 31, this.c), 31, -1L);
    }

    public final String toString() {
        return e630.c(jr.b(this.a, "ReefBandwidthInfo(chunkNum=-1, sampleTimeMs=", ", sampleBytesLoaded=", this.b), ", bitrate05=", this.c, ", bitrate09=-1, bitrate1=-1)");
    }
}
