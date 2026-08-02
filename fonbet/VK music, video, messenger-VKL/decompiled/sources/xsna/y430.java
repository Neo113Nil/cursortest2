package xsna;

/* compiled from: ModerationConfirmAdultMVI.kt */
/* loaded from: classes18.dex */
public final class y430 implements ao50 {
    public final fi50 a;

    /* compiled from: ModerationConfirmAdultMVI.kt */
    public static final class a implements fm50<t430> {
        public final yzt0<Boolean> a;

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
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
            return tr.c(new StringBuilder("Content(isLoading="), this.a, ')');
        }
    }

    /* compiled from: ModerationConfirmAdultMVI.kt */
    public static final class b implements fm50<t430> {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1901917346;
        }

        public final String toString() {
            return "Empty";
        }
    }

    public y430(fi50 fi50Var) {
        this.a = fi50Var;
    }
}
