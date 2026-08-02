package com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.common.IntercityDashboardBannerStyleDto;
import defpackage.i3y;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class g {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = IntercityDashboardBannerStyleDto.BannerType.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
