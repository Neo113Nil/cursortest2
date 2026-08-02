package defpackage;

import com.yandex.go.charity.models.OpenCharitySource;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class pza implements qza {
    public final Map a;
    public final OpenCharitySource b;
    public final String c;
    public final String d;

    public pza(OpenCharitySource openCharitySource, String str, String str2, Map map) {
        this.a = map;
        this.b = openCharitySource;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pza)) {
            return false;
        }
        pza pzaVar = (pza) obj;
        return jl40.l(this.a, pzaVar.a) && this.b == pzaVar.b && jl40.l(this.c, pzaVar.c) && jl40.l(this.d, pzaVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("WithCustomUrls(urlParams=");
        sb.append(this.a);
        sb.append(", source=");
        sb.append(this.b);
        sb.append(", baseUrl=");
        return g8e.r(sb, this.c, ", landingUrl=", this.d, Extension.C_BRAKE);
    }
}
