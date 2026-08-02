package xsna;

/* compiled from: VideoAnalytics.kt */
/* loaded from: classes3.dex */
public final class q1s0 {
    public final x3i0 a;
    public final f2d0 b;
    public final kwa0 c;
    public final lwa0 d;

    public q1s0(x3i0 x3i0Var, f2d0 f2d0Var, kwa0 kwa0Var, lwa0 lwa0Var) {
        this.a = x3i0Var;
        this.b = f2d0Var;
        this.c = kwa0Var;
        this.d = lwa0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q1s0)) {
            return false;
        }
        q1s0 q1s0Var = (q1s0) obj;
        return this.a.equals(q1s0Var.a) && this.b.equals(q1s0Var.b) && this.c.equals(q1s0Var.c) && this.d.equals(q1s0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VideoAnalytics(seekTimeMeasurer=" + this.a + ", prepareFrameTimeReporter=" + this.b + ", onParallelDecodersFallback=" + this.c + ", onDecoderFormatInfo=" + this.d + ')';
    }
}
