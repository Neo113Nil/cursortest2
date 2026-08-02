package com.yandex.go.order.bundle.map.impl.ui;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b implements tpr {
    public final /* synthetic */ ru.yandex.taxi.widgets.data.repository.widget_models.b a;
    public final /* synthetic */ String b;

    public b(ru.yandex.taxi.widgets.data.repository.widget_models.b bVar, String str) {
        this.a = bVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1 bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1;
        int i;
        if (continuation instanceof BundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1) {
            bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1 = (BundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1) continuation;
            int i2 = bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1.L$0 = null;
                    bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1.L$1 = null;
                    bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1.L$2 = null;
                    bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1.label = 1;
                    if (this.a.collect(aVar, bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1) == coroutineSingletons) {
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
        bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1 = new BundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1(this, continuation);
        Object obj2 = bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bundledOrderListViewModel$listenOrders$1$invokeSuspend$$inlined$mapNotNull$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
