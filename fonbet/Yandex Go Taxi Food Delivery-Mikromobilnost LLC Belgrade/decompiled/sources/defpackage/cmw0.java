package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.net.taxi.dto.request.SupportedOptionType;

/* loaded from: classes9.dex */
public final class cmw0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SupportedOptionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
