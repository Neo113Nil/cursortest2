package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.model.MtPositionOverMap;

/* loaded from: classes6.dex */
public final class es30 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MtPositionOverMap.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
