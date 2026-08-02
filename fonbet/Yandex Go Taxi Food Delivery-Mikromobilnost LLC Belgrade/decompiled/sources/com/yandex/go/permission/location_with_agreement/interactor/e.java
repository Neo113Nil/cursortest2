package com.yandex.go.permission.location_with_agreement.interactor;

import com.yandex.go.permission.location_with_agreement.experiment.ExplainingLocationPermissionScreenWithAgreementExperiment;
import com.yandex.go.permission.location_with_agreement.experiment.ExplainingLocationPermissionScreenWithAgreementV2Experiment;
import defpackage.bbz;
import defpackage.cbz;
import defpackage.ha2;
import defpackage.j7j0;
import defpackage.jbh;
import defpackage.ny61;
import defpackage.rqo;
import defpackage.t1b0;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class e {
    public final ru.yandex.taxi.systemrequeirements.location.c a;
    public final j7j0 b;
    public final ru.yandex.taxi.startup.launch.h c;
    public final t1b0 d;
    public final t1b0 e;

    public e(rqo rqoVar, ru.yandex.taxi.systemrequeirements.location.c cVar, j7j0 j7j0Var, ru.yandex.taxi.startup.launch.h hVar) {
        this.a = cVar;
        this.b = j7j0Var;
        this.c = hVar;
        jbh jbhVar = (jbh) rqoVar;
        this.d = jbhVar.e(ExplainingLocationPermissionScreenWithAgreementExperiment.k);
        this.e = jbhVar.e(ExplainingLocationPermissionScreenWithAgreementV2Experiment.l);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005e, code lost:
    
        if (r7 != r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0060, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0044, code lost:
    
        if (r7 == r1) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        LocationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1 locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1;
        Object obj;
        int i;
        ExplainingLocationPermissionScreenWithAgreementV2Experiment explainingLocationPermissionScreenWithAgreementV2Experiment;
        if (continuationImpl instanceof LocationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1) {
            locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1 = (LocationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1) continuationImpl;
            int i2 = locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1.label = i2 - Integer.MIN_VALUE;
                obj = locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1.label = 1;
                    obj = this.e.b(locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                        return new bbz(((ExplainingLocationPermissionScreenWithAgreementExperiment) obj).h);
                    }
                    kotlin.b.b(obj);
                }
                explainingLocationPermissionScreenWithAgreementV2Experiment = (ExplainingLocationPermissionScreenWithAgreementV2Experiment) obj;
                if (!explainingLocationPermissionScreenWithAgreementV2Experiment.b && !explainingLocationPermissionScreenWithAgreementV2Experiment.j) {
                    return cbz.a;
                }
                locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1.L$0 = null;
                locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1.label = 2;
                obj = this.d.b(locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1);
            }
        }
        locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1 = new LocationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1(this, continuationImpl);
        obj = locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1.label;
        if (i != 0) {
        }
        explainingLocationPermissionScreenWithAgreementV2Experiment = (ExplainingLocationPermissionScreenWithAgreementV2Experiment) obj;
        if (!explainingLocationPermissionScreenWithAgreementV2Experiment.b) {
        }
        locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1.L$0 = null;
        locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1.label = 2;
        obj = this.d.b(locationPermissionWithAgreementShowInteractorImpl$resolveLocationPermissionVariant$1);
    }

    public final ha2 b() {
        ru.yandex.taxi.startup.launch.h hVar = this.c;
        boolean Kg = hVar.Kg();
        t1b0 t1b0Var = this.d;
        d dVar = new d(Kg ? ru.yandex.taxi.experiments.d.b(t1b0Var) : t1b0Var.a());
        boolean Kg2 = hVar.Kg();
        t1b0 t1b0Var2 = this.e;
        return kotlinx.coroutines.flow.e.n(dVar, Kg2 ? ru.yandex.taxi.experiments.d.b(t1b0Var2) : t1b0Var2.a(), new b(this.b.b, this), new LocationPermissionWithAgreementShowInteractorImpl$shouldShow$2(4, null));
    }
}
