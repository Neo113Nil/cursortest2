package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class i0g0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PurchaseTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
