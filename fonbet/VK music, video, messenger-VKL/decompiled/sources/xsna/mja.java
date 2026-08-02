package xsna;

import com.vk.ecomm.categories.api.MarketBridgeCategory;

/* compiled from: CategoriesEvent.kt */
/* loaded from: classes18.dex */
public interface mja extends pk50 {

    /* compiled from: CategoriesEvent.kt */
    public static final class a implements mja {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return 776165910;
        }

        public final String toString() {
            return "FinishAndGoBack";
        }
    }

    /* compiled from: CategoriesEvent.kt */
    public static final class b implements mja {
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
            return "OpenSearchWithCategory(item=" + this.a + ')';
        }
    }
}
