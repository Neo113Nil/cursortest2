package com.ybsdk.feature.banners.api;

import com.ybsdk.feature.banners.api.dto.MarkEventsRequest;
import defpackage.q76;
import defpackage.s490;
import defpackage.z8u;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H§@¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/ybsdk/feature/banners/api/MarkEventsApi;", "", "Lcom/ybsdk/feature/banners/api/dto/MarkEventsRequest;", "request", "", "idempotencyToken", "Lkotlin/Result;", "Lzy11;", "a", "(Lcom/ybsdk/feature/banners/api/dto/MarkEventsRequest;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-banners-api_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface MarkEventsApi {
    @s490("v1/notifications/v1/mark_events")
    Object a(@q76 MarkEventsRequest markEventsRequest, @z8u("X-Idempotency-Token") String str, Continuation<? super Result<zy11>> continuation);
}
