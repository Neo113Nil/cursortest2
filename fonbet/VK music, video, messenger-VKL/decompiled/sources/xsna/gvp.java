package xsna;

/* compiled from: ErrorData.kt */
/* loaded from: classes17.dex */
public interface gvp {

    /* compiled from: ErrorData.kt */
    public static final class a implements gvp {
        public final int a;

        public a(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("Exists(titleRes="), this.a, ')');
        }
    }

    /* compiled from: ErrorData.kt */
    public static final class b implements gvp {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -1822235787;
        }

        public final String toString() {
            return "NotExists";
        }
    }
}
