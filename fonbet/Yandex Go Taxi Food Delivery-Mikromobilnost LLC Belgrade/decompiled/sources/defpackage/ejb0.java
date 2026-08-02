package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class ejb0 {
    public final String a;
    public final FormattedText b;
    public final String c;
    public final String d;

    public ejb0(String str, String str2, String str3, FormattedText formattedText) {
        this.a = str;
        this.b = formattedText;
        this.c = str2;
        this.d = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ejb0)) {
            return false;
        }
        ejb0 ejb0Var = (ejb0) obj;
        return jl40.l(this.a, ejb0Var.a) && this.b.equals(ejb0Var.b) && jl40.l(this.c, ejb0Var.c) && jl40.l(this.d, ejb0Var.d);
    }

    public final int hashCode() {
        int c = unr0.c(this.a.hashCode() * 31, 31, this.b.a);
        String str = this.c;
        int hashCode = (c + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(xvz.q("PhotoUploadEulaContent(eulaId=", this.a, ", content=", ", selfieButtonText=", this.b), this.c, ", galleryButtonText=", this.d, Extension.C_BRAKE);
    }
}
