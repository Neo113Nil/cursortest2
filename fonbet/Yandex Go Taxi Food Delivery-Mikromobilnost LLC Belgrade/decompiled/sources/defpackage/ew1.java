package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.AlternativeActionType;

/* loaded from: classes12.dex */
public final class ew1 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AlternativeActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
