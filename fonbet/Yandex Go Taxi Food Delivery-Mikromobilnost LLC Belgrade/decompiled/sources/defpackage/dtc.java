package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.promo.CommunicationType;

/* loaded from: classes6.dex */
public final class dtc {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CommunicationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
