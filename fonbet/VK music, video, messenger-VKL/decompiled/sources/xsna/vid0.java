package xsna;

/* compiled from: ProductBadge.kt */
/* loaded from: classes18.dex */
public interface vid0 {

    /* compiled from: ProductBadge.kt */
    public static final class a implements vid0 {
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
            return ho8.a(new StringBuilder("Discount(text="), this.a, ')');
        }
    }

    /* compiled from: ProductBadge.kt */
    public static final class b implements vid0 {
        public final ely a;

        public b(ely elyVar) {
            this.a = elyVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            ely elyVar = this.a;
            if (elyVar == null) {
                return 0;
            }
            return elyVar.hashCode();
        }

        public final String toString() {
            return "MultiIntegration(icon=" + this.a + ')';
        }
    }

    /* compiled from: ProductBadge.kt */
    public static final class c implements vid0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 521817826;
        }

        public final String toString() {
            return "Ozon";
        }
    }
}
