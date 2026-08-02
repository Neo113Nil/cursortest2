package xsna;

/* compiled from: AuthorAction.kt */
/* loaded from: classes7.dex */
public interface h75 extends lj50 {

    /* compiled from: AuthorAction.kt */
    public static final class a implements h75 {
        public final int b;

        public a(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("AuthorItemClick(index="), this.b, ')');
        }
    }

    /* compiled from: AuthorAction.kt */
    public static final class b implements h75 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -439094075;
        }

        public final String toString() {
            return "CreateChannelClick";
        }
    }
}
