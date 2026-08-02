package com.yandex.go.payments_widgets.yandex_bank;

import defpackage.mxk0;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class e implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ mxk0 b;

    public e(tpr tprVar, mxk0 mxk0Var) {
        this.a = tprVar;
        this.b = mxk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        RotationRepository$special$$inlined$map$1$1 rotationRepository$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof RotationRepository$special$$inlined$map$1$1) {
            rotationRepository$special$$inlined$map$1$1 = (RotationRepository$special$$inlined$map$1$1) continuation;
            int i2 = rotationRepository$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rotationRepository$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = rotationRepository$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rotationRepository$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    d dVar = new d(vprVar, this.b);
                    rotationRepository$special$$inlined$map$1$1.L$0 = null;
                    rotationRepository$special$$inlined$map$1$1.L$1 = null;
                    rotationRepository$special$$inlined$map$1$1.L$2 = null;
                    rotationRepository$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(dVar, rotationRepository$special$$inlined$map$1$1) == coroutineSingletons) {
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
        rotationRepository$special$$inlined$map$1$1 = new RotationRepository$special$$inlined$map$1$1(this, continuation);
        Object obj2 = rotationRepository$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rotationRepository$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
