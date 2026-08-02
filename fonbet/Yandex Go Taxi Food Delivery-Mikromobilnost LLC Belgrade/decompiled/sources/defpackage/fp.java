package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.suggest.Action;

/* loaded from: classes6.dex */
public final class fp {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Action.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
