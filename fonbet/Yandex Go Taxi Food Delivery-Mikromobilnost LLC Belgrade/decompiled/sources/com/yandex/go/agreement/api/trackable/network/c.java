package com.yandex.go.agreement.api.trackable.network;

import com.yandex.go.agreement.api.trackable.network.TrackableAcceptanceActionParam;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class c {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TrackableAcceptanceActionParam.Status.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
