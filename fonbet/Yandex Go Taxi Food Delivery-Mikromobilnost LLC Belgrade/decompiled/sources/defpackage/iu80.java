package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$OpenUrl$UrlType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class iu80 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OutMessage$OpenUrl$UrlType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
