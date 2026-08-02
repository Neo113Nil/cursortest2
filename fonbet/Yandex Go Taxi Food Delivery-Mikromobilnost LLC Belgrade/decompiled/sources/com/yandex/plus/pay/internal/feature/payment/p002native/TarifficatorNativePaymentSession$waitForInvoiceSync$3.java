package com.yandex.plus.pay.internal.feature.payment.p002native;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.rod0;
import defpackage.tls;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lzy11;", "<anonymous>", "()V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.native.TarifficatorNativePaymentSession$waitForInvoiceSync$3", f = "TarifficatorNativePaymentSession.kt", l = {HProv.ALG_SID_KECCAK_256}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TarifficatorNativePaymentSession$waitForInvoiceSync$3 extends SuspendLambda implements tls {
    final /* synthetic */ vpr $flowCollector;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarifficatorNativePaymentSession$waitForInvoiceSync$3(vpr vprVar, Continuation continuation) {
        super(1, continuation);
        this.$flowCollector = vprVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Continuation continuation) {
        return new TarifficatorNativePaymentSession$waitForInvoiceSync$3(this.$flowCollector, continuation);
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        return ((TarifficatorNativePaymentSession$waitForInvoiceSync$3) create((Continuation) obj)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            vpr vprVar = this.$flowCollector;
            this.label = 1;
            if (vprVar.emit(rod0.a, this) == coroutineSingletons) {
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
