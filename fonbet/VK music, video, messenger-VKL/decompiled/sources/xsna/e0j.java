package xsna;

import java.util.List;

/* compiled from: ConfigureItemListViewState.kt */
/* loaded from: classes18.dex */
public final class e0j implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: ConfigureItemListViewState.kt */
    public static final class a implements fm50<d0j> {
        public final yzt0<List<xzi>> a;

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
            return tr.c(new StringBuilder("Content(items="), this.a, ')');
        }
    }

    /* compiled from: ConfigureItemListViewState.kt */
    public static final class b implements fm50<d0j> {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -258462840;
        }

        public final String toString() {
            return "Empty";
        }
    }

    /* compiled from: ConfigureItemListViewState.kt */
    public static final class c implements fm50<d0j> {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -146764939;
        }

        public final String toString() {
            return "Init";
        }
    }

    public e0j(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
