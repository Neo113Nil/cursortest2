package xsna;

/* compiled from: CancelLongRequestsConfig.kt */
/* loaded from: classes8.dex */
public final class pp9 {
    public final int a;
    public final String b;
    public final long c;
    public final boolean d;
    public final double e;
    public final float f;
    public final long g;

    public pp9(int i, String str, long j, boolean z, double d, float f, long j2) {
        this.a = i;
        this.b = str;
        this.c = j;
        this.d = z;
        this.e = d;
        this.f = f;
        this.g = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pp9)) {
            return false;
        }
        pp9 pp9Var = (pp9) obj;
        return this.a == pp9Var.a && epx.f(this.b, pp9Var.b) && this.c == pp9Var.c && this.d == pp9Var.d && Double.compare(this.e, pp9Var.e) == 0 && Float.compare(this.f, pp9Var.f) == 0 && this.g == pp9Var.g;
    }

    public final int hashCode() {
        return Long.hashCode(this.g) + io.reactivex.rxjava3.subjects.b.a(this.f, zjh0.b(this.e, qoy.b(bh10.a(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31), 31);
    }

    public final String toString() {
        StringBuilder a = kh10.a(this.a, "CancelLongRequestsConfig(longChunkDurationThresholdMs=", ", qualityStepType=", this.b, ", maxBufferToCancelMs=");
        a.append(this.c);
        a.append(", restoreDefaultTrackSelectionIfBufferRestored=");
        a.append(this.d);
        com.vk.movika.sdk.android.defaultplayer.view.a.a(a, ", requestTimeToChunkDurationMaxRatio=", this.e, ", almostFinishedChunkRatio=");
        a.append(this.f);
        a.append(", maxTimeFromSeekToCancelMs=");
        a.append(this.g);
        a.append(")");
        return a.toString();
    }
}
