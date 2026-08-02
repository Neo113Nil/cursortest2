package defpackage;

import com.yandex.mapkit.geometry.PolylinePosition;

/* loaded from: classes6.dex */
public final class ix4 {
    public final double a;
    public final Object b;

    public ix4(double d, String str) {
        this.a = d;
        this.b = str;
    }

    public double a() {
        return this.a;
    }

    public String b() {
        return (String) this.b;
    }

    public ix4(PolylinePosition polylinePosition, double d) {
        this.b = polylinePosition;
        this.a = d;
    }
}
