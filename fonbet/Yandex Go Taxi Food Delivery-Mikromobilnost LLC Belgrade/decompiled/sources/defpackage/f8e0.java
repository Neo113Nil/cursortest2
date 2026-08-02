package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class f8e0 {
    public final String a;
    public final FormattedText b;
    public final FormattedText c;

    public f8e0(String str, FormattedText formattedText, FormattedText formattedText2) {
        this.a = str;
        this.b = formattedText;
        this.c = formattedText2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f8e0)) {
            return false;
        }
        f8e0 f8e0Var = (f8e0) obj;
        return jl40.l(this.a, f8e0Var.a) && jl40.l(this.b, f8e0Var.b) && jl40.l(this.c, f8e0Var.c);
    }

    public final int hashCode() {
        return this.c.a.hashCode() + unr0.c(this.a.hashCode() * 31, 31, this.b.a);
    }

    public final String toString() {
        return tse0.m(xvz.q("BulletModalUiState(imageTag=", this.a, ", title=", ", subtitle=", this.b), this.c, Extension.C_BRAKE);
    }
}
