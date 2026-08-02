package defpackage;

import com.yandex.mob.api.model.MobPingPolicy;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class hq20 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MobPingPolicy.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
