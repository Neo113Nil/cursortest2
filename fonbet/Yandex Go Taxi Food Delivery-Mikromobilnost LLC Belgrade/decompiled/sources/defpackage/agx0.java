package defpackage;

import com.yandex.go.zone.dto.objects.TariffGroupDefinitionType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class agx0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TariffGroupDefinitionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
