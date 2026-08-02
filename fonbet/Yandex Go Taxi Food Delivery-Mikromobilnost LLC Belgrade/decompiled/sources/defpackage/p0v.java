package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubOfferType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class p0v {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = HubOfferType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
