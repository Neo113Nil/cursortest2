package defpackage;

import com.yandex.mapkit.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class d2r0 implements gr00 {
    public final Point a;
    public final float b;
    public final float c;
    public final float d;
    public final boolean e;

    public d2r0(Point point, float f, float f2, float f3, boolean z) {
        this.a = point;
        this.b = f;
        this.c = f2;
        this.d = f3;
        this.e = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d2r0)) {
            return false;
        }
        d2r0 d2r0Var = (d2r0) obj;
        return this.a.equals(d2r0Var.a) && Float.compare(this.b, d2r0Var.b) == 0 && Float.compare(this.c, d2r0Var.c) == 0 && Float.compare(this.d, d2r0Var.d) == 0 && this.e == d2r0Var.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + g8e.c(this.d, g8e.c(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetCameraPosition(point=");
        sb.append(this.a);
        sb.append(", zoom=");
        sb.append(this.b);
        sb.append(", azimuth=");
        vfc.x(sb, this.c, ", tilt=", this.d, ", animate=");
        return x4e.i(sb, this.e, Extension.C_BRAKE);
    }
}
