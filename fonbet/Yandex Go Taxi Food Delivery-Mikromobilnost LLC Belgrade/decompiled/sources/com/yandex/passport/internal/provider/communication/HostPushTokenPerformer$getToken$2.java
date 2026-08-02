package com.yandex.passport.internal.provider.communication;

import com.yandex.passport.api.PushPlatform;
import com.yandex.passport.internal.provider.communication.HostResponse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/passport/internal/provider/communication/HostResponse$PushTokenResponse;", "<anonymous>", "(Ltse;)Lcom/yandex/passport/internal/provider/communication/HostResponse$PushTokenResponse;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.provider.communication.HostPushTokenPerformer$getToken$2", f = "HostPushTokenPerformer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class HostPushTokenPerformer$getToken$2 extends SuspendLambda implements wls {
    final /* synthetic */ PushPlatform $platform;
    int label;
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HostPushTokenPerformer$getToken$2(f fVar, PushPlatform pushPlatform, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$platform = pushPlatform;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new HostPushTokenPerformer$getToken$2(this.this$0, this.$platform, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((HostPushTokenPerformer$getToken$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.a.getClass();
        return new HostResponse.PushTokenResponse(null);
    }
}
