package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class ht80 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OutMessage$MiniStoryIsShownEvent$MiniStoryNavigationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
