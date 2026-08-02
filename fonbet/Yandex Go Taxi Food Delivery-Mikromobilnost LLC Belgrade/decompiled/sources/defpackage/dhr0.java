package defpackage;

import com.yandex.go.shortcuts.dto.response.Shape;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class dhr0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = Shape.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
