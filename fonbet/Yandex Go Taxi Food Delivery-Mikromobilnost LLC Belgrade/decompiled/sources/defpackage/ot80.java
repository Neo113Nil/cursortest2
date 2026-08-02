package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$NeedAuthorization$Reason;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class ot80 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OutMessage$NeedAuthorization$Reason.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
