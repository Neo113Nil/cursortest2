package defpackage;

import com.yandex.go.payments.acceptance.data.model.AcceptancePaymentStatus;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class df {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AcceptancePaymentStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
