package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$StoryIsVisibleEvent$MiniStoryControlType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class lnv {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = InMessage$StoryIsVisibleEvent$MiniStoryControlType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
