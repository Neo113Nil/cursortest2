package com.yandex.go.scooters.domain;

import defpackage.fl3;
import defpackage.hl3;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lhl3;", "authStatus", "Lzy11;", "<anonymous>", "(Lhl3;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersAuthWaitingInteractor$listenToAuthStatus$2", f = "ScootersAuthWaitingInteractor.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class ScootersAuthWaitingInteractor$listenToAuthStatus$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersAuthWaitingInteractor$listenToAuthStatus$2(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ScootersAuthWaitingInteractor$listenToAuthStatus$2 scootersAuthWaitingInteractor$listenToAuthStatus$2 = new ScootersAuthWaitingInteractor$listenToAuthStatus$2(this.this$0, continuation);
        scootersAuthWaitingInteractor$listenToAuthStatus$2.L$0 = obj;
        return scootersAuthWaitingInteractor$listenToAuthStatus$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersAuthWaitingInteractor$listenToAuthStatus$2) create((hl3) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        hl3 hl3Var = (hl3) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (hl3Var instanceof fl3) {
                a aVar = this.this$0;
                this.L$0 = null;
                this.label = 1;
                if (a.a(aVar, this) == coroutineSingletons) {
                    return coroutineSingletons;
                }
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
