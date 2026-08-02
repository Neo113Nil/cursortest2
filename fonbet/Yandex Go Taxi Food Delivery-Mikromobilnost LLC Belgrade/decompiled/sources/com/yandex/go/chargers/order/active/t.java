package com.yandex.go.chargers.order.active;

import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class t implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ f b;

    public t(mth mthVar, f fVar) {
        this.a = mthVar;
        this.b = fVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1 chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1) {
            chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1 = (ChargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1) continuation;
            int i2 = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    s sVar = new s(vprVar, this.b);
                    chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1.L$0 = null;
                    chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1.L$1 = null;
                    chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1.L$2 = null;
                    chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(sVar, chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1 = new ChargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
