package xsna;

import com.vk.ecomm.categories.api.MarketBridgeCategory;

/* compiled from: CategoriesAction.kt */
/* loaded from: classes18.dex */
public interface fja extends lj50 {

    /* compiled from: CategoriesAction.kt */
    public static final class a implements fja {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 146136721;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    /* compiled from: CategoriesAction.kt */
    public static final class b implements fja {
        public final MarketBridgeCategory b;

        public b(MarketBridgeCategory marketBridgeCategory) {
            this.b = marketBridgeCategory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && epx.f(this.b, ((b) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "CategoryClicked(item=" + this.b + ')';
        }
    }

    /* compiled from: CategoriesAction.kt */
    public static final class c implements fja {
        public final int b;

        public c(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.b == ((c) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("TabClicked(index="), this.b, ')');
        }
    }
}
