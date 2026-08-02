package com.yandex.go.payments.sbp.data;

import com.yandex.go.payments.data.model.PaymentsBindingInProgress;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001H\n"}, d2 = {"<anonymous>", "", "Lcom/yandex/go/payments/data/model/PaymentsBindingInProgress;", "pm", "lpm"}, k = 3, mv = {2, 4, 0}, xi = 48)
@mvg(c = "com.yandex.go.payments.sbp.data.PaymentsBindingStatusRepository$bindingsInProgressFlow$1", f = "PaymentsBindingStatusRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class PaymentsBindingStatusRepository$bindingsInProgressFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        PaymentsBindingStatusRepository$bindingsInProgressFlow$1 paymentsBindingStatusRepository$bindingsInProgressFlow$1 = new PaymentsBindingStatusRepository$bindingsInProgressFlow$1(3, (Continuation) obj3);
        paymentsBindingStatusRepository$bindingsInProgressFlow$1.L$0 = (List) obj;
        paymentsBindingStatusRepository$bindingsInProgressFlow$1.L$1 = (List) obj2;
        return paymentsBindingStatusRepository$bindingsInProgressFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ArrayList m0 = kotlin.collections.a.m0(list2, list);
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = m0.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (hashSet.add(((PaymentsBindingInProgress) next).getB())) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
