package com.yandex.go.loyalty.impl.common.domain;

import androidx.lifecycle.Lifecycle;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes12.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;

    public i(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        LoyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1 loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1;
        int i;
        if (continuation instanceof LoyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1) {
            loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1 = (LoyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1) continuation;
            int i2 = loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    if (((Lifecycle.Event) obj) == Lifecycle.Event.ON_RESUME) {
                        loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1.L$0 = null;
                        loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1.L$1 = null;
                        loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1.L$2 = null;
                        loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1.L$3 = null;
                        loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1.label = 1;
                        if (this.a.emit(obj, loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
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
        loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1 = new LoyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1(this, continuation);
        Object obj22 = loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = loyaltyStateFCPListener$geoLocationWithAuthorizationFlow$lambda$0$$inlined$filter$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
