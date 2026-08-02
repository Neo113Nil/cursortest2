package defpackage;

import android.hardware.Sensor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class lwc implements pwc {
    public final Sensor a;

    public /* synthetic */ lwc(Sensor sensor) {
        this.a = sensor;
    }

    public static final /* synthetic */ lwc a(Sensor sensor) {
        return new lwc(sensor);
    }

    public final /* synthetic */ Sensor b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof lwc) {
            return this.a.equals(((lwc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "GeomagneticRotationVector(geomagneticRotationVectorSensor=" + this.a + Extension.C_BRAKE;
    }
}
