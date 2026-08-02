package xsna;

/* compiled from: ProductBadge.kt */
/* loaded from: classes18.dex */
public interface wid0 {

    /* compiled from: ProductBadge.kt */
    public static final class a implements wid0 {
        public final InterfaceC3933a a;

        /* compiled from: ProductBadge.kt */
        /* renamed from: xsna.wid0$a$a, reason: collision with other inner class name */
        public interface InterfaceC3933a {

            /* compiled from: ProductBadge.kt */
            /* renamed from: xsna.wid0$a$a$a, reason: collision with other inner class name */
            public static final class C3934a implements InterfaceC3933a {
                public final String a;

                public C3934a(String str) {
                    this.a = str;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof C3934a) && epx.f(this.a, ((C3934a) obj).a);
                }

                public final int hashCode() {
                    return this.a.hashCode();
                }

                public final String toString() {
                    return ho8.a(new StringBuilder("ByText(text="), this.a, ')');
                }
            }

            /* compiled from: ProductBadge.kt */
            /* renamed from: xsna.wid0$a$a$b */
            public static final class b implements InterfaceC3933a {
                public final int a;

                public b(int i) {
                    this.a = i;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof b) && this.a == ((b) obj).a;
                }

                public final int hashCode() {
                    return Integer.hashCode(this.a);
                }

                public final String toString() {
                    return vu5.b(new StringBuilder("ByValue(rate="), this.a, ')');
                }
            }
        }

        public a(InterfaceC3933a interfaceC3933a) {
            this.a = interfaceC3933a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            InterfaceC3933a interfaceC3933a = this.a;
            if (interfaceC3933a == null) {
                return 0;
            }
            return interfaceC3933a.hashCode();
        }

        public final String toString() {
            return "Discount(rate=" + this.a + ')';
        }
    }

    /* compiled from: ProductBadge.kt */
    public static final class b implements wid0 {
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
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Lamoda(prefix="), this.a, ')');
        }
    }

    /* compiled from: ProductBadge.kt */
    public static final class c implements wid0 {
        public final String a;

        public c() {
            this(null);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            String str = this.a;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("Ozon(prefix="), this.a, ')');
        }

        public c(String str) {
            this.a = str;
        }
    }

    /* compiled from: ProductBadge.kt */
    public static final class d implements wid0 {
        public final ely a;

        public d(ely elyVar) {
            this.a = elyVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            ely elyVar = this.a;
            if (elyVar == null) {
                return 0;
            }
            return elyVar.hashCode();
        }

        public final String toString() {
            return "PartnerIntegration(icon=" + this.a + ')';
        }
    }
}
