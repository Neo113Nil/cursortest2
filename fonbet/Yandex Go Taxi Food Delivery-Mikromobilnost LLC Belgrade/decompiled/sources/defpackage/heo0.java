package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.ScootersPassesListServiceDto;

/* loaded from: classes6.dex */
public final class heo0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersPassesListServiceDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
