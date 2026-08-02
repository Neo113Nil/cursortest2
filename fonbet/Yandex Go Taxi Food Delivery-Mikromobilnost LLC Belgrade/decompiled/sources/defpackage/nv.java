package defpackage;

import com.yandex.go.places.models.data.entities.network.ActionDto$OpenNavigatorActionSubtypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class nv {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ActionDto$OpenNavigatorActionSubtypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
