package com.ybsdk.common.repositiories.card;

import com.ybsdk.feature.card.api.dto.CardClaimingStatusResponse;
import defpackage.aa8;
import defpackage.jl40;
import defpackage.n2e0;
import defpackage.ny61;
import defpackage.o2e0;
import defpackage.p2e0;
import defpackage.q2e0;
import defpackage.r2e0;
import defpackage.s2e0;
import defpackage.vpr;
import defpackage.w511;
import defpackage.y98;
import defpackage.z98;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;

    public a(vpr vprVar) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        CardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1 cardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1;
        int i;
        Object obj2;
        if (continuation instanceof CardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1) {
            cardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1 = (CardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1) continuation;
            int i2 = cardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                cardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj3 = cardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = cardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj3);
                    s2e0 s2e0Var = (s2e0) obj;
                    if (jl40.l(s2e0Var, r2e0.a) || (s2e0Var instanceof n2e0)) {
                        obj2 = y98.a;
                    } else if (s2e0Var instanceof q2e0) {
                        obj2 = new aa8(((CardClaimingStatusResponse) ((q2e0) s2e0Var).a).getCardId());
                    } else {
                        if (!jl40.l(s2e0Var, o2e0.a) && !(s2e0Var instanceof p2e0)) {
                            w511.b();
                            return null;
                        }
                        obj2 = z98.a;
                    }
                    cardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(obj2, cardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj3);
                }
                return zy11.a;
            }
        }
        cardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1 = new CardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1(this, continuation);
        Object obj32 = cardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = cardApplicationsRepositoryImpl$startActivationStatusPolling$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
