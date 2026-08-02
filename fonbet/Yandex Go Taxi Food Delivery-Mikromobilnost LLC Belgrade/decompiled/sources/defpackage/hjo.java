package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.EvolveState;

/* loaded from: classes6.dex */
public final class hjo {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = EvolveState.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
