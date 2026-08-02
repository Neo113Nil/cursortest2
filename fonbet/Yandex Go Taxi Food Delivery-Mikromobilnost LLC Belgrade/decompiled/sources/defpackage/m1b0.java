package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.requirements.models.net.PersistenceTypeDto;

/* loaded from: classes9.dex */
public final class m1b0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PersistenceTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
