package com.yandex.go.scooters.offers.v2;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class c implements tpr {
    public final /* synthetic */ b2k a;

    public c(b2k b2kVar) {
        this.a = b2kVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        ScootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1 scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1;
        int i;
        if (continuation instanceof ScootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1) {
            scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1 = (ScootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1) continuation;
            int i2 = scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar);
                    scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1.L$0 = null;
                    scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1.L$1 = null;
                    scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1.L$2 = null;
                    scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1.label = 1;
                    if (this.a.collect(bVar, scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1) == coroutineSingletons) {
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
        scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1 = new ScootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1(this, continuation);
        Object obj2 = scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = scootersCardV2Presenter$listenToCurrentOffer$1$invokeSuspend$$inlined$filterIsInstance$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
