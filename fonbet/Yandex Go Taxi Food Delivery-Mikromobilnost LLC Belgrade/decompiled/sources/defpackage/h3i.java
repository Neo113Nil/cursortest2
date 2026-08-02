package defpackage;

import java.util.Map;

/* loaded from: classes5.dex */
public final class h3i {
    public final String a;
    public final String b;
    public final Map c;

    public h3i(String str, String str2, Map map) {
        this.a = str;
        this.b = str2;
        this.c = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h3i)) {
            return false;
        }
        h3i h3iVar = (h3i) obj;
        return jl40.l(this.a, h3iVar.a) && jl40.l(this.b, h3iVar.b) && jl40.l(this.c, h3iVar.c);
    }

    public final int hashCode() {
        int b = unr0.b(this.a.hashCode() * 31, 31, this.b);
        Map map = this.c;
        return (b + (map == null ? 0 : map.hashCode())) * 31;
    }

    public final String toString() {
        return b64.r(b64.v("CreateLogisticsOrderPayload(offerId=", this.a, ", tariff=", this.b, ", tariffRequirements="), this.c, ", payerId=null)");
    }
}
