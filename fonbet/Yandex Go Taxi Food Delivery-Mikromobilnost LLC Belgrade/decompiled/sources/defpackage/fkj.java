package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.CurrencySymbolAnchor;

/* loaded from: classes5.dex */
public final class fkj implements hkj {
    public final String a;
    public final CurrencySymbolAnchor b;

    public fkj(String str, CurrencySymbolAnchor currencySymbolAnchor) {
        this.a = str;
        this.b = currencySymbolAnchor;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fkj)) {
            return false;
        }
        fkj fkjVar = (fkj) obj;
        return jl40.l(this.a, fkjVar.a) && this.b == fkjVar.b;
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public final String toString() {
        return "CostDigitsInputType(currencySymbol=" + this.a + ", currencySymbolAnchor=" + this.b + Extension.C_BRAKE;
    }
}
