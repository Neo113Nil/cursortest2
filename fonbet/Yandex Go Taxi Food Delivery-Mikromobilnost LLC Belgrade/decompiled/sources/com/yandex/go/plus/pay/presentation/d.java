package com.yandex.go.plus.pay.presentation;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.y4a0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes13.dex */
public final class d implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ y4a0 b;

    public d(tpr tprVar, y4a0 y4a0Var) {
        this.a = tprVar;
        this.b = y4a0Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        PlusPayUiProviderFactory$special$$inlined$map$1$1 plusPayUiProviderFactory$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof PlusPayUiProviderFactory$special$$inlined$map$1$1) {
            plusPayUiProviderFactory$special$$inlined$map$1$1 = (PlusPayUiProviderFactory$special$$inlined$map$1$1) continuation;
            int i2 = plusPayUiProviderFactory$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                plusPayUiProviderFactory$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = plusPayUiProviderFactory$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = plusPayUiProviderFactory$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    c cVar = new c(vprVar, this.b);
                    plusPayUiProviderFactory$special$$inlined$map$1$1.L$0 = null;
                    plusPayUiProviderFactory$special$$inlined$map$1$1.L$1 = null;
                    plusPayUiProviderFactory$special$$inlined$map$1$1.L$2 = null;
                    plusPayUiProviderFactory$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(cVar, plusPayUiProviderFactory$special$$inlined$map$1$1) == coroutineSingletons) {
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
        plusPayUiProviderFactory$special$$inlined$map$1$1 = new PlusPayUiProviderFactory$special$$inlined$map$1$1(this, continuation);
        Object obj2 = plusPayUiProviderFactory$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = plusPayUiProviderFactory$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
