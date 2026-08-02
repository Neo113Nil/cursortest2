package defpackage;

import com.yandex.go.taxi.order.models.api.response.CardType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class np8 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CardType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
