package xsna;

/* compiled from: SelectGroupVerificationPath.kt */
/* loaded from: classes18.dex */
public interface c8i0 extends xl50 {

    /* compiled from: SelectGroupVerificationPath.kt */
    public static final class a implements c8i0 {
        public final Throwable b;

        public a(Throwable th) {
            this.b = th;
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
            return oq.c(new StringBuilder("SetFailure(exception="), this.b, ')');
        }
    }

    /* compiled from: SelectGroupVerificationPath.kt */
    public static final class b implements c8i0 {
        public final rmu b;

        public b(rmu rmuVar) {
            this.b = rmuVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "SetGroupVerificationData(data=" + this.b + ')';
        }
    }
}
