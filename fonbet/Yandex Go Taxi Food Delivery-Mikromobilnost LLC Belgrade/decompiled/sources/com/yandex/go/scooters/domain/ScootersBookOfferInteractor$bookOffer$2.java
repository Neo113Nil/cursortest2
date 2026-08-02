package com.yandex.go.scooters.domain;

import com.yandex.go.scooters.domain.model.ScootersComeFrom;
import defpackage.kgx;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o1b1;
import defpackage.qdx;
import defpackage.qwo0;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.scooters.domain.ScootersBookOfferInteractor$bookOffer$2", f = "ScootersBookOfferInteractor.kt", l = {207}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ScootersBookOfferInteractor$bookOffer$2 extends SuspendLambda implements tls {
    final /* synthetic */ ScootersComeFrom $comeFrom;
    final /* synthetic */ String $offerId;
    final /* synthetic */ m6a0 $paymentMethodRef;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScootersBookOfferInteractor$bookOffer$2(d dVar, String str, m6a0 m6a0Var, ScootersComeFrom scootersComeFrom, Continuation continuation) {
        super(1, continuation);
        this.this$0 = dVar;
        this.$offerId = str;
        this.$paymentMethodRef = m6a0Var;
        this.$comeFrom = scootersComeFrom;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new ScootersBookOfferInteractor$bookOffer$2(this.this$0, this.$offerId, this.$paymentMethodRef, this.$comeFrom, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((ScootersBookOfferInteractor$bookOffer$2) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            String str = this.$offerId;
            m6a0 m6a0Var = this.$paymentMethodRef;
            this.label = 1;
            if (d.a(dVar, str, m6a0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        qwo0 qwo0Var = this.this$0.c;
        qdx qdxVar = qwo0Var.h;
        kgx[] kgxVarArr = qwo0.B;
        qwo0Var.h.setValue(qwo0Var, kgxVarArr[6], Integer.valueOf(((Number) qdxVar.getValue(qwo0Var, kgxVarArr[6])).intValue() + 1));
        this.this$0.o.d(Boolean.valueOf(o1b1.a(this.$comeFrom)), this.$offerId);
        return zy11.a;
    }
}
