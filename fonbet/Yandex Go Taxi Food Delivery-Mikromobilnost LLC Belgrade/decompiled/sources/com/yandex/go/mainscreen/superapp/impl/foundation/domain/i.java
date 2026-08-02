package com.yandex.go.mainscreen.superapp.impl.foundation.domain;

import defpackage.jqr;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes.dex */
public final class i implements tpr {
    public final /* synthetic */ tpr a;

    public i(jqr jqrVar) {
        this.a = jqrVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1 superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuperappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1) {
            superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1 = (SuperappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1) continuation;
            int i2 = superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    h hVar = new h(vprVar);
                    superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1.L$0 = null;
                    superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1.L$1 = null;
                    superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1.L$2 = null;
                    superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1.label = 1;
                    if (this.a.collect(hVar, superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1) == coroutineSingletons) {
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
        superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1 = new SuperappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1(this, continuation);
        Object obj2 = superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superappContentPointInteractor$subscribeToChanges$1$invokeSuspend$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
