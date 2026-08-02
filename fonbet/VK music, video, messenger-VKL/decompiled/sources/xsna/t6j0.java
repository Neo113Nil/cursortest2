package xsna;

/* compiled from: ShareAction.kt */
/* loaded from: classes7.dex */
public interface t6j0 extends kj50 {

    /* compiled from: ShareAction.kt */
    public static final class a implements t6j0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 647163804;
        }

        public final String toString() {
            return "CopyClick";
        }
    }

    /* compiled from: ShareAction.kt */
    public static final class b implements t6j0 {
        public final int b;

        public b(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("ExternalAppClick(index="), this.b, ')');
        }
    }

    /* compiled from: ShareAction.kt */
    public static final class c implements t6j0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1259342567;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: ShareAction.kt */
    public static final class d implements t6j0 {
        public static final d b = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 954912700;
        }

        public final String toString() {
            return "MoreClick";
        }
    }

    /* compiled from: ShareAction.kt */
    public static final class e implements t6j0 {
        public final boolean b;

        public e(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.b == ((e) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShareTimeCheckedClick(checked="), this.b, ')');
        }
    }
}
