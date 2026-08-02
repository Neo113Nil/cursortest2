package defpackage;

import com.adjust.sdk.Constants;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class hbw0 {
    public final String a;
    public final String b;
    public final String c;
    public final MapBuilder d;

    public hbw0(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        MapBuilder y = qv10.y("image_tag", str);
        if (str2 != null) {
            y.put("action", str2);
        }
        if (str3 != null) {
            y.put(Constants.DEEPLINK, str3);
        }
        this.d = y.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbw0)) {
            return false;
        }
        hbw0 hbw0Var = (hbw0) obj;
        return jl40.l(this.a, hbw0Var.a) && jl40.l(this.b, hbw0Var.b) && jl40.l(this.c, hbw0Var.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return oyr.t(b64.v("SearchBarButton(imageTag=", this.a, ", action=", this.b, ", deeplink="), this.c, Extension.C_BRAKE);
    }
}
