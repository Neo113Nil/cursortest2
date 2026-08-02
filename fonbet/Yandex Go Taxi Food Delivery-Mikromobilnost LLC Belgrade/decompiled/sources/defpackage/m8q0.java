package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class m8q0 {
    public final String a;
    public final sbv b;
    public final FormattedText c;
    public final FormattedText d;
    public final r9x0 e;
    public final String f;
    public final sbv g;

    public m8q0(String str, sbv sbvVar, FormattedText formattedText, FormattedText formattedText2, r9x0 r9x0Var, String str2, sbv sbvVar2) {
        this.a = str;
        this.b = sbvVar;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = r9x0Var;
        this.f = str2;
        this.g = sbvVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m8q0)) {
            return false;
        }
        m8q0 m8q0Var = (m8q0) obj;
        return jl40.l(this.a, m8q0Var.a) && jl40.l(this.b, m8q0Var.b) && jl40.l(this.c, m8q0Var.c) && this.d.equals(m8q0Var.d) && jl40.l(this.e, m8q0Var.e) && jl40.l(this.f, m8q0Var.f) && jl40.l(this.g, m8q0Var.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        sbv sbvVar = this.b;
        int hashCode2 = (hashCode + (sbvVar == null ? 0 : sbvVar.hashCode())) * 31;
        FormattedText formattedText = this.c;
        int c = unr0.c((hashCode2 + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31, 31, this.d.a);
        r9x0 r9x0Var = this.e;
        int b = unr0.b((c + (r9x0Var == null ? 0 : r9x0Var.hashCode())) * 31, 31, this.f);
        sbv sbvVar2 = this.g;
        return b + (sbvVar2 != null ? sbvVar2.hashCode() : 0);
    }

    public final String toString() {
        return "FullsizePopup(id=" + this.a + ", leadIcon=" + this.b + ", title=" + this.c + ", subtitle=" + this.d + ", action=" + this.e + ", backgroundColor=" + this.f + ", closeIcon=" + this.g + Extension.C_BRAKE;
    }
}
