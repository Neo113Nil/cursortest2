package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.address.experiment.NextButtonShowStrategy;

/* loaded from: classes9.dex */
public final class a760 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = NextButtonShowStrategy.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
