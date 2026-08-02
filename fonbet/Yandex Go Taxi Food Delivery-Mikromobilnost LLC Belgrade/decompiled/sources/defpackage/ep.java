package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;

/* loaded from: classes9.dex */
public final class ep {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Action.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
