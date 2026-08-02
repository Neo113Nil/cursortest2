package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.shortcuts.dto.response.superapp.StickersStyle;

/* loaded from: classes6.dex */
public final class pdu0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = StickersStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
