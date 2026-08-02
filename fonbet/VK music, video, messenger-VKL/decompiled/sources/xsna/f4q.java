package xsna;

import java.time.Duration;

/* compiled from: ExerciseCompletionGoal.kt */
/* loaded from: classes12.dex */
public abstract class f4q {

    /* compiled from: ExerciseCompletionGoal.kt */
    public static final class a extends f4q {
        public final jlp a;

        public a(jlp jlpVar) {
            this.a = jlpVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            return epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ActiveCaloriesBurnedGoal(activeCalories=" + this.a + ')';
        }
    }

    /* compiled from: ExerciseCompletionGoal.kt */
    public static final class b extends f4q {
        public final c2z a;
        public final Duration b;

        public b(c2z c2zVar, Duration duration) {
            this.a = c2zVar;
            this.b = duration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return epx.f(this.a, bVar.a) && epx.f(this.b, bVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            return "DistanceAndDurationGoal(distance=" + this.a + ", duration=" + this.b + ')';
        }
    }

    /* compiled from: ExerciseCompletionGoal.kt */
    public static final class c extends f4q {
        public final c2z a;

        public c(c2z c2zVar) {
            this.a = c2zVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            return epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DistanceGoal(distance=" + this.a + ')';
        }
    }

    /* compiled from: ExerciseCompletionGoal.kt */
    public static final class d extends f4q {
        public final Duration a;

        public d(Duration duration) {
            this.a = duration;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof d)) {
                return false;
            }
            return epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "DurationGoal(duration=" + this.a + ')';
        }
    }

    /* compiled from: ExerciseCompletionGoal.kt */
    public static final class e extends f4q {
        public static final e a = new e();

        public final String toString() {
            return "ManualCompletion()";
        }
    }

    /* compiled from: ExerciseCompletionGoal.kt */
    public static final class f extends f4q {
        public final int a;

        public f(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof f) {
                return this.a == ((f) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("RepetitionsGoal(repetitions="), this.a, ')');
        }
    }

    /* compiled from: ExerciseCompletionGoal.kt */
    public static final class g extends f4q {
        public final int a;

        public g(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj instanceof g) {
                return this.a == ((g) obj).a;
            }
            return false;
        }

        public final int hashCode() {
            return this.a;
        }

        public final String toString() {
            return vu5.b(new StringBuilder("StepsGoal(steps="), this.a, ')');
        }
    }

    /* compiled from: ExerciseCompletionGoal.kt */
    public static final class h extends f4q {
        public final jlp a;

        public h(jlp jlpVar) {
            this.a = jlpVar;
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
            return "TotalCaloriesBurnedGoal(totalCalories=" + this.a + ')';
        }
    }

    /* compiled from: ExerciseCompletionGoal.kt */
    public static final class i extends f4q {
        public static final i a = new i();

        public final String toString() {
            return "UnknownGoal()";
        }
    }
}
