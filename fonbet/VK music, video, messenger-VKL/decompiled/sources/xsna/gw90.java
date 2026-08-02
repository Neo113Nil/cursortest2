package xsna;

/* compiled from: PerformanceJankDetector.kt */
/* loaded from: classes17.dex */
public abstract class gw90 {
    public final long a;
    public final a b;
    public int c;
    public b d;
    public int e;
    public int f;
    public int g;
    public final c h = new c();

    /* compiled from: PerformanceJankDetector.kt */
    /* loaded from: classes.dex */
    public static final class a {
        public final float a;
        public final long b;
        public final long c;

        public a() {
            this(0);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + bh10.a(Float.hashCode(this.a) * 31, 31, this.b);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Config(successRatio=");
            sb.append(this.a);
            sb.append(", chunkDimensionNanos=");
            sb.append(this.b);
            sb.append(", frameJitterNanos=");
            return vu5.a(')', this.c, sb);
        }

        public a(int i) {
            this.a = 0.67f;
            this.b = 100000000L;
            this.c = 2000000L;
        }
    }

    /* compiled from: PerformanceJankDetector.kt */
    public final class b {
        public final long a;
        public int b;

        public b(long j) {
            this.a = j;
        }
    }

    /* compiled from: PerformanceJankDetector.kt */
    public static final class c implements izs<Long, s3q0> {
        public c() {
        }

        @Override // xsna.izs
        public final s3q0 invoke(Long l) {
            long longValue = l.longValue();
            gw90 gw90Var = gw90.this;
            b bVar = gw90Var.d;
            if (bVar == null) {
                gw90Var.d = gw90Var.new b(longValue);
            } else if (longValue - bVar.a > gw90Var.b.b) {
                a aVar = gw90.this.b;
                if (bVar.b / (aVar.b / (r3.a + aVar.c)) < aVar.a) {
                    int i = gw90Var.c + 1;
                    gw90Var.c = i;
                    gw90Var.g++;
                    gw90Var.e = Math.max(gw90Var.e, i);
                } else {
                    gw90Var.c = 0;
                }
                gw90Var.d = gw90Var.new b(longValue);
                gw90Var.f++;
            }
            b bVar2 = gw90Var.d;
            if (bVar2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            bVar2.b++;
            gw90Var.a();
            return s3q0.a;
        }
    }

    public gw90(long j, a aVar) {
        this.a = j;
        this.b = aVar;
    }

    public abstract void a();

    public abstract void b();

    public abstract void c();
}
