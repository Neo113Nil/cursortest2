package defpackage;

import com.yandex.go.ugc.UgcWebViewTheme;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class ks11 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = UgcWebViewTheme.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
