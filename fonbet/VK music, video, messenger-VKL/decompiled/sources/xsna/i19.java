package xsna;

/* compiled from: LocalTokenDelegate.kt */
/* loaded from: classes6.dex */
public abstract class i19 {

    /* compiled from: LocalTokenDelegate.kt */
    public static final class a extends i19 {
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
            return "ErrorResult(error=null)";
        }
    }

    /* compiled from: LocalTokenDelegate.kt */
    public static final class b extends i19 {
        public static final b a = new b();
    }

    /* compiled from: LocalTokenDelegate.kt */
    public static final class c extends i19 {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            ((c) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        public final String toString() {
            return "SuccessResult(response=null)";
        }
    }
}
