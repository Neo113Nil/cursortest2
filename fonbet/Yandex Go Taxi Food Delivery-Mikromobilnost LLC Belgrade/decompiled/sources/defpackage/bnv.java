package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$PurchaseProductClick$Type;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class bnv {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = InMessage$PurchaseProductClick$Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
