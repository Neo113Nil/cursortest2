package com.yandex.go.chargers.subscription.data;

import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionListParamsDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionListResponseDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionParamsDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionResponseDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionStatusParamsDto;
import com.yandex.go.chargers.subscription.data.model.ChargersSubscriptionStatusResponseDto;
import defpackage.cmt;
import defpackage.n851;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\t\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\b\b\u0001\u0010\t\u001a\u00020\rH'¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011À\u0006\u0003"}, d2 = {"Lcom/yandex/go/chargers/subscription/data/ChargersSubscriptionApi;", "", "Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionParamsDto;", "param", "Lcmt;", "Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionResponseDto;", "a", "(Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionParamsDto;)Lcmt;", "Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionListParamsDto;", "params", "Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionListResponseDto;", "b", "(Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionListParamsDto;)Lcmt;", "Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionStatusParamsDto;", "Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionStatusResponseDto;", "c", "(Lcom/yandex/go/chargers/subscription/data/model/ChargersSubscriptionStatusParamsDto;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface ChargersSubscriptionApi {
    @n851
    @s490("chargers/v1/subscription")
    cmt<ChargersSubscriptionResponseDto> a(@q76 ChargersSubscriptionParamsDto param);

    @n851
    @s490("chargers/v1/subscription/active/list")
    cmt<ChargersSubscriptionListResponseDto> b(@q76 ChargersSubscriptionListParamsDto params);

    @n851
    @s490("chargers/v1/subscription/status")
    cmt<ChargersSubscriptionStatusResponseDto> c(@q76 ChargersSubscriptionStatusParamsDto params);
}
