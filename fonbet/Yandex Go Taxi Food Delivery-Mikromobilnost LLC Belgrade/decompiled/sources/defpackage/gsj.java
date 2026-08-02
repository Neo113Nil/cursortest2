package defpackage;

import com.adjust.sdk.Constants;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class gsj {
    public final String a;
    public final String b;
    public final String c;
    public final MapBuilder d;

    public gsj(String str, String str2, String str3, int i) {
        str2 = (i & 2) != 0 ? null : str2;
        str3 = (i & 4) != 0 ? null : str3;
        this.a = str;
        this.b = str2;
        this.c = str3;
        MapBuilder y = qv10.y("type", str);
        if (str2 != null) {
            y.put(Constants.DEEPLINK, str2);
        }
        if (str3 != null) {
            y.put("url", str3);
        }
        this.d = y.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gsj)) {
            return false;
        }
        gsj gsjVar = (gsj) obj;
        return this.a.equals(gsjVar.a) && jl40.l(this.b, gsjVar.b) && jl40.l(this.c, gsjVar.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("OrganisationCardAction(type=", this.a, ", deeplink=", this.b, ", url="), this.c, Extension.C_BRAKE);
    }
}
