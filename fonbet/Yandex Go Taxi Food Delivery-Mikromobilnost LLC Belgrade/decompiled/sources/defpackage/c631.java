package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.trains.checkout.model.VehicleTypeType;

/* loaded from: classes6.dex */
public final class c631 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = VehicleTypeType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
