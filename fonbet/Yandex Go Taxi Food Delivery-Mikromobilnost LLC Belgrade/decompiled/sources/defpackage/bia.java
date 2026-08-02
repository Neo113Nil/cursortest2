package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class bia {
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;

    public bia(FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = formattedText3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bia)) {
            return false;
        }
        bia biaVar = (bia) obj;
        return jl40.l(this.a, biaVar.a) && jl40.l(this.b, biaVar.b) && jl40.l(this.c, biaVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        return this.c.a.hashCode() + ((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31);
    }

    public final String toString() {
        return tse0.m(n.r("ChargersPassesPurchaseScreenContent(title=", this.a, ", subtitle=", this.b, ", buttonText="), this.c, Extension.C_BRAKE);
    }
}
