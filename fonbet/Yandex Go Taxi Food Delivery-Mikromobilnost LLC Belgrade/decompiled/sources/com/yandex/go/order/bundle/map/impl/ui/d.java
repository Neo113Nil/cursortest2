package com.yandex.go.order.bundle.map.impl.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ List b;

    public d(tpr tprVar, List list) {
        this.a = tprVar;
        this.b = list;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1 bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1;
        int i;
        if (continuation instanceof BundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1) {
            bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1 = (BundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1) continuation;
            int i2 = bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1.L$0 = null;
                    bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1.L$1 = null;
                    bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1.L$2 = null;
                    bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1) == coroutineSingletons) {
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
        bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1 = new BundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1(this, continuation);
        Object obj2 = bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bundledOrderListViewModel$listenOrders$1$invokeSuspend$lambda$2$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
