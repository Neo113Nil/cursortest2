package defpackage;

import com.yandex.go.net.taxi.dto.response.CanMakeMoreOrders;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class nu7 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CanMakeMoreOrders.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
