package xsna;

/* compiled from: PhoneActualizationResult.kt */
/* loaded from: classes4.dex */
public interface k2a0 {

    /* compiled from: PhoneActualizationResult.kt */
    public static final class a implements k2a0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1266082244;
        }

        public final String toString() {
            return "Dismissed";
        }
    }

    /* compiled from: PhoneActualizationResult.kt */
    public static final class b implements k2a0 {
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
            return this.a.hashCode();
        }

        public final String toString() {
            return ho8.a(new StringBuilder("OpenVkIdLk(accessToken="), this.a, ')');
        }
    }

    /* compiled from: PhoneActualizationResult.kt */
    public static final class c implements k2a0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1672776575;
        }

        public final String toString() {
            return "PhoneActualized";
        }
    }
}
