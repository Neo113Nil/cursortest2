package com.yandex.go.yb.lack_of_order.domain;

import defpackage.ny61;
import defpackage.o2y0;
import defpackage.vpr;
import defpackage.wl40;
import defpackage.zy11;
import java.util.List;
import java.util.Optional;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.object.DriveState;

/* loaded from: classes15.dex */
public final class f implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ l b;

    public f(vpr vprVar, l lVar) {
        this.a = vprVar;
        this.b = lVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        TaxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1 taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1;
        int i;
        Optional empty;
        if (continuation instanceof TaxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1) {
            taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1 = (TaxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    wl40 wl40Var = (wl40) obj;
                    this.b.getClass();
                    int j = wl40Var.j();
                    List list = wl40Var.a;
                    if (j == 1 && list.size() == 1) {
                        o2y0 o2y0Var = (o2y0) list.get(0);
                        empty = o2y0Var.c() == DriveState.COMPLETE ? Optional.empty() : Optional.of(o2y0Var);
                    } else {
                        empty = Optional.empty();
                    }
                    taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(empty, taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1 = new TaxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderMoneyLackIntentInteractor$_get_intentFlow_$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
