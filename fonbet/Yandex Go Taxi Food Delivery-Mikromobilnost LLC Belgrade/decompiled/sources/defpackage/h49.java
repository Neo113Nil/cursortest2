package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.cashback.models.response.CashbackTariffBadgeStyleDto;

/* loaded from: classes9.dex */
public final class h49 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CashbackTariffBadgeStyleDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
