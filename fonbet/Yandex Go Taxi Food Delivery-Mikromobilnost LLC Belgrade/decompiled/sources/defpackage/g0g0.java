package defpackage;

import com.yandex.go.chargers.offer.passes.data.model.PurchaseStatus;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class g0g0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PurchaseStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
