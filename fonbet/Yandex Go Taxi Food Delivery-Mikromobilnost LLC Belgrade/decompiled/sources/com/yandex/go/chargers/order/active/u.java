package com.yandex.go.chargers.order.active;

import defpackage.il9;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.yca;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class u implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ il9 b;

    public u(vpr vprVar, il9 il9Var) {
        this.a = vprVar;
        this.b = il9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1 chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof ChargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1) {
            chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1 = (ChargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1) continuation;
            int i2 = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Set n = this.b.j.a.n("CHARGERS_ACTIVE_ORDERS_COMPLETED_NOTIFICATION_ID_KEY");
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (!n.contains(((yca) obj3).a)) {
                            arrayList.add(obj3);
                        }
                    }
                    chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1.L$0 = null;
                    chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1.L$1 = null;
                    chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1.L$2 = null;
                    chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1.L$3 = null;
                    chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(arrayList, chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1) == coroutineSingletons) {
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
        chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1 = new ChargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1(this, continuation);
        Object obj22 = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
