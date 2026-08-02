package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.UrlMatch;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class fh21 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = UrlMatch.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
