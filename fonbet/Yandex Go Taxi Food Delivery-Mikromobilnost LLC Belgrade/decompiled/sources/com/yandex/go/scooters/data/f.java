package com.yandex.go.scooters.data;

import com.yandex.go.scooters.data.model.ScootersOnboardingExperiment;
import defpackage.ny61;
import defpackage.zan0;
import java.util.concurrent.CancellationException;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes13.dex */
public final class f {
    public final b a;

    public f(b bVar) {
        this.a = bVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, ContinuationImpl continuationImpl) {
        ScootersOnboardingRepository$getScootersOnboardingExperiment$1 scootersOnboardingRepository$getScootersOnboardingExperiment$1;
        int i;
        try {
            if (continuationImpl instanceof ScootersOnboardingRepository$getScootersOnboardingExperiment$1) {
                scootersOnboardingRepository$getScootersOnboardingExperiment$1 = (ScootersOnboardingRepository$getScootersOnboardingExperiment$1) continuationImpl;
                int i2 = scootersOnboardingRepository$getScootersOnboardingExperiment$1.label;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    scootersOnboardingRepository$getScootersOnboardingExperiment$1.label = i2 - Integer.MIN_VALUE;
                    Object obj = scootersOnboardingRepository$getScootersOnboardingExperiment$1.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = scootersOnboardingRepository$getScootersOnboardingExperiment$1.label;
                    if (i != 0) {
                        kotlin.b.b(obj);
                        b bVar = this.a;
                        scootersOnboardingRepository$getScootersOnboardingExperiment$1.L$0 = null;
                        scootersOnboardingRepository$getScootersOnboardingExperiment$1.label = 1;
                        obj = bVar.a(str, scootersOnboardingRepository$getScootersOnboardingExperiment$1);
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
                    ScootersOnboardingExperiment.Companion.getClass();
                    return (ScootersOnboardingExperiment) ((zan0) obj).d(ScootersOnboardingExperiment.i);
                }
            }
            if (i != 0) {
            }
            ScootersOnboardingExperiment.Companion.getClass();
            return (ScootersOnboardingExperiment) ((zan0) obj).d(ScootersOnboardingExperiment.i);
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable unused) {
            ScootersOnboardingExperiment.Companion.getClass();
            return ScootersOnboardingExperiment.i;
        }
        scootersOnboardingRepository$getScootersOnboardingExperiment$1 = new ScootersOnboardingRepository$getScootersOnboardingExperiment$1(this, continuationImpl);
        Object obj2 = scootersOnboardingRepository$getScootersOnboardingExperiment$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersOnboardingRepository$getScootersOnboardingExperiment$1.label;
    }
}
