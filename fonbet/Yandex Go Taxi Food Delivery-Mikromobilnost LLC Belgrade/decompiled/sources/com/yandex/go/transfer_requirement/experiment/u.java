package com.yandex.go.transfer_requirement.experiment;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.ulx0;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class u implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ ulx0 b;

    public u(tpr tprVar, ulx0 ulx0Var) {
        this.a = tprVar;
        this.b = ulx0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        TransferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1 transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof TransferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1) {
            transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1 = (TransferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1) continuation;
            int i2 = transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t tVar = new t(vprVar, this.b);
                    transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1.L$0 = null;
                    transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1.L$1 = null;
                    transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1.L$2 = null;
                    transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(tVar, transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1 = new TransferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = transferRequirementExperimentRepository$experimentFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
