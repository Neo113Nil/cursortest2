package xsna;

/* compiled from: MailSilentTokenResult.kt */
/* loaded from: classes3.dex */
public interface yc00 {

    /* compiled from: MailSilentTokenResult.kt */
    public static final class a implements yc00 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Error(error=null)";
        }
    }

    /* compiled from: MailSilentTokenResult.kt */
    public static final class b implements yc00 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            ((b) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "Success(data=null)";
        }
    }

    /* compiled from: MailSilentTokenResult.kt */
    public static final class c implements yc00 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 195885585;
        }

        public final String toString() {
            return "TokenExpired";
        }
    }
}
