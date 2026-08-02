package com.yandex.go.walking.navigation.impl.navigation_core.repository;

import defpackage.ny61;
import defpackage.v541;
import defpackage.vpr;
import defpackage.zy11;
import java.util.List;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;

/* loaded from: classes14.dex */
public final class a implements vpr {
    public final /* synthetic */ vpr a;
    public final /* synthetic */ v541 b;

    public a(vpr vprVar, v541 v541Var) {
        this.a = vprVar;
        this.b = v541Var;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        WalkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1 walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1;
        int i;
        if (continuation instanceof WalkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1) {
            walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1 = (WalkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1) continuation;
            int i2 = walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1.label = i2 - Integer.MIN_VALUE;
                Object obj2 = walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1.label;
                if (i != 0) {
                    kotlin.b.b(obj2);
                    List a = this.b.a();
                    walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1.L$0 = null;
                    walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1.L$1 = null;
                    walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1.L$2 = null;
                    walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1.L$3 = null;
                    walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1.label = 1;
                    if (this.a.emit(a, walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1) == coroutineSingletons) {
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
        walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1 = new WalkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1(this, continuation);
        Object obj22 = walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = walkNavigationRoutesRepository$routesFlow$$inlined$map$1$2$1.label;
        if (i != 0) {
        }
        return zy11.a;
    }
}
