package com.yandex.go.yb.data;

import defpackage.b2k;
import defpackage.ny61;
import defpackage.o370;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class k implements tpr {
    public final /* synthetic */ b2k a;
    public final /* synthetic */ o370 b;

    public k(b2k b2kVar, o370 o370Var) {
        this.a = b2kVar;
        this.b = o370Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        YbSdkProxy$Active$observeStateChanges$$inlined$map$1$1 ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1;
        int i;
        if (continuation instanceof YbSdkProxy$Active$observeStateChanges$$inlined$map$1$1) {
            ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1 = (YbSdkProxy$Active$observeStateChanges$$inlined$map$1$1) continuation;
            int i2 = ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    j jVar = new j(vprVar, this.b);
                    ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1.L$0 = null;
                    ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1.L$1 = null;
                    ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1.L$2 = null;
                    ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1.label = 1;
                    if (this.a.collect(jVar, ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1) == coroutineSingletons) {
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
        ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1 = new YbSdkProxy$Active$observeStateChanges$$inlined$map$1$1(this, continuation);
        Object obj2 = ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = ybSdkProxy$Active$observeStateChanges$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
