package com.yandex.go.permission.location_with_agreement.ui;

import com.yandex.go.permission.location_with_agreement.experiment.ExplainingLocationPermissionScreenWithAgreementV2Experiment;
import defpackage.jbh;
import defpackage.jbz;
import defpackage.ny61;
import defpackage.pwy0;
import defpackage.rol0;
import defpackage.rqo;
import defpackage.saz;
import defpackage.t1b0;
import defpackage.tpr;
import defpackage.tt2;
import defpackage.uyj;
import defpackage.yt11;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.internal.g;

/* loaded from: classes13.dex */
public final class b implements yt11 {
    public final jbz a;
    public final pwy0 b;
    public final saz c;
    public final t1b0 d;
    public final rol0 e;
    public final tpr f;

    public b(tt2 tt2Var, jbz jbzVar, pwy0 pwy0Var, saz sazVar, rqo rqoVar) {
        this.a = jbzVar;
        this.b = pwy0Var;
        this.c = sazVar;
        t1b0 e = ((jbh) rqoVar).e(ExplainingLocationPermissionScreenWithAgreementV2Experiment.l);
        this.d = e;
        this.e = new rol0(new LocationPermissionV2UiStateInteractor$logoUiStateFlow$1(this, null));
        g X = e.X(e.a(), new LocationPermissionV2UiStateInteractor$special$$inlined$flatMapLatest$1(this, null));
        tt2Var.getClass();
        this.f = e.F(X, uyj.a);
    }

    @Override // defpackage.yt11
    public final tpr a() {
        return this.f;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(ContinuationImpl continuationImpl) {
        LocationPermissionV2UiStateInteractor$getRequestTimeoutMs$1 locationPermissionV2UiStateInteractor$getRequestTimeoutMs$1;
        int i;
        if (continuationImpl instanceof LocationPermissionV2UiStateInteractor$getRequestTimeoutMs$1) {
            locationPermissionV2UiStateInteractor$getRequestTimeoutMs$1 = (LocationPermissionV2UiStateInteractor$getRequestTimeoutMs$1) continuationImpl;
            int i2 = locationPermissionV2UiStateInteractor$getRequestTimeoutMs$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                locationPermissionV2UiStateInteractor$getRequestTimeoutMs$1.label = i2 - Integer.MIN_VALUE;
                Object obj = locationPermissionV2UiStateInteractor$getRequestTimeoutMs$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = locationPermissionV2UiStateInteractor$getRequestTimeoutMs$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    locationPermissionV2UiStateInteractor$getRequestTimeoutMs$1.label = 1;
                    obj = this.d.b(locationPermissionV2UiStateInteractor$getRequestTimeoutMs$1);
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
                return new Long(((ExplainingLocationPermissionScreenWithAgreementV2Experiment) obj).i == null ? (r4.a + r4.b) * 1000 : 0L);
            }
        }
        locationPermissionV2UiStateInteractor$getRequestTimeoutMs$1 = new LocationPermissionV2UiStateInteractor$getRequestTimeoutMs$1(this, continuationImpl);
        Object obj2 = locationPermissionV2UiStateInteractor$getRequestTimeoutMs$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = locationPermissionV2UiStateInteractor$getRequestTimeoutMs$1.label;
        if (i != 0) {
        }
        return new Long(((ExplainingLocationPermissionScreenWithAgreementV2Experiment) obj2).i == null ? (r4.a + r4.b) * 1000 : 0L);
    }
}
