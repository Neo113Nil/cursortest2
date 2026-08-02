package com.yandex.go.chargers.order.active;

import defpackage.ny61;
import defpackage.rl9;
import defpackage.vpr;
import defpackage.z8y;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class w implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ String b;

    public w(vpr vprVar, String str) {
        this.a = vprVar;
        this.b = str;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1 chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof ChargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1) {
            chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1 = (ChargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1) continuation;
            int i2 = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    List list = ((rl9) obj).a;
                    ArrayList arrayList = new ArrayList();
                    for (Object obj4 : list) {
                        if (obj4 instanceof z8y) {
                            arrayList.add(obj4);
                        }
                    }
                    Iterator it = arrayList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            obj2 = null;
                            break;
                        }
                        obj2 = it.next();
                        if (((z8y) obj2).a.equals(this.b)) {
                            break;
                        }
                    }
                    z8y z8yVar = (z8y) obj2;
                    List list2 = z8yVar != null ? z8yVar.q : null;
                    if (list2 != null) {
                        chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1.L$0 = null;
                        chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1.L$1 = null;
                        chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1.L$2 = null;
                        chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1.L$3 = null;
                        chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1.L$4 = null;
                        chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1.label = 1;
                        if (this.a.emit(list2, chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1 = new ChargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1(this, continuation);
        Object obj32 = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderUiStateInteractor$notificationsFlow$$inlined$mapNotNull$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
