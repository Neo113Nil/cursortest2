package xsna;

/* compiled from: Duration.kt */
/* loaded from: classes8.dex */
public final class u300 {
    public static final u300 e = new u300(4611686018427387903L, true);
    public final long a;
    public final boolean b;
    public final long c;
    public final long d;

    /* compiled from: Duration.kt */
    public static final class a {
        public static u300 a() {
            return u300.e;
        }
    }

    static {
        new u300(Long.MAX_VALUE, false);
    }

    public u300(long j, boolean z) {
        this.a = j;
        this.b = z;
        long j2 = 10;
        this.c = j / j2;
        this.d = j % j2;
    }
}
