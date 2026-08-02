package com.yandex.go.payments.domain;

import com.yandex.go.payments.model.PaymentMethodName;
import defpackage.jl40;
import defpackage.lca0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.xea0;
import defpackage.xnt;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "", "<anonymous>", "(Ltse;)Ljava/lang/String;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PaymentMethodNameInteractor$getPaymentMethodName$2", f = "PaymentMethodNameInteractor.kt", l = {35}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodNameInteractor$getPaymentMethodName$2 extends SuspendLambda implements wls {
    final /* synthetic */ xea0 $paymentNameSearchParams;
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodNameInteractor$getPaymentMethodName$2(y yVar, xea0 xea0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = yVar;
        this.$paymentNameSearchParams = xea0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodNameInteractor$getPaymentMethodName$2(this.this$0, this.$paymentNameSearchParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((PaymentMethodNameInteractor$getPaymentMethodName$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        PaymentMethodName paymentMethodName;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            lca0 lca0Var = this.this$0.c;
            this.label = 1;
            obj = lca0Var.a.b(this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        if (!((Boolean) obj).booleanValue()) {
            return "";
        }
        com.yandex.go.payments.data.f fVar = this.this$0.b;
        xea0 xea0Var = this.$paymentNameSearchParams;
        Set n = fVar.b.n("FIELD_PAYMENT_NAME");
        ArrayList arrayList = new ArrayList();
        Iterator it = n.iterator();
        while (it.hasNext()) {
            try {
                paymentMethodName = (PaymentMethodName) ((xnt) fVar.a).c((String) it.next(), PaymentMethodName.Companion.serializer());
            } catch (Exception unused) {
                paymentMethodName = null;
            }
            if (paymentMethodName != null) {
                arrayList.add(paymentMethodName);
            }
        }
        Set M0 = kotlin.collections.a.M0(arrayList);
        String code = xea0Var.a.getCode();
        String str = xea0Var.b;
        Iterator it2 = M0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            PaymentMethodName paymentMethodName2 = (PaymentMethodName) obj2;
            if (jl40.l(paymentMethodName2.b, code) && jl40.l(paymentMethodName2.c, str)) {
                break;
            }
        }
        PaymentMethodName paymentMethodName3 = (PaymentMethodName) obj2;
        String str2 = paymentMethodName3 != null ? paymentMethodName3.a : null;
        return str2 == null ? "" : str2;
    }
}
