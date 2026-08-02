package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.Orientation;

/* loaded from: classes14.dex */
public final class fq80 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Orientation.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
