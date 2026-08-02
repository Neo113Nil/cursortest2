package com.yandex.plus.analytics.dwh.internal.network;

import defpackage.q4n;
import defpackage.q76;
import defpackage.s490;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u001a\u0010\u0005\u001a\u00020\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0005\u0010\u0006ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0007À\u0006\u0001"}, d2 = {"Lcom/yandex/plus/analytics/dwh/internal/network/DwhEventsApi;", "", "Lq4n;", "body", "Lzy11;", "a", "(Lq4n;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "plus-dwh-rest-impl_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface DwhEventsApi {
    @s490("/events/send")
    Object a(@q76 q4n q4nVar, Continuation<? super zy11> continuation);
}
