package xsna;

/* compiled from: ClipCtaWithDonutMviAction.kt */
/* loaded from: classes16.dex */
public interface fpc extends lj50 {

    /* compiled from: ClipCtaWithDonutMviAction.kt */
    public static final class a implements fpc {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -382402116;
        }

        public final String toString() {
            return "ClearSelectedButton";
        }
    }

    /* compiled from: ClipCtaWithDonutMviAction.kt */
    public static final class b implements fpc {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -667879974;
        }

        public final String toString() {
            return "Close";
        }
    }

    /* compiled from: ClipCtaWithDonutMviAction.kt */
    public static final class c implements fpc {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1641056096;
        }

        public final String toString() {
            return "Done";
        }
    }

    /* compiled from: ClipCtaWithDonutMviAction.kt */
    public static final class d implements fpc {
        public final int b;

        public d(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("OnSelected(id="), this.b, ')');
        }
    }
}
