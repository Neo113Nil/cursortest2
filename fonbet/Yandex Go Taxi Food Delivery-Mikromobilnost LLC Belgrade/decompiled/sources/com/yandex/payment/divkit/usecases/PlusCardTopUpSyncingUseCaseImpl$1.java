package com.yandex.payment.divkit.usecases;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/Result;", "Lkq4;", "<anonymous>", "()Lkotlin/Result;"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.payment.divkit.usecases.PlusCardTopUpSyncingUseCaseImpl$1", f = "PlusCardTopUpSyncingUseCase.kt", l = {22}, m = "invokeSuspend", v = 1)
/* loaded from: classes2.dex */
final class PlusCardTopUpSyncingUseCaseImpl$1 extends SuspendLambda implements tls {
    int label;

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new PlusCardTopUpSyncingUseCaseImpl$1(1, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((PlusCardTopUpSyncingUseCaseImpl$1) create((Continuation) obj)).invokeSuspend(zy11.a);
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
        com.yandex.payment.sdk.core.utils.a aVar = com.yandex.payment.sdk.core.utils.a.a;
        this.label = 1;
        Result b = aVar.b(this);
        return b == coroutineSingletons ? coroutineSingletons : b;
    }
}
