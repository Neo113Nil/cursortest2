package com.yandex.go.payments.domain;

import com.yandex.go.payments.model.PaymentMethodName;
import defpackage.cne0;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.wls;
import defpackage.wnt;
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
import kotlinx.serialization.KSerializer;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.domain.PaymentMethodNameInteractor$savePaymentMethodName$2", f = "PaymentMethodNameInteractor.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class PaymentMethodNameInteractor$savePaymentMethodName$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $name;
    final /* synthetic */ xea0 $paymentNameSearchParams;
    int label;
    final /* synthetic */ y this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PaymentMethodNameInteractor$savePaymentMethodName$2(y yVar, String str, xea0 xea0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = yVar;
        this.$name = str;
        this.$paymentNameSearchParams = xea0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new PaymentMethodNameInteractor$savePaymentMethodName$2(this.this$0, this.$name, this.$paymentNameSearchParams, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        PaymentMethodNameInteractor$savePaymentMethodName$2 paymentMethodNameInteractor$savePaymentMethodName$2 = (PaymentMethodNameInteractor$savePaymentMethodName$2) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        paymentMethodNameInteractor$savePaymentMethodName$2.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        PaymentMethodName paymentMethodName;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        Object obj2 = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        com.yandex.go.payments.data.f fVar = this.this$0.b;
        String str = this.$name;
        xea0 xea0Var = this.$paymentNameSearchParams;
        cne0 cne0Var = fVar.b;
        wnt wntVar = fVar.a;
        Set n = cne0Var.n("FIELD_PAYMENT_NAME");
        ArrayList arrayList = new ArrayList();
        Iterator it = n.iterator();
        while (it.hasNext()) {
            try {
                paymentMethodName = (PaymentMethodName) ((xnt) wntVar).c((String) it.next(), PaymentMethodName.Companion.serializer());
            } catch (Exception unused) {
                paymentMethodName = null;
            }
            if (paymentMethodName != null) {
                arrayList.add(paymentMethodName);
            }
        }
        Set M0 = kotlin.collections.a.M0(arrayList);
        String code = xea0Var.a.getCode();
        String str2 = xea0Var.b;
        Iterator it2 = M0.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next = it2.next();
            PaymentMethodName paymentMethodName2 = (PaymentMethodName) next;
            if (jl40.l(paymentMethodName2.b, code) && jl40.l(paymentMethodName2.c, str2)) {
                obj2 = next;
                break;
            }
        }
        PaymentMethodName paymentMethodName3 = (PaymentMethodName) obj2;
        if (paymentMethodName3 != null) {
            M0.remove(paymentMethodName3);
        }
        M0.add(new PaymentMethodName(str, code, str2));
        KSerializer serializer = PaymentMethodName.Companion.serializer();
        ArrayList arrayList2 = new ArrayList();
        Iterator it3 = M0.iterator();
        while (it3.hasNext()) {
            arrayList2.add(((xnt) wntVar).e((PaymentMethodName) it3.next(), serializer));
        }
        cne0Var.t("FIELD_PAYMENT_NAME", kotlin.collections.a.N0(arrayList2));
        kotlinx.coroutines.flow.n0 n0Var = this.this$0.b.c;
        zy11 zy11Var = zy11.a;
        n0Var.g(zy11Var);
        return zy11Var;
    }
}
