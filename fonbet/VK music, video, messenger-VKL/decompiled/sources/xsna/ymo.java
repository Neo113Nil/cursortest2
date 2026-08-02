package xsna;

/* compiled from: DroppedFramesInfo.kt */
/* loaded from: classes8.dex */
public final class ymo {
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;

    public ymo(long j, long j2, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = j3;
        this.d = j4;
        this.e = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ymo)) {
            return false;
        }
        ymo ymoVar = (ymo) obj;
        return this.a == ymoVar.a && this.b == ymoVar.b && this.c == ymoVar.c && this.d == ymoVar.d && this.e == ymoVar.e;
    }

    public final int hashCode() {
        return Long.hashCode(this.e) + bh10.a(bh10.a(bh10.a(Long.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder b = fp.b(this.a, "DroppedFramesInfo(renderedCount=", ", droppedCount=");
        b.append(this.b);
        tj0.d(b, ", droppedToKeyframeCount=", this.c, ", skippedCount=");
        b.append(this.d);
        return e630.c(b, ", maxConsecutiveDroppedCount=", this.e, ")");
    }
}
