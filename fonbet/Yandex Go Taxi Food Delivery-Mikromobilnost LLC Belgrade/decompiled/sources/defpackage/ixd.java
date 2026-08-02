package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.finalsuggest.Condition;

/* loaded from: classes2.dex */
public final class ixd {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Condition.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
