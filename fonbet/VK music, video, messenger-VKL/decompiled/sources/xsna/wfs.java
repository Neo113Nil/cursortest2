package xsna;

/* compiled from: FrameProcessingTimeInfo.kt */
/* loaded from: classes3.dex */
public final class wfs {
    public final long a;
    public final long b;
    public final Long c;
    public final long d;
    public final long e;
    public final long f;

    public wfs(long j, long j2, Long l, long j3, long j4, long j5) {
        this.a = j;
        this.b = j2;
        this.c = l;
        this.d = j3;
        this.e = j4;
        this.f = j5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wfs)) {
            return false;
        }
        wfs wfsVar = (wfs) obj;
        return this.a == wfsVar.a && this.b == wfsVar.b && epx.f(this.c, wfsVar.c) && this.d == wfsVar.d && this.e == wfsVar.e && this.f == wfsVar.f;
    }

    public final int hashCode() {
        int a = bh10.a(Long.hashCode(this.a) * 31, 31, this.b);
        Long l = this.c;
        return Long.hashCode(this.f) + bh10.a(bh10.a((a + (l == null ? 0 : l.hashCode())) * 31, 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FrameProcessingTimeInfo(avgProcessingTimeMs=");
        sb.append(this.a);
        sb.append(", avgScreenRenderTimeMs=");
        sb.append(this.b);
        sb.append(", sigmaAvgProcessingTimeMs=");
        sb.append(this.c);
        sb.append(", maxProcessingTimeMs=");
        sb.append(this.d);
        sb.append(", maxScreenRenderTimeMs=");
        sb.append(this.e);
        sb.append(", actualFrameDurationMs=");
        return vu5.a(')', this.f, sb);
    }
}
