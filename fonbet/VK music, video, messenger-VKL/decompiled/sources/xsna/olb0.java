package xsna;

import java.util.concurrent.TimeUnit;

/* compiled from: PointStat.java */
/* loaded from: classes3.dex */
public final class olb0 {
    public final TimeUnit a;
    public final long[] b;
    public final long[] c;
    public volatile int d;

    public olb0(TimeUnit timeUnit, int i, int i2) {
        this.a = timeUnit;
        this.b = new long[Math.max(1, i)];
        this.c = new long[Math.max(1, i2)];
    }

    public final long a() {
        return this.a.toMicros(this.b[0]);
    }

    public final long b() {
        return this.d > 0 ? this.c[(this.d - 1) % this.c.length] : this.c[0];
    }

    public final int c(long j) {
        int i = this.d;
        long[] jArr = this.b;
        if (i < jArr.length) {
            jArr[i] = j;
        }
        long[] jArr2 = this.c;
        jArr2[i % jArr2.length] = j;
        int i2 = this.d + 1;
        this.d = i2;
        return i2;
    }
}
