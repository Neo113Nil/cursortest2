package com.yandex.go.chargers.order.data;

import defpackage.ml9;
import defpackage.nar;
import defpackage.ny61;
import defpackage.v4r0;
import defpackage.vpr;
import defpackage.zy11;
import java.util.Set;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ml9 b;

    public a(vpr vprVar, ml9 ml9Var) {
        this.a = vprVar;
        this.b = ml9Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1 chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1;
        int i;
        Object value;
        r0 r0Var = this.b.a;
        if (continuation instanceof ChargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1) {
            chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1 = (ChargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1) continuation;
            int i2 = chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    nar narVar = (nar) obj;
                    if (!((Set) r0Var.getValue()).contains(narVar.a())) {
                        do {
                            value = r0Var.getValue();
                        } while (!r0Var.k(value, v4r0.i((Set) value, narVar.a())));
                        chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1.L$0 = null;
                        chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1.L$1 = null;
                        chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1.L$2 = null;
                        chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1.L$3 = null;
                        chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1) == coroutineSingletons) {
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
        chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1 = new ChargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrdersRemoveEventsRepository$special$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
