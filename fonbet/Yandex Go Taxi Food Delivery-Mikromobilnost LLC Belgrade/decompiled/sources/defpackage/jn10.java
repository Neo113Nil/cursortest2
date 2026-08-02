package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.plus.api.dto.MenuType;

/* loaded from: classes9.dex */
public final class jn10 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MenuType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
