package xsna;

/* compiled from: Restriction.kt */
/* loaded from: classes3.dex */
public abstract class scg0 {

    /* compiled from: Restriction.kt */
    public interface a {
    }

    /* compiled from: Restriction.kt */
    public static final class b extends scg0 {
        public final double a;

        public b(double d) {
            this.a = d;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Double.compare(this.a, ((b) obj).a) == 0;
        }

        public final int hashCode() {
            return Double.hashCode(this.a);
        }

        public final String toString() {
            return ojp0.a(new StringBuilder("FeeRestriction(fee="), this.a, ')');
        }
    }

    /* compiled from: Restriction.kt */
    public static final class c extends scg0 implements a {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("MaximumRestriction(maximum="), this.a, ')');
        }
    }

    /* compiled from: Restriction.kt */
    public static final class d extends scg0 {
        public final int a;

        public d(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("MinimumRestriction(minimum="), this.a, ')');
        }
    }

    /* compiled from: Restriction.kt */
    public static final class f extends scg0 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof f)) {
                return false;
            }
            ((f) obj).getClass();
            return true;
        }

        public final int hashCode() {
            return Integer.hashCode(0);
        }

        public final String toString() {
            return "NoRestrictionOnTransfer(amount=0)";
        }
    }

    /* compiled from: Restriction.kt */
    public static final class g extends scg0 implements a {
    }

    /* compiled from: Restriction.kt */
    public static final class e extends scg0 {
        public final int a;

        public e(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof e) && this.a == ((e) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("NoRestrictionOnRequest(amount="), this.a, ')');
        }

        public e() {
            this(0);
        }
    }
}
