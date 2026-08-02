package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class bwb {
    public final FormattedText a;
    public final nsj b;
    public final FormattedText c;
    public final nsj d;

    public bwb(FormattedText formattedText, nsj nsjVar, FormattedText formattedText2, nsj nsjVar2) {
        this.a = formattedText;
        this.b = nsjVar;
        this.c = formattedText2;
        this.d = nsjVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bwb)) {
            return false;
        }
        bwb bwbVar = (bwb) obj;
        return this.a.equals(bwbVar.a) && jl40.l(this.b, bwbVar.b) && this.c.equals(bwbVar.c) && jl40.l(this.d, bwbVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        nsj nsjVar = this.b;
        int c = unr0.c((hashCode + (nsjVar == null ? 0 : nsjVar.hashCode())) * 31, 31, this.c.a);
        nsj nsjVar2 = this.d;
        return c + (nsjVar2 != null ? nsjVar2.hashCode() : 0);
    }

    public final String toString() {
        return "CityDiscoveryScreen(headerTitle=" + this.a + ", headerLeadImage=" + this.b + ", searchButtonTitle=" + this.c + ", searchButtonLeadImage=" + this.d + Extension.C_BRAKE;
    }
}
