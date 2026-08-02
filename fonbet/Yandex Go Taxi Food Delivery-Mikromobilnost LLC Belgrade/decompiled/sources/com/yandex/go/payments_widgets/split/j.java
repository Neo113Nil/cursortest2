package com.yandex.go.payments_widgets.split;

import defpackage.ex51;
import defpackage.lt51;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class j implements vpr {
    public final /* synthetic */ vpr a;

    public j(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        YbSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1 ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof YbSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1) {
            ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1 = (YbSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1) continuation;
            int i2 = ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ex51 ex51Var = ((lt51) obj).b;
                    ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1.L$0 = null;
                    ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1.L$1 = null;
                    ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1.L$2 = null;
                    ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1.L$3 = null;
                    ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(ex51Var, ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1) == coroutineSingletons) {
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
        ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1 = new YbSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1(this, continuation);
        Object obj22 = ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSplitWidgetsInteractor$ybSplitState$lambda$1$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
