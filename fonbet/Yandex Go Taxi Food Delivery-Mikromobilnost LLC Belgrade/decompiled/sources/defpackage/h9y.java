package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class h9y {
    public final String a;
    public final Boolean b;
    public final i9y c;
    public final String d;
    public final MapBuilder e;

    public h9y(String str, Boolean bool, i9y i9yVar, String str2) {
        this.a = str;
        this.b = bool;
        this.c = i9yVar;
        this.d = str2;
        MapBuilder y = qv10.y("addressName", str);
        if (bool != null) {
            y.put("final", bool);
        }
        if (i9yVar != null) {
            y.put("coordinate", i9yVar.d);
        }
        if (str2 != null) {
            y.put("method", str2);
        }
        this.e = y.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h9y)) {
            return false;
        }
        h9y h9yVar = (h9y) obj;
        return jl40.l(this.a, h9yVar.a) && jl40.l(this.b, h9yVar.b) && jl40.l(this.c, h9yVar.c) && jl40.l(this.d, h9yVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Boolean bool = this.b;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        i9y i9yVar = this.c;
        int hashCode3 = (hashCode2 + (i9yVar == null ? 0 : i9yVar.hashCode())) * 31;
        String str = this.d;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        return "LegacySuggestAddress(addressName=" + this.a + ", final=" + this.b + ", coordinate=" + this.c + ", method=" + this.d + Extension.C_BRAKE;
    }
}
