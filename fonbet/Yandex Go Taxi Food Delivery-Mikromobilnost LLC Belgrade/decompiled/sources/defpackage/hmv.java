package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.InMessage$LogoutResponse$LogoutStatus;
import kotlinx.serialization.KSerializer;

/* loaded from: classes2.dex */
public final class hmv {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = InMessage$LogoutResponse$LogoutStatus.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
