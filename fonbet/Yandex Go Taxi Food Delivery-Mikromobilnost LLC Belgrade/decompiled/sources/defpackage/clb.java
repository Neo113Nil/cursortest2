package defpackage;

import com.yandex.go.masstransit.sdk.client_api.data.dto.CheckoutOrderStatusDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class clb {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CheckoutOrderStatusDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
