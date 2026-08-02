package xsna;

/* compiled from: PrimitiveRanges.kt */
/* loaded from: classes8.dex */
public final class q500 extends o500 implements ewf<Long> {
    public static final q500 e = new q500(1, 0);

    /* compiled from: PrimitiveRanges.kt */
    public static final class a {
        public static q500 a() {
            return q500.e;
        }
    }

    public q500(long j, long j2) {
        super(j, j2);
    }

    @Override // xsna.ewf
    public final /* bridge */ /* synthetic */ boolean b(Long l) {
        return f(l.longValue());
    }

    @Override // xsna.ewf
    public final Long c() {
        return Long.valueOf(this.c);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof q500)) {
            return false;
        }
        if (isEmpty() && ((q500) obj).isEmpty()) {
            return true;
        }
        q500 q500Var = (q500) obj;
        return this.b == q500Var.b && this.c == q500Var.c;
    }

    public final boolean f(long j) {
        return this.b <= j && j <= this.c;
    }

    @Override // xsna.ewf
    public final Long getStart() {
        return Long.valueOf(this.b);
    }

    public final int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j = this.b;
        long j2 = 31 * (j ^ (j >>> 32));
        long j3 = this.c;
        return (int) (j2 + (j3 ^ (j3 >>> 32)));
    }

    @Override // xsna.ewf
    public final boolean isEmpty() {
        return this.b > this.c;
    }

    public final String toString() {
        return this.b + ".." + this.c;
    }
}
