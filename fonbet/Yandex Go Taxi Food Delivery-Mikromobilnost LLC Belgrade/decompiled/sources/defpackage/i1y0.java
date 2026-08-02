package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.object.TaxiOrderFeedbackFlow;

/* loaded from: classes13.dex */
public final class i1y0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TaxiOrderFeedbackFlow.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
