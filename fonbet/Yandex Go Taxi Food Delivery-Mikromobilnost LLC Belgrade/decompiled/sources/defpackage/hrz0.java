package defpackage;

import com.yandex.go.zone.dto.objects.TollRoadsAvailability;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class hrz0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TollRoadsAvailability.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
