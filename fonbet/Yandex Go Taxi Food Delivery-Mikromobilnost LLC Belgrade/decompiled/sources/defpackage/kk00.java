package defpackage;

import com.yandex.go.proxyprovision.api.MapKitDefaultHost;
import kotlinx.serialization.KSerializer;

/* loaded from: classes8.dex */
public final class kk00 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MapKitDefaultHost.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
