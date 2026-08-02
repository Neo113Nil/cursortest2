package com.yandex.go.navigator;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes12.dex */
public final class c implements tpr {
    public final /* synthetic */ r0 a;
    public final /* synthetic */ BaseNavigatorModalView b;

    public c(r0 r0Var, BaseNavigatorModalView baseNavigatorModalView) {
        this.a = r0Var;
        this.b = baseNavigatorModalView;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        BaseNavigatorModalView$special$$inlined$map$1$1 baseNavigatorModalView$special$$inlined$map$1$1;
        int i;
        if (continuation instanceof BaseNavigatorModalView$special$$inlined$map$1$1) {
            baseNavigatorModalView$special$$inlined$map$1$1 = (BaseNavigatorModalView$special$$inlined$map$1$1) continuation;
            int i2 = baseNavigatorModalView$special$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                baseNavigatorModalView$special$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = baseNavigatorModalView$special$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = baseNavigatorModalView$special$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    b bVar = new b(vprVar, this.b);
                    baseNavigatorModalView$special$$inlined$map$1$1.L$0 = null;
                    baseNavigatorModalView$special$$inlined$map$1$1.L$1 = null;
                    baseNavigatorModalView$special$$inlined$map$1$1.L$2 = null;
                    baseNavigatorModalView$special$$inlined$map$1$1.label = 1;
                    if (this.a.collect(bVar, baseNavigatorModalView$special$$inlined$map$1$1) == coroutineSingletons) {
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
        baseNavigatorModalView$special$$inlined$map$1$1 = new BaseNavigatorModalView$special$$inlined$map$1$1(this, continuation);
        Object obj2 = baseNavigatorModalView$special$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = baseNavigatorModalView$special$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
