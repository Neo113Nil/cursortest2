package com.yandex.go.payments.lpm.domain;

import defpackage.c9v;
import defpackage.f731;
import defpackage.jl40;
import defpackage.lea0;
import defpackage.m6a0;
import defpackage.mvg;
import defpackage.n6a0;
import defpackage.ny61;
import defpackage.oea0;
import defpackage.wls;
import defpackage.zy11;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.gopayments.model.PaymentMethod$Type;

@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Loea0;", "models", "Lzy11;", "<anonymous>", "(Loea0;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.payments.lpm.domain.LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1", f = "LpmPaymentMethodsListSourceInteractorImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1 extends SuspendLambda implements wls {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1(e eVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1 lpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1 = new LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1(this.this$0, continuation);
        lpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1.L$0 = obj;
        return lpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1 lpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1 = (LpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1) create((oea0) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        lpmPaymentMethodsListSourceInteractorImpl$paymentOptionsFlow$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:43:0x00be, code lost:
    
        if (r4 != null) goto L56;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        oea0 oea0Var = (oea0) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        e eVar = this.this$0;
        com.yandex.go.payments.data.c cVar = eVar.g;
        Pair pair = (Pair) cVar.f.getAndSet(null);
        if (pair != null) {
            String str = (String) pair.getFirst();
            PaymentMethod$Type paymentMethod$Type = (PaymentMethod$Type) pair.getSecond();
            List<lea0> list = oea0Var.a;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                for (lea0 lea0Var : list) {
                    if (jl40.l(lea0Var.getId(), str) && lea0Var.c() == paymentMethod$Type) {
                        eVar.m = 0;
                        eVar.k.i(str, paymentMethod$Type);
                        break;
                    }
                }
            }
            int i = eVar.m + 1;
            eVar.m = i;
            if (i < 5) {
                cVar.f.set(new Pair(str, paymentMethod$Type));
            } else {
                eVar.m = 0;
            }
        }
        c9v c9vVar = this.this$0.k;
        r0 r0Var = (r0) c9vVar.c;
        if (!oea0Var.a()) {
            m6a0 m6a0Var = (m6a0) r0Var.getValue();
            if (m6a0Var != null) {
                Iterator it = oea0Var.a.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it.next();
                    lea0 lea0Var2 = (lea0) obj2;
                    if (jl40.l(lea0Var2.getId(), m6a0Var.b) && lea0Var2.c() == m6a0Var.a) {
                        break;
                    }
                }
            }
            lea0 lea0Var3 = oea0Var.c;
            if (lea0Var3 == 0 || lea0Var3.d() || ((lea0Var3 instanceof f731) && !((f731) lea0Var3).a())) {
                r0Var.l(null);
            } else {
                n6a0 n6a0Var = (n6a0) c9vVar.b;
                PaymentMethod$Type c = lea0Var3.c();
                String id = lea0Var3.getId();
                m6a0 m6a0Var2 = (m6a0) r0Var.getValue();
                m6a0 m6a0Var3 = m6a0Var2 != null ? m6a0Var2.c : null;
                n6a0Var.getClass();
                r0Var.m(null, new m6a0(c, id, m6a0Var3));
            }
        }
        return zy11.a;
    }
}
