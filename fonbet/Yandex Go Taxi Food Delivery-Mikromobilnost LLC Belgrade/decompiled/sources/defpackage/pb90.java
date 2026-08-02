package defpackage;

import kotlin.collections.builders.MapBuilder;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class pb90 {
    public final double a;
    public final double b;
    public final MapBuilder c;

    public pb90(double d, double d2) {
        this.a = d;
        this.b = d2;
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.put("lat", Double.valueOf(d));
        this.c = x4e.w(d2, mapBuilder, "lon");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof pb90)) {
            return false;
        }
        pb90 pb90Var = (pb90) obj;
        return Double.compare(this.a, pb90Var.a) == 0 && Double.compare(this.b, pb90Var.b) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.b) + (Double.hashCode(this.a) * 31);
    }

    public final String toString() {
        return nzs.c(oyr.u(this.a, "GeoPoint(lat=", ", lon="), this.b, Extension.C_BRAKE);
    }
}
