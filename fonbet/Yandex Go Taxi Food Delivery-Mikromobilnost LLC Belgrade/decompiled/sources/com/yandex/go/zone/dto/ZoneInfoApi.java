package com.yandex.go.zone.dto;

import com.yandex.go.net.taxi.dto.request.NearestZoneParam;
import com.yandex.go.net.taxi.dto.request.ZoneInfoParam;
import com.yandex.go.net.taxi.dto.response.NearestZoneResponse;
import defpackage.cmt;
import defpackage.n851;
import defpackage.neu;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;
import kotlinx.serialization.json.c;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/zone/dto/ZoneInfoApi;", "", "Lcom/yandex/go/net/taxi/dto/request/NearestZoneParam;", "p", "Lcmt;", "Lcom/yandex/go/net/taxi/dto/response/NearestZoneResponse;", "a", "(Lcom/yandex/go/net/taxi/dto/request/NearestZoneParam;)Lcmt;", "Lcom/yandex/go/net/taxi/dto/request/ZoneInfoParam;", "Lkotlinx/serialization/json/c;", "b", "(Lcom/yandex/go/net/taxi/dto/request/ZoneInfoParam;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface ZoneInfoApi {
    @n851
    @s490("nearestzone")
    cmt<NearestZoneResponse> a(@q76 NearestZoneParam p);

    @n851
    @s490("zoneinfo")
    @neu({"themeable: 2"})
    cmt<c> b(@q76 ZoneInfoParam p);
}
