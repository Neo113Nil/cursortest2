package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.PassItemType;

/* loaded from: classes13.dex */
public final class dk90 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PassItemType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
