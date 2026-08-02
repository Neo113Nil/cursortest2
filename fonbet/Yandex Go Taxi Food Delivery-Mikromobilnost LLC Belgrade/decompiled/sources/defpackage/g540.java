package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes6.dex */
public final class g540 {
    public final String a;
    public final String b;
    public final FormattedText c;
    public final FormattedText d;
    public final String e;
    public final x051 f;
    public final Map g;
    public final String h;

    public g540(String str, String str2, FormattedText formattedText, FormattedText formattedText2, String str3, x051 x051Var, Map map, String str4) {
        this.a = str;
        this.b = str2;
        this.c = formattedText;
        this.d = formattedText2;
        this.e = str3;
        this.f = x051Var;
        this.g = map;
        this.h = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g540)) {
            return false;
        }
        g540 g540Var = (g540) obj;
        return jl40.l(this.a, g540Var.a) && jl40.l(this.b, g540Var.b) && jl40.l(this.c, g540Var.c) && jl40.l(this.d, g540Var.d) && jl40.l(this.e, g540Var.e) && this.f.equals(g540Var.f) && jl40.l(this.g, g540Var.g) && jl40.l(this.h, g540Var.h);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int c = unr0.c((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c.a);
        FormattedText formattedText = this.d;
        int hashCode2 = (c + (formattedText == null ? 0 : formattedText.a.hashCode())) * 31;
        String str2 = this.e;
        int hashCode3 = (this.f.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        Map map = this.g;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        String str3 = this.h;
        return hashCode4 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("MtSummaryPromotion(id=", this.a, ", metaType=", this.b, ", title=");
        n.C(v, this.c, ", text=", this.d, ", iconUrl=");
        v.append(this.e);
        v.append(", widget=");
        v.append(this.f);
        v.append(", analyticsPayload=");
        v.append(this.g);
        v.append(", routeId=");
        v.append(this.h);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
