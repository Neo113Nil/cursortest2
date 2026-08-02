package com.yandex.messaging.domain;

import defpackage.e9e;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 1, 0})
@mvg(c = "com.yandex.messaging.domain.SimpleUseCase$perform$$inlined$suspendDisposable$1$1", f = "UseCase.kt", l = {33}, m = "invokeSuspend")
/* loaded from: classes15.dex */
public final class SimpleUseCase$perform$$inlined$suspendDisposable$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ e9e $listener$inlined;
    final /* synthetic */ Object $params$inlined;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SimpleUseCase$perform$$inlined$suspendDisposable$1$1(Continuation continuation, e9e e9eVar, k kVar, Object obj) {
        super(2, continuation);
        this.$listener$inlined = e9eVar;
        this.this$0 = kVar;
        this.$params$inlined = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        SimpleUseCase$perform$$inlined$suspendDisposable$1$1 simpleUseCase$perform$$inlined$suspendDisposable$1$1 = new SimpleUseCase$perform$$inlined$suspendDisposable$1$1(continuation, this.$listener$inlined, this.this$0, this.$params$inlined);
        simpleUseCase$perform$$inlined$suspendDisposable$1$1.L$0 = obj;
        return simpleUseCase$perform$$inlined$suspendDisposable$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SimpleUseCase$perform$$inlined$suspendDisposable$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        e9e e9eVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e9e e9eVar2 = this.$listener$inlined;
            k kVar = this.this$0;
            Object obj2 = this.$params$inlined;
            this.L$0 = e9eVar2;
            this.label = 1;
            Object a = kVar.a(obj2, this);
            if (a == coroutineSingletons) {
                return coroutineSingletons;
            }
            obj = a;
            e9eVar = e9eVar2;
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            e9eVar = (e9e) this.L$0;
            kotlin.b.b(obj);
        }
        e9eVar.accept(obj);
        return zy11.a;
    }
}
