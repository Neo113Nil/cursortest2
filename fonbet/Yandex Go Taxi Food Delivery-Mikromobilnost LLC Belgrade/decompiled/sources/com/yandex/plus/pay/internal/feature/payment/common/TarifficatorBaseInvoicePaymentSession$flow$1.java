package com.yandex.plus.pay.internal.feature.payment.common;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lvpr;", "Luod0;", "Lzy11;", "<anonymous>", "(Lvpr;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.common.TarifficatorBaseInvoicePaymentSession$flow$1", f = "TarifficatorBaseInvoicePaymentSession.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TarifficatorBaseInvoicePaymentSession$flow$1 extends SuspendLambda implements wls {
    int label;
    final /* synthetic */ d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarifficatorBaseInvoicePaymentSession$flow$1(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TarifficatorBaseInvoicePaymentSession$flow$1(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TarifficatorBaseInvoicePaymentSession$flow$1 tarifficatorBaseInvoicePaymentSession$flow$1 = (TarifficatorBaseInvoicePaymentSession$flow$1) create((vpr) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tarifficatorBaseInvoicePaymentSession$flow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        this.this$0.g.b();
        return zy11.a;
    }
}
