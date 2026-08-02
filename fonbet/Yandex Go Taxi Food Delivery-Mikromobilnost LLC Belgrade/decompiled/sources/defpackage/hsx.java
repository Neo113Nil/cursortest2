package defpackage;

import android.location.Location;
import android.location.LocationManager;
import java.util.Arrays;
import ru.yandex.taxi.location.g;

/* loaded from: classes9.dex */
public final class hsx {
    public final g a;
    public final LocationManager b;
    public final ai4 c;

    public hsx(g gVar, LocationManager locationManager, ai4 ai4Var) {
        this.a = gVar;
        this.b = locationManager;
        this.c = ai4Var;
    }

    public final Location a() {
        jst.e.getClass();
        this.c.a("AndroidLocation::pickMostRelevantLocation", new Object[0]);
        LocationManager locationManager = this.b;
        Location location = null;
        Location lastKnownLocation = locationManager.isProviderEnabled("gps") ? locationManager.getLastKnownLocation("gps") : null;
        LocationManager locationManager2 = this.b;
        Location lastKnownLocation2 = locationManager2.isProviderEnabled("network") ? locationManager2.getLastKnownLocation("network") : null;
        LocationManager locationManager3 = this.b;
        for (Location location2 : scc.g(Arrays.copyOf(new Location[]{lastKnownLocation, lastKnownLocation2, locationManager3.isProviderEnabled("passive") ? locationManager3.getLastKnownLocation("passive") : null, this.a.o}, 4))) {
            if (wwg.u(location2, location)) {
                location = location2;
            }
        }
        return location;
    }
}
