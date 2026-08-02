package com.yandex.go.payments.shared;

import com.yandex.go.payments.shared.data.model.Account;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s8o;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lcom/yandex/go/payments/shared/data/model/Account;", "<anonymous>", "(Ltse;)Lcom/yandex/go/payments/shared/data/model/Account;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.shared.SharedPaymentRepository$getAccountDetails$2", f = "SharedPaymentRepository.kt", l = {72}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class SharedPaymentRepository$getAccountDetails$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $accountId;
    Object L$0;
    int label;
    final /* synthetic */ x this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SharedPaymentRepository$getAccountDetails$2(x xVar, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xVar;
        this.$accountId = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new SharedPaymentRepository$getAccountDetails$2(this.this$0, this.$accountId, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((SharedPaymentRepository$getAccountDetails$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
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
                String str = this.$accountId;
                try {
                    this.L$0 = xVar2;
                    this.label = 1;
                    Object a = x.a(xVar2, str, this);
                    if (a == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    obj = a;
                    xVar = xVar2;
                } catch (Throwable th2) {
                    th = th2;
                    xVar = xVar2;
                    if (s8o.C(th)) {
                    }
                    ((com.yandex.go.payments.paymentlist.data.c) xVar.d).p();
                    throw new SharedAccountUnavailableException(th);
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
                    if (s8o.C(th) && !s8o.w(th)) {
                        throw th;
                    }
                    ((com.yandex.go.payments.paymentlist.data.c) xVar.d).p();
                    throw new SharedAccountUnavailableException(th);
                }
            }
            return (Account) obj;
        } catch (CancellationException e) {
            throw e;
        }
    }
}
