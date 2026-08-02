package xsna;

/* compiled from: MarketShopConditionsState.kt */
/* loaded from: classes18.dex */
public interface oe10 extends km50 {

    /* compiled from: MarketShopConditionsState.kt */
    public static final class a implements oe10 {
        public final hej0 b;

        public a(hej0 hej0Var) {
            this.b = hej0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "Content(data=" + this.b + ')';
        }
    }

    /* compiled from: MarketShopConditionsState.kt */
    public static final class b implements oe10 {
        public static final b b = new b();
    }

    /* compiled from: MarketShopConditionsState.kt */
    public static final class c implements oe10 {
        public static final c b = new c();
    }
}
