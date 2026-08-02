package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m4z0 extends yau {
    public final FormattedText a;
    public final FormattedText b;
    public final FormattedText c;

    static {
        FormattedText formattedText = FormattedText.b;
    }

    public m4z0(FormattedText formattedText, FormattedText formattedText2, FormattedText formattedText3) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = formattedText3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m4z0)) {
            return false;
        }
        m4z0 m4z0Var = (m4z0) obj;
        return this.a.equals(m4z0Var.a) && jl40.l(this.b, m4z0Var.b) && jl40.l(this.c, m4z0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        FormattedText formattedText = this.b;
        int hashCode2 = (hashCode + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        FormattedText formattedText2 = this.c;
        return hashCode2 + (formattedText2 != null ? formattedText2.a.hashCode() : 0);
    }

    public final String toString() {
        return "TileAttributedHeaderModel(title=" + this.a + ", subtitle=" + this.b + ", trailTitle=" + this.c + Extension.C_BRAKE;
    }
}
