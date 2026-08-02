package defpackage;

import com.adjust.sdk.Constants;
import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class fsj {
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final MapBuilder e;

    public fsj(String str, String str2, String str3, String str4) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("oid", str);
        mapBuilder.put("type", str2);
        if (str3 != null) {
            mapBuilder.put(Constants.DEEPLINK, str3);
        }
        if (str4 != null) {
            mapBuilder.put("review_text", str4);
        }
        this.e = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsj)) {
            return false;
        }
        fsj fsjVar = (fsj) obj;
        return jl40.l(this.a, fsjVar.a) && jl40.l(this.b, fsjVar.b) && jl40.l(this.c, fsjVar.c) && jl40.l(this.d, fsjVar.d);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        int hashCode = (b + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        return g8e.r(b64.v("DiscoveryPinElement(oid=", this.a, ", type=", this.b, ", deeplink="), this.c, ", reviewText=", this.d, Extension.C_BRAKE);
    }
}
