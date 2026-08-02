package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class nkm0 {
    public final FormattedText a;
    public final FormattedText b;
    public final ul4 c;
    public final Object d;
    public final boolean e;
    public final String f;

    public nkm0(FormattedText formattedText, FormattedText formattedText2, ul4 ul4Var, Object obj, boolean z, String str) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = ul4Var;
        this.d = obj;
        this.e = z;
        this.f = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nkm0)) {
            return false;
        }
        nkm0 nkm0Var = (nkm0) obj;
        return this.a.equals(nkm0Var.a) && jl40.l(this.b, nkm0Var.b) && jl40.l(this.c, nkm0Var.c) && jl40.l(this.d, nkm0Var.d) && this.e == nkm0Var.e && jl40.l(this.f, nkm0Var.f);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        ul4 ul4Var = this.c;
        int e = unr0.e(smw0.c((hashCode2 + (ul4Var == null ? 0 : ul4Var.hashCode())) * 31, 31, this.d), 31, this.e);
        String str = this.f;
        return e + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ScalableSelectorOption(text1=");
        sb.append(this.a);
        sb.append(", text2=");
        sb.append(this.b);
        sb.append(", badge=");
        sb.append(this.c);
        sb.append(", value=");
        sb.append(this.d);
        sb.append(", isEnabled=");
        return n.m(", metricaLabel=", this.f, Extension.C_BRAKE, sb, this.e);
    }
}
