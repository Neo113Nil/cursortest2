package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.surge.models.dto.SelectorStyle;

/* loaded from: classes6.dex */
public final class amq0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SelectorStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
