package defpackage;

import com.yandex.go.platform.js_api.models.ErrorCode;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class j6o {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ErrorCode.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
