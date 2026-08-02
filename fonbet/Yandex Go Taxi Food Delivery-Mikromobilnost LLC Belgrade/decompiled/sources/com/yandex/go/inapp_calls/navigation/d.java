package com.yandex.go.inapp_calls.navigation;

import com.yandex.go.inapp_calls.analytics.evgen.InAppCallsAnalytics$PhoneCallFallbackReason;
import com.yandex.go.inapp_calls.experiment.InAppCallExperiment;
import com.yandex.go.inapp_calls.experiment.q;
import com.yandex.go.proxyprovision.j;
import defpackage.evu0;
import defpackage.fkv;
import defpackage.hkv;
import defpackage.ny61;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes12.dex */
public final class d {
    public final q a;
    public final j b;

    public d(q qVar, j jVar) {
        this.a = qVar;
        this.b = jVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x004a, code lost:
    
        if (r8 == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Enum a(hkv hkvVar, ContinuationImpl continuationImpl) {
        InAppCallsAvailabilityResolver$checkInAppCallEligibility$1 inAppCallsAvailabilityResolver$checkInAppCallEligibility$1;
        Object obj;
        int i;
        hkv hkvVar2;
        if (continuationImpl instanceof InAppCallsAvailabilityResolver$checkInAppCallEligibility$1) {
            inAppCallsAvailabilityResolver$checkInAppCallEligibility$1 = (InAppCallsAvailabilityResolver$checkInAppCallEligibility$1) continuationImpl;
            int i2 = inAppCallsAvailabilityResolver$checkInAppCallEligibility$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                inAppCallsAvailabilityResolver$checkInAppCallEligibility$1.label = i2 - Integer.MIN_VALUE;
                obj = inAppCallsAvailabilityResolver$checkInAppCallEligibility$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = inAppCallsAvailabilityResolver$checkInAppCallEligibility$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    inAppCallsAvailabilityResolver$checkInAppCallEligibility$1.L$0 = hkvVar;
                    inAppCallsAvailabilityResolver$checkInAppCallEligibility$1.label = 1;
                    obj = this.b.a(inAppCallsAvailabilityResolver$checkInAppCallEligibility$1);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hkvVar2 = (hkv) inAppCallsAvailabilityResolver$checkInAppCallEligibility$1.L$0;
                        kotlin.b.b(obj);
                        if (((InAppCallExperiment) obj).b) {
                            return InAppCallsAnalytics$PhoneCallFallbackReason.DisabledInappCallsExperiment;
                        }
                        fkv fkvVar = hkvVar2.a;
                        String str = fkvVar != null ? fkvVar.a : null;
                        if (str == null || evu0.J(str)) {
                            return InAppCallsAnalytics$PhoneCallFallbackReason.EmptyForwardingId;
                        }
                        return null;
                    }
                    hkvVar = (hkv) inAppCallsAvailabilityResolver$checkInAppCallEligibility$1.L$0;
                    kotlin.b.b(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    return InAppCallsAnalytics$PhoneCallFallbackReason.EnabledGeProxyProvisionExperiment;
                }
                inAppCallsAvailabilityResolver$checkInAppCallEligibility$1.L$0 = hkvVar;
                inAppCallsAvailabilityResolver$checkInAppCallEligibility$1.label = 2;
                obj = this.a.d.b(inAppCallsAvailabilityResolver$checkInAppCallEligibility$1);
                if (obj != coroutineSingletons) {
                    hkvVar2 = hkvVar;
                    if (((InAppCallExperiment) obj).b) {
                    }
                }
                return coroutineSingletons;
            }
        }
        inAppCallsAvailabilityResolver$checkInAppCallEligibility$1 = new InAppCallsAvailabilityResolver$checkInAppCallEligibility$1(this, continuationImpl);
        obj = inAppCallsAvailabilityResolver$checkInAppCallEligibility$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = inAppCallsAvailabilityResolver$checkInAppCallEligibility$1.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
