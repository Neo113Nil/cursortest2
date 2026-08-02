package xsna;

import com.vk.ecomm.market.good.good2.presentation.restrictions.ProductCardRestrictions;
import java.util.ArrayList;

/* compiled from: GoodLoadDataDelegate.kt */
/* loaded from: classes18.dex */
public interface g5u {

    /* compiled from: GoodLoadDataDelegate.kt */
    public static final class a implements g5u {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -1449075154;
        }

        public final String toString() {
            return "DeleteMarketItem";
        }
    }

    /* compiled from: GoodLoadDataDelegate.kt */
    public static final class b implements g5u {
        public static final b a = new b();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof b);
        }

        public final int hashCode() {
            return -2038266706;
        }

        public final String toString() {
            return "InvalidateOptionsMenu";
        }
    }

    /* compiled from: GoodLoadDataDelegate.kt */
    public static final class c implements g5u {
        public final ArrayList a;

        public c(ArrayList arrayList) {
            this.a = arrayList;
        }
    }

    /* compiled from: GoodLoadDataDelegate.kt */
    public static final class d implements g5u {
        public final ProductCardRestrictions a;

        public d(ProductCardRestrictions productCardRestrictions) {
            this.a = productCardRestrictions;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.a == ((d) obj).a;
        }

        public final int hashCode() {
            ProductCardRestrictions productCardRestrictions = this.a;
            if (productCardRestrictions == null) {
                return 0;
            }
            return productCardRestrictions.hashCode();
        }

        public final String toString() {
            return "OnRestrictionsLoaded(restrictions=" + this.a + ')';
        }
    }

    /* compiled from: GoodLoadDataDelegate.kt */
    public static final class e implements g5u {
        public final String a;

        public e(String str) {
            this.a = str;
        }
    }

    /* compiled from: GoodLoadDataDelegate.kt */
    public static final class f implements g5u {
        public static final f a = new f();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof f);
        }

        public final int hashCode() {
            return 96448363;
        }

        public final String toString() {
            return "ShowGoodNotFoundError";
        }
    }
}
