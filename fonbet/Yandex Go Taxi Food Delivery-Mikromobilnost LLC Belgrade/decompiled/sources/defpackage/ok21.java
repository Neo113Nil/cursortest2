package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.payments.model.pci_dss.UserCardProfileName;

/* loaded from: classes9.dex */
public final class ok21 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = UserCardProfileName.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
