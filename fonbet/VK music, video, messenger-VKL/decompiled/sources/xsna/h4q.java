package xsna;

/* compiled from: ExercisePerformanceTarget.kt */
/* loaded from: classes12.dex */
public abstract class h4q {

    /* compiled from: ExercisePerformanceTarget.kt */
    public static final class a extends h4q {
        public static final a a = new a();

        public final String toString() {
            return "AmrapTarget()";
        }
    }

    /* compiled from: ExercisePerformanceTarget.kt */
    public static final class b extends h4q {
        public final double a;
        public final double b;

        public b(double d, double d2) {
            this.a = d;
            this.b = d2;
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
            return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("CadenceTarget(minCadence=");
            sb.append(this.a);
            sb.append(", maxCadence=");
            return ojp0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ExercisePerformanceTarget.kt */
    public static final class c extends h4q {
        public final double a;
        public final double b;

        public c(double d, double d2) {
            this.a = d;
            this.b = d2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("HeartRateTarget(minHeartRate=");
            sb.append(this.a);
            sb.append(", maxHeartRate=");
            return ojp0.a(sb, this.b, ')');
        }
    }

    /* compiled from: ExercisePerformanceTarget.kt */
    public static final class d extends h4q {
        public final swc0 a;
        public final swc0 b;

        public d(swc0 swc0Var, swc0 swc0Var2) {
            this.a = swc0Var;
            this.b = swc0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            d dVar = (d) obj;
            return epx.f(this.a, dVar.a) && epx.f(this.b, dVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "PowerTarget(minPower=" + this.a + ", maxPower=" + this.b + ')';
        }
    }

    /* compiled from: ExercisePerformanceTarget.kt */
    public static final class e extends h4q {
        public final int a;

        public e(int i) {
            this.a = i;
            if (i < 0 || i >= 11) {
                throw new IllegalArgumentException("RPE value must be between 0 and 10, inclusive.");
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof e) {
                return this.a == ((e) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("RateOfPerceivedExertionTarget(rpe="), this.a, ')');
        }
    }

    /* compiled from: ExercisePerformanceTarget.kt */
    public static final class f extends h4q {
        public final imr0 a;
        public final imr0 b;

        public f(imr0 imr0Var, imr0 imr0Var2) {
            this.a = imr0Var;
            this.b = imr0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            f fVar = (f) obj;
            return epx.f(this.a, fVar.a) && epx.f(this.b, fVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "SpeedTarget(minSpeed=" + this.a + ", maxSpeed=" + this.b + ')';
        }
    }

    /* compiled from: ExercisePerformanceTarget.kt */
    public static final class g extends h4q {
        public static final g a = new g();

        public final String toString() {
            return "UnknownTarget()";
        }
    }

    /* compiled from: ExercisePerformanceTarget.kt */
    public static final class h extends h4q {
        public final vi10 a;

        public h(vi10 vi10Var) {
            this.a = vi10Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof h)) {
                return false;
            }
            return epx.f(this.a, ((h) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "WeightTarget(mass=" + this.a + ')';
        }
    }
}
