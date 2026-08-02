package defpackage;

import com.yandex.go.walking.navigation.impl.ui.overlay.WaypointType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class h541 {
    public final WaypointType a;

    public h541(WaypointType waypointType) {
        this.a = waypointType;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h541) && this.a == ((h541) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "PinData(type=" + this.a + Extension.C_BRAKE;
    }
}
