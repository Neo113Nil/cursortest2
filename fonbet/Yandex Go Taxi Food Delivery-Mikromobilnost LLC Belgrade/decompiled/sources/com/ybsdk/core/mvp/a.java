package com.ybsdk.core.mvp;

import defpackage.ny61;
import defpackage.uc5;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes2.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ uc5 b;

    public a(vpr vprVar, uc5 uc5Var) {
        this.a = vprVar;
        this.b = uc5Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        BaseViewModel$special$$inlined$map$1$2$1 baseViewModel$special$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof BaseViewModel$special$$inlined$map$1$2$1) {
            baseViewModel$special$$inlined$map$1$2$1 = (BaseViewModel$special$$inlined$map$1$2$1) continuation;
            int i2 = baseViewModel$special$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseViewModel$special$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = baseViewModel$special$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseViewModel$special$$inlined$map$1$2$1.label;
                if (i != 0) {
                    b.b(obj2);
                    Object q = this.b.c.q(obj);
                    baseViewModel$special$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(q, baseViewModel$special$$inlined$map$1$2$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    b.b(obj2);
                }
                return zy11.a;
            }
        }
        baseViewModel$special$$inlined$map$1$2$1 = new BaseViewModel$special$$inlined$map$1$2$1(this, continuation);
        Object obj22 = baseViewModel$special$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseViewModel$special$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
