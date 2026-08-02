package xsna;

import com.google.android.gms.maps.model.LatLng;

/* compiled from: SphericalMercatorProjection.java */
/* loaded from: classes13.dex */
public final class lkk0 {
    public final double a;

    public lkk0(double d) {
        this.a = d;
    }

    public final LatLng a(ilb0 ilb0Var) {
        double d = ilb0Var.a;
        double d2 = this.a;
        return new LatLng(90.0d - Math.toDegrees(Math.atan(Math.exp(((-(0.5d - (ilb0Var.b / d2))) * 2.0d) * 3.141592653589793d)) * 2.0d), ((d / d2) - 0.5d) * 360.0d);
    }

    public final dlb0 b(LatLng latLng) {
        double d = (latLng.c / 360.0d) + 0.5d;
        double sin = Math.sin(Math.toRadians(latLng.b));
        double log = ((Math.log((sin + 1.0d) / (1.0d - sin)) * 0.5d) / (-6.283185307179586d)) + 0.5d;
        double d2 = this.a;
        return new dlb0(d * d2, log * d2);
    }
}
