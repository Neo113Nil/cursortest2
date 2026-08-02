package com.yandex.go.rida.bids.ui;

import defpackage.eq5;
import defpackage.ny61;
import defpackage.rol0;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements tpr {
    public final /* synthetic */ rol0 a;
    public final /* synthetic */ eq5 b;

    public b(rol0 rol0Var, eq5 eq5Var) {
        this.a = rol0Var;
        this.b = eq5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1 bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof BidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1) {
            bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1 = (BidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1) continuation;
            int i2 = bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    a aVar = new a(vprVar, this.b);
                    bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1.L$0 = null;
                    bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1.L$1 = null;
                    bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1.L$2 = null;
                    bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(aVar, bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1) == coroutineSingletons) {
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
        bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1 = new BidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1(this, continuation);
        Object obj2 = bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = bidsDriveCardKt$DriversProgress$lambda$4$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
