package defpackage;

import com.yandex.mapkit.maps.core.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class k2c0 implements j2c0 {
    public final Point a;
    public final Point b;
    public final Point c;
    public final Point d;

    public k2c0(Point point, Point point2, Point point3, Point point4) {
        this.a = point;
        this.b = point2;
        this.c = point3;
        this.d = point4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2c0)) {
            return false;
        }
        k2c0 k2c0Var = (k2c0) obj;
        return this.a.equals(k2c0Var.a) && this.b.equals(k2c0Var.b) && this.c.equals(k2c0Var.c) && this.d.equals(k2c0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "PinWarVisibleRegionImpl(topLeft=" + this.a + ", topRight=" + this.b + ", bottomLeft=" + this.c + ", bottomRight=" + this.d + Extension.C_BRAKE;
    }
}
