package defpackage;

import com.yandex.go.scooters.promotions.api.data.model.ScootersPromotionsScreen;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class doo0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScootersPromotionsScreen.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
