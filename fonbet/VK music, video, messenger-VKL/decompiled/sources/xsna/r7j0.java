package xsna;

/* compiled from: SharePatch.kt */
/* loaded from: classes7.dex */
public interface r7j0 extends xl50 {

    /* compiled from: SharePatch.kt */
    public static final class a implements r7j0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1689272777;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: SharePatch.kt */
    public static final class b implements r7j0 {
        public final boolean b;

        public b(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("ShareTimeChecked(checked="), this.b, ')');
        }
    }
}
