package xsna;

import com.vk.ecomm.storefront.impl.community.presentation.model.ProductsManagementActionType;
import xsna.ln50;
import xsna.on50;

/* compiled from: StorefrontTask.kt */
/* loaded from: classes18.dex */
public interface sqd0 extends dpl0 {

    /* compiled from: StorefrontTask.kt */
    public static final class a implements sqd0 {
        public final ProductsManagementActionType b;

        public a(ProductsManagementActionType productsManagementActionType) {
            this.b = productsManagementActionType;
        }

        @Override // xsna.hn50
        public final ln50<on50> d() {
            return ln50.a.a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && this.b == ((a) obj).b;
        }

        @Override // xsna.hn50
        public final on50 getId() {
            return on50.a.a;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdateBanner(actionType=" + this.b + ')';
        }
    }
}
