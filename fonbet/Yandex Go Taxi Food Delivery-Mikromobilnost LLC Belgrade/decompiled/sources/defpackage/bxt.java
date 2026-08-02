package defpackage;

import android.location.GpsStatus;

/* loaded from: classes10.dex */
public final class bxt extends wlt {
    public final GpsStatus a;

    public bxt(GpsStatus gpsStatus) {
        this.a = gpsStatus;
        gpsStatus.getSatellites().iterator();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof bxt) {
            return this.a.equals(((bxt) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
