package com.yandex.go.superapp.order.multi.old.view;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class k implements tpr {
    public final /* synthetic */ kotlinx.coroutines.flow.internal.g a;

    public k(kotlinx.coroutines.flow.internal.g gVar) {
        this.a = gVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RedirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1 redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1;
        int i;
        if (continuation instanceof RedirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1) {
            redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1 = (RedirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1) continuation;
            int i2 = redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar);
                    redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1.L$0 = null;
                    redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1.L$1 = null;
                    redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1.L$2 = null;
                    redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1.label = 1;
                    if (this.a.collect(jVar, redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1) == coroutineSingletons) {
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
        redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1 = new RedirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1(this, continuation);
        Object obj2 = redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = redirectToCompletedInteractor$waitOrderCompleted$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
