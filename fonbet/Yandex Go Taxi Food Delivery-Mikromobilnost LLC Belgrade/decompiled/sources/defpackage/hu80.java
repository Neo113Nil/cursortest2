package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$OpenUrl$OpenType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class hu80 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OutMessage$OpenUrl$OpenType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
