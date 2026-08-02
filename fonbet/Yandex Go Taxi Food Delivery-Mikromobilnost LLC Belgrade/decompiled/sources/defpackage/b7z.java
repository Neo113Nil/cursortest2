package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.LocationAvailabilityStatus;

/* loaded from: classes12.dex */
public final class b7z {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LocationAvailabilityStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
