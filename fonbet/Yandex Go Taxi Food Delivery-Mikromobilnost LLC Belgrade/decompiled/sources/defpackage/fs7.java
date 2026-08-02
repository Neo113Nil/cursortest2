package defpackage;

import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.CameraPosition;
import com.yandex.mapkit.map.CameraUpdateReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class fs7 {
    public final CameraPosition a;
    public final CameraUpdateReason b;
    public final boolean c;

    public fs7(CameraPosition cameraPosition, CameraUpdateReason cameraUpdateReason, boolean z) {
        this.a = cameraPosition;
        this.b = cameraUpdateReason;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fs7)) {
            return false;
        }
        fs7 fs7Var = (fs7) obj;
        CameraPosition cameraPosition = fs7Var.a;
        CameraPosition cameraPosition2 = this.a;
        if (cameraPosition2.getZoom() != cameraPosition.getZoom()) {
            return false;
        }
        Point target = cameraPosition2.getTarget();
        Point target2 = cameraPosition.getTarget();
        return target.getLatitude() == target2.getLatitude() && target.getLongitude() == target2.getLongitude() && cameraPosition2.getAzimuth() == cameraPosition.getAzimuth() && cameraPosition2.getTilt() == cameraPosition.getTilt() && this.b == fs7Var.b && this.c == fs7Var.c;
    }

    public final int hashCode() {
        CameraPosition cameraPosition = this.a;
        int hashCode = Float.hashCode(cameraPosition.getZoom()) * 31;
        Point target = cameraPosition.getTarget();
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + ((Float.hashCode(cameraPosition.getTilt()) + ((Float.hashCode(cameraPosition.getAzimuth()) + ((Double.hashCode(target.getLongitude()) + (Double.hashCode(target.getLatitude()) * 31) + hashCode) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        CameraPosition cameraPosition = this.a;
        float zoom = cameraPosition.getZoom();
        Point target = cameraPosition.getTarget();
        double latitude = target.getLatitude();
        String c = nzs.c(oyr.u(latitude, "Point(latitude=", ", longitude="), target.getLongitude(), Extension.C_BRAKE);
        float azimuth = cameraPosition.getAzimuth();
        float tilt = cameraPosition.getTilt();
        StringBuilder sb = new StringBuilder("CameraPosition(zoom=");
        sb.append(zoom);
        sb.append(", target=");
        sb.append(c);
        sb.append(", azimuth=");
        String q = ly3.q(sb, azimuth, ", tilt=", tilt, Extension.C_BRAKE);
        StringBuilder sb2 = new StringBuilder("CameraPositionInfo(position=");
        sb2.append(q);
        sb2.append(", reason=");
        sb2.append(this.b);
        sb2.append(", finished=");
        return x4e.i(sb2, this.c, Extension.C_BRAKE);
    }
}
