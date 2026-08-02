package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.ShouldFinalizeEvent;

/* loaded from: classes9.dex */
public final class b5s0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ShouldFinalizeEvent.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
