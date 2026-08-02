package defpackage;

import com.yandex.go.zone.dto.objects.TariffViewSectionItemType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class mqx0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TariffViewSectionItemType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
