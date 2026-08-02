package xsna;

import com.vk.ecomm.design.compose.property.config.MarketProperty$VariantState;

/* compiled from: MarketProperty.kt */
/* loaded from: classes18.dex */
public final class kd10 {
    public final int a;
    public final String b;
    public final MarketProperty$VariantState c;

    public kd10(int i, String str, MarketProperty$VariantState marketProperty$VariantState) {
        this.a = i;
        this.b = str;
        this.c = marketProperty$VariantState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kd10)) {
            return false;
        }
        kd10 kd10Var = (kd10) obj;
        return this.a == kd10Var.a && epx.f(this.b, kd10Var.b) && this.c == kd10Var.c;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        return this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    public final String toString() {
        return "ImageVariant(id=" + this.a + ", url=" + this.b + ", state=" + this.c + ')';
    }
}
