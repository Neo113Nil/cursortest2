package xsna;

/* compiled from: ValidateSessionBehavior.kt */
/* loaded from: classes15.dex */
public interface uir0 {

    /* compiled from: ValidateSessionBehavior.kt */
    public static final class a implements uir0 {
        public final long a;

        public a(long j) {
            this.a = j;
        }

        public final long a() {
            return this.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.a == ((a) obj).a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return vu5.a(')', this.a, new StringBuilder("Async(maxWaitTimeMs="));
        }
    }

    /* compiled from: ValidateSessionBehavior.kt */
    public static final class b implements uir0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1545162417;
        }

        public final String toString() {
            return "Sync";
        }
    }
}
