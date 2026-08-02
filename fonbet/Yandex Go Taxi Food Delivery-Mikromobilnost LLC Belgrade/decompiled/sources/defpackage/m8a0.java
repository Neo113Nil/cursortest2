package defpackage;

import com.yandex.go.payments.cards.domainverification.data.PaymentMethodVerificationStatus;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class m8a0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PaymentMethodVerificationStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
