package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes.dex */
public final class d4a {
    public final FormattedText a;
    public final String b;

    public d4a(String str, FormattedText formattedText) {
        this.a = formattedText;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d4a)) {
            return false;
        }
        d4a d4aVar = (d4a) obj;
        return jl40.l(this.a, d4aVar.a) && jl40.l(this.b, d4aVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "ChargersMultiOrderHeaderLabel(title=" + this.a + ", backgroundColor=" + this.b + Extension.C_BRAKE;
    }
}
