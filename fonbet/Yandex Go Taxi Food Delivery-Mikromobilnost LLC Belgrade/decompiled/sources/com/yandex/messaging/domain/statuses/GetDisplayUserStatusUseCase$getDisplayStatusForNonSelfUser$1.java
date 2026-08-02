package com.yandex.messaging.domain.statuses;

import defpackage.du21;
import defpackage.e370;
import defpackage.gu21;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r0k;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Le370;", "onlineStatusValue", "Lgu21;", "userStatusValue", "Lr0k;", "<anonymous>", "(Le370;Lgu21;)Lr0k;"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.statuses.GetDisplayUserStatusUseCase$getDisplayStatusForNonSelfUser$1", f = "GetDisplayUserStatusUseCase.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class GetDisplayUserStatusUseCase$getDisplayStatusForNonSelfUser$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        GetDisplayUserStatusUseCase$getDisplayStatusForNonSelfUser$1 getDisplayUserStatusUseCase$getDisplayStatusForNonSelfUser$1 = new GetDisplayUserStatusUseCase$getDisplayStatusForNonSelfUser$1(3, (Continuation) obj3);
        getDisplayUserStatusUseCase$getDisplayStatusForNonSelfUser$1.L$0 = (e370) obj;
        getDisplayUserStatusUseCase$getDisplayStatusForNonSelfUser$1.L$1 = (gu21) obj2;
        return getDisplayUserStatusUseCase$getDisplayStatusForNonSelfUser$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e370 e370Var = (e370) this.L$0;
        gu21 gu21Var = (gu21) this.L$1;
        return new r0k((e370Var.a || gu21Var.a != StatusAvailability.Default || (gu21Var instanceof du21)) ? gu21Var : null, e370Var);
    }
}
