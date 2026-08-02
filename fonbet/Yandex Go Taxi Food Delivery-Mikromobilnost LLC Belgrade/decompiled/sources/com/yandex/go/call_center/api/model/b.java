package com.yandex.go.call_center.api.model;

import com.yandex.go.call_center.api.model.CallCenter;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class b {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CallCenter.Type.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
