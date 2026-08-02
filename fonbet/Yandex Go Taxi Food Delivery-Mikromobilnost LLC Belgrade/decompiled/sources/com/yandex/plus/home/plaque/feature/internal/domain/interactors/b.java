package com.yandex.plus.home.plaque.feature.internal.domain.interactors;

import defpackage.bic0;
import defpackage.jse;
import defpackage.lqc0;
import defpackage.ny61;
import defpackage.tje;
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;

/* loaded from: classes8.dex */
public final class b {
    public final lqc0 a;
    public final jse b;

    public b(lqc0 lqc0Var, jse jseVar) {
        this.a = lqc0Var;
        this.b = jseVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(bic0 bic0Var, ContinuationImpl continuationImpl) {
        PlaqueRemoteActionInteractorImpl$performAction$1 plaqueRemoteActionInteractorImpl$performAction$1;
        int i;
        if (continuationImpl instanceof PlaqueRemoteActionInteractorImpl$performAction$1) {
            plaqueRemoteActionInteractorImpl$performAction$1 = (PlaqueRemoteActionInteractorImpl$performAction$1) continuationImpl;
            int i2 = plaqueRemoteActionInteractorImpl$performAction$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plaqueRemoteActionInteractorImpl$performAction$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plaqueRemoteActionInteractorImpl$performAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plaqueRemoteActionInteractorImpl$performAction$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    PlaqueRemoteActionInteractorImpl$performAction$2 plaqueRemoteActionInteractorImpl$performAction$2 = new PlaqueRemoteActionInteractorImpl$performAction$2(this, bic0Var, null);
                    plaqueRemoteActionInteractorImpl$performAction$1.L$0 = null;
                    plaqueRemoteActionInteractorImpl$performAction$1.label = 1;
                    obj = tje.k0(this.b, plaqueRemoteActionInteractorImpl$performAction$2, plaqueRemoteActionInteractorImpl$performAction$1);
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
                return ((Result) obj).getValue();
            }
        }
        plaqueRemoteActionInteractorImpl$performAction$1 = new PlaqueRemoteActionInteractorImpl$performAction$1(this, continuationImpl);
        Object obj2 = plaqueRemoteActionInteractorImpl$performAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plaqueRemoteActionInteractorImpl$performAction$1.label;
        if (i != 0) {
        }
        return ((Result) obj2).getValue();
    }
}
