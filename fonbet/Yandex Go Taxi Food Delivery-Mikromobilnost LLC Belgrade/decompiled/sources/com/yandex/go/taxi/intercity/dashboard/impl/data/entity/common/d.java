package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardActionDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = IntercityDashboardActionDto.ActionType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
