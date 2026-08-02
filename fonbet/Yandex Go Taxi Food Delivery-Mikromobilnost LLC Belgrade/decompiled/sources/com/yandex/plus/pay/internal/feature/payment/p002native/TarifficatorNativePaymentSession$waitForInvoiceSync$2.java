package com.yandex.plus.pay.internal.feature.payment.p002native;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tod0;
import defpackage.vpr;
import defpackage.xod0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "url", "Lxod0;", "qrCodeParams", "Lzy11;", "<anonymous>", "(Ljava/lang/String;Lxod0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.native.TarifficatorNativePaymentSession$waitForInvoiceSync$2", f = "TarifficatorNativePaymentSession.kt", l = {81}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TarifficatorNativePaymentSession$waitForInvoiceSync$2 extends SuspendLambda implements zls {
    final /* synthetic */ vpr $flowCollector;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarifficatorNativePaymentSession$waitForInvoiceSync$2(vpr vprVar, Continuation continuation) {
        super(3, continuation);
        this.$flowCollector = vprVar;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TarifficatorNativePaymentSession$waitForInvoiceSync$2 tarifficatorNativePaymentSession$waitForInvoiceSync$2 = new TarifficatorNativePaymentSession$waitForInvoiceSync$2(this.$flowCollector, (Continuation) obj3);
        tarifficatorNativePaymentSession$waitForInvoiceSync$2.L$0 = (String) obj;
        tarifficatorNativePaymentSession$waitForInvoiceSync$2.L$1 = (xod0) obj2;
        return tarifficatorNativePaymentSession$waitForInvoiceSync$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        String str = (String) this.L$0;
        xod0 xod0Var = (xod0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar = this.$flowCollector;
            tod0 tod0Var = new tod0(str, xod0Var);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            if (vprVar.emit(tod0Var, this) == coroutineSingletons) {
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
