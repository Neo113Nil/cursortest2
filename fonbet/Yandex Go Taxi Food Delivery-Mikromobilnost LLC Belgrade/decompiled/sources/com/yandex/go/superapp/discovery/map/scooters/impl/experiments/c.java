package com.yandex.go.superapp.discovery.map.scooters.impl.experiments;

import com.yandex.go.superapp.discovery.map.scooters.impl.experiments.SuperAppDiscoveryMapScootersExperiment;
import defpackage.evu0;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.quv0;
import defpackage.rqo;
import defpackage.tpr;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes14.dex */
public final class c implements q, quv0 {
    public final /* synthetic */ q a;

    public c(rqo rqoVar) {
        this.a = ((jbh) rqoVar).d(SuperAppDiscoveryMapScootersExperiment.d);
    }

    @Override // defpackage.t1b0
    public final tpr a() {
        return this.a.a();
    }

    @Override // defpackage.t1b0
    public final Object b(Continuation continuation) {
        return this.a.b(continuation);
    }

    @Override // defpackage.t1b0
    public final Object c() {
        return (SuperAppDiscoveryMapScootersExperiment) this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // defpackage.quv0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Continuation continuation) {
        SuperAppDiscoveryMapScootersExperimentRepository$isAvailable$1 superAppDiscoveryMapScootersExperimentRepository$isAvailable$1;
        int i;
        if (continuation instanceof SuperAppDiscoveryMapScootersExperimentRepository$isAvailable$1) {
            superAppDiscoveryMapScootersExperimentRepository$isAvailable$1 = (SuperAppDiscoveryMapScootersExperimentRepository$isAvailable$1) continuation;
            int i2 = superAppDiscoveryMapScootersExperimentRepository$isAvailable$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppDiscoveryMapScootersExperimentRepository$isAvailable$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppDiscoveryMapScootersExperimentRepository$isAvailable$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppDiscoveryMapScootersExperimentRepository$isAvailable$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    superAppDiscoveryMapScootersExperimentRepository$isAvailable$1.label = 1;
                    obj = this.a.b(superAppDiscoveryMapScootersExperimentRepository$isAvailable$1);
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
                SuperAppDiscoveryMapScootersExperiment superAppDiscoveryMapScootersExperiment = (SuperAppDiscoveryMapScootersExperiment) obj;
                boolean b = superAppDiscoveryMapScootersExperiment.getB();
                SuperAppDiscoveryMapScootersExperiment.EboksParams eboksParams = superAppDiscoveryMapScootersExperiment.c;
                return Boolean.valueOf((b || evu0.J(eboksParams.a) || evu0.J(eboksParams.b)) ? false : true);
            }
        }
        superAppDiscoveryMapScootersExperimentRepository$isAvailable$1 = new SuperAppDiscoveryMapScootersExperimentRepository$isAvailable$1(this, (ContinuationImpl) continuation);
        Object obj2 = superAppDiscoveryMapScootersExperimentRepository$isAvailable$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppDiscoveryMapScootersExperimentRepository$isAvailable$1.label;
        if (i != 0) {
        }
        SuperAppDiscoveryMapScootersExperiment superAppDiscoveryMapScootersExperiment2 = (SuperAppDiscoveryMapScootersExperiment) obj2;
        boolean b2 = superAppDiscoveryMapScootersExperiment2.getB();
        SuperAppDiscoveryMapScootersExperiment.EboksParams eboksParams2 = superAppDiscoveryMapScootersExperiment2.c;
        return Boolean.valueOf((b2 || evu0.J(eboksParams2.a) || evu0.J(eboksParams2.b)) ? false : true);
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
