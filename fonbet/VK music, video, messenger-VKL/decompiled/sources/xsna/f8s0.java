package xsna;

/* compiled from: VideoCancelLongRequestsConfig.kt */
/* loaded from: classes11.dex */
public final class f8s0 {
    public static final a i = new a();
    public static final f8s0 j = new f8s0(0);
    public final int a;
    public final String b;
    public final long c;
    public final long d;
    public final boolean e;
    public final double f;
    public final float g;
    public final long h;

    /* compiled from: VideoCancelLongRequestsConfig.kt */
    public static final class a {
    }

    public f8s0() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8s0)) {
            return false;
        }
        f8s0 f8s0Var = (f8s0) obj;
        return this.a == f8s0Var.a && epx.f(this.b, f8s0Var.b) && this.c == f8s0Var.c && this.d == f8s0Var.d && this.e == f8s0Var.e && Double.compare(this.f, f8s0Var.f) == 0 && Float.compare(this.g, f8s0Var.g) == 0 && this.h == f8s0Var.h;
    }

    public final int hashCode() {
        return Long.hashCode(this.h) + io.reactivex.rxjava3.subjects.b.a(this.g, zjh0.b(this.f, qoy.b(bh10.a(bh10.a(urd0.a(Integer.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d), 31, this.e), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoCancelLongRequestsConfig(longChunkDurationThresholdMs=");
        sb.append(this.a);
        sb.append(", qualityStepType=");
        sb.append(this.b);
        sb.append(", maxBufferToCancelMs=");
        sb.append(this.c);
        sb.append(", minBufferToCancelMs=");
        sb.append(this.d);
        sb.append(", restoreDefaultTrackSelectionIfBufferRestored=");
        sb.append(this.e);
        sb.append(", timeDiffThreshold=");
        sb.append(this.f);
        sb.append(", almostFinishedChunkPart=");
        sb.append(this.g);
        sb.append(", maxTimeFromSeekToCancelMs=");
        return vu5.a(')', this.h, sb);
    }

    public /* synthetic */ f8s0(int i2) {
        this(10000, "by_bitrate", 50000L, 0L, false, 1.5d, 0.9f, 5000L);
    }

    public f8s0(int i2, String str, long j2, long j3, boolean z, double d, float f, long j4) {
        this.a = i2;
        this.b = str;
        this.c = j2;
        this.d = j3;
        this.e = z;
        this.f = d;
        this.g = f;
        this.h = j4;
    }
}
