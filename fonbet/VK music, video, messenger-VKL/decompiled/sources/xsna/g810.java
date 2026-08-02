package xsna;

import com.vk.ecomm.products_multipicker.api.model.MultipickerProduct;
import com.vk.ecomm.products_multipicker.api.model.MultipickerProductId;

/* compiled from: MarketMultiPickerItem.kt */
/* loaded from: classes18.dex */
public final class g810 implements hfz {
    public final MultipickerProductId b;
    public final boolean c;
    public final boolean d;
    public final MultipickerProduct e;

    public g810(MultipickerProductId multipickerProductId, boolean z, boolean z2, MultipickerProduct multipickerProduct) {
        this.b = multipickerProductId;
        this.c = z;
        this.d = z2;
        this.e = multipickerProduct;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g810)) {
            return false;
        }
        g810 g810Var = (g810) obj;
        return epx.f(this.b, g810Var.b) && this.c == g810Var.c && this.d == g810Var.d && epx.f(this.e, g810Var.e);
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return Integer.valueOf(this.b.hashCode());
    }

    public final int hashCode() {
        return this.e.hashCode() + qoy.b(qoy.b(this.b.hashCode() * 31, 31, this.c), 31, this.d);
    }

    public final String toString() {
        return "MarketMultiPickerItem(itemId=" + this.b + ", isSelected=" + this.c + ", canBeMarkSelect=" + this.d + ", product=" + this.e + ')';
    }
}
