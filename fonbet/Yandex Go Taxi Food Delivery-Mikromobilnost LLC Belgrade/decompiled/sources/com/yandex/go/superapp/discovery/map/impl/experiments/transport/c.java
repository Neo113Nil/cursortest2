package com.yandex.go.superapp.discovery.map.impl.experiments.transport;

import defpackage.i3y;
import defpackage.ny61;
import defpackage.ogu0;
import defpackage.quv0;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.x35;
import defpackage.y35;
import defpackage.ztv0;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class c implements ztv0, quv0 {
    public final rqo a;
    public final i3y b = kotlin.a.b(LazyThreadSafetyMode.NONE, new ogu0(23, this));

    public c(rqo rqoVar) {
        this.a = rqoVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        SuperAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1 superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1;
        int i;
        if (continuationImpl instanceof SuperAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1) {
            superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1 = (SuperAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1) continuationImpl;
            int i2 = superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.b.getValue();
                    superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1.L$0 = str;
                    superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1.label = 1;
                    obj = t1b0Var.b(superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = (String) superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1.L$0;
                    kotlin.b.b(obj);
                }
                Map map = ((SuperAppDiscoveryMapTransportExperiment) obj).c;
                y35.a.getClass();
                return map.getOrDefault(str, x35.b);
            }
        }
        superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1 = new SuperAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1(this, continuationImpl);
        Object obj2 = superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapTransportExperimentRepository$getTransportExperiment$1.label;
        if (i != 0) {
        }
        Map map2 = ((SuperAppDiscoveryMapTransportExperiment) obj2).c;
        y35.a.getClass();
        return map2.getOrDefault(str, x35.b);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.quv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Continuation continuation) {
        SuperAppDiscoveryMapTransportExperimentRepository$isAvailable$1 superAppDiscoveryMapTransportExperimentRepository$isAvailable$1;
        int i;
        if (continuation instanceof SuperAppDiscoveryMapTransportExperimentRepository$isAvailable$1) {
            superAppDiscoveryMapTransportExperimentRepository$isAvailable$1 = (SuperAppDiscoveryMapTransportExperimentRepository$isAvailable$1) continuation;
            int i2 = superAppDiscoveryMapTransportExperimentRepository$isAvailable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapTransportExperimentRepository$isAvailable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapTransportExperimentRepository$isAvailable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapTransportExperimentRepository$isAvailable$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t1b0 t1b0Var = (t1b0) this.b.getValue();
                    superAppDiscoveryMapTransportExperimentRepository$isAvailable$1.label = 1;
                    obj = t1b0Var.b(superAppDiscoveryMapTransportExperimentRepository$isAvailable$1);
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
                return Boolean.valueOf(!((SuperAppDiscoveryMapTransportExperiment) obj).c.isEmpty());
            }
        }
        superAppDiscoveryMapTransportExperimentRepository$isAvailable$1 = new SuperAppDiscoveryMapTransportExperimentRepository$isAvailable$1(this, (ContinuationImpl) continuation);
        Object obj2 = superAppDiscoveryMapTransportExperimentRepository$isAvailable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapTransportExperimentRepository$isAvailable$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(!((SuperAppDiscoveryMapTransportExperiment) obj2).c.isEmpty());
    }
}
