package com.yandex.go.payments.shared;

import com.yandex.go.payments.shared.data.model.GetCurrenciesResponse;
import defpackage.cmt;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "", "Lcom/yandex/go/payments/shared/data/model/Currency;", "<anonymous>", "(Ltse;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentRepository$getCurrencies$2", f = "SharedPaymentRepository.kt", l = {215}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentRepository$getCurrencies$2 extends SuspendLambda implements wls {
    Object L$0;
    int label;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentRepository$getCurrencies$2(x xVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPaymentRepository$getCurrencies$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPaymentRepository$getCurrencies$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        x xVar;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
            if (i == 0) {
                kotlin.b.b(obj);
                x xVar2 = this.this$0;
                try {
                    cmt<GetCurrenciesResponse> n = xVar2.b().n();
                    this.L$0 = xVar2;
                    this.label = 1;
                    Object a = ru.yandex.taxi.network.api.a.a(n, null, this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                } catch (Throwable th2) {
                    th = th2;
                    xVar = xVar2;
                    throw xVar.e.b(th);
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                xVar = (x) this.L$0;
                try {
                    kotlin.b.b(obj);
                } catch (Throwable th3) {
                    th = th3;
                    throw xVar.e.b(th);
                }
            }
            return ((GetCurrenciesResponse) obj).a;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
