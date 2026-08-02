package com.yandex.go.taxi.summary.mobilityhub.verticalhub.api;

import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.HubScreenRequestParams;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v1.model.net.MobilityHubScreenResponse;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubScreenRequestParamsV2;
import com.yandex.go.taxi.summary.mobilityhub.verticalhub.v2.model.net.HubScreenResponseV2;
import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/api/MobilityHubApi;", "", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubScreenRequestParams;", "params", "Lcmt;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/MobilityHubScreenResponse;", "b", "(Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v1/model/net/HubScreenRequestParams;)Lcmt;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubScreenRequestParamsV2;", "Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubScreenResponseV2;", "a", "(Lcom/yandex/go/taxi/summary/mobilityhub/verticalhub/v2/model/net/HubScreenRequestParamsV2;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes14.dex */
public interface MobilityHubApi {
    @s490("mobility-hub/v2/mobility-hub-summary")
    cmt<HubScreenResponseV2> a(@q76 HubScreenRequestParamsV2 params);

    @s490("mobility-hub/v1/mobility-hub-summary")
    cmt<MobilityHubScreenResponse> b(@q76 HubScreenRequestParams params);
}
