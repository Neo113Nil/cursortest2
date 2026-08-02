package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eats_commons.EatsService;

/* loaded from: classes5.dex */
public final class ggn {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = EatsService.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
