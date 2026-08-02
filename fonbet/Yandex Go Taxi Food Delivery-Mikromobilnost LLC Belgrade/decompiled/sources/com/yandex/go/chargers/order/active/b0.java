package com.yandex.go.chargers.order.active;

import com.yandex.go.chargers.api.ChargersActiveOrderStatus;
import defpackage.il9;
import defpackage.ny61;
import defpackage.rl9;
import defpackage.taa;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class b0 implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ il9 b;

    public b0(vpr vprVar, il9 il9Var) {
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
        ChargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) {
            chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = (ChargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) continuation;
            int i2 = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List list = ((rl9) obj).a;
                    this.b.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : list) {
                        if (((taa) obj3).b().compareTo(ChargersActiveOrderStatus.LEASING) <= 0) {
                            arrayList.add(obj3);
                        }
                    }
                    Integer num = new Integer(arrayList.size());
                    chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$0 = null;
                    chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$1 = null;
                    chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$2 = null;
                    chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.L$3 = null;
                    chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(num, chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1 = new ChargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersActiveOrderUiStateInteractor$uiStateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
