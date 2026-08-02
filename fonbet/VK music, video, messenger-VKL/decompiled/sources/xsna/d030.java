package xsna;

/* compiled from: ModalMapContract.kt */
/* loaded from: classes15.dex */
public abstract class d030 {

    /* compiled from: ModalMapContract.kt */
    public static final class a extends d030 {
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
            Throwable th = this.a;
            if (th == null) {
                return 0;
            }
            return th.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(throwable="), this.a, ')');
        }
    }

    /* compiled from: ModalMapContract.kt */
    public static final class b extends d030 {
        public static final b a = new b();
    }

    /* compiled from: ModalMapContract.kt */
    public static final class c extends d030 {
        public static final c a = new c();
    }
}
