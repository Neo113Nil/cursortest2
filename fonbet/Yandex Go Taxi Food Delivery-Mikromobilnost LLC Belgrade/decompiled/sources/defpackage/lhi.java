package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final class lhi {
    public final FormattedText a;
    public final FormattedText b;

    public lhi(FormattedText formattedText, FormattedText formattedText2) {
        this.a = formattedText;
        this.b = formattedText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lhi)) {
            return false;
        }
        lhi lhiVar = (lhi) obj;
        return jl40.l(this.a, lhiVar.a) && jl40.l(this.b, lhiVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return hashCode + (formattedText == null ? 0 : formattedText.a.hashCode());
    }

    public final String toString() {
        return "DeliveryPaidInsuranceToggleItem(title=" + this.a + ", trailText=" + this.b + Extension.C_BRAKE;
    }
}
