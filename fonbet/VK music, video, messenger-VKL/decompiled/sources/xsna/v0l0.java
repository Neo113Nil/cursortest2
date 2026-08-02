package xsna;

/* compiled from: StepsParserGoogleFit.kt */
/* loaded from: classes11.dex */
public final class v0l0 {

    /* compiled from: StepsParserGoogleFit.kt */
    /* loaded from: classes6.dex */
    public static final class a {
        public final float a;
        public final float b;

        public a(float f, float f2) {
            this.a = f;
            this.b = f2;
        }

        public final float a() {
            return this.a;
        }

        public final float b() {
            return this.b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Float.compare(this.a, aVar.a) == 0 && Float.compare(this.b, aVar.b) == 0;
        }

        public final int hashCode() {
            return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("DistanceData(distanceKm=");
            sb.append(this.a);
            sb.append(", manualDistanceKm=");
            return xq.c(')', this.b, sb);
        }
    }

    /* compiled from: StepsParserGoogleFit.kt */
    /* loaded from: classes6.dex */
    public static final class b {
        public final int a;
        public final int b;

        public b(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final int a() {
            return this.b;
        }

        public final int b() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.a == bVar.a && this.b == bVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("StepData(steps=");
            sb.append(this.a);
            sb.append(", manualSteps=");
            return vu5.b(sb, this.b, ')');
        }
    }
}
