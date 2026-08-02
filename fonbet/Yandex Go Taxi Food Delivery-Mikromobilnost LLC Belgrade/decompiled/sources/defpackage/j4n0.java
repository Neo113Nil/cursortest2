package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.ScootersCard;

/* loaded from: classes13.dex */
public final class j4n0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersCard.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
