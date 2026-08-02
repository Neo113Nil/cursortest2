package com.yandex.go.promocodes.referral.impl.provider;

import defpackage.lni0;
import defpackage.mth;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class c implements tpr {
    public final /* synthetic */ mth a;
    public final /* synthetic */ lni0 b;

    public c(mth mthVar, lni0 lni0Var) {
        this.a = mthVar;
        this.b = lni0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ReferralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1 referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof ReferralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1) {
            referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1 = (ReferralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1) continuation;
            int i2 = referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1.L$0 = null;
                    referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1.L$1 = null;
                    referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1.L$2 = null;
                    referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj);
                }
                return zy11.a;
            }
        }
        referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1 = new ReferralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
