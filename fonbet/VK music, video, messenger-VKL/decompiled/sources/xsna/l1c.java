package xsna;

import xsna.k1c;

/* compiled from: CheckSignInViewState.kt */
/* loaded from: classes6.dex */
public final class l1c implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: CheckSignInViewState.kt */
    public static final class a implements fm50<k1c.a> {
        public final yzt0<C3224a> a;

        /* compiled from: CheckSignInViewState.kt */
        /* renamed from: xsna.l1c$a$a, reason: collision with other inner class name */
        public static final class C3224a {
            public final String a;
            public final String b;

            public C3224a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3224a)) {
                    return false;
                }
                C3224a c3224a = (C3224a) obj;
                return epx.f(this.a, c3224a.a) && epx.f(this.b, c3224a.b);
            }

            public final int hashCode() {
                return this.b.hashCode() + (this.a.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("ErrorDialogViewData(errorTitle=");
                sb.append(this.a);
                sb.append(", errorMessage=");
                return ho8.a(sb, this.b, ')');
            }
        }

        public a(h0u0 h0u0Var) {
            this.a = h0u0Var;
        }
    }

    /* compiled from: CheckSignInViewState.kt */
    public static final class b implements fm50<k1c> {
        public static final b a = new b();
    }

    public l1c(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1c)) {
            return false;
        }
        l1c l1cVar = (l1c) obj;
        return this.a.equals(l1cVar.a) && this.b.equals(l1cVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckSignInViewState(modal=");
        sb.append(this.a);
        sb.append(", error=");
        return j8.b(sb, this.b, ')');
    }
}
