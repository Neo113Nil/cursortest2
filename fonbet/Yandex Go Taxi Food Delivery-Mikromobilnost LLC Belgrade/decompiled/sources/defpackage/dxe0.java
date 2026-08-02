package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.PresentationOptionsDto$ToolbarNavigationType;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class dxe0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = PresentationOptionsDto$ToolbarNavigationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
