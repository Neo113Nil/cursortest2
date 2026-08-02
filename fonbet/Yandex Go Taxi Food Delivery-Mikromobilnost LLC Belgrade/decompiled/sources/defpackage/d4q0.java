package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.settings.api.dto.settings.types.SectionStyle;

/* loaded from: classes5.dex */
public final class d4q0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SectionStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
