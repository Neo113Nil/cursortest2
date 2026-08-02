package defpackage;

import com.yandex.go.taxi.order.models.api.ChangeOrderState$Source;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class lc9 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ChangeOrderState$Source.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
