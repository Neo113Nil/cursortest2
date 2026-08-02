package com.yandex.go.superapp.order_tracking.eats.presentation.navigation;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.ren;
import defpackage.ufn;
import defpackage.vpr;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class i implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ ufn b;

    public i(vpr vprVar, ufn ufnVar) {
        this.a = vprVar;
        this.b = ufnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        EatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1 eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof EatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1) {
            eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1 = (EatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1) continuation;
            int i2 = eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    ArrayList arrayList = new ArrayList();
                    for (Object obj3 : (List) obj) {
                        if (jl40.l(((ren) obj3).a, this.b.a)) {
                            arrayList.add(obj3);
                        }
                    }
                    eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1.L$0 = null;
                    eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1.L$1 = null;
                    eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1.L$2 = null;
                    eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1.L$3 = null;
                    eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(arrayList, eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1) == coroutineSingletons) {
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
        eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1 = new EatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1(this, continuation);
        Object obj22 = eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
