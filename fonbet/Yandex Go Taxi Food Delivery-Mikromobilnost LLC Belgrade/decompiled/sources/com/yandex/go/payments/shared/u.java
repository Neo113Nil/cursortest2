package com.yandex.go.payments.shared;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class u implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;
    public final /* synthetic */ v b;

    public u(kotlinx.coroutines.flow.internal.g gVar, v vVar) {
        this.a = gVar;
        this.b = vVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SharedPaymentInteractor$observeInvitations$$inlined$map$1$1 sharedPaymentInteractor$observeInvitations$$inlined$map$1$1;
        int i;
        if (continuation instanceof SharedPaymentInteractor$observeInvitations$$inlined$map$1$1) {
            sharedPaymentInteractor$observeInvitations$$inlined$map$1$1 = (SharedPaymentInteractor$observeInvitations$$inlined$map$1$1) continuation;
            int i2 = sharedPaymentInteractor$observeInvitations$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                sharedPaymentInteractor$observeInvitations$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = sharedPaymentInteractor$observeInvitations$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = sharedPaymentInteractor$observeInvitations$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    t tVar = new t(vprVar, this.b);
                    sharedPaymentInteractor$observeInvitations$$inlined$map$1$1.L$0 = null;
                    sharedPaymentInteractor$observeInvitations$$inlined$map$1$1.L$1 = null;
                    sharedPaymentInteractor$observeInvitations$$inlined$map$1$1.L$2 = null;
                    sharedPaymentInteractor$observeInvitations$$inlined$map$1$1.label = 1;
                    if (this.a.collect(tVar, sharedPaymentInteractor$observeInvitations$$inlined$map$1$1) == coroutineSingletons) {
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
        sharedPaymentInteractor$observeInvitations$$inlined$map$1$1 = new SharedPaymentInteractor$observeInvitations$$inlined$map$1$1(this, continuation);
        Object obj2 = sharedPaymentInteractor$observeInvitations$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = sharedPaymentInteractor$observeInvitations$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
