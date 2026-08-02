package com.yandex.plus.pay.internal.feature.payment.p002native;

import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import defpackage.aw91;
import defpackage.mdd0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uod0;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luod0;", "paymentState", "Lzy11;", "<anonymous>", "(Luod0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.native.TarifficatorNativePaymentSession$flow$1", f = "TarifficatorNativePaymentSession.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TarifficatorNativePaymentSession$flow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarifficatorNativePaymentSession$flow$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TarifficatorNativePaymentSession$flow$1 tarifficatorNativePaymentSession$flow$1 = new TarifficatorNativePaymentSession$flow$1(this.this$0, continuation);
        tarifficatorNativePaymentSession$flow$1.L$0 = obj;
        return tarifficatorNativePaymentSession$flow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TarifficatorNativePaymentSession$flow$1 tarifficatorNativePaymentSession$flow$1 = (TarifficatorNativePaymentSession$flow$1) create((uod0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tarifficatorNativePaymentSession$flow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uod0 uod0Var = (uod0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        mdd0.d(this.this$0.s, PayCoreLogTag.NATIVE_PAYMENT, "Collect native payment state: ".concat(aw91.c(uod0Var)));
        return zy11.a;
    }
}
