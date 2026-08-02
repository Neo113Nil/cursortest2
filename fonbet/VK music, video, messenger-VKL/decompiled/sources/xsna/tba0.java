package xsna;

/* compiled from: PhotoTagListItem.kt */
/* loaded from: classes4.dex */
public abstract class tba0 {

    /* compiled from: PhotoTagListItem.kt */
    public static final class a extends tba0 {
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
            return vu5.b(new StringBuilder("Counter(count="), this.a, ')');
        }
    }

    /* compiled from: PhotoTagListItem.kt */
    public static final class b extends tba0 {
        public final qba0 a;

        public b(qba0 qba0Var) {
            this.a = qba0Var;
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
            return "Data(tag=" + this.a + ')';
        }
    }
}
