package defpackage;

import android.location.Location;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationResult;

/* loaded from: classes6.dex */
public abstract class ett extends LocationCallback implements iy60 {
    public abstract void a(Location location);

    public abstract void b(Exception exc);

    @Override // defpackage.iy60
    public final void onFailure(Exception exc) {
        jst.e.k(exc, "Failure while trying to get Google fused location");
        b(exc);
    }

    @Override // com.google.android.gms.location.LocationCallback
    public final void onLocationResult(LocationResult locationResult) {
        Location location = null;
        for (Location location2 : locationResult.getLocations()) {
            if (wwg.u(location2, location)) {
                location = location2;
            }
        }
        unr0.C(new Object[]{location}, 1, "Got Google fused location %s", jst.e);
        if (location == null) {
            return;
        }
        a(location);
    }
}
