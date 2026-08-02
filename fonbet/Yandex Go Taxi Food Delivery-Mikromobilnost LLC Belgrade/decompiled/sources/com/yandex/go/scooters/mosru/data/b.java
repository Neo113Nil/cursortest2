package com.yandex.go.scooters.mosru.data;

import com.yandex.go.scooters.mosru.data.model.ScootersMosRuIntegrationExperiment;
import defpackage.jbh;
import defpackage.jsq0;
import defpackage.mzn0;
import defpackage.ny61;
import defpackage.nzn0;
import defpackage.rqo;
import defpackage.tpr;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import ru.yandex.taxi.experiments.q;

/* loaded from: classes13.dex */
public final class b implements q {
    public final /* synthetic */ q a;

    public b(rqo rqoVar) {
        ScootersMosRuIntegrationExperiment.Companion.getClass();
        this.a = ((jbh) rqoVar).d(ScootersMosRuIntegrationExperiment.f);
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
        return (ScootersMosRuIntegrationExperiment) this.a.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(ContinuationImpl continuationImpl) {
        ScootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1 scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1;
        int i;
        if (continuationImpl instanceof ScootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1) {
            scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1 = (ScootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1) continuationImpl;
            int i2 = scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1.L$0 = this;
                    scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1.label = 1;
                    obj = this.a.b(scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    this = (b) scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1.L$0;
                    kotlin.b.b(obj);
                }
                ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto remainingRidesTriggersDto = ((ScootersMosRuIntegrationExperiment) obj).c;
                this.getClass();
                ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto.ShowModal showModal = remainingRidesTriggersDto == null ? remainingRidesTriggersDto.a : null;
                return new nzn0(new mzn0(showModal == null ? showModal.a : null, showModal == null ? showModal.b : null, showModal == null ? showModal.c : null), remainingRidesTriggersDto != null ? remainingRidesTriggersDto.b : null);
            }
        }
        scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1 = new ScootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1(this, continuationImpl);
        Object obj2 = scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuIntegrationExperimentRepository$getRemainingRidesTriggers$1.label;
        if (i != 0) {
        }
        ScootersMosRuIntegrationExperiment.RemainingRidesTriggersDto remainingRidesTriggersDto2 = ((ScootersMosRuIntegrationExperiment) obj2).c;
        this.getClass();
        if (remainingRidesTriggersDto2 == null) {
        }
        return new nzn0(new mzn0(showModal == null ? showModal.a : null, showModal == null ? showModal.b : null, showModal == null ? showModal.c : null), remainingRidesTriggersDto2 != null ? remainingRidesTriggersDto2.b : null);
    }

    @Override // ru.yandex.taxi.experiments.q
    public final Object f(Continuation continuation) {
        return this.a.f(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(ContinuationImpl continuationImpl) {
        ScootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1 scootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1;
        int i;
        jsq0 jsq0Var;
        if (continuationImpl instanceof ScootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1) {
            scootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1 = (ScootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1) continuationImpl;
            int i2 = scootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    scootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1.label = 1;
                    obj = this.a.b(scootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1);
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
                ScootersMosRuIntegrationExperiment scootersMosRuIntegrationExperiment = (ScootersMosRuIntegrationExperiment) obj;
                ScootersMosRuIntegrationExperiment scootersMosRuIntegrationExperiment2 = scootersMosRuIntegrationExperiment.b ? scootersMosRuIntegrationExperiment : null;
                return (scootersMosRuIntegrationExperiment2 != null || (jsq0Var = scootersMosRuIntegrationExperiment2.d) == null) ? EmptyList.a : kotlin.collections.a.M(jsq0Var);
            }
        }
        scootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1 = new ScootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1(this, continuationImpl);
        Object obj2 = scootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersMosRuIntegrationExperimentRepository$getScreensForReauthorizationModal$1.label;
        if (i != 0) {
        }
        ScootersMosRuIntegrationExperiment scootersMosRuIntegrationExperiment3 = (ScootersMosRuIntegrationExperiment) obj2;
        if (scootersMosRuIntegrationExperiment3.b) {
        }
        if (scootersMosRuIntegrationExperiment2 != null) {
        }
    }
}
