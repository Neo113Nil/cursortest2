package com.yandex.plus.pay.internal.feature.payment.common;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ow91;
import defpackage.uod0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luod0;", "paymentState", "Lzy11;", "<anonymous>", "(Luod0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.common.TarifficatorBaseInvoicePaymentSession$flow$2", f = "TarifficatorBaseInvoicePaymentSession.kt", l = {50}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TarifficatorBaseInvoicePaymentSession$flow$2 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarifficatorBaseInvoicePaymentSession$flow$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TarifficatorBaseInvoicePaymentSession$flow$2 tarifficatorBaseInvoicePaymentSession$flow$2 = new TarifficatorBaseInvoicePaymentSession$flow$2(this.this$0, continuation);
        tarifficatorBaseInvoicePaymentSession$flow$2.L$0 = obj;
        return tarifficatorBaseInvoicePaymentSession$flow$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TarifficatorBaseInvoicePaymentSession$flow$2) create((uod0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uod0 uod0Var = (uod0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (ow91.b(uod0Var)) {
                this.this$0.g.c();
                d dVar = this.this$0;
                dVar.f.b(dVar.g, null);
                com.yandex.plus.pay.internal.feature.cache.a aVar = this.this$0.c;
                this.L$0 = null;
                this.label = 1;
                if (aVar.a(this) == coroutineSingletons) {
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
