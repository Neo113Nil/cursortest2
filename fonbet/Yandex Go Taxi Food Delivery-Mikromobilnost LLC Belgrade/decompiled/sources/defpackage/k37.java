package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.surge.models.dto.ButtonStyle;

/* loaded from: classes6.dex */
public final class k37 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ButtonStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
