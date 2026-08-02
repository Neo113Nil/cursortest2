package xsna;

/* compiled from: VoipCommonSelectMovieAction.kt */
/* loaded from: classes7.dex */
public interface tmw0 extends kj50 {

    /* compiled from: VoipCommonSelectMovieAction.kt */
    public static abstract class a implements tmw0 {

        /* compiled from: VoipCommonSelectMovieAction.kt */
        /* renamed from: xsna.tmw0$a$a, reason: collision with other inner class name */
        public static final class C3759a extends a {
            public static final C3759a b = new C3759a();
        }

        /* compiled from: VoipCommonSelectMovieAction.kt */
        public static final class b extends a {
            public static final b b = new b();
        }
    }

    /* compiled from: VoipCommonSelectMovieAction.kt */
    public static final class b implements tmw0 {
        public static final b b = new b();
    }

    /* compiled from: VoipCommonSelectMovieAction.kt */
    public static final class c implements tmw0 {
        public final p3x0 b;

        public c(p3x0 p3x0Var) {
            this.b = p3x0Var;
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
            return "VideoSelected(video=" + this.b + ')';
        }
    }
}
