package xsna;

/* compiled from: ShareState.kt */
/* loaded from: classes7.dex */
public abstract class t7j0 {

    /* compiled from: ShareState.kt */
    public static final class a extends t7j0 {
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

    /* compiled from: ShareState.kt */
    public static final class b extends t7j0 {
        public static final b a = new b();
    }

    /* compiled from: ShareState.kt */
    public static final class c extends t7j0 {
        public static final c a = new c();
    }

    /* compiled from: ShareState.kt */
    public static final class d extends t7j0 {
        public static final d a = new d();
    }
}
