package com.yandex.messaging.domain.statuses;

import defpackage.gu21;
import defpackage.ny61;
import defpackage.r0k;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes15.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;

    public i(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        GetUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1 getUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof GetUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1) {
            getUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1 = (GetUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1) continuation;
            int i2 = getUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                getUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = getUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = getUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1.label;
                StatusAvailability statusAvailability = null;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    r0k r0kVar = (r0k) obj;
                    boolean z = r0kVar.b.a;
                    gu21 gu21Var = r0kVar.a;
                    if (gu21Var != null) {
                        if (!z && gu21Var.a == StatusAvailability.Default) {
                            gu21Var = null;
                        }
                        if (gu21Var != null) {
                            statusAvailability = gu21Var.a;
                        }
                    }
                    getUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(statusAvailability, getUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1) == coroutineSingletons) {
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
        getUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1 = new GetUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1(this, continuation);
        Object obj22 = getUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = getUserStatusAvailabilityUseCase$run$$inlined$map$2$2$1.label;
        StatusAvailability statusAvailability2 = null;
        if (i != 0) {
        }
        return zy11.a;
    }
}
