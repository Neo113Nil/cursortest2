package xsna;

/* compiled from: SelectGroupVerificationAction.kt */
/* loaded from: classes18.dex */
public interface j7i0 extends kj50 {

    /* compiled from: SelectGroupVerificationAction.kt */
    public static final class a implements j7i0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 1931077495;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: SelectGroupVerificationAction.kt */
    public static final class b implements j7i0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -350426278;
        }

        public final String toString() {
            return "OnBackClicked";
        }
    }

    /* compiled from: SelectGroupVerificationAction.kt */
    public static final class c implements j7i0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -1049981517;
        }

        public final String toString() {
            return "OnInfoClicked";
        }
    }

    /* compiled from: SelectGroupVerificationAction.kt */
    public static final class d implements j7i0 {
        public final String b;

        public d(String str) {
            this.b = str;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OnVerificationTypeClicked(typeId="), this.b, ')');
        }
    }
}
