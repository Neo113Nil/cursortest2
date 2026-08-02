package com.yandex.go.taxi.order.provider;

import com.yandex.go.taxi.order.models.api.TaxiOrder;
import com.yandex.go.zone.dto.objects.Notification;
import com.yandex.go.zone.dto.objects.ScheduledOrderDescriptionItem;
import defpackage.bu1;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xh60;
import defpackage.zy11;
import java.util.ArrayList;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class x implements vpr {
    public final /* synthetic */ vpr a;

    public x(vpr vprVar, bu1 bu1Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ScheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1 scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1;
        int i;
        Iterable iterable;
        Notification notification;
        if (continuation instanceof ScheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1) {
            scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1 = (ScheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1) continuation;
            int i2 = scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    xh60 b = ((TaxiOrder) obj).V().P.b("requirement_card_title");
                    if (b == null || (notification = (Notification) b.b) == null || (iterable = notification.e) == null) {
                        iterable = EmptyList.a;
                    }
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : iterable) {
                        if (((ScheduledOrderDescriptionItem) obj3).a.length() > 0) {
                            arrayList.add(obj3);
                        }
                    }
                    scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1.L$0 = null;
                    scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1.L$1 = null;
                    scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1.L$2 = null;
                    scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1.L$3 = null;
                    scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1 = new ScheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scheduledInstructionsProvider$instructionsFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
