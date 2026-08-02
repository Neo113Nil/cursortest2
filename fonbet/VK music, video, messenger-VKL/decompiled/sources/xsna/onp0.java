package xsna;

/* compiled from: TranslateError.kt */
/* loaded from: classes6.dex */
public abstract class onp0 {

    /* compiled from: TranslateError.kt */
    public static final class a extends onp0 {
        public final Throwable a;

        public a(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("ExecuteError(throwable="), this.a, ')');
        }
    }

    /* compiled from: TranslateError.kt */
    public static final class b extends onp0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -73490209;
        }

        public final String toString() {
            return "LanguageNotRecognized";
        }
    }

    /* compiled from: TranslateError.kt */
    public static final class c extends onp0 {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 791080239;
        }

        public final String toString() {
            return "TranslateForMsgNotSupported";
        }
    }

    /* compiled from: TranslateError.kt */
    public static final class d extends onp0 {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return -1037685745;
        }

        public final String toString() {
            return "TranslateServiceNotAvailable";
        }
    }
}
