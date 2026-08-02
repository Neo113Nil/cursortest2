package xsna;

/* compiled from: AssetPainterState.kt */
/* loaded from: classes17.dex */
public interface zw3 {

    /* compiled from: AssetPainterState.kt */
    @vby
    public static final class a implements zw3 {
        public final Throwable a;

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return epx.f(this.a, ((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Error(cause=" + this.a + ')';
        }
    }

    /* compiled from: AssetPainterState.kt */
    @vby
    public static final class b implements zw3 {
        public final rc7 a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return epx.f(this.a, ((b) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "Loaded(painter=" + this.a + ')';
        }
    }

    /* compiled from: AssetPainterState.kt */
    public static final class c implements zw3 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 353362324;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
