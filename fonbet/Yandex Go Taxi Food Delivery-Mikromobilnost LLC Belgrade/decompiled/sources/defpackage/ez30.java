package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.trains.schedule.dto.MtScheduleScenario;

/* loaded from: classes6.dex */
public final class ez30 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MtScheduleScenario.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
