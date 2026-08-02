package xsna;

/* compiled from: ExerciseRouteResult.kt */
/* loaded from: classes12.dex */
public abstract class k4q {

    /* compiled from: ExerciseRouteResult.kt */
    public static final class a extends k4q {
        public final boolean equals(Object obj) {
            return obj instanceof a;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "ConsentRequired";
        }
    }

    /* compiled from: ExerciseRouteResult.kt */
    public static final class b extends k4q {
        public final i4q a;

        public b(i4q i4qVar) {
            this.a = i4qVar;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            return epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "Data(exerciseRoute=" + this.a + ')';
        }
    }

    /* compiled from: ExerciseRouteResult.kt */
    public static final class c extends k4q {
        public final boolean equals(Object obj) {
            return obj instanceof c;
        }

        public final int hashCode() {
            return 0;
        }

        public final String toString() {
            return "NoData";
        }
    }
}
