package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PurchaseStatusTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class h0g0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PurchaseStatusTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
