package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.data.model.SuperPassesDisplayVersionDto;

/* loaded from: classes6.dex */
public final class j8w0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SuperPassesDisplayVersionDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
