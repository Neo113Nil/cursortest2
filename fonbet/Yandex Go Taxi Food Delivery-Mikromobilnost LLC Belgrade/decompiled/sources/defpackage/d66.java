package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.BluetoothError;

/* loaded from: classes5.dex */
public final class d66 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BluetoothError.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
