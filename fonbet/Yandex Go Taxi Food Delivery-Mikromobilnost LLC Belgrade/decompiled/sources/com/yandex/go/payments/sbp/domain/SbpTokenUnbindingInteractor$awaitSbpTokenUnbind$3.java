package com.yandex.go.payments.sbp.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lkotlin/Result;", "Lzy11;", "", "it", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.sbp.domain.SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$3", f = "SbpTokenUnbindingInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$3 extends SuspendLambda implements zls {
    int label;

    public SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$3() {
        super(3, null);
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$3 sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$3 = new SbpTokenUnbindingInteractor$awaitSbpTokenUnbind$3(3, (Continuation) obj3);
        zy11 zy11Var = zy11.a;
        sbpTokenUnbindingInteractor$awaitSbpTokenUnbind$3.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return zy11.a;
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
