package defpackage;

import com.yandex.go.taxi.order.models.api.status.ScreenType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class kfp0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ScreenType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
