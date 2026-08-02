package com.yandex.go.scooters.qr.unavailable_scooter.data;

import com.yandex.go.scooters.qr.unavailable_scooter.data.model.ScootersQrUnavailableScooterExperiment;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import defpackage.tpr;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class a implements t1b0 {
    public final /* synthetic */ t1b0 a;

    public a(rqo rqoVar) {
        ScootersQrUnavailableScooterExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).e(ScootersQrUnavailableScooterExperiment.h);
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
        return (ScootersQrUnavailableScooterExperiment) this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1 scootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1;
        int i;
        if (continuationImpl instanceof ScootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1) {
            scootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1 = (ScootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1) continuationImpl;
            int i2 = scootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1.label = 1;
                    obj = this.a.b(scootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return ((ScootersQrUnavailableScooterExperiment) obj).f.a;
            }
        }
        scootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1 = new ScootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1(this, continuationImpl);
        Object obj2 = scootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersQrUnavailableScooterExperimentRepository$getAllowedVendors$1.label;
        if (i != 0) {
        }
        return ((ScootersQrUnavailableScooterExperiment) obj2).f.a;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        ScootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1 scootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1;
        int i;
        if (continuationImpl instanceof ScootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1) {
            scootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1 = (ScootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1) continuationImpl;
            int i2 = scootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1.label;
                if (i != 0) {
                    b.b(obj);
                    scootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1.label = 1;
                    obj = this.a.b(scootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj);
                }
                return Boolean.valueOf(((ScootersQrUnavailableScooterExperiment) obj).f.b);
            }
        }
        scootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1 = new ScootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1(this, continuationImpl);
        Object obj2 = scootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersQrUnavailableScooterExperimentRepository$isAllowedToFindNearest$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((ScootersQrUnavailableScooterExperiment) obj2).f.b);
    }
}
