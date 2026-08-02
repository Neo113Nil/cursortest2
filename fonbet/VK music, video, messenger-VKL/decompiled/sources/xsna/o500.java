package xsna;

import java.util.Iterator;

/* compiled from: Progressions.kt */
/* loaded from: classes8.dex */
public class o500 implements Iterable<Long>, gcy {
    public final long b;
    public final long c;
    public final long d = 1;

    public o500(long j, long j2) {
        this.b = j;
        this.c = tyx.c(j, j2, 1L);
    }

    public final long d() {
        return this.b;
    }

    public final long e() {
        return this.c;
    }

    @Override // java.lang.Iterable
    public final Iterator<Long> iterator() {
        return new p500(this.b, this.c, this.d);
    }
}
