package defpackage;

import java.util.ArrayList;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class hwa {
    public final int a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final ArrayList e;
    public final FormattedText f;
    public final FormattedText g;

    public hwa(int i, String str, FormattedText formattedText, FormattedText formattedText2, ArrayList arrayList, FormattedText formattedText3, FormattedText formattedText4) {
        this.a = i;
        this.b = str;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = arrayList;
        this.f = formattedText3;
        this.g = formattedText4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hwa)) {
            return false;
        }
        hwa hwaVar = (hwa) obj;
        return this.a == hwaVar.a && jl40.l(this.b, hwaVar.b) && jl40.l(this.c, hwaVar.c) && jl40.l(this.d, hwaVar.d) && this.e.equals(hwaVar.e) && jl40.l(this.f, hwaVar.f) && jl40.l(this.g, hwaVar.g);
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.a) * 31;
        String str = this.b;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.a);
        FormattedText formattedText = this.d;
        return this.g.a.hashCode() + unr0.c(ly3.b((c + (formattedText != null ? formattedText.a.hashCode() : 0)) * 31, 31, this.e), 31, this.f.a);
    }

    public final String toString() {
        StringBuilder v = unr0.v(this.a, "ChargersSurgeModal(percent=", ", imageTag=", this.b, ", title=");
        n.C(v, this.c, ", subtitle=", this.d, ", items=");
        v.append(this.e);
        v.append(", info=");
        v.append(this.f);
        v.append(", number=");
        return tse0.m(v, this.g, Extension.C_BRAKE);
    }
}
