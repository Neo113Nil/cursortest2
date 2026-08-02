package defpackage;

import com.yandex.go.places.impl.data.entities.network.payments.PaymentStatus;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class cka0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PaymentStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
