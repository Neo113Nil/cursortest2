package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.MainScreenVersion;

/* loaded from: classes9.dex */
public final class oc00 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MainScreenVersion.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
