package defpackage;

import com.yandex.go.dto.response.ActionType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes.dex */
public final class dz {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
