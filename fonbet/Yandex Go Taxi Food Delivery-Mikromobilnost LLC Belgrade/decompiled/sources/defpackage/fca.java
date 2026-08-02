package defpackage;

import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes12.dex */
public final class fca implements kca {
    public final FormattedText a;
    public final FormattedText b;
    public final kba c;
    public final hba d;
    public final String e;
    public final Map f;

    public fca(FormattedText formattedText, FormattedText formattedText2, kba kbaVar, hba hbaVar, String str, Map map) {
        this.a = formattedText;
        this.b = formattedText2;
        this.c = kbaVar;
        this.d = hbaVar;
        this.e = str;
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
        if (!(obj instanceof fca)) {
            return false;
        }
        fca fcaVar = (fca) obj;
        return this.a.equals(fcaVar.a) && this.b.equals(fcaVar.b) && this.c.equals(fcaVar.c) && this.d.equals(fcaVar.d) && jl40.l(this.e, fcaVar.e) && jl40.l(this.f, fcaVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + unr0.c(this.a.a.hashCode() * 31, 31, this.b.a)) * 31)) * 31;
        String str = this.e;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map map = this.f;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder r = n.r("Banner(title=", this.a, ", subtitle=", this.b, ", decoration=");
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
