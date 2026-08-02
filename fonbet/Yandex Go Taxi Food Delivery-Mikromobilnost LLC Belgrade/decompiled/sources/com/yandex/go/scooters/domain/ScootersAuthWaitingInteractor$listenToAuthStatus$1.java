package com.yandex.go.scooters.domain;

import defpackage.fl3;
import defpackage.gl3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lhl3;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersAuthWaitingInteractor$listenToAuthStatus$1", f = "ScootersAuthWaitingInteractor.kt", l = {21}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ScootersAuthWaitingInteractor$listenToAuthStatus$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersAuthWaitingInteractor$listenToAuthStatus$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersAuthWaitingInteractor$listenToAuthStatus$1 scootersAuthWaitingInteractor$listenToAuthStatus$1 = new ScootersAuthWaitingInteractor$listenToAuthStatus$1(this.this$0, continuation);
        scootersAuthWaitingInteractor$listenToAuthStatus$1.L$0 = obj;
        return scootersAuthWaitingInteractor$listenToAuthStatus$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersAuthWaitingInteractor$listenToAuthStatus$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            Object fl3Var = aVar.b() ? new fl3(aVar.a.i()) : new gl3(false);
            this.L$0 = null;
            this.label = 1;
            if (vprVar.emit(fl3Var, this) == coroutineSingletons) {
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
