package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.CheckPaymentResponse$Result;

/* loaded from: classes12.dex */
public final class ahb {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CheckPaymentResponse$Result.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
