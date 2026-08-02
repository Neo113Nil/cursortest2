package xsna;

import com.vk.ecomm.products_selection.api.model.SelectionProductId;

/* compiled from: ProductsSelectionAction.kt */
/* loaded from: classes18.dex */
public interface htd0 extends kj50 {

    /* compiled from: ProductsSelectionAction.kt */
    public static final class a implements htd0 {
        public static final a b = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -618309392;
        }

        public final String toString() {
            return "InitAction";
        }
    }

    /* compiled from: ProductsSelectionAction.kt */
    public static final class b implements htd0 {
        public final SelectionProductId b;

        public b(SelectionProductId selectionProductId) {
            this.b = selectionProductId;
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
            return "OnBindProductViewAction(itemId=" + this.b + ')';
        }
    }

    /* compiled from: ProductsSelectionAction.kt */
    public static final class c implements htd0 {
        public static final c b = new c();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof c);
        }

        public final int hashCode() {
            return 1052937858;
        }

        public final String toString() {
            return "OnErrorButtonRetryTapAction";
        }
    }

    /* compiled from: ProductsSelectionAction.kt */
    public static final class d implements htd0 {
        public final SelectionProductId b;

        public d(SelectionProductId selectionProductId) {
            this.b = selectionProductId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnItemFaveClickAction(itemId=" + this.b + ')';
        }
    }

    /* compiled from: ProductsSelectionAction.kt */
    public static final class e implements htd0 {
        public final boolean b;
        public final SelectionProductId c;

        public e(SelectionProductId selectionProductId, boolean z) {
            this.b = z;
            this.c = selectionProductId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof e)) {
                return false;
            }
            e eVar = (e) obj;
            return this.b == eVar.b && epx.f(this.c, eVar.c);
        }

        public final int hashCode() {
            return this.c.hashCode() + (Boolean.hashCode(this.b) * 31);
        }

        public final String toString() {
            return "OnItemFaveItemStateChangeAction(isFave=" + this.b + ", itemId=" + this.c + ')';
        }
    }

    /* compiled from: ProductsSelectionAction.kt */
    public static final class f implements htd0 {
        public final SelectionProductId b;

        public f(SelectionProductId selectionProductId) {
            this.b = selectionProductId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof f) && epx.f(this.b, ((f) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnProductCtaBtnClickAction(itemId=" + this.b + ')';
        }
    }

    /* compiled from: ProductsSelectionAction.kt */
    public static final class g implements htd0 {
        public final SelectionProductId b;

        public g(SelectionProductId selectionProductId) {
            this.b = selectionProductId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "OnProductTileClickAction(itemId=" + this.b + ')';
        }
    }

    /* compiled from: ProductsSelectionAction.kt */
    public static final class h implements htd0 {
        public static final h b = new h();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof h);
        }

        public final int hashCode() {
            return 240383575;
        }

        public final String toString() {
            return "OnTopBarCartClickAction";
        }
    }

    /* compiled from: ProductsSelectionAction.kt */
    public static final class i implements htd0 {
        public final int b;

        public i(int i) {
            this.b = i;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && this.b == ((i) obj).b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b);
        }

        public final String toString() {
            return vu5.b(new StringBuilder("UpdateCartCountValueAction(cartCountValue="), this.b, ')');
        }
    }

    /* compiled from: ProductsSelectionAction.kt */
    public static final class j implements htd0 {
        public final SelectionProductId b;
        public final boolean c;

        public j(SelectionProductId selectionProductId, boolean z) {
            this.b = selectionProductId;
            this.c = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof j)) {
                return false;
            }
            j jVar = (j) obj;
            return epx.f(this.b, jVar.b) && this.c == jVar.c;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.c) + (this.b.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("UpdateFaveForItemAction(itemId=");
            sb.append(this.b);
            sb.append(", isFave=");
            return defpackage.q0.a(sb, this.c, ')');
        }
    }
}
