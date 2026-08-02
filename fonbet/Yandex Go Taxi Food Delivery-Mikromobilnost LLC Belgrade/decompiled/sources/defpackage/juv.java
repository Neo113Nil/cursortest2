package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final class juv {
    public final String a;
    public final FormattedText b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public juv(String str, String str2, String str3, String str4, String str5, FormattedText formattedText) {
        this.a = str;
        this.b = formattedText;
        this.c = str2;
        this.d = str3;
        this.e = str4;
        this.f = str5;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof juv)) {
            return false;
        }
        juv juvVar = (juv) obj;
        return jl40.l(this.a, juvVar.a) && jl40.l(this.b, juvVar.b) && jl40.l(this.c, juvVar.c) && jl40.l(this.d, juvVar.d) && jl40.l(this.e, juvVar.e) && jl40.l(this.f, juvVar.f);
    }

    public final int hashCode() {
        return this.f.hashCode() + unr0.b(unr0.b(unr0.b(unr0.c(this.a.hashCode() * 31, 31, this.b.a), 31, this.c), 31, this.d), 31, this.e);
    }

    public final String toString() {
        StringBuilder q = xvz.q("InformationModel(title=", this.a, ", text=", ", iconUrl=", this.b);
        g8e.D(q, this.c, ", buttonTitle=", this.d, ", buttonBackground=");
        return g8e.r(q, this.e, ", buttonTextColor=", this.f, Extension.C_BRAKE);
    }
}
