package xsna;

import com.vk.ecomm.storefront.impl.community.presentation.model.ProductsManagementActionType;

/* compiled from: StorefrontPatch.kt */
/* loaded from: classes18.dex */
public interface qqd0 extends oml0 {

    /* compiled from: StorefrontPatch.kt */
    public static final class a implements qqd0 {
        public static final a a = new a();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof a);
        }

        public final int hashCode() {
            return -883423452;
        }

        public final String toString() {
            return "CloseConfirmationModalDialog";
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class b implements qqd0 {
        public final boolean a;

        public b(boolean z) {
            this.a = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.a == ((b) obj).a;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.a);
        }

        public final String toString() {
            return defpackage.q0.a(new StringBuilder("SetBannerLoading(isLoading="), this.a, ')');
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class c implements qqd0 {
        public final ProductsManagementActionType a;

        public c(ProductsManagementActionType productsManagementActionType) {
            this.a = productsManagementActionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && this.a == ((c) obj).a;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return "ShowConfirmationModalDialog(productsManagementActionType=" + this.a + ')';
        }
    }

    /* compiled from: StorefrontPatch.kt */
    public static final class d implements qqd0 {
        public final tsd0 a;

        public d(tsd0 tsd0Var) {
            this.a = tsd0Var;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && epx.f(this.a, ((d) obj).a);
        }

        public final int hashCode() {
            tsd0 tsd0Var = this.a;
            if (tsd0Var == null) {
                return 0;
            }
            return tsd0Var.hashCode();
        }

        public final String toString() {
            return "UpdateBannerState(banner=" + this.a + ')';
        }
    }
}
