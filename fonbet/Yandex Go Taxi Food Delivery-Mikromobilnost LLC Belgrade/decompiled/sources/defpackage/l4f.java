package defpackage;

import java.util.Map;
import java.util.UUID;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes5.dex */
public final class l4f {
    public final String a;
    public final UUID b;
    public final String c;
    public final Map d;

    public l4f(String str, UUID uuid, String str2, Map map) {
        this.a = str;
        this.b = uuid;
        this.c = str2;
        this.d = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l4f)) {
            return false;
        }
        l4f l4fVar = (l4f) obj;
        return jl40.l(this.a, l4fVar.a) && jl40.l(this.b, l4fVar.b) && jl40.l(this.c, l4fVar.c) && jl40.l(this.d, l4fVar.d);
    }

    public final int hashCode() {
        int b = unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 961, this.c);
        Map map = this.d;
        return b + (map == null ? 0 : map.hashCode());
    }

    public final String toString() {
        return "CreateDeliveryParams(offerId=" + this.a + ", localUUID=" + this.b + ", tariff=" + this.c + ", paymentPointId=null, tariffRequirements=" + this.d + Extension.C_BRAKE;
    }
}
