package xsna;

/* compiled from: AvitoState.kt */
/* loaded from: classes18.dex */
public interface zt5 extends km50 {

    /* compiled from: AvitoState.kt */
    public static final class a implements zt5 {
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

    /* compiled from: AvitoState.kt */
    public static final class b implements zt5 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1390873720;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: AvitoState.kt */
    public static final class c implements zt5 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1584513108;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
