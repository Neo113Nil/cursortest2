package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class ica implements kca {
    public final FormattedText a;
    public final FormattedText b;
    public final String c;
    public final hba d;
    public final String e;
    public final Map f;

    public ica(FormattedText formattedText, FormattedText formattedText2, String str, hba hbaVar, String str2, Map map) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = str;
        this.d = hbaVar;
        this.e = str2;
        this.f = map;
    }

    @Override // defpackage.kca
    public final String a() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ica)) {
            return false;
        }
        ica icaVar = (ica) obj;
        return this.a.equals(icaVar.a) && this.b.equals(icaVar.b) && jl40.l(this.c, icaVar.c) && this.d.equals(icaVar.d) && jl40.l(this.e, icaVar.e) && jl40.l(this.f, icaVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + unr0.b(unr0.c(this.a.a.hashCode() * 31, 31, this.b.a), 31, this.c)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = n.r("ListItem(title=", this.a, ", subtitle=", this.b, ", leadIconTag=");
        r.append(this.c);
        r.append(", action=");
        r.append(this.d);
        r.append(", modeId=");
        r.append(this.e);
        r.append(", analyticsPayload=");
        r.append(this.f);
        r.append(Extension.C_BRAKE);
        return r.toString();
    }
}
