package defpackage;

import com.yandex.mob.params.MobRemoteNotificationStatus;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class ar20 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MobRemoteNotificationStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
