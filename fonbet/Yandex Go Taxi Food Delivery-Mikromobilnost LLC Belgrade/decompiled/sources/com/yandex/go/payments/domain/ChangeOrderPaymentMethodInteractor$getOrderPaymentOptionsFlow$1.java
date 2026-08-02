package com.yandex.go.payments.domain;

import defpackage.bw90;
import defpackage.jfa0;
import defpackage.jl40;
import defpackage.jw90;
import defpackage.lv90;
import defpackage.mvg;
import defpackage.nea0;
import defpackage.nk0;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.ogz0;
import defpackage.snr0;
import defpackage.u0k;
import defpackage.uea0;
import defpackage.vez0;
import defpackage.xw91;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Loea0;", "paymentModels", "Llv90;", "selectedPayment", "Ljfa0;", "<anonymous>", "(Loea0;Llv90;)Ljfa0;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.ChangeOrderPaymentMethodInteractor$getOrderPaymentOptionsFlow$1", f = "ChangeOrderPaymentMethodInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class ChangeOrderPaymentMethodInteractor$getOrderPaymentOptionsFlow$1 extends SuspendLambda implements zls {
    final /* synthetic */ jw90 $availabilityChecker;
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChangeOrderPaymentMethodInteractor$getOrderPaymentOptionsFlow$1(k kVar, jw90 jw90Var, Continuation continuation) {
        super(3, continuation);
        this.this$0 = kVar;
        this.$availabilityChecker = jw90Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ChangeOrderPaymentMethodInteractor$getOrderPaymentOptionsFlow$1 changeOrderPaymentMethodInteractor$getOrderPaymentOptionsFlow$1 = new ChangeOrderPaymentMethodInteractor$getOrderPaymentOptionsFlow$1(this.this$0, this.$availabilityChecker, (Continuation) obj3);
        changeOrderPaymentMethodInteractor$getOrderPaymentOptionsFlow$1.L$0 = (oea0) obj;
        changeOrderPaymentMethodInteractor$getOrderPaymentOptionsFlow$1.L$1 = (lv90) obj2;
        return changeOrderPaymentMethodInteractor$getOrderPaymentOptionsFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        xw91 xw91Var = xw91.C;
        oea0 oea0Var = (oea0) this.L$0;
        lv90 lv90Var = (lv90) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        jfa0 a = ((uea0) this.this$0.d).a(oea0Var, this.$availabilityChecker, vez0.c0(lv90Var, null));
        List list = a.a;
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            nea0 nea0Var = (nea0) obj2;
            u0k u0kVar = nea0Var.a;
            bw90 bw90Var = nea0Var.b;
            boolean z = false;
            if (!(u0kVar instanceof ogz0) && !(u0kVar instanceof nk0)) {
                if (!(u0kVar instanceof snr0)) {
                    z = jl40.l(bw90Var, xw91Var);
                } else if (((snr0) u0kVar).e && jl40.l(bw90Var, xw91Var)) {
                    z = true;
                }
            }
            if (z) {
                arrayList.add(obj2);
            }
        }
        return jfa0.a(a, arrayList, null, 6);
    }
}
