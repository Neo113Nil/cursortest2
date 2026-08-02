package com.yandex.go.taxi.summary.shared.sourcedestination;

import defpackage.fnx0;
import defpackage.kb5;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
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
        SummaryControlStateInteractor$stateFlow$$inlined$map$1$2$1 summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SummaryControlStateInteractor$stateFlow$$inlined$map$1$2$1) {
            summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1 = (SummaryControlStateInteractor$stateFlow$$inlined$map$1$2$1) continuation;
            int i2 = summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    kb5 kb5Var = ((fnx0) obj).e;
                    summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1.L$0 = null;
                    summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1.L$1 = null;
                    summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1.L$2 = null;
                    summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1.L$3 = null;
                    summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(kb5Var, summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1 = new SummaryControlStateInteractor$stateFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = summaryControlStateInteractor$stateFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
