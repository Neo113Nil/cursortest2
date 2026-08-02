package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.PhotoType;

/* loaded from: classes13.dex */
public final class djb0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PhotoType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
