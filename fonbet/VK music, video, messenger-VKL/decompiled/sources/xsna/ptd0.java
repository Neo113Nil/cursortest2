package xsna;

import java.util.List;

/* compiled from: ProductsSelectionViewState.kt */
/* loaded from: classes18.dex */
public final class ptd0 implements ao50 {
    public final fi50 a;
    public final fi50 b;
    public final fi50 c;

    /* compiled from: ProductsSelectionViewState.kt */
    public static final class a implements fm50<otd0> {
        public final yzt0<List<lei0>> a;
        public final yzt0<Integer> b;

        public a(h0u0 h0u0Var, h0u0 h0u0Var2) {
            this.a = h0u0Var;
            this.b = h0u0Var2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && epx.f(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Content(items=");
            sb.append(this.a);
            sb.append(", cartCountValue=");
            return tr.c(sb, this.b, ')');
        }
    }

    /* compiled from: ProductsSelectionViewState.kt */
    public static final class b implements fm50<otd0> {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return 1099882904;
        }

        public final String toString() {
            return "Error";
        }
    }

    /* compiled from: ProductsSelectionViewState.kt */
    public static final class c implements fm50<otd0> {
        public static final c a = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return -2053813044;
        }

        public final String toString() {
            return "Loading";
        }
    }

    public ptd0(fi50 fi50Var, fi50 fi50Var2, fi50 fi50Var3) {
        this.a = fi50Var;
        this.b = fi50Var2;
        this.c = fi50Var3;
    }
}
