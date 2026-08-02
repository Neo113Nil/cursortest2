package defpackage;

import com.yandex.mapkit.maps.core.geometry.Point;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class l8c implements q1c0 {
    public final Point a;
    public final float b;
    public final float c;
    public final float w;

    public l8c(Point point, float f, float f2, float f3) {
        this.a = point;
        this.b = f;
        this.c = f2;
        this.w = f3;
    }

    @Override // defpackage.q1c0
    public final float a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l8c)) {
            return false;
        }
        l8c l8cVar = (l8c) obj;
        return jl40.l(this.a, l8cVar.a) && Float.compare(this.b, l8cVar.b) == 0 && Float.compare(this.c, l8cVar.c) == 0 && Float.compare(this.w, l8cVar.w) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.w) + g8e.c(this.c, g8e.c(this.b, this.a.hashCode() * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ClusteringFrameCameraPosition(target=");
        sb.append(this.a);
        sb.append(", zoom=");
        sb.append(this.b);
        sb.append(", azimuth=");
        return ly3.q(sb, this.c, ", tilt=", this.w, Extension.C_BRAKE);
    }
}
