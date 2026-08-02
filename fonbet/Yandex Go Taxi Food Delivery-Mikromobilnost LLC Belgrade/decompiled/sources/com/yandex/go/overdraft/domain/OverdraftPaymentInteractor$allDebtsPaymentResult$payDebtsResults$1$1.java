package com.yandex.go.overdraft.domain;

import defpackage.m6a0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ltse;", "Lnoh;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lnoh;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.overdraft.domain.OverdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1", f = "OverdraftPaymentInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class OverdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $orderId;
    final /* synthetic */ m6a0 $paymentMethodReference;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ l this$0;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "Lzy11;", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "com.yandex.go.overdraft.domain.OverdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1$1", f = "OverdraftPaymentInteractor.kt", l = {HProv.PP_CONTAINER_EXTENSION}, m = "invokeSuspend", v = 2)
    /* renamed from: com.yandex.go.overdraft.domain.OverdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ String $orderId;
        final /* synthetic */ m6a0 $paymentMethodReference;
        int label;
        final /* synthetic */ l this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(l lVar, m6a0 m6a0Var, String str, Continuation continuation) {
            super(2, continuation);
            this.this$0 = lVar;
            this.$paymentMethodReference = m6a0Var;
            this.$orderId = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$paymentMethodReference, this.$orderId, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object failure;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            try {
                if (i == 0) {
                    kotlin.b.b(obj);
                    l lVar = this.this$0;
                    m6a0 m6a0Var = this.$paymentMethodReference;
                    String str = this.$orderId;
                    g gVar = lVar.a;
                    this.label = 1;
                    if (gVar.e(m6a0Var, str, this) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                failure = zy11.a;
            } catch (CancellationException e) {
                throw e;
            } catch (Exception e2) {
                failure = new Result.Failure(e2);
            }
            return new Result(failure);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1(l lVar, m6a0 m6a0Var, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = lVar;
        this.$paymentMethodReference = m6a0Var;
        this.$orderId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        OverdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1 overdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1 = new OverdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1(this.this$0, this.$paymentMethodReference, this.$orderId, continuation);
        overdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1.L$0 = obj;
        return overdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((OverdraftPaymentInteractor$allDebtsPaymentResult$payDebtsResults$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return tje.h(tseVar, null, null, new AnonymousClass1(this.this$0, this.$paymentMethodReference, this.$orderId, null), 3);
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
