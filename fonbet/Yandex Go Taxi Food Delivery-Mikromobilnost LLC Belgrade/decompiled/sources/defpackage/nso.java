package defpackage;

import com.yandex.mapkit.map.CameraUpdateReason;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class nso {
    public final uc4 a;
    public final CameraUpdateReason b;

    public nso(uc4 uc4Var, CameraUpdateReason cameraUpdateReason) {
        this.a = uc4Var;
        this.b = cameraUpdateReason;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nso)) {
            return false;
        }
        nso nsoVar = (nso) obj;
        return this.a.equals(nsoVar.a) && this.b == nsoVar.b;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ExplorationCameraState(bbox=" + this.a + ", reason=" + this.b + Extension.C_BRAKE;
    }
}
