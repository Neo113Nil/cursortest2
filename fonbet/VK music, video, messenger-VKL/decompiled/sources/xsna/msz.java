package xsna;

/* compiled from: LoaderScreenState.kt */
/* loaded from: classes6.dex */
public interface msz extends km50 {

    /* compiled from: LoaderScreenState.kt */
    public static final class a implements msz {
        public final Throwable b;

        public a(Throwable th) {
            this.b = th;
        }
    }

    /* compiled from: LoaderScreenState.kt */
    public static final class b implements msz {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 33834754;
        }

        public final String toString() {
            return "GettingAuthCodeStatus";
        }
    }
}
