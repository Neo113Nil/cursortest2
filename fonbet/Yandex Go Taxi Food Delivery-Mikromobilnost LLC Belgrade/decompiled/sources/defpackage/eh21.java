package defpackage;

import com.yandex.payment.sdk.flex.impl.customview.views.webview.UrlMatch;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class eh21 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = UrlMatch.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
