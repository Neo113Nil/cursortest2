package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.FieldKey;

/* compiled from: CheckoutOrderProductItem.kt */
/* loaded from: classes18.dex */
public final class b7c implements hfz {
    public final FieldKey b;
    public final xw80 c;
    public final boolean d;

    public b7c(FieldKey fieldKey, xw80 xw80Var, boolean z) {
        this.b = fieldKey;
        this.c = xw80Var;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b7c)) {
            return false;
        }
        b7c b7cVar = (b7c) obj;
        return epx.f(this.b, b7cVar.b) && epx.f(this.c, b7cVar.c) && this.d == b7cVar.d;
    }

    @Override // xsna.hfz
    public final Number getItemId() {
        return 0;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CheckoutOrderProductItem(key=");
        sb.append(this.b);
        sb.append(", product=");
        sb.append(this.c);
        sb.append(", showProperties=");
        return defpackage.q0.a(sb, this.d, ')');
    }
}
