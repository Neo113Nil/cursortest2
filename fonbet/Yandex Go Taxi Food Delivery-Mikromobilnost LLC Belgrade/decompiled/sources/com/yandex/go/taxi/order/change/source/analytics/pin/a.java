package com.yandex.go.taxi.order.change.source.analytics.pin;

import defpackage.hg9;
import defpackage.ny61;
import defpackage.sf9;
import defpackage.tf9;
import defpackage.uf9;
import defpackage.vpr;
import defpackage.w511;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import ru.yandex.taxi.address.repository.AddressResolveRepository;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChangeSourcePointPinStateRepository$special$$inlined$map$1$2$1 changeSourcePointPinStateRepository$special$$inlined$map$1$2$1;
        int i;
        Object tf9Var;
        if (continuation instanceof ChangeSourcePointPinStateRepository$special$$inlined$map$1$2$1) {
            changeSourcePointPinStateRepository$special$$inlined$map$1$2$1 = (ChangeSourcePointPinStateRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = changeSourcePointPinStateRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointPinStateRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = changeSourcePointPinStateRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointPinStateRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    int i3 = hg9.a[((AddressResolveRepository.State) obj).ordinal()];
                    int i4 = 0;
                    if (i3 == 1 || i3 == 2) {
                        tf9Var = new tf9(i4);
                    } else if (i3 == 3) {
                        tf9Var = uf9.a;
                    } else {
                        if (i3 != 4 && i3 != 5) {
                            w511.b();
                            return null;
                        }
                        tf9Var = new sf9(i4);
                    }
                    changeSourcePointPinStateRepository$special$$inlined$map$1$2$1.L$0 = null;
                    changeSourcePointPinStateRepository$special$$inlined$map$1$2$1.L$1 = null;
                    changeSourcePointPinStateRepository$special$$inlined$map$1$2$1.L$2 = null;
                    changeSourcePointPinStateRepository$special$$inlined$map$1$2$1.L$3 = null;
                    changeSourcePointPinStateRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(tf9Var, changeSourcePointPinStateRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
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
        changeSourcePointPinStateRepository$special$$inlined$map$1$2$1 = new ChangeSourcePointPinStateRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = changeSourcePointPinStateRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointPinStateRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
