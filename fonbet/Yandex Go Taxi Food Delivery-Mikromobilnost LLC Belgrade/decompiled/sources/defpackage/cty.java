package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.payments.ListPaymentMethodDtoType;

/* loaded from: classes13.dex */
public final class cty {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ListPaymentMethodDtoType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
