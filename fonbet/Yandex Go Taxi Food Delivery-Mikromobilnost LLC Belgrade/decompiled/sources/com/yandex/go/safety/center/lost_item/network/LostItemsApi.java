package com.yandex.go.safety.center.lost_item.network;

import defpackage.cmt;
import defpackage.q76;
import defpackage.s490;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\bÀ\u0006\u0003"}, d2 = {"Lcom/yandex/go/safety/center/lost_item/network/LostItemsApi;", "", "Lcom/yandex/go/safety/center/lost_item/network/LostItemsRequestParams;", "params", "Lcmt;", "Lcom/yandex/go/safety/center/lost_item/network/LostItemsApiResponse;", "a", "(Lcom/yandex/go/safety/center/lost_item/network/LostItemsRequestParams;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes8.dex */
public interface LostItemsApi {
    @s490("inapp-communications/v1/lost-items/details")
    cmt<LostItemsApiResponse> a(@q76 LostItemsRequestParams params);
}
