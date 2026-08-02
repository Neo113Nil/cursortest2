package defpackage;

import com.yandex.mob.api.model.MobAvailabilityCheckStrategyName;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class bm20 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MobAvailabilityCheckStrategyName.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
