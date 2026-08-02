package defpackage;

import ru.yandex.taxi.analytics.LocationRequestAnalytics$ErrorReason;
import ru.yandex.taxi.analytics.LocationRequestAnalytics$Source;
import ru.yandex.taxi.analytics.LocationRequestAnalytics$Status;
import ru.yandex.taxi.systemrequeirements.location.LocationRequirementsException;
import ru.yandex.taxi.systemrequeirements.location.n;

/* loaded from: classes5.dex */
public final class lcz {
    public final reu a;
    public final n b;

    public lcz(reu reuVar, n nVar) {
        this.a = reuVar;
        this.b = nVar;
    }

    public final void a(LocationRequestAnalytics$Source locationRequestAnalytics$Source, mo21 mo21Var) {
        n nVar = this.b;
        if (nVar.b()) {
            c(locationRequestAnalytics$Source, LocationRequestAnalytics$ErrorReason.PERMISSION_NOT_GRANTED);
            return;
        }
        if (nVar.c()) {
            c(locationRequestAnalytics$Source, LocationRequestAnalytics$ErrorReason.LOCATION_SERVICE_NOT_AVAILABLE);
            return;
        }
        b1.n((b1) this.a.b, locationRequestAnalytics$Source.getValue(), LocationRequestAnalytics$Status.SUCCESS.getValue(), null, Long.valueOf(mo21Var.f), Double.valueOf(mo21Var.a), Double.valueOf(mo21Var.b), Double.valueOf(mo21Var.c), 4);
    }

    public final void b(LocationRequestAnalytics$Source locationRequestAnalytics$Source, Throwable th) {
        LocationRequestAnalytics$ErrorReason locationRequestAnalytics$ErrorReason;
        if (th instanceof LocationRequirementsException) {
            int i = kcz.a[((LocationRequirementsException) th).getFailureReason().ordinal()];
            if (i == 1) {
                locationRequestAnalytics$ErrorReason = LocationRequestAnalytics$ErrorReason.PERMISSION_NOT_GRANTED;
            } else {
                if (i != 2) {
                    w511.b();
                    return;
                }
                locationRequestAnalytics$ErrorReason = LocationRequestAnalytics$ErrorReason.LOCATION_SERVICE_NOT_AVAILABLE;
            }
        } else {
            locationRequestAnalytics$ErrorReason = LocationRequestAnalytics$ErrorReason.UNKNOWN;
        }
        c(locationRequestAnalytics$Source, locationRequestAnalytics$ErrorReason);
    }

    public final void c(LocationRequestAnalytics$Source locationRequestAnalytics$Source, LocationRequestAnalytics$ErrorReason locationRequestAnalytics$ErrorReason) {
        b1.n((b1) this.a.b, locationRequestAnalytics$Source.getValue(), LocationRequestAnalytics$Status.ERROR.getValue(), locationRequestAnalytics$ErrorReason.getValue(), null, null, null, null, 120);
    }
}
