package com.yandex.go.taxi.order.overlay;

import com.yandex.go.taxi.order.bubble.model.Bubble$Type;
import defpackage.gi70;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ g b;

    public b(vpr vprVar, g gVar) {
        this.a = vprVar;
        this.b = gVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        if (r6.emit(r8, r0) != r1) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x008f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0076, code lost:
    
        if (r8 == r1) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        OrderBubblesPresenter$listenCompanions$$inlined$map$1$2$1 orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1;
        int i;
        vpr vprVar;
        if (continuation instanceof OrderBubblesPresenter$listenCompanions$$inlined$map$1$2$1) {
            orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1 = (OrderBubblesPresenter$listenCompanions$$inlined$map$1$2$1) continuation;
            int i2 = orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    g gVar = this.b;
                    gi70 gi70Var = gVar.F;
                    List list = gVar.P;
                    orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$0 = null;
                    orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$1 = null;
                    orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$2 = null;
                    orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$3 = null;
                    vprVar = this.a;
                    orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$4 = vprVar;
                    orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$5 = null;
                    orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$6 = null;
                    orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.label = 1;
                    obj2 = gi70Var.a.a(list, Bubble$Type.COMBO, orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj2);
                        return zy11.a;
                    }
                    vprVar = (vpr) orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$4;
                    kotlin.b.b(obj2);
                }
                orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$0 = null;
                orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$1 = null;
                orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$2 = null;
                orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$3 = null;
                orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$4 = null;
                orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$5 = null;
                orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$6 = null;
                orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.label = 2;
            }
        }
        orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1 = new OrderBubblesPresenter$listenCompanions$$inlined$map$1$2$1(this, continuation);
        Object obj22 = orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$0 = null;
        orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$1 = null;
        orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$2 = null;
        orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$3 = null;
        orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$4 = null;
        orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$5 = null;
        orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.L$6 = null;
        orderBubblesPresenter$listenCompanions$$inlined$map$1$2$1.label = 2;
    }
}
