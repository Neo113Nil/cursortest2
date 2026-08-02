package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.surge.models.dto.SurgeButtonActionDto$ActionButtonStyle;

/* loaded from: classes6.dex */
public final class mow0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SurgeButtonActionDto$ActionButtonStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
