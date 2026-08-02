package defpackage;

import com.yandex.go.platform.web_api.NavigationType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class ia50 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = NavigationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
