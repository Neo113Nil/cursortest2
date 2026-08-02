package xsna;

import xsna.msz;

/* compiled from: LoaderScreenViewState.kt */
/* loaded from: classes6.dex */
public final class nsz implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: LoaderScreenViewState.kt */
    public static final class a implements fm50<msz.a> {
        public final yzt0<C3412a> a;

        /* compiled from: LoaderScreenViewState.kt */
        /* renamed from: xsna.nsz$a$a, reason: collision with other inner class name */
        public static final class C3412a {
            public final String a;
            public final String b;

            public C3412a(String str, String str2) {
                this.a = str;
                this.b = str2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C3412a)) {
                    return false;
                }
                C3412a c3412a = (C3412a) obj;
                return epx.f(this.a, c3412a.a) && epx.f(this.b, c3412a.b);
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

    /* compiled from: LoaderScreenViewState.kt */
    public static final class b implements fm50<msz.b> {
        public static final b a = new b();
    }

    public nsz(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nsz)) {
            return false;
        }
        nsz nszVar = (nsz) obj;
        return this.a.equals(nszVar.a) && this.b.equals(nszVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoaderScreenViewState(loader=");
        sb.append(this.a);
        sb.append(", error=");
        return j8.b(sb, this.b, ')');
    }
}
