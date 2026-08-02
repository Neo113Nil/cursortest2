package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.BleErrorCode;

/* loaded from: classes14.dex */
public final class h26 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BleErrorCode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
