package com.yandex.plus.pay.internal.feature.payment.inapp.google;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.ow91;
import defpackage.uod0;
import defpackage.vpr;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lvpr;", "Luod0;", "paymentState", "", "<anonymous>", "(Lvpr;Luod0;)Z"}, k = 3, mv = {2, 2, 0})
@mvg(c = "com.yandex.plus.pay.internal.feature.payment.inapp.google.TarifficatorGooglePaymentSession$flow$1", f = "TarifficatorGooglePaymentSession.kt", l = {HProv.PP_SIGNATUREOID}, m = "invokeSuspend")
/* loaded from: classes2.dex */
final class TarifficatorGooglePaymentSession$flow$1 extends SuspendLambda implements zls {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        TarifficatorGooglePaymentSession$flow$1 tarifficatorGooglePaymentSession$flow$1 = new TarifficatorGooglePaymentSession$flow$1(3, (Continuation) obj3);
        tarifficatorGooglePaymentSession$flow$1.L$0 = (vpr) obj;
        tarifficatorGooglePaymentSession$flow$1.L$1 = (uod0) obj2;
        return tarifficatorGooglePaymentSession$flow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        vpr vprVar = (vpr) this.L$0;
        uod0 uod0Var = (uod0) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.L$0 = null;
            this.L$1 = uod0Var;
            this.label = 1;
            if (vprVar.emit(uod0Var, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return Boolean.valueOf(!ow91.b(uod0Var));
    }
}
