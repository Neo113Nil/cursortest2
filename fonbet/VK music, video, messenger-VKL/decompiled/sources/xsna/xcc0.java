package xsna;

/* compiled from: PostingAuthorLoadError.kt */
/* loaded from: classes4.dex */
public interface xcc0 {

    /* compiled from: PostingAuthorLoadError.kt */
    public static final class a implements xcc0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 668100442;
        }

        public final String toString() {
            return "NoInternet";
        }
    }

    /* compiled from: PostingAuthorLoadError.kt */
    public static final class b implements xcc0 {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1074233444;
        }

        public final String toString() {
            return "NoUser";
        }
    }

    /* compiled from: PostingAuthorLoadError.kt */
    public static final class c implements xcc0 {
        public final Throwable a;

        public c(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Unknown(cause="), this.a, ')');
        }
    }
}
