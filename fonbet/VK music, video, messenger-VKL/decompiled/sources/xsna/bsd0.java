package xsna;

import com.vk.ecomm.products_selection.api.model.SelectionProductId;

/* compiled from: ProductSelectionAdapterEvent.kt */
/* loaded from: classes18.dex */
public interface bsd0 {

    /* compiled from: ProductSelectionAdapterEvent.kt */
    public static final class a implements bsd0 {
        public final SelectionProductId a;

        public a(SelectionProductId selectionProductId) {
            this.a = selectionProductId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && epx.f(this.a, ((a) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnBindProductHolderEvent(itemId=" + this.a + ')';
        }
    }

    /* compiled from: ProductSelectionAdapterEvent.kt */
    public static final class b implements bsd0 {
        public final SelectionProductId a;

        public b(SelectionProductId selectionProductId) {
            this.a = selectionProductId;
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
            return "OnProductCtaBtnClickEvent(itemId=" + this.a + ')';
        }
    }

    /* compiled from: ProductSelectionAdapterEvent.kt */
    public static final class c implements bsd0 {
        public final SelectionProductId a;

        public c(SelectionProductId selectionProductId) {
            this.a = selectionProductId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && epx.f(this.a, ((c) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnProductFaveClickEvent(itemId=" + this.a + ')';
        }
    }

    /* compiled from: ProductSelectionAdapterEvent.kt */
    public static final class d implements bsd0 {
        public final SelectionProductId a;

        public d(SelectionProductId selectionProductId) {
            this.a = selectionProductId;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "OnProductTileClickEvent(itemId=" + this.a + ')';
        }
    }
}
