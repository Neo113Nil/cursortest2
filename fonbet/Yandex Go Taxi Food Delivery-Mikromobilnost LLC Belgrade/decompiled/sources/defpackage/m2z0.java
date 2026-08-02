package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.api.dto.ticket.TicketMode;

/* loaded from: classes5.dex */
public final class m2z0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TicketMode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
