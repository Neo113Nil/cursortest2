package xsna;

import com.vk.ecomm.market.good.ui.holder.properties.ProductPropertyType;
import java.util.ArrayList;

/* compiled from: ProductPropertyItem.kt */
/* loaded from: classes18.dex */
public final class ird0 {
    public final String a;
    public final ProductPropertyType b;
    public final ArrayList c;
    public krd0 d;

    public ird0(String str, ProductPropertyType productPropertyType, ArrayList arrayList, krd0 krd0Var) {
        this.a = str;
        this.b = productPropertyType;
        this.c = arrayList;
        this.d = krd0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ird0)) {
            return false;
        }
        ird0 ird0Var = (ird0) obj;
        return this.a.equals(ird0Var.a) && this.b == ird0Var.b && this.c.equals(ird0Var.c) && epx.f(this.d, ird0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + qr.a(this.c, (this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31);
    }

    public final String toString() {
        return "ProductProperty(title=" + this.a + ", type=" + this.b + ", variants=" + this.c + ", selectedVariant=" + this.d + ')';
    }
}
