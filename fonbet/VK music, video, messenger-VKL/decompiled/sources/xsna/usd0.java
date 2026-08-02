package xsna;

import com.vk.ecomm.storefront.impl.community.presentation.model.ProductsManagementActionType;

/* compiled from: ProductsManagementBannerState.kt */
/* loaded from: classes18.dex */
public final class usd0 {
    public final String a;
    public final boolean b;
    public final ProductsManagementActionType c;

    public usd0(String str, boolean z, ProductsManagementActionType productsManagementActionType) {
        this.a = str;
        this.b = z;
        this.c = productsManagementActionType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof usd0)) {
            return false;
        }
        usd0 usd0Var = (usd0) obj;
        return epx.f(this.a, usd0Var.a) && this.b == usd0Var.b && this.c == usd0Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "ProductsManagementButton(title=" + this.a + ", isPrimary=" + this.b + ", actionType=" + this.c + ')';
    }
}
