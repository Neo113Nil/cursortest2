package xsna;

import com.vk.ecomm.categories.api.MarketBridgeCategory;

/* compiled from: MarketCategoriesFilterEvent.kt */
/* loaded from: classes18.dex */
public abstract class lv00 {

    /* compiled from: MarketCategoriesFilterEvent.kt */
    public static final class a extends lv00 {
        public final MarketBridgeCategory a;

        public a(MarketBridgeCategory marketBridgeCategory) {
            this.a = marketBridgeCategory;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            MarketBridgeCategory marketBridgeCategory = this.a;
            if (marketBridgeCategory == null) {
                return 0;
            }
            return marketBridgeCategory.hashCode();
        }

        public final String toString() {
            return "ApplyCategory(category=" + this.a + ')';
        }
    }
}
