package defpackage;

import android.hardware.Sensor;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class nwc implements pwc {
    public final Sensor a;

    public /* synthetic */ nwc(Sensor sensor) {
        this.a = sensor;
    }

    public static final /* synthetic */ nwc a(Sensor sensor) {
        return new nwc(sensor);
    }

    public final /* synthetic */ Sensor b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof nwc) {
            return this.a.equals(((nwc) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "RotationVector(rotationVectorSensor=" + this.a + Extension.C_BRAKE;
    }
}
