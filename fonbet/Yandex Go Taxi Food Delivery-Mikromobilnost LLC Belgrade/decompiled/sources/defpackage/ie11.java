package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.map_object.Trigger;

/* loaded from: classes5.dex */
public final class ie11 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Trigger.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
