package com.yandex.go.ugc;

import com.yandex.go.ugc.entities.UGCItemExperiment;
import defpackage.d6z;
import defpackage.hs11;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
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
        UGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1 uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof UGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1) {
            uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1 = (UGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1) continuation;
            int i2 = uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    UGCItemExperiment uGCItemExperiment = (UGCItemExperiment) obj;
                    hs11 hs11Var = new hs11(d6z.Y(uGCItemExperiment, uGCItemExperiment.d.a), d6z.Y(uGCItemExperiment, uGCItemExperiment.d.b), uGCItemExperiment.b());
                    uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1.L$0 = null;
                    uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1.L$1 = null;
                    uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1.L$2 = null;
                    uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1.L$3 = null;
                    uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(hs11Var, uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1 = new UGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = uGCItemInteractorImpl$experimentFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
