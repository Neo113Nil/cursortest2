package com.yandex.go.scooters.qr.domain;

import defpackage.ero0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.r7p0;
import defpackage.wls;
import defpackage.yln0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.qr.domain.ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$1", f = "ScootersFindAnyNumberInteractor.kt", l = {269}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ yln0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$1(Continuation continuation, yln0 yln0Var) {
        super(2, continuation);
        this.this$0 = yln0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$1 scootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$1 = new ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$1(continuation, this.this$0);
        scootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$1.L$0 = obj;
        return scootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersFindAnyNumberInteractor$listenAction$$inlined$flatMapConcat$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            return obj;
        }
        kotlin.b.b(obj);
        yln0 yln0Var = this.this$0;
        ero0 ero0Var = new ero0((r7p0) obj2);
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.label = 1;
        Object a = yln0Var.d.a(ero0Var, null, this);
        return a == coroutineSingletons ? coroutineSingletons : a;
    }
}
