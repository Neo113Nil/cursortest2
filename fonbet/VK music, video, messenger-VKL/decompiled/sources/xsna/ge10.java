package xsna;

/* compiled from: MarketShopConditionsNavigator.kt */
/* loaded from: classes18.dex */
public interface ge10 {

    /* compiled from: MarketShopConditionsNavigator.kt */
    public static final class a implements ge10 {
        public static final a a = new a();
    }

    /* compiled from: MarketShopConditionsNavigator.kt */
    public static final class b implements ge10 {
        public final kg a;

        public b(kg kgVar) {
            this.a = kgVar;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a.equals(((b) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OpenLink(action=" + this.a + ')';
        }
    }
}
