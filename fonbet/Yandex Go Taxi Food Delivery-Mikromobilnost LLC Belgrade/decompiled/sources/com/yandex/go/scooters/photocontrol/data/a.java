package com.yandex.go.scooters.photocontrol.data;

import com.yandex.go.scooters.photocontrol.api.ScootersExamType;
import com.yandex.go.scooters.photocontrol.data.model.ScootersPhotocontrolRecognitionExperiment;
import defpackage.jbh;
import defpackage.k421;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.tpr;
import defpackage.tst;
import defpackage.w511;
import defpackage.xio0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes13.dex */
public final class a implements q {
    public final /* synthetic */ q a;
    public final tst b;
    public final k421 c;

    public a(rqo rqoVar, tst tstVar, k421 k421Var) {
        this.a = ((jbh) rqoVar).d(ScootersPhotocontrolRecognitionExperiment.d);
        this.b = tstVar;
        this.c = k421Var;
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
        return (ScootersPhotocontrolRecognitionExperiment) this.a.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0061, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0096, code lost:
    
        if (r9 == r1) goto L36;
     */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ScootersExamType scootersExamType, ContinuationImpl continuationImpl) {
        ScootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1 scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1;
        int i;
        if (continuationImpl instanceof ScootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1) {
            scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1 = (ScootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1) continuationImpl;
            int i2 = scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.label;
                boolean z = false;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = xio0.a[scootersExamType.ordinal()];
                    q qVar = this.a;
                    if (i3 == 1) {
                        scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.L$0 = null;
                        scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.L$1 = this;
                        scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.label = 1;
                        obj = qVar.b(scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1);
                    } else {
                        if (i3 != 2) {
                            w511.b();
                            return null;
                        }
                        scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.L$0 = null;
                        scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.L$1 = this;
                        scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.label = 2;
                        obj = qVar.b(scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1);
                    }
                    return coroutineSingletons;
                }
                if (i == 1) {
                    this = (a) scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.L$1;
                    kotlin.b.b(obj);
                    ScootersPhotocontrolRecognitionExperiment scootersPhotocontrolRecognitionExperiment = (ScootersPhotocontrolRecognitionExperiment) obj;
                    if (!scootersPhotocontrolRecognitionExperiment.b) {
                        return Boolean.FALSE;
                    }
                    ScootersPhotocontrolRecognitionExperiment.AndroidVendorFlags androidVendorFlags = scootersPhotocontrolRecognitionExperiment.c.a;
                    if (((ru.yandex.taxi.vendor_api.google.b) this.b).b()) {
                        z = androidVendorFlags.b;
                    } else {
                        this.c.getClass();
                    }
                    return Boolean.valueOf(z);
                }
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this = (a) scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.L$1;
                kotlin.b.b(obj);
                ScootersPhotocontrolRecognitionExperiment scootersPhotocontrolRecognitionExperiment2 = (ScootersPhotocontrolRecognitionExperiment) obj;
                if (!scootersPhotocontrolRecognitionExperiment2.b) {
                    return Boolean.FALSE;
                }
                ScootersPhotocontrolRecognitionExperiment.AndroidVendorFlags androidVendorFlags2 = scootersPhotocontrolRecognitionExperiment2.c.b;
                if (((ru.yandex.taxi.vendor_api.google.b) this.b).b()) {
                    z = androidVendorFlags2.b;
                } else {
                    this.c.getClass();
                }
                return Boolean.valueOf(z);
            }
        }
        scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1 = new ScootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1(this, continuationImpl);
        Object obj2 = scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersPhotocontrolRecognitionExperimentRepository$isRecognitionEnabled$1.label;
        boolean z2 = false;
        if (i != 0) {
        }
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }
}
