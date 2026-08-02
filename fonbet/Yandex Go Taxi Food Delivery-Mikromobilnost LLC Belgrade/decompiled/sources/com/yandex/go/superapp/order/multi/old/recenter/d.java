package com.yandex.go.superapp.order.multi.old.recenter;

import defpackage.m6w0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes14.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ m6w0 b;

    public d(r0 r0Var, m6w0 m6w0Var) {
        this.a = r0Var;
        this.b = m6w0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        SuperAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1 superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof SuperAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1) {
            superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1 = (SuperAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1) continuation;
            int i2 = superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1.L$0 = null;
                    superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1.L$1 = null;
                    superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1.L$2 = null;
                    superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1 = new SuperAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = superAppRecenterInteractor$resume$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
