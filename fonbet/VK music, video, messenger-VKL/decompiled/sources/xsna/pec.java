package xsna;

/* compiled from: CityParameterAction.kt */
/* loaded from: classes5.dex */
public interface pec extends kj50 {

    /* compiled from: CityParameterAction.kt */
    public static final class a implements pec {
        public final uec b;

        public a(uec uecVar) {
            this.b = uecVar;
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
            return "CitySelected(city=" + this.b + ')';
        }
    }

    /* compiled from: CityParameterAction.kt */
    public static final class b implements pec {
        public static final b b = new b();
    }

    /* compiled from: CityParameterAction.kt */
    public static final class c implements pec {
        public final String b;

        public c(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("QueryChanged(query="), this.b, ')');
        }
    }

    /* compiled from: CityParameterAction.kt */
    public static final class d implements pec {
        public static final d b = new d();
    }
}
