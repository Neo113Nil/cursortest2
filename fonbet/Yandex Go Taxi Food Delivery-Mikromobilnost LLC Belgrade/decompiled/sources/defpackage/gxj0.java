package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class gxj0 {
    public final double a;
    public final double b;
    public final Double c;
    public final MapBuilder d;

    public gxj0(double d, double d2, Double d3) {
        this.a = d;
        this.b = d2;
        this.c = d3;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("lat", Double.valueOf(d));
        mapBuilder.put("lon", Double.valueOf(d2));
        mapBuilder.put("accuracy", d3);
        this.d = mapBuilder.j();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gxj0)) {
            return false;
        }
        gxj0 gxj0Var = (gxj0) obj;
        return Double.compare(this.a, gxj0Var.a) == 0 && Double.compare(this.b, gxj0Var.b) == 0 && this.c.equals(gxj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "RestrictedAreaCoordinateV2(lat=", ", lon=");
        u.append(this.b);
        u.append(", accuracy=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
