package defpackage;

import com.yandex.go.pickup_from_photo.data.OrientationAccuracy;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class hbj {
    public final float a;
    public final float b;
    public final float c;
    public final long d;
    public final OrientationAccuracy e;

    public hbj(float f, float f2, float f3, OrientationAccuracy orientationAccuracy) {
        long currentTimeMillis = System.currentTimeMillis();
        this.a = f;
        this.b = f2;
        this.c = f3;
        this.d = currentTimeMillis;
        this.e = orientationAccuracy;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbj)) {
            return false;
        }
        hbj hbjVar = (hbj) obj;
        return Float.compare(this.a, hbjVar.a) == 0 && Float.compare(this.b, hbjVar.b) == 0 && Float.compare(this.c, hbjVar.c) == 0 && this.d == hbjVar.d && this.e == hbjVar.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + qv10.c(g8e.c(this.c, g8e.c(this.b, Float.hashCode(this.a) * 31, 31), 31), 31, this.d);
    }

    public final String toString() {
        StringBuilder k = oo31.k("DeviceOrientation(azimuth=", this.a, ", pitch=", this.b, ", roll=");
        k.append(this.c);
        k.append(", timestamp=");
        k.append(this.d);
        k.append(", accuracy=");
        k.append(this.e);
        k.append(Extension.C_BRAKE);
        return k.toString();
    }
}
