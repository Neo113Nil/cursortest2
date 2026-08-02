package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.settings.api.dto.settings.types.SetSettingType;

/* loaded from: classes6.dex */
public final class k4r0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SetSettingType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
