package xsna;

/* compiled from: VoipSelectMovieAction.kt */
/* loaded from: classes7.dex */
public abstract class fzw0 implements tmw0 {

    /* compiled from: VoipSelectMovieAction.kt */
    public static final class a extends fzw0 {
        public final set0 b;

        public a(set0 set0Var) {
            this.b = set0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "FiltersChanged(filters=" + this.b + ')';
        }
    }

    /* compiled from: VoipSelectMovieAction.kt */
    public static final class c extends fzw0 {
        public final set0 b;

        public c(set0 set0Var) {
            this.b = set0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ResetFilters(filters=" + this.b + ')';
        }
    }

    /* compiled from: VoipSelectMovieAction.kt */
    public static final class d extends fzw0 {
        public final CharSequence b;

        public d(CharSequence charSequence) {
            this.b = charSequence;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return thl0.a(new StringBuilder("SearchText(text="), this.b, ')');
        }
    }

    /* compiled from: VoipSelectMovieAction.kt */
    public static final class e extends fzw0 {
        public static final e b = new e();
    }

    /* compiled from: VoipSelectMovieAction.kt */
    public static final class b extends fzw0 {
        public final p3x0 b;

        public b(p3x0 p3x0Var) {
            this.b = p3x0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            p3x0 p3x0Var = this.b;
            if (p3x0Var == null) {
                return 0;
            }
            return p3x0Var.hashCode();
        }

        public final String toString() {
            return "Init(video=" + this.b + ')';
        }

        public b() {
            this(null);
        }
    }
}
