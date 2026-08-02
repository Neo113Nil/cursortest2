package xsna;

import com.vk.ecomm.products_multipicker.impl.presentation.adapters.itemadapter.paginationerror.TypeOfItems;
import xsna.tlo0;

/* compiled from: MarketMultiPickerPaginationErrorItem.kt */
/* loaded from: classes18.dex */
public final class m810 implements hfz {
    public final tlo0.f b;
    public final tlo0.f c;
    public final TypeOfItems d;

    public m810(tlo0.f fVar, tlo0.f fVar2, TypeOfItems typeOfItems) {
        this.b = fVar;
        this.c = fVar2;
        this.d = typeOfItems;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m810)) {
            return false;
        }
        m810 m810Var = (m810) obj;
        return this.b.equals(m810Var.b) && this.c.equals(m810Var.c) && this.d == m810Var.d;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return this.d.hashCode() + shy.a(this.c.a, Integer.hashCode(this.b.a) * 31, 31);
    }

    public final String toString() {
        return "MarketMultiPickerPaginationErrorItem(errorText=" + this.b + ", retryButtonText=" + this.c + ", typeOfItems=" + this.d + ')';
    }
}
