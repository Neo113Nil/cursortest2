package defpackage;

import android.location.Location;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class o9z {
    public final Location a;
    public final Map b;

    public o9z(Location location, Map map) {
        this.a = location;
        this.b = map;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o9z)) {
            return false;
        }
        o9z o9zVar = (o9z) obj;
        return this.a.equals(o9zVar.a) && this.b.equals(o9zVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "LocationLastLocation(location=" + this.a + ", tags=" + this.b + Extension.C_BRAKE;
    }
}
