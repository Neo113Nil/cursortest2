package defpackage;

import com.yandex.go.taxi.order.models.api.response.TimelineAdditionalOrderOption$AdditionalOrderOptionState;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class b9z0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TimelineAdditionalOrderOption$AdditionalOrderOptionState.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
