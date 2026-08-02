package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.plus.api.dto.state.subscription.SubscriptionStatusDto;

/* loaded from: classes9.dex */
public final class o1v0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SubscriptionStatusDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
