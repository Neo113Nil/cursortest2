package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.BleError;

/* loaded from: classes14.dex */
public final class g26 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BleError.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
