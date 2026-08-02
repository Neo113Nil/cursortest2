package com.yandex.passport.internal.methods.performer;

import com.yandex.passport.internal.push.PushPayload;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.methods.performer.GetPushCodePerformer$performMethod$1", f = "GetPushCodePerformer.kt", l = {17}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetPushCodePerformer$performMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ com.yandex.passport.internal.methods.l1 $method;
    int label;
    final /* synthetic */ i0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public GetPushCodePerformer$performMethod$1(com.yandex.passport.internal.methods.l1 l1Var, i0 i0Var, Continuation continuation) {
        super(2, continuation);
        this.$method = l1Var;
        this.this$0 = i0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new GetPushCodePerformer$performMethod$1(this.$method, this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((GetPushCodePerformer$performMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        PushPayload pushPayload = (PushPayload) this.$method.b.c;
        long uid = pushPayload.getUid();
        String trackId = pushPayload.getTrackId();
        com.yandex.passport.internal.usecase.q0 q0Var = this.this$0.a;
        com.yandex.passport.internal.usecase.p0 p0Var = new com.yandex.passport.internal.usecase.p0(uid, trackId, pushPayload.getPushId());
        this.label = 1;
        Object a = q0Var.a(p0Var, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
