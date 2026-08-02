package xsna;

/* compiled from: FinishingState.kt */
/* loaded from: classes7.dex */
public abstract class ohr {

    /* compiled from: FinishingState.kt */
    public static final class a extends ohr {
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

    /* compiled from: FinishingState.kt */
    public static final class b extends ohr {
        public static final b a = new b();
    }

    /* compiled from: FinishingState.kt */
    public static final class c extends ohr {
        public static final c a = new c();
    }
}
