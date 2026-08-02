package com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer;

import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.action.serializer.IntercityOpenShuttleClarifyPointAction;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes12.dex */
public final class g {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = IntercityOpenShuttleClarifyPointAction.FlexPointType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
