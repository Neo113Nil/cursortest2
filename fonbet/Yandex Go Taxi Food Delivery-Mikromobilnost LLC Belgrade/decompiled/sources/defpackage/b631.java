package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.VehicleType;

/* loaded from: classes6.dex */
public final class b631 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = VehicleType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
