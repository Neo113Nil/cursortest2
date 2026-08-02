package com.yandex.go.superapp.order_tracking.eats.presentation.navigation;

import defpackage.ny61;
import defpackage.tpr;
import defpackage.ufn;
import defpackage.vpr;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class j implements tpr {
    public final /* synthetic */ tpr a;
    public final /* synthetic */ ufn b;

    public j(tpr tprVar, ufn ufnVar) {
        this.a = tprVar;
        this.b = ufnVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.tpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collect(vpr vprVar, Continuation continuation) {
        EatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1 eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1;
        int i;
        if (continuation instanceof EatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1) {
            eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1 = (EatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1) continuation;
            int i2 = eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1.label = i2 - Integer.MIN_VALUE;
                Object obj = eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    i iVar = new i(vprVar, this.b);
                    eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1.L$0 = null;
                    eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1.L$1 = null;
                    eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1.L$2 = null;
                    eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1.label = 1;
                    if (this.a.collect(iVar, eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1) == coroutineSingletons) {
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
        eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1 = new EatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1(this, continuation);
        Object obj2 = eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eatsOrderOverlayRouterImpl$createOrdersOverlayRepositoryForOrderDetails$lambda$0$$inlined$map$1$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
