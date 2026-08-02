package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.yandexmaps.multiplatform.pin.war.PinWarGeometryEasing;

/* loaded from: classes7.dex */
public final class n1c0 {
    public static final n1c0 e = new n1c0(0.2f, 5.0d, 1.0E-6d, PinWarGeometryEasing.EASE_OUT);
    public final float a;
    public final double b;
    public final double c;
    public final PinWarGeometryEasing d;

    public n1c0(float f, double d, double d2, PinWarGeometryEasing pinWarGeometryEasing) {
        this.a = f;
        this.b = d;
        this.c = d2;
        this.d = pinWarGeometryEasing;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n1c0)) {
            return false;
        }
        n1c0 n1c0Var = (n1c0) obj;
        return Float.compare(this.a, n1c0Var.a) == 0 && Double.compare(this.b, n1c0Var.b) == 0 && Double.compare(this.c, n1c0Var.c) == 0 && this.d == n1c0Var.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + unr0.a(unr0.a(Float.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PinWarAnimationConfig(showAnimationDurationSeconds=");
        sb.append(this.a);
        sb.append(", maxAnimatedDistance=");
        sb.append(this.b);
        nzs.o(sb, ", minAnimatedDistance=", this.c, ", geometryEasing=");
        sb.append(this.d);
        sb.append(Extension.C_BRAKE);
        return sb.toString();
    }
}
