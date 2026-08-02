package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import com.yandex.plus.pay.common.internal.log.PayCoreLogTag;
import defpackage.aw91;
import defpackage.mdd0;
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
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Luod0;", "paymentState", "Lzy11;", "<anonymous>", "(Luod0;)V"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.inapp.google.TarifficatorGooglePaymentSession$flow$3", f = "TarifficatorGooglePaymentSession.kt", l = {HProv.PP_SET_PIN}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TarifficatorGooglePaymentSession$flow$3 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TarifficatorGooglePaymentSession$flow$3(b bVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        TarifficatorGooglePaymentSession$flow$3 tarifficatorGooglePaymentSession$flow$3 = new TarifficatorGooglePaymentSession$flow$3(this.this$0, continuation);
        tarifficatorGooglePaymentSession$flow$3.L$0 = obj;
        return tarifficatorGooglePaymentSession$flow$3;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TarifficatorGooglePaymentSession$flow$3) create((uod0) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        uod0 uod0Var = (uod0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            if (ow91.b(uod0Var)) {
                this.this$0.o.c();
                b bVar = this.this$0;
                bVar.m.b(bVar.o, null);
                com.yandex.plus.pay.internal.feature.cache.a aVar = this.this$0.h;
                this.L$0 = uod0Var;
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
        mdd0.d(this.this$0.l, PayCoreLogTag.IN_APP_PAYMENT, "Collect in-app payment state: ".concat(aw91.c(uod0Var)));
        return zy11.a;
    }
}
