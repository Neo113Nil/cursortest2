package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.shortcuts.dto.response.superapp.ShimmeringStyle;

/* loaded from: classes6.dex */
public final class kvr0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ShimmeringStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
