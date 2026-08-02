package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.client.dto.LaunchParam$SupportedFeatures;

/* loaded from: classes9.dex */
public final class dwx {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = LaunchParam$SupportedFeatures.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
