package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.personalstate.api.network.objects.OptionType;

/* loaded from: classes6.dex */
public final class ff70 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OptionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
