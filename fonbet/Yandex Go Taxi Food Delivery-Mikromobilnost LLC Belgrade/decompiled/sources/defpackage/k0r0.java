package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.SessionOfferType;

/* loaded from: classes6.dex */
public final class k0r0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SessionOfferType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
