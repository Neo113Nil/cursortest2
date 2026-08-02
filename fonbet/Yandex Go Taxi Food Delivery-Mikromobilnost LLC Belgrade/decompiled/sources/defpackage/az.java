package defpackage;

import com.yandex.go.taxi.order.models.api.status.ActionType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class az {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
