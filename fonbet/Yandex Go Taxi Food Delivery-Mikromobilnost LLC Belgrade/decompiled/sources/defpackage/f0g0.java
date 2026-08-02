package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.PurchaseStatus;

/* loaded from: classes13.dex */
public final class f0g0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PurchaseStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
