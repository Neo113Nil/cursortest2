package defpackage;

import com.yandex.go.taxi.order.models.api.response.driver.RideCardDriverState;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class kik0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RideCardDriverState.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
