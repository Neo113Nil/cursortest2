package com.yandex.go.payments.shared;

import com.yandex.go.zone.model.Zone;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.wnr0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class p implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ wnr0 b;

    public p(vpr vprVar, wnr0 wnr0Var) {
        this.a = vprVar;
        this.b = wnr0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        SharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1 sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof SharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1) {
            sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1 = (SharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1) continuation;
            int i2 = sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    SharedPaymentExperiment a = this.b.a((Zone) obj);
                    sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1.L$0 = null;
                    sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1.L$1 = null;
                    sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1.L$2 = null;
                    sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1.L$3 = null;
                    sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1) == coroutineSingletons) {
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
        sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1 = new SharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1(this, continuation);
        Object obj22 = sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentExperimentsProvider$observeExperiment$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
