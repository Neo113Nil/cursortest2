package com.yandex.go.taxi.order.overlay;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import defpackage.gh00;
import defpackage.gi70;
import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import java.util.Map;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes14.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public d(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ad, code lost:
    
        if (r10.emit(r12, r6) != r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1 orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        TaxiOrder b;
        if (continuation instanceof OrderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1) {
            orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1 = (OrderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1) continuation;
            int i2 = orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                OrderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1 orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12 = orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1;
                Object obj2 = orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    vpr vprVar2 = this.a;
                    g gVar = this.b;
                    gi70 gi70Var = gVar.F;
                    List list = gVar.O;
                    Map map = gVar.N;
                    o2y0 o2y0Var = gVar.L;
                    DriveState driveState = (o2y0Var == null || (b = o2y0Var.b()) == null) ? null : b.h.b;
                    orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$0 = null;
                    orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$1 = null;
                    orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$2 = null;
                    orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$3 = null;
                    orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$4 = vprVar2;
                    orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$5 = null;
                    orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$6 = null;
                    orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.label = 1;
                    Object b2 = gi70Var.a.b(list, map, driveState, ((gh00) gi70Var.b).j(), orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12);
                    if (b2 != coroutineSingletons) {
                        obj2 = b2;
                        vprVar = vprVar2;
                    }
                    return coroutineSingletons;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                    return zy11.a;
                }
                vprVar = (vpr) orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$4;
                kotlin.b.b(obj2);
                orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$0 = null;
                orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$1 = null;
                orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$2 = null;
                orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$3 = null;
                orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$4 = null;
                orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$5 = null;
                orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.L$6 = null;
                orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$12.label = 2;
            }
        }
        orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1 = new OrderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1(this, continuation);
        OrderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1 orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$122 = orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$1;
        Object obj22 = orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$122.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$122.label;
        if (i != 0) {
        }
        orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$122.L$0 = null;
        orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$122.L$1 = null;
        orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$122.L$2 = null;
        orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$122.L$3 = null;
        orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$122.L$4 = null;
        orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$122.L$5 = null;
        orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$122.L$6 = null;
        orderBubblesPresenter$listenUpdateRouteBubbles$$inlined$map$1$2$122.label = 2;
    }
}
