package xsna;

/* compiled from: ViewTintSource.kt */
/* loaded from: classes17.dex */
public interface k1u0 {

    /* compiled from: ViewTintSource.kt */
    @vby
    public static final class a implements k1u0 {
        public final x7g a;

        public final /* synthetic */ cut0 a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof a) {
                return this.a.equals(((a) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a.a);
        }

        public final String toString() {
            return "Color(colorSource=" + this.a + ')';
        }
    }

    /* compiled from: ViewTintSource.kt */
    public static final class b implements k1u0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1156783225;
        }

        public final String toString() {
            return "Default";
        }
    }

    /* compiled from: ViewTintSource.kt */
    public static final class c implements k1u0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1902957568;
        }

        public final String toString() {
            return "None";
        }
    }
}
