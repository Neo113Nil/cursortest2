package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.masstransit.model.RouteType;
import ru.yandex.taxi.masstransit.model.VariantStyle;

/* loaded from: classes6.dex */
public final class g631 {
    public final RouteType a;
    public final VariantStyle.VariantType b;
    public final String c;

    public g631(RouteType routeType, VariantStyle.VariantType variantType, String str) {
        this.a = routeType;
        this.b = variantType;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g631)) {
            return false;
        }
        g631 g631Var = (g631) obj;
        return this.a == g631Var.a && this.b == g631Var.b && jl40.l(this.c, g631Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VariantKey(routeType=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", imageTag=");
        return oyr.t(sb, this.c, Extension.C_BRAKE);
    }
}
