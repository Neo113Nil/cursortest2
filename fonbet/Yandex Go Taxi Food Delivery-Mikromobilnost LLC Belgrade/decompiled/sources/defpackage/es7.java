package defpackage;

import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class es7 implements gr00 {
    public final Point a;
    public final Point b;
    public final boolean c;

    public es7(Point point, Point point2, boolean z) {
        this.a = point;
        this.b = point2;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof es7)) {
            return false;
        }
        es7 es7Var = (es7) obj;
        return this.a.equals(es7Var.a) && this.b.equals(es7Var.b) && this.c == es7Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraPosition(southWest=");
        sb.append(this.a);
        sb.append(", northEast=");
        sb.append(this.b);
        sb.append(", resetAzimuthAndTilt=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
