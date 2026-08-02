package xsna;

/* compiled from: PostingWithAuthorPatch.kt */
/* loaded from: classes4.dex */
public interface pqc0 extends xl50 {

    /* compiled from: PostingWithAuthorPatch.kt */
    public static final class a implements pqc0 {
        public final nqc0 b;

        public a(nqc0 nqc0Var) {
            this.b = nqc0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Error(type=" + this.b + ')';
        }
    }

    /* compiled from: PostingWithAuthorPatch.kt */
    public static final class b implements pqc0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1788022544;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: PostingWithAuthorPatch.kt */
    public static final class c implements pqc0 {
        public final vcc0 b;

        public c(vcc0 vcc0Var) {
            this.b = vcc0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Success(data=" + this.b + ')';
        }
    }

    /* compiled from: PostingWithAuthorPatch.kt */
    public static final class d implements pqc0 {
        public final vcc0 b;

        public d(vcc0 vcc0Var) {
            this.b = vcc0Var;
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
            return "UpdateData(data=" + this.b + ')';
        }
    }
}
