package xsna;

/* compiled from: MarketShopConditionsAction.kt */
/* loaded from: classes18.dex */
public abstract class ce10 implements kj50 {

    /* compiled from: MarketShopConditionsAction.kt */
    public static abstract class a extends ce10 {

        /* compiled from: MarketShopConditionsAction.kt */
        /* renamed from: xsna.ce10$a$a, reason: collision with other inner class name */
        public static final class C2660a extends a {
            public static final C2660a b = new C2660a();
        }

        /* compiled from: MarketShopConditionsAction.kt */
        public static final class b extends a {
            public static final b b = new b();
        }
    }

    /* compiled from: MarketShopConditionsAction.kt */
    public static final class b extends ce10 {
        public static final b b = new b();
    }

    /* compiled from: MarketShopConditionsAction.kt */
    public static abstract class c extends ce10 {

        /* compiled from: MarketShopConditionsAction.kt */
        public static final class a extends c {
            public final String b;

            public a(String str) {
                this.b = str;
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
                return ho8.a(new StringBuilder("Click(link="), this.b, ')');
            }
        }

        /* compiled from: MarketShopConditionsAction.kt */
        public static final class b extends c {
            public static final b b = new b();
        }
    }

    /* compiled from: MarketShopConditionsAction.kt */
    public static final class d extends ce10 {
        public static final d b = new d();
    }
}
