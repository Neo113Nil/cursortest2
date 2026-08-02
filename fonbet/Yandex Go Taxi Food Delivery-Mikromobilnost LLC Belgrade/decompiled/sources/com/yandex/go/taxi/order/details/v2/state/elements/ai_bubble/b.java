package com.yandex.go.taxi.order.details.v2.state.elements.ai_bubble;

import com.yandex.go.taxi.order.models.api.response.RideCardItemDto$AiBubble;
import defpackage.ibk0;
import defpackage.ny61;
import defpackage.obk0;
import defpackage.pbk0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class b implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ RideCardItemDto$AiBubble b;
    public final /* synthetic */ pbk0 c;
    public final /* synthetic */ obk0 w;
    public final /* synthetic */ ibk0 x;

    public b(tpr tprVar, RideCardItemDto$AiBubble rideCardItemDto$AiBubble, pbk0 pbk0Var, obk0 obk0Var, ibk0 ibk0Var) {
        this.a = tprVar;
        this.b = rideCardItemDto$AiBubble;
        this.c = pbk0Var;
        this.w = obk0Var;
        this.x = ibk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1 rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof RideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1) {
            rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1 = (RideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1) continuation;
            int i2 = rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b, this.c, this.w, this.x);
                    rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1.L$0 = null;
                    rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1.L$1 = null;
                    rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1.L$2 = null;
                    rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1 = new RideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rideCardAiBubbleItemDataSource$stateFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
