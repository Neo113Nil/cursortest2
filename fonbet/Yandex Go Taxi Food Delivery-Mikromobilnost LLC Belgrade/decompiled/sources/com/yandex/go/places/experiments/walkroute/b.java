package com.yandex.go.places.experiments.walkroute;

import defpackage.ak80;
import defpackage.i3y;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.sk80;
import defpackage.t1b0;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class b {
    public final rqo a;
    public final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new ak80(2, this));

    public b(rqo rqoVar) {
        this.a = rqoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        OrganizationWalkingRouteExperimentRepository$getConfig$1 organizationWalkingRouteExperimentRepository$getConfig$1;
        int i;
        if (continuationImpl instanceof OrganizationWalkingRouteExperimentRepository$getConfig$1) {
            organizationWalkingRouteExperimentRepository$getConfig$1 = (OrganizationWalkingRouteExperimentRepository$getConfig$1) continuationImpl;
            int i2 = organizationWalkingRouteExperimentRepository$getConfig$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                organizationWalkingRouteExperimentRepository$getConfig$1.label = i2 - Integer.MIN_VALUE;
                Object obj = organizationWalkingRouteExperimentRepository$getConfig$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = organizationWalkingRouteExperimentRepository$getConfig$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.b.getValue();
                    organizationWalkingRouteExperimentRepository$getConfig$1.label = 1;
                    obj = t1b0Var.b(organizationWalkingRouteExperimentRepository$getConfig$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                OrganizationWalkingRouteExperiment organizationWalkingRouteExperiment = (OrganizationWalkingRouteExperiment) obj;
                return new sk80(organizationWalkingRouteExperiment.c, organizationWalkingRouteExperiment.d);
            }
        }
        organizationWalkingRouteExperimentRepository$getConfig$1 = new OrganizationWalkingRouteExperimentRepository$getConfig$1(this, continuationImpl);
        Object obj2 = organizationWalkingRouteExperimentRepository$getConfig$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = organizationWalkingRouteExperimentRepository$getConfig$1.label;
        if (i != 0) {
        }
        OrganizationWalkingRouteExperiment organizationWalkingRouteExperiment2 = (OrganizationWalkingRouteExperiment) obj2;
        return new sk80(organizationWalkingRouteExperiment2.c, organizationWalkingRouteExperiment2.d);
    }
}
