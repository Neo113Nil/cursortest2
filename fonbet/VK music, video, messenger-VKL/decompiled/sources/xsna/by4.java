package xsna;

/* compiled from: AudioStatHandlers.kt */
/* loaded from: classes3.dex */
public final class by4 {
    public final m130 a;
    public final x3i0 b;
    public final bx80 c;
    public final j630 d;

    public by4(m130 m130Var, x3i0 x3i0Var, bx80 bx80Var, j630 j630Var) {
        this.a = m130Var;
        this.b = x3i0Var;
        this.c = bx80Var;
        this.d = j630Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof by4)) {
            return false;
        }
        by4 by4Var = (by4) obj;
        return this.a.equals(by4Var.a) && epx.f(this.b, by4Var.b) && this.c.equals(by4Var.c) && epx.f(this.d, by4Var.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        x3i0 x3i0Var = this.b;
        int hashCode2 = (this.c.hashCode() + ((hashCode + (x3i0Var == null ? 0 : x3i0Var.hashCode())) * 31)) * 31;
        j630 j630Var = this.d;
        return hashCode2 + (j630Var != null ? j630Var.hashCode() : 0);
    }

    public final String toString() {
        return "AudioStatHandlers(processAudioFrameTimeTracker=" + this.a + ", seekTimeMeasurer=" + this.b + ", bgThreadExceptionsListener=" + this.c + ", decodingStatConsumer=" + this.d + ')';
    }
}
