package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.finalsuggest.UnavailabilityReasonCode;

/* loaded from: classes13.dex */
public final class lw11 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = UnavailabilityReasonCode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
