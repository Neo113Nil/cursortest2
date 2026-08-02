package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.ErrorType;

/* loaded from: classes2.dex */
public final class dao {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ErrorType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
