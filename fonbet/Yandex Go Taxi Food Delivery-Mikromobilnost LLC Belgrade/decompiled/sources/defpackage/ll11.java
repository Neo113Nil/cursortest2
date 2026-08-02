package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.Type;

/* loaded from: classes9.dex */
public final class ll11 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
