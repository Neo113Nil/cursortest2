package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class k301 {
    public final FormattedText a;
    public final FormattedText b;
    public final c501 c;
    public final j301 d;

    public k301(FormattedText formattedText, FormattedText formattedText2, c501 c501Var, j301 j301Var) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = c501Var;
        this.d = j301Var;
    }

    public final j301 a() {
        return this.d;
    }

    public final FormattedText b() {
        return this.b;
    }

    public final FormattedText c() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k301)) {
            return false;
        }
        k301 k301Var = (k301) obj;
        return jl40.l(this.a, k301Var.a) && jl40.l(this.b, k301Var.b) && jl40.l(this.c, k301Var.c) && jl40.l(this.d, k301Var.d);
    }

    public final int hashCode() {
        FormattedText formattedText = this.a;
        int hashCode = (formattedText == null ? 0 : formattedText.a.hashCode()) * 31;
        FormattedText formattedText2 = this.b;
        int hashCode2 = (hashCode + (formattedText2 == null ? 0 : formattedText2.a.hashCode())) * 31;
        c501 c501Var = this.c;
        int hashCode3 = (hashCode2 + (c501Var == null ? 0 : c501Var.hashCode())) * 31;
        j301 j301Var = this.d;
        return hashCode3 + (j301Var != null ? j301Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = n.r("TrackingCardButton(title=", this.a, ", subtitle=", this.b, ", backgroundColor=");
        r.append(this.c);
        r.append(", action=");
        r.append(this.d);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
