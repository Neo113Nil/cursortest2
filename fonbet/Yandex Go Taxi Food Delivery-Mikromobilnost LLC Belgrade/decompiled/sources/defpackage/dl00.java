package defpackage;

import com.yandex.mapkit.location.Location;
import com.yandex.mapkit.location.LocationListener;
import com.yandex.mapkit.location.LocationStatus;
import kotlinx.coroutines.channels.b;

/* loaded from: classes15.dex */
public final class dl00 implements LocationListener {
    public final y6f0 a;

    public dl00(y6f0 y6f0Var) {
        this.a = y6f0Var;
    }

    @Override // com.yandex.mapkit.location.LocationListener
    public final void onLocationStatusUpdated(LocationStatus locationStatus) {
    }

    @Override // com.yandex.mapkit.location.LocationListener
    public final void onLocationUpdated(Location location) {
        b.c(this.a, d6z.N(location));
    }
}
