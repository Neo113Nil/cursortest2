package com.yandex.go.navigator.order;

import defpackage.j73;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.s850;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00000\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Ls850;", "navigatorOrder", "walkNavOrder", "", "<anonymous>", "(Ls850;Ls850;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "com.yandex.go.navigator.order.NavigationOrdersRepositoryImpl$ordersFlow$1", f = "NavigationOrdersRepositoryImpl.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes8.dex */
final class NavigationOrdersRepositoryImpl$ordersFlow$1 extends SuspendLambda implements zls {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        NavigationOrdersRepositoryImpl$ordersFlow$1 navigationOrdersRepositoryImpl$ordersFlow$1 = new NavigationOrdersRepositoryImpl$ordersFlow$1(3, (Continuation) obj3);
        navigationOrdersRepositoryImpl$ordersFlow$1.L$0 = (s850) obj;
        navigationOrdersRepositoryImpl$ordersFlow$1.L$1 = (s850) obj2;
        return navigationOrdersRepositoryImpl$ordersFlow$1.invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        s850 s850Var = (s850) this.L$0;
        s850 s850Var2 = (s850) this.L$1;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            kotlin.b.b(obj);
            return j73.A(new s850[]{s850Var, s850Var2});
        }
        ny61.r("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
