package defpackage;

import com.yandex.go.feed_video.actions.models.StreamTypeDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class nru0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = StreamTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
