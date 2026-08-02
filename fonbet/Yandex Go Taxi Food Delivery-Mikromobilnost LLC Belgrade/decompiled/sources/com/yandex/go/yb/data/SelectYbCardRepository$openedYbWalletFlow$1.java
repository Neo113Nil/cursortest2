package com.yandex.go.yb.data;

import defpackage.bms;
import defpackage.jl40;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.uy51;
import defpackage.wy51;
import defpackage.yy51;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lwy51;", "walletState", "Lzy11;", "<unused var>", "", "Llea0;", "paymentModels", "Lyy51;", "<anonymous>", "(Lcom/yandex/go/yb/api/domain/YbWalletOpenedState;VLjava/util/List;)Lcom/yandex/go/payments/payment/YbWalletPayment;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.yb.data.SelectYbCardRepository$openedYbWalletFlow$1", f = "SelectYbCardRepository.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes15.dex */
final class SelectYbCardRepository$openedYbWalletFlow$1 extends SuspendLambda implements bms {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SelectYbCardRepository$openedYbWalletFlow$1 selectYbCardRepository$openedYbWalletFlow$1 = new SelectYbCardRepository$openedYbWalletFlow$1(4, (Continuation) obj4);
        selectYbCardRepository$openedYbWalletFlow$1.L$0 = (wy51) obj;
        selectYbCardRepository$openedYbWalletFlow$1.L$1 = (List) obj3;
        return selectYbCardRepository$openedYbWalletFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        wy51 wy51Var = (wy51) this.L$0;
        List list = (List) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (obj2 instanceof yy51) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            yy51 yy51Var = (yy51) next;
            if ((wy51Var instanceof uy51) && jl40.l(yy51Var.a, ((uy51) wy51Var).a)) {
                return next;
            }
        }
        return null;
    }
}
