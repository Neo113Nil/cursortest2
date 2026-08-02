package defpackage;

import com.yandex.go.shortcuts.dto.response.PositionOverMap;
import kotlinx.serialization.KSerializer;

/* loaded from: classes5.dex */
public final class bee0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PositionOverMap.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
