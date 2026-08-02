package com.yandex.go.taxi.order.titles;

import defpackage.d980;
import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ jqr a;
    public final /* synthetic */ d980 b;

    public b(jqr jqrVar, d980 d980Var) {
        this.a = jqrVar;
        this.b = d980Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1 orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1;
        int i;
        if (continuation instanceof OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1) {
            orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1 = (OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1) continuation;
            int i2 = orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1.L$0 = null;
                    orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1.L$1 = null;
                    orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1.L$2 = null;
                    orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1 = new OrderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1(this, continuation);
        Object obj2 = orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderTitlesController$attachLifecycleObserver$1$onStart$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
