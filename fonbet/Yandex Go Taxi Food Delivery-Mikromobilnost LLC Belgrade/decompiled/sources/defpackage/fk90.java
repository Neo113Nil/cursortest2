package defpackage;

import com.yandex.go.chargers.offer.passes.data.model.PassPaymentType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class fk90 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PassPaymentType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
