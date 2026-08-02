package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.OpenYbParams$ScreenType;

/* loaded from: classes14.dex */
public final class ca70 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OpenYbParams$ScreenType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
