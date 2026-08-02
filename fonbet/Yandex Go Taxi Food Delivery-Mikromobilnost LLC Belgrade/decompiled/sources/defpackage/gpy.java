package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.linked_order.models.net.dto.LinkedOrderStatusDto;

/* loaded from: classes5.dex */
public final class gpy {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LinkedOrderStatusDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
