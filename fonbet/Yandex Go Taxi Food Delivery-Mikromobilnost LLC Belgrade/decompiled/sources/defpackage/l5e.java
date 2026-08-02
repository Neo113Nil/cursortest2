package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.ConnectionStatus;

/* loaded from: classes14.dex */
public final class l5e {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ConnectionStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
