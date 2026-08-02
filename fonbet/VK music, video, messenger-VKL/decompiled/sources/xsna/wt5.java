package xsna;

/* compiled from: AvitoPatch.kt */
/* loaded from: classes18.dex */
public interface wt5 extends xl50 {

    /* compiled from: AvitoPatch.kt */
    public static final class a implements wt5 {
        public final ot5 b;

        public a(ot5 ot5Var) {
            this.b = ot5Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Data(data=" + this.b + ')';
        }
    }

    /* compiled from: AvitoPatch.kt */
    public static final class b implements wt5 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 748192495;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: AvitoPatch.kt */
    public static final class c implements wt5 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -725879709;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
