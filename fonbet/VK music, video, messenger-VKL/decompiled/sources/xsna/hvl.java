package xsna;

/* compiled from: DeleteState.kt */
/* loaded from: classes7.dex */
public abstract class hvl {

    /* compiled from: DeleteState.kt */
    public static final class a extends hvl {
        public static final a a = new a();
    }

    /* compiled from: DeleteState.kt */
    public static final class b extends hvl {
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

    /* compiled from: DeleteState.kt */
    public static final class c extends hvl {
        public static final c a = new c();
    }

    /* compiled from: DeleteState.kt */
    public static final class d extends hvl {
        public static final d a = new d();
    }
}
