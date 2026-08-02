package com.yandex.go.chargers.data;

import com.yandex.go.chargers.data.model.ChargersExperiment;
import defpackage.d6z;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.tpr;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes.dex */
public final class g implements ru.yandex.taxi.experiments.q {
    public final /* synthetic */ ru.yandex.taxi.experiments.q a;

    public g(rqo rqoVar) {
        ChargersExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ChargersExperiment.h);
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
        return (ChargersExperiment) this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ChargersExperimentRepository$getServiceName$1 chargersExperimentRepository$getServiceName$1;
        int i;
        String str;
        if (continuationImpl instanceof ChargersExperimentRepository$getServiceName$1) {
            chargersExperimentRepository$getServiceName$1 = (ChargersExperimentRepository$getServiceName$1) continuationImpl;
            int i2 = chargersExperimentRepository$getServiceName$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chargersExperimentRepository$getServiceName$1.label = i2 - Integer.MIN_VALUE;
                Object obj = chargersExperimentRepository$getServiceName$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = chargersExperimentRepository$getServiceName$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    chargersExperimentRepository$getServiceName$1.label = 1;
                    obj = this.a.b(chargersExperimentRepository$getServiceName$1);
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
                ChargersExperiment chargersExperiment = (ChargersExperiment) obj;
                str = chargersExperiment.e;
                if (str != null) {
                    return null;
                }
                return d6z.Y(chargersExperiment, str);
            }
        }
        chargersExperimentRepository$getServiceName$1 = new ChargersExperimentRepository$getServiceName$1(this, continuationImpl);
        Object obj2 = chargersExperimentRepository$getServiceName$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = chargersExperimentRepository$getServiceName$1.label;
        if (i != 0) {
        }
        ChargersExperiment chargersExperiment2 = (ChargersExperiment) obj2;
        str = chargersExperiment2.e;
        if (str != null) {
        }
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
