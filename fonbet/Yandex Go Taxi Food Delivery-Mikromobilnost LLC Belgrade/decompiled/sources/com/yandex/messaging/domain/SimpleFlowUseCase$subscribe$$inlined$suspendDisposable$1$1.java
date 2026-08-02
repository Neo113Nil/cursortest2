package com.yandex.messaging.domain;

import defpackage.dl7;
import defpackage.e9e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.vds0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1", f = "UseCase.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ e9e $listener$inlined;
    final /* synthetic */ Object $params$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ vds0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1(Continuation continuation, vds0 vds0Var, Object obj, e9e e9eVar) {
        super(2, continuation);
        this.this$0 = vds0Var;
        this.$params$inlined = obj;
        this.$listener$inlined = e9eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1 simpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1 = new SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1(continuation, this.this$0, this.$params$inlined, this.$listener$inlined);
        simpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1.L$0 = obj;
        return simpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleFlowUseCase$subscribe$$inlined$suspendDisposable$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            tpr a = this.this$0.a(this.$params$inlined);
            dl7 dl7Var = new dl7(this.$listener$inlined, 1);
            this.label = 1;
            if (a.collect(dl7Var, this) == coroutineSingletons) {
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
