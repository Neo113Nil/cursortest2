package com.yandex.go.taxi.order.change.source.pin;

import defpackage.an8;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class f implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ an8 b;

    public f(r0 r0Var, an8 an8Var) {
        this.a = r0Var;
        this.b = an8Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ChangeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1 changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof ChangeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1) {
            changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1 = (ChangeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1) continuation;
            int i2 = changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    e eVar = new e(vprVar, this.b);
                    changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1.L$0 = null;
                    changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1.L$1 = null;
                    changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1.L$2 = null;
                    changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(eVar, changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1 = new ChangeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = changeSourcePointPinEntryRepository$showingTimeFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
