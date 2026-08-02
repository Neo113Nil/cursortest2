package xsna;

/* compiled from: PostingWithAuthorState.kt */
/* loaded from: classes4.dex */
public abstract class sqc0 implements km50 {

    /* compiled from: PostingWithAuthorState.kt */
    public static final class a extends sqc0 {
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

    /* compiled from: PostingWithAuthorState.kt */
    public static final class b extends sqc0 {
        public static final b b = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 929389145;
        }

        public final String toString() {
            return "Loading";
        }
    }

    /* compiled from: PostingWithAuthorState.kt */
    public static final class c extends sqc0 {
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
}
