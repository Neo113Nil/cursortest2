package xsna;

/* compiled from: ContentProductsEvent.kt */
/* loaded from: classes18.dex */
public interface ckj extends pk50 {

    /* compiled from: ContentProductsEvent.kt */
    public static final class a implements ckj {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1230812271;
        }

        public final String toString() {
            return "NavigateBack";
        }
    }

    /* compiled from: ContentProductsEvent.kt */
    public static final class b implements ckj {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2073086525;
        }

        public final String toString() {
            return "NavigateToCart";
        }
    }

    /* compiled from: ContentProductsEvent.kt */
    public static final class c implements ckj {
        public final hpd0 a;

        public c(hpd0 hpd0Var) {
            this.a = hpd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "NavigateToProduct(productItem=" + this.a + ')';
        }
    }

    /* compiled from: ContentProductsEvent.kt */
    public static final class d implements ckj {
        public final String a;

        public d(String str) {
            this.a = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenLink(link="), this.a, ')');
        }
    }
}
