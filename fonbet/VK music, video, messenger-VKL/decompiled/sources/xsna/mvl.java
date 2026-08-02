package xsna;

/* compiled from: DeleteViewModel.kt */
/* loaded from: classes7.dex */
public abstract class mvl {

    /* compiled from: DeleteViewModel.kt */
    public static final class a extends mvl {
        public static final a a = new a();
    }

    /* compiled from: DeleteViewModel.kt */
    public static final class b extends mvl {
        public final Throwable a;

        public b(Throwable th) {
            this.a = th;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.a, ((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return oq.c(new StringBuilder("Error(error="), this.a, ')');
        }
    }

    /* compiled from: DeleteViewModel.kt */
    public static final class c extends mvl {
        public static final c a = new c();
    }

    /* compiled from: DeleteViewModel.kt */
    public static final class d extends mvl {
        public static final d a = new d();
    }
}
