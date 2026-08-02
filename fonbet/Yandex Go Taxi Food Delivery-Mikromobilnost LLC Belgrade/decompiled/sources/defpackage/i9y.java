package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class i9y {
    public final double a;
    public final double b;
    public final Double c;
    public final MapBuilder d;

    public i9y(double d, double d2, Double d3) {
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
        if (!(obj instanceof i9y)) {
            return false;
        }
        i9y i9yVar = (i9y) obj;
        return Double.compare(this.a, i9yVar.a) == 0 && Double.compare(this.b, i9yVar.b) == 0 && this.c.equals(i9yVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + unr0.a(Double.hashCode(this.a) * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder u = oyr.u(this.a, "LegacySuggestCoordinate(lat=", ", lon=");
        u.append(this.b);
        u.append(", accuracy=");
        u.append(this.c);
        u.append(Extension.C_BRAKE);
        return u.toString();
    }
}
