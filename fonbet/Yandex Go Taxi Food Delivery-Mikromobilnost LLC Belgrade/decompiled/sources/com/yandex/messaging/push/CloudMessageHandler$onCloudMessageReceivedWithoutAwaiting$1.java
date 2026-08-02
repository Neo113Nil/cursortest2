package com.yandex.messaging.push;

import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.y9i0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.push.CloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1", f = "CloudMessageHandler.kt", l = {42}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class CloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1 extends SuspendLambda implements wls {
    final /* synthetic */ y9i0 $rawPushData;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1(b bVar, y9i0 y9i0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
        this.$rawPushData = y9i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        CloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1 cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1 = new CloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1(this.this$0, this.$rawPushData, continuation);
        cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1.L$0 = obj;
        return cloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((CloudMessageHandler$onCloudMessageReceivedWithoutAwaiting$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tse tseVar = (tse) this.L$0;
            mth b = this.this$0.d.b();
            a aVar = new a(this.$rawPushData, tseVar);
            this.label = 1;
            if (b.collect(aVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
