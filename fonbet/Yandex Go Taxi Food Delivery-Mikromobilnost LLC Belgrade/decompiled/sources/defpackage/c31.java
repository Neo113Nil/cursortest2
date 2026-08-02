package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class c31 extends e31 {
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final boolean f;
    public final boolean g;
    public final String h;
    public final String i;

    public c31(FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3, FormattedText formattedText4, String str, boolean z, boolean z2, String str2, String str3) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = formattedText3;
        this.d = formattedText4;
        this.e = str;
        this.f = z;
        this.g = z2;
        this.h = str2;
        this.i = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c31)) {
            return false;
        }
        c31 c31Var = (c31) obj;
        return jl40.l(this.a, c31Var.a) && jl40.l(this.b, c31Var.b) && jl40.l(this.c, c31Var.c) && jl40.l(this.d, c31Var.d) && jl40.l(this.e, c31Var.e) && this.f == c31Var.f && this.g == c31Var.g && jl40.l(this.h, c31Var.h) && jl40.l(this.i, c31Var.i);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.c;
        int hashCode3 = (hashCode2 + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        FormattedText formattedText3 = this.d;
        int hashCode4 = (hashCode3 + (formattedText3 == null ? 0 : formattedText3.a.hashCode())) * 31;
        String str = this.e;
        int b = unr0.b(unr0.e(unr0.e((hashCode4 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str2 = this.i;
        return b + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = n.r("SelectableOption(title=", this.a, ", subtitle=", this.b, ", trailingTitle=");
        n.C(r, this.c, ", trailingSubtitle=", this.d, ", leadIconTag=");
        tse0.y(this.e, ", isSelected=", ", addSeparatorBelow=", r, this.f);
        unr0.A(", associatedResultId=", this.h, ", choiceId=", r, this.g);
        return oyr.t(r, this.i, Extension.C_BRAKE);
    }
}
