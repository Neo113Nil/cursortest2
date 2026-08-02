package xsna;

import com.vk.ecomm.storefront.impl.community.presentation.model.ProductsManagementActionType;

/* compiled from: StorefrontAction.kt */
/* loaded from: classes18.dex */
public interface nqd0 extends hjl0 {

    /* compiled from: StorefrontAction.kt */
    public static final class a implements nqd0 {
        public final ProductsManagementActionType b;

        public a(ProductsManagementActionType productsManagementActionType) {
            this.b = productsManagementActionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "BannerButtonClick(actionType=" + this.b + ')';
        }
    }

    /* compiled from: StorefrontAction.kt */
    public static final class b implements nqd0 {
        public final ProductsManagementActionType b;

        public b(ProductsManagementActionType productsManagementActionType) {
            this.b = productsManagementActionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.b == ((b) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "ModalButtonClick(actionType=" + this.b + ')';
        }
    }
}
