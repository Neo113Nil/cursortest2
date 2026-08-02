package com.yandex.go.chargers.data;

import defpackage.cne0;
import defpackage.dne0;
import defpackage.g050;
import defpackage.gtq0;
import defpackage.ny61;
import defpackage.v4r0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class b {
    public final cne0 a;
    public final kotlinx.coroutines.sync.a b = gtq0.a();

    public b(dne0 dne0Var) {
        this.a = dne0Var.a("CHARGERS_ACTIVE_ORDERS_COMPLETED_NOTIFICATION_NAME");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r1v6, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r7v5, types: [g050] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ArrayList arrayList, ContinuationImpl continuationImpl) {
        ChargersActiveOrdersNotificationRepository$saveShownNotificationIds$1 chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1;
        int i;
        kotlinx.coroutines.sync.a aVar;
        try {
            if (continuationImpl instanceof ChargersActiveOrdersNotificationRepository$saveShownNotificationIds$1) {
                chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1 = (ChargersActiveOrdersNotificationRepository$saveShownNotificationIds$1) continuationImpl;
                int i2 = chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1.L$0 = arrayList;
                        aVar = this.b;
                        chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1.L$1 = aVar;
                        chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1.label = 1;
                        if (aVar.a(chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        ?? r7 = (g050) chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1.L$1;
                        ?? r1 = (List) chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1.L$0;
                        kotlin.b.b(obj);
                        aVar = r7;
                        arrayList = r1;
                    }
                    cne0 cne0Var = this.a;
                    cne0Var.t("CHARGERS_ACTIVE_ORDERS_COMPLETED_NOTIFICATION_ID_KEY", v4r0.h(cne0Var.n("CHARGERS_ACTIVE_ORDERS_COMPLETED_NOTIFICATION_ID_KEY"), arrayList));
                    aVar.d(null);
                    return zy11.a;
                }
            }
            cne0 cne0Var2 = this.a;
            cne0Var2.t("CHARGERS_ACTIVE_ORDERS_COMPLETED_NOTIFICATION_ID_KEY", v4r0.h(cne0Var2.n("CHARGERS_ACTIVE_ORDERS_COMPLETED_NOTIFICATION_ID_KEY"), arrayList));
            aVar.d(null);
            return zy11.a;
        } catch (Throwable th) {
            aVar.d(null);
            throw th;
        }
        chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1 = new ChargersActiveOrdersNotificationRepository$saveShownNotificationIds$1(this, continuationImpl);
        Object obj2 = chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrdersNotificationRepository$saveShownNotificationIds$1.label;
        if (i != 0) {
        }
    }
}
