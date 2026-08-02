package defpackage;

import com.yandex.fintechsdk.features.bdui.internal.presentation.customview.webview.model.AllowNewTabType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class du1 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = AllowNewTabType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
