package defpackage;

import com.yandex.go.masstransit.sdk.trains.impl.schedule.network.dto.MtScheduleScenario;
import kotlinx.serialization.KSerializer;

/* loaded from: classes6.dex */
public final class fz30 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MtScheduleScenario.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
