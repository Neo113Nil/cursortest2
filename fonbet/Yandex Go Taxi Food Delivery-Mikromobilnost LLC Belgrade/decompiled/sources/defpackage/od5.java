package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class od5 {
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final FormattedText e;
    public final FormattedText f;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public od5(FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, FormattedText formattedText5, FormattedText formattedText6) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = formattedText3;
        this.d = formattedText4;
        this.e = formattedText5;
        this.f = formattedText6;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof od5)) {
            return false;
        }
        od5 od5Var = (od5) obj;
        return this.a.equals(od5Var.a) && jl40.l(this.b, od5Var.b) && this.c.equals(od5Var.c) && jl40.l(this.d, od5Var.d) && jl40.l(this.e, od5Var.e) && jl40.l(this.f, od5Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int c = unr0.c((hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31, 31, this.c.a);
        FormattedText formattedText2 = this.d;
        int hashCode2 = (c + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        FormattedText formattedText3 = this.e;
        int hashCode3 = (hashCode2 + (formattedText3 == null ? 0 : formattedText3.a.hashCode())) * 31;
        FormattedText formattedText4 = this.f;
        return hashCode3 + (formattedText4 != null ? formattedText4.a.hashCode() : 0);
    }

    public final String toString() {
        return "BaseWindowSettingsModel(title=" + this.a + ", description=" + this.b + ", doneButtonTitle=" + this.c + ", cancelButtonTitle=" + this.d + ", doneButtonSubtitle=" + this.e + ", cancelButtonSubtitle=" + this.f + Extension.C_BRAKE;
    }
}
