package defpackage;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubLeadingItemKind;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class o0v {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = HubLeadingItemKind.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
