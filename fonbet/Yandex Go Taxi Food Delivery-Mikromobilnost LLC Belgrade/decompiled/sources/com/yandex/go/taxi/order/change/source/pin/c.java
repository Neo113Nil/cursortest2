package com.yandex.go.taxi.order.change.source.pin;

import com.yandex.go.coroutines.g;
import defpackage.an8;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ an8 b;

    public c(vpr vprVar, an8 an8Var) {
        this.a = vprVar;
        this.b = an8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ChangeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1 changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ChangeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1) {
            changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1 = (ChangeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1) continuation;
            int i2 = changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    long longValue = ((Number) obj).longValue();
                    if (!((g) this.b.x).d) {
                        longValue = 1000;
                    }
                    Long l = new Long(longValue);
                    changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1.L$0 = null;
                    changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1.L$1 = null;
                    changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1.L$2 = null;
                    changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1.L$3 = null;
                    changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(l, changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1 = new ChangeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointPinEntryRepository$delayTimeFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
