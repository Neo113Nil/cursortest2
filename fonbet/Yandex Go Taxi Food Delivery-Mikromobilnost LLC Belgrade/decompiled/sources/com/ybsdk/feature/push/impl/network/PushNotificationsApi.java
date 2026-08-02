package com.ybsdk.feature.push.impl.network;

import com.ybsdk.feature.push.impl.network.dto.PushAckRequest;
import com.ybsdk.feature.push.impl.network.dto.SubscribeRequest;
import com.ybsdk.feature.push.impl.network.dto.UnsubscribeRequest;
import defpackage.q76;
import defpackage.s490;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH§@¢\u0006\u0004\b\t\u0010\nJ \u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u000bH§@¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/ybsdk/feature/push/impl/network/PushNotificationsApi;", "", "Lcom/ybsdk/feature/push/impl/network/dto/SubscribeRequest;", "request", "Lkotlin/Result;", "Lzy11;", "c", "(Lcom/ybsdk/feature/push/impl/network/dto/SubscribeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/push/impl/network/dto/UnsubscribeRequest;", "b", "(Lcom/ybsdk/feature/push/impl/network/dto/UnsubscribeRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lcom/ybsdk/feature/push/impl/network/dto/PushAckRequest;", "a", "(Lcom/ybsdk/feature/push/impl/network/dto/PushAckRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "feature-push-impl_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes3.dex */
public interface PushNotificationsApi {
    @s490("v1/communications/v1/push_ack")
    Object a(@q76 PushAckRequest pushAckRequest, Continuation<? super Result<zy11>> continuation);

    @s490("v1/communications/v1/push_unsubscribe")
    Object b(@q76 UnsubscribeRequest unsubscribeRequest, Continuation<? super Result<zy11>> continuation);

    @s490("v1/communications/v1/push_subscribe")
    Object c(@q76 SubscribeRequest subscribeRequest, Continuation<? super Result<zy11>> continuation);
}
