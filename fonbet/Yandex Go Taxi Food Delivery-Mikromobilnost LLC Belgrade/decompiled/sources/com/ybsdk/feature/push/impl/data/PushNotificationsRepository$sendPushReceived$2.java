package com.ybsdk.feature.push.impl.data;

import com.ybsdk.feature.push.impl.network.PushNotificationsApi;
import com.ybsdk.feature.push.impl.network.dto.PushAckRequest;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lzy11;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.ybsdk.feature.push.impl.data.PushNotificationsRepository$sendPushReceived$2", f = "PushNotificationsRepository.kt", l = {39}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class PushNotificationsRepository$sendPushReceived$2 extends SuspendLambda implements tls {
    final /* synthetic */ String $pushMessageId;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushNotificationsRepository$sendPushReceived$2(a aVar, String str, Continuation continuation) {
        super(1, continuation);
        this.this$0 = aVar;
        this.$pushMessageId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PushNotificationsRepository$sendPushReceived$2(this.this$0, this.$pushMessageId, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PushNotificationsRepository$sendPushReceived$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object a;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            PushNotificationsApi pushNotificationsApi = this.this$0.a;
            PushAckRequest pushAckRequest = new PushAckRequest(this.$pushMessageId);
            this.label = 1;
            a = pushNotificationsApi.a(pushAckRequest, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            a = ((Result) obj).getValue();
        }
        return new Result(a);
    }
}
