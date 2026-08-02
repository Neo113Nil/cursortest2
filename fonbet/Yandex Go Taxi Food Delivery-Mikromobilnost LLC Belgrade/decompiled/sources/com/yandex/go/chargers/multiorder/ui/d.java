package com.yandex.go.chargers.multiorder.ui;

import defpackage.a4a;
import defpackage.ny61;
import defpackage.taa;
import defpackage.vpr;
import defpackage.y3a;
import defpackage.z3a;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;

    public d(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1 chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1) {
            chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1 = (ChargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1) continuation;
            int i2 = chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = (List) obj;
                    int size = list.size();
                    Object a4aVar = size != 0 ? size != 1 ? y3a.a : new a4a(((taa) kotlin.collections.a.P(list)).a()) : z3a.a;
                    chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1.L$0 = null;
                    chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1.L$1 = null;
                    chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1.L$2 = null;
                    chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1.L$3 = null;
                    chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a4aVar, chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1 = new ChargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersMultiOrderUiStateInteractor$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
