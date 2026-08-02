package xsna;

/* compiled from: FlingCalculator.kt */
/* loaded from: classes11.dex */
public final class upr {
    public final float a;
    public final azl b;
    public final float c;

    /* compiled from: FlingCalculator.kt */
    public static final class a {
        public final float a;
        public final float b;
        public final long c;

        public a(long j, float f, float f2) {
            this.a = f;
            this.b = f2;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0 && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + io.reactivex.rxjava3.subjects.b.a(this.b, Float.hashCode(this.a) * 31, 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("FlingInfo(initialVelocity=");
            sb.append(this.a);
            sb.append(", distance=");
            sb.append(this.b);
            sb.append(", duration=");
            return vu5.a(')', this.c, sb);
        }
    }

    public upr(float f, azl azlVar) {
        this.a = f;
        this.b = azlVar;
        float density = azlVar.getDensity();
        float f2 = vpr.a;
        this.c = density * 386.0878f * 160.0f * 0.84f;
    }

    public final a a(float f) {
        double b = b(f);
        double d = vpr.a;
        double d2 = d - 1.0d;
        return new a((long) (Math.exp(b / d2) * 1000.0d), f, (float) (Math.exp((d / d2) * b) * this.a * this.c));
    }

    public final double b(float f) {
        float[] fArr = s82.a;
        return Math.log((Math.abs(f) * 0.35f) / (this.a * this.c));
    }
}
