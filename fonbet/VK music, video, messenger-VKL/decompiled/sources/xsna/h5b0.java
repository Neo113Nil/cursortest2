package xsna;

/* compiled from: PlayerViewProvider.kt */
/* loaded from: classes7.dex */
public interface h5b0 {

    /* compiled from: PlayerViewProvider.kt */
    public static final class a implements h5b0 {
        public final scx a;

        public a(scx scxVar) {
            this.a = scxVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Interactive(videoViewsProvider=" + this.a + ')';
        }
    }

    /* compiled from: PlayerViewProvider.kt */
    public static final class b implements h5b0 {
        public static final b a = new b();
    }

    /* compiled from: PlayerViewProvider.kt */
    public static final class c implements h5b0 {
        public final hgs0 a;

        public c(hgs0 hgs0Var) {
            this.a = hgs0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Linear(videoView=" + this.a + ')';
        }
    }
}
