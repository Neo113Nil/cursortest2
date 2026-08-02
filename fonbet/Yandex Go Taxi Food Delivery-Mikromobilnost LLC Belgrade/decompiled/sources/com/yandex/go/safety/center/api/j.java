package com.yandex.go.safety.center.api;

import com.yandex.go.safety.center.api.ShareRequestParam;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class j {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ShareRequestParam.NotificationType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
