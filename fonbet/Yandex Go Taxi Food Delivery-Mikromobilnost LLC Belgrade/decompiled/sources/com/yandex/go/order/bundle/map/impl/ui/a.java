package com.yandex.go.order.bundle.map.impl.ui;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.pu6;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public a(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1 bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof BundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1) {
            bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = (BundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : (List) obj) {
                        if (obj4 instanceof pu6) {
                            arrayList.add(obj4);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (jl40.l(((pu6) obj2).a, this.b)) {
                            break;
                        }
                    }
                    pu6 pu6Var = (pu6) obj2;
                    List list = pu6Var != null ? pu6Var.g : null;
                    if (list != null) {
                        bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$0 = null;
                        bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$1 = null;
                        bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$2 = null;
                        bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$3 = null;
                        bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1.L$4 = null;
                        bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(list, bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1 = new BundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
