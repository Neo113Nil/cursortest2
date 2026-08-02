package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.tariffs.model.ButtonStyleModel;

/* loaded from: classes5.dex */
public final class ghi {
    public final FormattedText a;
    public final FormattedText b;
    public final ButtonStyleModel c;

    public ghi(FormattedText formattedText, FormattedText formattedText2, ButtonStyleModel buttonStyleModel) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = buttonStyleModel;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ghi)) {
            return false;
        }
        ghi ghiVar = (ghi) obj;
        return jl40.l(this.a, ghiVar.a) && jl40.l(this.b, ghiVar.b) && this.c == ghiVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return this.c.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31);
    }

    public final String toString() {
        StringBuilder r = n.r("DeliveryPaidInsuranceScreenButtonModel(title=", this.a, ", subtitle=", this.b, ", style=");
        r.append(this.c);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
