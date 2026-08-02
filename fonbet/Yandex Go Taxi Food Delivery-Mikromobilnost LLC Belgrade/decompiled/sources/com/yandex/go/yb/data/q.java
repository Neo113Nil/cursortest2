package com.yandex.go.yb.data;

import defpackage.mw51;
import defpackage.nw51;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class q implements vpr {
    public final /* synthetic */ vpr a;

    public q(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YbSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1 ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof YbSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1) {
            ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1 = (YbSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1) continuation;
            int i2 = ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (!(((nw51) obj) instanceof mw51)) {
                        ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1.L$0 = null;
                        ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1.L$1 = null;
                        ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1.L$2 = null;
                        ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1.L$3 = null;
                        ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1 = new YbSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkWrapper$shouldProcessUpdateBalanceRequest$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
