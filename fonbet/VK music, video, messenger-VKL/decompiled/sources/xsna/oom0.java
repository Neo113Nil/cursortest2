package xsna;

import ru.ok.android.webrtc.stat.call.internal.ConnectivityTracker;

/* compiled from: StreamAnalytics.kt */
/* loaded from: classes3.dex */
public final class oom0 {
    public final String a;
    public final int b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final double g;
    public final long h;
    public final long i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    public final int n;
    public final int o;
    public final long p;
    public final String q;

    public oom0() {
        this("", 0, 0L, 0L, 0L, 0L, ConnectivityTracker.DEFAULT_UPLINK_BITRATE, 0L, 0L, 0, 0, 0, 0, 0, -1, 0L, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oom0)) {
            return false;
        }
        oom0 oom0Var = (oom0) obj;
        return epx.f(this.a, oom0Var.a) && this.b == oom0Var.b && this.c == oom0Var.c && this.d == oom0Var.d && this.e == oom0Var.e && this.f == oom0Var.f && Double.compare(this.g, oom0Var.g) == 0 && this.h == oom0Var.h && this.i == oom0Var.i && this.j == oom0Var.j && this.k == oom0Var.k && this.l == oom0Var.l && this.m == oom0Var.m && this.n == oom0Var.n && this.o == oom0Var.o && this.p == oom0Var.p && epx.f(this.q, oom0Var.q);
    }

    public final int hashCode() {
        int a = bh10.a(shy.a(this.o, shy.a(this.n, shy.a(this.m, shy.a(this.l, shy.a(this.k, shy.a(this.j, bh10.a(bh10.a(zjh0.b(this.g, bh10.a(bh10.a(bh10.a(bh10.a(shy.a(this.b, this.a.hashCode() * 31, 31), 31, this.c), 31, this.d), 31, this.e), 31, this.f), 31), 31, this.h), 31, this.i), 31), 31), 31), 31), 31), 31), 31, this.p);
        String str = this.q;
        return a + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StreamAnalytics(recorder=");
        sb.append(this.a);
        sb.append(", connectionId=");
        sb.append(this.b);
        sb.append(", bytesSent=");
        sb.append(this.c);
        sb.append(", bytesRecv=");
        sb.append(this.d);
        sb.append(", audioPacketsLost=");
        sb.append(this.e);
        sb.append(", audioPacketsSent=");
        sb.append(this.f);
        sb.append(", fps=");
        sb.append(this.g);
        sb.append(", videoPacketsLost=");
        sb.append(this.h);
        sb.append(", videoPacketsSent=");
        sb.append(this.i);
        sb.append(", bitRate=");
        sb.append(this.j);
        sb.append(", audioBitrate=");
        sb.append(this.k);
        sb.append(", videoBitrate=");
        sb.append(this.l);
        sb.append(", width=");
        sb.append(this.m);
        sb.append(", height=");
        sb.append(this.n);
        sb.append(", rotation=");
        sb.append(this.o);
        sb.append(", lastPresentationTime=");
        sb.append(this.p);
        sb.append(", debugInfo=");
        return ho8.a(sb, this.q, ')');
    }

    public oom0(String str, int i, long j, long j2, long j3, long j4, double d, long j5, long j6, int i2, int i3, int i4, int i5, int i6, int i7, long j7, String str2) {
        this.a = str;
        this.b = i;
        this.c = j;
        this.d = j2;
        this.e = j3;
        this.f = j4;
        this.g = d;
        this.h = j5;
        this.i = j6;
        this.j = i2;
        this.k = i3;
        this.l = i4;
        this.m = i5;
        this.n = i6;
        this.o = i7;
        this.p = j7;
        this.q = str2;
    }
}
