package com.yandex.go.scooters.payments.domain;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Lhfa0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.payments.domain.ScootersCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1", f = "ScootersCurrentPaymentMethodInteractorImpl.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1 extends SuspendLambda implements wls {
    final /* synthetic */ zzs $geo;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1(a aVar, zzs zzsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$geo = zzsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ScootersCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1(this.this$0, this.$geo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ScootersCurrentPaymentMethodInteractorImpl$listenCurrentPaymentOptions$1) create((vpr) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            a aVar = this.this$0;
            zzs zzsVar = this.$geo;
            this.label = 1;
            if (a.a(aVar, zzsVar, this) == coroutineSingletons) {
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
