package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubAvailableParam;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class fxu {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = HubAvailableParam.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
