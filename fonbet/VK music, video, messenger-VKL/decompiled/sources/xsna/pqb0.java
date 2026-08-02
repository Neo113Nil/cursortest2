package xsna;

/* compiled from: PollNavEvent.kt */
/* loaded from: classes6.dex */
public interface pqb0 {

    /* compiled from: PollNavEvent.kt */
    public static final class a implements pqb0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -960849373;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: PollNavEvent.kt */
    public static final class b implements pqb0 {
        public final String a;

        public b(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("ShowThanks(title="), this.a, ')');
        }
    }
}
