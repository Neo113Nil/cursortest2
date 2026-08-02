package defpackage;

import com.yandex.go.order.external.unifiedpolling.dto.status.EatsOrderStatusDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class mfn {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = EatsOrderStatusDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
