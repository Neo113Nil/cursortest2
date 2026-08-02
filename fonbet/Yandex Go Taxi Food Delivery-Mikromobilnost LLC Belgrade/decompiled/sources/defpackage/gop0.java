package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.eatskit.dto.SdkErrorCode;

/* loaded from: classes14.dex */
public final class gop0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = SdkErrorCode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
