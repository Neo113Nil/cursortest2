package defpackage;

import com.yandex.go.taxi.order.models.api.route.MapRouteAppearance$AnimationType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class hr00 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MapRouteAppearance$AnimationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
