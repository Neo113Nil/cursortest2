package xsna;

/* compiled from: SearchDatabaseAction.kt */
/* loaded from: classes5.dex */
public interface bph0 extends kj50 {

    /* compiled from: SearchDatabaseAction.kt */
    public static final class a implements bph0 {
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
            return vu5.b(new StringBuilder("CustomActionClicked(index="), this.b, ')');
        }
    }

    /* compiled from: SearchDatabaseAction.kt */
    public static final class b implements bph0 {
        public static final b b = new b();
    }

    /* compiled from: SearchDatabaseAction.kt */
    public static final class c implements bph0 {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ItemClicked(index="), this.b, ')');
        }
    }

    /* compiled from: SearchDatabaseAction.kt */
    public static final class d implements bph0 {
        public static final d b = new d();
    }

    /* compiled from: SearchDatabaseAction.kt */
    public static final class e implements bph0 {
        public static final e b = new e();
    }

    /* compiled from: SearchDatabaseAction.kt */
    public static final class f implements bph0 {
        public final String b;

        public f(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("QueryChanged(text="), this.b, ')');
        }
    }

    /* compiled from: SearchDatabaseAction.kt */
    public static final class g implements bph0 {
        public static final g b = new g();
    }
}
