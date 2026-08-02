package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.DebtStatus;

/* loaded from: classes13.dex */
public final class eug {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DebtStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
