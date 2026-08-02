package defpackage;

import com.yandex.go.places.models.data.entities.network.DeliveryPointTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class iki {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = DeliveryPointTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
