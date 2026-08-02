package xsna;

import com.vk.ecomm.categories.api.MarketBridgeCategory;

/* compiled from: CategoriesPatch.kt */
/* loaded from: classes18.dex */
public interface sja extends yl50 {

    /* compiled from: CategoriesPatch.kt */
    public static final class a implements sja {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -561160848;
        }

        public final String toString() {
            return "BackOne";
        }
    }

    /* compiled from: CategoriesPatch.kt */
    public static final class b implements sja {
        public final MarketBridgeCategory a;

        public b(MarketBridgeCategory marketBridgeCategory) {
            this.a = marketBridgeCategory;
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
            return "OpenCategory(item=" + this.a + ')';
        }
    }

    /* compiled from: CategoriesPatch.kt */
    public static final class c implements sja {
        public final int a;

        public c(int i) {
            this.a = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.a);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("SelectTab(tabIndex="), this.a, ')');
        }
    }
}
