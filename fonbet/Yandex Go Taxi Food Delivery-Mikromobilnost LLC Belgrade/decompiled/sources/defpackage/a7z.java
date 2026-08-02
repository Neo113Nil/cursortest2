package defpackage;

import kotlin.LazyThreadSafetyMode;
import kotlin.a;
import ru.yandex.taxi.eatskit.dto.LocationAvailabilityStatus;

@gsq0
/* loaded from: classes5.dex */
public final class a7z {
    public static final z6z Companion = new z6z();
    public static final i3y[] b = {a.b(LazyThreadSafetyMode.PUBLICATION, new o3z(7))};
    public final LocationAvailabilityStatus a;

    public /* synthetic */ a7z(int i, LocationAvailabilityStatus locationAvailabilityStatus) {
        if (1 == (i & 1)) {
            this.a = locationAvailabilityStatus;
        } else {
            qje.Z(i, 1, y6z.a.getDescriptor());
            throw null;
        }
    }

    public a7z(LocationAvailabilityStatus locationAvailabilityStatus) {
        this.a = locationAvailabilityStatus;
    }
}
