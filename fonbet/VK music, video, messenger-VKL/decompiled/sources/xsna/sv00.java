package xsna;

import java.util.List;

/* compiled from: MarketCategoriesFilterViewState.kt */
/* loaded from: classes18.dex */
public final class sv00 implements ao50 {
    public final fi50 a;
    public final fi50 b;

    /* compiled from: MarketCategoriesFilterViewState.kt */
    public static final class a implements fm50<rv00> {
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
            return tr.c(new StringBuilder("ApplyButton(isSame="), this.a, ')');
        }
    }

    /* compiled from: MarketCategoriesFilterViewState.kt */
    public static final class b implements fm50<rv00> {
        public final yzt0<List<vv00>> a;

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
            return tr.c(new StringBuilder("Categories(items="), this.a, ')');
        }
    }

    public sv00(fi50 fi50Var, fi50 fi50Var2) {
        this.a = fi50Var;
        this.b = fi50Var2;
    }
}
