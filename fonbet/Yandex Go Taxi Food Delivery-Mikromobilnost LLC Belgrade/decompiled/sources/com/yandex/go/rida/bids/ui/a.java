package com.yandex.go.rida.bids.ui;

import defpackage.e3n;
import defpackage.eq5;
import defpackage.kp50;
import defpackage.ny61;
import defpackage.o430;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.time.DurationUnit;

/* loaded from: classes13.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ eq5 b;

    public a(vpr vprVar, eq5 eq5Var) {
        this.a = vprVar;
        this.b = eq5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1 bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof BidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1) {
            bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1 = (BidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1) continuation;
            int i2 = bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    o430 o430Var = e3n.b;
                    Long l = new Long(e3n.o(kp50.V(System.currentTimeMillis() - this.b.f, DurationUnit.MILLISECONDS), DurationUnit.SECONDS));
                    bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1.L$0 = null;
                    bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1.L$1 = null;
                    bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1.L$2 = null;
                    bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1.L$3 = null;
                    bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l, bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1 = new BidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
