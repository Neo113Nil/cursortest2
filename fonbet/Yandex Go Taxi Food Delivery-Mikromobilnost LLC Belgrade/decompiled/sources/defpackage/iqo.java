package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.experiment.ExperimentAction;

/* loaded from: classes6.dex */
public final class iqo {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ExperimentAction.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
