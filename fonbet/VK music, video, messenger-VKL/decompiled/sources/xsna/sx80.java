package xsna;

import java.util.List;

/* compiled from: OrderViewState.kt */
/* loaded from: classes18.dex */
public final class sx80 implements lm50 {
    public final b b;
    public final a c;

    /* compiled from: OrderViewState.kt */
    public interface a {

        /* compiled from: OrderViewState.kt */
        /* renamed from: xsna.sx80$a$a, reason: collision with other inner class name */
        public static final class C3700a implements a {
            public final imy a;

            public C3700a(imy imyVar) {
                this.a = imyVar;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C3700a) && epx.f(this.a, ((C3700a) obj).a);
            }

            public final int hashCode() {
                return this.a.hashCode();
            }

            public final String toString() {
                return "Error(error=" + this.a + ')';
            }
        }

        /* compiled from: OrderViewState.kt */
        public static final class b implements a {
            public static final b a = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return -257377651;
            }

            public final String toString() {
                return "Loading";
            }
        }

        /* compiled from: OrderViewState.kt */
        public static final class c implements a {
            public static final c a = new c();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof c);
            }

            public final int hashCode() {
                return -372916345;
            }

            public final String toString() {
                return "None";
            }
        }

        /* compiled from: OrderViewState.kt */
        public static final class d implements a {
            public final List a;
            public final boolean b;
            public final boolean c;

            public d(List list, boolean z, boolean z2) {
                this.a = list;
                this.b = z;
                this.c = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.a, dVar.a) && this.b == dVar.b && this.c == dVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + qoy.b(this.a.hashCode() * 31, 31, this.b);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Order(listItems=");
                mr.c(", isBlockingProgress=", sb, this.a);
                sb.append(this.b);
                sb.append(", isRefreshing=");
                return defpackage.q0.a(sb, this.c, ')');
            }
        }
    }

    /* compiled from: OrderViewState.kt */
    public static final class b {
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
            return ho8.a(new StringBuilder("Toolbar(orderId="), this.a, ')');
        }
    }

    public sx80(b bVar, a aVar) {
        this.b = bVar;
        this.c = aVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sx80)) {
            return false;
        }
        sx80 sx80Var = (sx80) obj;
        return epx.f(this.b, sx80Var.b) && epx.f(this.c, sx80Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "OrderViewState(toolbar=" + this.b + ", content=" + this.c + ')';
    }
}
