package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.CacheStatus;

/* loaded from: classes9.dex */
public final class mc7 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CacheStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
