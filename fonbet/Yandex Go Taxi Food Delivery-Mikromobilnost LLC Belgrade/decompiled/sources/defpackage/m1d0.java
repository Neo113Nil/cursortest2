package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

@gsq0
/* loaded from: classes9.dex */
public final class m1d0 implements go11 {
    public static final l1d0 Companion = new l1d0();
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final String d;

    public /* synthetic */ m1d0(int i, String str, String str2, FormattedText formattedText, FormattedText formattedText2) {
        if (15 != (i & 15)) {
            qje.Z(i, 15, k1d0.a.getDescriptor());
            throw null;
        }
        this.a = formattedText;
        this.b = formattedText2;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1d0)) {
            return false;
        }
        m1d0 m1d0Var = (m1d0) obj;
        return jl40.l(this.a, m1d0Var.a) && jl40.l(this.b, m1d0Var.b) && jl40.l(this.c, m1d0Var.c) && jl40.l(this.d, m1d0Var.d);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        FormattedText formattedText2 = this.b;
        int hashCode2 = (hashCode + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(n.r("PlusBurnsTypedScreenDto(title=", this.a, ", text=", this.b, ", backroundImageUrl="), this.c, ", imageUrl=", this.d, Extension.C_BRAKE);
    }
}
