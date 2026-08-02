package xsna;

import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;

/* compiled from: MarketPickerItem.kt */
/* loaded from: classes18.dex */
public final class ha10 {
    public final MultipickerProduct a;

    public ha10(MultipickerProduct multipickerProduct) {
        this.a = multipickerProduct;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ha10) && epx.f(this.a, ((ha10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "MarketPickerItem(product=" + this.a + ')';
    }
}
