package xsna;

/* compiled from: ShareViewModel.kt */
/* loaded from: classes7.dex */
public abstract class s9j0 {

    /* compiled from: ShareViewModel.kt */
    public static final class a extends s9j0 {
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
            return oq.c(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    /* compiled from: ShareViewModel.kt */
    public static final class b extends s9j0 {
        public static final b a = new b();
    }

    /* compiled from: ShareViewModel.kt */
    public static final class c extends s9j0 {
        public static final c a = new c();
    }

    /* compiled from: ShareViewModel.kt */
    public static final class d extends s9j0 {
        public static final d a = new d();
    }
}
