package xsna;

import com.vk.ecomm.cart.impl.checkout.feature.state.ActionField;

/* compiled from: CheckoutStickItem.kt */
/* loaded from: classes18.dex */
public final class g3c implements y8c {
    public final String a;
    public final boolean b;
    public final ActionField.Type c;

    public g3c(String str, boolean z, ActionField.Type type) {
        this.a = str;
        this.b = z;
        this.c = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g3c)) {
            return false;
        }
        g3c g3cVar = (g3c) obj;
        return epx.f(this.a, g3cVar.a) && this.b == g3cVar.b && this.c == g3cVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + qoy.b(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        return "CheckoutCompleteActionStickItem(title=" + this.a + ", isDisabled=" + this.b + ", type=" + this.c + ')';
    }
}
