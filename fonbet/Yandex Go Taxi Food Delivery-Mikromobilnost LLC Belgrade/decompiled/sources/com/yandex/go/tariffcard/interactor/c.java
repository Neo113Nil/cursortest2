package com.yandex.go.tariffcard.interactor;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.u1n;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class c implements tpr {
    public final /* synthetic */ com.yandex.go.tariffcard.experiment.q a;
    public final /* synthetic */ u1n b;

    public c(com.yandex.go.tariffcard.experiment.q qVar, u1n u1nVar) {
        this.a = qVar;
        this.b = u1nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        HeaderUiConfigInteractor$configHolderFlow$$inlined$map$1$1 headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1;
        int i;
        if (continuation instanceof HeaderUiConfigInteractor$configHolderFlow$$inlined$map$1$1) {
            headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1 = (HeaderUiConfigInteractor$configHolderFlow$$inlined$map$1$1) continuation;
            int i2 = headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1.L$0 = null;
                    headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1.L$1 = null;
                    headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1.L$2 = null;
                    headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1) == coroutineSingletons) {
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
        headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1 = new HeaderUiConfigInteractor$configHolderFlow$$inlined$map$1$1(this, continuation);
        Object obj2 = headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = headerUiConfigInteractor$configHolderFlow$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
