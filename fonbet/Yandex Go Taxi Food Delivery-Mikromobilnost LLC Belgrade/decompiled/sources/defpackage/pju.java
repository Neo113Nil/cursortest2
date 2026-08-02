package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes14.dex */
public final class pju {
    public final FormattedText a;
    public final String b;
    public final String c;

    public pju(String str, String str2, FormattedText formattedText) {
        this.a = formattedText;
        this.b = str;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pju)) {
            return false;
        }
        pju pjuVar = (pju) obj;
        return jl40.l(this.a, pjuVar.a) && jl40.l(this.b, pjuVar.b) && jl40.l(this.c, pjuVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.b(this.a.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HighlightTariffInfo(text=");
        sb.append(this.a);
        sb.append(", originalPrice=");
        sb.append(this.b);
        sb.append(", accessibility=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
