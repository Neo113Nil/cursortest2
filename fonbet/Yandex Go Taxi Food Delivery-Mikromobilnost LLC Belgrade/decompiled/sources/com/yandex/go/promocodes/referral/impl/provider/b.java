package com.yandex.go.promocodes.referral.impl.provider;

import defpackage.cne0;
import defpackage.lni0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class b implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ lni0 b;

    public b(vpr vprVar, lni0 lni0Var) {
        this.a = vprVar;
        this.b = lni0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ReferralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1 referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof ReferralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1) {
            referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1 = (ReferralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    Boolean valueOf = Boolean.valueOf(((cne0) this.b.c.b).f("can_generate_referrals"));
                    referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(valueOf, referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1 = new ReferralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = referralAvailabilityStateProviderImpl$ongoingAvailabilityStateFlow_delegate$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
