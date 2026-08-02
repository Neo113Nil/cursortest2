package com.yandex.go.taxi.intercity.dashboard.impl.data.api;

import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardRequestDto;
import com.yandex.go.taxi.intercity.dashboard.impl.data.entity.dashboard.IntercityDashboardResponseDto;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/intercity/dashboard/impl/data/api/IntercityDashboardApi;", "", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/dashboard/IntercityDashboardRequestDto;", "requestDto", "Lcmt;", "Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/dashboard/IntercityDashboardResponseDto;", "a", "(Lcom/yandex/go/taxi/intercity/dashboard/impl/data/entity/dashboard/IntercityDashboardRequestDto;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface IntercityDashboardApi {
    @s490("intercity/v1/dashboard/content")
    cmt<IntercityDashboardResponseDto> a(@q76 IntercityDashboardRequestDto requestDto);
}
