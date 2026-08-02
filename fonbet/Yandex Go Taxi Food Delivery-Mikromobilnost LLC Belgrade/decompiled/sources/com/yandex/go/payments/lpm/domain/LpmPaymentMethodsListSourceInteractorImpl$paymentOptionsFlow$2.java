package com.yandex.go.payments.lpm.domain;

import defpackage.dms;
import defpackage.edi0;
import defpackage.h8b0;
import defpackage.jfa0;
import defpackage.jl40;
import defpackage.jw90;
import defpackage.lea0;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.nea0;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.rhq0;
import defpackage.tls;
import defpackage.u0k;
import defpackage.uea0;
import defpackage.vez0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006H\n¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Loea0;", "paymentModels", "Lm6a0;", "selectedPayment", "Lzy11;", "<unused var>", "Lkotlin/Function1;", "Lnea0;", "", "filter", "Ljfa0;", "<anonymous>", "(Lru/yandex/taxi/payment_options/model/PaymentModels;Lru/yandex/taxi/payments/model/PaymentMethodReference;VLkotlin/jvm/functions/Function1;)Lcom/yandex/go/payments/navigation/list/router/PaymentOptionsForPmlScreen;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.lpm.domain.LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$2", f = "LpmPaymentMethodsListSourceInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$2 extends SuspendLambda implements dms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$2(e eVar, Continuation continuation) {
        super(5, continuation);
        this.this$0 = eVar;
    }

    @Override // defpackage.dms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$2 lpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$2 = new LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$2(this.this$0, (Continuation) obj5);
        lpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$2.L$0 = (oea0) obj;
        lpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$2.L$1 = (m6a0) obj2;
        lpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$2.L$2 = (tls) obj4;
        return lpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$2.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        edi0 edi0Var;
        Object obj2;
        oea0 oea0Var = (oea0) this.L$0;
        m6a0 m6a0Var = (m6a0) this.L$1;
        tls tlsVar = (tls) this.L$2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        rhq0 rhq0Var = null;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        r0 r0Var = (r0) this.this$0.k.c;
        m6a0 m6a0Var2 = (m6a0) r0Var.getValue();
        if (m6a0Var2 != null) {
            String str = m6a0Var2.b;
            PaymentMethod$Type paymentMethod$Type = m6a0Var2.a;
            if (m6a0Var2.a()) {
                List list = oea0Var.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (obj3 instanceof h8b0) {
                        arrayList.add(obj3);
                    }
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    String str2 = ((h8b0) obj2).a;
                    m6a0 m6a0Var3 = m6a0Var2.c;
                    if (jl40.l(str2, m6a0Var3 != null ? m6a0Var3.b : null)) {
                        break;
                    }
                }
                h8b0 h8b0Var = (h8b0) obj2;
                if (h8b0Var == null) {
                    r0Var.m(null, new m6a0(paymentMethod$Type, str, null));
                } else if (!h8b0Var.g(paymentMethod$Type)) {
                    r0Var.m(null, new m6a0(paymentMethod$Type, str, null));
                } else if (!h8b0Var.f()) {
                    r0Var.m(null, new m6a0(paymentMethod$Type, str, null));
                }
            }
        }
        e eVar = this.this$0;
        jfa0 a = ((uea0) eVar.h).a(oea0Var, (jw90) eVar.l.getValue(), m6a0Var);
        rhq0 rhq0Var2 = a.b;
        if (tlsVar == null) {
            return a;
        }
        List list2 = a.a;
        ArrayList arrayList2 = new ArrayList();
        for (Object obj4 : list2) {
            if (((Boolean) tlsVar.invoke(obj4)).booleanValue()) {
                arrayList2.add(obj4);
            }
        }
        lea0 lea0Var = (rhq0Var2 == null || (edi0Var = rhq0Var2.a) == null) ? null : edi0Var.a;
        if (lea0Var != null && !arrayList2.isEmpty()) {
            Iterator it2 = arrayList2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                u0k u0kVar = ((nea0) it2.next()).a;
                if (vez0.O(u0kVar instanceof lea0 ? (lea0) u0kVar : null, lea0Var)) {
                    rhq0Var = rhq0Var2;
                    break;
                }
            }
        }
        return jfa0.a(a, arrayList2, rhq0Var, 4);
    }
}
