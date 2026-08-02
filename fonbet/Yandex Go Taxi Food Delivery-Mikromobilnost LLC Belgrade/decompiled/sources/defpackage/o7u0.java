package defpackage;

import com.yandex.go.navigator.notifications.cartech.StationType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class o7u0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = StationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
