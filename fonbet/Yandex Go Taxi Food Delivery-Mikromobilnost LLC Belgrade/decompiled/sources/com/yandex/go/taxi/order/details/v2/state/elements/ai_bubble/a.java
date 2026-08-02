package com.yandex.go.taxi.order.details.v2.state.elements.ai_bubble;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$AiBubble;
import defpackage.ibk0;
import defpackage.ny61;
import defpackage.obk0;
import defpackage.pbk0;
import defpackage.qbk0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ RideCardItemDto$AiBubble b;
    public final /* synthetic */ pbk0 c;
    public final /* synthetic */ obk0 w;
    public final /* synthetic */ ibk0 x;

    public a(vpr vprVar, RideCardItemDto$AiBubble rideCardItemDto$AiBubble, pbk0 pbk0Var, obk0 obk0Var, ibk0 ibk0Var) {
        this.a = vprVar;
        this.b = rideCardItemDto$AiBubble;
        this.c = pbk0Var;
        this.w = obk0Var;
        this.x = ibk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1 rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1) {
            rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1 = (RideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    RideCardItemDto$AiBubble rideCardItemDto$AiBubble = this.b;
                    qbk0 qbk0Var = new qbk0(rideCardItemDto$AiBubble.a, rideCardItemDto$AiBubble.b, this.c, this.w, this.x, list);
                    rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(qbk0Var, rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1 = new RideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
