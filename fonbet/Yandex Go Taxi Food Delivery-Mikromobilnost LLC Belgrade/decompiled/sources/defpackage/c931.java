package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.payments.cards.dto.VerificationStatus;

/* loaded from: classes6.dex */
public final class c931 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = VerificationStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
