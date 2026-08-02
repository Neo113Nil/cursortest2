package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$StoryNavigationType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class mnv {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = InMessage$StoryIsVisibleEvent$StoryNavigationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
