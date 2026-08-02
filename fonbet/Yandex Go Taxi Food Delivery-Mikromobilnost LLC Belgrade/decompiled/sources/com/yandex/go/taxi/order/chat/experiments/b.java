package com.yandex.go.taxi.order.chat.experiments;

import defpackage.d3a;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes14.dex */
public final class b {
    public final d3a a;

    public b(d3a d3aVar) {
        this.a = d3aVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(ContinuationImpl continuationImpl) {
        TaxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1 taxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1;
        int i;
        if (continuationImpl instanceof TaxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1) {
            taxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1 = (TaxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1) continuationImpl;
            int i2 = taxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                taxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = taxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = taxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    taxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1.label = 1;
                    obj = this.a.b.b(taxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1);
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
                return Boolean.valueOf(((RideWebMessengerEnabledExperiment) obj).b);
            }
        }
        taxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1 = new TaxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1(this, continuationImpl);
        Object obj2 = taxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = taxiOrderWebMessengerExperimentInteractorImpl$isAvailableSuspend$1.label;
        if (i != 0) {
        }
        return Boolean.valueOf(((RideWebMessengerEnabledExperiment) obj2).b);
    }
}
