package xsna;

/* compiled from: PostingWithAuthorViewState.kt */
/* loaded from: classes4.dex */
public final class yqc0 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: PostingWithAuthorViewState.kt */
    public static final class a implements fm50<sqc0> {
        public final yzt0<vcc0> a;

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
            return tr.c(new StringBuilder("Content(data="), this.a, ')');
        }
    }

    /* compiled from: PostingWithAuthorViewState.kt */
    public static final class b implements fm50<sqc0> {
        public final yzt0<nqc0> a;

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
            return tr.c(new StringBuilder("Error(type="), this.a, ')');
        }
    }

    /* compiled from: PostingWithAuthorViewState.kt */
    public static final class c implements fm50<sqc0> {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -402468200;
        }

        public final String toString() {
            return "Init";
        }
    }

    /* compiled from: PostingWithAuthorViewState.kt */
    public static final class d implements fm50<sqc0> {
        public static final d a = new d();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof d);
        }

        public final int hashCode() {
            return 6956724;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public yqc0(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
