package com.yandex.go.payments_widgets.yandex_bank;

import defpackage.jxk0;
import defpackage.kxk0;
import defpackage.lxk0;
import defpackage.mxk0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes8.dex */
public final class d implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ mxk0 b;

    public d(vpr vprVar, mxk0 mxk0Var) {
        this.a = vprVar;
        this.b = mxk0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        RotationRepository$special$$inlined$map$1$2$1 rotationRepository$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof RotationRepository$special$$inlined$map$1$2$1) {
            rotationRepository$special$$inlined$map$1$2$1 = (RotationRepository$special$$inlined$map$1$2$1) continuation;
            int i2 = rotationRepository$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rotationRepository$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = rotationRepository$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = rotationRepository$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    lxk0 lxk0Var = ((Boolean) obj).booleanValue() ? jxk0.a : kxk0.a;
                    this.b.f = lxk0Var;
                    rotationRepository$special$$inlined$map$1$2$1.L$0 = null;
                    rotationRepository$special$$inlined$map$1$2$1.L$1 = null;
                    rotationRepository$special$$inlined$map$1$2$1.L$2 = null;
                    rotationRepository$special$$inlined$map$1$2$1.L$3 = null;
                    rotationRepository$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(lxk0Var, rotationRepository$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kotlin.b.b(obj2);
                }
                return zy11.a;
            }
        }
        rotationRepository$special$$inlined$map$1$2$1 = new RotationRepository$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = rotationRepository$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = rotationRepository$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
