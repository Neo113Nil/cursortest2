package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.AdditionalButtonStyle;

/* loaded from: classes6.dex */
public final class fl0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AdditionalButtonStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
