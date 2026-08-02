package xsna;

/* compiled from: VkSnackbarHost.kt */
/* loaded from: classes17.dex */
public interface q7k0 {

    /* compiled from: VkSnackbarHost.kt */
    public static final class a implements q7k0 {
        public static final a a = new a();
        public static final long b = -1;

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        @Override // xsna.q7k0
        public final long getDuration() {
            return b;
        }

        public final int hashCode() {
            return 325309244;
        }

        public final String toString() {
            return "Forever";
        }
    }

    /* compiled from: VkSnackbarHost.kt */
    @vby
    public static final class b implements q7k0 {
        public final long a;

        public final boolean equals(Object obj) {
            if (obj instanceof b) {
                return this.a == ((b) obj).a;
            }
            return false;
        }

        @Override // xsna.q7k0
        public final long getDuration() {
            return this.a;
        }

        public final int hashCode() {
            return Long.hashCode(this.a);
        }

        public final String toString() {
            return q9k.d("Timed(duration=", this.a, ')');
        }
    }

    long getDuration();
}
