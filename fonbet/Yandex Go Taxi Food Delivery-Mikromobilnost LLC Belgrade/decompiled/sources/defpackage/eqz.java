package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class eqz {
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final String d;
    public final toz e;

    public eqz(FormattedText formattedText, FormattedText formattedText2, String str, String str2, toz tozVar) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = str;
        this.d = str2;
        this.e = tozVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof eqz)) {
            return false;
        }
        eqz eqzVar = (eqz) obj;
        return jl40.l(this.a, eqzVar.a) && jl40.l(this.b, eqzVar.b) && jl40.l(this.c, eqzVar.c) && jl40.l(this.d, eqzVar.d) && jl40.l(this.e, eqzVar.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder r = n.r("LootBoxGiftEntity(title=", this.a, ", subtitle=", this.b, ", leadIconTag=");
        g8e.D(r, this.c, ", lootBoxIconTag=", this.d, ", action=");
        r.append(this.e);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
