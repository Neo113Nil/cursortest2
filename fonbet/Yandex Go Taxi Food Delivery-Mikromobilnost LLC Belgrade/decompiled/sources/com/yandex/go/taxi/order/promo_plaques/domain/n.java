package com.yandex.go.taxi.order.promo_plaques.domain;

import com.yandex.go.taxi.order.api.models.PromoPlaqueItem$DisplayOnType;
import defpackage.lpf0;
import defpackage.ny61;
import defpackage.vpr;
import defpackage.xpf0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class n implements vpr {
    public final /* synthetic */ vpr a;

    public n(vpr vprVar, xpf0 xpf0Var) {
        this.a = vprVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        PromoPlaqueStyleInteractor$special$$inlined$map$2$2$1 promoPlaqueStyleInteractor$special$$inlined$map$2$2$1;
        int i;
        if (continuation instanceof PromoPlaqueStyleInteractor$special$$inlined$map$2$2$1) {
            promoPlaqueStyleInteractor$special$$inlined$map$2$2$1 = (PromoPlaqueStyleInteractor$special$$inlined$map$2$2$1) continuation;
            int i2 = promoPlaqueStyleInteractor$special$$inlined$map$2$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                promoPlaqueStyleInteractor$special$$inlined$map$2$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = promoPlaqueStyleInteractor$special$$inlined$map$2$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = promoPlaqueStyleInteractor$special$$inlined$map$2$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList a = lpf0.a((List) obj, PromoPlaqueItem$DisplayOnType.DETAILS);
                    promoPlaqueStyleInteractor$special$$inlined$map$2$2$1.L$0 = null;
                    promoPlaqueStyleInteractor$special$$inlined$map$2$2$1.L$1 = null;
                    promoPlaqueStyleInteractor$special$$inlined$map$2$2$1.L$2 = null;
                    promoPlaqueStyleInteractor$special$$inlined$map$2$2$1.L$3 = null;
                    promoPlaqueStyleInteractor$special$$inlined$map$2$2$1.label = 1;
                    if (this.a.emit(a, promoPlaqueStyleInteractor$special$$inlined$map$2$2$1) == coroutineSingletons) {
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
        promoPlaqueStyleInteractor$special$$inlined$map$2$2$1 = new PromoPlaqueStyleInteractor$special$$inlined$map$2$2$1(this, continuation);
        Object obj22 = promoPlaqueStyleInteractor$special$$inlined$map$2$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = promoPlaqueStyleInteractor$special$$inlined$map$2$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
