package xsna;

/* compiled from: MarketCategoriesFilterAction.kt */
/* loaded from: classes18.dex */
public abstract class ev00 implements kj50 {

    /* compiled from: MarketCategoriesFilterAction.kt */
    public static final class a extends ev00 {
        public static final a b = new a();
    }

    /* compiled from: MarketCategoriesFilterAction.kt */
    public static final class b extends ev00 {
        public static final b b = new b();
    }

    /* compiled from: MarketCategoriesFilterAction.kt */
    public static final class c extends ev00 {
        public final vv00 b;

        public c(vv00 vv00Var) {
            this.b = vv00Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PickCategory(category=" + this.b + ')';
        }
    }

    /* compiled from: MarketCategoriesFilterAction.kt */
    public static final class d extends ev00 {
        public static final d b = new d();
    }
}
