package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.net.taxi.dto.response.BlockedUserTypeDto;

/* loaded from: classes13.dex */
public final class j46 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BlockedUserTypeDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
