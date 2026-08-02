package defpackage;

import com.yandex.go.notifications.acknowledge.data.model.PushAckStatus;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class o0g0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PushAckStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
