package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.settings.api.dto.settings.types.SectionItemActionType;

/* loaded from: classes6.dex */
public final class p1q0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SectionItemActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
