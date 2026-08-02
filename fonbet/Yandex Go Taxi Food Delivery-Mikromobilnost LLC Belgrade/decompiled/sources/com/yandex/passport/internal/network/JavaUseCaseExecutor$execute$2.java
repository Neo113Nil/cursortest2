package com.yandex.passport.internal.network;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\u00020\u0001H\n"}, d2 = {"TResult", "Ltse;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
@mvg(c = "com.yandex.passport.internal.network.JavaUseCaseExecutor$execute$2", f = "JavaUseCaseExecutor.kt", l = {20}, m = "invokeSuspend")
/* loaded from: classes15.dex */
final class JavaUseCaseExecutor$execute$2 extends SuspendLambda implements wls {
    final /* synthetic */ Object $params;
    final /* synthetic */ com.yandex.passport.data.network.core.a $useCase;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JavaUseCaseExecutor$execute$2(com.yandex.passport.data.network.core.a aVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$useCase = aVar;
        this.$params = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new JavaUseCaseExecutor$execute$2(this.$useCase, this.$params, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((JavaUseCaseExecutor$execute$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            com.yandex.passport.data.network.core.a aVar = this.$useCase;
            Object obj2 = this.$params;
            this.label = 1;
            obj = aVar.a(obj2, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Object value = ((Result) obj).getValue();
        kotlin.b.b(value);
        return value;
    }
}
