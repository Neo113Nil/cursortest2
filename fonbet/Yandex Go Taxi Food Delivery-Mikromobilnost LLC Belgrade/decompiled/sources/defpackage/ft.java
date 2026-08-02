package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.ActionButtonSize;

/* loaded from: classes6.dex */
public final class ft {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ActionButtonSize.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
