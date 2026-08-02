package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.ActionType;

/* loaded from: classes6.dex */
public final class cz {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
