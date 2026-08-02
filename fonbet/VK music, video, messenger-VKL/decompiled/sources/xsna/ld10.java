package xsna;

import com.vk.ecomm.design.compose.property.config.MarketProperty$VariantState;

/* compiled from: MarketProperty.kt */
/* loaded from: classes18.dex */
public final class ld10 {
    public final int a;
    public final String b;
    public final MarketProperty$VariantState c;

    public ld10(int i, String str, MarketProperty$VariantState marketProperty$VariantState) {
        this.a = i;
        this.b = str;
        this.c = marketProperty$VariantState;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ld10)) {
            return false;
        }
        ld10 ld10Var = (ld10) obj;
        return this.a == ld10Var.a && epx.f(this.b, ld10Var.b) && this.c == ld10Var.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + urd0.a(Integer.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        return "TextVariant(id=" + this.a + ", text=" + this.b + ", state=" + this.c + ')';
    }
}
