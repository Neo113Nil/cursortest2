package defpackage;

import com.yandex.go.scooters.passes.model.PassPaymentType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class ek90 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PassPaymentType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
