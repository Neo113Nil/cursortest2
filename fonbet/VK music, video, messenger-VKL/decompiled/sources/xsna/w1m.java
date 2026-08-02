package xsna;

/* compiled from: DescriptionEvent.kt */
/* loaded from: classes7.dex */
public interface w1m extends pk50 {

    /* compiled from: DescriptionEvent.kt */
    public static final class a implements w1m {
        public final String a;

        public a(String str) {
            this.a = str;
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
            return ho8.a(new StringBuilder("Changed(newDescription="), this.a, ')');
        }
    }

    /* compiled from: DescriptionEvent.kt */
    public static final class b implements w1m {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1176043984;
        }

        public final String toString() {
            return "Close";
        }
    }
}
