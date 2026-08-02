package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.ProductDto$Details$Type;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class g8f0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ProductDto$Details$Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
