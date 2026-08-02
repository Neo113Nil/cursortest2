package com.yandex.go.payments.paymentlist.data;

import defpackage.dvx;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.qaa0;
import defpackage.vda0;
import defpackage.wls;
import defpackage.zy11;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Pair;", "Lqaa0;", "Ldvx;", "<destruct>", "Lzy11;", "<anonymous>", "(Lkotlin/Pair;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.paymentlist.data.PaymentMethodsRepositoryImpl$listenForPaymentMethods$3", f = "PaymentMethodsRepositoryImpl.kt", l = {358, 360}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentMethodsRepositoryImpl$listenForPaymentMethods$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodsRepositoryImpl$listenForPaymentMethods$3(c cVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        PaymentMethodsRepositoryImpl$listenForPaymentMethods$3 paymentMethodsRepositoryImpl$listenForPaymentMethods$3 = new PaymentMethodsRepositoryImpl$listenForPaymentMethods$3(this.this$0, continuation);
        paymentMethodsRepositoryImpl$listenForPaymentMethods$3.L$0 = obj;
        return paymentMethodsRepositoryImpl$listenForPaymentMethods$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodsRepositoryImpl$listenForPaymentMethods$3) create((Pair) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x007b, code lost:
    
        if (com.yandex.go.payments.paymentlist.data.c.c(r0, r9, r2, r6, r8) != r1) goto L25;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        qaa0 qaa0Var;
        dvx dvxVar;
        c cVar;
        vda0 b;
        qaa0 qaa0Var2;
        Pair pair = (Pair) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
        }
        if (i == 0) {
            kotlin.b.b(obj);
            qaa0Var = (qaa0) pair.getFirst();
            dvxVar = (dvx) pair.getSecond();
            cVar = this.this$0;
            b = c.b(cVar, qaa0Var, dvxVar.a);
            if (b == null) {
                this.L$0 = null;
                this.L$1 = qaa0Var;
                this.L$2 = dvxVar;
                this.L$3 = cVar;
                this.label = 1;
                Object a = c.a(cVar, qaa0Var, dvxVar, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                qaa0Var2 = qaa0Var;
                obj = a;
            }
            String str = qaa0Var.c;
            String str2 = dvxVar.a;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 2;
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            cVar = (c) this.L$3;
            dvxVar = (dvx) this.L$2;
            qaa0Var2 = (qaa0) this.L$1;
            kotlin.b.b(obj);
        }
        b = (vda0) obj;
        qaa0Var = qaa0Var2;
        String str3 = qaa0Var.c;
        String str22 = dvxVar.a;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = null;
        this.label = 2;
    }
}
