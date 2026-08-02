package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.YbDepositType;

/* loaded from: classes13.dex */
public final class nr51 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = YbDepositType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
