package com.yandex.go.places.impl.ui.payments.info;

import defpackage.fna0;
import defpackage.lcc0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tls;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.places.impl.ui.payments.info.PaymentsInfoPresenter$chosePaymentMethod$1", f = "PaymentsInfoPresenter.kt", l = {29}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
public final class PaymentsInfoPresenter$chosePaymentMethod$1 extends SuspendLambda implements wls {
    final /* synthetic */ tls $doOnResult;
    int label;
    final /* synthetic */ fna0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentsInfoPresenter$chosePaymentMethod$1(fna0 fna0Var, tls tlsVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fna0Var;
        this.$doOnResult = tlsVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentsInfoPresenter$chosePaymentMethod$1(this.this$0, this.$doOnResult, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentsInfoPresenter$chosePaymentMethod$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            lcc0 lcc0Var = this.this$0.z;
            tls tlsVar = this.$doOnResult;
            this.label = 1;
            if (lcc0Var.a(tlsVar, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
