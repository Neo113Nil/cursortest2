package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.delivery.models.data.experiment.StepType;

/* loaded from: classes9.dex */
public final class oau0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = StepType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
