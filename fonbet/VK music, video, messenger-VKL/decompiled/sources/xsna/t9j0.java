package xsna;

/* compiled from: ShareViewState.kt */
/* loaded from: classes7.dex */
public final class t9j0 implements ao50 {
    public final fi50 a;

    /* compiled from: ShareViewState.kt */
    public static final class a implements fm50<u7j0> {
        public static final a a = new a();
    }

    /* compiled from: ShareViewState.kt */
    public static final class b implements fm50<u7j0> {
        public final yzt0<u9j0> a;

        public b(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Render(shareVs="), this.a, ')');
        }
    }

    public t9j0(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
