package defpackage;

import com.yandex.go.taxi.order.models.api.deeplink.TaxiOrderDeeplink$PreferredScreenType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class j0y0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TaxiOrderDeeplink$PreferredScreenType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
